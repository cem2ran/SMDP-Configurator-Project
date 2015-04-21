/**
 */
package modelMDD2.impl;

import java.util.Collection;

import modelMDD2.Constrain;
import modelMDD2.Feature;
import modelMDD2.ModelMDD2Package;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constrain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelMDD2.impl.ConstrainImpl#getConstrainFeatures <em>Constrain Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstrainImpl extends NamedElementImpl implements Constrain {
	/**
	 * The cached value of the '{@link #getConstrainFeatures() <em>Constrain Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> constrainFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelMDD2Package.Literals.CONSTRAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getConstrainFeatures() {
		if (constrainFeatures == null) {
			constrainFeatures = new EObjectResolvingEList<Feature>(Feature.class, this, ModelMDD2Package.CONSTRAIN__CONSTRAIN_FEATURES);
		}
		return constrainFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelMDD2Package.CONSTRAIN__CONSTRAIN_FEATURES:
				return getConstrainFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelMDD2Package.CONSTRAIN__CONSTRAIN_FEATURES:
				getConstrainFeatures().clear();
				getConstrainFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelMDD2Package.CONSTRAIN__CONSTRAIN_FEATURES:
				getConstrainFeatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelMDD2Package.CONSTRAIN__CONSTRAIN_FEATURES:
				return constrainFeatures != null && !constrainFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstrainImpl
