/*
 * generated by Xtext
 */
package dk.itu.mdd.configurator.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.itu.mdd.configurator.services.ConfGrammarAccess;
import modelMDD2.Binary;
import modelMDD2.Constrain;
import modelMDD2.Feature;
import modelMDD2.Grouped;
import modelMDD2.Mandatory;
import modelMDD2.Model;
import modelMDD2.ModelMDD2Package;
import modelMDD2.Optional;
import modelMDD2.Or;
import modelMDD2.Range;
import modelMDD2.Unary;
import modelMDD2.Xor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ConfSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ConfGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ModelMDD2Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ModelMDD2Package.BINARY:
				sequence_Binary_Comparison_Conjunction_Constrain(context, (Binary) semanticObject); 
				return; 
			case ModelMDD2Package.CONSTRAIN:
				sequence_Primary(context, (Constrain) semanticObject); 
				return; 
			case ModelMDD2Package.FEATURE:
				sequence_Feature_Impl(context, (Feature) semanticObject); 
				return; 
			case ModelMDD2Package.GROUPED:
				sequence_Grouped(context, (Grouped) semanticObject); 
				return; 
			case ModelMDD2Package.MANDATORY:
				sequence_Mandatory(context, (Mandatory) semanticObject); 
				return; 
			case ModelMDD2Package.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ModelMDD2Package.OPTIONAL:
				sequence_Optional(context, (Optional) semanticObject); 
				return; 
			case ModelMDD2Package.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case ModelMDD2Package.RANGE:
				sequence_Range(context, (Range) semanticObject); 
				return; 
			case ModelMDD2Package.UNARY:
				sequence_Unary(context, (Unary) semanticObject); 
				return; 
			case ModelMDD2Package.XOR:
				sequence_Xor(context, (Xor) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             leftExp=Comparison_Binary_1_0 
	 *             (
	 *                 Operator='==' | 
	 *                 Operator='!=' | 
	 *                 Operator='<=' | 
	 *                 Operator='<' | 
	 *                 Operator='>=' | 
	 *                 Operator='>'
	 *             ) 
	 *             rightExp=Binary
	 *         ) | 
	 *         (leftExp=Binary_Binary_1_0 rightExp=Primary) | 
	 *         (leftExp=Conjunction_Binary_1_0 Operator='&&' rightExp=Comparison) | 
	 *         (leftExp=Constrain_Binary_1_0 Operator='||' rightExp=Conjunction)
	 *     )
	 */
	protected void sequence_Binary_Comparison_Conjunction_Constrain(EObject context, Binary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (subfeature+=Solitary subfeature+=Solitary*)? (constrains+=Constrain constrains+=Constrain*)?)
	 */
	protected void sequence_Feature_Impl(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString range=Range? (constrains+=Constrain constrains+=Constrain*)?)
	 */
	protected void sequence_Grouped(EObject context, Grouped semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (subfeature+=Solitary subfeature+=Solitary*)? (constrains+=Constrain constrains+=Constrain*)? (groups+=Group groups+=Group*)?)
	 */
	protected void sequence_Mandatory(EObject context, Mandatory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     root=Feature_Impl
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (subfeature+=Solitary subfeature+=Solitary*)? (constrains+=Constrain constrains+=Constrain*)? (groups+=Group groups+=Group*)?)
	 */
	protected void sequence_Optional(EObject context, Optional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (grouped+=Grouped grouped+=Grouped*)?)
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constrainFeatures+=[Solitary|EString] groups=[Group|EString] constrainFeatures+=[Feature|EString])
	 */
	protected void sequence_Primary(EObject context, Constrain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Range(EObject context, Range semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModelMDD2Package.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelMDD2Package.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRangeAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((Operator='!' | Operator='-') exp=Primary)
	 */
	protected void sequence_Unary(EObject context, Unary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (grouped+=Grouped grouped+=Grouped*)?)
	 */
	protected void sequence_Xor(EObject context, Xor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
