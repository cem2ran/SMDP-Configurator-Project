/*
 * generated by Xtext
 */
parser grammar InternalConfParser;

options {
	tokenVocab=InternalConfLexer;
	superClass=AbstractInternalAntlrParser;
	
}

@header {
package dk.itu.mdd.configurator.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.mdd.configurator.services.ConfGrammarAccess;

}

@members {


	private ConfGrammarAccess grammarAccess;
	 	
	public InternalConfParser(TokenStream input, ConfGrammarAccess grammarAccess) {
		this(input);
		this.grammarAccess = grammarAccess;
		registerRules(grammarAccess.getGrammar());
	}
	
	@Override
	protected String getFirstRuleName() {
		return "Model";	
	} 
	   	   	
	@Override
	protected ConfGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}
}

@rulecatch { 
	catch (RecognitionException re) { 
	    recover(input,re); 
	    appendSkippedTokens();
	}
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getRootFeature_ImplParserRuleCall_0()); 
	    }
		lv_root_0_0=ruleFeature_Impl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		set(
       			$current, 
       			"root",
        		lv_root_0_0, 
        		"Feature_Impl");
	        afterParserOrEnumRuleCall();
	    }

)
)
;







// Entry rule entryRuleSolitary
entryRuleSolitary returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getSolitaryRule()); }
	 iv_ruleSolitary=ruleSolitary 
	 { $current=$iv_ruleSolitary.current; } 
	 EOF 
;

// Rule Solitary
ruleSolitary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSolitaryAccess().getMandatoryParserRuleCall_0()); 
    }
    this_Mandatory_0=ruleMandatory
    {
        $current = $this_Mandatory_0.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSolitaryAccess().getOptionalParserRuleCall_1()); 
    }
    this_Optional_1=ruleOptional
    {
        $current = $this_Optional_1.current;
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleConstrain
entryRuleConstrain returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getConstrainRule()); }
	 iv_ruleConstrain=ruleConstrain 
	 { $current=$iv_ruleConstrain.current; } 
	 EOF 
;

// Rule Constrain
ruleConstrain returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getConstrainAccess().getConjunctionParserRuleCall_0()); 
    }
    this_Conjunction_0=ruleConjunction
    {
        $current = $this_Conjunction_0.current;
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getConstrainAccess().getBinaryLeftExpAction_1_0(),
            $current);
    }
)(
(
		lv_Operator_2_0=
	VerticalLineVerticalLine
    {
        newLeafNode(lv_Operator_2_0, grammarAccess.getConstrainAccess().getOperatorVerticalLineVerticalLineKeyword_1_1_0());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstrainRule());
	        }
       		setWithLastConsumed($current, "Operator", lv_Operator_2_0, "||");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getConstrainAccess().getRightExpConjunctionParserRuleCall_1_2_0()); 
	    }
		lv_rightExp_3_0=ruleConjunction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstrainRule());
	        }
       		set(
       			$current, 
       			"rightExp",
        		lv_rightExp_3_0, 
        		"Conjunction");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleConjunction
entryRuleConjunction returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getConjunctionRule()); }
	 iv_ruleConjunction=ruleConjunction 
	 { $current=$iv_ruleConjunction.current; } 
	 EOF 
;

// Rule Conjunction
ruleConjunction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
    }
    this_Comparison_0=ruleComparison
    {
        $current = $this_Comparison_0.current;
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getConjunctionAccess().getBinaryLeftExpAction_1_0(),
            $current);
    }
)(
(
		lv_Operator_2_0=
	AmpersandAmpersand
    {
        newLeafNode(lv_Operator_2_0, grammarAccess.getConjunctionAccess().getOperatorAmpersandAmpersandKeyword_1_1_0());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConjunctionRule());
	        }
       		setWithLastConsumed($current, "Operator", lv_Operator_2_0, "&&");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightExpComparisonParserRuleCall_1_2_0()); 
	    }
		lv_rightExp_3_0=ruleComparison		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConjunctionRule());
	        }
       		set(
       			$current, 
       			"rightExp",
        		lv_rightExp_3_0, 
        		"Comparison");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleComparison
