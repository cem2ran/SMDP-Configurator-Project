package dk.itu.mdd.configurator;

import com.google.common.base.Objects;
import java.util.Arrays;
import modelMDD2.Attribute;
import modelMDD2.Binary;
import modelMDD2.BinaryOperator;
import modelMDD2.CBoolean;
import modelMDD2.CString;
import modelMDD2.ComparativeOperator;
import modelMDD2.Constrain;
import modelMDD2.Feature;
import modelMDD2.Group;
import modelMDD2.Grouped;
import modelMDD2.Mandatory;
import modelMDD2.Range;
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
  
  public static Boolean checkAttributesType(final Attribute left, final Attribute right) {
    if ((((((left instanceof modelMDD2.Number) && (right instanceof modelMDD2.Number)) || ((left instanceof CString) && (right instanceof CString))) || ((left instanceof Range) && (right instanceof Range))) || ((left instanceof CBoolean) && (right instanceof CBoolean)))) {
      return Boolean.valueOf(true);
    } else {
      return Boolean.valueOf(false);
    }
  }
  
  protected static Boolean _constraint(final Binary exp) {
    Boolean _xblockexpression = null;
    {
      final Constrain lexp = exp.getLeftExp();
      final Constrain rexp = exp.getRightExp();
      boolean _and = false;
      Feature _featureReference = ((ConstrainImpl) rexp).getFeatureReference();
      if (!(_featureReference instanceof Feature)) {
        _and = false;
      } else {
        Feature _featureReference_1 = ((ConstrainImpl) lexp).getFeatureReference();
        _and = (_featureReference_1 instanceof Feature);
      }
      if (_and) {
        Feature _featureReference_2 = ((ConstrainImpl) lexp).getFeatureReference();
        final Attribute left = ((Feature) ((Grouped) _featureReference_2)).getAttribute();
        Feature _featureReference_3 = ((ConstrainImpl) rexp).getFeatureReference();
        final Attribute right = ((Feature) ((Grouped) _featureReference_3)).getAttribute();
        return Constraints.checkAttributesType(left, right);
      }
      Boolean _switchResult = null;
      BinaryOperator _operator = exp.getOperator();
      String _name = _operator.getName();
      BinaryOperator _byName = BinaryOperator.getByName(_name);
      String _name_1 = _byName.getName();
      String _string = _name_1.toString();
      switch (_string) {
        case "lessThan":
          Boolean _xifexpression = null;
          boolean _and_1 = false;
          Attribute _constrainValue = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue instanceof modelMDD2.Number)) {
            _and_1 = false;
          } else {
            Attribute _constrainValue_1 = ((ConstrainImpl) rexp).getConstrainValue();
            _and_1 = (_constrainValue_1 instanceof modelMDD2.Number);
          }
          if (_and_1) {
            Boolean _xblockexpression_1 = null;
            {
              Attribute _constrainValue_2 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_2).getValue();
              Attribute _constrainValue_3 = ((ConstrainImpl) rexp).getConstrainValue();
              final int rval = ((modelMDD2.Number) _constrainValue_3).getValue();
              _xblockexpression_1 = new Boolean((lval < rval));
            }
            _xifexpression = _xblockexpression_1;
          } else {
            Boolean _xifexpression_1 = null;
            Feature _featureReference_4 = ((ConstrainImpl) rexp).getFeatureReference();
            if ((_featureReference_4 instanceof Feature)) {
              Boolean _xifexpression_2 = null;
              Attribute _constrainValue_2 = ((ConstrainImpl) lexp).getConstrainValue();
              Feature _featureReference_5 = ((ConstrainImpl) rexp).getFeatureReference();
              Attribute _attribute = ((Feature) ((Grouped) _featureReference_5)).getAttribute();
              Boolean _checkAttributesType = Constraints.checkAttributesType(_constrainValue_2, _attribute);
              boolean _not = (!(_checkAttributesType).booleanValue());
              if (_not) {
                _xifexpression_2 = new Boolean(false);
              } else {
                Boolean _xblockexpression_2 = null;
                {
                  Attribute _constrainValue_3 = ((ConstrainImpl) lexp).getConstrainValue();
                  final int lval = ((modelMDD2.Number) _constrainValue_3).getValue();
                  Feature _featureReference_6 = ((ConstrainImpl) rexp).getFeatureReference();
                  final Grouped rval = ((Grouped) _featureReference_6);
                  Attribute _attribute_1 = ((Feature) rval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute_1).getValue();
                  boolean _lessThan = (lval < _value);
                  _xblockexpression_2 = new Boolean(_lessThan);
                }
                _xifexpression_2 = _xblockexpression_2;
              }
              _xifexpression_1 = _xifexpression_2;
            } else {
              Boolean _xifexpression_3 = null;
              Feature _featureReference_6 = ((ConstrainImpl) lexp).getFeatureReference();
              if ((_featureReference_6 instanceof Feature)) {
                Boolean _xifexpression_4 = null;
                Attribute _constrainValue_3 = ((ConstrainImpl) rexp).getConstrainValue();
                Feature _featureReference_7 = ((ConstrainImpl) lexp).getFeatureReference();
                Attribute _attribute_1 = ((Feature) ((Grouped) _featureReference_7)).getAttribute();
                Boolean _checkAttributesType_1 = Constraints.checkAttributesType(_constrainValue_3, _attribute_1);
                boolean _not_1 = (!(_checkAttributesType_1).booleanValue());
                if (_not_1) {
                  _xifexpression_4 = new Boolean(false);
                } else {
                  Boolean _xblockexpression_3 = null;
                  {
                    Attribute _constrainValue_4 = ((ConstrainImpl) rexp).getConstrainValue();
                    final int rval = ((modelMDD2.Number) _constrainValue_4).getValue();
                    Feature _featureReference_8 = ((ConstrainImpl) lexp).getFeatureReference();
                    final Grouped lval = ((Grouped) _featureReference_8);
                    Attribute _attribute_2 = ((Feature) lval).getAttribute();
                    int _value = ((modelMDD2.Number) _attribute_2).getValue();
                    boolean _lessThan = (_value < rval);
                    _xblockexpression_3 = new Boolean(_lessThan);
                  }
                  _xifexpression_4 = _xblockexpression_3;
                }
                _xifexpression_3 = _xifexpression_4;
              }
              _xifexpression_1 = _xifexpression_3;
            }
            _xifexpression = _xifexpression_1;
          }
          _switchResult = _xifexpression;
          break;
        case "greaterThan":
          Boolean _xifexpression_5 = null;
          boolean _and_2 = false;
          Attribute _constrainValue_4 = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue_4 instanceof modelMDD2.Number)) {
            _and_2 = false;
          } else {
            Attribute _constrainValue_5 = ((ConstrainImpl) rexp).getConstrainValue();
            _and_2 = (_constrainValue_5 instanceof modelMDD2.Number);
          }
          if (_and_2) {
            Boolean _xblockexpression_4 = null;
            {
              Attribute _constrainValue_6 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_6).getValue();
              Attribute _constrainValue_7 = ((ConstrainImpl) rexp).getConstrainValue();
              final int rval = ((modelMDD2.Number) _constrainValue_7).getValue();
              _xblockexpression_4 = new Boolean((lval > rval));
            }
            _xifexpression_5 = _xblockexpression_4;
          } else {
            Boolean _xifexpression_6 = null;
            Feature _featureReference_8 = ((ConstrainImpl) rexp).getFeatureReference();
            if ((_featureReference_8 instanceof Feature)) {
              Boolean _xifexpression_7 = null;
              Attribute _constrainValue_6 = ((ConstrainImpl) lexp).getConstrainValue();
              Feature _featureReference_9 = ((ConstrainImpl) rexp).getFeatureReference();
              Attribute _attribute_2 = ((Feature) ((Grouped) _featureReference_9)).getAttribute();
              Boolean _checkAttributesType_2 = Constraints.checkAttributesType(_constrainValue_6, _attribute_2);
              boolean _not_2 = (!(_checkAttributesType_2).booleanValue());
              if (_not_2) {
                _xifexpression_7 = new Boolean(false);
              } else {
                Boolean _xblockexpression_5 = null;
                {
                  Attribute _constrainValue_7 = ((ConstrainImpl) lexp).getConstrainValue();
                  final int lval = ((modelMDD2.Number) _constrainValue_7).getValue();
                  Feature _featureReference_10 = ((ConstrainImpl) rexp).getFeatureReference();
                  final Grouped rval = ((Grouped) _featureReference_10);
                  Attribute _attribute_3 = ((Feature) rval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute_3).getValue();
                  boolean _greaterThan = (lval > _value);
                  _xblockexpression_5 = new Boolean(_greaterThan);
                }
                _xifexpression_7 = _xblockexpression_5;
              }
              _xifexpression_6 = _xifexpression_7;
            } else {
              Boolean _xifexpression_8 = null;
              Feature _featureReference_10 = ((ConstrainImpl) lexp).getFeatureReference();
              if ((_featureReference_10 instanceof Feature)) {
                Boolean _xifexpression_9 = null;
                Attribute _constrainValue_7 = ((ConstrainImpl) rexp).getConstrainValue();
                Feature _featureReference_11 = ((ConstrainImpl) lexp).getFeatureReference();
                Attribute _attribute_3 = ((Feature) ((Grouped) _featureReference_11)).getAttribute();
                Boolean _checkAttributesType_3 = Constraints.checkAttributesType(_constrainValue_7, _attribute_3);
                boolean _not_3 = (!(_checkAttributesType_3).booleanValue());
                if (_not_3) {
                  _xifexpression_9 = new Boolean(false);
                } else {
                  Boolean _xblockexpression_6 = null;
                  {
                    Attribute _constrainValue_8 = ((ConstrainImpl) rexp).getConstrainValue();
                    final int rval = ((modelMDD2.Number) _constrainValue_8).getValue();
                    Feature _featureReference_12 = ((ConstrainImpl) lexp).getFeatureReference();
                    final Grouped lval = ((Grouped) _featureReference_12);
                    Attribute _attribute_4 = ((Feature) lval).getAttribute();
                    int _value = ((modelMDD2.Number) _attribute_4).getValue();
                    boolean _greaterThan = (_value > rval);
                    _xblockexpression_6 = new Boolean(_greaterThan);
                  }
                  _xifexpression_9 = _xblockexpression_6;
                }
                _xifexpression_8 = _xifexpression_9;
              }
              _xifexpression_6 = _xifexpression_8;
            }
            _xifexpression_5 = _xifexpression_6;
          }
          _switchResult = _xifexpression_5;
          break;
        case "lessOrEquals":
          Boolean _xifexpression_10 = null;
          boolean _and_3 = false;
          Attribute _constrainValue_8 = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue_8 instanceof modelMDD2.Number)) {
            _and_3 = false;
          } else {
            Attribute _constrainValue_9 = ((ConstrainImpl) rexp).getConstrainValue();
            _and_3 = (_constrainValue_9 instanceof modelMDD2.Number);
          }
          if (_and_3) {
            Boolean _xblockexpression_7 = null;
            {
              Attribute _constrainValue_10 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_10).getValue();
              Attribute _constrainValue_11 = ((ConstrainImpl) rexp).getConstrainValue();
              final int rval = ((modelMDD2.Number) _constrainValue_11).getValue();
              _xblockexpression_7 = new Boolean((lval <= rval));
            }
            _xifexpression_10 = _xblockexpression_7;
          } else {
            Boolean _xifexpression_11 = null;
            Feature _featureReference_12 = ((ConstrainImpl) rexp).getFeatureReference();
            if ((_featureReference_12 instanceof Feature)) {
              Boolean _xifexpression_12 = null;
              Attribute _constrainValue_10 = ((ConstrainImpl) lexp).getConstrainValue();
              Feature _featureReference_13 = ((ConstrainImpl) rexp).getFeatureReference();
              Attribute _attribute_4 = ((Feature) ((Grouped) _featureReference_13)).getAttribute();
              Boolean _checkAttributesType_4 = Constraints.checkAttributesType(_constrainValue_10, _attribute_4);
              boolean _not_4 = (!(_checkAttributesType_4).booleanValue());
              if (_not_4) {
                _xifexpression_12 = new Boolean(false);
              } else {
                Boolean _xblockexpression_8 = null;
                {
                  Attribute _constrainValue_11 = ((ConstrainImpl) lexp).getConstrainValue();
                  final int lval = ((modelMDD2.Number) _constrainValue_11).getValue();
                  Feature _featureReference_14 = ((ConstrainImpl) rexp).getFeatureReference();
                  final Grouped rval = ((Grouped) _featureReference_14);
                  Attribute _attribute_5 = ((Feature) rval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute_5).getValue();
                  boolean _lessEqualsThan = (lval <= _value);
                  _xblockexpression_8 = new Boolean(_lessEqualsThan);
                }
                _xifexpression_12 = _xblockexpression_8;
              }
              _xifexpression_11 = _xifexpression_12;
            } else {
              Boolean _xifexpression_13 = null;
              Feature _featureReference_14 = ((ConstrainImpl) lexp).getFeatureReference();
              if ((_featureReference_14 instanceof Feature)) {
                Boolean _xifexpression_14 = null;
                Attribute _constrainValue_11 = ((ConstrainImpl) rexp).getConstrainValue();
                Feature _featureReference_15 = ((ConstrainImpl) lexp).getFeatureReference();
                Attribute _attribute_5 = ((Feature) ((Grouped) _featureReference_15)).getAttribute();
                Boolean _checkAttributesType_5 = Constraints.checkAttributesType(_constrainValue_11, _attribute_5);
                boolean _not_5 = (!(_checkAttributesType_5).booleanValue());
                if (_not_5) {
                  _xifexpression_14 = new Boolean(false);
                } else {
                  Boolean _xblockexpression_9 = null;
                  {
                    Attribute _constrainValue_12 = ((ConstrainImpl) rexp).getConstrainValue();
                    final int rval = ((modelMDD2.Number) _constrainValue_12).getValue();
                    Feature _featureReference_16 = ((ConstrainImpl) lexp).getFeatureReference();
                    final Grouped lval = ((Grouped) _featureReference_16);
                    Attribute _attribute_6 = ((Feature) lval).getAttribute();
                    int _value = ((modelMDD2.Number) _attribute_6).getValue();
                    boolean _lessEqualsThan = (_value <= rval);
                    _xblockexpression_9 = new Boolean(_lessEqualsThan);
                  }
                  _xifexpression_14 = _xblockexpression_9;
                }
                _xifexpression_13 = _xifexpression_14;
              }
              _xifexpression_11 = _xifexpression_13;
            }
            _xifexpression_10 = _xifexpression_11;
          }
          _switchResult = _xifexpression_10;
          break;
        case "greaterOrEquals":
          Boolean _xifexpression_15 = null;
          boolean _and_4 = false;
          Attribute _constrainValue_12 = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue_12 instanceof modelMDD2.Number)) {
            _and_4 = false;
          } else {
            Attribute _constrainValue_13 = ((ConstrainImpl) rexp).getConstrainValue();
            _and_4 = (_constrainValue_13 instanceof modelMDD2.Number);
          }
          if (_and_4) {
            Boolean _xblockexpression_10 = null;
            {
              Attribute _constrainValue_14 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_14).getValue();
              Attribute _constrainValue_15 = ((ConstrainImpl) rexp).getConstrainValue();
              final int rval = ((modelMDD2.Number) _constrainValue_15).getValue();
              _xblockexpression_10 = new Boolean((lval >= rval));
            }
            _xifexpression_15 = _xblockexpression_10;
          } else {
            Boolean _xifexpression_16 = null;
            Feature _featureReference_16 = ((ConstrainImpl) rexp).getFeatureReference();
            if ((_featureReference_16 instanceof Feature)) {
              Boolean _xifexpression_17 = null;
              Attribute _constrainValue_14 = ((ConstrainImpl) lexp).getConstrainValue();
              Feature _featureReference_17 = ((ConstrainImpl) rexp).getFeatureReference();
              Attribute _attribute_6 = ((Feature) ((Grouped) _featureReference_17)).getAttribute();
              Boolean _checkAttributesType_6 = Constraints.checkAttributesType(_constrainValue_14, _attribute_6);
              boolean _not_6 = (!(_checkAttributesType_6).booleanValue());
              if (_not_6) {
                _xifexpression_17 = new Boolean(false);
              } else {
                Boolean _xblockexpression_11 = null;
                {
                  Attribute _constrainValue_15 = ((ConstrainImpl) lexp).getConstrainValue();
                  final int lval = ((modelMDD2.Number) _constrainValue_15).getValue();
                  Feature _featureReference_18 = ((ConstrainImpl) rexp).getFeatureReference();
                  final Grouped rval = ((Grouped) _featureReference_18);
                  Attribute _attribute_7 = ((Feature) rval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute_7).getValue();
                  boolean _greaterEqualsThan = (lval >= _value);
                  _xblockexpression_11 = new Boolean(_greaterEqualsThan);
                }
                _xifexpression_17 = _xblockexpression_11;
              }
              _xifexpression_16 = _xifexpression_17;
            } else {
              Boolean _xifexpression_18 = null;
              Feature _featureReference_18 = ((ConstrainImpl) lexp).getFeatureReference();
              if ((_featureReference_18 instanceof Feature)) {
                Boolean _xifexpression_19 = null;
                Attribute _constrainValue_15 = ((ConstrainImpl) rexp).getConstrainValue();
                Feature _featureReference_19 = ((ConstrainImpl) lexp).getFeatureReference();
                Attribute _attribute_7 = ((Feature) ((Grouped) _featureReference_19)).getAttribute();
                Boolean _checkAttributesType_7 = Constraints.checkAttributesType(_constrainValue_15, _attribute_7);
                boolean _not_7 = (!(_checkAttributesType_7).booleanValue());
                if (_not_7) {
                  _xifexpression_19 = new Boolean(false);
                } else {
                  Boolean _xblockexpression_12 = null;
                  {
                    Attribute _constrainValue_16 = ((ConstrainImpl) rexp).getConstrainValue();
                    final int rval = ((modelMDD2.Number) _constrainValue_16).getValue();
                    Feature _featureReference_20 = ((ConstrainImpl) lexp).getFeatureReference();
                    final Grouped lval = ((Grouped) _featureReference_20);
                    Attribute _attribute_8 = ((Feature) lval).getAttribute();
                    int _value = ((modelMDD2.Number) _attribute_8).getValue();
                    boolean _greaterEqualsThan = (_value >= rval);
                    _xblockexpression_12 = new Boolean(_greaterEqualsThan);
                  }
                  _xifexpression_19 = _xblockexpression_12;
                }
                _xifexpression_18 = _xifexpression_19;
              }
              _xifexpression_16 = _xifexpression_18;
            }
            _xifexpression_15 = _xifexpression_16;
          }
          _switchResult = _xifexpression_15;
          break;
        case "equals":
          Boolean _xifexpression_20 = null;
          boolean _and_5 = false;
          Attribute _constrainValue_16 = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue_16 instanceof modelMDD2.Number)) {
            _and_5 = false;
          } else {
            Attribute _constrainValue_17 = ((ConstrainImpl) rexp).getConstrainValue();
            _and_5 = (_constrainValue_17 instanceof modelMDD2.Number);
          }
          if (_and_5) {
            Boolean _xblockexpression_13 = null;
            {
              Attribute _constrainValue_18 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_18).getValue();
              Attribute _constrainValue_19 = ((ConstrainImpl) rexp).getConstrainValue();
              final int rval = ((modelMDD2.Number) _constrainValue_19).getValue();
              _xblockexpression_13 = new Boolean((lval == rval));
            }
            _xifexpression_20 = _xblockexpression_13;
          } else {
            Boolean _xifexpression_21 = null;
            Feature _featureReference_20 = ((ConstrainImpl) rexp).getFeatureReference();
            if ((_featureReference_20 instanceof Feature)) {
              Boolean _xifexpression_22 = null;
              Attribute _constrainValue_18 = ((ConstrainImpl) lexp).getConstrainValue();
              Feature _featureReference_21 = ((ConstrainImpl) rexp).getFeatureReference();
              Attribute _attribute_8 = ((Feature) ((Grouped) _featureReference_21)).getAttribute();
              Boolean _checkAttributesType_8 = Constraints.checkAttributesType(_constrainValue_18, _attribute_8);
              boolean _not_8 = (!(_checkAttributesType_8).booleanValue());
              if (_not_8) {
                _xifexpression_22 = new Boolean(false);
              } else {
                Boolean _xblockexpression_14 = null;
                {
                  Attribute _constrainValue_19 = ((ConstrainImpl) lexp).getConstrainValue();
                  final int lval = ((modelMDD2.Number) _constrainValue_19).getValue();
                  Feature _featureReference_22 = ((ConstrainImpl) rexp).getFeatureReference();
                  final Grouped rval = ((Grouped) _featureReference_22);
                  Attribute _attribute_9 = ((Feature) rval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute_9).getValue();
                  boolean _equals = (lval == _value);
                  _xblockexpression_14 = new Boolean(_equals);
                }
                _xifexpression_22 = _xblockexpression_14;
              }
              _xifexpression_21 = _xifexpression_22;
            } else {
              Boolean _xifexpression_23 = null;
              Feature _featureReference_22 = ((ConstrainImpl) lexp).getFeatureReference();
              if ((_featureReference_22 instanceof Feature)) {
                Boolean _xifexpression_24 = null;
                Attribute _constrainValue_19 = ((ConstrainImpl) rexp).getConstrainValue();
                Feature _featureReference_23 = ((ConstrainImpl) lexp).getFeatureReference();
                Attribute _attribute_9 = ((Feature) ((Grouped) _featureReference_23)).getAttribute();
                Boolean _checkAttributesType_9 = Constraints.checkAttributesType(_constrainValue_19, _attribute_9);
                boolean _not_9 = (!(_checkAttributesType_9).booleanValue());
                if (_not_9) {
                  _xifexpression_24 = new Boolean(false);
                } else {
                  Boolean _xblockexpression_15 = null;
                  {
                    Attribute _constrainValue_20 = ((ConstrainImpl) rexp).getConstrainValue();
                    final int rval = ((modelMDD2.Number) _constrainValue_20).getValue();
                    Feature _featureReference_24 = ((ConstrainImpl) lexp).getFeatureReference();
                    final Grouped lval = ((Grouped) _featureReference_24);
                    Attribute _attribute_10 = ((Feature) lval).getAttribute();
                    int _value = ((modelMDD2.Number) _attribute_10).getValue();
                    boolean _equals = (_value == rval);
                    _xblockexpression_15 = new Boolean(_equals);
                  }
                  _xifexpression_24 = _xblockexpression_15;
                }
                _xifexpression_23 = _xifexpression_24;
              }
              _xifexpression_21 = _xifexpression_23;
            }
            _xifexpression_20 = _xifexpression_21;
          }
          _switchResult = _xifexpression_20;
          break;
        case "notEquals":
          Boolean _xifexpression_25 = null;
          boolean _and_6 = false;
          Attribute _constrainValue_20 = ((ConstrainImpl) lexp).getConstrainValue();
          if (!(_constrainValue_20 instanceof modelMDD2.Number)) {
            _and_6 = false;
          } else {
            Attribute _constrainValue_21 = ((ConstrainImpl) rexp).getConstrainValue();
            _and_6 = (_constrainValue_21 instanceof modelMDD2.Number);
          }
          if (_and_6) {
            Boolean _xblockexpression_16 = null;
            {
              Attribute _constrainValue_22 = ((ConstrainImpl) lexp).getConstrainValue();
              final int lval = ((modelMDD2.Number) _constrainValue_22).getValue();
              Attribute _constrainValue_23 = ((ConstrainImpl) rexp).getConstrainValue();
              final int rval = ((modelMDD2.Number) _constrainValue_23).getValue();
              _xblockexpression_16 = new Boolean((lval != rval));
            }
            _xifexpression_25 = _xblockexpression_16;
          } else {
            Boolean _xifexpression_26 = null;
            Feature _featureReference_24 = ((ConstrainImpl) rexp).getFeatureReference();
            if ((_featureReference_24 instanceof Feature)) {
              Boolean _xifexpression_27 = null;
              Attribute _constrainValue_22 = ((ConstrainImpl) lexp).getConstrainValue();
              Feature _featureReference_25 = ((ConstrainImpl) rexp).getFeatureReference();
              Attribute _attribute_10 = ((Feature) ((Grouped) _featureReference_25)).getAttribute();
              Boolean _checkAttributesType_10 = Constraints.checkAttributesType(_constrainValue_22, _attribute_10);
              boolean _not_10 = (!(_checkAttributesType_10).booleanValue());
              if (_not_10) {
                _xifexpression_27 = new Boolean(false);
              } else {
                Boolean _xblockexpression_17 = null;
                {
                  Attribute _constrainValue_23 = ((ConstrainImpl) lexp).getConstrainValue();
                  final int lval = ((modelMDD2.Number) _constrainValue_23).getValue();
                  Feature _featureReference_26 = ((ConstrainImpl) rexp).getFeatureReference();
                  final Grouped rval = ((Grouped) _featureReference_26);
                  Attribute _attribute_11 = ((Feature) rval).getAttribute();
                  int _value = ((modelMDD2.Number) _attribute_11).getValue();
                  boolean _notEquals = (lval != _value);
                  _xblockexpression_17 = new Boolean(_notEquals);
                }
                _xifexpression_27 = _xblockexpression_17;
              }
              _xifexpression_26 = _xifexpression_27;
            } else {
              Boolean _xifexpression_28 = null;
              Feature _featureReference_26 = ((ConstrainImpl) lexp).getFeatureReference();
              if ((_featureReference_26 instanceof Feature)) {
                Boolean _xifexpression_29 = null;
                Attribute _constrainValue_23 = ((ConstrainImpl) rexp).getConstrainValue();
                Feature _featureReference_27 = ((ConstrainImpl) lexp).getFeatureReference();
                Attribute _attribute_11 = ((Feature) ((Grouped) _featureReference_27)).getAttribute();
                Boolean _checkAttributesType_11 = Constraints.checkAttributesType(_constrainValue_23, _attribute_11);
                boolean _not_11 = (!(_checkAttributesType_11).booleanValue());
                if (_not_11) {
                  _xifexpression_29 = new Boolean(false);
                } else {
                  Boolean _xblockexpression_18 = null;
                  {
                    Attribute _constrainValue_24 = ((ConstrainImpl) rexp).getConstrainValue();
                    final int rval = ((modelMDD2.Number) _constrainValue_24).getValue();
                    Feature _featureReference_28 = ((ConstrainImpl) lexp).getFeatureReference();
                    final Grouped lval = ((Grouped) _featureReference_28);
                    Attribute _attribute_12 = ((Feature) lval).getAttribute();
                    int _value = ((modelMDD2.Number) _attribute_12).getValue();
                    boolean _notEquals = (_value != rval);
                    _xblockexpression_18 = new Boolean(_notEquals);
                  }
                  _xifexpression_29 = _xblockexpression_18;
                }
                _xifexpression_28 = _xifexpression_29;
              }
              _xifexpression_26 = _xifexpression_28;
            }
            _xifexpression_25 = _xifexpression_26;
          }
          _switchResult = _xifexpression_25;
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
  
  protected static Boolean _constraint(final Grouped it) {
    return Boolean.valueOf(Constraints.checkRangeValidity(it));
  }
  
  public static boolean checkRangeValidity(final Grouped it) {
    Attribute _attribute = it.getAttribute();
    if ((_attribute instanceof RangeImpl)) {
      Attribute _attribute_1 = it.getAttribute();
      final RangeImpl atr = ((RangeImpl) _attribute_1);
      int _upper = atr.getUpper();
      int _lower = atr.getLower();
      boolean result = (_upper > _lower);
      return result;
    }
    return false;
  }
  
  public static Boolean constraint(final EObject exp) {
    if (exp instanceof Binary) {
      return _constraint((Binary)exp);
    } else if (exp instanceof Grouped) {
      return _constraint((Grouped)exp);
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
