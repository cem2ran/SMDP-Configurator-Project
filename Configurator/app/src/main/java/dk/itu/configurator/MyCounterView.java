package dk.itu.configurator;

/**
 * Created by cem2ran on 30/04/15.
 */

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import trikita.anvil.Nodes;
import trikita.anvil.RenderableView;

import static trikita.anvil.Nodes.v;
import static trikita.anvil.v15.Attrs.onClick;
import static trikita.anvil.v15.Attrs.orientation;
import static trikita.anvil.v15.Attrs.text;

public class MyCounterView extends RenderableView {

    private int count = 0;

    public MyCounterView(Context c) {
        super(c);
    }

    public void onCounterButtonClicked(View v) {
        count++;
    }

    public Nodes.ViewNode view() { return
            v(LinearLayout.class, orientation(LinearLayout.VERTICAL),

                    v(TextView.class, text("Count is " + this.count)),

                    v(TextView.class, text("Click me"),
                            onClick(this::onCounterButtonClicked)));
    }
}