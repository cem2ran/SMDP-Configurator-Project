/**
 */
package modelMDD2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelMDD2.Constrain#getConstrainFeatures <em>Constrain Features</em>}</li>
 *   <li>{@link modelMDD2.Constrain#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelMDD2.ModelMDD2Package#getConstrain()
 * @model
 * @generated
 */
public interface Constrain extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Constrain Features</b></em>' reference list.
	 * The list contents are of type {@link modelMDD2.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrain Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrain Features</em>' reference list.
	 * @see modelMDD2.ModelMDD2Package#getConstrain_ConstrainFeatures()
	 * @model
	 * @generated
	 */
	EList<Feature> getConstrainFeatures();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference.
	 * @see #setGroups(Group)
	 * @see modelMDD2.ModelMDD2Package#getConstrain_Groups()
	 * @model
	 * @generated
	 */
	Group getGroups();

	/**
	 * Sets the value of the '{@link modelMDD2.Constrain#getGroups <em>Groups</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groups</em>' reference.
	 * @see #getGroups()
	 * @generated
	 */
	void setGroups(Group value);

} // Constrain
