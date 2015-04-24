/**
 */
package modelMDD2.impl;

import java.util.Collection;

import modelMDD2.Attribute;
import modelMDD2.Constrain;
import modelMDD2.Feature;
import modelMDD2.Group;
import modelMDD2.Grouped;
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
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelMDD2.impl.GroupImpl#getSubfeature <em>Subfeature</em>}</li>
 *   <li>{@link modelMDD2.impl.GroupImpl#getConstrains <em>Constrains</em>}</li>
 *   <li>{@link modelMDD2.impl.GroupImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link modelMDD2.impl.GroupImpl#getGrouped <em>Grouped</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GroupImpl extends NamedElementImpl implements Group {
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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;
	/**
	 * The cached value of the '{@link #getGrouped() <em>Grouped</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouped()
	 * @generated
	 * @ordered
	 */
	protected EList<Grouped> grouped;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelMDD2Package.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solitary> getSubfeature() {
		if (subfeature == null) {
			subfeature = new EObjectContainmentEList<Solitary>(Solitary.class, this, ModelMDD2Package.GROUP__SUBFEATURE);
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
			constrains = new EObjectContainmentEList<Constrain>(Constrain.class, this, ModelMDD2Package.GROUP__CONSTRAINS);
		}
		return constrains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ModelMDD2Package.GROUP__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grouped> getGrouped() {
		if (grouped == null) {
			grouped = new EObjectContainmentEList<Grouped>(Grouped.class, this, ModelMDD2Package.GROUP__GROUPED);
		}
		return grouped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelMDD2Package.GROUP__SUBFEATURE:
				return ((InternalEList<?>)getSubfeature()).basicRemove(otherEnd, msgs);
			case ModelMDD2Package.GROUP__CONSTRAINS:
				return ((InternalEList<?>)getConstrains()).basicRemove(otherEnd, msgs);
			case ModelMDD2Package.GROUP__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case ModelMDD2Package.GROUP__GROUPED:
				return ((InternalEList<?>)getGrouped()).basicRemove(otherEnd, msgs);
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
			case ModelMDD2Package.GROUP__SUBFEATURE:
				return getSubfeature();
			case ModelMDD2Package.GROUP__CONSTRAINS:
				return getConstrains();
			case ModelMDD2Package.GROUP__ATTRIBUTES:
				return getAttributes();
			case ModelMDD2Package.GROUP__GROUPED:
				return getGrouped();
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
			case ModelMDD2Package.GROUP__SUBFEATURE:
				getSubfeature().clear();
				getSubfeature().addAll((Collection<? extends Solitary>)newValue);
				return;
			case ModelMDD2Package.GROUP__CONSTRAINS:
				getConstrains().clear();
				getConstrains().addAll((Collection<? extends Constrain>)newValue);
				return;
			case ModelMDD2Package.GROUP__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ModelMDD2Package.GROUP__GROUPED:
				getGrouped().clear();
				getGrouped().addAll((Collection<? extends Grouped>)newValue);
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
			case ModelMDD2Package.GROUP__SUBFEATURE:
				getSubfeature().clear();
				return;
			case ModelMDD2Package.GROUP__CONSTRAINS:
				getConstrains().clear();
				return;
			case ModelMDD2Package.GROUP__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ModelMDD2Package.GROUP__GROUPED:
				getGrouped().clear();
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
			case ModelMDD2Package.GROUP__SUBFEATURE:
				return subfeature != null && !subfeature.isEmpty();
			case ModelMDD2Package.GROUP__CONSTRAINS:
				return constrains != null && !constrains.isEmpty();
			case ModelMDD2Package.GROUP__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ModelMDD2Package.GROUP__GROUPED:
				return grouped != null && !grouped.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case ModelMDD2Package.GROUP__SUBFEATURE: return ModelMDD2Package.FEATURE__SUBFEATURE;
				case ModelMDD2Package.GROUP__CONSTRAINS: return ModelMDD2Package.FEATURE__CONSTRAINS;
				case ModelMDD2Package.GROUP__ATTRIBUTES: return ModelMDD2Package.FEATURE__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case ModelMDD2Package.FEATURE__SUBFEATURE: return ModelMDD2Package.GROUP__SUBFEATURE;
				case ModelMDD2Package.FEATURE__CONSTRAINS: return ModelMDD2Package.GROUP__CONSTRAINS;
				case ModelMDD2Package.FEATURE__ATTRIBUTES: return ModelMDD2Package.GROUP__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GroupImpl
