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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Feature", "Xor", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "FullStopFullStop", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "Or", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Comma", "HyphenMinus", "FullStop", "LessThanSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_NULL", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=29;
    public static final int Or=12;
    public static final int RULE_BEGIN=28;
    public static final int VerticalLineVerticalLine=13;
    public static final int RULE_STRING=32;
    public static final int RULE_NULL=27;
    public static final int Feature=4;
    public static final int LessThanSign=20;
    public static final int RULE_SL_COMMENT=34;
    public static final int Comma=17;
    public static final int HyphenMinus=18;
    public static final int LeftParenthesis=15;
    public static final int AmpersandAmpersand=7;
    public static final int FullStopFullStop=8;
    public static final int LessThanSignEqualsSign=9;
    public static final int RightCurlyBracket=26;
    public static final int EOF=-1;
    public static final int RightSquareBracket=24;
    public static final int ExclamationMark=14;
    public static final int FullStop=19;
    public static final int GreaterThanSign=21;
    public static final int RULE_ID=30;
    public static final int RULE_WS=35;
    public static final int RightParenthesis=16;
    public static final int LeftCurlyBracket=25;
    public static final int RULE_ANY_OTHER=36;
    public static final int GreaterThanSignEqualsSign=11;
    public static final int EqualsSignEqualsSign=10;
    public static final int QuestionMark=22;
    public static final int RULE_INT=31;
    public static final int RULE_ML_COMMENT=33;
    public static final int Xor=5;
    public static final int LeftSquareBracket=23;
    public static final int ExclamationMarkEqualsSign=6;

    // delegates
    // delegators


        public InternalConfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g"; }




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



    // $ANTLR start "entryRuleModel"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:61:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:62:2: (iv_ruleModel= ruleModel EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:63:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel77); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:70:1: ruleModel returns [EObject current=null] : ( (lv_root_0_0= ruleFeature_Impl ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_root_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:73:28: ( ( (lv_root_0_0= ruleFeature_Impl ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:74:1: ( (lv_root_0_0= ruleFeature_Impl ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:74:1: ( (lv_root_0_0= ruleFeature_Impl ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:75:1: (lv_root_0_0= ruleFeature_Impl )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:75:1: (lv_root_0_0= ruleFeature_Impl )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:76:3: lv_root_0_0= ruleFeature_Impl
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getRootFeature_ImplParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleFeature_Impl_in_ruleModel122);
            lv_root_0_0=ruleFeature_Impl();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"root",
                    		lv_root_0_0, 
                    		"Feature_Impl");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSolitary"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:102:1: entryRuleSolitary returns [EObject current=null] : iv_ruleSolitary= ruleSolitary EOF ;
    public final EObject entryRuleSolitary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolitary = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:103:2: (iv_ruleSolitary= ruleSolitary EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:104:2: iv_ruleSolitary= ruleSolitary EOF
            {
             newCompositeNode(grammarAccess.getSolitaryRule()); 
            pushFollow(FOLLOW_ruleSolitary_in_entryRuleSolitary158);
            iv_ruleSolitary=ruleSolitary();

            state._fsp--;

             current =iv_ruleSolitary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolitary168); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSolitary"


    // $ANTLR start "ruleSolitary"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:111:1: ruleSolitary returns [EObject current=null] : (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional ) ;
    public final EObject ruleSolitary() throws RecognitionException {
        EObject current = null;

        EObject this_Mandatory_0 = null;

        EObject this_Optional_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:114:28: ( (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:115:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:115:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_NULL||(LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
                alt1=1;
            }
            else if ( (LA1_0==QuestionMark) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:116:5: this_Mandatory_0= ruleMandatory
                    {
                     
                            newCompositeNode(grammarAccess.getSolitaryAccess().getMandatoryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMandatory_in_ruleSolitary215);
                    this_Mandatory_0=ruleMandatory();

                    state._fsp--;


                            current = this_Mandatory_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:126:5: this_Optional_1= ruleOptional
                    {
                     
                            newCompositeNode(grammarAccess.getSolitaryAccess().getOptionalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOptional_in_ruleSolitary242);
                    this_Optional_1=ruleOptional();

                    state._fsp--;


                            current = this_Optional_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSolitary"


    // $ANTLR start "entryRuleConstrain"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:142:1: entryRuleConstrain returns [EObject current=null] : iv_ruleConstrain= ruleConstrain EOF ;
    public final EObject entryRuleConstrain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrain = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:143:2: (iv_ruleConstrain= ruleConstrain EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:144:2: iv_ruleConstrain= ruleConstrain EOF
            {
             newCompositeNode(grammarAccess.getConstrainRule()); 
            pushFollow(FOLLOW_ruleConstrain_in_entryRuleConstrain276);
            iv_ruleConstrain=ruleConstrain();

            state._fsp--;

             current =iv_ruleConstrain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstrain286); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstrain"


    // $ANTLR start "ruleConstrain"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:151:1: ruleConstrain returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= VerticalLineVerticalLine ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleConstrain() throws RecognitionException {
        EObject current = null;

        Token lv_Operator_2_0=null;
        EObject this_Conjunction_0 = null;

        EObject lv_rightExp_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:154:28: ( (this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= VerticalLineVerticalLine ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:155:1: (this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= VerticalLineVerticalLine ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:155:1: (this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= VerticalLineVerticalLine ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:156:5: this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= VerticalLineVerticalLine ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getConstrainAccess().getConjunctionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConjunction_in_ruleConstrain333);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;


                    current = this_Conjunction_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:164:1: ( () ( (lv_Operator_2_0= VerticalLineVerticalLine ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==VerticalLineVerticalLine) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:164:2: () ( (lv_Operator_2_0= VerticalLineVerticalLine ) ) ( (lv_rightExp_3_0= ruleConjunction ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:164:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:165:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConstrainAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:170:2: ( (lv_Operator_2_0= VerticalLineVerticalLine ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:171:1: (lv_Operator_2_0= VerticalLineVerticalLine )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:171:1: (lv_Operator_2_0= VerticalLineVerticalLine )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:172:3: lv_Operator_2_0= VerticalLineVerticalLine
            	    {
            	    lv_Operator_2_0=(Token)match(input,VerticalLineVerticalLine,FOLLOW_VerticalLineVerticalLine_in_ruleConstrain361); 

            	            newLeafNode(lv_Operator_2_0, grammarAccess.getConstrainAccess().getOperatorVerticalLineVerticalLineKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConstrainRule());
            	    	        }
            	           		setWithLastConsumed(current, "Operator", lv_Operator_2_0, "||");
            	    	    

            	    }


            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:186:2: ( (lv_rightExp_3_0= ruleConjunction ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:187:1: (lv_rightExp_3_0= ruleConjunction )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:187:1: (lv_rightExp_3_0= ruleConjunction )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:188:3: lv_rightExp_3_0= ruleConjunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstrainAccess().getRightExpConjunctionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleConstrain393);
            	    lv_rightExp_3_0=ruleConjunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstrainRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExp",
            	            		lv_rightExp_3_0, 
            	            		"Conjunction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstrain"


    // $ANTLR start "entryRuleConjunction"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:212:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:213:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:214:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction430);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction440); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:221:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= AmpersandAmpersand ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token lv_Operator_2_0=null;
        EObject this_Comparison_0 = null;

        EObject lv_rightExp_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:224:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= AmpersandAmpersand ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:225:1: (this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= AmpersandAmpersand ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:225:1: (this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= AmpersandAmpersand ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:226:5: this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= AmpersandAmpersand ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction487);
            this_Comparison_0=ruleComparison();

            state._fsp--;


                    current = this_Comparison_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:234:1: ( () ( (lv_Operator_2_0= AmpersandAmpersand ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AmpersandAmpersand) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:234:2: () ( (lv_Operator_2_0= AmpersandAmpersand ) ) ( (lv_rightExp_3_0= ruleComparison ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:234:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:235:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConjunctionAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:240:2: ( (lv_Operator_2_0= AmpersandAmpersand ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:241:1: (lv_Operator_2_0= AmpersandAmpersand )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:241:1: (lv_Operator_2_0= AmpersandAmpersand )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:242:3: lv_Operator_2_0= AmpersandAmpersand
            	    {
            	    lv_Operator_2_0=(Token)match(input,AmpersandAmpersand,FOLLOW_AmpersandAmpersand_in_ruleConjunction515); 

            	            newLeafNode(lv_Operator_2_0, grammarAccess.getConjunctionAccess().getOperatorAmpersandAmpersandKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConjunctionRule());
            	    	        }
            	           		setWithLastConsumed(current, "Operator", lv_Operator_2_0, "&&");
            	    	    

            	    }


            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:256:2: ( (lv_rightExp_3_0= ruleComparison ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:257:1: (lv_rightExp_3_0= ruleComparison )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:257:1: (lv_rightExp_3_0= ruleComparison )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:258:3: lv_rightExp_3_0= ruleComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightExpComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction547);
            	    lv_rightExp_3_0=ruleComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExp",
            	            		lv_rightExp_3_0, 
            	            		"Comparison");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleComparison"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:282:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:283:2: (iv_ruleComparison= ruleComparison EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:284:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison584);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison594); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:291:1: ruleComparison returns [EObject current=null] : (this_Binary_0= ruleBinary ( () ( ( (lv_Operator_2_1= EqualsSignEqualsSign | lv_Operator_2_2= ExclamationMarkEqualsSign | lv_Operator_2_3= LessThanSignEqualsSign | lv_Operator_2_4= LessThanSign | lv_Operator_2_5= GreaterThanSignEqualsSign | lv_Operator_2_6= GreaterThanSign ) ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_Operator_2_1=null;
        Token lv_Operator_2_2=null;
        Token lv_Operator_2_3=null;
        Token lv_Operator_2_4=null;
        Token lv_Operator_2_5=null;
        Token lv_Operator_2_6=null;
        EObject this_Binary_0 = null;

        EObject lv_rightExp_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:294:28: ( (this_Binary_0= ruleBinary ( () ( ( (lv_Operator_2_1= EqualsSignEqualsSign | lv_Operator_2_2= ExclamationMarkEqualsSign | lv_Operator_2_3= LessThanSignEqualsSign | lv_Operator_2_4= LessThanSign | lv_Operator_2_5= GreaterThanSignEqualsSign | lv_Operator_2_6= GreaterThanSign ) ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:295:1: (this_Binary_0= ruleBinary ( () ( ( (lv_Operator_2_1= EqualsSignEqualsSign | lv_Operator_2_2= ExclamationMarkEqualsSign | lv_Operator_2_3= LessThanSignEqualsSign | lv_Operator_2_4= LessThanSign | lv_Operator_2_5= GreaterThanSignEqualsSign | lv_Operator_2_6= GreaterThanSign ) ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:295:1: (this_Binary_0= ruleBinary ( () ( ( (lv_Operator_2_1= EqualsSignEqualsSign | lv_Operator_2_2= ExclamationMarkEqualsSign | lv_Operator_2_3= LessThanSignEqualsSign | lv_Operator_2_4= LessThanSign | lv_Operator_2_5= GreaterThanSignEqualsSign | lv_Operator_2_6= GreaterThanSign ) ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:296:5: this_Binary_0= ruleBinary ( () ( ( (lv_Operator_2_1= EqualsSignEqualsSign | lv_Operator_2_2= ExclamationMarkEqualsSign | lv_Operator_2_3= LessThanSignEqualsSign | lv_Operator_2_4= LessThanSign | lv_Operator_2_5= GreaterThanSignEqualsSign | lv_Operator_2_6= GreaterThanSign ) ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonAccess().getBinaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBinary_in_ruleComparison641);
            this_Binary_0=ruleBinary();

            state._fsp--;


                    current = this_Binary_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:304:1: ( () ( ( (lv_Operator_2_1= EqualsSignEqualsSign | lv_Operator_2_2= ExclamationMarkEqualsSign | lv_Operator_2_3= LessThanSignEqualsSign | lv_Operator_2_4= LessThanSign | lv_Operator_2_5= GreaterThanSignEqualsSign | lv_Operator_2_6= GreaterThanSign ) ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ExclamationMarkEqualsSign||(LA5_0>=LessThanSignEqualsSign && LA5_0<=GreaterThanSignEqualsSign)||(LA5_0>=LessThanSign && LA5_0<=GreaterThanSign)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:304:2: () ( ( (lv_Operator_2_1= EqualsSignEqualsSign | lv_Operator_2_2= ExclamationMarkEqualsSign | lv_Operator_2_3= LessThanSignEqualsSign | lv_Operator_2_4= LessThanSign | lv_Operator_2_5= GreaterThanSignEqualsSign | lv_Operator_2_6= GreaterThanSign ) ) ) ( (lv_rightExp_3_0= ruleBinary ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:304:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:305:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparisonAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:310:2: ( ( (lv_Operator_2_1= EqualsSignEqualsSign | lv_Operator_2_2= ExclamationMarkEqualsSign | lv_Operator_2_3= LessThanSignEqualsSign | lv_Operator_2_4= LessThanSign | lv_Operator_2_5= GreaterThanSignEqualsSign | lv_Operator_2_6= GreaterThanSign ) ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:311:1: ( (lv_Operator_2_1= EqualsSignEqualsSign | lv_Operator_2_2= ExclamationMarkEqualsSign | lv_Operator_2_3= LessThanSignEqualsSign | lv_Operator_2_4= LessThanSign | lv_Operator_2_5= GreaterThanSignEqualsSign | lv_Operator_2_6= GreaterThanSign ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:311:1: ( (lv_Operator_2_1= EqualsSignEqualsSign | lv_Operator_2_2= ExclamationMarkEqualsSign | lv_Operator_2_3= LessThanSignEqualsSign | lv_Operator_2_4= LessThanSign | lv_Operator_2_5= GreaterThanSignEqualsSign | lv_Operator_2_6= GreaterThanSign ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:312:1: (lv_Operator_2_1= EqualsSignEqualsSign | lv_Operator_2_2= ExclamationMarkEqualsSign | lv_Operator_2_3= LessThanSignEqualsSign | lv_Operator_2_4= LessThanSign | lv_Operator_2_5= GreaterThanSignEqualsSign | lv_Operator_2_6= GreaterThanSign )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:312:1: (lv_Operator_2_1= EqualsSignEqualsSign | lv_Operator_2_2= ExclamationMarkEqualsSign | lv_Operator_2_3= LessThanSignEqualsSign | lv_Operator_2_4= LessThanSign | lv_Operator_2_5= GreaterThanSignEqualsSign | lv_Operator_2_6= GreaterThanSign )
            	    int alt4=6;
            	    switch ( input.LA(1) ) {
            	    case EqualsSignEqualsSign:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case ExclamationMarkEqualsSign:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    case LessThanSign:
            	        {
            	        alt4=4;
            	        }
            	        break;
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt4=5;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt4=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt4) {
            	        case 1 :
            	            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:313:3: lv_Operator_2_1= EqualsSignEqualsSign
            	            {
            	            lv_Operator_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_EqualsSignEqualsSign_in_ruleComparison671); 

            	                    newLeafNode(lv_Operator_2_1, grammarAccess.getComparisonAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "Operator", lv_Operator_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:326:8: lv_Operator_2_2= ExclamationMarkEqualsSign
            	            {
            	            lv_Operator_2_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_ExclamationMarkEqualsSign_in_ruleComparison699); 

            	                    newLeafNode(lv_Operator_2_2, grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "Operator", lv_Operator_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:339:8: lv_Operator_2_3= LessThanSignEqualsSign
            	            {
            	            lv_Operator_2_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_LessThanSignEqualsSign_in_ruleComparison727); 

            	                    newLeafNode(lv_Operator_2_3, grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "Operator", lv_Operator_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:352:8: lv_Operator_2_4= LessThanSign
            	            {
            	            lv_Operator_2_4=(Token)match(input,LessThanSign,FOLLOW_LessThanSign_in_ruleComparison755); 

            	                    newLeafNode(lv_Operator_2_4, grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "Operator", lv_Operator_2_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:365:8: lv_Operator_2_5= GreaterThanSignEqualsSign
            	            {
            	            lv_Operator_2_5=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_GreaterThanSignEqualsSign_in_ruleComparison783); 

            	                    newLeafNode(lv_Operator_2_5, grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "Operator", lv_Operator_2_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:378:8: lv_Operator_2_6= GreaterThanSign
            	            {
            	            lv_Operator_2_6=(Token)match(input,GreaterThanSign,FOLLOW_GreaterThanSign_in_ruleComparison811); 

            	                    newLeafNode(lv_Operator_2_6, grammarAccess.getComparisonAccess().getOperatorGreaterThanSignKeyword_1_1_0_5());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "Operator", lv_Operator_2_6, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:394:2: ( (lv_rightExp_3_0= ruleBinary ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:395:1: (lv_rightExp_3_0= ruleBinary )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:395:1: (lv_rightExp_3_0= ruleBinary )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:396:3: lv_rightExp_3_0= ruleBinary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getRightExpBinaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBinary_in_ruleComparison846);
            	    lv_rightExp_3_0=ruleBinary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExp",
            	            		lv_rightExp_3_0, 
            	            		"Binary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleBinary"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:420:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:421:2: (iv_ruleBinary= ruleBinary EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:422:2: iv_ruleBinary= ruleBinary EOF
            {
             newCompositeNode(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_ruleBinary_in_entryRuleBinary883);
            iv_ruleBinary=ruleBinary();

            state._fsp--;

             current =iv_ruleBinary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinary893); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:429:1: ruleBinary returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )* ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject lv_rightExp_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:432:28: ( (this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:433:1: (this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:433:1: (this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:434:5: this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinaryAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleBinary940);
            this_Primary_0=rulePrimary();

            state._fsp--;


                    current = this_Primary_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:442:1: ( () ( (lv_rightExp_2_0= rulePrimary ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=ExclamationMark && LA6_0<=LeftParenthesis)||LA6_0==HyphenMinus||LA6_0==RULE_NULL||(LA6_0>=RULE_ID && LA6_0<=RULE_STRING)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:442:2: () ( (lv_rightExp_2_0= rulePrimary ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:442:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:443:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:448:2: ( (lv_rightExp_2_0= rulePrimary ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:449:1: (lv_rightExp_2_0= rulePrimary )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:449:1: (lv_rightExp_2_0= rulePrimary )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:450:3: lv_rightExp_2_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryAccess().getRightExpPrimaryParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleBinary970);
            	    lv_rightExp_2_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExp",
            	            		lv_rightExp_2_0, 
            	            		"Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinary"


    // $ANTLR start "entryRulePrimary"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:474:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:475:2: (iv_rulePrimary= rulePrimary EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:476:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1007);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1017); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:483:1: rulePrimary returns [EObject current=null] : ( ( ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) otherlv_3= FullStop ( ( ruleEString ) ) ) | this_Unary_5= ruleUnary | (otherlv_6= LeftParenthesis this_Constrain_7= ruleConstrain otherlv_8= RightParenthesis ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_Unary_5 = null;

        EObject this_Constrain_7 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:486:28: ( ( ( ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) otherlv_3= FullStop ( ( ruleEString ) ) ) | this_Unary_5= ruleUnary | (otherlv_6= LeftParenthesis this_Constrain_7= ruleConstrain otherlv_8= RightParenthesis ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:487:1: ( ( ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) otherlv_3= FullStop ( ( ruleEString ) ) ) | this_Unary_5= ruleUnary | (otherlv_6= LeftParenthesis this_Constrain_7= ruleConstrain otherlv_8= RightParenthesis ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:487:1: ( ( ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) otherlv_3= FullStop ( ( ruleEString ) ) ) | this_Unary_5= ruleUnary | (otherlv_6= LeftParenthesis this_Constrain_7= ruleConstrain otherlv_8= RightParenthesis ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_NULL:
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case ExclamationMark:
            case HyphenMinus:
                {
                alt7=2;
                }
                break;
            case LeftParenthesis:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:487:2: ( ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) otherlv_3= FullStop ( ( ruleEString ) ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:487:2: ( ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) otherlv_3= FullStop ( ( ruleEString ) ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:487:3: ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) otherlv_3= FullStop ( ( ruleEString ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:487:3: ( ( ruleEString ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:488:1: ( ruleEString )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:488:1: ( ruleEString )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:489:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getConstrainFeaturesSolitaryCrossReference_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_rulePrimary1066);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,FullStop,FOLLOW_FullStop_in_rulePrimary1079); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getFullStopKeyword_0_1());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:507:1: ( ( ruleEString ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:508:1: ( ruleEString )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:508:1: ( ruleEString )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:509:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getGroupsGroupCrossReference_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_rulePrimary1101);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,FullStop,FOLLOW_FullStop_in_rulePrimary1114); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getFullStopKeyword_0_3());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:527:1: ( ( ruleEString ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:528:1: ( ruleEString )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:528:1: ( ruleEString )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:529:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getConstrainFeaturesFeatureCrossReference_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_rulePrimary1136);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:544:5: this_Unary_5= ruleUnary
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnary_in_rulePrimary1165);
                    this_Unary_5=ruleUnary();

                    state._fsp--;


                            current = this_Unary_5;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:553:6: (otherlv_6= LeftParenthesis this_Constrain_7= ruleConstrain otherlv_8= RightParenthesis )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:553:6: (otherlv_6= LeftParenthesis this_Constrain_7= ruleConstrain otherlv_8= RightParenthesis )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:554:2: otherlv_6= LeftParenthesis this_Constrain_7= ruleConstrain otherlv_8= RightParenthesis
                    {
                    otherlv_6=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulePrimary1184); 

                        	newLeafNode(otherlv_6, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getConstrainParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleConstrain_in_rulePrimary1205);
                    this_Constrain_7=ruleConstrain();

                    state._fsp--;


                            current = this_Constrain_7;
                            afterParserOrEnumRuleCall();
                        
                    otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulePrimary1217); 

                        	newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleUnary"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:580:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:581:2: (iv_ruleUnary= ruleUnary EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:582:2: iv_ruleUnary= ruleUnary EOF
            {
             newCompositeNode(grammarAccess.getUnaryRule()); 
            pushFollow(FOLLOW_ruleUnary_in_entryRuleUnary1252);
            iv_ruleUnary=ruleUnary();

            state._fsp--;

             current =iv_ruleUnary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary1262); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnary"


    // $ANTLR start "ruleUnary"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:589:1: ruleUnary returns [EObject current=null] : ( () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) ) ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Token lv_Operator_1_1=null;
        Token lv_Operator_1_2=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:592:28: ( ( () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:593:1: ( () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:593:1: ( () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:593:2: () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:593:2: ()
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:594:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnaryAccess().getUnaryAction_0(),
                        current);
                

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:599:2: ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:600:1: ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:600:1: ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:601:1: (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:601:1: (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ExclamationMark) ) {
                alt8=1;
            }
            else if ( (LA8_0==HyphenMinus) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:602:3: lv_Operator_1_1= ExclamationMark
                    {
                    lv_Operator_1_1=(Token)match(input,ExclamationMark,FOLLOW_ExclamationMark_in_ruleUnary1317); 

                            newLeafNode(lv_Operator_1_1, grammarAccess.getUnaryAccess().getOperatorExclamationMarkKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnaryRule());
                    	        }
                           		setWithLastConsumed(current, "Operator", lv_Operator_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:615:8: lv_Operator_1_2= HyphenMinus
                    {
                    lv_Operator_1_2=(Token)match(input,HyphenMinus,FOLLOW_HyphenMinus_in_ruleUnary1345); 

                            newLeafNode(lv_Operator_1_2, grammarAccess.getUnaryAccess().getOperatorHyphenMinusKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnaryRule());
                    	        }
                           		setWithLastConsumed(current, "Operator", lv_Operator_1_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:631:2: ( (lv_exp_2_0= rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:632:1: (lv_exp_2_0= rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:632:1: (lv_exp_2_0= rulePrimary )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:633:3: lv_exp_2_0= rulePrimary
            {
             
            	        newCompositeNode(grammarAccess.getUnaryAccess().getExpPrimaryParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePrimary_in_ruleUnary1380);
            lv_exp_2_0=rulePrimary();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_2_0, 
                    		"Primary");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnary"


    // $ANTLR start "entryRuleGroup"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:657:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:658:2: (iv_ruleGroup= ruleGroup EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:659:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup1415);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup1425); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:666:1: ruleGroup returns [EObject current=null] : (this_Or_0= ruleOr | this_Xor_1= ruleXor ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;

        EObject this_Xor_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:669:28: ( (this_Or_0= ruleOr | this_Xor_1= ruleXor ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:670:1: (this_Or_0= ruleOr | this_Xor_1= ruleXor )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:670:1: (this_Or_0= ruleOr | this_Xor_1= ruleXor )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Or) ) {
                alt9=1;
            }
            else if ( (LA9_0==Xor) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:671:5: this_Or_0= ruleOr
                    {
                     
                            newCompositeNode(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOr_in_ruleGroup1472);
                    this_Or_0=ruleOr();

                    state._fsp--;


                            current = this_Or_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:681:5: this_Xor_1= ruleXor
                    {
                     
                            newCompositeNode(grammarAccess.getGroupAccess().getXorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleXor_in_ruleGroup1499);
                    this_Xor_1=ruleXor();

                    state._fsp--;


                            current = this_Xor_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleRange"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:697:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:698:2: (iv_ruleRange= ruleRange EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:699:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange1533);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange1543); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:706:1: ruleRange returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) this_INT_1= RULE_INT otherlv_2= FullStopFullStop this_INT_3= RULE_INT ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token this_INT_1=null;
        Token otherlv_2=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:709:28: ( ( ( (lv_name_0_0= ruleEString ) ) this_INT_1= RULE_INT otherlv_2= FullStopFullStop this_INT_3= RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:710:1: ( ( (lv_name_0_0= ruleEString ) ) this_INT_1= RULE_INT otherlv_2= FullStopFullStop this_INT_3= RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:710:1: ( ( (lv_name_0_0= ruleEString ) ) this_INT_1= RULE_INT otherlv_2= FullStopFullStop this_INT_3= RULE_INT )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:710:2: ( (lv_name_0_0= ruleEString ) ) this_INT_1= RULE_INT otherlv_2= FullStopFullStop this_INT_3= RULE_INT
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:710:2: ( (lv_name_0_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:711:1: (lv_name_0_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:711:1: (lv_name_0_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:712:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRangeAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleRange1589);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange1600); 
             
                newLeafNode(this_INT_1, grammarAccess.getRangeAccess().getINTTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,FullStopFullStop,FOLLOW_FullStopFullStop_in_ruleRange1612); 

                	newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getFullStopFullStopKeyword_2());
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange1622); 
             
                newLeafNode(this_INT_3, grammarAccess.getRangeAccess().getINTTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:749:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:750:1: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:751:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1657);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1668); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:758:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_NULL_3= RULE_NULL ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_NULL_3=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:762:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_NULL_3= RULE_NULL ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:763:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_NULL_3= RULE_NULL )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:763:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_NULL_3= RULE_NULL )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case RULE_INT:
                {
                alt10=3;
                }
                break;
            case RULE_NULL:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:763:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1708); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:771:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString1734); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:779:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEString1760); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getEStringAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:787:10: this_NULL_3= RULE_NULL
                    {
                    this_NULL_3=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleEString1786); 

                    		current.merge(this_NULL_3);
                        
                     
                        newLeafNode(this_NULL_3, grammarAccess.getEStringAccess().getNULLTerminalRuleCall_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFeature_Impl"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:802:1: entryRuleFeature_Impl returns [EObject current=null] : iv_ruleFeature_Impl= ruleFeature_Impl EOF ;
    public final EObject entryRuleFeature_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature_Impl = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:803:2: (iv_ruleFeature_Impl= ruleFeature_Impl EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:804:2: iv_ruleFeature_Impl= ruleFeature_Impl EOF
            {
             newCompositeNode(grammarAccess.getFeature_ImplRule()); 
            pushFollow(FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl1830);
            iv_ruleFeature_Impl=ruleFeature_Impl();

            state._fsp--;

             current =iv_ruleFeature_Impl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature_Impl1840); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature_Impl"


    // $ANTLR start "ruleFeature_Impl"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:811:1: ruleFeature_Impl returns [EObject current=null] : (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ) ;
    public final EObject ruleFeature_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_subfeature_3_0 = null;

        EObject lv_subfeature_4_0 = null;

        EObject lv_constrains_7_0 = null;

        EObject lv_constrains_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:814:28: ( (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:815:1: (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:815:1: (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:816:2: otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )?
            {
            otherlv_0=(Token)match(input,Feature,FOLLOW_Feature_in_ruleFeature_Impl1878); 

                	newLeafNode(otherlv_0, grammarAccess.getFeature_ImplAccess().getFeatureKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:820:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:821:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:821:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:822:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleFeature_Impl1898);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:838:2: (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BEGIN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:838:3: this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleFeature_Impl1910); 
                     
                        newLeafNode(this_BEGIN_2, grammarAccess.getFeature_ImplAccess().getBEGINTerminalRuleCall_2_0()); 
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:842:1: ( (lv_subfeature_3_0= ruleSolitary ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:843:1: (lv_subfeature_3_0= ruleSolitary )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:843:1: (lv_subfeature_3_0= ruleSolitary )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:844:3: lv_subfeature_3_0= ruleSolitary
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSolitary_in_ruleFeature_Impl1930);
                    lv_subfeature_3_0=ruleSolitary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"subfeature",
                            		lv_subfeature_3_0, 
                            		"Solitary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:860:2: ( (lv_subfeature_4_0= ruleSolitary ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==QuestionMark||LA11_0==RULE_NULL||(LA11_0>=RULE_ID && LA11_0<=RULE_STRING)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:861:1: (lv_subfeature_4_0= ruleSolitary )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:861:1: (lv_subfeature_4_0= ruleSolitary )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:862:3: lv_subfeature_4_0= ruleSolitary
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSolitary_in_ruleFeature_Impl1951);
                    	    lv_subfeature_4_0=ruleSolitary();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subfeature",
                    	            		lv_subfeature_4_0, 
                    	            		"Solitary");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleFeature_Impl1963); 
                     
                        newLeafNode(this_END_5, grammarAccess.getFeature_ImplAccess().getENDTerminalRuleCall_2_3()); 
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:882:3: (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LeftSquareBracket) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:883:2: otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleFeature_Impl1978); 

                        	newLeafNode(otherlv_6, grammarAccess.getFeature_ImplAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:887:1: ( (lv_constrains_7_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:888:1: (lv_constrains_7_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:888:1: (lv_constrains_7_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:889:3: lv_constrains_7_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleFeature_Impl1998);
                    lv_constrains_7_0=ruleConstrain();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"constrains",
                            		lv_constrains_7_0, 
                            		"Constrain");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:905:2: (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Comma) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:906:2: otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_Comma_in_ruleFeature_Impl2012); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getFeature_ImplAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:910:1: ( (lv_constrains_9_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:911:1: (lv_constrains_9_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:911:1: (lv_constrains_9_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:912:3: lv_constrains_9_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleFeature_Impl2032);
                    	    lv_constrains_9_0=ruleConstrain();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constrains",
                    	            		lv_constrains_9_0, 
                    	            		"Constrain");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleFeature_Impl2047); 

                        	newLeafNode(otherlv_10, grammarAccess.getFeature_ImplAccess().getRightSquareBracketKeyword_3_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature_Impl"


    // $ANTLR start "entryRuleGrouped"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:941:1: entryRuleGrouped returns [EObject current=null] : iv_ruleGrouped= ruleGrouped EOF ;
    public final EObject entryRuleGrouped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouped = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:942:2: (iv_ruleGrouped= ruleGrouped EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:943:2: iv_ruleGrouped= ruleGrouped EOF
            {
             newCompositeNode(grammarAccess.getGroupedRule()); 
            pushFollow(FOLLOW_ruleGrouped_in_entryRuleGrouped2083);
            iv_ruleGrouped=ruleGrouped();

            state._fsp--;

             current =iv_ruleGrouped; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouped2093); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrouped"


    // $ANTLR start "ruleGrouped"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:950:1: ruleGrouped returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_range_1_0= ruleRange ) )? (otherlv_2= LeftSquareBracket ( (lv_constrains_3_0= ruleConstrain ) ) (otherlv_4= Comma ( (lv_constrains_5_0= ruleConstrain ) ) )* otherlv_6= RightSquareBracket )? ) ;
    public final EObject ruleGrouped() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_range_1_0 = null;

        EObject lv_constrains_3_0 = null;

        EObject lv_constrains_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:953:28: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_range_1_0= ruleRange ) )? (otherlv_2= LeftSquareBracket ( (lv_constrains_3_0= ruleConstrain ) ) (otherlv_4= Comma ( (lv_constrains_5_0= ruleConstrain ) ) )* otherlv_6= RightSquareBracket )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:954:1: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_range_1_0= ruleRange ) )? (otherlv_2= LeftSquareBracket ( (lv_constrains_3_0= ruleConstrain ) ) (otherlv_4= Comma ( (lv_constrains_5_0= ruleConstrain ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:954:1: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_range_1_0= ruleRange ) )? (otherlv_2= LeftSquareBracket ( (lv_constrains_3_0= ruleConstrain ) ) (otherlv_4= Comma ( (lv_constrains_5_0= ruleConstrain ) ) )* otherlv_6= RightSquareBracket )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:954:2: ( (lv_name_0_0= ruleEString ) ) ( (lv_range_1_0= ruleRange ) )? (otherlv_2= LeftSquareBracket ( (lv_constrains_3_0= ruleConstrain ) ) (otherlv_4= Comma ( (lv_constrains_5_0= ruleConstrain ) ) )* otherlv_6= RightSquareBracket )?
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:954:2: ( (lv_name_0_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:955:1: (lv_name_0_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:955:1: (lv_name_0_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:956:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupedAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleGrouped2139);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupedRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:972:2: ( (lv_range_1_0= ruleRange ) )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_INT) ) {
                        int LA15_6 = input.LA(3);

                        if ( (LA15_6==FullStopFullStop) ) {
                            alt15=1;
                        }
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_INT) ) {
                        int LA15_6 = input.LA(3);

                        if ( (LA15_6==FullStopFullStop) ) {
                            alt15=1;
                        }
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==RULE_INT) ) {
                        int LA15_6 = input.LA(3);

                        if ( (LA15_6==FullStopFullStop) ) {
                            alt15=1;
                        }
                    }
                    }
                    break;
                case RULE_NULL:
                    {
                    int LA15_4 = input.LA(2);

                    if ( (LA15_4==RULE_INT) ) {
                        int LA15_6 = input.LA(3);

                        if ( (LA15_6==FullStopFullStop) ) {
                            alt15=1;
                        }
                    }
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:973:1: (lv_range_1_0= ruleRange )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:973:1: (lv_range_1_0= ruleRange )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:974:3: lv_range_1_0= ruleRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupedAccess().getRangeRangeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRange_in_ruleGrouped2160);
                    lv_range_1_0=ruleRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupedRule());
                    	        }
                           		set(
                           			current, 
                           			"range",
                            		lv_range_1_0, 
                            		"Range");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:990:3: (otherlv_2= LeftSquareBracket ( (lv_constrains_3_0= ruleConstrain ) ) (otherlv_4= Comma ( (lv_constrains_5_0= ruleConstrain ) ) )* otherlv_6= RightSquareBracket )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LeftSquareBracket) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:991:2: otherlv_2= LeftSquareBracket ( (lv_constrains_3_0= ruleConstrain ) ) (otherlv_4= Comma ( (lv_constrains_5_0= ruleConstrain ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleGrouped2175); 

                        	newLeafNode(otherlv_2, grammarAccess.getGroupedAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:995:1: ( (lv_constrains_3_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:996:1: (lv_constrains_3_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:996:1: (lv_constrains_3_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:997:3: lv_constrains_3_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleGrouped2195);
                    lv_constrains_3_0=ruleConstrain();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupedRule());
                    	        }
                           		add(
                           			current, 
                           			"constrains",
                            		lv_constrains_3_0, 
                            		"Constrain");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1013:2: (otherlv_4= Comma ( (lv_constrains_5_0= ruleConstrain ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Comma) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1014:2: otherlv_4= Comma ( (lv_constrains_5_0= ruleConstrain ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGrouped2209); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getGroupedAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1018:1: ( (lv_constrains_5_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1019:1: (lv_constrains_5_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1019:1: (lv_constrains_5_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1020:3: lv_constrains_5_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleGrouped2229);
                    	    lv_constrains_5_0=ruleConstrain();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGroupedRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constrains",
                    	            		lv_constrains_5_0, 
                    	            		"Constrain");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleGrouped2244); 

                        	newLeafNode(otherlv_6, grammarAccess.getGroupedAccess().getRightSquareBracketKeyword_2_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrouped"


    // $ANTLR start "entryRuleMandatory"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1049:1: entryRuleMandatory returns [EObject current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final EObject entryRuleMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatory = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1050:2: (iv_ruleMandatory= ruleMandatory EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1051:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory2280);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory2290); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1058:1: ruleMandatory returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ( ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )* )? ) ;
    public final EObject ruleMandatory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_subfeature_2_0 = null;

        EObject lv_subfeature_4_0 = null;

        EObject lv_constrains_7_0 = null;

        EObject lv_constrains_9_0 = null;

        EObject lv_groups_11_0 = null;

        EObject lv_groups_12_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1061:28: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ( ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )* )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1062:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ( ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )* )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1062:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ( ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )* )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1062:2: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ( ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )* )?
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1062:2: ( (lv_name_0_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1063:1: (lv_name_0_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1063:1: (lv_name_0_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1064:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleMandatory2336);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1080:2: (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftCurlyBracket) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1081:2: otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket
                    {
                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleMandatory2350); 

                        	newLeafNode(otherlv_1, grammarAccess.getMandatoryAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1085:1: ( (lv_subfeature_2_0= ruleSolitary ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1086:1: (lv_subfeature_2_0= ruleSolitary )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1086:1: (lv_subfeature_2_0= ruleSolitary )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1087:3: lv_subfeature_2_0= ruleSolitary
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSolitary_in_ruleMandatory2370);
                    lv_subfeature_2_0=ruleSolitary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
                    	        }
                           		add(
                           			current, 
                           			"subfeature",
                            		lv_subfeature_2_0, 
                            		"Solitary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1103:2: (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Comma) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1104:2: otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_Comma_in_ruleMandatory2384); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getMandatoryAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1108:1: ( (lv_subfeature_4_0= ruleSolitary ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1109:1: (lv_subfeature_4_0= ruleSolitary )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1109:1: (lv_subfeature_4_0= ruleSolitary )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1110:3: lv_subfeature_4_0= ruleSolitary
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSolitary_in_ruleMandatory2404);
                    	    lv_subfeature_4_0=ruleSolitary();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subfeature",
                    	            		lv_subfeature_4_0, 
                    	            		"Solitary");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleMandatory2419); 

                        	newLeafNode(otherlv_5, grammarAccess.getMandatoryAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1131:3: (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LeftSquareBracket) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1132:2: otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleMandatory2434); 

                        	newLeafNode(otherlv_6, grammarAccess.getMandatoryAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1136:1: ( (lv_constrains_7_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1137:1: (lv_constrains_7_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1137:1: (lv_constrains_7_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1138:3: lv_constrains_7_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleMandatory2454);
                    lv_constrains_7_0=ruleConstrain();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
                    	        }
                           		add(
                           			current, 
                           			"constrains",
                            		lv_constrains_7_0, 
                            		"Constrain");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1154:2: (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Comma) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1155:2: otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_Comma_in_ruleMandatory2468); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getMandatoryAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1159:1: ( (lv_constrains_9_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1160:1: (lv_constrains_9_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1160:1: (lv_constrains_9_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1161:3: lv_constrains_9_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleMandatory2488);
                    	    lv_constrains_9_0=ruleConstrain();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constrains",
                    	            		lv_constrains_9_0, 
                    	            		"Constrain");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleMandatory2503); 

                        	newLeafNode(otherlv_10, grammarAccess.getMandatoryAccess().getRightSquareBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1182:3: ( ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Xor||LA23_0==Or) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1182:4: ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )*
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1182:4: ( (lv_groups_11_0= ruleGroup ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1183:1: (lv_groups_11_0= ruleGroup )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1183:1: (lv_groups_11_0= ruleGroup )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1184:3: lv_groups_11_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGroup_in_ruleMandatory2526);
                    lv_groups_11_0=ruleGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
                    	        }
                           		add(
                           			current, 
                           			"groups",
                            		lv_groups_11_0, 
                            		"Group");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1200:2: ( (lv_groups_12_0= ruleGroup ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Xor||LA22_0==Or) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1201:1: (lv_groups_12_0= ruleGroup )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1201:1: (lv_groups_12_0= ruleGroup )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1202:3: lv_groups_12_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGroup_in_ruleMandatory2547);
                    	    lv_groups_12_0=ruleGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"groups",
                    	            		lv_groups_12_0, 
                    	            		"Group");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1226:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1227:2: (iv_ruleOptional= ruleOptional EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1228:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional2585);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional2595); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1235:1: ruleOptional returns [EObject current=null] : (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket )? ( ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )* )? ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_subfeature_3_0 = null;

        EObject lv_subfeature_5_0 = null;

        EObject lv_constrains_8_0 = null;

        EObject lv_constrains_10_0 = null;

        EObject lv_groups_12_0 = null;

        EObject lv_groups_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1238:28: ( (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket )? ( ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )* )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1239:1: (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket )? ( ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )* )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1239:1: (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket )? ( ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )* )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1240:2: otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket )? ( ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )* )?
            {
            otherlv_0=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ruleOptional2633); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1244:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1245:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1245:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1246:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOptionalAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleOptional2653);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1262:2: (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LeftCurlyBracket) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1263:2: otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket
                    {
                    otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleOptional2667); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionalAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1267:1: ( (lv_subfeature_3_0= ruleSolitary ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1268:1: (lv_subfeature_3_0= ruleSolitary )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1268:1: (lv_subfeature_3_0= ruleSolitary )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1269:3: lv_subfeature_3_0= ruleSolitary
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSolitary_in_ruleOptional2687);
                    lv_subfeature_3_0=ruleSolitary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionalRule());
                    	        }
                           		add(
                           			current, 
                           			"subfeature",
                            		lv_subfeature_3_0, 
                            		"Solitary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1285:2: (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1286:2: otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleOptional2701); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getOptionalAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1290:1: ( (lv_subfeature_5_0= ruleSolitary ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1291:1: (lv_subfeature_5_0= ruleSolitary )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1291:1: (lv_subfeature_5_0= ruleSolitary )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1292:3: lv_subfeature_5_0= ruleSolitary
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSolitary_in_ruleOptional2721);
                    	    lv_subfeature_5_0=ruleSolitary();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOptionalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subfeature",
                    	            		lv_subfeature_5_0, 
                    	            		"Solitary");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleOptional2736); 

                        	newLeafNode(otherlv_6, grammarAccess.getOptionalAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1313:3: (otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LeftSquareBracket) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1314:2: otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket
                    {
                    otherlv_7=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleOptional2751); 

                        	newLeafNode(otherlv_7, grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1318:1: ( (lv_constrains_8_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1319:1: (lv_constrains_8_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1319:1: (lv_constrains_8_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1320:3: lv_constrains_8_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleOptional2771);
                    lv_constrains_8_0=ruleConstrain();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionalRule());
                    	        }
                           		add(
                           			current, 
                           			"constrains",
                            		lv_constrains_8_0, 
                            		"Constrain");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1336:2: (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==Comma) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1337:2: otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FOLLOW_Comma_in_ruleOptional2785); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getOptionalAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1341:1: ( (lv_constrains_10_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1342:1: (lv_constrains_10_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1342:1: (lv_constrains_10_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1343:3: lv_constrains_10_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleOptional2805);
                    	    lv_constrains_10_0=ruleConstrain();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOptionalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constrains",
                    	            		lv_constrains_10_0, 
                    	            		"Constrain");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleOptional2820); 

                        	newLeafNode(otherlv_11, grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1364:3: ( ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Xor||LA29_0==Or) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1364:4: ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )*
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1364:4: ( (lv_groups_12_0= ruleGroup ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1365:1: (lv_groups_12_0= ruleGroup )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1365:1: (lv_groups_12_0= ruleGroup )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1366:3: lv_groups_12_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGroup_in_ruleOptional2843);
                    lv_groups_12_0=ruleGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionalRule());
                    	        }
                           		add(
                           			current, 
                           			"groups",
                            		lv_groups_12_0, 
                            		"Group");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1382:2: ( (lv_groups_13_0= ruleGroup ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==Xor||LA28_0==Or) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1383:1: (lv_groups_13_0= ruleGroup )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1383:1: (lv_groups_13_0= ruleGroup )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1384:3: lv_groups_13_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGroup_in_ruleOptional2864);
                    	    lv_groups_13_0=ruleGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOptionalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"groups",
                    	            		lv_groups_13_0, 
                    	            		"Group");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleOr"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1408:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1409:2: (iv_ruleOr= ruleOr EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1410:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr2902);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr2912); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1417:1: ruleOr returns [EObject current=null] : (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_grouped_3_0 = null;

        EObject lv_grouped_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1420:28: ( (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1421:1: (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1421:1: (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1422:2: otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            {
            otherlv_0=(Token)match(input,Or,FOLLOW_Or_in_ruleOr2950); 

                	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1426:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1427:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1427:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1428:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleOr2970);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1444:2: (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_BEGIN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1444:3: this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleOr2982); 
                     
                        newLeafNode(this_BEGIN_2, grammarAccess.getOrAccess().getBEGINTerminalRuleCall_2_0()); 
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1448:1: ( (lv_grouped_3_0= ruleGrouped ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1449:1: (lv_grouped_3_0= ruleGrouped )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1449:1: (lv_grouped_3_0= ruleGrouped )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1450:3: lv_grouped_3_0= ruleGrouped
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouped_in_ruleOr3002);
                    lv_grouped_3_0=ruleGrouped();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrRule());
                    	        }
                           		add(
                           			current, 
                           			"grouped",
                            		lv_grouped_3_0, 
                            		"Grouped");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1466:2: ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Comma||LA31_0==RULE_NULL||(LA31_0>=RULE_ID && LA31_0<=RULE_STRING)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1466:3: (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1466:3: (otherlv_4= Comma )*
                    	    loop30:
                    	    do {
                    	        int alt30=2;
                    	        int LA30_0 = input.LA(1);

                    	        if ( (LA30_0==Comma) ) {
                    	            alt30=1;
                    	        }


                    	        switch (alt30) {
                    	    	case 1 :
                    	    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1467:2: otherlv_4= Comma
                    	    	    {
                    	    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleOr3017); 

                    	    	        	newLeafNode(otherlv_4, grammarAccess.getOrAccess().getCommaKeyword_2_2_0());
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop30;
                    	        }
                    	    } while (true);

                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1471:3: ( (lv_grouped_5_0= ruleGrouped ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1472:1: (lv_grouped_5_0= ruleGrouped )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1472:1: (lv_grouped_5_0= ruleGrouped )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1473:3: lv_grouped_5_0= ruleGrouped
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGrouped_in_ruleOr3039);
                    	    lv_grouped_5_0=ruleGrouped();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOrRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"grouped",
                    	            		lv_grouped_5_0, 
                    	            		"Grouped");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleOr3052); 
                     
                        newLeafNode(this_END_6, grammarAccess.getOrAccess().getENDTerminalRuleCall_2_3()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleXor"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1501:1: entryRuleXor returns [EObject current=null] : iv_ruleXor= ruleXor EOF ;
    public final EObject entryRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXor = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1502:2: (iv_ruleXor= ruleXor EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1503:2: iv_ruleXor= ruleXor EOF
            {
             newCompositeNode(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_ruleXor_in_entryRuleXor3088);
            iv_ruleXor=ruleXor();

            state._fsp--;

             current =iv_ruleXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXor3098); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXor"


    // $ANTLR start "ruleXor"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1510:1: ruleXor returns [EObject current=null] : (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) ;
    public final EObject ruleXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_grouped_3_0 = null;

        EObject lv_grouped_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1513:28: ( (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1514:1: (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1514:1: (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1515:2: otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            {
            otherlv_0=(Token)match(input,Xor,FOLLOW_Xor_in_ruleXor3136); 

                	newLeafNode(otherlv_0, grammarAccess.getXorAccess().getXorKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1519:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1520:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1520:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1521:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getXorAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleXor3156);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXorRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1537:2: (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_BEGIN) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1537:3: this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleXor3168); 
                     
                        newLeafNode(this_BEGIN_2, grammarAccess.getXorAccess().getBEGINTerminalRuleCall_2_0()); 
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1541:1: ( (lv_grouped_3_0= ruleGrouped ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1542:1: (lv_grouped_3_0= ruleGrouped )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1542:1: (lv_grouped_3_0= ruleGrouped )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1543:3: lv_grouped_3_0= ruleGrouped
                    {
                     
                    	        newCompositeNode(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouped_in_ruleXor3188);
                    lv_grouped_3_0=ruleGrouped();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXorRule());
                    	        }
                           		add(
                           			current, 
                           			"grouped",
                            		lv_grouped_3_0, 
                            		"Grouped");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1559:2: ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==Comma||LA34_0==RULE_NULL||(LA34_0>=RULE_ID && LA34_0<=RULE_STRING)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1559:3: (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1559:3: (otherlv_4= Comma )*
                    	    loop33:
                    	    do {
                    	        int alt33=2;
                    	        int LA33_0 = input.LA(1);

                    	        if ( (LA33_0==Comma) ) {
                    	            alt33=1;
                    	        }


                    	        switch (alt33) {
                    	    	case 1 :
                    	    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1560:2: otherlv_4= Comma
                    	    	    {
                    	    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleXor3203); 

                    	    	        	newLeafNode(otherlv_4, grammarAccess.getXorAccess().getCommaKeyword_2_2_0());
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop33;
                    	        }
                    	    } while (true);

                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1564:3: ( (lv_grouped_5_0= ruleGrouped ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1565:1: (lv_grouped_5_0= ruleGrouped )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1565:1: (lv_grouped_5_0= ruleGrouped )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1566:3: lv_grouped_5_0= ruleGrouped
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGrouped_in_ruleXor3225);
                    	    lv_grouped_5_0=ruleGrouped();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"grouped",
                    	            		lv_grouped_5_0, 
                    	            		"Grouped");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleXor3238); 
                     
                        newLeafNode(this_END_6, grammarAccess.getXorAccess().getENDTerminalRuleCall_2_3()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXor"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_ruleModel122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_entryRuleSolitary158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolitary168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleSolitary215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_ruleSolitary242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_entryRuleConstrain276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstrain286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleConstrain333 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_VerticalLineVerticalLine_in_ruleConstrain361 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleConstrain393 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction487 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AmpersandAmpersand_in_ruleConjunction515 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction547 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_ruleComparison641 = new BitSet(new long[]{0x0000000000300E42L});
    public static final BitSet FOLLOW_EqualsSignEqualsSign_in_ruleComparison671 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ExclamationMarkEqualsSign_in_ruleComparison699 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_LessThanSignEqualsSign_in_ruleComparison727 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_LessThanSign_in_ruleComparison755 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_GreaterThanSignEqualsSign_in_ruleComparison783 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_GreaterThanSign_in_ruleComparison811 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ruleBinary_in_ruleComparison846 = new BitSet(new long[]{0x0000000000300E42L});
    public static final BitSet FOLLOW_ruleBinary_in_entryRuleBinary883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinary893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleBinary940 = new BitSet(new long[]{0x00000001C804C002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleBinary970 = new BitSet(new long[]{0x00000001C804C002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rulePrimary1066 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_FullStop_in_rulePrimary1079 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_ruleEString_in_rulePrimary1101 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_FullStop_in_rulePrimary1114 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_ruleEString_in_rulePrimary1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_rulePrimary1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulePrimary1184 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_rulePrimary1205 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulePrimary1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary1252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMark_in_ruleUnary1317 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_HyphenMinus_in_ruleUnary1345 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleUnary1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleGroup1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_ruleGroup1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleRange1589 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange1600 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_FullStopFullStop_in_ruleRange1612 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEString1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleEString1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature_Impl1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Feature_in_ruleFeature_Impl1878 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleFeature_Impl1898 = new BitSet(new long[]{0x0000000010800002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleFeature_Impl1910 = new BitSet(new long[]{0x00000001C8400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleFeature_Impl1930 = new BitSet(new long[]{0x00000001E8400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleFeature_Impl1951 = new BitSet(new long[]{0x00000001E8400000L});
    public static final BitSet FOLLOW_RULE_END_in_ruleFeature_Impl1963 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleFeature_Impl1978 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleFeature_Impl1998 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_Comma_in_ruleFeature_Impl2012 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleFeature_Impl2032 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleFeature_Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_entryRuleGrouped2083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouped2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleGrouped2139 = new BitSet(new long[]{0x00000001C8800002L});
    public static final BitSet FOLLOW_ruleRange_in_ruleGrouped2160 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleGrouped2175 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleGrouped2195 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_Comma_in_ruleGrouped2209 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleGrouped2229 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleGrouped2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory2280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleMandatory2336 = new BitSet(new long[]{0x0000000002801022L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleMandatory2350 = new BitSet(new long[]{0x00000001C8400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleMandatory2370 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_Comma_in_ruleMandatory2384 = new BitSet(new long[]{0x00000001C8400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleMandatory2404 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleMandatory2419 = new BitSet(new long[]{0x0000000000801022L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleMandatory2434 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleMandatory2454 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_Comma_in_ruleMandatory2468 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleMandatory2488 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleMandatory2503 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleMandatory2526 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleMandatory2547 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional2585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuestionMark_in_ruleOptional2633 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOptional2653 = new BitSet(new long[]{0x0000000002801022L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleOptional2667 = new BitSet(new long[]{0x00000001C8400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleOptional2687 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_Comma_in_ruleOptional2701 = new BitSet(new long[]{0x00000001C8400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleOptional2721 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleOptional2736 = new BitSet(new long[]{0x0000000000801022L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleOptional2751 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleOptional2771 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_Comma_in_ruleOptional2785 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleOptional2805 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleOptional2820 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleOptional2843 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleOptional2864 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr2902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_ruleOr2950 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOr2970 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleOr2982 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleOr3002 = new BitSet(new long[]{0x00000001E8020000L});
    public static final BitSet FOLLOW_Comma_in_ruleOr3017 = new BitSet(new long[]{0x00000001C8020000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleOr3039 = new BitSet(new long[]{0x00000001E8020000L});
    public static final BitSet FOLLOW_RULE_END_in_ruleOr3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_entryRuleXor3088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXor3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_ruleXor3136 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleXor3156 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleXor3168 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleXor3188 = new BitSet(new long[]{0x00000001E8020000L});
    public static final BitSet FOLLOW_Comma_in_ruleXor3203 = new BitSet(new long[]{0x00000001C8020000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleXor3225 = new BitSet(new long[]{0x00000001E8020000L});
    public static final BitSet FOLLOW_RULE_END_in_ruleXor3238 = new BitSet(new long[]{0x0000000000000002L});

}