entryRuleComparison returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getComparisonRule()); }
	 iv_ruleComparison=ruleComparison 
	 { $current=$iv_ruleComparison.current; } 
	 EOF 
;

// Rule Comparison
ruleComparison returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getComparisonAccess().getBinaryParserRuleCall_0()); 
    }
    this_Binary_0=ruleBinary
    {
        $current = $this_Binary_0.current;
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getComparisonAccess().getBinaryLeftExpAction_1_0(),
            $current);
    }
)(
(
(
		lv_Operator_2_1=
	EqualsSignEqualsSign
    {
        newLeafNode(lv_Operator_2_1, grammarAccess.getComparisonAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComparisonRule());
	        }
       		setWithLastConsumed($current, "Operator", lv_Operator_2_1, null);
	    }

    |		lv_Operator_2_2=
	ExclamationMarkEqualsSign
    {
        newLeafNode(lv_Operator_2_2, grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComparisonRule());
	        }
       		setWithLastConsumed($current, "Operator", lv_Operator_2_2, null);
	    }

    |		lv_Operator_2_3=
	LessThanSignEqualsSign
    {
        newLeafNode(lv_Operator_2_3, grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComparisonRule());
	        }
       		setWithLastConsumed($current, "Operator", lv_Operator_2_3, null);
	    }

    |		lv_Operator_2_4=
	LessThanSign
    {
        newLeafNode(lv_Operator_2_4, grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_1_1_0_3());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComparisonRule());
	        }
       		setWithLastConsumed($current, "Operator", lv_Operator_2_4, null);
	    }

    |		lv_Operator_2_5=
	GreaterThanSignEqualsSign
    {
        newLeafNode(lv_Operator_2_5, grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_4());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComparisonRule());
	        }
       		setWithLastConsumed($current, "Operator", lv_Operator_2_5, null);
	    }

    |		lv_Operator_2_6=
	GreaterThanSign
    {
        newLeafNode(lv_Operator_2_6, grammarAccess.getComparisonAccess().getOperatorGreaterThanSignKeyword_1_1_0_5());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComparisonRule());
	        }
       		setWithLastConsumed($current, "Operator", lv_Operator_2_6, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getComparisonAccess().getRightExpBinaryParserRuleCall_1_2_0()); 
	    }
		lv_rightExp_3_0=ruleBinary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComparisonRule());
	        }
       		set(
       			$current, 
       			"rightExp",
        		lv_rightExp_3_0, 
        		"Binary");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleBinary
entryRuleBinary returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getBinaryRule()); }
	 iv_ruleBinary=ruleBinary 
	 { $current=$iv_ruleBinary.current; } 
	 EOF 
;

// Rule Binary
ruleBinary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getBinaryAccess().getPrimaryParserRuleCall_0()); 
    }
    this_Primary_0=rulePrimary
    {
        $current = $this_Primary_0.current;
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getBinaryAccess().getBinaryLeftExpAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBinaryAccess().getRightExpPrimaryParserRuleCall_1_1_0()); 
	    }
		lv_rightExp_2_0=rulePrimary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBinaryRule());
	        }
       		set(
       			$current, 
       			"rightExp",
        		lv_rightExp_2_0, 
        		"Primary");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	 iv_rulePrimary=rulePrimary 
	 { $current=$iv_rulePrimary.current; } 
	 EOF 
;

