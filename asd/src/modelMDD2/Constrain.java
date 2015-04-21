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

} // Constrain
