package dk.itu.mdd.configurator.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Feature", "Model", "Xor", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "Or", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Comma", "HyphenMinus", "FullStop", "LessThanSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_NULL", "RULE_BOOLEAN", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=30;
    public static final int Or=12;
    public static final int RULE_BEGIN=29;
    public static final int VerticalLineVerticalLine=13;
    public static final int RULE_BOOLEAN=28;
    public static final int RULE_STRING=33;
    public static final int RULE_NULL=27;
    public static final int Feature=4;
    public static final int LessThanSign=20;
    public static final int RULE_SL_COMMENT=35;
    public static final int Comma=17;
    public static final int HyphenMinus=18;
    public static final int LeftParenthesis=15;
    public static final int AmpersandAmpersand=8;
    public static final int LessThanSignEqualsSign=9;
    public static final int RightCurlyBracket=26;
    public static final int EOF=-1;
    public static final int RightSquareBracket=24;
    public static final int ExclamationMark=14;
    public static final int FullStop=19;
    public static final int GreaterThanSign=21;
    public static final int RULE_ID=31;
    public static final int RULE_WS=36;
    public static final int RightParenthesis=16;
    public static final int LeftCurlyBracket=25;
    public static final int RULE_ANY_OTHER=37;
    public static final int GreaterThanSignEqualsSign=11;
    public static final int EqualsSignEqualsSign=10;
    public static final int QuestionMark=22;
    public static final int RULE_INT=32;
    public static final int Model=5;
    public static final int RULE_ML_COMMENT=34;
    public static final int Xor=6;
    public static final int LeftSquareBracket=23;
    public static final int ExclamationMarkEqualsSign=7;

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:62:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:63:2: (iv_ruleModel= ruleModel EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:64:2: iv_ruleModel= ruleModel EOF
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= Model ( (lv_name_1_0= ruleEString ) ) ( (lv_root_2_0= ruleFeature_Impl ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_root_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:74:28: ( (otherlv_0= Model ( (lv_name_1_0= ruleEString ) ) ( (lv_root_2_0= ruleFeature_Impl ) ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:75:1: (otherlv_0= Model ( (lv_name_1_0= ruleEString ) ) ( (lv_root_2_0= ruleFeature_Impl ) ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:75:1: (otherlv_0= Model ( (lv_name_1_0= ruleEString ) ) ( (lv_root_2_0= ruleFeature_Impl ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:76:2: otherlv_0= Model ( (lv_name_1_0= ruleEString ) ) ( (lv_root_2_0= ruleFeature_Impl ) )
            {
            otherlv_0=(Token)match(input,Model,FOLLOW_Model_in_ruleModel115); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:80:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:81:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:81:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:82:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleModel135);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:98:2: ( (lv_root_2_0= ruleFeature_Impl ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:99:1: (lv_root_2_0= ruleFeature_Impl )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:99:1: (lv_root_2_0= ruleFeature_Impl )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:100:3: lv_root_2_0= ruleFeature_Impl
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getRootFeature_ImplParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFeature_Impl_in_ruleModel156);
            lv_root_2_0=ruleFeature_Impl();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"root",
                    		lv_root_2_0, 
                    		"Feature_Impl");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSolitary"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:126:1: entryRuleSolitary returns [EObject current=null] : iv_ruleSolitary= ruleSolitary EOF ;
    public final EObject entryRuleSolitary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolitary = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:127:2: (iv_ruleSolitary= ruleSolitary EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:128:2: iv_ruleSolitary= ruleSolitary EOF
            {
             newCompositeNode(grammarAccess.getSolitaryRule()); 
            pushFollow(FOLLOW_ruleSolitary_in_entryRuleSolitary193);
            iv_ruleSolitary=ruleSolitary();

            state._fsp--;

             current =iv_ruleSolitary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolitary203); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:135:1: ruleSolitary returns [EObject current=null] : (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional ) ;
    public final EObject ruleSolitary() throws RecognitionException {
        EObject current = null;

        EObject this_Mandatory_0 = null;

        EObject this_Optional_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:138:28: ( (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:139:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:139:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_NULL||LA1_0==RULE_ID) ) {
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
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:140:5: this_Mandatory_0= ruleMandatory
                    {
                     
                            newCompositeNode(grammarAccess.getSolitaryAccess().getMandatoryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMandatory_in_ruleSolitary250);
                    this_Mandatory_0=ruleMandatory();

                    state._fsp--;


                            current = this_Mandatory_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:150:5: this_Optional_1= ruleOptional
                    {
                     
                            newCompositeNode(grammarAccess.getSolitaryAccess().getOptionalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOptional_in_ruleSolitary277);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:166:1: entryRuleConstrain returns [EObject current=null] : iv_ruleConstrain= ruleConstrain EOF ;
    public final EObject entryRuleConstrain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrain = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:167:2: (iv_ruleConstrain= ruleConstrain EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:168:2: iv_ruleConstrain= ruleConstrain EOF
            {
             newCompositeNode(grammarAccess.getConstrainRule()); 
            pushFollow(FOLLOW_ruleConstrain_in_entryRuleConstrain311);
            iv_ruleConstrain=ruleConstrain();

            state._fsp--;

             current =iv_ruleConstrain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstrain321); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:175:1: ruleConstrain returns [EObject current=null] : this_Disjunction_0= ruleDisjunction ;
    public final EObject ruleConstrain() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:178:28: (this_Disjunction_0= ruleDisjunction )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:180:5: this_Disjunction_0= ruleDisjunction
            {
             
                    newCompositeNode(grammarAccess.getConstrainAccess().getDisjunctionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleDisjunction_in_ruleConstrain367);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;


                    current = this_Disjunction_0;
                    afterParserOrEnumRuleCall();
                

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


    // $ANTLR start "entryRuleDisjunction"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:196:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:197:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:198:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
             newCompositeNode(grammarAccess.getDisjunctionRule()); 
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction400);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;

             current =iv_ruleDisjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction410); 

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
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:205:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        Enumerator lv_Operator_2_0 = null;

        EObject lv_rightExp_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:208:28: ( (this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:209:1: (this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:209:1: (this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:210:5: this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction457);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;


                    current = this_Conjunction_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:218:1: ( () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==VerticalLineVerticalLine) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:218:2: () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:218:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:219:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDisjunctionAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:224:2: ( (lv_Operator_2_0= ruleDisjunctiveOperator ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:225:1: (lv_Operator_2_0= ruleDisjunctiveOperator )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:225:1: (lv_Operator_2_0= ruleDisjunctiveOperator )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:226:3: lv_Operator_2_0= ruleDisjunctiveOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorDisjunctiveOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDisjunctiveOperator_in_ruleDisjunction487);
            	    lv_Operator_2_0=ruleDisjunctiveOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDisjunctionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"Operator",
            	            		lv_Operator_2_0, 
            	            		"DisjunctiveOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:242:2: ( (lv_rightExp_3_0= ruleConjunction ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:243:1: (lv_rightExp_3_0= ruleConjunction )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:243:1: (lv_rightExp_3_0= ruleConjunction )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:244:3: lv_rightExp_3_0= ruleConjunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightExpConjunctionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction508);
            	    lv_rightExp_3_0=ruleConjunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDisjunctionRule());
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
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:268:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:269:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:270:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction545);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction555); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:277:1: ruleConjunction returns [EObject current=null] : (this_Equality_0= ruleEquality ( () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Equality_0 = null;

        Enumerator lv_Operator_2_0 = null;

        EObject lv_rightExp_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:280:28: ( (this_Equality_0= ruleEquality ( () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:281:1: (this_Equality_0= ruleEquality ( () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:281:1: (this_Equality_0= ruleEquality ( () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:282:5: this_Equality_0= ruleEquality ( () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getConjunctionAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEquality_in_ruleConjunction602);
            this_Equality_0=ruleEquality();

            state._fsp--;


                    current = this_Equality_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:290:1: ( () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AmpersandAmpersand) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:290:2: () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:290:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:291:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConjunctionAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:296:2: ( (lv_Operator_2_0= ruleConjunctiveOperator ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:297:1: (lv_Operator_2_0= ruleConjunctiveOperator )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:297:1: (lv_Operator_2_0= ruleConjunctiveOperator )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:298:3: lv_Operator_2_0= ruleConjunctiveOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorConjunctiveOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConjunctiveOperator_in_ruleConjunction632);
            	    lv_Operator_2_0=ruleConjunctiveOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"Operator",
            	            		lv_Operator_2_0, 
            	            		"ConjunctiveOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:314:2: ( (lv_rightExp_3_0= ruleEquality ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:315:1: (lv_rightExp_3_0= ruleEquality )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:315:1: (lv_rightExp_3_0= ruleEquality )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:316:3: lv_rightExp_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightExpEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEquality_in_ruleConjunction653);
            	    lv_rightExp_3_0=ruleEquality();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExp",
            	            		lv_rightExp_3_0, 
            	            		"Equality");
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


    // $ANTLR start "entryRuleEquality"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:340:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:341:2: (iv_ruleEquality= ruleEquality EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:342:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality690);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality700); 

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:349:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        Enumerator lv_Operator_2_0 = null;

        EObject lv_rightExp_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:352:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:353:1: (this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:353:1: (this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:354:5: this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleEquality747);
            this_Comparison_0=ruleComparison();

            state._fsp--;


                    current = this_Comparison_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:362:1: ( () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ExclamationMarkEqualsSign||LA4_0==EqualsSignEqualsSign) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:362:2: () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:362:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:363:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:368:2: ( (lv_Operator_2_0= ruleEqualityOperator ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:369:1: (lv_Operator_2_0= ruleEqualityOperator )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:369:1: (lv_Operator_2_0= ruleEqualityOperator )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:370:3: lv_Operator_2_0= ruleEqualityOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqualityOperator_in_ruleEquality777);
            	    lv_Operator_2_0=ruleEqualityOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"Operator",
            	            		lv_Operator_2_0, 
            	            		"EqualityOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:386:2: ( (lv_rightExp_3_0= ruleComparison ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:387:1: (lv_rightExp_3_0= ruleComparison )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:387:1: (lv_rightExp_3_0= ruleComparison )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:388:3: lv_rightExp_3_0= ruleComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightExpComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparison_in_ruleEquality798);
            	    lv_rightExp_3_0=ruleComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
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
            	    break loop4;
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:412:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:413:2: (iv_ruleComparison= ruleComparison EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:414:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison835);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison845); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:421:1: ruleComparison returns [EObject current=null] : (this_Binary_0= ruleBinary ( () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_Binary_0 = null;

        Enumerator lv_Operator_2_0 = null;

        EObject lv_rightExp_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:424:28: ( (this_Binary_0= ruleBinary ( () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:425:1: (this_Binary_0= ruleBinary ( () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:425:1: (this_Binary_0= ruleBinary ( () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:426:5: this_Binary_0= ruleBinary ( () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonAccess().getBinaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBinary_in_ruleComparison892);
            this_Binary_0=ruleBinary();

            state._fsp--;


                    current = this_Binary_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:434:1: ( () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==LessThanSignEqualsSign||LA5_0==GreaterThanSignEqualsSign||(LA5_0>=LessThanSign && LA5_0<=GreaterThanSign)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:434:2: () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:434:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:435:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparisonAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:440:2: ( (lv_Operator_2_0= ruleComparativeOperator ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:441:1: (lv_Operator_2_0= ruleComparativeOperator )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:441:1: (lv_Operator_2_0= ruleComparativeOperator )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:442:3: lv_Operator_2_0= ruleComparativeOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparativeOperator_in_ruleComparison922);
            	    lv_Operator_2_0=ruleComparativeOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"Operator",
            	            		lv_Operator_2_0, 
            	            		"ComparativeOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:458:2: ( (lv_rightExp_3_0= ruleBinary ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:459:1: (lv_rightExp_3_0= ruleBinary )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:459:1: (lv_rightExp_3_0= ruleBinary )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:460:3: lv_rightExp_3_0= ruleBinary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getRightExpBinaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBinary_in_ruleComparison943);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:484:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:485:2: (iv_ruleBinary= ruleBinary EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:486:2: iv_ruleBinary= ruleBinary EOF
            {
             newCompositeNode(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_ruleBinary_in_entryRuleBinary980);
            iv_ruleBinary=ruleBinary();

            state._fsp--;

             current =iv_ruleBinary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinary990); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:493:1: ruleBinary returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )* ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject lv_rightExp_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:496:28: ( (this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:497:1: (this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:497:1: (this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:498:5: this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinaryAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleBinary1037);
            this_Primary_0=rulePrimary();

            state._fsp--;


                    current = this_Primary_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:506:1: ( () ( (lv_rightExp_2_0= rulePrimary ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=ExclamationMark && LA6_0<=LeftParenthesis)||LA6_0==HyphenMinus||LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:506:2: () ( (lv_rightExp_2_0= rulePrimary ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:506:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:507:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:512:2: ( (lv_rightExp_2_0= rulePrimary ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:513:1: (lv_rightExp_2_0= rulePrimary )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:513:1: (lv_rightExp_2_0= rulePrimary )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:514:3: lv_rightExp_2_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryAccess().getRightExpPrimaryParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleBinary1067);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:538:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:539:2: (iv_rulePrimary= rulePrimary EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:540:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1104);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1114); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:547:1: rulePrimary returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) | (otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis ) | this_Unary_4= ruleUnary | (otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_AttributeConstrain_2 = null;

        EObject this_Unary_4 = null;

        EObject this_Constrain_6 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:550:28: ( ( ( ( ruleQualifiedName ) ) | (otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis ) | this_Unary_4= ruleUnary | (otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:551:1: ( ( ( ruleQualifiedName ) ) | (otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis ) | this_Unary_4= ruleUnary | (otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:551:1: ( ( ( ruleQualifiedName ) ) | (otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis ) | this_Unary_4= ruleUnary | (otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case LeftParenthesis:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==RightParenthesis) ) {
                        alt7=2;
                    }
                    else if ( ((LA7_4>=ExclamationMarkEqualsSign && LA7_4<=GreaterThanSignEqualsSign)||(LA7_4>=VerticalLineVerticalLine && LA7_4<=LeftParenthesis)||(LA7_4>=HyphenMinus && LA7_4<=GreaterThanSign)||LA7_4==RULE_ID) ) {
                        alt7=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_NULL:
                case RULE_BOOLEAN:
                case RULE_INT:
                    {
                    alt7=2;
                    }
                    break;
                case ExclamationMark:
                case LeftParenthesis:
                case HyphenMinus:
                    {
                    alt7=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }

                }
                break;
            case ExclamationMark:
            case HyphenMinus:
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
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:551:2: ( ( ruleQualifiedName ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:551:2: ( ( ruleQualifiedName ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:552:1: ( ruleQualifiedName )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:552:1: ( ruleQualifiedName )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:553:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getFeatureReferenceGroupedCrossReference_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimary1162);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:567:6: (otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:567:6: (otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:568:2: otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulePrimary1182); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAttributeConstrainParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleAttributeConstrain_in_rulePrimary1203);
                    this_AttributeConstrain_2=ruleAttributeConstrain();

                    state._fsp--;


                            current = this_AttributeConstrain_2;
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulePrimary1215); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:588:5: this_Unary_4= ruleUnary
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUnary_in_rulePrimary1243);
                    this_Unary_4=ruleUnary();

                    state._fsp--;


                            current = this_Unary_4;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:597:6: (otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:597:6: (otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:598:2: otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis
                    {
                    otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulePrimary1262); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getConstrainParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleConstrain_in_rulePrimary1283);
                    this_Constrain_6=ruleConstrain();

                    state._fsp--;


                            current = this_Constrain_6;
                            afterParserOrEnumRuleCall();
                        
                    otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulePrimary1295); 

                        	newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2());
                        

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


    // $ANTLR start "entryRuleAttributeConstrain"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:624:1: entryRuleAttributeConstrain returns [EObject current=null] : iv_ruleAttributeConstrain= ruleAttributeConstrain EOF ;
    public final EObject entryRuleAttributeConstrain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeConstrain = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:625:2: (iv_ruleAttributeConstrain= ruleAttributeConstrain EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:626:2: iv_ruleAttributeConstrain= ruleAttributeConstrain EOF
            {
             newCompositeNode(grammarAccess.getAttributeConstrainRule()); 
            pushFollow(FOLLOW_ruleAttributeConstrain_in_entryRuleAttributeConstrain1330);
            iv_ruleAttributeConstrain=ruleAttributeConstrain();

            state._fsp--;

             current =iv_ruleAttributeConstrain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeConstrain1340); 

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
    // $ANTLR end "entryRuleAttributeConstrain"


    // $ANTLR start "ruleAttributeConstrain"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:633:1: ruleAttributeConstrain returns [EObject current=null] : ( (lv_constrainValue_0_0= ruleAttribute ) ) ;
    public final EObject ruleAttributeConstrain() throws RecognitionException {
        EObject current = null;

        EObject lv_constrainValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:636:28: ( ( (lv_constrainValue_0_0= ruleAttribute ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:637:1: ( (lv_constrainValue_0_0= ruleAttribute ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:637:1: ( (lv_constrainValue_0_0= ruleAttribute ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:638:1: (lv_constrainValue_0_0= ruleAttribute )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:638:1: (lv_constrainValue_0_0= ruleAttribute )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:639:3: lv_constrainValue_0_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getAttributeConstrainAccess().getConstrainValueAttributeParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeConstrain1385);
            lv_constrainValue_0_0=ruleAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeConstrainRule());
            	        }
                   		set(
                   			current, 
                   			"constrainValue",
                    		lv_constrainValue_0_0, 
                    		"Attribute");
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
    // $ANTLR end "ruleAttributeConstrain"


    // $ANTLR start "entryRuleUnary"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:663:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:664:2: (iv_ruleUnary= ruleUnary EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:665:2: iv_ruleUnary= ruleUnary EOF
            {
             newCompositeNode(grammarAccess.getUnaryRule()); 
            pushFollow(FOLLOW_ruleUnary_in_entryRuleUnary1419);
            iv_ruleUnary=ruleUnary();

            state._fsp--;

             current =iv_ruleUnary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary1429); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:672:1: ruleUnary returns [EObject current=null] : ( () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) ) ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Token lv_Operator_1_1=null;
        Token lv_Operator_1_2=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:675:28: ( ( () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:676:1: ( () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:676:1: ( () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:676:2: () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:676:2: ()
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:677:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnaryAccess().getUnaryAction_0(),
                        current);
                

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:682:2: ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:683:1: ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:683:1: ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:684:1: (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:684:1: (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus )
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
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:685:3: lv_Operator_1_1= ExclamationMark
                    {
                    lv_Operator_1_1=(Token)match(input,ExclamationMark,FOLLOW_ExclamationMark_in_ruleUnary1484); 

                            newLeafNode(lv_Operator_1_1, grammarAccess.getUnaryAccess().getOperatorExclamationMarkKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnaryRule());
                    	        }
                           		setWithLastConsumed(current, "Operator", lv_Operator_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:698:8: lv_Operator_1_2= HyphenMinus
                    {
                    lv_Operator_1_2=(Token)match(input,HyphenMinus,FOLLOW_HyphenMinus_in_ruleUnary1512); 

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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:714:2: ( (lv_exp_2_0= rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:715:1: (lv_exp_2_0= rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:715:1: (lv_exp_2_0= rulePrimary )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:716:3: lv_exp_2_0= rulePrimary
            {
             
            	        newCompositeNode(grammarAccess.getUnaryAccess().getExpPrimaryParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePrimary_in_ruleUnary1547);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:740:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:741:1: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:742:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1583);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1594); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:749:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:753:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:754:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:754:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:754:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1634); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:761:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==FullStop) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:762:2: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleQualifiedName1653); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1668); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleGroup"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:782:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:783:2: (iv_ruleGroup= ruleGroup EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:784:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup1714);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup1724); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:791:1: ruleGroup returns [EObject current=null] : (this_Or_0= ruleOr | this_Xor_1= ruleXor ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;

        EObject this_Xor_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:794:28: ( (this_Or_0= ruleOr | this_Xor_1= ruleXor ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:795:1: (this_Or_0= ruleOr | this_Xor_1= ruleXor )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:795:1: (this_Or_0= ruleOr | this_Xor_1= ruleXor )
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
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:796:5: this_Or_0= ruleOr
                    {
                     
                            newCompositeNode(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOr_in_ruleGroup1771);
                    this_Or_0=ruleOr();

                    state._fsp--;


                            current = this_Or_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:806:5: this_Xor_1= ruleXor
                    {
                     
                            newCompositeNode(grammarAccess.getGroupAccess().getXorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleXor_in_ruleGroup1798);
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


    // $ANTLR start "entryRuleAttribute"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:822:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:823:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:824:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1832);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1842); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:831:1: ruleAttribute returns [EObject current=null] : (this_CString_0= ruleCString | this_Number_1= ruleNumber | this_Range_2= ruleRange | this_CBoolean_3= ruleCBoolean ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_CString_0 = null;

        EObject this_Number_1 = null;

        EObject this_Range_2 = null;

        EObject this_CBoolean_3 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:834:28: ( (this_CString_0= ruleCString | this_Number_1= ruleNumber | this_Range_2= ruleRange | this_CBoolean_3= ruleCBoolean ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:835:1: (this_CString_0= ruleCString | this_Number_1= ruleNumber | this_Range_2= ruleRange | this_CBoolean_3= ruleCBoolean )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:835:1: (this_CString_0= ruleCString | this_Number_1= ruleNumber | this_Range_2= ruleRange | this_CBoolean_3= ruleCBoolean )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_NULL:
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_INT:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_INT) ) {
                    alt11=3;
                }
                else if ( (LA11_2==EOF||LA11_2==RightParenthesis) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:836:5: this_CString_0= ruleCString
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getCStringParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCString_in_ruleAttribute1889);
                    this_CString_0=ruleCString();

                    state._fsp--;


                            current = this_CString_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:846:5: this_Number_1= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleAttribute1916);
                    this_Number_1=ruleNumber();

                    state._fsp--;


                            current = this_Number_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:856:5: this_Range_2= ruleRange
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getRangeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRange_in_ruleAttribute1943);
                    this_Range_2=ruleRange();

                    state._fsp--;


                            current = this_Range_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:866:5: this_CBoolean_3= ruleCBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getCBooleanParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCBoolean_in_ruleAttribute1970);
                    this_CBoolean_3=ruleCBoolean();

                    state._fsp--;


                            current = this_CBoolean_3;
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRange"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:882:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:883:2: (iv_ruleRange= ruleRange EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:884:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange2004);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange2014); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:891:1: ruleRange returns [EObject current=null] : ( ( (lv_lower_0_0= RULE_INT ) ) ( (lv_upper_1_0= RULE_INT ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token lv_lower_0_0=null;
        Token lv_upper_1_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:894:28: ( ( ( (lv_lower_0_0= RULE_INT ) ) ( (lv_upper_1_0= RULE_INT ) ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:895:1: ( ( (lv_lower_0_0= RULE_INT ) ) ( (lv_upper_1_0= RULE_INT ) ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:895:1: ( ( (lv_lower_0_0= RULE_INT ) ) ( (lv_upper_1_0= RULE_INT ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:895:2: ( (lv_lower_0_0= RULE_INT ) ) ( (lv_upper_1_0= RULE_INT ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:895:2: ( (lv_lower_0_0= RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:896:1: (lv_lower_0_0= RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:896:1: (lv_lower_0_0= RULE_INT )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:897:3: lv_lower_0_0= RULE_INT
            {
            lv_lower_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange2056); 

            			newLeafNode(lv_lower_0_0, grammarAccess.getRangeAccess().getLowerINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lower",
                    		lv_lower_0_0, 
                    		"INT");
            	    

            }


            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:913:2: ( (lv_upper_1_0= RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:914:1: (lv_upper_1_0= RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:914:1: (lv_upper_1_0= RULE_INT )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:915:3: lv_upper_1_0= RULE_INT
            {
            lv_upper_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange2078); 

            			newLeafNode(lv_upper_1_0, grammarAccess.getRangeAccess().getUpperINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"upper",
                    		lv_upper_1_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleCString"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:939:1: entryRuleCString returns [EObject current=null] : iv_ruleCString= ruleCString EOF ;
    public final EObject entryRuleCString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCString = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:940:2: (iv_ruleCString= ruleCString EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:941:2: iv_ruleCString= ruleCString EOF
            {
             newCompositeNode(grammarAccess.getCStringRule()); 
            pushFollow(FOLLOW_ruleCString_in_entryRuleCString2118);
            iv_ruleCString=ruleCString();

            state._fsp--;

             current =iv_ruleCString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCString2128); 

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
    // $ANTLR end "entryRuleCString"


    // $ANTLR start "ruleCString"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:948:1: ruleCString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleCString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:951:28: ( ( (lv_value_0_0= ruleEString ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:952:1: ( (lv_value_0_0= ruleEString ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:952:1: ( (lv_value_0_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:953:1: (lv_value_0_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:953:1: (lv_value_0_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:954:3: lv_value_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCStringAccess().getValueEStringParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleCString2173);
            lv_value_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCStringRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EString");
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
    // $ANTLR end "ruleCString"


    // $ANTLR start "entryRuleCBoolean"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:978:1: entryRuleCBoolean returns [EObject current=null] : iv_ruleCBoolean= ruleCBoolean EOF ;
    public final EObject entryRuleCBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCBoolean = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:979:2: (iv_ruleCBoolean= ruleCBoolean EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:980:2: iv_ruleCBoolean= ruleCBoolean EOF
            {
             newCompositeNode(grammarAccess.getCBooleanRule()); 
            pushFollow(FOLLOW_ruleCBoolean_in_entryRuleCBoolean2207);
            iv_ruleCBoolean=ruleCBoolean();

            state._fsp--;

             current =iv_ruleCBoolean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCBoolean2217); 

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
    // $ANTLR end "entryRuleCBoolean"


    // $ANTLR start "ruleCBoolean"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:987:1: ruleCBoolean returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleCBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:990:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:991:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:991:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:992:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:992:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:993:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleCBoolean2258); 

            			newLeafNode(lv_value_0_0, grammarAccess.getCBooleanAccess().getValueBOOLEANTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCBooleanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"BOOLEAN");
            	    

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
    // $ANTLR end "ruleCBoolean"


    // $ANTLR start "entryRuleNumber"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1017:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1018:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1019:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2297);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2307); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1026:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1029:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1030:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1030:1: ( (lv_value_0_0= RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1031:1: (lv_value_0_0= RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1031:1: (lv_value_0_0= RULE_INT )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1032:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber2348); 

            			newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1056:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1057:1: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1058:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString2388);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString2399); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1065:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_NULL_1= RULE_NULL ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_NULL_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1069:6: ( (this_ID_0= RULE_ID | this_NULL_1= RULE_NULL ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1070:1: (this_ID_0= RULE_ID | this_NULL_1= RULE_NULL )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1070:1: (this_ID_0= RULE_ID | this_NULL_1= RULE_NULL )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_NULL) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1070:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString2439); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1078:10: this_NULL_1= RULE_NULL
                    {
                    this_NULL_1=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleEString2465); 

                    		current.merge(this_NULL_1);
                        
                     
                        newLeafNode(this_NULL_1, grammarAccess.getEStringAccess().getNULLTerminalRuleCall_1()); 
                        

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1093:1: entryRuleFeature_Impl returns [EObject current=null] : iv_ruleFeature_Impl= ruleFeature_Impl EOF ;
    public final EObject entryRuleFeature_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature_Impl = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1094:2: (iv_ruleFeature_Impl= ruleFeature_Impl EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1095:2: iv_ruleFeature_Impl= ruleFeature_Impl EOF
            {
             newCompositeNode(grammarAccess.getFeature_ImplRule()); 
            pushFollow(FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl2509);
            iv_ruleFeature_Impl=ruleFeature_Impl();

            state._fsp--;

             current =iv_ruleFeature_Impl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature_Impl2519); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1102:1: ruleFeature_Impl returns [EObject current=null] : (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1105:28: ( (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1106:1: (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1106:1: (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1107:2: otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )?
            {
            otherlv_0=(Token)match(input,Feature,FOLLOW_Feature_in_ruleFeature_Impl2557); 

                	newLeafNode(otherlv_0, grammarAccess.getFeature_ImplAccess().getFeatureKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1111:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1112:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1112:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1113:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleFeature_Impl2577);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1129:2: (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BEGIN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1129:3: this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleFeature_Impl2589); 
                     
                        newLeafNode(this_BEGIN_2, grammarAccess.getFeature_ImplAccess().getBEGINTerminalRuleCall_2_0()); 
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1133:1: ( (lv_subfeature_3_0= ruleSolitary ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1134:1: (lv_subfeature_3_0= ruleSolitary )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1134:1: (lv_subfeature_3_0= ruleSolitary )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1135:3: lv_subfeature_3_0= ruleSolitary
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSolitary_in_ruleFeature_Impl2609);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1151:2: ( (lv_subfeature_4_0= ruleSolitary ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==QuestionMark||LA13_0==RULE_NULL||LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1152:1: (lv_subfeature_4_0= ruleSolitary )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1152:1: (lv_subfeature_4_0= ruleSolitary )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1153:3: lv_subfeature_4_0= ruleSolitary
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSolitary_in_ruleFeature_Impl2630);
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
                    	    break loop13;
                        }
                    } while (true);

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleFeature_Impl2642); 
                     
                        newLeafNode(this_END_5, grammarAccess.getFeature_ImplAccess().getENDTerminalRuleCall_2_3()); 
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1173:3: (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LeftSquareBracket) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1174:2: otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleFeature_Impl2657); 

                        	newLeafNode(otherlv_6, grammarAccess.getFeature_ImplAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1178:1: ( (lv_constrains_7_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1179:1: (lv_constrains_7_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1179:1: (lv_constrains_7_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1180:3: lv_constrains_7_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleFeature_Impl2677);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1196:2: (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==Comma) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1197:2: otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_Comma_in_ruleFeature_Impl2691); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getFeature_ImplAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1201:1: ( (lv_constrains_9_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1202:1: (lv_constrains_9_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1202:1: (lv_constrains_9_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1203:3: lv_constrains_9_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleFeature_Impl2711);
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleFeature_Impl2726); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1232:1: entryRuleGrouped returns [EObject current=null] : iv_ruleGrouped= ruleGrouped EOF ;
    public final EObject entryRuleGrouped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouped = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1233:2: (iv_ruleGrouped= ruleGrouped EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1234:2: iv_ruleGrouped= ruleGrouped EOF
            {
             newCompositeNode(grammarAccess.getGroupedRule()); 
            pushFollow(FOLLOW_ruleGrouped_in_entryRuleGrouped2762);
            iv_ruleGrouped=ruleGrouped();

            state._fsp--;

             current =iv_ruleGrouped; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouped2772); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1241:1: ruleGrouped returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis )? (otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket )? ) ;
    public final EObject ruleGrouped() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_attribute_2_0 = null;

        EObject lv_constrains_5_0 = null;

        EObject lv_constrains_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1244:28: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis )? (otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1245:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis )? (otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1245:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis )? (otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1245:2: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis )? (otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket )?
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1245:2: ( (lv_name_0_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1246:1: (lv_name_0_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1246:1: (lv_name_0_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1247:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupedAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleGrouped2818);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1263:2: (otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LeftParenthesis) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1264:2: otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleGrouped2832); 

                        	newLeafNode(otherlv_1, grammarAccess.getGroupedAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1268:1: ( (lv_attribute_2_0= ruleAttribute ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1269:1: (lv_attribute_2_0= ruleAttribute )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1269:1: (lv_attribute_2_0= ruleAttribute )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1270:3: lv_attribute_2_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupedAccess().getAttributeAttributeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribute_in_ruleGrouped2852);
                    lv_attribute_2_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupedRule());
                    	        }
                           		set(
                           			current, 
                           			"attribute",
                            		lv_attribute_2_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleGrouped2865); 

                        	newLeafNode(otherlv_3, grammarAccess.getGroupedAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1291:3: (otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftSquareBracket) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1292:2: otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket
                    {
                    otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleGrouped2880); 

                        	newLeafNode(otherlv_4, grammarAccess.getGroupedAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1296:1: ( (lv_constrains_5_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1297:1: (lv_constrains_5_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1297:1: (lv_constrains_5_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1298:3: lv_constrains_5_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleGrouped2900);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1314:2: (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Comma) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1315:2: otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) )
                    	    {
                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGrouped2914); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getGroupedAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1319:1: ( (lv_constrains_7_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1320:1: (lv_constrains_7_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1320:1: (lv_constrains_7_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1321:3: lv_constrains_7_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleGrouped2934);
                    	    lv_constrains_7_0=ruleConstrain();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGroupedRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constrains",
                    	            		lv_constrains_7_0, 
                    	            		"Constrain");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleGrouped2949); 

                        	newLeafNode(otherlv_8, grammarAccess.getGroupedAccess().getRightSquareBracketKeyword_2_3());
                        

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1350:1: entryRuleMandatory returns [EObject current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final EObject entryRuleMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatory = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1351:2: (iv_ruleMandatory= ruleMandatory EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1352:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory2985);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory2995); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1359:1: ruleMandatory returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis )? (otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket )? ( ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )* )? ) ;
    public final EObject ruleMandatory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_subfeature_2_0 = null;

        EObject lv_subfeature_4_0 = null;

        EObject lv_attribute_7_0 = null;

        EObject lv_constrains_10_0 = null;

        EObject lv_constrains_12_0 = null;

        EObject lv_groups_14_0 = null;

        EObject lv_groups_15_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1362:28: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis )? (otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket )? ( ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )* )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1363:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis )? (otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket )? ( ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )* )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1363:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis )? (otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket )? ( ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )* )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1363:2: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis )? (otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket )? ( ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )* )?
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1363:2: ( (lv_name_0_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1364:1: (lv_name_0_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1364:1: (lv_name_0_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1365:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleMandatory3041);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1381:2: (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LeftCurlyBracket) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1382:2: otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket
                    {
                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleMandatory3055); 

                        	newLeafNode(otherlv_1, grammarAccess.getMandatoryAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1386:1: ( (lv_subfeature_2_0= ruleSolitary ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1387:1: (lv_subfeature_2_0= ruleSolitary )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1387:1: (lv_subfeature_2_0= ruleSolitary )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1388:3: lv_subfeature_2_0= ruleSolitary
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSolitary_in_ruleMandatory3075);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1404:2: (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Comma) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1405:2: otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_Comma_in_ruleMandatory3089); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getMandatoryAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1409:1: ( (lv_subfeature_4_0= ruleSolitary ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1410:1: (lv_subfeature_4_0= ruleSolitary )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1410:1: (lv_subfeature_4_0= ruleSolitary )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1411:3: lv_subfeature_4_0= ruleSolitary
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSolitary_in_ruleMandatory3109);
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleMandatory3124); 

                        	newLeafNode(otherlv_5, grammarAccess.getMandatoryAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1432:3: (otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LeftParenthesis) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1433:2: otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis
                    {
                    otherlv_6=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleMandatory3139); 

                        	newLeafNode(otherlv_6, grammarAccess.getMandatoryAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1437:1: ( (lv_attribute_7_0= ruleAttribute ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1438:1: (lv_attribute_7_0= ruleAttribute )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1438:1: (lv_attribute_7_0= ruleAttribute )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1439:3: lv_attribute_7_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getAttributeAttributeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribute_in_ruleMandatory3159);
                    lv_attribute_7_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
                    	        }
                           		set(
                           			current, 
                           			"attribute",
                            		lv_attribute_7_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleMandatory3172); 

                        	newLeafNode(otherlv_8, grammarAccess.getMandatoryAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1460:3: (otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftSquareBracket) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1461:2: otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket
                    {
                    otherlv_9=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleMandatory3187); 

                        	newLeafNode(otherlv_9, grammarAccess.getMandatoryAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1465:1: ( (lv_constrains_10_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1466:1: (lv_constrains_10_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1466:1: (lv_constrains_10_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1467:3: lv_constrains_10_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleMandatory3207);
                    lv_constrains_10_0=ruleConstrain();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
                    	        }
                           		add(
                           			current, 
                           			"constrains",
                            		lv_constrains_10_0, 
                            		"Constrain");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1483:2: (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==Comma) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1484:2: otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FOLLOW_Comma_in_ruleMandatory3221); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getMandatoryAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1488:1: ( (lv_constrains_12_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1489:1: (lv_constrains_12_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1489:1: (lv_constrains_12_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1490:3: lv_constrains_12_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleMandatory3241);
                    	    lv_constrains_12_0=ruleConstrain();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constrains",
                    	            		lv_constrains_12_0, 
                    	            		"Constrain");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleMandatory3256); 

                        	newLeafNode(otherlv_13, grammarAccess.getMandatoryAccess().getRightSquareBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1511:3: ( ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Xor||LA26_0==Or) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1511:4: ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )*
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1511:4: ( (lv_groups_14_0= ruleGroup ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1512:1: (lv_groups_14_0= ruleGroup )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1512:1: (lv_groups_14_0= ruleGroup )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1513:3: lv_groups_14_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGroup_in_ruleMandatory3279);
                    lv_groups_14_0=ruleGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
                    	        }
                           		add(
                           			current, 
                           			"groups",
                            		lv_groups_14_0, 
                            		"Group");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1529:2: ( (lv_groups_15_0= ruleGroup ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==Xor||LA25_0==Or) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1530:1: (lv_groups_15_0= ruleGroup )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1530:1: (lv_groups_15_0= ruleGroup )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1531:3: lv_groups_15_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGroup_in_ruleMandatory3300);
                    	    lv_groups_15_0=ruleGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"groups",
                    	            		lv_groups_15_0, 
                    	            		"Group");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1555:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1556:2: (iv_ruleOptional= ruleOptional EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1557:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional3338);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional3348); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1564:1: ruleOptional returns [EObject current=null] : (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis )? (otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket )? ( ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )* )? ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_subfeature_3_0 = null;

        EObject lv_subfeature_5_0 = null;

        EObject lv_attribute_8_0 = null;

        EObject lv_constrains_11_0 = null;

        EObject lv_constrains_13_0 = null;

        EObject lv_groups_15_0 = null;

        EObject lv_groups_16_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1567:28: ( (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis )? (otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket )? ( ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )* )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1568:1: (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis )? (otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket )? ( ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )* )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1568:1: (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis )? (otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket )? ( ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )* )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1569:2: otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis )? (otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket )? ( ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )* )?
            {
            otherlv_0=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ruleOptional3386); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1573:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1574:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1574:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1575:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOptionalAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleOptional3406);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1591:2: (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LeftCurlyBracket) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1592:2: otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket
                    {
                    otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleOptional3420); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionalAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1596:1: ( (lv_subfeature_3_0= ruleSolitary ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1597:1: (lv_subfeature_3_0= ruleSolitary )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1597:1: (lv_subfeature_3_0= ruleSolitary )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1598:3: lv_subfeature_3_0= ruleSolitary
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSolitary_in_ruleOptional3440);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1614:2: (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==Comma) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1615:2: otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleOptional3454); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getOptionalAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1619:1: ( (lv_subfeature_5_0= ruleSolitary ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1620:1: (lv_subfeature_5_0= ruleSolitary )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1620:1: (lv_subfeature_5_0= ruleSolitary )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1621:3: lv_subfeature_5_0= ruleSolitary
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSolitary_in_ruleOptional3474);
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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleOptional3489); 

                        	newLeafNode(otherlv_6, grammarAccess.getOptionalAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1642:3: (otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LeftParenthesis) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1643:2: otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis
                    {
                    otherlv_7=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleOptional3504); 

                        	newLeafNode(otherlv_7, grammarAccess.getOptionalAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1647:1: ( (lv_attribute_8_0= ruleAttribute ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1648:1: (lv_attribute_8_0= ruleAttribute )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1648:1: (lv_attribute_8_0= ruleAttribute )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1649:3: lv_attribute_8_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getAttributeAttributeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribute_in_ruleOptional3524);
                    lv_attribute_8_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionalRule());
                    	        }
                           		set(
                           			current, 
                           			"attribute",
                            		lv_attribute_8_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleOptional3537); 

                        	newLeafNode(otherlv_9, grammarAccess.getOptionalAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1670:3: (otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LeftSquareBracket) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1671:2: otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket
                    {
                    otherlv_10=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleOptional3552); 

                        	newLeafNode(otherlv_10, grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1675:1: ( (lv_constrains_11_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1676:1: (lv_constrains_11_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1676:1: (lv_constrains_11_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1677:3: lv_constrains_11_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleOptional3572);
                    lv_constrains_11_0=ruleConstrain();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionalRule());
                    	        }
                           		add(
                           			current, 
                           			"constrains",
                            		lv_constrains_11_0, 
                            		"Constrain");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1693:2: (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==Comma) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1694:2: otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_Comma_in_ruleOptional3586); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getOptionalAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1698:1: ( (lv_constrains_13_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1699:1: (lv_constrains_13_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1699:1: (lv_constrains_13_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1700:3: lv_constrains_13_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleOptional3606);
                    	    lv_constrains_13_0=ruleConstrain();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOptionalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constrains",
                    	            		lv_constrains_13_0, 
                    	            		"Constrain");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleOptional3621); 

                        	newLeafNode(otherlv_14, grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1721:3: ( ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Xor||LA33_0==Or) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1721:4: ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )*
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1721:4: ( (lv_groups_15_0= ruleGroup ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1722:1: (lv_groups_15_0= ruleGroup )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1722:1: (lv_groups_15_0= ruleGroup )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1723:3: lv_groups_15_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGroup_in_ruleOptional3644);
                    lv_groups_15_0=ruleGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionalRule());
                    	        }
                           		add(
                           			current, 
                           			"groups",
                            		lv_groups_15_0, 
                            		"Group");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1739:2: ( (lv_groups_16_0= ruleGroup ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==Xor||LA32_0==Or) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1740:1: (lv_groups_16_0= ruleGroup )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1740:1: (lv_groups_16_0= ruleGroup )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1741:3: lv_groups_16_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGroup_in_ruleOptional3665);
                    	    lv_groups_16_0=ruleGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOptionalRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"groups",
                    	            		lv_groups_16_0, 
                    	            		"Group");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1765:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1766:2: (iv_ruleOr= ruleOr EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1767:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr3703);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr3713); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1774:1: ruleOr returns [EObject current=null] : (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1777:28: ( (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1778:1: (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1778:1: (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1779:2: otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            {
            otherlv_0=(Token)match(input,Or,FOLLOW_Or_in_ruleOr3751); 

                	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1783:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1784:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1784:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1785:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleOr3771);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1801:2: (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_BEGIN) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1801:3: this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleOr3783); 
                     
                        newLeafNode(this_BEGIN_2, grammarAccess.getOrAccess().getBEGINTerminalRuleCall_2_0()); 
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1805:1: ( (lv_grouped_3_0= ruleGrouped ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1806:1: (lv_grouped_3_0= ruleGrouped )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1806:1: (lv_grouped_3_0= ruleGrouped )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1807:3: lv_grouped_3_0= ruleGrouped
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouped_in_ruleOr3803);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1823:2: ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==Comma||LA35_0==RULE_NULL||LA35_0==RULE_ID) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1823:3: (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1823:3: (otherlv_4= Comma )*
                    	    loop34:
                    	    do {
                    	        int alt34=2;
                    	        int LA34_0 = input.LA(1);

                    	        if ( (LA34_0==Comma) ) {
                    	            alt34=1;
                    	        }


                    	        switch (alt34) {
                    	    	case 1 :
                    	    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1824:2: otherlv_4= Comma
                    	    	    {
                    	    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleOr3818); 

                    	    	        	newLeafNode(otherlv_4, grammarAccess.getOrAccess().getCommaKeyword_2_2_0());
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop34;
                    	        }
                    	    } while (true);

                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1828:3: ( (lv_grouped_5_0= ruleGrouped ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1829:1: (lv_grouped_5_0= ruleGrouped )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1829:1: (lv_grouped_5_0= ruleGrouped )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1830:3: lv_grouped_5_0= ruleGrouped
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGrouped_in_ruleOr3840);
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
                    	    break loop35;
                        }
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleOr3853); 
                     
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1858:1: entryRuleXor returns [EObject current=null] : iv_ruleXor= ruleXor EOF ;
    public final EObject entryRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXor = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1859:2: (iv_ruleXor= ruleXor EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1860:2: iv_ruleXor= ruleXor EOF
            {
             newCompositeNode(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_ruleXor_in_entryRuleXor3889);
            iv_ruleXor=ruleXor();

            state._fsp--;

             current =iv_ruleXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXor3899); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1867:1: ruleXor returns [EObject current=null] : (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1870:28: ( (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1871:1: (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1871:1: (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1872:2: otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            {
            otherlv_0=(Token)match(input,Xor,FOLLOW_Xor_in_ruleXor3937); 

                	newLeafNode(otherlv_0, grammarAccess.getXorAccess().getXorKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1876:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1877:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1877:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1878:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getXorAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleXor3957);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1894:2: (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_BEGIN) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1894:3: this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleXor3969); 
                     
                        newLeafNode(this_BEGIN_2, grammarAccess.getXorAccess().getBEGINTerminalRuleCall_2_0()); 
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1898:1: ( (lv_grouped_3_0= ruleGrouped ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1899:1: (lv_grouped_3_0= ruleGrouped )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1899:1: (lv_grouped_3_0= ruleGrouped )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1900:3: lv_grouped_3_0= ruleGrouped
                    {
                     
                    	        newCompositeNode(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouped_in_ruleXor3989);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1916:2: ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==Comma||LA38_0==RULE_NULL||LA38_0==RULE_ID) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1916:3: (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1916:3: (otherlv_4= Comma )*
                    	    loop37:
                    	    do {
                    	        int alt37=2;
                    	        int LA37_0 = input.LA(1);

                    	        if ( (LA37_0==Comma) ) {
                    	            alt37=1;
                    	        }


                    	        switch (alt37) {
                    	    	case 1 :
                    	    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1917:2: otherlv_4= Comma
                    	    	    {
                    	    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleXor4004); 

                    	    	        	newLeafNode(otherlv_4, grammarAccess.getXorAccess().getCommaKeyword_2_2_0());
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop37;
                    	        }
                    	    } while (true);

                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1921:3: ( (lv_grouped_5_0= ruleGrouped ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1922:1: (lv_grouped_5_0= ruleGrouped )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1922:1: (lv_grouped_5_0= ruleGrouped )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1923:3: lv_grouped_5_0= ruleGrouped
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGrouped_in_ruleXor4026);
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
                    	    break loop38;
                        }
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleXor4039); 
                     
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


    // $ANTLR start "ruleDisjunctiveOperator"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1951:1: ruleDisjunctiveOperator returns [Enumerator current=null] : (enumLiteral_0= VerticalLineVerticalLine ) ;
    public final Enumerator ruleDisjunctiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1953:28: ( (enumLiteral_0= VerticalLineVerticalLine ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1954:1: (enumLiteral_0= VerticalLineVerticalLine )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1954:1: (enumLiteral_0= VerticalLineVerticalLine )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1954:6: enumLiteral_0= VerticalLineVerticalLine
            {
            enumLiteral_0=(Token)match(input,VerticalLineVerticalLine,FOLLOW_VerticalLineVerticalLine_in_ruleDisjunctiveOperator4092); 

                    current = grammarAccess.getDisjunctiveOperatorAccess().getDisjunctionEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getDisjunctiveOperatorAccess().getDisjunctionEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleDisjunctiveOperator"


    // $ANTLR start "ruleConjunctiveOperator"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1964:1: ruleConjunctiveOperator returns [Enumerator current=null] : (enumLiteral_0= AmpersandAmpersand ) ;
    public final Enumerator ruleConjunctiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1966:28: ( (enumLiteral_0= AmpersandAmpersand ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1967:1: (enumLiteral_0= AmpersandAmpersand )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1967:1: (enumLiteral_0= AmpersandAmpersand )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1967:6: enumLiteral_0= AmpersandAmpersand
            {
            enumLiteral_0=(Token)match(input,AmpersandAmpersand,FOLLOW_AmpersandAmpersand_in_ruleConjunctiveOperator4140); 

                    current = grammarAccess.getConjunctiveOperatorAccess().getConjunctionEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getConjunctiveOperatorAccess().getConjunctionEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleConjunctiveOperator"


    // $ANTLR start "ruleEqualityOperator"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1977:1: ruleEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) ) ;
    public final Enumerator ruleEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1979:28: ( ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1980:1: ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1980:1: ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==EqualsSignEqualsSign) ) {
                alt40=1;
            }
            else if ( (LA40_0==ExclamationMarkEqualsSign) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1980:2: (enumLiteral_0= EqualsSignEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1980:2: (enumLiteral_0= EqualsSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1980:7: enumLiteral_0= EqualsSignEqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSignEqualsSign,FOLLOW_EqualsSignEqualsSign_in_ruleEqualityOperator4189); 

                            current = grammarAccess.getEqualityOperatorAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1986:6: (enumLiteral_1= ExclamationMarkEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1986:6: (enumLiteral_1= ExclamationMarkEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1986:11: enumLiteral_1= ExclamationMarkEqualsSign
                    {
                    enumLiteral_1=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_ExclamationMarkEqualsSign_in_ruleEqualityOperator4211); 

                            current = grammarAccess.getEqualityOperatorAccess().getNotEqualsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEqualityOperatorAccess().getNotEqualsEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "ruleComparativeOperator"
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1996:1: ruleComparativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= GreaterThanSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSignEqualsSign ) | (enumLiteral_3= LessThanSignEqualsSign ) ) ;
    public final Enumerator ruleComparativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1998:28: ( ( (enumLiteral_0= GreaterThanSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSignEqualsSign ) | (enumLiteral_3= LessThanSignEqualsSign ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1999:1: ( (enumLiteral_0= GreaterThanSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSignEqualsSign ) | (enumLiteral_3= LessThanSignEqualsSign ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1999:1: ( (enumLiteral_0= GreaterThanSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSignEqualsSign ) | (enumLiteral_3= LessThanSignEqualsSign ) )
            int alt41=4;
            switch ( input.LA(1) ) {
            case GreaterThanSign:
                {
                alt41=1;
                }
                break;
            case LessThanSign:
                {
                alt41=2;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt41=3;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1999:2: (enumLiteral_0= GreaterThanSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1999:2: (enumLiteral_0= GreaterThanSign )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1999:7: enumLiteral_0= GreaterThanSign
                    {
                    enumLiteral_0=(Token)match(input,GreaterThanSign,FOLLOW_GreaterThanSign_in_ruleComparativeOperator4261); 

                            current = grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2005:6: (enumLiteral_1= LessThanSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2005:6: (enumLiteral_1= LessThanSign )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2005:11: enumLiteral_1= LessThanSign
                    {
                    enumLiteral_1=(Token)match(input,LessThanSign,FOLLOW_LessThanSign_in_ruleComparativeOperator4283); 

                            current = grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2011:6: (enumLiteral_2= GreaterThanSignEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2011:6: (enumLiteral_2= GreaterThanSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2011:11: enumLiteral_2= GreaterThanSignEqualsSign
                    {
                    enumLiteral_2=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_GreaterThanSignEqualsSign_in_ruleComparativeOperator4305); 

                            current = grammarAccess.getComparativeOperatorAccess().getGreaterOrEqualsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparativeOperatorAccess().getGreaterOrEqualsEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2017:6: (enumLiteral_3= LessThanSignEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2017:6: (enumLiteral_3= LessThanSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2017:11: enumLiteral_3= LessThanSignEqualsSign
                    {
                    enumLiteral_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_LessThanSignEqualsSign_in_ruleComparativeOperator4327); 

                            current = grammarAccess.getComparativeOperatorAccess().getLessOrEqualsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparativeOperatorAccess().getLessOrEqualsEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleComparativeOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Model_in_ruleModel115 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModel135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_ruleModel156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_entryRuleSolitary193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolitary203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleSolitary250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_ruleSolitary277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_entryRuleConstrain311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstrain321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleConstrain367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction457 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleDisjunctiveOperator_in_ruleDisjunction487 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction508 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleConjunction602 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleConjunctiveOperator_in_ruleConjunction632 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleConjunction653 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality747 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleEquality777 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality798 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_ruleComparison892 = new BitSet(new long[]{0x0000000000300A02L});
    public static final BitSet FOLLOW_ruleComparativeOperator_in_ruleComparison922 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleBinary_in_ruleComparison943 = new BitSet(new long[]{0x0000000000300A02L});
    public static final BitSet FOLLOW_ruleBinary_in_entryRuleBinary980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinary990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleBinary1037 = new BitSet(new long[]{0x000000008004C002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleBinary1067 = new BitSet(new long[]{0x000000008004C002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimary1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulePrimary1182 = new BitSet(new long[]{0x0000000198000000L});
    public static final BitSet FOLLOW_ruleAttributeConstrain_in_rulePrimary1203 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulePrimary1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_rulePrimary1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulePrimary1262 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_rulePrimary1283 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulePrimary1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstrain_in_entryRuleAttributeConstrain1330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeConstrain1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeConstrain1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary1419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMark_in_ruleUnary1484 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_HyphenMinus_in_ruleUnary1512 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleUnary1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1634 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_FullStop_in_ruleQualifiedName1653 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1668 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleGroup1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_ruleGroup1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCString_in_ruleAttribute1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleAttribute1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_ruleAttribute1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCBoolean_in_ruleAttribute1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange2004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange2056 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCString_in_entryRuleCString2118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCString2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCString2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCBoolean_in_entryRuleCBoolean2207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCBoolean2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleCBoolean2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleEString2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl2509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature_Impl2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Feature_in_ruleFeature_Impl2557 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleFeature_Impl2577 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleFeature_Impl2589 = new BitSet(new long[]{0x0000000088400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleFeature_Impl2609 = new BitSet(new long[]{0x00000000C8400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleFeature_Impl2630 = new BitSet(new long[]{0x00000000C8400000L});
    public static final BitSet FOLLOW_RULE_END_in_ruleFeature_Impl2642 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleFeature_Impl2657 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleFeature_Impl2677 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_Comma_in_ruleFeature_Impl2691 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleFeature_Impl2711 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleFeature_Impl2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_entryRuleGrouped2762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouped2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleGrouped2818 = new BitSet(new long[]{0x0000000000808002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleGrouped2832 = new BitSet(new long[]{0x0000000198000000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleGrouped2852 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleGrouped2865 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleGrouped2880 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleGrouped2900 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_Comma_in_ruleGrouped2914 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleGrouped2934 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleGrouped2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory2985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleMandatory3041 = new BitSet(new long[]{0x0000000002809042L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleMandatory3055 = new BitSet(new long[]{0x0000000088400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleMandatory3075 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_Comma_in_ruleMandatory3089 = new BitSet(new long[]{0x0000000088400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleMandatory3109 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleMandatory3124 = new BitSet(new long[]{0x0000000000809042L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleMandatory3139 = new BitSet(new long[]{0x0000000198000000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleMandatory3159 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleMandatory3172 = new BitSet(new long[]{0x0000000000801042L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleMandatory3187 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleMandatory3207 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_Comma_in_ruleMandatory3221 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleMandatory3241 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleMandatory3256 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleMandatory3279 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleMandatory3300 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional3338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuestionMark_in_ruleOptional3386 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOptional3406 = new BitSet(new long[]{0x0000000002809042L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleOptional3420 = new BitSet(new long[]{0x0000000088400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleOptional3440 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_Comma_in_ruleOptional3454 = new BitSet(new long[]{0x0000000088400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleOptional3474 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleOptional3489 = new BitSet(new long[]{0x0000000000809042L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleOptional3504 = new BitSet(new long[]{0x0000000198000000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleOptional3524 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleOptional3537 = new BitSet(new long[]{0x0000000000801042L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleOptional3552 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleOptional3572 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_Comma_in_ruleOptional3586 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleOptional3606 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleOptional3621 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleOptional3644 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleOptional3665 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr3703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_ruleOr3751 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOr3771 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleOr3783 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleOr3803 = new BitSet(new long[]{0x00000000C8020000L});
    public static final BitSet FOLLOW_Comma_in_ruleOr3818 = new BitSet(new long[]{0x0000000088020000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleOr3840 = new BitSet(new long[]{0x00000000C8020000L});
    public static final BitSet FOLLOW_RULE_END_in_ruleOr3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_entryRuleXor3889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXor3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_ruleXor3937 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleXor3957 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleXor3969 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleXor3989 = new BitSet(new long[]{0x00000000C8020000L});
    public static final BitSet FOLLOW_Comma_in_ruleXor4004 = new BitSet(new long[]{0x0000000088020000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleXor4026 = new BitSet(new long[]{0x00000000C8020000L});
    public static final BitSet FOLLOW_RULE_END_in_ruleXor4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VerticalLineVerticalLine_in_ruleDisjunctiveOperator4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AmpersandAmpersand_in_ruleConjunctiveOperator4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSignEqualsSign_in_ruleEqualityOperator4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMarkEqualsSign_in_ruleEqualityOperator4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSign_in_ruleComparativeOperator4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSign_in_ruleComparativeOperator4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSignEqualsSign_in_ruleComparativeOperator4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSignEqualsSign_in_ruleComparativeOperator4327 = new BitSet(new long[]{0x0000000000000002L});

}