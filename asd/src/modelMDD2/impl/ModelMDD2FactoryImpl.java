/**
 */
package modelMDD2.impl;

import modelMDD2.Binary;
import modelMDD2.BinaryOperator;
import modelMDD2.CBoolean;
import modelMDD2.CString;
import modelMDD2.ComparativeOperator;
import modelMDD2.ConjunctiveOperator;
import modelMDD2.Constrain;
import modelMDD2.DisjunctiveOperator;
import modelMDD2.EqualityOperator;
import modelMDD2.Feature;
import modelMDD2.Grouped;
import modelMDD2.Mandatory;
import modelMDD2.Model;
import modelMDD2.ModelMDD2Factory;
import modelMDD2.ModelMDD2Package;
import modelMDD2.NamedElement;
import modelMDD2.Optional;
import modelMDD2.Or;
import modelMDD2.Range;
import modelMDD2.Unary;
import modelMDD2.Xor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelMDD2FactoryImpl extends EFactoryImpl implements ModelMDD2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelMDD2Factory init() {
		try {
			ModelMDD2Factory theModelMDD2Factory = (ModelMDD2Factory)EPackage.Registry.INSTANCE.getEFactory(ModelMDD2Package.eNS_URI);
			if (theModelMDD2Factory != null) {
				return theModelMDD2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelMDD2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelMDD2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelMDD2Package.MODEL: return createModel();
			case ModelMDD2Package.FEATURE: return createFeature();
			case ModelMDD2Package.GROUPED: return createGrouped();
			case ModelMDD2Package.MANDATORY: return createMandatory();
			case ModelMDD2Package.OPTIONAL: return createOptional();
			case ModelMDD2Package.CONSTRAIN: return createConstrain();
			case ModelMDD2Package.BINARY: return createBinary();
			case ModelMDD2Package.UNARY: return createUnary();
			case ModelMDD2Package.OR: return createOr();
			case ModelMDD2Package.XOR: return createXor();
			case ModelMDD2Package.NAMED_ELEMENT: return createNamedElement();
			case ModelMDD2Package.RANGE: return createRange();
			case ModelMDD2Package.CBOOLEAN: return createCBoolean();
			case ModelMDD2Package.CSTRING: return createCString();
			case ModelMDD2Package.NUMBER: return createNumber();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelMDD2Package.COMPARATIVE_OPERATOR:
				return createComparativeOperatorFromString(eDataType, initialValue);
			case ModelMDD2Package.BINARY_OPERATOR:
				return createBinaryOperatorFromString(eDataType, initialValue);
			case ModelMDD2Package.EQUALITY_OPERATOR:
				return createEqualityOperatorFromString(eDataType, initialValue);
			case ModelMDD2Package.CONJUNCTIVE_OPERATOR:
				return createConjunctiveOperatorFromString(eDataType, initialValue);
			case ModelMDD2Package.DISJUNCTIVE_OPERATOR:
				return createDisjunctiveOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelMDD2Package.COMPARATIVE_OPERATOR:
				return convertComparativeOperatorToString(eDataType, instanceValue);
			case ModelMDD2Package.BINARY_OPERATOR:
				return convertBinaryOperatorToString(eDataType, instanceValue);
			case ModelMDD2Package.EQUALITY_OPERATOR:
				return convertEqualityOperatorToString(eDataType, instanceValue);
			case ModelMDD2Package.CONJUNCTIVE_OPERATOR:
				return convertConjunctiveOperatorToString(eDataType, instanceValue);
			case ModelMDD2Package.DISJUNCTIVE_OPERATOR:
				return convertDisjunctiveOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grouped createGrouped() {
		GroupedImpl grouped = new GroupedImpl();
		return grouped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mandatory createMandatory() {
		MandatoryImpl mandatory = new MandatoryImpl();
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optional createOptional() {
		OptionalImpl optional = new OptionalImpl();
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constrain createConstrain() {
		ConstrainImpl constrain = new ConstrainImpl();
		return constrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unary createUnary() {
		UnaryImpl unary = new UnaryImpl();
		return unary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xor createXor() {
		XorImpl xor = new XorImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CBoolean createCBoolean() {
		CBooleanImpl cBoolean = new CBooleanImpl();
		return cBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CString createCString() {
		CStringImpl cString = new CStringImpl();
		return cString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modelMDD2.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparativeOperator createComparativeOperatorFromString(EDataType eDataType, String initialValue) {
		ComparativeOperator result = ComparativeOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparativeOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BinaryOperator result = BinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualityOperator createEqualityOperatorFromString(EDataType eDataType, String initialValue) {
		EqualityOperator result = EqualityOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEqualityOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjunctiveOperator createConjunctiveOperatorFromString(EDataType eDataType, String initialValue) {
		ConjunctiveOperator result = ConjunctiveOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConjunctiveOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjunctiveOperator createDisjunctiveOperatorFromString(EDataType eDataType, String initialValue) {
		DisjunctiveOperator result = DisjunctiveOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisjunctiveOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelMDD2Package getModelMDD2Package() {
		return (ModelMDD2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelMDD2Package getPackage() {
		return ModelMDD2Package.eINSTANCE;
	}

} //ModelMDD2FactoryImpl
