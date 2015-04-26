/**
 */
package modelMDD2.impl;

import java.lang.String;
import modelMDD2.Binary;
import modelMDD2.BinaryOperator;
import modelMDD2.Constrain;
import modelMDD2.ModelMDD2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelMDD2.impl.BinaryImpl#getRightExp <em>Right Exp</em>}</li>
 *   <li>{@link modelMDD2.impl.BinaryImpl#getLeftExp <em>Left Exp</em>}</li>
 *   <li>{@link modelMDD2.impl.BinaryImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryImpl extends ConstrainImpl implements Binary {
	/**
	 * The cached value of the '{@link #getRightExp() <em>Right Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightExp()
	 * @generated
	 * @ordered
	 */
	protected Constrain rightExp;

	/**
	 * The cached value of the '{@link #getLeftExp() <em>Left Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftExp()
	 * @generated
	 * @ordered
	 */
	protected Constrain leftExp;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryOperator OPERATOR_EDEFAULT = BinaryOperator.LESS_THAN;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BinaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelMDD2Package.Literals.BINARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constrain getRightExp() {
		return rightExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightExp(Constrain newRightExp, NotificationChain msgs) {
		Constrain oldRightExp = rightExp;
		rightExp = newRightExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelMDD2Package.BINARY__RIGHT_EXP, oldRightExp, newRightExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightExp(Constrain newRightExp) {
		if (newRightExp != rightExp) {
			NotificationChain msgs = null;
			if (rightExp != null)
				msgs = ((InternalEObject)rightExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelMDD2Package.BINARY__RIGHT_EXP, null, msgs);
			if (newRightExp != null)
				msgs = ((InternalEObject)newRightExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelMDD2Package.BINARY__RIGHT_EXP, null, msgs);
			msgs = basicSetRightExp(newRightExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelMDD2Package.BINARY__RIGHT_EXP, newRightExp, newRightExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constrain getLeftExp() {
		return leftExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftExp(Constrain newLeftExp, NotificationChain msgs) {
		Constrain oldLeftExp = leftExp;
		leftExp = newLeftExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelMDD2Package.BINARY__LEFT_EXP, oldLeftExp, newLeftExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftExp(Constrain newLeftExp) {
		if (newLeftExp != leftExp) {
			NotificationChain msgs = null;
			if (leftExp != null)
				msgs = ((InternalEObject)leftExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelMDD2Package.BINARY__LEFT_EXP, null, msgs);
			if (newLeftExp != null)
				msgs = ((InternalEObject)newLeftExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelMDD2Package.BINARY__LEFT_EXP, null, msgs);
			msgs = basicSetLeftExp(newLeftExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelMDD2Package.BINARY__LEFT_EXP, newLeftExp, newLeftExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BinaryOperator newOperator) {
		BinaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelMDD2Package.BINARY__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelMDD2Package.BINARY__RIGHT_EXP:
				return basicSetRightExp(null, msgs);
			case ModelMDD2Package.BINARY__LEFT_EXP:
				return basicSetLeftExp(null, msgs);
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
			case ModelMDD2Package.BINARY__RIGHT_EXP:
				return getRightExp();
			case ModelMDD2Package.BINARY__LEFT_EXP:
				return getLeftExp();
			case ModelMDD2Package.BINARY__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelMDD2Package.BINARY__RIGHT_EXP:
				setRightExp((Constrain)newValue);
				return;
			case ModelMDD2Package.BINARY__LEFT_EXP:
				setLeftExp((Constrain)newValue);
				return;
			case ModelMDD2Package.BINARY__OPERATOR:
				setOperator((BinaryOperator)newValue);
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
			case ModelMDD2Package.BINARY__RIGHT_EXP:
				setRightExp((Constrain)null);
				return;
			case ModelMDD2Package.BINARY__LEFT_EXP:
				setLeftExp((Constrain)null);
				return;
			case ModelMDD2Package.BINARY__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case ModelMDD2Package.BINARY__RIGHT_EXP:
				return rightExp != null;
			case ModelMDD2Package.BINARY__LEFT_EXP:
				return leftExp != null;
			case ModelMDD2Package.BINARY__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BinaryImpl
