/**
 */
package modelMDD2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelMDD2.Binary#getRightExp <em>Right Exp</em>}</li>
 *   <li>{@link modelMDD2.Binary#getLeftExp <em>Left Exp</em>}</li>
 *   <li>{@link modelMDD2.Binary#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelMDD2.ModelMDD2Package#getBinary()
 * @model
 * @generated
 */
public interface Binary extends Constrain {
	/**
	 * Returns the value of the '<em><b>Right Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Exp</em>' containment reference.
	 * @see #setRightExp(Constrain)
	 * @see modelMDD2.ModelMDD2Package#getBinary_RightExp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constrain getRightExp();

	/**
	 * Sets the value of the '{@link modelMDD2.Binary#getRightExp <em>Right Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Exp</em>' containment reference.
	 * @see #getRightExp()
	 * @generated
	 */
	void setRightExp(Constrain value);

	/**
	 * Returns the value of the '<em><b>Left Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Exp</em>' containment reference.
	 * @see #setLeftExp(Constrain)
	 * @see modelMDD2.ModelMDD2Package#getBinary_LeftExp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constrain getLeftExp();

	/**
	 * Sets the value of the '{@link modelMDD2.Binary#getLeftExp <em>Left Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Exp</em>' containment reference.
	 * @see #getLeftExp()
	 * @generated
	 */
	void setLeftExp(Constrain value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see modelMDD2.ModelMDD2Package#getBinary_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link modelMDD2.Binary#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

} // Binary
