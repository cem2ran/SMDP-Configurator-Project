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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Feature", "Xor", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "Or", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Comma", "HyphenMinus", "FullStop", "LessThanSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_NULL", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=28;
    public static final int Or=11;
    public static final int RULE_BEGIN=27;
    public static final int VerticalLineVerticalLine=12;
    public static final int RULE_STRING=31;
    public static final int RULE_NULL=26;
    public static final int Feature=4;
    public static final int LessThanSign=19;
    public static final int RULE_SL_COMMENT=33;
    public static final int Comma=16;
    public static final int HyphenMinus=17;
    public static final int LeftParenthesis=14;
    public static final int AmpersandAmpersand=7;
    public static final int LessThanSignEqualsSign=8;
    public static final int RightCurlyBracket=25;
    public static final int EOF=-1;
    public static final int RightSquareBracket=23;
    public static final int ExclamationMark=13;
    public static final int FullStop=18;
    public static final int GreaterThanSign=20;
    public static final int RULE_ID=29;
    public static final int RULE_WS=34;
    public static final int RightParenthesis=15;
    public static final int LeftCurlyBracket=24;
    public static final int RULE_ANY_OTHER=35;
    public static final int GreaterThanSignEqualsSign=10;
    public static final int EqualsSignEqualsSign=9;
    public static final int QuestionMark=21;
    public static final int RULE_INT=30;
    public static final int RULE_ML_COMMENT=32;
    public static final int Xor=5;
    public static final int LeftSquareBracket=22;
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

            if ( (LA1_0==RULE_NULL||LA1_0==RULE_ID||LA1_0==RULE_STRING) ) {
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

                if ( ((LA6_0>=ExclamationMark && LA6_0<=LeftParenthesis)||LA6_0==HyphenMinus||LA6_0==RULE_NULL||LA6_0==RULE_ID||LA6_0==RULE_STRING) ) {
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:483:1: rulePrimary returns [EObject current=null] : ( ( ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) (otherlv_3= FullStop ( ( ruleEString ) ) )* ) | this_Unary_5= ruleUnary | (otherlv_6= LeftParenthesis this_Constrain_7= ruleConstrain otherlv_8= RightParenthesis ) ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:486:28: ( ( ( ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) (otherlv_3= FullStop ( ( ruleEString ) ) )* ) | this_Unary_5= ruleUnary | (otherlv_6= LeftParenthesis this_Constrain_7= ruleConstrain otherlv_8= RightParenthesis ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:487:1: ( ( ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) (otherlv_3= FullStop ( ( ruleEString ) ) )* ) | this_Unary_5= ruleUnary | (otherlv_6= LeftParenthesis this_Constrain_7= ruleConstrain otherlv_8= RightParenthesis ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:487:1: ( ( ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) (otherlv_3= FullStop ( ( ruleEString ) ) )* ) | this_Unary_5= ruleUnary | (otherlv_6= LeftParenthesis this_Constrain_7= ruleConstrain otherlv_8= RightParenthesis ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_NULL:
            case RULE_ID:
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case ExclamationMark:
            case HyphenMinus:
                {
                alt8=2;
                }
                break;
            case LeftParenthesis:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:487:2: ( ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) (otherlv_3= FullStop ( ( ruleEString ) ) )* )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:487:2: ( ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) (otherlv_3= FullStop ( ( ruleEString ) ) )* )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:487:3: ( ( ruleEString ) ) otherlv_1= FullStop ( ( ruleEString ) ) (otherlv_3= FullStop ( ( ruleEString ) ) )*
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:522:2: (otherlv_3= FullStop ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==FullStop) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:523:2: otherlv_3= FullStop ( ( ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,FullStop,FOLLOW_FullStop_in_rulePrimary1115); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getFullStopKeyword_0_3_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:527:1: ( ( ruleEString ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:528:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:528:1: ( ruleEString )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:529:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrimaryAccess().getConstrainFeaturesFeatureCrossReference_0_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEString_in_rulePrimary1137);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:544:5: this_Unary_5= ruleUnary
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnary_in_rulePrimary1168);
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
                    otherlv_6=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulePrimary1187); 

                        	newLeafNode(otherlv_6, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getConstrainParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleConstrain_in_rulePrimary1208);
                    this_Constrain_7=ruleConstrain();

                    state._fsp--;


                            current = this_Constrain_7;
                            afterParserOrEnumRuleCall();
                        
                    otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulePrimary1220); 

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
            pushFollow(FOLLOW_ruleUnary_in_entryRuleUnary1255);
            iv_ruleUnary=ruleUnary();

            state._fsp--;

             current =iv_ruleUnary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary1265); 

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
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ExclamationMark) ) {
                alt9=1;
            }
            else if ( (LA9_0==HyphenMinus) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:602:3: lv_Operator_1_1= ExclamationMark
                    {
                    lv_Operator_1_1=(Token)match(input,ExclamationMark,FOLLOW_ExclamationMark_in_ruleUnary1320); 

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
                    lv_Operator_1_2=(Token)match(input,HyphenMinus,FOLLOW_HyphenMinus_in_ruleUnary1348); 

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
            	    
            pushFollow(FOLLOW_rulePrimary_in_ruleUnary1383);
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
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup1418);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup1428); 

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
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Or) ) {
                alt10=1;
            }
            else if ( (LA10_0==Xor) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:671:5: this_Or_0= ruleOr
                    {
                     
                            newCompositeNode(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOr_in_ruleGroup1475);
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
                        
                    pushFollow(FOLLOW_ruleXor_in_ruleGroup1502);
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


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:697:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:698:1: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:699:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1537);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1548); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:706:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_NULL_2= RULE_NULL ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_NULL_2=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:710:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_NULL_2= RULE_NULL ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:711:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_NULL_2= RULE_NULL )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:711:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_NULL_2= RULE_NULL )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case RULE_NULL:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:711:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1588); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:719:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString1614); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:727:10: this_NULL_2= RULE_NULL
                    {
                    this_NULL_2=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleEString1640); 

                    		current.merge(this_NULL_2);
                        
                     
                        newLeafNode(this_NULL_2, grammarAccess.getEStringAccess().getNULLTerminalRuleCall_2()); 
                        

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:742:1: entryRuleFeature_Impl returns [EObject current=null] : iv_ruleFeature_Impl= ruleFeature_Impl EOF ;
    public final EObject entryRuleFeature_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature_Impl = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:743:2: (iv_ruleFeature_Impl= ruleFeature_Impl EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:744:2: iv_ruleFeature_Impl= ruleFeature_Impl EOF
            {
             newCompositeNode(grammarAccess.getFeature_ImplRule()); 
            pushFollow(FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl1684);
            iv_ruleFeature_Impl=ruleFeature_Impl();

            state._fsp--;

             current =iv_ruleFeature_Impl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature_Impl1694); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:751:1: ruleFeature_Impl returns [EObject current=null] : (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:754:28: ( (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:755:1: (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:755:1: (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:756:2: otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )?
            {
            otherlv_0=(Token)match(input,Feature,FOLLOW_Feature_in_ruleFeature_Impl1732); 

                	newLeafNode(otherlv_0, grammarAccess.getFeature_ImplAccess().getFeatureKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:760:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:761:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:761:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:762:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleFeature_Impl1752);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:778:2: (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_BEGIN) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:778:3: this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleFeature_Impl1764); 
                     
                        newLeafNode(this_BEGIN_2, grammarAccess.getFeature_ImplAccess().getBEGINTerminalRuleCall_2_0()); 
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:782:1: ( (lv_subfeature_3_0= ruleSolitary ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:783:1: (lv_subfeature_3_0= ruleSolitary )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:783:1: (lv_subfeature_3_0= ruleSolitary )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:784:3: lv_subfeature_3_0= ruleSolitary
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSolitary_in_ruleFeature_Impl1784);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:800:2: ( (lv_subfeature_4_0= ruleSolitary ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==QuestionMark||LA12_0==RULE_NULL||LA12_0==RULE_ID||LA12_0==RULE_STRING) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:801:1: (lv_subfeature_4_0= ruleSolitary )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:801:1: (lv_subfeature_4_0= ruleSolitary )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:802:3: lv_subfeature_4_0= ruleSolitary
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSolitary_in_ruleFeature_Impl1805);
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
                    	    break loop12;
                        }
                    } while (true);

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleFeature_Impl1817); 
                     
                        newLeafNode(this_END_5, grammarAccess.getFeature_ImplAccess().getENDTerminalRuleCall_2_3()); 
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:822:3: (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LeftSquareBracket) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:823:2: otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleFeature_Impl1832); 

                        	newLeafNode(otherlv_6, grammarAccess.getFeature_ImplAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:827:1: ( (lv_constrains_7_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:828:1: (lv_constrains_7_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:828:1: (lv_constrains_7_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:829:3: lv_constrains_7_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleFeature_Impl1852);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:845:2: (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Comma) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:846:2: otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_Comma_in_ruleFeature_Impl1866); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getFeature_ImplAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:850:1: ( (lv_constrains_9_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:851:1: (lv_constrains_9_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:851:1: (lv_constrains_9_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:852:3: lv_constrains_9_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleFeature_Impl1886);
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleFeature_Impl1901); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:881:1: entryRuleGrouped returns [EObject current=null] : iv_ruleGrouped= ruleGrouped EOF ;
    public final EObject entryRuleGrouped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouped = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:882:2: (iv_ruleGrouped= ruleGrouped EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:883:2: iv_ruleGrouped= ruleGrouped EOF
            {
             newCompositeNode(grammarAccess.getGroupedRule()); 
            pushFollow(FOLLOW_ruleGrouped_in_entryRuleGrouped1937);
            iv_ruleGrouped=ruleGrouped();

            state._fsp--;

             current =iv_ruleGrouped; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouped1947); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:890:1: ruleGrouped returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftSquareBracket ( (lv_constrains_2_0= ruleConstrain ) ) (otherlv_3= Comma ( (lv_constrains_4_0= ruleConstrain ) ) )* otherlv_5= RightSquareBracket )? ) ;
    public final EObject ruleGrouped() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_constrains_2_0 = null;

        EObject lv_constrains_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:893:28: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftSquareBracket ( (lv_constrains_2_0= ruleConstrain ) ) (otherlv_3= Comma ( (lv_constrains_4_0= ruleConstrain ) ) )* otherlv_5= RightSquareBracket )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:894:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftSquareBracket ( (lv_constrains_2_0= ruleConstrain ) ) (otherlv_3= Comma ( (lv_constrains_4_0= ruleConstrain ) ) )* otherlv_5= RightSquareBracket )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:894:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftSquareBracket ( (lv_constrains_2_0= ruleConstrain ) ) (otherlv_3= Comma ( (lv_constrains_4_0= ruleConstrain ) ) )* otherlv_5= RightSquareBracket )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:894:2: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftSquareBracket ( (lv_constrains_2_0= ruleConstrain ) ) (otherlv_3= Comma ( (lv_constrains_4_0= ruleConstrain ) ) )* otherlv_5= RightSquareBracket )?
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:894:2: ( (lv_name_0_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:895:1: (lv_name_0_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:895:1: (lv_name_0_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:896:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupedAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleGrouped1993);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:912:2: (otherlv_1= LeftSquareBracket ( (lv_constrains_2_0= ruleConstrain ) ) (otherlv_3= Comma ( (lv_constrains_4_0= ruleConstrain ) ) )* otherlv_5= RightSquareBracket )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LeftSquareBracket) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:913:2: otherlv_1= LeftSquareBracket ( (lv_constrains_2_0= ruleConstrain ) ) (otherlv_3= Comma ( (lv_constrains_4_0= ruleConstrain ) ) )* otherlv_5= RightSquareBracket
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleGrouped2007); 

                        	newLeafNode(otherlv_1, grammarAccess.getGroupedAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:917:1: ( (lv_constrains_2_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:918:1: (lv_constrains_2_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:918:1: (lv_constrains_2_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:919:3: lv_constrains_2_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleGrouped2027);
                    lv_constrains_2_0=ruleConstrain();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupedRule());
                    	        }
                           		add(
                           			current, 
                           			"constrains",
                            		lv_constrains_2_0, 
                            		"Constrain");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:935:2: (otherlv_3= Comma ( (lv_constrains_4_0= ruleConstrain ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Comma) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:936:2: otherlv_3= Comma ( (lv_constrains_4_0= ruleConstrain ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGrouped2041); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getGroupedAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:940:1: ( (lv_constrains_4_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:941:1: (lv_constrains_4_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:941:1: (lv_constrains_4_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:942:3: lv_constrains_4_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleGrouped2061);
                    	    lv_constrains_4_0=ruleConstrain();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGroupedRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constrains",
                    	            		lv_constrains_4_0, 
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

                    otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleGrouped2076); 

                        	newLeafNode(otherlv_5, grammarAccess.getGroupedAccess().getRightSquareBracketKeyword_1_3());
                        

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:971:1: entryRuleMandatory returns [EObject current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final EObject entryRuleMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatory = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:972:2: (iv_ruleMandatory= ruleMandatory EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:973:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory2112);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory2122); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:980:1: ruleMandatory returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ( ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )* )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:983:28: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ( ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )* )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:984:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ( ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )* )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:984:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ( ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )* )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:984:2: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ( ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )* )?
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:984:2: ( (lv_name_0_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:985:1: (lv_name_0_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:985:1: (lv_name_0_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:986:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleMandatory2168);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1002:2: (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftCurlyBracket) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1003:2: otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket
                    {
                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleMandatory2182); 

                        	newLeafNode(otherlv_1, grammarAccess.getMandatoryAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1007:1: ( (lv_subfeature_2_0= ruleSolitary ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1008:1: (lv_subfeature_2_0= ruleSolitary )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1008:1: (lv_subfeature_2_0= ruleSolitary )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1009:3: lv_subfeature_2_0= ruleSolitary
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSolitary_in_ruleMandatory2202);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1025:2: (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Comma) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1026:2: otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_Comma_in_ruleMandatory2216); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getMandatoryAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1030:1: ( (lv_subfeature_4_0= ruleSolitary ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1031:1: (lv_subfeature_4_0= ruleSolitary )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1031:1: (lv_subfeature_4_0= ruleSolitary )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1032:3: lv_subfeature_4_0= ruleSolitary
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSolitary_in_ruleMandatory2236);
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

                    otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleMandatory2251); 

                        	newLeafNode(otherlv_5, grammarAccess.getMandatoryAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1053:3: (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LeftSquareBracket) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1054:2: otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleMandatory2266); 

                        	newLeafNode(otherlv_6, grammarAccess.getMandatoryAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1058:1: ( (lv_constrains_7_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1059:1: (lv_constrains_7_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1059:1: (lv_constrains_7_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1060:3: lv_constrains_7_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleMandatory2286);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1076:2: (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Comma) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1077:2: otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_Comma_in_ruleMandatory2300); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getMandatoryAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1081:1: ( (lv_constrains_9_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1082:1: (lv_constrains_9_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1082:1: (lv_constrains_9_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1083:3: lv_constrains_9_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleMandatory2320);
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

                    otherlv_10=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleMandatory2335); 

                        	newLeafNode(otherlv_10, grammarAccess.getMandatoryAccess().getRightSquareBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1104:3: ( ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Xor||LA23_0==Or) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1104:4: ( (lv_groups_11_0= ruleGroup ) ) ( (lv_groups_12_0= ruleGroup ) )*
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1104:4: ( (lv_groups_11_0= ruleGroup ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1105:1: (lv_groups_11_0= ruleGroup )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1105:1: (lv_groups_11_0= ruleGroup )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1106:3: lv_groups_11_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGroup_in_ruleMandatory2358);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1122:2: ( (lv_groups_12_0= ruleGroup ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Xor||LA22_0==Or) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1123:1: (lv_groups_12_0= ruleGroup )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1123:1: (lv_groups_12_0= ruleGroup )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1124:3: lv_groups_12_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGroup_in_ruleMandatory2379);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1148:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1149:2: (iv_ruleOptional= ruleOptional EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1150:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional2417);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional2427); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1157:1: ruleOptional returns [EObject current=null] : (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket )? ( ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )* )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1160:28: ( (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket )? ( ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )* )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1161:1: (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket )? ( ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )* )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1161:1: (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket )? ( ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )* )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1162:2: otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket )? ( ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )* )?
            {
            otherlv_0=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ruleOptional2465); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1166:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1167:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1167:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1168:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOptionalAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleOptional2485);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1184:2: (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LeftCurlyBracket) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1185:2: otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket
                    {
                    otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleOptional2499); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionalAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1189:1: ( (lv_subfeature_3_0= ruleSolitary ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1190:1: (lv_subfeature_3_0= ruleSolitary )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1190:1: (lv_subfeature_3_0= ruleSolitary )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1191:3: lv_subfeature_3_0= ruleSolitary
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSolitary_in_ruleOptional2519);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1207:2: (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1208:2: otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleOptional2533); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getOptionalAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1212:1: ( (lv_subfeature_5_0= ruleSolitary ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1213:1: (lv_subfeature_5_0= ruleSolitary )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1213:1: (lv_subfeature_5_0= ruleSolitary )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1214:3: lv_subfeature_5_0= ruleSolitary
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSolitary_in_ruleOptional2553);
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

                    otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleOptional2568); 

                        	newLeafNode(otherlv_6, grammarAccess.getOptionalAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1235:3: (otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LeftSquareBracket) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1236:2: otherlv_7= LeftSquareBracket ( (lv_constrains_8_0= ruleConstrain ) ) (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )* otherlv_11= RightSquareBracket
                    {
                    otherlv_7=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleOptional2583); 

                        	newLeafNode(otherlv_7, grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1240:1: ( (lv_constrains_8_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1241:1: (lv_constrains_8_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1241:1: (lv_constrains_8_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1242:3: lv_constrains_8_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleOptional2603);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1258:2: (otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==Comma) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1259:2: otherlv_9= Comma ( (lv_constrains_10_0= ruleConstrain ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FOLLOW_Comma_in_ruleOptional2617); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getOptionalAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1263:1: ( (lv_constrains_10_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1264:1: (lv_constrains_10_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1264:1: (lv_constrains_10_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1265:3: lv_constrains_10_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleOptional2637);
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

                    otherlv_11=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleOptional2652); 

                        	newLeafNode(otherlv_11, grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1286:3: ( ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Xor||LA29_0==Or) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1286:4: ( (lv_groups_12_0= ruleGroup ) ) ( (lv_groups_13_0= ruleGroup ) )*
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1286:4: ( (lv_groups_12_0= ruleGroup ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1287:1: (lv_groups_12_0= ruleGroup )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1287:1: (lv_groups_12_0= ruleGroup )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1288:3: lv_groups_12_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGroup_in_ruleOptional2675);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1304:2: ( (lv_groups_13_0= ruleGroup ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==Xor||LA28_0==Or) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1305:1: (lv_groups_13_0= ruleGroup )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1305:1: (lv_groups_13_0= ruleGroup )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1306:3: lv_groups_13_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGroup_in_ruleOptional2696);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1330:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1331:2: (iv_ruleOr= ruleOr EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1332:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr2734);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr2744); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1339:1: ruleOr returns [EObject current=null] : (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1342:28: ( (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1343:1: (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1343:1: (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1344:2: otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            {
            otherlv_0=(Token)match(input,Or,FOLLOW_Or_in_ruleOr2782); 

                	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1348:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1349:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1349:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1350:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleOr2802);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1366:2: (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_BEGIN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1366:3: this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleOr2814); 
                     
                        newLeafNode(this_BEGIN_2, grammarAccess.getOrAccess().getBEGINTerminalRuleCall_2_0()); 
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1370:1: ( (lv_grouped_3_0= ruleGrouped ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1371:1: (lv_grouped_3_0= ruleGrouped )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1371:1: (lv_grouped_3_0= ruleGrouped )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1372:3: lv_grouped_3_0= ruleGrouped
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouped_in_ruleOr2834);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1388:2: ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Comma||LA31_0==RULE_NULL||LA31_0==RULE_ID||LA31_0==RULE_STRING) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1388:3: (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1388:3: (otherlv_4= Comma )*
                    	    loop30:
                    	    do {
                    	        int alt30=2;
                    	        int LA30_0 = input.LA(1);

                    	        if ( (LA30_0==Comma) ) {
                    	            alt30=1;
                    	        }


                    	        switch (alt30) {
                    	    	case 1 :
                    	    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1389:2: otherlv_4= Comma
                    	    	    {
                    	    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleOr2849); 

                    	    	        	newLeafNode(otherlv_4, grammarAccess.getOrAccess().getCommaKeyword_2_2_0());
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop30;
                    	        }
                    	    } while (true);

                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1393:3: ( (lv_grouped_5_0= ruleGrouped ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1394:1: (lv_grouped_5_0= ruleGrouped )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1394:1: (lv_grouped_5_0= ruleGrouped )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1395:3: lv_grouped_5_0= ruleGrouped
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGrouped_in_ruleOr2871);
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

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleOr2884); 
                     
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1423:1: entryRuleXor returns [EObject current=null] : iv_ruleXor= ruleXor EOF ;
    public final EObject entryRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXor = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1424:2: (iv_ruleXor= ruleXor EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1425:2: iv_ruleXor= ruleXor EOF
            {
             newCompositeNode(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_ruleXor_in_entryRuleXor2920);
            iv_ruleXor=ruleXor();

            state._fsp--;

             current =iv_ruleXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXor2930); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1432:1: ruleXor returns [EObject current=null] : (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1435:28: ( (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1436:1: (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1436:1: (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1437:2: otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            {
            otherlv_0=(Token)match(input,Xor,FOLLOW_Xor_in_ruleXor2968); 

                	newLeafNode(otherlv_0, grammarAccess.getXorAccess().getXorKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1441:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1442:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1442:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1443:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getXorAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleXor2988);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1459:2: (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_BEGIN) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1459:3: this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleXor3000); 
                     
                        newLeafNode(this_BEGIN_2, grammarAccess.getXorAccess().getBEGINTerminalRuleCall_2_0()); 
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1463:1: ( (lv_grouped_3_0= ruleGrouped ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1464:1: (lv_grouped_3_0= ruleGrouped )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1464:1: (lv_grouped_3_0= ruleGrouped )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1465:3: lv_grouped_3_0= ruleGrouped
                    {
                     
                    	        newCompositeNode(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouped_in_ruleXor3020);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1481:2: ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==Comma||LA34_0==RULE_NULL||LA34_0==RULE_ID||LA34_0==RULE_STRING) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1481:3: (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1481:3: (otherlv_4= Comma )*
                    	    loop33:
                    	    do {
                    	        int alt33=2;
                    	        int LA33_0 = input.LA(1);

                    	        if ( (LA33_0==Comma) ) {
                    	            alt33=1;
                    	        }


                    	        switch (alt33) {
                    	    	case 1 :
                    	    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1482:2: otherlv_4= Comma
                    	    	    {
                    	    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleXor3035); 

                    	    	        	newLeafNode(otherlv_4, grammarAccess.getXorAccess().getCommaKeyword_2_2_0());
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop33;
                    	        }
                    	    } while (true);

                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1486:3: ( (lv_grouped_5_0= ruleGrouped ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1487:1: (lv_grouped_5_0= ruleGrouped )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1487:1: (lv_grouped_5_0= ruleGrouped )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1488:3: lv_grouped_5_0= ruleGrouped
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGrouped_in_ruleXor3057);
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

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleXor3070); 
                     
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
    public static final BitSet FOLLOW_ruleConjunction_in_ruleConstrain333 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_VerticalLineVerticalLine_in_ruleConstrain361 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleConstrain393 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction487 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AmpersandAmpersand_in_ruleConjunction515 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction547 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_ruleComparison641 = new BitSet(new long[]{0x0000000000180742L});
    public static final BitSet FOLLOW_EqualsSignEqualsSign_in_ruleComparison671 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ExclamationMarkEqualsSign_in_ruleComparison699 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_LessThanSignEqualsSign_in_ruleComparison727 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_LessThanSign_in_ruleComparison755 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_GreaterThanSignEqualsSign_in_ruleComparison783 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_GreaterThanSign_in_ruleComparison811 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ruleBinary_in_ruleComparison846 = new BitSet(new long[]{0x0000000000180742L});
    public static final BitSet FOLLOW_ruleBinary_in_entryRuleBinary883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinary893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleBinary940 = new BitSet(new long[]{0x00000000A4026002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleBinary970 = new BitSet(new long[]{0x00000000A4026002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rulePrimary1066 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_FullStop_in_rulePrimary1079 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_ruleEString_in_rulePrimary1101 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_FullStop_in_rulePrimary1115 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_ruleEString_in_rulePrimary1137 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleUnary_in_rulePrimary1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulePrimary1187 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ruleConstrain_in_rulePrimary1208 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulePrimary1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary1255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMark_in_ruleUnary1320 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_HyphenMinus_in_ruleUnary1348 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleUnary1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleGroup1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_ruleGroup1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleEString1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature_Impl1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Feature_in_ruleFeature_Impl1732 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleFeature_Impl1752 = new BitSet(new long[]{0x0000000008400002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleFeature_Impl1764 = new BitSet(new long[]{0x00000000A4200000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleFeature_Impl1784 = new BitSet(new long[]{0x00000000B4200000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleFeature_Impl1805 = new BitSet(new long[]{0x00000000B4200000L});
    public static final BitSet FOLLOW_RULE_END_in_ruleFeature_Impl1817 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleFeature_Impl1832 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleFeature_Impl1852 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_Comma_in_ruleFeature_Impl1866 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleFeature_Impl1886 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleFeature_Impl1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_entryRuleGrouped1937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouped1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleGrouped1993 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleGrouped2007 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleGrouped2027 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_Comma_in_ruleGrouped2041 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleGrouped2061 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleGrouped2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory2112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleMandatory2168 = new BitSet(new long[]{0x0000000001400822L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleMandatory2182 = new BitSet(new long[]{0x00000000A4200000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleMandatory2202 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_Comma_in_ruleMandatory2216 = new BitSet(new long[]{0x00000000A4200000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleMandatory2236 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleMandatory2251 = new BitSet(new long[]{0x0000000000400822L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleMandatory2266 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleMandatory2286 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_Comma_in_ruleMandatory2300 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleMandatory2320 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleMandatory2335 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleMandatory2358 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleMandatory2379 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional2417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuestionMark_in_ruleOptional2465 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOptional2485 = new BitSet(new long[]{0x0000000001400822L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleOptional2499 = new BitSet(new long[]{0x00000000A4200000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleOptional2519 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_Comma_in_ruleOptional2533 = new BitSet(new long[]{0x00000000A4200000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleOptional2553 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleOptional2568 = new BitSet(new long[]{0x0000000000400822L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleOptional2583 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleOptional2603 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_Comma_in_ruleOptional2617 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleOptional2637 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleOptional2652 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleOptional2675 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleOptional2696 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr2734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_ruleOr2782 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOr2802 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleOr2814 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleOr2834 = new BitSet(new long[]{0x00000000B4010000L});
    public static final BitSet FOLLOW_Comma_in_ruleOr2849 = new BitSet(new long[]{0x00000000A4010000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleOr2871 = new BitSet(new long[]{0x00000000B4010000L});
    public static final BitSet FOLLOW_RULE_END_in_ruleOr2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_entryRuleXor2920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXor2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_ruleXor2968 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleXor2988 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleXor3000 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleXor3020 = new BitSet(new long[]{0x00000000B4010000L});
    public static final BitSet FOLLOW_Comma_in_ruleXor3035 = new BitSet(new long[]{0x00000000A4010000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleXor3057 = new BitSet(new long[]{0x00000000B4010000L});
    public static final BitSet FOLLOW_RULE_END_in_ruleXor3070 = new BitSet(new long[]{0x0000000000000002L});

}