// Rule Primary
rulePrimary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimaryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getPrimaryAccess().getConstrainFeaturesSolitaryCrossReference_0_0_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)
	otherlv_1=FullStop
    {
    	newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getFullStopKeyword_0_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimaryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getPrimaryAccess().getGroupsGroupCrossReference_0_2_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)
	otherlv_3=FullStop
    {
    	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getFullStopKeyword_0_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimaryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getPrimaryAccess().getConstrainFeaturesFeatureCrossReference_0_4_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
    |
    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_1()); 
    }
    this_Unary_5=ruleUnary
    {
        $current = $this_Unary_5.current;
        afterParserOrEnumRuleCall();
    }

    |(
	otherlv_6=LeftParenthesis
    {
    	newLeafNode(otherlv_6, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
    }

    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getConstrainParserRuleCall_2_1()); 
    }
    this_Constrain_7=ruleConstrain
    {
        $current = $this_Constrain_7.current;
        afterParserOrEnumRuleCall();
    }

	otherlv_8=RightParenthesis
    {
    	newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
    }
))
;





// Entry rule entryRuleUnary
entryRuleUnary returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getUnaryRule()); }
	 iv_ruleUnary=ruleUnary 
	 { $current=$iv_ruleUnary.current; } 
	 EOF 
;

// Rule Unary
ruleUnary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getUnaryAccess().getUnaryAction_0(),
            $current);
    }
)(
(
(
		lv_Operator_1_1=
	ExclamationMark
    {
        newLeafNode(lv_Operator_1_1, grammarAccess.getUnaryAccess().getOperatorExclamationMarkKeyword_1_0_0());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUnaryRule());
	        }
       		setWithLastConsumed($current, "Operator", lv_Operator_1_1, null);
	    }

    |		lv_Operator_1_2=
	HyphenMinus
    {
        newLeafNode(lv_Operator_1_2, grammarAccess.getUnaryAccess().getOperatorHyphenMinusKeyword_1_0_1());
    }

	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUnaryRule());
	        }
       		setWithLastConsumed($current, "Operator", lv_Operator_1_2, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getUnaryAccess().getExpPrimaryParserRuleCall_2_0()); 
	    }
		lv_exp_2_0=rulePrimary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUnaryRule());
	        }
       		set(
       			$current, 
       			"exp",
        		lv_exp_2_0, 
        		"Primary");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleGroup
entryRuleGroup returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getGroupRule()); }
	 iv_ruleGroup=ruleGroup 
	 { $current=$iv_ruleGroup.current; } 
	 EOF 
;

// Rule Group
ruleGroup returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 
    }
    this_Or_0=ruleOr
    {
        $current = $this_Or_0.current;
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getGroupAccess().getXorParserRuleCall_1()); 
    }
    this_Xor_1=ruleXor
    {
        $current = $this_Xor_1.current;
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleRange
entryRuleRange returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getRangeRule()); }
	 iv_ruleRange=ruleRange 
	 { $current=$iv_ruleRange.current; } 
	 EOF 
;

// Rule Range
ruleRange returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getRangeAccess().getNameEStringParserRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRangeRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)this_INT_1=RULE_INT
    { 
    newLeafNode(this_INT_1, grammarAccess.getRangeAccess().getINTTerminalRuleCall_1()); 
    }

	otherlv_2=FullStopFullStop
    {
    	newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getFullStopFullStopKeyword_2());
    }
this_INT_3=RULE_INT
    { 
    newLeafNode(this_INT_3, grammarAccess.getRangeAccess().getINTTerminalRuleCall_3()); 
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }

    |    this_INT_2=RULE_INT    {
		$current.merge(this_INT_2);
    }

    { 
    newLeafNode(this_INT_2, grammarAccess.getEStringAccess().getINTTerminalRuleCall_2()); 
    }

    |    this_NULL_3=RULE_NULL    {
		$current.merge(this_NULL_3);
    }

    { 
    newLeafNode(this_NULL_3, grammarAccess.getEStringAccess().getNULLTerminalRuleCall_3()); 
    }
)
    ;





// Entry rule entryRuleFeature_Impl
entryRuleFeature_Impl returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getFeature_ImplRule()); }
	 iv_ruleFeature_Impl=ruleFeature_Impl 
	 { $current=$iv_ruleFeature_Impl.current; } 
	 EOF 
