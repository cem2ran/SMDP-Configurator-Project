/**
 */
package modelMDD2.impl;

import java.util.Collection;

import modelMDD2.Constrain;
import modelMDD2.Feature;
import modelMDD2.Group;
import modelMDD2.ModelMDD2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constrain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelMDD2.impl.ConstrainImpl#getConstrainFeatures <em>Constrain Features</em>}</li>
 *   <li>{@link modelMDD2.impl.ConstrainImpl#getGroups <em>Groups</em>}</li>
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
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected Group groups;

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
	public Group getGroups() {
		if (groups != null && groups.eIsProxy()) {
			InternalEObject oldGroups = (InternalEObject)groups;
			groups = (Group)eResolveProxy(oldGroups);
			if (groups != oldGroups) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelMDD2Package.CONSTRAIN__GROUPS, oldGroups, groups));
			}
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetGroups() {
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroups(Group newGroups) {
		Group oldGroups = groups;
		groups = newGroups;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelMDD2Package.CONSTRAIN__GROUPS, oldGroups, groups));
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
			case ModelMDD2Package.CONSTRAIN__GROUPS:
				if (resolve) return getGroups();
				return basicGetGroups();
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
			case ModelMDD2Package.CONSTRAIN__GROUPS:
				setGroups((Group)newValue);
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
			case ModelMDD2Package.CONSTRAIN__GROUPS:
				setGroups((Group)null);
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
			case ModelMDD2Package.CONSTRAIN__GROUPS:
				return groups != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstrainImpl
