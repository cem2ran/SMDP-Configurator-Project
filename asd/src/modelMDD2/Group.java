/**
 */
package modelMDD2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelMDD2.Group#getGrouped <em>Grouped</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelMDD2.ModelMDD2Package#getGroup()
 * @model abstract="true"
 * @generated
 */
public interface Group extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Grouped</b></em>' containment reference list.
	 * The list contents are of type {@link modelMDD2.Grouped}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped</em>' containment reference list.
	 * @see modelMDD2.ModelMDD2Package#getGroup_Grouped()
	 * @model containment="true"
	 * @generated
	 */
	EList<Grouped> getGrouped();

} // Group
