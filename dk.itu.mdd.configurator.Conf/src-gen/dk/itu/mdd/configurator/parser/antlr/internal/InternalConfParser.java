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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Feature", "Model", "Xor", "And", "ExclamationMarkEqualsSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "Or", "Or_1", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Comma", "HyphenMinus", "FullStop", "LessThanSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BOOLEAN", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=29;
    public static final int Or=12;
    public static final int RULE_BEGIN=28;
    public static final int RULE_BOOLEAN=27;
    public static final int RULE_STRING=32;
    public static final int Feature=4;
    public static final int LessThanSign=20;
    public static final int RULE_SL_COMMENT=34;
    public static final int Or_1=13;
    public static final int Comma=17;
    public static final int HyphenMinus=18;
    public static final int LeftParenthesis=15;
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
    public static final int And=7;
    public static final int QuestionMark=22;
    public static final int RULE_INT=31;
    public static final int Model=5;
    public static final int RULE_ML_COMMENT=33;
    public static final int Xor=6;
    public static final int LeftSquareBracket=23;
    public static final int ExclamationMarkEqualsSign=8;

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:124:1: entryRuleSolitary returns [EObject current=null] : iv_ruleSolitary= ruleSolitary EOF ;
    public final EObject entryRuleSolitary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolitary = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:125:2: (iv_ruleSolitary= ruleSolitary EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:126:2: iv_ruleSolitary= ruleSolitary EOF
            {
             newCompositeNode(grammarAccess.getSolitaryRule()); 
            pushFollow(FOLLOW_ruleSolitary_in_entryRuleSolitary191);
            iv_ruleSolitary=ruleSolitary();

            state._fsp--;

             current =iv_ruleSolitary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolitary201); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:133:1: ruleSolitary returns [EObject current=null] : (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional ) ;
    public final EObject ruleSolitary() throws RecognitionException {
        EObject current = null;

        EObject this_Mandatory_0 = null;

        EObject this_Optional_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:136:28: ( (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:137:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:137:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
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
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:138:5: this_Mandatory_0= ruleMandatory
                    {
                     
                            newCompositeNode(grammarAccess.getSolitaryAccess().getMandatoryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMandatory_in_ruleSolitary248);
                    this_Mandatory_0=ruleMandatory();

                    state._fsp--;


                            current = this_Mandatory_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:148:5: this_Optional_1= ruleOptional
                    {
                     
                            newCompositeNode(grammarAccess.getSolitaryAccess().getOptionalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOptional_in_ruleSolitary275);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:164:1: entryRuleConstrain returns [EObject current=null] : iv_ruleConstrain= ruleConstrain EOF ;
    public final EObject entryRuleConstrain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstrain = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:165:2: (iv_ruleConstrain= ruleConstrain EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:166:2: iv_ruleConstrain= ruleConstrain EOF
            {
             newCompositeNode(grammarAccess.getConstrainRule()); 
            pushFollow(FOLLOW_ruleConstrain_in_entryRuleConstrain309);
            iv_ruleConstrain=ruleConstrain();

            state._fsp--;

             current =iv_ruleConstrain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstrain319); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:173:1: ruleConstrain returns [EObject current=null] : this_Disjunction_0= ruleDisjunction ;
    public final EObject ruleConstrain() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:176:28: (this_Disjunction_0= ruleDisjunction )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:178:5: this_Disjunction_0= ruleDisjunction
            {
             
                    newCompositeNode(grammarAccess.getConstrainAccess().getDisjunctionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleDisjunction_in_ruleConstrain365);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:194:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:195:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:196:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
             newCompositeNode(grammarAccess.getDisjunctionRule()); 
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction398);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;

             current =iv_ruleDisjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction408); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:203:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        Enumerator lv_Operator_2_0 = null;

        EObject lv_rightExp_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:206:28: ( (this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:207:1: (this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:207:1: (this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:208:5: this_Conjunction_0= ruleConjunction ( () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction455);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;


                    current = this_Conjunction_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:216:1: ( () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Or_1) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:216:2: () ( (lv_Operator_2_0= ruleDisjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleConjunction ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:216:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:217:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDisjunctionAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:222:2: ( (lv_Operator_2_0= ruleDisjunctiveOperator ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:223:1: (lv_Operator_2_0= ruleDisjunctiveOperator )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:223:1: (lv_Operator_2_0= ruleDisjunctiveOperator )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:224:3: lv_Operator_2_0= ruleDisjunctiveOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorDisjunctiveOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDisjunctiveOperator_in_ruleDisjunction485);
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

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:240:2: ( (lv_rightExp_3_0= ruleConjunction ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:241:1: (lv_rightExp_3_0= ruleConjunction )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:241:1: (lv_rightExp_3_0= ruleConjunction )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:242:3: lv_rightExp_3_0= ruleConjunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightExpConjunctionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction506);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:266:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:267:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:268:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction543);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction553); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:275:1: ruleConjunction returns [EObject current=null] : (this_Equality_0= ruleEquality ( () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Equality_0 = null;

        Enumerator lv_Operator_2_0 = null;

        EObject lv_rightExp_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:278:28: ( (this_Equality_0= ruleEquality ( () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:279:1: (this_Equality_0= ruleEquality ( () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:279:1: (this_Equality_0= ruleEquality ( () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:280:5: this_Equality_0= ruleEquality ( () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getConjunctionAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEquality_in_ruleConjunction600);
            this_Equality_0=ruleEquality();

            state._fsp--;


                    current = this_Equality_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:288:1: ( () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==And) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:288:2: () ( (lv_Operator_2_0= ruleConjunctiveOperator ) ) ( (lv_rightExp_3_0= ruleEquality ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:288:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:289:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConjunctionAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:294:2: ( (lv_Operator_2_0= ruleConjunctiveOperator ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:295:1: (lv_Operator_2_0= ruleConjunctiveOperator )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:295:1: (lv_Operator_2_0= ruleConjunctiveOperator )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:296:3: lv_Operator_2_0= ruleConjunctiveOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorConjunctiveOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConjunctiveOperator_in_ruleConjunction630);
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

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:312:2: ( (lv_rightExp_3_0= ruleEquality ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:313:1: (lv_rightExp_3_0= ruleEquality )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:313:1: (lv_rightExp_3_0= ruleEquality )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:314:3: lv_rightExp_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightExpEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEquality_in_ruleConjunction651);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:338:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:339:2: (iv_ruleEquality= ruleEquality EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:340:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality688);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality698); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:347:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        Enumerator lv_Operator_2_0 = null;

        EObject lv_rightExp_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:350:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:351:1: (this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:351:1: (this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:352:5: this_Comparison_0= ruleComparison ( () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleEquality745);
            this_Comparison_0=ruleComparison();

            state._fsp--;


                    current = this_Comparison_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:360:1: ( () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ExclamationMarkEqualsSign||LA4_0==EqualsSignEqualsSign) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:360:2: () ( (lv_Operator_2_0= ruleEqualityOperator ) ) ( (lv_rightExp_3_0= ruleComparison ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:360:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:361:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:366:2: ( (lv_Operator_2_0= ruleEqualityOperator ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:367:1: (lv_Operator_2_0= ruleEqualityOperator )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:367:1: (lv_Operator_2_0= ruleEqualityOperator )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:368:3: lv_Operator_2_0= ruleEqualityOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqualityOperator_in_ruleEquality775);
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

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:384:2: ( (lv_rightExp_3_0= ruleComparison ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:385:1: (lv_rightExp_3_0= ruleComparison )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:385:1: (lv_rightExp_3_0= ruleComparison )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:386:3: lv_rightExp_3_0= ruleComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightExpComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparison_in_ruleEquality796);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:410:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:411:2: (iv_ruleComparison= ruleComparison EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:412:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison833);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison843); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:419:1: ruleComparison returns [EObject current=null] : (this_Binary_0= ruleBinary ( () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_Binary_0 = null;

        Enumerator lv_Operator_2_0 = null;

        EObject lv_rightExp_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:422:28: ( (this_Binary_0= ruleBinary ( () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:423:1: (this_Binary_0= ruleBinary ( () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:423:1: (this_Binary_0= ruleBinary ( () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:424:5: this_Binary_0= ruleBinary ( () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonAccess().getBinaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBinary_in_ruleComparison890);
            this_Binary_0=ruleBinary();

            state._fsp--;


                    current = this_Binary_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:432:1: ( () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==LessThanSignEqualsSign||LA5_0==GreaterThanSignEqualsSign||(LA5_0>=LessThanSign && LA5_0<=GreaterThanSign)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:432:2: () ( (lv_Operator_2_0= ruleComparativeOperator ) ) ( (lv_rightExp_3_0= ruleBinary ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:432:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:433:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparisonAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:438:2: ( (lv_Operator_2_0= ruleComparativeOperator ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:439:1: (lv_Operator_2_0= ruleComparativeOperator )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:439:1: (lv_Operator_2_0= ruleComparativeOperator )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:440:3: lv_Operator_2_0= ruleComparativeOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparativeOperator_in_ruleComparison920);
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

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:456:2: ( (lv_rightExp_3_0= ruleBinary ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:457:1: (lv_rightExp_3_0= ruleBinary )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:457:1: (lv_rightExp_3_0= ruleBinary )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:458:3: lv_rightExp_3_0= ruleBinary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getRightExpBinaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBinary_in_ruleComparison941);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:482:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:483:2: (iv_ruleBinary= ruleBinary EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:484:2: iv_ruleBinary= ruleBinary EOF
            {
             newCompositeNode(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_ruleBinary_in_entryRuleBinary978);
            iv_ruleBinary=ruleBinary();

            state._fsp--;

             current =iv_ruleBinary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinary988); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:491:1: ruleBinary returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )* ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject lv_rightExp_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:494:28: ( (this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:495:1: (this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:495:1: (this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:496:5: this_Primary_0= rulePrimary ( () ( (lv_rightExp_2_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinaryAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleBinary1035);
            this_Primary_0=rulePrimary();

            state._fsp--;


                    current = this_Primary_0;
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:504:1: ( () ( (lv_rightExp_2_0= rulePrimary ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=ExclamationMark && LA6_0<=LeftParenthesis)||LA6_0==HyphenMinus||LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:504:2: () ( (lv_rightExp_2_0= rulePrimary ) )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:504:2: ()
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:505:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryAccess().getBinaryLeftExpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:510:2: ( (lv_rightExp_2_0= rulePrimary ) )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:511:1: (lv_rightExp_2_0= rulePrimary )
            	    {
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:511:1: (lv_rightExp_2_0= rulePrimary )
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:512:3: lv_rightExp_2_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryAccess().getRightExpPrimaryParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleBinary1065);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:536:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:537:2: (iv_rulePrimary= rulePrimary EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:538:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1102);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1112); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:545:1: rulePrimary returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) | (otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis ) | this_Unary_4= ruleUnary | (otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis ) ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:548:28: ( ( ( ( ruleQualifiedName ) ) | (otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis ) | this_Unary_4= ruleUnary | (otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:549:1: ( ( ( ruleQualifiedName ) ) | (otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis ) | this_Unary_4= ruleUnary | (otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:549:1: ( ( ( ruleQualifiedName ) ) | (otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis ) | this_Unary_4= ruleUnary | (otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis ) )
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
                    else if ( ((LA7_4>=And && LA7_4<=GreaterThanSignEqualsSign)||(LA7_4>=Or_1 && LA7_4<=LeftParenthesis)||(LA7_4>=HyphenMinus && LA7_4<=GreaterThanSign)||LA7_4==RULE_ID) ) {
                        alt7=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                    }
                    break;
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
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:549:2: ( ( ruleQualifiedName ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:549:2: ( ( ruleQualifiedName ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:550:1: ( ruleQualifiedName )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:550:1: ( ruleQualifiedName )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:551:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getFeatureReferenceGroupedCrossReference_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimary1160);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:565:6: (otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:565:6: (otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:566:2: otherlv_1= LeftParenthesis this_AttributeConstrain_2= ruleAttributeConstrain otherlv_3= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulePrimary1180); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAttributeConstrainParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleAttributeConstrain_in_rulePrimary1201);
                    this_AttributeConstrain_2=ruleAttributeConstrain();

                    state._fsp--;


                            current = this_AttributeConstrain_2;
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulePrimary1213); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:586:5: this_Unary_4= ruleUnary
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUnary_in_rulePrimary1241);
                    this_Unary_4=ruleUnary();

                    state._fsp--;


                            current = this_Unary_4;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:595:6: (otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:595:6: (otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:596:2: otherlv_5= LeftParenthesis this_Constrain_6= ruleConstrain otherlv_7= RightParenthesis
                    {
                    otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulePrimary1260); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getConstrainParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleConstrain_in_rulePrimary1281);
                    this_Constrain_6=ruleConstrain();

                    state._fsp--;


                            current = this_Constrain_6;
                            afterParserOrEnumRuleCall();
                        
                    otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulePrimary1293); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:622:1: entryRuleAttributeConstrain returns [EObject current=null] : iv_ruleAttributeConstrain= ruleAttributeConstrain EOF ;
    public final EObject entryRuleAttributeConstrain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeConstrain = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:623:2: (iv_ruleAttributeConstrain= ruleAttributeConstrain EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:624:2: iv_ruleAttributeConstrain= ruleAttributeConstrain EOF
            {
             newCompositeNode(grammarAccess.getAttributeConstrainRule()); 
            pushFollow(FOLLOW_ruleAttributeConstrain_in_entryRuleAttributeConstrain1328);
            iv_ruleAttributeConstrain=ruleAttributeConstrain();

            state._fsp--;

             current =iv_ruleAttributeConstrain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeConstrain1338); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:631:1: ruleAttributeConstrain returns [EObject current=null] : ( (lv_constrainValue_0_0= ruleAttribute ) ) ;
    public final EObject ruleAttributeConstrain() throws RecognitionException {
        EObject current = null;

        EObject lv_constrainValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:634:28: ( ( (lv_constrainValue_0_0= ruleAttribute ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:635:1: ( (lv_constrainValue_0_0= ruleAttribute ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:635:1: ( (lv_constrainValue_0_0= ruleAttribute ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:636:1: (lv_constrainValue_0_0= ruleAttribute )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:636:1: (lv_constrainValue_0_0= ruleAttribute )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:637:3: lv_constrainValue_0_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getAttributeConstrainAccess().getConstrainValueAttributeParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeConstrain1383);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:661:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:662:2: (iv_ruleUnary= ruleUnary EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:663:2: iv_ruleUnary= ruleUnary EOF
            {
             newCompositeNode(grammarAccess.getUnaryRule()); 
            pushFollow(FOLLOW_ruleUnary_in_entryRuleUnary1417);
            iv_ruleUnary=ruleUnary();

            state._fsp--;

             current =iv_ruleUnary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary1427); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:670:1: ruleUnary returns [EObject current=null] : ( () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) ) ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Token lv_Operator_1_1=null;
        Token lv_Operator_1_2=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:673:28: ( ( () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:674:1: ( () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:674:1: ( () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:674:2: () ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) ) ( (lv_exp_2_0= rulePrimary ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:674:2: ()
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:675:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnaryAccess().getUnaryAction_0(),
                        current);
                

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:680:2: ( ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:681:1: ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:681:1: ( (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:682:1: (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:682:1: (lv_Operator_1_1= ExclamationMark | lv_Operator_1_2= HyphenMinus )
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
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:683:3: lv_Operator_1_1= ExclamationMark
                    {
                    lv_Operator_1_1=(Token)match(input,ExclamationMark,FOLLOW_ExclamationMark_in_ruleUnary1482); 

                            newLeafNode(lv_Operator_1_1, grammarAccess.getUnaryAccess().getOperatorExclamationMarkKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnaryRule());
                    	        }
                           		setWithLastConsumed(current, "Operator", lv_Operator_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:696:8: lv_Operator_1_2= HyphenMinus
                    {
                    lv_Operator_1_2=(Token)match(input,HyphenMinus,FOLLOW_HyphenMinus_in_ruleUnary1510); 

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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:712:2: ( (lv_exp_2_0= rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:713:1: (lv_exp_2_0= rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:713:1: (lv_exp_2_0= rulePrimary )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:714:3: lv_exp_2_0= rulePrimary
            {
             
            	        newCompositeNode(grammarAccess.getUnaryAccess().getExpPrimaryParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePrimary_in_ruleUnary1545);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:738:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:739:1: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:740:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1581);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1592); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:747:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:751:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:752:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:752:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:752:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1632); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:759:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==FullStop) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:760:2: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleQualifiedName1651); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1666); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:780:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:781:2: (iv_ruleGroup= ruleGroup EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:782:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup1712);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup1722); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:789:1: ruleGroup returns [EObject current=null] : (this_Or_0= ruleOr | this_Xor_1= ruleXor ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;

        EObject this_Xor_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:792:28: ( (this_Or_0= ruleOr | this_Xor_1= ruleXor ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:793:1: (this_Or_0= ruleOr | this_Xor_1= ruleXor )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:793:1: (this_Or_0= ruleOr | this_Xor_1= ruleXor )
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
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:794:5: this_Or_0= ruleOr
                    {
                     
                            newCompositeNode(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOr_in_ruleGroup1769);
                    this_Or_0=ruleOr();

                    state._fsp--;


                            current = this_Or_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:804:5: this_Xor_1= ruleXor
                    {
                     
                            newCompositeNode(grammarAccess.getGroupAccess().getXorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleXor_in_ruleGroup1796);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:820:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:821:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:822:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1830);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1840); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:829:1: ruleAttribute returns [EObject current=null] : (this_CString_0= ruleCString | this_Number_1= ruleNumber | this_Range_2= ruleRange | this_CBoolean_3= ruleCBoolean ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_CString_0 = null;

        EObject this_Number_1 = null;

        EObject this_Range_2 = null;

        EObject this_CBoolean_3 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:832:28: ( (this_CString_0= ruleCString | this_Number_1= ruleNumber | this_Range_2= ruleRange | this_CBoolean_3= ruleCBoolean ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:833:1: (this_CString_0= ruleCString | this_Number_1= ruleNumber | this_Range_2= ruleRange | this_CBoolean_3= ruleCBoolean )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:833:1: (this_CString_0= ruleCString | this_Number_1= ruleNumber | this_Range_2= ruleRange | this_CBoolean_3= ruleCBoolean )
            int alt11=4;
            switch ( input.LA(1) ) {
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
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:834:5: this_CString_0= ruleCString
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getCStringParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCString_in_ruleAttribute1887);
                    this_CString_0=ruleCString();

                    state._fsp--;


                            current = this_CString_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:844:5: this_Number_1= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleAttribute1914);
                    this_Number_1=ruleNumber();

                    state._fsp--;


                            current = this_Number_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:854:5: this_Range_2= ruleRange
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getRangeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRange_in_ruleAttribute1941);
                    this_Range_2=ruleRange();

                    state._fsp--;


                            current = this_Range_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:864:5: this_CBoolean_3= ruleCBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getCBooleanParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCBoolean_in_ruleAttribute1968);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:880:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:881:2: (iv_ruleRange= ruleRange EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:882:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange2002);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange2012); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:889:1: ruleRange returns [EObject current=null] : ( ( (lv_lower_0_0= RULE_INT ) ) ( (lv_upper_1_0= RULE_INT ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token lv_lower_0_0=null;
        Token lv_upper_1_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:892:28: ( ( ( (lv_lower_0_0= RULE_INT ) ) ( (lv_upper_1_0= RULE_INT ) ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:893:1: ( ( (lv_lower_0_0= RULE_INT ) ) ( (lv_upper_1_0= RULE_INT ) ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:893:1: ( ( (lv_lower_0_0= RULE_INT ) ) ( (lv_upper_1_0= RULE_INT ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:893:2: ( (lv_lower_0_0= RULE_INT ) ) ( (lv_upper_1_0= RULE_INT ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:893:2: ( (lv_lower_0_0= RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:894:1: (lv_lower_0_0= RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:894:1: (lv_lower_0_0= RULE_INT )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:895:3: lv_lower_0_0= RULE_INT
            {
            lv_lower_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange2054); 

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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:911:2: ( (lv_upper_1_0= RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:912:1: (lv_upper_1_0= RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:912:1: (lv_upper_1_0= RULE_INT )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:913:3: lv_upper_1_0= RULE_INT
            {
            lv_upper_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRange2076); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:937:1: entryRuleCString returns [EObject current=null] : iv_ruleCString= ruleCString EOF ;
    public final EObject entryRuleCString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCString = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:938:2: (iv_ruleCString= ruleCString EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:939:2: iv_ruleCString= ruleCString EOF
            {
             newCompositeNode(grammarAccess.getCStringRule()); 
            pushFollow(FOLLOW_ruleCString_in_entryRuleCString2116);
            iv_ruleCString=ruleCString();

            state._fsp--;

             current =iv_ruleCString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCString2126); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:946:1: ruleCString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleCString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:949:28: ( ( (lv_value_0_0= ruleEString ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:950:1: ( (lv_value_0_0= ruleEString ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:950:1: ( (lv_value_0_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:951:1: (lv_value_0_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:951:1: (lv_value_0_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:952:3: lv_value_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCStringAccess().getValueEStringParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleCString2171);
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:976:1: entryRuleCBoolean returns [EObject current=null] : iv_ruleCBoolean= ruleCBoolean EOF ;
    public final EObject entryRuleCBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCBoolean = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:977:2: (iv_ruleCBoolean= ruleCBoolean EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:978:2: iv_ruleCBoolean= ruleCBoolean EOF
            {
             newCompositeNode(grammarAccess.getCBooleanRule()); 
            pushFollow(FOLLOW_ruleCBoolean_in_entryRuleCBoolean2205);
            iv_ruleCBoolean=ruleCBoolean();

            state._fsp--;

             current =iv_ruleCBoolean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCBoolean2215); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:985:1: ruleCBoolean returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleCBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:988:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:989:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:989:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:990:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:990:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:991:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleCBoolean2256); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1015:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1016:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1017:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber2295);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber2305); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1024:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1027:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1028:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1028:1: ( (lv_value_0_0= RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1029:1: (lv_value_0_0= RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1029:1: (lv_value_0_0= RULE_INT )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1030:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber2346); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1054:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1055:1: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1056:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString2386);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString2397); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1063:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1067:6: (this_ID_0= RULE_ID )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1068:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString2436); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getEStringAccess().getIDTerminalRuleCall()); 
                

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1083:1: entryRuleFeature_Impl returns [EObject current=null] : iv_ruleFeature_Impl= ruleFeature_Impl EOF ;
    public final EObject entryRuleFeature_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature_Impl = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1084:2: (iv_ruleFeature_Impl= ruleFeature_Impl EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1085:2: iv_ruleFeature_Impl= ruleFeature_Impl EOF
            {
             newCompositeNode(grammarAccess.getFeature_ImplRule()); 
            pushFollow(FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl2479);
            iv_ruleFeature_Impl=ruleFeature_Impl();

            state._fsp--;

             current =iv_ruleFeature_Impl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature_Impl2489); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1092:1: ruleFeature_Impl returns [EObject current=null] : (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1095:28: ( (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1096:1: (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1096:1: (otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1097:2: otherlv_0= Feature ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )? (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )?
            {
            otherlv_0=(Token)match(input,Feature,FOLLOW_Feature_in_ruleFeature_Impl2527); 

                	newLeafNode(otherlv_0, grammarAccess.getFeature_ImplAccess().getFeatureKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1101:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1102:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1102:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1103:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleFeature_Impl2547);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1119:2: (this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_BEGIN) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1119:3: this_BEGIN_2= RULE_BEGIN ( (lv_subfeature_3_0= ruleSolitary ) ) ( (lv_subfeature_4_0= ruleSolitary ) )* this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleFeature_Impl2559); 
                     
                        newLeafNode(this_BEGIN_2, grammarAccess.getFeature_ImplAccess().getBEGINTerminalRuleCall_2_0()); 
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1123:1: ( (lv_subfeature_3_0= ruleSolitary ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1124:1: (lv_subfeature_3_0= ruleSolitary )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1124:1: (lv_subfeature_3_0= ruleSolitary )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1125:3: lv_subfeature_3_0= ruleSolitary
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSolitary_in_ruleFeature_Impl2579);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1141:2: ( (lv_subfeature_4_0= ruleSolitary ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==QuestionMark||LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1142:1: (lv_subfeature_4_0= ruleSolitary )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1142:1: (lv_subfeature_4_0= ruleSolitary )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1143:3: lv_subfeature_4_0= ruleSolitary
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSolitary_in_ruleFeature_Impl2600);
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

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleFeature_Impl2612); 
                     
                        newLeafNode(this_END_5, grammarAccess.getFeature_ImplAccess().getENDTerminalRuleCall_2_3()); 
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1163:3: (otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LeftSquareBracket) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1164:2: otherlv_6= LeftSquareBracket ( (lv_constrains_7_0= ruleConstrain ) ) (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )* otherlv_10= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleFeature_Impl2627); 

                        	newLeafNode(otherlv_6, grammarAccess.getFeature_ImplAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1168:1: ( (lv_constrains_7_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1169:1: (lv_constrains_7_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1169:1: (lv_constrains_7_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1170:3: lv_constrains_7_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleFeature_Impl2647);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1186:2: (otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Comma) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1187:2: otherlv_8= Comma ( (lv_constrains_9_0= ruleConstrain ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_Comma_in_ruleFeature_Impl2661); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getFeature_ImplAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1191:1: ( (lv_constrains_9_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1192:1: (lv_constrains_9_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1192:1: (lv_constrains_9_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1193:3: lv_constrains_9_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleFeature_Impl2681);
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

                    otherlv_10=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleFeature_Impl2696); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1222:1: entryRuleGrouped returns [EObject current=null] : iv_ruleGrouped= ruleGrouped EOF ;
    public final EObject entryRuleGrouped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouped = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1223:2: (iv_ruleGrouped= ruleGrouped EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1224:2: iv_ruleGrouped= ruleGrouped EOF
            {
             newCompositeNode(grammarAccess.getGroupedRule()); 
            pushFollow(FOLLOW_ruleGrouped_in_entryRuleGrouped2732);
            iv_ruleGrouped=ruleGrouped();

            state._fsp--;

             current =iv_ruleGrouped; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouped2742); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1231:1: ruleGrouped returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis )? (otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1234:28: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis )? (otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1235:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis )? (otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1235:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis )? (otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1235:2: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis )? (otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket )?
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1235:2: ( (lv_name_0_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1236:1: (lv_name_0_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1236:1: (lv_name_0_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1237:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupedAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleGrouped2788);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1253:2: (otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LeftParenthesis) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1254:2: otherlv_1= LeftParenthesis ( (lv_attribute_2_0= ruleAttribute ) ) otherlv_3= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleGrouped2802); 

                        	newLeafNode(otherlv_1, grammarAccess.getGroupedAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1258:1: ( (lv_attribute_2_0= ruleAttribute ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1259:1: (lv_attribute_2_0= ruleAttribute )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1259:1: (lv_attribute_2_0= ruleAttribute )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1260:3: lv_attribute_2_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupedAccess().getAttributeAttributeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribute_in_ruleGrouped2822);
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

                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleGrouped2835); 

                        	newLeafNode(otherlv_3, grammarAccess.getGroupedAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1281:3: (otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LeftSquareBracket) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1282:2: otherlv_4= LeftSquareBracket ( (lv_constrains_5_0= ruleConstrain ) ) (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )* otherlv_8= RightSquareBracket
                    {
                    otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleGrouped2850); 

                        	newLeafNode(otherlv_4, grammarAccess.getGroupedAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1286:1: ( (lv_constrains_5_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1287:1: (lv_constrains_5_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1287:1: (lv_constrains_5_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1288:3: lv_constrains_5_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleGrouped2870);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1304:2: (otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==Comma) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1305:2: otherlv_6= Comma ( (lv_constrains_7_0= ruleConstrain ) )
                    	    {
                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGrouped2884); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getGroupedAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1309:1: ( (lv_constrains_7_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1310:1: (lv_constrains_7_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1310:1: (lv_constrains_7_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1311:3: lv_constrains_7_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleGrouped2904);
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleGrouped2919); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1340:1: entryRuleMandatory returns [EObject current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final EObject entryRuleMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatory = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1341:2: (iv_ruleMandatory= ruleMandatory EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1342:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory2955);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory2965); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1349:1: ruleMandatory returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis )? (otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket )? ( ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )* )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1352:28: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis )? (otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket )? ( ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )* )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1353:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis )? (otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket )? ( ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )* )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1353:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis )? (otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket )? ( ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )* )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1353:2: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )? (otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis )? (otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket )? ( ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )* )?
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1353:2: ( (lv_name_0_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1354:1: (lv_name_0_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1354:1: (lv_name_0_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1355:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleMandatory3011);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1371:2: (otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LeftCurlyBracket) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1372:2: otherlv_1= LeftCurlyBracket ( (lv_subfeature_2_0= ruleSolitary ) ) (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )* otherlv_5= RightCurlyBracket
                    {
                    otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleMandatory3025); 

                        	newLeafNode(otherlv_1, grammarAccess.getMandatoryAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1376:1: ( (lv_subfeature_2_0= ruleSolitary ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1377:1: (lv_subfeature_2_0= ruleSolitary )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1377:1: (lv_subfeature_2_0= ruleSolitary )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1378:3: lv_subfeature_2_0= ruleSolitary
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSolitary_in_ruleMandatory3045);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1394:2: (otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==Comma) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1395:2: otherlv_3= Comma ( (lv_subfeature_4_0= ruleSolitary ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_Comma_in_ruleMandatory3059); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getMandatoryAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1399:1: ( (lv_subfeature_4_0= ruleSolitary ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1400:1: (lv_subfeature_4_0= ruleSolitary )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1400:1: (lv_subfeature_4_0= ruleSolitary )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1401:3: lv_subfeature_4_0= ruleSolitary
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSolitary_in_ruleMandatory3079);
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleMandatory3094); 

                        	newLeafNode(otherlv_5, grammarAccess.getMandatoryAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1422:3: (otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LeftParenthesis) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1423:2: otherlv_6= LeftParenthesis ( (lv_attribute_7_0= ruleAttribute ) ) otherlv_8= RightParenthesis
                    {
                    otherlv_6=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleMandatory3109); 

                        	newLeafNode(otherlv_6, grammarAccess.getMandatoryAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1427:1: ( (lv_attribute_7_0= ruleAttribute ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1428:1: (lv_attribute_7_0= ruleAttribute )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1428:1: (lv_attribute_7_0= ruleAttribute )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1429:3: lv_attribute_7_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getAttributeAttributeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribute_in_ruleMandatory3129);
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

                    otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleMandatory3142); 

                        	newLeafNode(otherlv_8, grammarAccess.getMandatoryAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1450:3: (otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LeftSquareBracket) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1451:2: otherlv_9= LeftSquareBracket ( (lv_constrains_10_0= ruleConstrain ) ) (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )* otherlv_13= RightSquareBracket
                    {
                    otherlv_9=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleMandatory3157); 

                        	newLeafNode(otherlv_9, grammarAccess.getMandatoryAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1455:1: ( (lv_constrains_10_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1456:1: (lv_constrains_10_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1456:1: (lv_constrains_10_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1457:3: lv_constrains_10_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleMandatory3177);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1473:2: (otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1474:2: otherlv_11= Comma ( (lv_constrains_12_0= ruleConstrain ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FOLLOW_Comma_in_ruleMandatory3191); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getMandatoryAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1478:1: ( (lv_constrains_12_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1479:1: (lv_constrains_12_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1479:1: (lv_constrains_12_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1480:3: lv_constrains_12_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleMandatory3211);
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleMandatory3226); 

                        	newLeafNode(otherlv_13, grammarAccess.getMandatoryAccess().getRightSquareBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1501:3: ( ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Xor||LA25_0==Or) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1501:4: ( (lv_groups_14_0= ruleGroup ) ) ( (lv_groups_15_0= ruleGroup ) )*
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1501:4: ( (lv_groups_14_0= ruleGroup ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1502:1: (lv_groups_14_0= ruleGroup )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1502:1: (lv_groups_14_0= ruleGroup )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1503:3: lv_groups_14_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGroup_in_ruleMandatory3249);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1519:2: ( (lv_groups_15_0= ruleGroup ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Xor||LA24_0==Or) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1520:1: (lv_groups_15_0= ruleGroup )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1520:1: (lv_groups_15_0= ruleGroup )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1521:3: lv_groups_15_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGroup_in_ruleMandatory3270);
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
                    	    break loop24;
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1545:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1546:2: (iv_ruleOptional= ruleOptional EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1547:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional3308);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional3318); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1554:1: ruleOptional returns [EObject current=null] : (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis )? (otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket )? ( ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )* )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1557:28: ( (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis )? (otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket )? ( ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )* )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1558:1: (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis )? (otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket )? ( ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )* )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1558:1: (otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis )? (otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket )? ( ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )* )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1559:2: otherlv_0= QuestionMark ( (lv_name_1_0= ruleEString ) ) (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )? (otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis )? (otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket )? ( ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )* )?
            {
            otherlv_0=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ruleOptional3356); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1563:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1564:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1564:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1565:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOptionalAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleOptional3376);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1581:2: (otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LeftCurlyBracket) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1582:2: otherlv_2= LeftCurlyBracket ( (lv_subfeature_3_0= ruleSolitary ) ) (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )* otherlv_6= RightCurlyBracket
                    {
                    otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleOptional3390); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionalAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1586:1: ( (lv_subfeature_3_0= ruleSolitary ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1587:1: (lv_subfeature_3_0= ruleSolitary )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1587:1: (lv_subfeature_3_0= ruleSolitary )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1588:3: lv_subfeature_3_0= ruleSolitary
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSolitary_in_ruleOptional3410);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1604:2: (otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==Comma) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1605:2: otherlv_4= Comma ( (lv_subfeature_5_0= ruleSolitary ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleOptional3424); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getOptionalAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1609:1: ( (lv_subfeature_5_0= ruleSolitary ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1610:1: (lv_subfeature_5_0= ruleSolitary )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1610:1: (lv_subfeature_5_0= ruleSolitary )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1611:3: lv_subfeature_5_0= ruleSolitary
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSolitary_in_ruleOptional3444);
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
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleOptional3459); 

                        	newLeafNode(otherlv_6, grammarAccess.getOptionalAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1632:3: (otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LeftParenthesis) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1633:2: otherlv_7= LeftParenthesis ( (lv_attribute_8_0= ruleAttribute ) ) otherlv_9= RightParenthesis
                    {
                    otherlv_7=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleOptional3474); 

                        	newLeafNode(otherlv_7, grammarAccess.getOptionalAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1637:1: ( (lv_attribute_8_0= ruleAttribute ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1638:1: (lv_attribute_8_0= ruleAttribute )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1638:1: (lv_attribute_8_0= ruleAttribute )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1639:3: lv_attribute_8_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getAttributeAttributeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribute_in_ruleOptional3494);
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

                    otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleOptional3507); 

                        	newLeafNode(otherlv_9, grammarAccess.getOptionalAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1660:3: (otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LeftSquareBracket) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1661:2: otherlv_10= LeftSquareBracket ( (lv_constrains_11_0= ruleConstrain ) ) (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )* otherlv_14= RightSquareBracket
                    {
                    otherlv_10=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleOptional3522); 

                        	newLeafNode(otherlv_10, grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1665:1: ( (lv_constrains_11_0= ruleConstrain ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1666:1: (lv_constrains_11_0= ruleConstrain )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1666:1: (lv_constrains_11_0= ruleConstrain )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1667:3: lv_constrains_11_0= ruleConstrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstrain_in_ruleOptional3542);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1683:2: (otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==Comma) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1684:2: otherlv_12= Comma ( (lv_constrains_13_0= ruleConstrain ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_Comma_in_ruleOptional3556); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getOptionalAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1688:1: ( (lv_constrains_13_0= ruleConstrain ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1689:1: (lv_constrains_13_0= ruleConstrain )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1689:1: (lv_constrains_13_0= ruleConstrain )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1690:3: lv_constrains_13_0= ruleConstrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstrain_in_ruleOptional3576);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleOptional3591); 

                        	newLeafNode(otherlv_14, grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1711:3: ( ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Xor||LA32_0==Or) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1711:4: ( (lv_groups_15_0= ruleGroup ) ) ( (lv_groups_16_0= ruleGroup ) )*
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1711:4: ( (lv_groups_15_0= ruleGroup ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1712:1: (lv_groups_15_0= ruleGroup )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1712:1: (lv_groups_15_0= ruleGroup )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1713:3: lv_groups_15_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGroup_in_ruleOptional3614);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1729:2: ( (lv_groups_16_0= ruleGroup ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Xor||LA31_0==Or) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1730:1: (lv_groups_16_0= ruleGroup )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1730:1: (lv_groups_16_0= ruleGroup )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1731:3: lv_groups_16_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGroup_in_ruleOptional3635);
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
                    	    break loop31;
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1755:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1756:2: (iv_ruleOr= ruleOr EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1757:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr3673);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr3683); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1764:1: ruleOr returns [EObject current=null] : (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1767:28: ( (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1768:1: (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1768:1: (otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1769:2: otherlv_0= Or ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            {
            otherlv_0=(Token)match(input,Or,FOLLOW_Or_in_ruleOr3721); 

                	newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1773:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1774:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1774:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1775:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleOr3741);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1791:2: (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_BEGIN) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1791:3: this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleOr3753); 
                     
                        newLeafNode(this_BEGIN_2, grammarAccess.getOrAccess().getBEGINTerminalRuleCall_2_0()); 
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1795:1: ( (lv_grouped_3_0= ruleGrouped ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1796:1: (lv_grouped_3_0= ruleGrouped )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1796:1: (lv_grouped_3_0= ruleGrouped )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1797:3: lv_grouped_3_0= ruleGrouped
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouped_in_ruleOr3773);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1813:2: ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==Comma||LA34_0==RULE_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1813:3: (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1813:3: (otherlv_4= Comma )*
                    	    loop33:
                    	    do {
                    	        int alt33=2;
                    	        int LA33_0 = input.LA(1);

                    	        if ( (LA33_0==Comma) ) {
                    	            alt33=1;
                    	        }


                    	        switch (alt33) {
                    	    	case 1 :
                    	    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1814:2: otherlv_4= Comma
                    	    	    {
                    	    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleOr3788); 

                    	    	        	newLeafNode(otherlv_4, grammarAccess.getOrAccess().getCommaKeyword_2_2_0());
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop33;
                    	        }
                    	    } while (true);

                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1818:3: ( (lv_grouped_5_0= ruleGrouped ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1819:1: (lv_grouped_5_0= ruleGrouped )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1819:1: (lv_grouped_5_0= ruleGrouped )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1820:3: lv_grouped_5_0= ruleGrouped
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGrouped_in_ruleOr3810);
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
                    	    break loop34;
                        }
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleOr3823); 
                     
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1848:1: entryRuleXor returns [EObject current=null] : iv_ruleXor= ruleXor EOF ;
    public final EObject entryRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXor = null;


        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1849:2: (iv_ruleXor= ruleXor EOF )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1850:2: iv_ruleXor= ruleXor EOF
            {
             newCompositeNode(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_ruleXor_in_entryRuleXor3859);
            iv_ruleXor=ruleXor();

            state._fsp--;

             current =iv_ruleXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXor3869); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1857:1: ruleXor returns [EObject current=null] : (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) ;
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
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1860:28: ( (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1861:1: (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1861:1: (otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )? )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1862:2: otherlv_0= Xor ( (lv_name_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            {
            otherlv_0=(Token)match(input,Xor,FOLLOW_Xor_in_ruleXor3907); 

                	newLeafNode(otherlv_0, grammarAccess.getXorAccess().getXorKeyword_0());
                
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1866:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1867:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1867:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1868:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getXorAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleXor3927);
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

            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1884:2: (this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_BEGIN) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1884:3: this_BEGIN_2= RULE_BEGIN ( (lv_grouped_3_0= ruleGrouped ) ) ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleXor3939); 
                     
                        newLeafNode(this_BEGIN_2, grammarAccess.getXorAccess().getBEGINTerminalRuleCall_2_0()); 
                        
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1888:1: ( (lv_grouped_3_0= ruleGrouped ) )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1889:1: (lv_grouped_3_0= ruleGrouped )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1889:1: (lv_grouped_3_0= ruleGrouped )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1890:3: lv_grouped_3_0= ruleGrouped
                    {
                     
                    	        newCompositeNode(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouped_in_ruleXor3959);
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

                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1906:2: ( (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==Comma||LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1906:3: (otherlv_4= Comma )* ( (lv_grouped_5_0= ruleGrouped ) )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1906:3: (otherlv_4= Comma )*
                    	    loop36:
                    	    do {
                    	        int alt36=2;
                    	        int LA36_0 = input.LA(1);

                    	        if ( (LA36_0==Comma) ) {
                    	            alt36=1;
                    	        }


                    	        switch (alt36) {
                    	    	case 1 :
                    	    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1907:2: otherlv_4= Comma
                    	    	    {
                    	    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleXor3974); 

                    	    	        	newLeafNode(otherlv_4, grammarAccess.getXorAccess().getCommaKeyword_2_2_0());
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop36;
                    	        }
                    	    } while (true);

                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1911:3: ( (lv_grouped_5_0= ruleGrouped ) )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1912:1: (lv_grouped_5_0= ruleGrouped )
                    	    {
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1912:1: (lv_grouped_5_0= ruleGrouped )
                    	    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1913:3: lv_grouped_5_0= ruleGrouped
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGrouped_in_ruleXor3996);
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
                    	    break loop37;
                        }
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleXor4009); 
                     
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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1941:1: ruleDisjunctiveOperator returns [Enumerator current=null] : (enumLiteral_0= Or_1 ) ;
    public final Enumerator ruleDisjunctiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1943:28: ( (enumLiteral_0= Or_1 ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1944:1: (enumLiteral_0= Or_1 )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1944:1: (enumLiteral_0= Or_1 )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1944:6: enumLiteral_0= Or_1
            {
            enumLiteral_0=(Token)match(input,Or_1,FOLLOW_Or_1_in_ruleDisjunctiveOperator4062); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1954:1: ruleConjunctiveOperator returns [Enumerator current=null] : (enumLiteral_0= And ) ;
    public final Enumerator ruleConjunctiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1956:28: ( (enumLiteral_0= And ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1957:1: (enumLiteral_0= And )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1957:1: (enumLiteral_0= And )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1957:6: enumLiteral_0= And
            {
            enumLiteral_0=(Token)match(input,And,FOLLOW_And_in_ruleConjunctiveOperator4110); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1967:1: ruleEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) ) ;
    public final Enumerator ruleEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1969:28: ( ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1970:1: ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1970:1: ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==EqualsSignEqualsSign) ) {
                alt39=1;
            }
            else if ( (LA39_0==ExclamationMarkEqualsSign) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1970:2: (enumLiteral_0= EqualsSignEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1970:2: (enumLiteral_0= EqualsSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1970:7: enumLiteral_0= EqualsSignEqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSignEqualsSign,FOLLOW_EqualsSignEqualsSign_in_ruleEqualityOperator4159); 

                            current = grammarAccess.getEqualityOperatorAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1976:6: (enumLiteral_1= ExclamationMarkEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1976:6: (enumLiteral_1= ExclamationMarkEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1976:11: enumLiteral_1= ExclamationMarkEqualsSign
                    {
                    enumLiteral_1=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_ExclamationMarkEqualsSign_in_ruleEqualityOperator4181); 

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
    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1986:1: ruleComparativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= GreaterThanSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSignEqualsSign ) | (enumLiteral_3= LessThanSignEqualsSign ) ) ;
    public final Enumerator ruleComparativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1988:28: ( ( (enumLiteral_0= GreaterThanSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSignEqualsSign ) | (enumLiteral_3= LessThanSignEqualsSign ) ) )
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1989:1: ( (enumLiteral_0= GreaterThanSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSignEqualsSign ) | (enumLiteral_3= LessThanSignEqualsSign ) )
            {
            // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1989:1: ( (enumLiteral_0= GreaterThanSign ) | (enumLiteral_1= LessThanSign ) | (enumLiteral_2= GreaterThanSignEqualsSign ) | (enumLiteral_3= LessThanSignEqualsSign ) )
            int alt40=4;
            switch ( input.LA(1) ) {
            case GreaterThanSign:
                {
                alt40=1;
                }
                break;
            case LessThanSign:
                {
                alt40=2;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt40=3;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1989:2: (enumLiteral_0= GreaterThanSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1989:2: (enumLiteral_0= GreaterThanSign )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1989:7: enumLiteral_0= GreaterThanSign
                    {
                    enumLiteral_0=(Token)match(input,GreaterThanSign,FOLLOW_GreaterThanSign_in_ruleComparativeOperator4231); 

                            current = grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1995:6: (enumLiteral_1= LessThanSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1995:6: (enumLiteral_1= LessThanSign )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:1995:11: enumLiteral_1= LessThanSign
                    {
                    enumLiteral_1=(Token)match(input,LessThanSign,FOLLOW_LessThanSign_in_ruleComparativeOperator4253); 

                            current = grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2001:6: (enumLiteral_2= GreaterThanSignEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2001:6: (enumLiteral_2= GreaterThanSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2001:11: enumLiteral_2= GreaterThanSignEqualsSign
                    {
                    enumLiteral_2=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_GreaterThanSignEqualsSign_in_ruleComparativeOperator4275); 

                            current = grammarAccess.getComparativeOperatorAccess().getGreaterOrEqualsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparativeOperatorAccess().getGreaterOrEqualsEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2007:6: (enumLiteral_3= LessThanSignEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2007:6: (enumLiteral_3= LessThanSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf/src-gen/dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.g:2007:11: enumLiteral_3= LessThanSignEqualsSign
                    {
                    enumLiteral_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_LessThanSignEqualsSign_in_ruleComparativeOperator4297); 

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
    public static final BitSet FOLLOW_Model_in_ruleModel115 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleModel135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_ruleModel156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_entryRuleSolitary191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolitary201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleSolitary248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_ruleSolitary275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_entryRuleConstrain309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstrain319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleConstrain365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction455 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleDisjunctiveOperator_in_ruleDisjunction485 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction506 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleConjunction600 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleConjunctiveOperator_in_ruleConjunction630 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleConjunction651 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality745 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleEquality775 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality796 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_ruleComparison890 = new BitSet(new long[]{0x0000000000300A02L});
    public static final BitSet FOLLOW_ruleComparativeOperator_in_ruleComparison920 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleBinary_in_ruleComparison941 = new BitSet(new long[]{0x0000000000300A02L});
    public static final BitSet FOLLOW_ruleBinary_in_entryRuleBinary978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinary988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleBinary1035 = new BitSet(new long[]{0x000000004004C002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleBinary1065 = new BitSet(new long[]{0x000000004004C002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimary1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulePrimary1180 = new BitSet(new long[]{0x00000000C8000000L});
    public static final BitSet FOLLOW_ruleAttributeConstrain_in_rulePrimary1201 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulePrimary1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_rulePrimary1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulePrimary1260 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_rulePrimary1281 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulePrimary1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstrain_in_entryRuleAttributeConstrain1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeConstrain1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeConstrain1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary1417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMark_in_ruleUnary1482 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_HyphenMinus_in_ruleUnary1510 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleUnary1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1632 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_FullStop_in_ruleQualifiedName1651 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1666 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleGroup1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_ruleGroup1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCString_in_ruleAttribute1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleAttribute1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_ruleAttribute1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCBoolean_in_ruleAttribute1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange2002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange2054 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRange2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCString_in_entryRuleCString2116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCString2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCString2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCBoolean_in_entryRuleCBoolean2205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCBoolean2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleCBoolean2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl2479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature_Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Feature_in_ruleFeature_Impl2527 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleFeature_Impl2547 = new BitSet(new long[]{0x0000000010800002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleFeature_Impl2559 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleFeature_Impl2579 = new BitSet(new long[]{0x0000000060400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleFeature_Impl2600 = new BitSet(new long[]{0x0000000060400000L});
    public static final BitSet FOLLOW_RULE_END_in_ruleFeature_Impl2612 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleFeature_Impl2627 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleFeature_Impl2647 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_Comma_in_ruleFeature_Impl2661 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleFeature_Impl2681 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleFeature_Impl2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_entryRuleGrouped2732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouped2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleGrouped2788 = new BitSet(new long[]{0x0000000000808002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleGrouped2802 = new BitSet(new long[]{0x00000000C8000000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleGrouped2822 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleGrouped2835 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleGrouped2850 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleGrouped2870 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_Comma_in_ruleGrouped2884 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleGrouped2904 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleGrouped2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory2955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleMandatory3011 = new BitSet(new long[]{0x0000000002809042L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleMandatory3025 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleMandatory3045 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_Comma_in_ruleMandatory3059 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleMandatory3079 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleMandatory3094 = new BitSet(new long[]{0x0000000000809042L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleMandatory3109 = new BitSet(new long[]{0x00000000C8000000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleMandatory3129 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleMandatory3142 = new BitSet(new long[]{0x0000000000801042L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleMandatory3157 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleMandatory3177 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_Comma_in_ruleMandatory3191 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleMandatory3211 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleMandatory3226 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleMandatory3249 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleMandatory3270 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional3308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuestionMark_in_ruleOptional3356 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOptional3376 = new BitSet(new long[]{0x0000000002809042L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleOptional3390 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleOptional3410 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_Comma_in_ruleOptional3424 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_ruleSolitary_in_ruleOptional3444 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleOptional3459 = new BitSet(new long[]{0x0000000000809042L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleOptional3474 = new BitSet(new long[]{0x00000000C8000000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleOptional3494 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleOptional3507 = new BitSet(new long[]{0x0000000000801042L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleOptional3522 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleOptional3542 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_Comma_in_ruleOptional3556 = new BitSet(new long[]{0x000000004004C000L});
    public static final BitSet FOLLOW_ruleConstrain_in_ruleOptional3576 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleOptional3591 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleOptional3614 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleOptional3635 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr3673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_ruleOr3721 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleOr3741 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleOr3753 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleOr3773 = new BitSet(new long[]{0x0000000060020000L});
    public static final BitSet FOLLOW_Comma_in_ruleOr3788 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleOr3810 = new BitSet(new long[]{0x0000000060020000L});
    public static final BitSet FOLLOW_RULE_END_in_ruleOr3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_entryRuleXor3859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXor3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_ruleXor3907 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleEString_in_ruleXor3927 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleXor3939 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleXor3959 = new BitSet(new long[]{0x0000000060020000L});
    public static final BitSet FOLLOW_Comma_in_ruleXor3974 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_ruleGrouped_in_ruleXor3996 = new BitSet(new long[]{0x0000000060020000L});
    public static final BitSet FOLLOW_RULE_END_in_ruleXor4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_1_in_ruleDisjunctiveOperator4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_And_in_ruleConjunctiveOperator4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSignEqualsSign_in_ruleEqualityOperator4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMarkEqualsSign_in_ruleEqualityOperator4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSign_in_ruleComparativeOperator4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSign_in_ruleComparativeOperator4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSignEqualsSign_in_ruleComparativeOperator4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSignEqualsSign_in_ruleComparativeOperator4297 = new BitSet(new long[]{0x0000000000000002L});

}