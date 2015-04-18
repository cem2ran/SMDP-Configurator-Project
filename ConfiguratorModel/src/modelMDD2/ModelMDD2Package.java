/**
 */
package modelMDD2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modelMDD2.ModelMDD2Factory
 * @model kind="package"
 * @generated
 */
public interface ModelMDD2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelMDD2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/modelMDD2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelMDD2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelMDD2Package eINSTANCE = modelMDD2.impl.ModelMDD2PackageImpl.init();

	/**
	 * The meta object id for the '{@link modelMDD2.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.NamedElementImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelMDD2.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.ModelImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ROOT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelMDD2.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.FeatureImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subfeature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUBFEATURE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constrains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONSTRAINS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelMDD2.impl.SolitaryImpl <em>Solitary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.SolitaryImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getSolitary()
	 * @generated
	 */
	int SOLITARY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Subfeature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY__SUBFEATURE = FEATURE__SUBFEATURE;

	/**
	 * The feature id for the '<em><b>Constrains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY__CONSTRAINS = FEATURE__CONSTRAINS;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY__GROUPS = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solitary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solitary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelMDD2.impl.GroupedImpl <em>Grouped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.GroupedImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getGrouped()
	 * @generated
	 */
	int GROUPED = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Subfeature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED__SUBFEATURE = FEATURE__SUBFEATURE;

	/**
	 * The feature id for the '<em><b>Constrains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED__CONSTRAINS = FEATURE__CONSTRAINS;

	/**
	 * The number of structural features of the '<em>Grouped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grouped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPED_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelMDD2.impl.MandatoryImpl <em>Mandatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.MandatoryImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getMandatory()
	 * @generated
	 */
	int MANDATORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__NAME = SOLITARY__NAME;

	/**
	 * The feature id for the '<em><b>Subfeature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SUBFEATURE = SOLITARY__SUBFEATURE;

	/**
	 * The feature id for the '<em><b>Constrains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CONSTRAINS = SOLITARY__CONSTRAINS;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__GROUPS = SOLITARY__GROUPS;

	/**
	 * The number of structural features of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_COUNT = SOLITARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_OPERATION_COUNT = SOLITARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelMDD2.impl.OptionalImpl <em>Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.OptionalImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getOptional()
	 * @generated
	 */
	int OPTIONAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__NAME = SOLITARY__NAME;

	/**
	 * The feature id for the '<em><b>Subfeature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__SUBFEATURE = SOLITARY__SUBFEATURE;

	/**
	 * The feature id for the '<em><b>Constrains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__CONSTRAINS = SOLITARY__CONSTRAINS;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__GROUPS = SOLITARY__GROUPS;

	/**
	 * The number of structural features of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_COUNT = SOLITARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_OPERATION_COUNT = SOLITARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelMDD2.impl.ConstrainImpl <em>Constrain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.ConstrainImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getConstrain()
	 * @generated
	 */
	int CONSTRAIN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Constrain Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAIN__CONSTRAIN_FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constrain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constrain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelMDD2.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.BinaryImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__NAME = CONSTRAIN__NAME;

	/**
	 * The feature id for the '<em><b>Constrain Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__CONSTRAIN_FEATURES = CONSTRAIN__CONSTRAIN_FEATURES;

	/**
	 * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__RIGHT_EXP = CONSTRAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__LEFT_EXP = CONSTRAIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__OPERATOR = CONSTRAIN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = CONSTRAIN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_COUNT = CONSTRAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelMDD2.impl.UnaryImpl <em>Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.UnaryImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getUnary()
	 * @generated
	 */
	int UNARY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__NAME = CONSTRAIN__NAME;

	/**
	 * The feature id for the '<em><b>Constrain Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__CONSTRAIN_FEATURES = CONSTRAIN__CONSTRAIN_FEATURES;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__EXP = CONSTRAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__OPERATOR = CONSTRAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FEATURE_COUNT = CONSTRAIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_COUNT = CONSTRAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelMDD2.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.GroupImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Grouped</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelMDD2.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.OrImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getOr()
	 * @generated
	 */
	int OR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__NAME = GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Grouped</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__GROUPED = GROUP__GROUPED;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelMDD2.impl.XorImpl <em>Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelMDD2.impl.XorImpl
	 * @see modelMDD2.impl.ModelMDD2PackageImpl#getXor()
	 * @generated
	 */
	int XOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__NAME = GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Grouped</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__GROUPED = GROUP__GROUPED;

	/**
	 * The number of structural features of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link modelMDD2.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see modelMDD2.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link modelMDD2.Model#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see modelMDD2.Model#getRoot()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Root();

	/**
	 * Returns the meta object for class '{@link modelMDD2.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see modelMDD2.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link modelMDD2.Feature#getSubfeature <em>Subfeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subfeature</em>'.
	 * @see modelMDD2.Feature#getSubfeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Subfeature();

	/**
	 * Returns the meta object for the containment reference list '{@link modelMDD2.Feature#getConstrains <em>Constrains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constrains</em>'.
	 * @see modelMDD2.Feature#getConstrains()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Constrains();

	/**
	 * Returns the meta object for class '{@link modelMDD2.Solitary <em>Solitary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solitary</em>'.
	 * @see modelMDD2.Solitary
	 * @generated
	 */
	EClass getSolitary();

	/**
	 * Returns the meta object for the containment reference list '{@link modelMDD2.Solitary#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see modelMDD2.Solitary#getGroups()
	 * @see #getSolitary()
	 * @generated
	 */
	EReference getSolitary_Groups();

	/**
	 * Returns the meta object for class '{@link modelMDD2.Grouped <em>Grouped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouped</em>'.
	 * @see modelMDD2.Grouped
	 * @generated
	 */
	EClass getGrouped();

	/**
	 * Returns the meta object for class '{@link modelMDD2.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory</em>'.
	 * @see modelMDD2.Mandatory
	 * @generated
	 */
	EClass getMandatory();

	/**
	 * Returns the meta object for class '{@link modelMDD2.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional</em>'.
	 * @see modelMDD2.Optional
	 * @generated
	 */
	EClass getOptional();

	/**
	 * Returns the meta object for class '{@link modelMDD2.Constrain <em>Constrain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrain</em>'.
	 * @see modelMDD2.Constrain
	 * @generated
	 */
	EClass getConstrain();

	/**
	 * Returns the meta object for the reference list '{@link modelMDD2.Constrain#getConstrainFeatures <em>Constrain Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrain Features</em>'.
	 * @see modelMDD2.Constrain#getConstrainFeatures()
	 * @see #getConstrain()
	 * @generated
	 */
	EReference getConstrain_ConstrainFeatures();

	/**
	 * Returns the meta object for class '{@link modelMDD2.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see modelMDD2.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the containment reference '{@link modelMDD2.Binary#getRightExp <em>Right Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Exp</em>'.
	 * @see modelMDD2.Binary#getRightExp()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_RightExp();

	/**
	 * Returns the meta object for the containment reference '{@link modelMDD2.Binary#getLeftExp <em>Left Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Exp</em>'.
	 * @see modelMDD2.Binary#getLeftExp()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_LeftExp();

	/**
	 * Returns the meta object for the attribute '{@link modelMDD2.Binary#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see modelMDD2.Binary#getOperator()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_Operator();

	/**
	 * Returns the meta object for class '{@link modelMDD2.Unary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary</em>'.
	 * @see modelMDD2.Unary
	 * @generated
	 */
	EClass getUnary();

	/**
	 * Returns the meta object for the containment reference '{@link modelMDD2.Unary#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see modelMDD2.Unary#getExp()
	 * @see #getUnary()
	 * @generated
	 */
	EReference getUnary_Exp();

	/**
	 * Returns the meta object for the attribute '{@link modelMDD2.Unary#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see modelMDD2.Unary#getOperator()
	 * @see #getUnary()
	 * @generated
	 */
	EAttribute getUnary_Operator();

	/**
	 * Returns the meta object for class '{@link modelMDD2.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see modelMDD2.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link modelMDD2.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor</em>'.
	 * @see modelMDD2.Xor
	 * @generated
	 */
	EClass getXor();

	/**
	 * Returns the meta object for class '{@link modelMDD2.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see modelMDD2.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link modelMDD2.Group#getGrouped <em>Grouped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grouped</em>'.
	 * @see modelMDD2.Group#getGrouped()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Grouped();

	/**
	 * Returns the meta object for class '{@link modelMDD2.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see modelMDD2.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link modelMDD2.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see modelMDD2.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelMDD2Factory getModelMDD2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modelMDD2.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.ModelImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ROOT = eINSTANCE.getModel_Root();

		/**
		 * The meta object literal for the '{@link modelMDD2.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.FeatureImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Subfeature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SUBFEATURE = eINSTANCE.getFeature_Subfeature();

		/**
		 * The meta object literal for the '<em><b>Constrains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CONSTRAINS = eINSTANCE.getFeature_Constrains();

		/**
		 * The meta object literal for the '{@link modelMDD2.impl.SolitaryImpl <em>Solitary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.SolitaryImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getSolitary()
		 * @generated
		 */
		EClass SOLITARY = eINSTANCE.getSolitary();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY__GROUPS = eINSTANCE.getSolitary_Groups();

		/**
		 * The meta object literal for the '{@link modelMDD2.impl.GroupedImpl <em>Grouped</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.GroupedImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getGrouped()
		 * @generated
		 */
		EClass GROUPED = eINSTANCE.getGrouped();

		/**
		 * The meta object literal for the '{@link modelMDD2.impl.MandatoryImpl <em>Mandatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.MandatoryImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getMandatory()
		 * @generated
		 */
		EClass MANDATORY = eINSTANCE.getMandatory();

		/**
		 * The meta object literal for the '{@link modelMDD2.impl.OptionalImpl <em>Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.OptionalImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getOptional()
		 * @generated
		 */
		EClass OPTIONAL = eINSTANCE.getOptional();

		/**
		 * The meta object literal for the '{@link modelMDD2.impl.ConstrainImpl <em>Constrain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.ConstrainImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getConstrain()
		 * @generated
		 */
		EClass CONSTRAIN = eINSTANCE.getConstrain();

		/**
		 * The meta object literal for the '<em><b>Constrain Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAIN__CONSTRAIN_FEATURES = eINSTANCE.getConstrain_ConstrainFeatures();

		/**
		 * The meta object literal for the '{@link modelMDD2.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.BinaryImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Right Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__RIGHT_EXP = eINSTANCE.getBinary_RightExp();

		/**
		 * The meta object literal for the '<em><b>Left Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__LEFT_EXP = eINSTANCE.getBinary_LeftExp();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY__OPERATOR = eINSTANCE.getBinary_Operator();

		/**
		 * The meta object literal for the '{@link modelMDD2.impl.UnaryImpl <em>Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.UnaryImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getUnary()
		 * @generated
		 */
		EClass UNARY = eINSTANCE.getUnary();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY__EXP = eINSTANCE.getUnary_Exp();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY__OPERATOR = eINSTANCE.getUnary_Operator();

		/**
		 * The meta object literal for the '{@link modelMDD2.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.OrImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link modelMDD2.impl.XorImpl <em>Xor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.XorImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getXor()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXor();

		/**
		 * The meta object literal for the '{@link modelMDD2.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.GroupImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Grouped</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUPED = eINSTANCE.getGroup_Grouped();

		/**
		 * The meta object literal for the '{@link modelMDD2.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelMDD2.impl.NamedElementImpl
		 * @see modelMDD2.impl.ModelMDD2PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //ModelMDD2Package