;

// Rule Feature_Impl
ruleFeature_Impl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	otherlv_0=Feature
    {
    	newLeafNode(otherlv_0, grammarAccess.getFeature_ImplAccess().getFeatureKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_BEGIN_2=RULE_BEGIN
    { 
    newLeafNode(this_BEGIN_2, grammarAccess.getFeature_ImplAccess().getBEGINTerminalRuleCall_2_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
	    }
		lv_subfeature_3_0=ruleSolitary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
	        }
       		add(
       			$current, 
       			"subfeature",
        		lv_subfeature_3_0, 
        		"Solitary");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_2_0()); 
	    }
		lv_subfeature_4_0=ruleSolitary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
	        }
       		add(
       			$current, 
       			"subfeature",
        		lv_subfeature_4_0, 
        		"Solitary");
	        afterParserOrEnumRuleCall();
	    }

)
)*this_END_5=RULE_END
    { 
    newLeafNode(this_END_5, grammarAccess.getFeature_ImplAccess().getENDTerminalRuleCall_2_3()); 
    }
)?(
	otherlv_6=LeftSquareBracket
    {
    	newLeafNode(otherlv_6, grammarAccess.getFeature_ImplAccess().getLeftSquareBracketKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
	    }
		lv_constrains_7_0=ruleConstrain		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
	        }
       		add(
       			$current, 
       			"constrains",
        		lv_constrains_7_0, 
        		"Constrain");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_8=Comma
    {
    	newLeafNode(otherlv_8, grammarAccess.getFeature_ImplAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
	    }
		lv_constrains_9_0=ruleConstrain		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
	        }
       		add(
       			$current, 
       			"constrains",
        		lv_constrains_9_0, 
        		"Constrain");
	        afterParserOrEnumRuleCall();
	    }

)
))*
	otherlv_10=RightSquareBracket
    {
    	newLeafNode(otherlv_10, grammarAccess.getFeature_ImplAccess().getRightSquareBracketKeyword_3_3());
    }
)?)
;





// Entry rule entryRuleGrouped
entryRuleGrouped returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getGroupedRule()); }
	 iv_ruleGrouped=ruleGrouped 
	 { $current=$iv_ruleGrouped.current; } 
	 EOF 
;

// Rule Grouped
ruleGrouped returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getGroupedAccess().getNameEStringParserRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupedRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupedAccess().getRangeRangeParserRuleCall_1_0()); 
	    }
		lv_range_1_0=ruleRange		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupedRule());
	        }
       		set(
       			$current, 
       			"range",
        		lv_range_1_0, 
        		"Range");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
	otherlv_2=LeftSquareBracket
    {
    	newLeafNode(otherlv_2, grammarAccess.getGroupedAccess().getLeftSquareBracketKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
	    }
		lv_constrains_3_0=ruleConstrain		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupedRule());
	        }
       		add(
       			$current, 
       			"constrains",
        		lv_constrains_3_0, 
        		"Constrain");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_4=Comma
    {
    	newLeafNode(otherlv_4, grammarAccess.getGroupedAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
	    }
		lv_constrains_5_0=ruleConstrain		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupedRule());
	        }
       		add(
       			$current, 
       			"constrains",
        		lv_constrains_5_0, 
        		"Constrain");
	        afterParserOrEnumRuleCall();
	    }

)
))*
	otherlv_6=RightSquareBracket
    {
    	newLeafNode(otherlv_6, grammarAccess.getGroupedAccess().getRightSquareBracketKeyword_2_3());
    }
)?)
;





// Entry rule entryRuleMandatory
entryRuleMandatory returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getMandatoryRule()); }
	 iv_ruleMandatory=ruleMandatory 
	 { $current=$iv_ruleMandatory.current; } 
	 EOF 
;

