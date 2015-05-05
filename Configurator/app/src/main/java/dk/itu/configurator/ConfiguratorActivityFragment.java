package dk.itu.configurator;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import java.io.IOException;
import java.util.List;

import modelMDD2.Binary;
import modelMDD2.Constrain;
import modelMDD2.Feature;
import modelMDD2.Group;
import modelMDD2.Grouped;
import modelMDD2.Model;
import modelMDD2.ModelMDD2Package;
import modelMDD2.Optional;
import modelMDD2.Or;
import modelMDD2.Solitary;
import modelMDD2.Unary;
import trikita.anvil.Anvil;
import trikita.anvil.Nodes.ViewNode;
import trikita.anvil.Renderable;

import static dk.itu.configurator.Views.H1;
import static dk.itu.configurator.Views.H2;
import static dk.itu.configurator.Views.H3;
import static dk.itu.configurator.Views.VList;
import static trikita.anvil.BaseAttrs.MATCH;
import static trikita.anvil.BaseAttrs.padding;
import static trikita.anvil.Nodes.v;
import static trikita.anvil.v15.Attrs.adapter;
import static trikita.anvil.v15.Attrs.choiceMode;
import static trikita.anvil.v15.Attrs.text;


/**
 * A placeholder fragment containing a simple view.
 */
public class ConfiguratorActivityFragment extends Fragment {

    ConfiguratorView configurator;
    Model configuration;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // register our meta-model package
        ModelMDD2Package.eINSTANCE.eClass();

        Resource resource = new XMIResourceImpl();

        try {
            resource.load(getResources().openRawResource(R.raw.test1), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        configuration = (Model) resource.getContents().get(0);


        configurator = new ConfiguratorView(getActivity(), configuration);
        View root = configurator.getRootView();
        return root;
    }

    class ConfiguratorView extends FrameLayout implements Renderable {

        Model m;

        public ConfiguratorView(Context c, Model model) {
            this(c);
            m = model;
            Anvil.render(this);
        }

        public ConfiguratorView(Context c) {
            super(c);
        }

        @Override
        public ViewNode view() {
            ViewNode list = VList(
                    H1(text(m.getName())),
                    padding(12)
            );

            for (Solitary s : m.getRoot().getSubfeature()) {
                list.addViews(solitaryView(s));
            }

            return list;
        }

        @Override
        public ViewGroup getRootView() {
            return this;
        }

        public ViewNode solitaryView(Solitary solitary) {

            ViewNode list = VList(
                    H2(text(solitary.getName() + (solitary instanceof Optional ? " (Optional)" : "")))
            );

            for (Group child : solitary.getGroups()) {
                list.addViews(groupView(child));
            }

            return list;
        }

        public ViewNode groupView(Group group) {

/*
            AdapterViewCompat.OnItemSelectedListener onSelect = new AdapterViewCompat.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterViewCompat<?> adapterViewCompat, View view, int i, long l) {

                }

                @Override
                public void onNothingSelected(AdapterViewCompat<?> adapterViewCompat) {

                }
            };
*/
            class ConstrainedAdapter extends ArrayAdapter {
                List<Grouped> items;

                public ConstrainedAdapter(Context context, int resource, List<Grouped> objects) {
                    super(context, resource, objects);
                    items = objects;
                }


                @Override
                public View getView(int position, View convertView, ViewGroup parent) {
                    String id = Constraints.getPath(items.get(position));
                    TextView v = (TextView) super.getView(position, convertView, parent);
                    v.setTag(id);
                    v.setMinWidth(MATCH);
                    v.setText(items.get(position).getName());

                    return v;
                }

                @Override
                public boolean areAllItemsEnabled() {
                    return false;
                }


                @Override
                public boolean isEnabled(int position) {

                    for (Constrain c : items.get(position).getConstrains()) {
                        if (constraintViolated(c)) {
                            String id = Constraints.getPath(items.get(position));
                            View v = findViewWithTag(id);
                            if(v != null) ((TextView) v).setTextColor(Color.GRAY);
                            return false;
                        }
                    }
                    return true;
                }

                /*
                @Override
                public ViewNode itemView(int pos, Object value) {
                    Feature grouped = (Grouped) value;
                    boolean visible = shouldBeEnabled(grouped);

                    return v(CheckedTextView.class,
                            checkMarkDrawable(android.R.attr.listChoiceIndicatorMultiple),
                            text(grouped.getName()),
                            size(MATCH, WRAP),
                            tag(Constraints.getPath(grouped)),
                            enabled(visible),
                            textColor(visible ? Color.BLACK : Color.GRAY)
                    );
                }
                */
            }

            return VList(
                    H3(text(group.getName())),
                    group instanceof Or
                            ? v(Spinner.class,
                            adapter((SpinnerAdapter) new ConstrainedAdapter(getContext(), android.R.layout.simple_spinner_dropdown_item, group.getGrouped())))
                            : v(ListView.class, choiceMode(ListView.CHOICE_MODE_MULTIPLE),
                            adapter((ListAdapter) new ConstrainedAdapter(getContext(), android.R.layout.simple_list_item_multiple_choice, group.getGrouped())))
            );
        }


        private boolean constraintViolated(Constrain c) {
            if (c instanceof Unary)
                return constraintViolated(((Unary) c).getExp());
            if (c instanceof Binary)
                return constraintViolated(((Binary) c).getLeftExp()) || constraintViolated(((Binary) c).getRightExp());

            String id = Constraints.getPath(c.getFeatureReference());
            View v = findViewWithTag(id);
            if (v instanceof CheckedTextView) {
                if (!((CheckedTextView) v).isChecked()) {
                    return true;
                }
            }
            return false;
        }

        public boolean shouldBeEnabled(Feature feature) {
            for (Constrain c : feature.getConstrains()) {
                if (constraintViolated(c)) {
                    /*
                    String id = Constraints.getPath(feature);
                    View v = findViewWithTag(id);
                    ((TextView)v).setTextColor(Color.GRAY);
                    */
                    return false;
                }
            }
            return true;
        }
    }
}