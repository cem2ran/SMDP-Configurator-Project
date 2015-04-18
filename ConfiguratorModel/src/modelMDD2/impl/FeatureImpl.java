/**
 */
package modelMDD2.impl;

import java.util.Collection;

import modelMDD2.Constrain;
import modelMDD2.Feature;
import modelMDD2.ModelMDD2Package;
import modelMDD2.Solitary;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelMDD2.impl.FeatureImpl#getSubfeature <em>Subfeature</em>}</li>
 *   <li>{@link modelMDD2.impl.FeatureImpl#getConstrains <em>Constrains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends NamedElementImpl implements Feature {
	/**
	 * The cached value of the '{@link #getSubfeature() <em>Subfeature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Solitary> subfeature;

	/**
	 * The cached value of the '{@link #getConstrains() <em>Constrains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrains()
	 * @generated
	 * @ordered
	 */
	protected EList<Constrain> constrains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelMDD2Package.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solitary> getSubfeature() {
		if (subfeature == null) {
			subfeature = new EObjectContainmentEList<Solitary>(Solitary.class, this, ModelMDD2Package.FEATURE__SUBFEATURE);
		}
		return subfeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constrain> getConstrains() {
		if (constrains == null) {
			constrains = new EObjectContainmentEList<Constrain>(Constrain.class, this, ModelMDD2Package.FEATURE__CONSTRAINS);
		}
		return constrains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelMDD2Package.FEATURE__SUBFEATURE:
				return ((InternalEList<?>)getSubfeature()).basicRemove(otherEnd, msgs);
			case ModelMDD2Package.FEATURE__CONSTRAINS:
				return ((InternalEList<?>)getConstrains()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelMDD2Package.FEATURE__SUBFEATURE:
				return getSubfeature();
			case ModelMDD2Package.FEATURE__CONSTRAINS:
				return getConstrains();
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
			case ModelMDD2Package.FEATURE__SUBFEATURE:
				getSubfeature().clear();
				getSubfeature().addAll((Collection<? extends Solitary>)newValue);
				return;
			case ModelMDD2Package.FEATURE__CONSTRAINS:
				getConstrains().clear();
				getConstrains().addAll((Collection<? extends Constrain>)newValue);
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
			case ModelMDD2Package.FEATURE__SUBFEATURE:
				getSubfeature().clear();
				return;
			case ModelMDD2Package.FEATURE__CONSTRAINS:
				getConstrains().clear();
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
			case ModelMDD2Package.FEATURE__SUBFEATURE:
				return subfeature != null && !subfeature.isEmpty();
			case ModelMDD2Package.FEATURE__CONSTRAINS:
				return constrains != null && !constrains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
