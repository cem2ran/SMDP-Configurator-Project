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
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.eclipse.emf.ecore.resource.Resource;
import org.emfjson.jackson.module.EMFModule;

import java.io.IOException;
import java.util.Iterator;
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
import modelMDD2.impl.MandatoryImpl;
import trikita.anvil.Anvil;
import trikita.anvil.Nodes.ViewNode;
import trikita.anvil.Renderable;

import static dk.itu.configurator.Views.H1;
import static dk.itu.configurator.Views.H2;
import static dk.itu.configurator.Views.H3;
import static dk.itu.configurator.Views.VList;
import static trikita.anvil.BaseAttrs.CENTER;
import static trikita.anvil.BaseAttrs.FILL;
import static trikita.anvil.BaseAttrs.MATCH;
import static trikita.anvil.BaseAttrs.WRAP;
import static trikita.anvil.BaseAttrs.dip;
import static trikita.anvil.BaseAttrs.padding;
import static trikita.anvil.BaseAttrs.size;
import static trikita.anvil.Nodes.v;
import static trikita.anvil.v15.Attrs.adapter;
import static trikita.anvil.v15.Attrs.backgroundColor;
import static trikita.anvil.v15.Attrs.choiceMode;
import static trikita.anvil.v15.Attrs.gravity;
import static trikita.anvil.v15.Attrs.layoutParams;
import static trikita.anvil.v15.Attrs.text;
import static trikita.anvil.v15.Attrs.textSize;


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
        /*
        Resource resource = new XMIResourceImpl();

        try {
            resource.load(getResources().openRawResource(R.raw.test1), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        configuration = (Model) resource.getContents().get(0);
        */

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new EMFModule());

        String data = "{\"eClass\" : \"http://www.example.org/modelMDD2#//Model\", \"root\" : {\"eClass\" : \"http://www.example.org/modelMDD2#//Feature\", \"name\" : \"Car\", \"subfeature\" : [ {\"eClass\" : \"http://www.example.org/modelMDD2#//Mandatory\", \"name\" : \"Engine\", \"groups\" : [ {\"eClass\" : \"http://www.example.org/modelMDD2#//Xor\", \"name\" : \"HorsePower\", \"grouped\" : [ {\"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\", \"name\" : \"HP120\"}, {\"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\", \"name\" : \"HP150\"} ] }, {\"eClass\" : \"http://www.example.org/modelMDD2#//Or\", \"name\" : \"Fuel\", \"grouped\" : [ {\"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\", \"name\" : \"Gas\"}, {\"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\", \"name\" : \"Electric\"} ] } ] }, {\"eClass\" : \"http://www.example.org/modelMDD2#//Optional\", \"name\" : \"Rims\", \"groups\" : [ {\"eClass\" : \"http://www.example.org/modelMDD2#//Xor\", \"name\" : \"Color\", \"grouped\" : [ {\"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\", \"name\" : \"Red\"}, {\"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\", \"name\" : \"Black\", \"constrains\" : [ {\"eClass\" : \"http://www.example.org/modelMDD2#//Binary\", \"Operator\" : \"&&\", \"rightExp\" : {\"eClass\" : \"http://www.example.org/modelMDD2#//Constrain\", \"featureReference\" : {\"$ref\" : \"//@root/@subfeature.0/@groups.0/@grouped.1\"} }, \"leftExp\" : {\"eClass\" : \"http://www.example.org/modelMDD2#//Constrain\", \"featureReference\" : {\"$ref\" : \"//@root/@subfeature.1/@groups.1/@grouped.0\"} } } ] } ] }, {\"eClass\" : \"http://www.example.org/modelMDD2#//Xor\", \"name\" : \"Material\", \"grouped\" : [ {\"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\", \"name\" : \"Aluminum\"}, {\"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\", \"name\" : \"CarbonFiber\"} ] } ] }, {\"eClass\" : \"http://www.example.org/modelMDD2#//Mandatory\", \"name\" : \"Transmission\", \"groups\" : [ {\"eClass\" : \"http://www.example.org/modelMDD2#//Or\", \"name\" : \"Type\", \"grouped\" : [ {\"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\", \"name\" : \"Manual\"}, {\"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\", \"name\" : \"Automatic\"} ] } ] } ] } }";
        Resource r = null;
        try {
            r = mapper.readValue(data, Resource.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(r != null)
        configuration = (Model) r.getContents().get(0);

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

            RelativeLayout.LayoutParams p = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

            p.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

            boolean validConfiguration = true;
            /*
            TreeIterator<EObject> contents = m.eAllContents();
            //List<ConstrainImpl> constraints = new ArrayList();
            while(contents.hasNext()){
                EObject obj = contents.next();
                if(obj instanceof MandatoryImpl){
                    MandatoryImpl feature = (MandatoryImpl) obj;
                    Iterator<Group> groups = feature.getGroups().iterator();
                    while(groups.hasNext()){

                    }
                    validConfiguration = false;
                    break;
                }
            }
            */


            return v(RelativeLayout.class, size(MATCH, MATCH),
                    v(ScrollView.class, list, padding(0,0,0, 70)),
                    v(TextView.class, text(validConfiguration ? "Configure" : "Constraints not met"), textSize(dip(5)), gravity(CENTER),backgroundColor(Color.LTGRAY), layoutParams(p), padding(18),size(FILL, WRAP))
                   );
        }

        @Override
        public ViewGroup getRootView() {
            return this;
        }

        public ViewNode solitaryView(Solitary solitary) {

            if(solitary instanceof MandatoryImpl){
                Iterator<Group> groups = solitary.getGroups().iterator();
                while(groups.hasNext()){
                    Group group = groups.next();
                    Iterator<Grouped> features = group.getGrouped().iterator();
                    while(features.hasNext()){
                        Grouped feature = features.next();
                        Iterator<Constrain> constraints = feature.getConstrains().iterator();
                        
                    }
                }
            }

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
                    v.setMinWidth(parent.getWidth());
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
                            : v(ListView.class, choiceMode(ListView.CHOICE_MODE_MULTIPLE), size(WRAP, group.getGrouped().size()* 200),
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