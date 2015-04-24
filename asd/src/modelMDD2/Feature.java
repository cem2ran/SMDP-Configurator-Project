/**
 */
package modelMDD2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelMDD2.Feature#getSubfeature <em>Subfeature</em>}</li>
 *   <li>{@link modelMDD2.Feature#getConstrains <em>Constrains</em>}</li>
 *   <li>{@link modelMDD2.Feature#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelMDD2.ModelMDD2Package#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subfeature</b></em>' containment reference list.
	 * The list contents are of type {@link modelMDD2.Solitary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subfeature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfeature</em>' containment reference list.
	 * @see modelMDD2.ModelMDD2Package#getFeature_Subfeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solitary> getSubfeature();

	/**
	 * Returns the value of the '<em><b>Constrains</b></em>' containment reference list.
	 * The list contents are of type {@link modelMDD2.Constrain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrains</em>' containment reference list.
	 * @see modelMDD2.ModelMDD2Package#getFeature_Constrains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constrain> getConstrains();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link modelMDD2.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see modelMDD2.ModelMDD2Package#getFeature_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Feature