// Rule Mandatory
ruleMandatory returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMandatoryAccess().getNameEStringParserRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMandatoryRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_1=LeftCurlyBracket
    {
    	newLeafNode(otherlv_1, grammarAccess.getMandatoryAccess().getLeftCurlyBracketKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_1_0()); 
	    }
		lv_subfeature_2_0=ruleSolitary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMandatoryRule());
	        }
       		add(
       			$current, 
       			"subfeature",
        		lv_subfeature_2_0, 
        		"Solitary");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_3=Comma
    {
    	newLeafNode(otherlv_3, grammarAccess.getMandatoryAccess().getCommaKeyword_1_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_2_1_0()); 
	    }
		lv_subfeature_4_0=ruleSolitary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMandatoryRule());
	        }
       		add(
       			$current, 
       			"subfeature",
        		lv_subfeature_4_0, 
        		"Solitary");
	        afterParserOrEnumRuleCall();
	    }

)
))*
	otherlv_5=RightCurlyBracket
    {
    	newLeafNode(otherlv_5, grammarAccess.getMandatoryAccess().getRightCurlyBracketKeyword_1_3());
    }
)?(
	otherlv_6=LeftSquareBracket
    {
    	newLeafNode(otherlv_6, grammarAccess.getMandatoryAccess().getLeftSquareBracketKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
	    }
		lv_constrains_7_0=ruleConstrain		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMandatoryRule());
	        }
       		add(
       			$current, 
       			"constrains",
        		lv_constrains_7_0, 
        		"Constrain");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_8=Comma
    {
    	newLeafNode(otherlv_8, grammarAccess.getMandatoryAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
	    }
		lv_constrains_9_0=ruleConstrain		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMandatoryRule());
	        }
       		add(
       			$current, 
       			"constrains",
        		lv_constrains_9_0, 
        		"Constrain");
	        afterParserOrEnumRuleCall();
	    }

)
))*
	otherlv_10=RightSquareBracket
    {
    	newLeafNode(otherlv_10, grammarAccess.getMandatoryAccess().getRightSquareBracketKeyword_2_3());
    }
)?((
(
		{ 
	        newCompositeNode(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_0_0()); 
	    }
		lv_groups_11_0=ruleGroup		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMandatoryRule());
	        }
       		add(
       			$current, 
       			"groups",
        		lv_groups_11_0, 
        		"Group");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_1_0()); 
	    }
		lv_groups_12_0=ruleGroup		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMandatoryRule());
	        }
       		add(
       			$current, 
       			"groups",
        		lv_groups_12_0, 
        		"Group");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?)
;





// Entry rule entryRuleOptional
entryRuleOptional returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getOptionalRule()); }
	 iv_ruleOptional=ruleOptional 
	 { $current=$iv_ruleOptional.current; } 
	 EOF 
;

// Rule Optional
ruleOptional returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	otherlv_0=QuestionMark
    {
    	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_2=LeftCurlyBracket
    {
    	newLeafNode(otherlv_2, grammarAccess.getOptionalAccess().getLeftCurlyBracketKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
	    }
		lv_subfeature_3_0=ruleSolitary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalRule());
	        }
       		add(
       			$current, 
       			"subfeature",
        		lv_subfeature_3_0, 
        		"Solitary");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_4=Comma
    {
    	newLeafNode(otherlv_4, grammarAccess.getOptionalAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_2_1_0()); 
	    }
		lv_subfeature_5_0=ruleSolitary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalRule());
	        }
       		add(
       			$current, 
       			"subfeature",
        		lv_subfeature_5_0, 
        		"Solitary");
	        afterParserOrEnumRuleCall();
	    }

)
))*
	otherlv_6=RightCurlyBracket
    {
    	newLeafNode(otherlv_6, grammarAccess.getOptionalAccess().getRightCurlyBracketKeyword_2_3());
    }
)?(
	otherlv_7=LeftSquareBracket
    {
    	newLeafNode(otherlv_7, grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
	    }
		lv_constrains_8_0=ruleConstrain		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalRule());
	        }
       		add(
       			$current, 
       			"constrains",
        		lv_constrains_8_0, 
        		"Constrain");
	        afterParserOrEnumRuleCall();
	    }

)
)(
	otherlv_9=Comma
    {
    	newLeafNode(otherlv_9, grammarAccess.getOptionalAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
	    }
		lv_constrains_10_0=ruleConstrain		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalRule());
	        }
       		add(
       			$current, 
       			"constrains",
        		lv_constrains_10_0, 
        		"Constrain");
	        afterParserOrEnumRuleCall();
	    }

)
))*
	otherlv_11=RightSquareBracket
    {
    	newLeafNode(otherlv_11, grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_3_3());
    }
)?((
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_0_0()); 
	    }
		lv_groups_12_0=ruleGroup		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalRule());
	        }
       		add(
       			$current, 
       			"groups",
        		lv_groups_12_0, 
        		"Group");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_1_0()); 
	    }
		lv_groups_13_0=ruleGroup		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalRule());
	        }
       		add(
       			$current, 
       			"groups",
        		lv_groups_13_0, 
        		"Group");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?)
