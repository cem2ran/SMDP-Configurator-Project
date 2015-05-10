package dk.itu.mdd.configurator;

import com.google.common.base.Objects;
import java.util.Arrays;
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
import modelMDD2.impl.ConstrainImpl;
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
  
  protected static Boolean _constraint(final Binary exp) {
    Boolean _xblockexpression = null;
    {
      final Constrain lexp = exp.getLeftExp();
      final Constrain rexp = exp.getRightExp();
      Boolean _switchResult = null;
      BinaryOperator _operator = exp.getOperator();
      String _name = _operator.getName();
      BinaryOperator _byName = BinaryOperator.getByName(_name);
      String _name_1 = _byName.getName();
      String _string = _name_1.toString();
      switch (_string) {
        case "lessThan":
          Boolean _xifexpression = null;
          boolean _and = false;
          Attribute _constrainValue = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue instanceof modelMDD2.Number)) {
            _and = false;
          } else {
            Feature _featureReference = ((ConstrainImpl) lexp).getFeatureReference();
            _and = (_featureReference instanceof Feature);
          }
          if (_and) {
            Boolean _xblockexpression_1 = null;
            {
              Attribute _constrainValue_1 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_1).getValue();
              Feature _featureReference_1 = ((ConstrainImpl) rexp).getFeatureReference();
              final Grouped rval = ((Grouped) _featureReference_1);
              boolean _isSelected = rval.isSelected();
              if (_isSelected) {
                Attribute _attribute = ((Feature) rval).getAttribute();
                int _value = ((modelMDD2.Number) _attribute).getValue();
                boolean _lessThan = (lval < _value);
                new Boolean(_lessThan);
              }
              _xblockexpression_1 = new Boolean(false);
            }
            _xifexpression = _xblockexpression_1;
          } else {
            Boolean _xifexpression_1 = null;
            boolean _and_1 = false;
            Feature _featureReference_1 = ((ConstrainImpl) lexp).getFeatureReference();
            if (!(_featureReference_1 instanceof Feature)) {
              _and_1 = false;
            } else {
              Attribute _constrainValue_1 = ((ConstrainImpl) rexp).getConstrainValue();
              _and_1 = (_constrainValue_1 instanceof modelMDD2.Number);
            }
            if (_and_1) {
              Boolean _xblockexpression_2 = null;
              {
                Attribute _constrainValue_2 = ((ConstrainImpl) rexp).getConstrainValue();
                final int rval = ((modelMDD2.Number) _constrainValue_2).getValue();
                Feature _featureReference_2 = ((ConstrainImpl) lexp).getFeatureReference();
                final Grouped lval = ((Grouped) _featureReference_2);
                Boolean _xifexpression_2 = null;
                boolean _isSelected = lval.isSelected();
                if (_isSelected) {
                  Attribute _attribute = ((Feature) lval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute).getValue();
                  boolean _lessThan = (_value < rval);
                  _xifexpression_2 = new Boolean(_lessThan);
                } else {
                  _xifexpression_2 = new Boolean(false);
                }
                _xblockexpression_2 = _xifexpression_2;
              }
              _xifexpression_1 = _xblockexpression_2;
            }
            _xifexpression = _xifexpression_1;
          }
          _switchResult = _xifexpression;
          break;
        case "greaterThan":
          Boolean _xifexpression_2 = null;
          boolean _and_2 = false;
          Attribute _constrainValue_2 = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue_2 instanceof modelMDD2.Number)) {
            _and_2 = false;
          } else {
            Feature _featureReference_2 = ((ConstrainImpl) lexp).getFeatureReference();
            _and_2 = (_featureReference_2 instanceof Feature);
          }
          if (_and_2) {
            Boolean _xblockexpression_3 = null;
            {
              Attribute _constrainValue_3 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_3).getValue();
              Feature _featureReference_3 = ((ConstrainImpl) rexp).getFeatureReference();
              final Grouped rval = ((Grouped) _featureReference_3);
              boolean _isSelected = rval.isSelected();
              if (_isSelected) {
                Attribute _attribute = ((Feature) rval).getAttribute();
                int _value = ((modelMDD2.Number) _attribute).getValue();
                boolean _greaterThan = (lval > _value);
                new Boolean(_greaterThan);
              }
              _xblockexpression_3 = new Boolean(false);
            }
            _xifexpression_2 = _xblockexpression_3;
          } else {
            Boolean _xifexpression_3 = null;
            boolean _and_3 = false;
            Feature _featureReference_3 = ((ConstrainImpl) lexp).getFeatureReference();
            if (!(_featureReference_3 instanceof Feature)) {
              _and_3 = false;
            } else {
              Attribute _constrainValue_3 = ((ConstrainImpl) rexp).getConstrainValue();
              _and_3 = (_constrainValue_3 instanceof modelMDD2.Number);
            }
            if (_and_3) {
              Boolean _xblockexpression_4 = null;
              {
                Attribute _constrainValue_4 = ((ConstrainImpl) rexp).getConstrainValue();
                final int rval = ((modelMDD2.Number) _constrainValue_4).getValue();
                Feature _featureReference_4 = ((ConstrainImpl) lexp).getFeatureReference();
                final Grouped lval = ((Grouped) _featureReference_4);
                Boolean _xifexpression_4 = null;
                boolean _isSelected = lval.isSelected();
                if (_isSelected) {
                  Attribute _attribute = ((Feature) lval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute).getValue();
                  boolean _greaterThan = (_value > rval);
                  _xifexpression_4 = new Boolean(_greaterThan);
                } else {
                  _xifexpression_4 = new Boolean(false);
                }
                _xblockexpression_4 = _xifexpression_4;
              }
              _xifexpression_3 = _xblockexpression_4;
            }
            _xifexpression_2 = _xifexpression_3;
          }
          _switchResult = _xifexpression_2;
          break;
        case "lessOrEquals":
          Boolean _xifexpression_4 = null;
          boolean _and_4 = false;
          Attribute _constrainValue_4 = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue_4 instanceof modelMDD2.Number)) {
            _and_4 = false;
          } else {
            Feature _featureReference_4 = ((ConstrainImpl) lexp).getFeatureReference();
            _and_4 = (_featureReference_4 instanceof Feature);
          }
          if (_and_4) {
            Boolean _xblockexpression_5 = null;
            {
              Attribute _constrainValue_5 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_5).getValue();
              Feature _featureReference_5 = ((ConstrainImpl) rexp).getFeatureReference();
              final Grouped rval = ((Grouped) _featureReference_5);
              boolean _isSelected = rval.isSelected();
              if (_isSelected) {
                Attribute _attribute = ((Feature) rval).getAttribute();
                int _value = ((modelMDD2.Number) _attribute).getValue();
                boolean _lessEqualsThan = (lval <= _value);
                new Boolean(_lessEqualsThan);
              }
              _xblockexpression_5 = new Boolean(false);
            }
            _xifexpression_4 = _xblockexpression_5;
          } else {
            Boolean _xifexpression_5 = null;
            boolean _and_5 = false;
            Feature _featureReference_5 = ((ConstrainImpl) lexp).getFeatureReference();
            if (!(_featureReference_5 instanceof Feature)) {
              _and_5 = false;
            } else {
              Attribute _constrainValue_5 = ((ConstrainImpl) rexp).getConstrainValue();
              _and_5 = (_constrainValue_5 instanceof modelMDD2.Number);
            }
            if (_and_5) {
              Boolean _xblockexpression_6 = null;
              {
                Attribute _constrainValue_6 = ((ConstrainImpl) rexp).getConstrainValue();
                final int rval = ((modelMDD2.Number) _constrainValue_6).getValue();
                Feature _featureReference_6 = ((ConstrainImpl) lexp).getFeatureReference();
                final Grouped lval = ((Grouped) _featureReference_6);
                Boolean _xifexpression_6 = null;
                boolean _isSelected = lval.isSelected();
                if (_isSelected) {
                  Attribute _attribute = ((Feature) lval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute).getValue();
                  boolean _lessEqualsThan = (_value <= rval);
                  _xifexpression_6 = new Boolean(_lessEqualsThan);
                } else {
                  _xifexpression_6 = new Boolean(false);
                }
                _xblockexpression_6 = _xifexpression_6;
              }
              _xifexpression_5 = _xblockexpression_6;
            }
            _xifexpression_4 = _xifexpression_5;
          }
          _switchResult = _xifexpression_4;
          break;
        case "greaterOrEquals":
          Boolean _xifexpression_6 = null;
          boolean _and_6 = false;
          Attribute _constrainValue_6 = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue_6 instanceof modelMDD2.Number)) {
            _and_6 = false;
          } else {
            Feature _featureReference_6 = ((ConstrainImpl) lexp).getFeatureReference();
            _and_6 = (_featureReference_6 instanceof Feature);
          }
          if (_and_6) {
            Boolean _xblockexpression_7 = null;
            {
              Attribute _constrainValue_7 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_7).getValue();
              Feature _featureReference_7 = ((ConstrainImpl) rexp).getFeatureReference();
              final Grouped rval = ((Grouped) _featureReference_7);
              boolean _isSelected = rval.isSelected();
              if (_isSelected) {
                Attribute _attribute = ((Feature) rval).getAttribute();
                int _value = ((modelMDD2.Number) _attribute).getValue();
                boolean _greaterEqualsThan = (lval >= _value);
                new Boolean(_greaterEqualsThan);
              }
              _xblockexpression_7 = new Boolean(false);
            }
            _xifexpression_6 = _xblockexpression_7;
          } else {
            Boolean _xifexpression_7 = null;
            boolean _and_7 = false;
            Feature _featureReference_7 = ((ConstrainImpl) lexp).getFeatureReference();
            if (!(_featureReference_7 instanceof Feature)) {
              _and_7 = false;
            } else {
              Attribute _constrainValue_7 = ((ConstrainImpl) rexp).getConstrainValue();
              _and_7 = (_constrainValue_7 instanceof modelMDD2.Number);
            }
            if (_and_7) {
              Boolean _xblockexpression_8 = null;
              {
                Attribute _constrainValue_8 = ((ConstrainImpl) rexp).getConstrainValue();
                final int rval = ((modelMDD2.Number) _constrainValue_8).getValue();
                Feature _featureReference_8 = ((ConstrainImpl) lexp).getFeatureReference();
                final Grouped lval = ((Grouped) _featureReference_8);
                Boolean _xifexpression_8 = null;
                boolean _isSelected = lval.isSelected();
                if (_isSelected) {
                  Attribute _attribute = ((Feature) lval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute).getValue();
                  boolean _greaterEqualsThan = (_value >= rval);
                  _xifexpression_8 = new Boolean(_greaterEqualsThan);
                } else {
                  _xifexpression_8 = new Boolean(false);
                }
                _xblockexpression_8 = _xifexpression_8;
              }
              _xifexpression_7 = _xblockexpression_8;
            }
            _xifexpression_6 = _xifexpression_7;
          }
          _switchResult = _xifexpression_6;
          break;
        case "equals":
          Boolean _xifexpression_8 = null;
          boolean _and_8 = false;
          Attribute _constrainValue_8 = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue_8 instanceof modelMDD2.Number)) {
            _and_8 = false;
          } else {
            Feature _featureReference_8 = ((ConstrainImpl) lexp).getFeatureReference();
            _and_8 = (_featureReference_8 instanceof Feature);
          }
          if (_and_8) {
            Boolean _xblockexpression_9 = null;
            {
              Attribute _constrainValue_9 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_9).getValue();
              Feature _featureReference_9 = ((ConstrainImpl) rexp).getFeatureReference();
              final Grouped rval = ((Grouped) _featureReference_9);
              boolean _isSelected = rval.isSelected();
              if (_isSelected) {
                Attribute _attribute = ((Feature) rval).getAttribute();
                int _value = ((modelMDD2.Number) _attribute).getValue();
                boolean _equals = (lval == _value);
                new Boolean(_equals);
              }
              _xblockexpression_9 = new Boolean(false);
            }
            _xifexpression_8 = _xblockexpression_9;
          } else {
            Boolean _xifexpression_9 = null;
            boolean _and_9 = false;
            Feature _featureReference_9 = ((ConstrainImpl) lexp).getFeatureReference();
            if (!(_featureReference_9 instanceof Feature)) {
              _and_9 = false;
            } else {
              Attribute _constrainValue_9 = ((ConstrainImpl) rexp).getConstrainValue();
              _and_9 = (_constrainValue_9 instanceof modelMDD2.Number);
            }
            if (_and_9) {
              Boolean _xblockexpression_10 = null;
              {
                Attribute _constrainValue_10 = ((ConstrainImpl) rexp).getConstrainValue();
                final int rval = ((modelMDD2.Number) _constrainValue_10).getValue();
                Feature _featureReference_10 = ((ConstrainImpl) lexp).getFeatureReference();
                final Grouped lval = ((Grouped) _featureReference_10);
                Boolean _xifexpression_10 = null;
                boolean _isSelected = lval.isSelected();
                if (_isSelected) {
                  Attribute _attribute = ((Feature) lval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute).getValue();
                  boolean _equals = (_value == rval);
                  _xifexpression_10 = new Boolean(_equals);
                } else {
                  _xifexpression_10 = new Boolean(false);
                }
                _xblockexpression_10 = _xifexpression_10;
              }
              _xifexpression_9 = _xblockexpression_10;
            }
            _xifexpression_8 = _xifexpression_9;
          }
          _switchResult = _xifexpression_8;
          break;
        case "notEquals":
          Boolean _xifexpression_10 = null;
          boolean _and_10 = false;
          Attribute _constrainValue_10 = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue_10 instanceof modelMDD2.Number)) {
            _and_10 = false;
          } else {
            Feature _featureReference_10 = ((ConstrainImpl) lexp).getFeatureReference();
            _and_10 = (_featureReference_10 instanceof Feature);
          }
          if (_and_10) {
            Boolean _xblockexpression_11 = null;
            {
              Attribute _constrainValue_11 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_11).getValue();
              Feature _featureReference_11 = ((ConstrainImpl) rexp).getFeatureReference();
              final Grouped rval = ((Grouped) _featureReference_11);
              boolean _isSelected = rval.isSelected();
              if (_isSelected) {
                Attribute _attribute = ((Feature) rval).getAttribute();
                int _value = ((modelMDD2.Number) _attribute).getValue();
                boolean _notEquals = (lval != _value);
                new Boolean(_notEquals);
              }
              _xblockexpression_11 = new Boolean(false);
            }
            _xifexpression_10 = _xblockexpression_11;
          } else {
            Boolean _xifexpression_11 = null;
            boolean _and_11 = false;
            Feature _featureReference_11 = ((ConstrainImpl) lexp).getFeatureReference();
            if (!(_featureReference_11 instanceof Feature)) {
              _and_11 = false;
            } else {
              Attribute _constrainValue_11 = ((ConstrainImpl) rexp).getConstrainValue();
              _and_11 = (_constrainValue_11 instanceof modelMDD2.Number);
            }
            if (_and_11) {
              Boolean _xblockexpression_12 = null;
              {
                Attribute _constrainValue_12 = ((ConstrainImpl) rexp).getConstrainValue();
                final int rval = ((modelMDD2.Number) _constrainValue_12).getValue();
                Feature _featureReference_12 = ((ConstrainImpl) lexp).getFeatureReference();
                final Grouped lval = ((Grouped) _featureReference_12);
                Boolean _xifexpression_12 = null;
                boolean _isSelected = lval.isSelected();
                if (_isSelected) {
                  Attribute _attribute = ((Feature) lval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute).getValue();
                  boolean _notEquals = (_value != rval);
                  _xifexpression_12 = new Boolean(_notEquals);
                } else {
                  _xifexpression_12 = new Boolean(false);
                }
                _xblockexpression_12 = _xifexpression_12;
              }
              _xifexpression_11 = _xblockexpression_12;
            }
            _xifexpression_10 = _xifexpression_11;
          }
          _switchResult = _xifexpression_10;
          break;
        case "disjunction":
          Boolean _xifexpression_12 = null;
          boolean _and_12 = false;
          Attribute _constrainValue_12 = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue_12 instanceof modelMDD2.Number)) {
            _and_12 = false;
          } else {
            Feature _featureReference_12 = ((ConstrainImpl) lexp).getFeatureReference();
            _and_12 = (_featureReference_12 instanceof Feature);
          }
          if (_and_12) {
            Boolean _xblockexpression_13 = null;
            {
              Attribute _constrainValue_13 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_13).getValue();
              Feature _featureReference_13 = ((ConstrainImpl) rexp).getFeatureReference();
              final Grouped rval = ((Grouped) _featureReference_13);
              boolean _isSelected = rval.isSelected();
              if (_isSelected) {
                Attribute _attribute = ((Feature) rval).getAttribute();
                int _value = ((modelMDD2.Number) _attribute).getValue();
                boolean _lessThan = (lval < _value);
                new Boolean(_lessThan);
              }
              _xblockexpression_13 = new Boolean(false);
            }
            _xifexpression_12 = _xblockexpression_13;
          } else {
            Boolean _xifexpression_13 = null;
            boolean _and_13 = false;
            Feature _featureReference_13 = ((ConstrainImpl) lexp).getFeatureReference();
            if (!(_featureReference_13 instanceof Feature)) {
              _and_13 = false;
            } else {
              Attribute _constrainValue_13 = ((ConstrainImpl) rexp).getConstrainValue();
              _and_13 = (_constrainValue_13 instanceof modelMDD2.Number);
            }
            if (_and_13) {
              Boolean _xblockexpression_14 = null;
              {
                Attribute _constrainValue_14 = ((ConstrainImpl) rexp).getConstrainValue();
                final int rval = ((modelMDD2.Number) _constrainValue_14).getValue();
                Feature _featureReference_14 = ((ConstrainImpl) lexp).getFeatureReference();
                final Grouped lval = ((Grouped) _featureReference_14);
                Boolean _xifexpression_14 = null;
                boolean _isSelected = lval.isSelected();
                if (_isSelected) {
                  Attribute _attribute = ((Feature) lval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute).getValue();
                  boolean _lessThan = (_value < rval);
                  _xifexpression_14 = new Boolean(_lessThan);
                } else {
                  _xifexpression_14 = new Boolean(false);
                }
                _xblockexpression_14 = _xifexpression_14;
              }
              _xifexpression_13 = _xblockexpression_14;
            }
            _xifexpression_12 = _xifexpression_13;
          }
          _switchResult = _xifexpression_12;
          break;
        case "conjunction":
          Boolean _xifexpression_14 = null;
          boolean _and_14 = false;
          Attribute _constrainValue_14 = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue_14 instanceof modelMDD2.Number)) {
            _and_14 = false;
          } else {
            Feature _featureReference_14 = ((ConstrainImpl) lexp).getFeatureReference();
            _and_14 = (_featureReference_14 instanceof Feature);
          }
          if (_and_14) {
            Boolean _xblockexpression_15 = null;
            {
              Attribute _constrainValue_15 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_15).getValue();
              Feature _featureReference_15 = ((ConstrainImpl) rexp).getFeatureReference();
              final Grouped rval = ((Grouped) _featureReference_15);
              boolean _isSelected = rval.isSelected();
              if (_isSelected) {
                Attribute _attribute = ((Feature) rval).getAttribute();
                int _value = ((modelMDD2.Number) _attribute).getValue();
                boolean _lessThan = (lval < _value);
                new Boolean(_lessThan);
              }
              _xblockexpression_15 = new Boolean(false);
            }
            _xifexpression_14 = _xblockexpression_15;
          } else {
            Boolean _xifexpression_15 = null;
            boolean _and_15 = false;
            Feature _featureReference_15 = ((ConstrainImpl) lexp).getFeatureReference();
            if (!(_featureReference_15 instanceof Feature)) {
              _and_15 = false;
            } else {
              Attribute _constrainValue_15 = ((ConstrainImpl) rexp).getConstrainValue();
              _and_15 = (_constrainValue_15 instanceof modelMDD2.Number);
            }
            if (_and_15) {
              Boolean _xblockexpression_16 = null;
              {
                Attribute _constrainValue_16 = ((ConstrainImpl) rexp).getConstrainValue();
                final int rval = ((modelMDD2.Number) _constrainValue_16).getValue();
                Feature _featureReference_16 = ((ConstrainImpl) lexp).getFeatureReference();
                final Grouped lval = ((Grouped) _featureReference_16);
                Boolean _xifexpression_16 = null;
                boolean _isSelected = lval.isSelected();
                if (_isSelected) {
                  Attribute _attribute = ((Feature) lval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute).getValue();
                  boolean _lessThan = (_value < rval);
                  _xifexpression_16 = new Boolean(_lessThan);
                } else {
                  _xifexpression_16 = new Boolean(false);
                }
                _xblockexpression_16 = _xifexpression_16;
              }
              _xifexpression_15 = _xblockexpression_16;
            }
            _xifexpression_14 = _xifexpression_15;
          }
          _switchResult = _xifexpression_14;
          break;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
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
  
  protected static Boolean _constraint(final EObject it) {
    return Boolean.valueOf(true);
  }
  
  protected static Boolean _constraint(final Group it) {
    boolean _and = false;
    boolean _featureNameAreDistinct = Constraints.featureNameAreDistinct(it);
    if (!_featureNameAreDistinct) {
      _and = false;
    } else {
      boolean _featureNameDifferentFromGroupName = Constraints.featureNameDifferentFromGroupName(it);
      _and = _featureNameDifferentFromGroupName;
    }
    return Boolean.valueOf(_and);
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
    Attribute _attribute = f.getAttribute();
    if ((_attribute instanceof RangeImpl)) {
      Attribute _attribute_1 = f.getAttribute();
      final RangeImpl atr = ((RangeImpl) _attribute_1);
      int _upper = atr.getUpper();
      int _lower = atr.getLower();
      return (_upper > _lower);
    }
    return false;
  }
  
  public static Boolean constraint(final EObject exp) {
    if (exp instanceof Binary) {
      return _constraint((Binary)exp);
    } else if (exp instanceof Group) {
      return _constraint((Group)exp);
    } else if (exp != null) {
      return _constraint(exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}
