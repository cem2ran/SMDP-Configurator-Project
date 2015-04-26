package dk.itu.mdd.configurator;

import com.google.common.base.Objects;
import modelMDD2.Attribute;
import modelMDD2.Binary;
import modelMDD2.BinaryOperator;
import modelMDD2.ComparativeOperator;
import modelMDD2.Constrain;
import modelMDD2.Feature;
import modelMDD2.Group;
import modelMDD2.Grouped;
import modelMDD2.Mandatory;
import modelMDD2.Solitary;
import modelMDD2.impl.FeatureImpl;
import modelMDD2.impl.MandatoryImpl;
import modelMDD2.impl.ModelImpl;
import modelMDD2.impl.OptionalImpl;
import modelMDD2.impl.OrImpl;
import modelMDD2.impl.RangeImpl;
import modelMDD2.impl.XorImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
    boolean _xifexpression = false;
    BinaryOperator _operator = exp.getOperator();
    String _name = _operator.getName();
    ComparativeOperator _byName = ComparativeOperator.getByName(_name);
    boolean _notEquals = (!Objects.equal(_byName, null));
    if (_notEquals) {
      boolean _xblockexpression = false;
      {
        Constrain _leftExp = exp.getLeftExp();
        String leftPath = Constraints.getPath(_leftExp);
        Constrain _rightExp = exp.getRightExp();
        String rightPath = Constraints.getPath(_rightExp);
        _xblockexpression = ((String) leftPath).equalsIgnoreCase(((String) rightPath));
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  public static String getPath(final Constrain exp) {
    Feature feature = exp.getFeatureReference();
    EObject _eContainer = feature.eContainer();
    Object _path = Constraints.getPath(_eContainer, "");
    String path = ("" + _path);
    int _indexOf = path.indexOf(".");
    int _plus = (_indexOf + 1);
    return path.substring(_plus);
  }
  
  public static Object getPath(final EObject obj, final String path) {
    Object _xifexpression = null;
    EObject _eContainer = obj.eContainer();
    boolean _equals = Objects.equal(_eContainer, null);
    if (_equals) {
      _xifexpression = path;
    } else {
      EObject _eContainer_1 = obj.eContainer();
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (obj instanceof XorImpl) {
          _matched=true;
          _switchResult = ((XorImpl)obj).getName();
        }
      }
      if (!_matched) {
        if (obj instanceof OrImpl) {
          _matched=true;
          _switchResult = ((OrImpl)obj).getName();
        }
      }
      if (!_matched) {
        if (obj instanceof OptionalImpl) {
          _matched=true;
          _switchResult = ((OptionalImpl)obj).getName();
        }
      }
      if (!_matched) {
        if (obj instanceof MandatoryImpl) {
          _matched=true;
          _switchResult = ((MandatoryImpl)obj).getName();
        }
      }
      if (!_matched) {
        if (obj instanceof FeatureImpl) {
          _matched=true;
          _switchResult = ((FeatureImpl)obj).getName();
        }
      }
      if (!_matched) {
        if (obj instanceof ModelImpl) {
          _matched=true;
          _switchResult = ((ModelImpl)obj).getName();
        }
      }
      if (!_matched) {
        _switchResult = "";
      }
      String _plus = (_switchResult + ".");
      String _plus_1 = (_plus + path);
      _xifexpression = Constraints.getPath(_eContainer_1, _plus_1);
    }
    return _xifexpression;
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
    boolean _and = false;
    EList<Solitary> _subfeature = feature.getSubfeature();
    int _size = _subfeature.size();
    boolean _equals = (_size == 0);
    if (!_equals) {
      _and = false;
    } else {
      EList<Group> _groups = feature.getGroups();
      int _size_1 = _groups.size();
      boolean _equals_1 = (_size_1 == 0);
      _and = _equals_1;
    }
    return _and;
  }
  
  public static boolean checkRangeValidity(final Feature f) {
    EList<Attribute> _attributes = f.getAttributes();
    final Function1<Attribute, Boolean> _function = (Attribute it) -> {
      EList<Attribute> _attributes_1 = f.getAttributes();
      final Function1<Attribute, Boolean> _function_1 = (Attribute a) -> {
        return Boolean.valueOf((a instanceof RangeImpl));
      };
      return Boolean.valueOf(IterableExtensions.<Attribute>forall(_attributes_1, _function_1));
    };
    Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(_attributes, _function);
    final Function1<Attribute, Boolean> _function_1 = (Attribute a) -> {
      int _upper = ((RangeImpl) a).getUpper();
      int _lower = ((RangeImpl) a).getLower();
      return Boolean.valueOf((_upper > _lower));
    };
    return IterableExtensions.<Attribute>forall(_filter, _function_1);
  }
}
