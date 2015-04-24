/*
 * generated by Xtext
 */
package dk.itu.mdd.configurator.serializer;

import com.google.inject.Inject;
import dk.itu.mdd.configurator.services.ConfGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ConfSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ConfGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Or_CommaKeyword_2_2_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_2_0_p;
	protected AbstractElementAlias match_Xor_CommaKeyword_2_2_0_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ConfGrammarAccess) access;
		match_Or_CommaKeyword_2_2_0_a = new TokenAlias(true, true, grammarAccess.getOrAccess().getCommaKeyword_2_2_0());
		match_Primary_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
		match_Primary_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
		match_Xor_CommaKeyword_2_2_0_a = new TokenAlias(true, true, grammarAccess.getXorAccess().getCommaKeyword_2_2_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Or_CommaKeyword_2_2_0_a.equals(syntax))
				emit_Or_CommaKeyword_2_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Xor_CommaKeyword_2_2_0_a.equals(syntax))
				emit_Xor_CommaKeyword_2_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','*
	 *
	 * This ambiguous syntax occurs at:
	 *     grouped+=Grouped (ambiguity) grouped+=Grouped
	 */
	protected void emit_Or_CommaKeyword_2_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) Operator='!'
	 *     (rule start) (ambiguity) Operator='-'
	 *     (rule start) (ambiguity) constrainFeatures+=[Solitary|EString]
	 *     (rule start) (ambiguity) {Binary.leftExp=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Binary.leftExp=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','*
	 *
	 * This ambiguous syntax occurs at:
	 *     grouped+=Grouped (ambiguity) grouped+=Grouped
	 */
	protected void emit_Xor_CommaKeyword_2_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
