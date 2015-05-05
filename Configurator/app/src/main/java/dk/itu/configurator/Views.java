package dk.itu.configurator;

import android.widget.LinearLayout;
import android.widget.TextView;

import static trikita.anvil.v15.Attrs.*;

/**
 * Created by cem2ran on 01/05/15.
 */
public class Views {

    public static ViewNode H1(INode ...nodes){
        return v(TextView.class, nodes).addAttrs(textSize(22));
    }

    public static ViewNode H2(INode ...nodes){
        return v(TextView.class, nodes).addAttrs(textSize(18));
    }

    public static ViewNode H3(INode ...nodes){
        return v(TextView.class, nodes).addAttrs(textSize(16));
    }

    public static ViewNode VList(INode ...nodes){
        return v(LinearLayout.class, nodes).addAttrs(orientation(LinearLayout.VERTICAL));
    }

    public static ViewNode HList(INode ...nodes){
        return v(LinearLayout.class, nodes).addAttrs(orientation(LinearLayout.HORIZONTAL));
    }

}