;





// Entry rule entryRuleOr
entryRuleOr returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getOrRule()); }
	 iv_ruleOr=ruleOr 
	 { $current=$iv_ruleOr.current; } 
	 EOF 
;

// Rule Or
ruleOr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	otherlv_0=Or
    {
    	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOrAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_BEGIN_2=RULE_BEGIN
    { 
    newLeafNode(this_BEGIN_2, grammarAccess.getOrAccess().getBEGINTerminalRuleCall_2_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
	    }
		lv_grouped_3_0=ruleGrouped		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrRule());
	        }
       		add(
       			$current, 
       			"grouped",
        		lv_grouped_3_0, 
        		"Grouped");
	        afterParserOrEnumRuleCall();
	    }

)
)((
	otherlv_4=Comma
    {
    	newLeafNode(otherlv_4, grammarAccess.getOrAccess().getCommaKeyword_2_2_0());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
	    }
		lv_grouped_5_0=ruleGrouped		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrRule());
	        }
       		add(
       			$current, 
       			"grouped",
        		lv_grouped_5_0, 
        		"Grouped");
	        afterParserOrEnumRuleCall();
	    }

)
))*this_END_6=RULE_END
    { 
    newLeafNode(this_END_6, grammarAccess.getOrAccess().getENDTerminalRuleCall_2_3()); 
    }
)?)
;





// Entry rule entryRuleXor
entryRuleXor returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getXorRule()); }
	 iv_ruleXor=ruleXor 
	 { $current=$iv_ruleXor.current; } 
	 EOF 
;

// Rule Xor
ruleXor returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	otherlv_0=Xor
    {
    	newLeafNode(otherlv_0, grammarAccess.getXorAccess().getXorKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getXorAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXorRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_BEGIN_2=RULE_BEGIN
    { 
    newLeafNode(this_BEGIN_2, grammarAccess.getXorAccess().getBEGINTerminalRuleCall_2_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
	    }
		lv_grouped_3_0=ruleGrouped		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXorRule());
	        }
       		add(
       			$current, 
       			"grouped",
        		lv_grouped_3_0, 
        		"Grouped");
	        afterParserOrEnumRuleCall();
	    }

)
)((
	otherlv_4=Comma
    {
    	newLeafNode(otherlv_4, grammarAccess.getXorAccess().getCommaKeyword_2_2_0());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
	    }
		lv_grouped_5_0=ruleGrouped		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXorRule());
	        }
       		add(
       			$current, 
       			"grouped",
        		lv_grouped_5_0, 
        		"Grouped");
	        afterParserOrEnumRuleCall();
	    }

)
))*this_END_6=RULE_END
    { 
    newLeafNode(this_END_6, grammarAccess.getXorAccess().getENDTerminalRuleCall_2_3()); 
    }
)?)
;





