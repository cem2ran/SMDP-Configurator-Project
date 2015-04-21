/**
 */
package modelMDD2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grouped</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelMDD2.Grouped#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelMDD2.ModelMDD2Package#getGrouped()
 * @model
 * @generated
 */
public interface Grouped extends Feature {

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see modelMDD2.ModelMDD2Package#getGrouped_Range()
	 * @model containment="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link modelMDD2.Grouped#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

} // Grouped
