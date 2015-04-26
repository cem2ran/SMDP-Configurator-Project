/**
 */
package modelMDD2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelMDD2.Constrain#getFeatureReference <em>Feature Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelMDD2.ModelMDD2Package#getConstrain()
 * @model
 * @generated
 */
public interface Constrain extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Feature Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Reference</em>' reference.
	 * @see #setFeatureReference(Feature)
	 * @see modelMDD2.ModelMDD2Package#getConstrain_FeatureReference()
	 * @model
	 * @generated
	 */
	Feature getFeatureReference();

	/**
	 * Sets the value of the '{@link modelMDD2.Constrain#getFeatureReference <em>Feature Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Reference</em>' reference.
	 * @see #getFeatureReference()
	 * @generated
	 */
	void setFeatureReference(Feature value);

} // Constrain
