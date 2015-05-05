package dk.itu.configurator;

import org.eclipse.emf.ecore.EObject;

import java.util.Objects;

import modelMDD2.Feature;
import modelMDD2.impl.FeatureImpl;
import modelMDD2.impl.MandatoryImpl;
import modelMDD2.impl.ModelImpl;
import modelMDD2.impl.OptionalImpl;
import modelMDD2.impl.OrImpl;
import modelMDD2.impl.XorImpl;

/**
 * Created by cem2ran on 04/05/15.
 */
public class Constraints {
    public static String getPath(Feature feature) {
        //Feature feature = exp.getFeatureReference();
        EObject _eContainer = feature.eContainer();
        Object _path = Constraints.getPath(_eContainer, feature.getName());
        String path = ("" + _path);
        int _indexOf = path.indexOf(".");
        int _plus = (_indexOf + 1);
        return path.substring(_plus);
    }

    public static Object getPath(final EObject obj, final String path) {
        Object _xifexpression = null;
        EObject _eContainer = obj.eContainer();
        boolean _equals = Objects.equals(_eContainer, null);
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
}
