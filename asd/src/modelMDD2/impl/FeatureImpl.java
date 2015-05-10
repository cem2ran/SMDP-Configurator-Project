/**
 */
package modelMDD2.impl;

import java.util.Collection;

import modelMDD2.Attribute;
import modelMDD2.Constrain;
import modelMDD2.Feature;
import modelMDD2.ModelMDD2Package;
import modelMDD2.Solitary;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link modelMDD2.impl.FeatureImpl#getAttribute <em>Attribute</em>}</li>
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
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

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
	public Attribute getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelMDD2Package.FEATURE__ATTRIBUTE, oldAttribute, newAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		if (newAttribute != attribute) {
			NotificationChain msgs = null;
			if (attribute != null)
				msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelMDD2Package.FEATURE__ATTRIBUTE, null, msgs);
			if (newAttribute != null)
				msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelMDD2Package.FEATURE__ATTRIBUTE, null, msgs);
			msgs = basicSetAttribute(newAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelMDD2Package.FEATURE__ATTRIBUTE, newAttribute, newAttribute));
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
			case ModelMDD2Package.FEATURE__ATTRIBUTE:
				return basicSetAttribute(null, msgs);
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
			case ModelMDD2Package.FEATURE__ATTRIBUTE:
				return getAttribute();
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
			case ModelMDD2Package.FEATURE__ATTRIBUTE:
				setAttribute((Attribute)newValue);
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
			case ModelMDD2Package.FEATURE__ATTRIBUTE:
				setAttribute((Attribute)null);
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
			case ModelMDD2Package.FEATURE__ATTRIBUTE:
				return attribute != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
