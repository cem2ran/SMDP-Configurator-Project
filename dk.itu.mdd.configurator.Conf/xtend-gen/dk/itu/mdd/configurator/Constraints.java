package dk.itu.mdd.configurator;

import com.google.common.base.Objects;
import java.util.List;
import modelMDD2.Binary;
import modelMDD2.Constrain;
import modelMDD2.Feature;
import modelMDD2.Group;
import modelMDD2.Grouped;
import modelMDD2.Mandatory;
import modelMDD2.Solitary;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class Constraints {
  public static boolean featureStartsWithCapital(final Feature feature) {
    String _name = feature.getName();
    char _charAt = _name.charAt(0);
    return Character.isUpperCase(_charAt);
  }
  
  public static boolean featureNameDifferentFromGroupName(final Group it) {
    EList<Grouped> _grouped = it.getGrouped();
    final Function1<Grouped, Boolean> _function = (Grouped t) -> {
      String _name = t.getName();
      String _name_1 = it.getName();
      return Boolean.valueOf((!Objects.equal(_name, _name_1)));
    };
    return IterableExtensions.<Grouped>forall(_grouped, _function);
  }
  
  public static boolean typeCheck(final Binary exp) {
    Constrain _leftExp = exp.getLeftExp();
    String leftPath = Constraints.getPath(_leftExp);
    Constrain _rightExp = exp.getRightExp();
    String rightPath = Constraints.getPath(_rightExp);
    return ((String) leftPath).equalsIgnoreCase(((String) rightPath));
  }
  
  public static String getPath(final Constrain exp) {
    EList<Feature> _constrainFeatures = exp.getConstrainFeatures();
    final Function1<Feature, String> _function = (Feature it) -> {
      String _name = it.getName();
      String _xifexpression = null;
      EObject _eContainer = it.eContainer();
      if ((_eContainer instanceof Group)) {
        EObject _eContainer_1 = it.eContainer();
        String _name_1 = ((Group) _eContainer_1).getName();
        _xifexpression = ("." + _name_1);
      } else {
        _xifexpression = "";
      }
      return (_name + _xifexpression);
    };
    List<String> _map = ListExtensions.<Feature, String>map(_constrainFeatures, _function);
    final Function2<String, String, String> _function_1 = (String iterator, String accumulator) -> {
      return ((accumulator + ".") + iterator);
    };
    String path = IterableExtensions.<String>reduce(_map, _function_1);
    int _indexOf = path.indexOf(".");
    int _plus = (_indexOf + 1);
    return path.substring(_plus);
  }
  
  public static boolean featureNameAreDistinct(final Group it) {
    EList<Grouped> _grouped = it.getGrouped();
    final Function1<Grouped, Boolean> _function = (Grouped f1) -> {
      EList<Grouped> _grouped_1 = it.getGrouped();
      final Function1<Grouped, Boolean> _function_1 = (Grouped f2) -> {
        String _name = f1.getName();
        String _name_1 = f2.getName();
        return Boolean.valueOf(_name.equalsIgnoreCase(_name_1));
      };
      Iterable<Grouped> _filter = IterableExtensions.<Grouped>filter(_grouped_1, _function_1);
      int _length = ((Object[])Conversions.unwrapArray(_filter, Object.class)).length;
      return Boolean.valueOf((_length == 1));
    };
    return IterableExtensions.<Grouped>forall(_grouped, _function);
  }
  
  public static boolean isEmpty(final Mandatory feature) {
    EList<Solitary> _subfeature = feature.getSubfeature();
    int _size = _subfeature.size();
    return (_size == 0);
  }
}
