/**
 */
package modelMDD2.impl;

import modelMDD2.Constrain;
import modelMDD2.Feature;
import modelMDD2.ModelMDD2Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constrain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelMDD2.impl.ConstrainImpl#getFeatureReference <em>Feature Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstrainImpl extends NamedElementImpl implements Constrain {
	/**
	 * The cached value of the '{@link #getFeatureReference() <em>Feature Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureReference()
	 * @generated
	 * @ordered
	 */
	protected Feature featureReference;

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
	public Feature getFeatureReference() {
		if (featureReference != null && featureReference.eIsProxy()) {
			InternalEObject oldFeatureReference = (InternalEObject)featureReference;
			featureReference = (Feature)eResolveProxy(oldFeatureReference);
			if (featureReference != oldFeatureReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelMDD2Package.CONSTRAIN__FEATURE_REFERENCE, oldFeatureReference, featureReference));
			}
		}
		return featureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeatureReference() {
		return featureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureReference(Feature newFeatureReference) {
		Feature oldFeatureReference = featureReference;
		featureReference = newFeatureReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelMDD2Package.CONSTRAIN__FEATURE_REFERENCE, oldFeatureReference, featureReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelMDD2Package.CONSTRAIN__FEATURE_REFERENCE:
				if (resolve) return getFeatureReference();
				return basicGetFeatureReference();
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
			case ModelMDD2Package.CONSTRAIN__FEATURE_REFERENCE:
				setFeatureReference((Feature)newValue);
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
			case ModelMDD2Package.CONSTRAIN__FEATURE_REFERENCE:
				setFeatureReference((Feature)null);
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
			case ModelMDD2Package.CONSTRAIN__FEATURE_REFERENCE:
				return featureReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstrainImpl
