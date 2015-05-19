package dk.itu.mdd.configurator.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.itu.mdd.configurator.services.ConfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Feature", "Model", "Xor", "And", "ExclamationMarkEqualsSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "Or", "Or_1", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Comma", "HyphenMinus", "FullStop", "LessThanSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_NULL", "RULE_BOOLEAN", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=30;
    public static final int Or=12;
    public static final int RULE_BEGIN=29;
    public static final int RULE_BOOLEAN=28;
    public static final int RULE_STRING=33;
    public static final int RULE_NULL=27;
    public static final int Feature=4;
    public static final int LessThanSign=20;
    public static final int RULE_SL_COMMENT=35;
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
    public static final int RULE_ID=31;
    public static final int RULE_WS=36;
    public static final int RightParenthesis=16;
    public static final int LeftCurlyBracket=25;
    public static final int RULE_ANY_OTHER=37;
    public static final int GreaterThanSignEqualsSign=11;
    public static final int EqualsSignEqualsSign=10;
    public static final int And=7;
    public static final int QuestionMark=22;
    public static final int RULE_INT=32;
    public static final int Model=5;
    public static final int RULE_ML_COMMENT=34;
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
    public String getGrammarFileName() { return "../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g"; }


     
     	private ConfGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("ExclamationMark", "'!'");
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("QuestionMark", "'?'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("ExclamationMarkEqualsSign", "'!='");
    		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
    		tokenNameToValue.put("EqualsSignEqualsSign", "'=='");
    		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
    		tokenNameToValue.put("Or", "'Or'");
    		tokenNameToValue.put("Or_1", "'or'");
    		tokenNameToValue.put("Xor", "'Xor'");
    		tokenNameToValue.put("And", "'and'");
    		tokenNameToValue.put("Model", "'Model'");
    		tokenNameToValue.put("Feature", "'Feature'");
     	}
     	
        public void setGrammarAccess(ConfGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start "entryRuleModel"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:86:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:87:1: ( ruleModel EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:88:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel54);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel61); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:95:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:99:5: ( ( ( rule__Model__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:100:1: ( ( rule__Model__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:100:1: ( ( rule__Model__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:101:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:102:1: ( rule__Model__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:102:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel91);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSolitary"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:114:1: entryRuleSolitary : ruleSolitary EOF ;
    public final void entryRuleSolitary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:115:1: ( ruleSolitary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:116:1: ruleSolitary EOF
            {
             before(grammarAccess.getSolitaryRule()); 
            pushFollow(FOLLOW_ruleSolitary_in_entryRuleSolitary118);
            ruleSolitary();

            state._fsp--;

             after(grammarAccess.getSolitaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolitary125); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSolitary"


    // $ANTLR start "ruleSolitary"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:123:1: ruleSolitary : ( ( rule__Solitary__Alternatives ) ) ;
    public final void ruleSolitary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:127:5: ( ( ( rule__Solitary__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:128:1: ( ( rule__Solitary__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:128:1: ( ( rule__Solitary__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:129:1: ( rule__Solitary__Alternatives )
            {
             before(grammarAccess.getSolitaryAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:130:1: ( rule__Solitary__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:130:2: rule__Solitary__Alternatives
            {
            pushFollow(FOLLOW_rule__Solitary__Alternatives_in_ruleSolitary155);
            rule__Solitary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolitary"


    // $ANTLR start "entryRuleConstrain"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:142:1: entryRuleConstrain : ruleConstrain EOF ;
    public final void entryRuleConstrain() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:143:1: ( ruleConstrain EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:144:1: ruleConstrain EOF
            {
             before(grammarAccess.getConstrainRule()); 
            pushFollow(FOLLOW_ruleConstrain_in_entryRuleConstrain182);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getConstrainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstrain189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstrain"


    // $ANTLR start "ruleConstrain"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:151:1: ruleConstrain : ( ruleDisjunction ) ;
    public final void ruleConstrain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:155:5: ( ( ruleDisjunction ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:156:1: ( ruleDisjunction )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:156:1: ( ruleDisjunction )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:157:1: ruleDisjunction
            {
             before(grammarAccess.getConstrainAccess().getDisjunctionParserRuleCall()); 
            pushFollow(FOLLOW_ruleDisjunction_in_ruleConstrain219);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getConstrainAccess().getDisjunctionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstrain"


    // $ANTLR start "entryRuleDisjunction"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:170:1: entryRuleDisjunction : ruleDisjunction EOF ;
    public final void entryRuleDisjunction() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:171:1: ( ruleDisjunction EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:172:1: ruleDisjunction EOF
            {
             before(grammarAccess.getDisjunctionRule()); 
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction245);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction252); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:179:1: ruleDisjunction : ( ( rule__Disjunction__Group__0 ) ) ;
    public final void ruleDisjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:183:5: ( ( ( rule__Disjunction__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:184:1: ( ( rule__Disjunction__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:184:1: ( ( rule__Disjunction__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:185:1: ( rule__Disjunction__Group__0 )
            {
             before(grammarAccess.getDisjunctionAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:186:1: ( rule__Disjunction__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:186:2: rule__Disjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction282);
            rule__Disjunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisjunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:198:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:199:1: ( ruleConjunction EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:200:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction309);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction316); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:207:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:211:5: ( ( ( rule__Conjunction__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:212:1: ( ( rule__Conjunction__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:212:1: ( ( rule__Conjunction__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:213:1: ( rule__Conjunction__Group__0 )
            {
             before(grammarAccess.getConjunctionAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:214:1: ( rule__Conjunction__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:214:2: rule__Conjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction346);
            rule__Conjunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleEquality"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:226:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:227:1: ( ruleEquality EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:228:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality373);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality380); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:235:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:239:5: ( ( ( rule__Equality__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:240:1: ( ( rule__Equality__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:240:1: ( ( rule__Equality__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:241:1: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:242:1: ( rule__Equality__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:242:2: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_rule__Equality__Group__0_in_ruleEquality410);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:254:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:255:1: ( ruleComparison EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:256:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison437);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison444); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:263:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:267:5: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:268:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:268:1: ( ( rule__Comparison__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:269:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:270:1: ( rule__Comparison__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:270:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison474);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleBinary"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:282:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:283:1: ( ruleBinary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:284:1: ruleBinary EOF
            {
             before(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_ruleBinary_in_entryRuleBinary501);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getBinaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinary508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:291:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:295:5: ( ( ( rule__Binary__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:296:1: ( ( rule__Binary__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:296:1: ( ( rule__Binary__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:297:1: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:298:1: ( rule__Binary__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:298:2: rule__Binary__Group__0
            {
            pushFollow(FOLLOW_rule__Binary__Group__0_in_ruleBinary538);
            rule__Binary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinary"


    // $ANTLR start "entryRulePrimary"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:310:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:311:1: ( rulePrimary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:312:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary565);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary572); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:319:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:323:5: ( ( ( rule__Primary__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:324:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:324:1: ( ( rule__Primary__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:325:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:326:1: ( rule__Primary__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:326:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary602);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAttributeConstrain"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:338:1: entryRuleAttributeConstrain : ruleAttributeConstrain EOF ;
    public final void entryRuleAttributeConstrain() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:339:1: ( ruleAttributeConstrain EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:340:1: ruleAttributeConstrain EOF
            {
             before(grammarAccess.getAttributeConstrainRule()); 
            pushFollow(FOLLOW_ruleAttributeConstrain_in_entryRuleAttributeConstrain629);
            ruleAttributeConstrain();

            state._fsp--;

             after(grammarAccess.getAttributeConstrainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeConstrain636); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeConstrain"


    // $ANTLR start "ruleAttributeConstrain"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:347:1: ruleAttributeConstrain : ( ( rule__AttributeConstrain__ConstrainValueAssignment ) ) ;
    public final void ruleAttributeConstrain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:351:5: ( ( ( rule__AttributeConstrain__ConstrainValueAssignment ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:352:1: ( ( rule__AttributeConstrain__ConstrainValueAssignment ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:352:1: ( ( rule__AttributeConstrain__ConstrainValueAssignment ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:353:1: ( rule__AttributeConstrain__ConstrainValueAssignment )
            {
             before(grammarAccess.getAttributeConstrainAccess().getConstrainValueAssignment()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:354:1: ( rule__AttributeConstrain__ConstrainValueAssignment )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:354:2: rule__AttributeConstrain__ConstrainValueAssignment
            {
            pushFollow(FOLLOW_rule__AttributeConstrain__ConstrainValueAssignment_in_ruleAttributeConstrain666);
            rule__AttributeConstrain__ConstrainValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeConstrainAccess().getConstrainValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeConstrain"


    // $ANTLR start "entryRuleUnary"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:366:1: entryRuleUnary : ruleUnary EOF ;
    public final void entryRuleUnary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:367:1: ( ruleUnary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:368:1: ruleUnary EOF
            {
             before(grammarAccess.getUnaryRule()); 
            pushFollow(FOLLOW_ruleUnary_in_entryRuleUnary693);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getUnaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary700); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnary"


    // $ANTLR start "ruleUnary"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:375:1: ruleUnary : ( ( rule__Unary__Group__0 ) ) ;
    public final void ruleUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:379:5: ( ( ( rule__Unary__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:380:1: ( ( rule__Unary__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:380:1: ( ( rule__Unary__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:381:1: ( rule__Unary__Group__0 )
            {
             before(grammarAccess.getUnaryAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:382:1: ( rule__Unary__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:382:2: rule__Unary__Group__0
            {
            pushFollow(FOLLOW_rule__Unary__Group__0_in_ruleUnary730);
            rule__Unary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnary"


    // $ANTLR start "entryRuleQualifiedName"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:394:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:395:1: ( ruleQualifiedName EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:396:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName757);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName764); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:403:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:407:5: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:408:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:408:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:409:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:410:1: ( rule__QualifiedName__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:410:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName794);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleGroup"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:422:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:423:1: ( ruleGroup EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:424:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup821);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup828); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:431:1: ruleGroup : ( ( rule__Group__Alternatives ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:435:5: ( ( ( rule__Group__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:436:1: ( ( rule__Group__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:436:1: ( ( rule__Group__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:437:1: ( rule__Group__Alternatives )
            {
             before(grammarAccess.getGroupAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:438:1: ( rule__Group__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:438:2: rule__Group__Alternatives
            {
            pushFollow(FOLLOW_rule__Group__Alternatives_in_ruleGroup858);
            rule__Group__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAttribute"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:450:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:451:1: ( ruleAttribute EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:452:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute885);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute892); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:459:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:463:5: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:464:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:464:1: ( ( rule__Attribute__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:465:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:466:1: ( rule__Attribute__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:466:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute922);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRange"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:478:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:479:1: ( ruleRange EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:480:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange949);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange956); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:487:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:491:5: ( ( ( rule__Range__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:492:1: ( ( rule__Range__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:492:1: ( ( rule__Range__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:493:1: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:494:1: ( rule__Range__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:494:2: rule__Range__Group__0
            {
            pushFollow(FOLLOW_rule__Range__Group__0_in_ruleRange986);
            rule__Range__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleCString"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:506:1: entryRuleCString : ruleCString EOF ;
    public final void entryRuleCString() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:507:1: ( ruleCString EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:508:1: ruleCString EOF
            {
             before(grammarAccess.getCStringRule()); 
            pushFollow(FOLLOW_ruleCString_in_entryRuleCString1013);
            ruleCString();

            state._fsp--;

             after(grammarAccess.getCStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCString1020); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCString"


    // $ANTLR start "ruleCString"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:515:1: ruleCString : ( ( rule__CString__ValueAssignment ) ) ;
    public final void ruleCString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:519:5: ( ( ( rule__CString__ValueAssignment ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:520:1: ( ( rule__CString__ValueAssignment ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:520:1: ( ( rule__CString__ValueAssignment ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:521:1: ( rule__CString__ValueAssignment )
            {
             before(grammarAccess.getCStringAccess().getValueAssignment()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:522:1: ( rule__CString__ValueAssignment )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:522:2: rule__CString__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CString__ValueAssignment_in_ruleCString1050);
            rule__CString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCString"


    // $ANTLR start "entryRuleCBoolean"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:534:1: entryRuleCBoolean : ruleCBoolean EOF ;
    public final void entryRuleCBoolean() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:535:1: ( ruleCBoolean EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:536:1: ruleCBoolean EOF
            {
             before(grammarAccess.getCBooleanRule()); 
            pushFollow(FOLLOW_ruleCBoolean_in_entryRuleCBoolean1077);
            ruleCBoolean();

            state._fsp--;

             after(grammarAccess.getCBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCBoolean1084); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCBoolean"


    // $ANTLR start "ruleCBoolean"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:543:1: ruleCBoolean : ( ( rule__CBoolean__ValueAssignment ) ) ;
    public final void ruleCBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:547:5: ( ( ( rule__CBoolean__ValueAssignment ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:548:1: ( ( rule__CBoolean__ValueAssignment ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:548:1: ( ( rule__CBoolean__ValueAssignment ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:549:1: ( rule__CBoolean__ValueAssignment )
            {
             before(grammarAccess.getCBooleanAccess().getValueAssignment()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:550:1: ( rule__CBoolean__ValueAssignment )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:550:2: rule__CBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CBoolean__ValueAssignment_in_ruleCBoolean1114);
            rule__CBoolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCBooleanAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCBoolean"


    // $ANTLR start "entryRuleNumber"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:562:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:563:1: ( ruleNumber EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:564:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1141);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:571:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:575:5: ( ( ( rule__Number__ValueAssignment ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:576:1: ( ( rule__Number__ValueAssignment ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:576:1: ( ( rule__Number__ValueAssignment ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:577:1: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:578:1: ( rule__Number__ValueAssignment )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:578:2: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1178);
            rule__Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:590:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:591:1: ( ruleEString EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:592:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1205);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1212); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:599:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:603:5: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:604:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:604:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:605:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:606:1: ( rule__EString__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:606:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString1242);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFeature_Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:618:1: entryRuleFeature_Impl : ruleFeature_Impl EOF ;
    public final void entryRuleFeature_Impl() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:619:1: ( ruleFeature_Impl EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:620:1: ruleFeature_Impl EOF
            {
             before(grammarAccess.getFeature_ImplRule()); 
            pushFollow(FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl1269);
            ruleFeature_Impl();

            state._fsp--;

             after(grammarAccess.getFeature_ImplRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature_Impl1276); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature_Impl"


    // $ANTLR start "ruleFeature_Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:627:1: ruleFeature_Impl : ( ( rule__Feature_Impl__Group__0 ) ) ;
    public final void ruleFeature_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:631:5: ( ( ( rule__Feature_Impl__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:632:1: ( ( rule__Feature_Impl__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:632:1: ( ( rule__Feature_Impl__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:633:1: ( rule__Feature_Impl__Group__0 )
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:634:1: ( rule__Feature_Impl__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:634:2: rule__Feature_Impl__Group__0
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__0_in_ruleFeature_Impl1306);
            rule__Feature_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeature_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature_Impl"


    // $ANTLR start "entryRuleGrouped"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:646:1: entryRuleGrouped : ruleGrouped EOF ;
    public final void entryRuleGrouped() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:647:1: ( ruleGrouped EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:648:1: ruleGrouped EOF
            {
             before(grammarAccess.getGroupedRule()); 
            pushFollow(FOLLOW_ruleGrouped_in_entryRuleGrouped1333);
            ruleGrouped();

            state._fsp--;

             after(grammarAccess.getGroupedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouped1340); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrouped"


    // $ANTLR start "ruleGrouped"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:655:1: ruleGrouped : ( ( rule__Grouped__Group__0 ) ) ;
    public final void ruleGrouped() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:659:5: ( ( ( rule__Grouped__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:660:1: ( ( rule__Grouped__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:660:1: ( ( rule__Grouped__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:661:1: ( rule__Grouped__Group__0 )
            {
             before(grammarAccess.getGroupedAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:662:1: ( rule__Grouped__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:662:2: rule__Grouped__Group__0
            {
            pushFollow(FOLLOW_rule__Grouped__Group__0_in_ruleGrouped1370);
            rule__Grouped__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrouped"


    // $ANTLR start "entryRuleMandatory"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:674:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:675:1: ( ruleMandatory EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:676:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory1397);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory1404); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:683:1: ruleMandatory : ( ( rule__Mandatory__Group__0 ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:687:5: ( ( ( rule__Mandatory__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:688:1: ( ( rule__Mandatory__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:688:1: ( ( rule__Mandatory__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:689:1: ( rule__Mandatory__Group__0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:690:1: ( rule__Mandatory__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:690:2: rule__Mandatory__Group__0
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory1434);
            rule__Mandatory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:702:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:703:1: ( ruleOptional EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:704:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional1461);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional1468); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:711:1: ruleOptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:715:5: ( ( ( rule__Optional__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:716:1: ( ( rule__Optional__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:716:1: ( ( rule__Optional__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:717:1: ( rule__Optional__Group__0 )
            {
             before(grammarAccess.getOptionalAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:718:1: ( rule__Optional__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:718:2: rule__Optional__Group__0
            {
            pushFollow(FOLLOW_rule__Optional__Group__0_in_ruleOptional1498);
            rule__Optional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleOr"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:730:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:731:1: ( ruleOr EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:732:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1525);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1532); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:739:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:743:5: ( ( ( rule__Or__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:744:1: ( ( rule__Or__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:744:1: ( ( rule__Or__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:745:1: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:746:1: ( rule__Or__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:746:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr1562);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleXor"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:758:1: entryRuleXor : ruleXor EOF ;
    public final void entryRuleXor() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:759:1: ( ruleXor EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:760:1: ruleXor EOF
            {
             before(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_ruleXor_in_entryRuleXor1589);
            ruleXor();

            state._fsp--;

             after(grammarAccess.getXorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXor1596); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXor"


    // $ANTLR start "ruleXor"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:767:1: ruleXor : ( ( rule__Xor__Group__0 ) ) ;
    public final void ruleXor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:771:5: ( ( ( rule__Xor__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:772:1: ( ( rule__Xor__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:772:1: ( ( rule__Xor__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:773:1: ( rule__Xor__Group__0 )
            {
             before(grammarAccess.getXorAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:774:1: ( rule__Xor__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:774:2: rule__Xor__Group__0
            {
            pushFollow(FOLLOW_rule__Xor__Group__0_in_ruleXor1626);
            rule__Xor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXor"


    // $ANTLR start "ruleDisjunctiveOperator"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:787:1: ruleDisjunctiveOperator : ( ( Or_1 ) ) ;
    public final void ruleDisjunctiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:791:1: ( ( ( Or_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:792:1: ( ( Or_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:792:1: ( ( Or_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:793:1: ( Or_1 )
            {
             before(grammarAccess.getDisjunctiveOperatorAccess().getDisjunctionEnumLiteralDeclaration()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:794:1: ( Or_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:794:3: Or_1
            {
            match(input,Or_1,FOLLOW_Or_1_in_ruleDisjunctiveOperator1664); 

            }

             after(grammarAccess.getDisjunctiveOperatorAccess().getDisjunctionEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisjunctiveOperator"


    // $ANTLR start "ruleConjunctiveOperator"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:807:1: ruleConjunctiveOperator : ( ( And ) ) ;
    public final void ruleConjunctiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:811:1: ( ( ( And ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:812:1: ( ( And ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:812:1: ( ( And ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:813:1: ( And )
            {
             before(grammarAccess.getConjunctiveOperatorAccess().getConjunctionEnumLiteralDeclaration()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:814:1: ( And )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:814:3: And
            {
            match(input,And,FOLLOW_And_in_ruleConjunctiveOperator1702); 

            }

             after(grammarAccess.getConjunctiveOperatorAccess().getConjunctionEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConjunctiveOperator"


    // $ANTLR start "ruleEqualityOperator"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:827:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:831:1: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:832:1: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:832:1: ( ( rule__EqualityOperator__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:833:1: ( rule__EqualityOperator__Alternatives )
            {
             before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:834:1: ( rule__EqualityOperator__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:834:2: rule__EqualityOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__EqualityOperator__Alternatives_in_ruleEqualityOperator1739);
            rule__EqualityOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "ruleComparativeOperator"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:846:1: ruleComparativeOperator : ( ( rule__ComparativeOperator__Alternatives ) ) ;
    public final void ruleComparativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:850:1: ( ( ( rule__ComparativeOperator__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:851:1: ( ( rule__ComparativeOperator__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:851:1: ( ( rule__ComparativeOperator__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:852:1: ( rule__ComparativeOperator__Alternatives )
            {
             before(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:853:1: ( rule__ComparativeOperator__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:853:2: rule__ComparativeOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparativeOperator__Alternatives_in_ruleComparativeOperator1775);
            rule__ComparativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparativeOperator"


    // $ANTLR start "rule__Solitary__Alternatives"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:864:1: rule__Solitary__Alternatives : ( ( ruleMandatory ) | ( ruleOptional ) );
    public final void rule__Solitary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:868:1: ( ( ruleMandatory ) | ( ruleOptional ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:869:1: ( ruleMandatory )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:869:1: ( ruleMandatory )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:870:1: ruleMandatory
                    {
                     before(grammarAccess.getSolitaryAccess().getMandatoryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMandatory_in_rule__Solitary__Alternatives1810);
                    ruleMandatory();

                    state._fsp--;

                     after(grammarAccess.getSolitaryAccess().getMandatoryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:875:6: ( ruleOptional )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:875:6: ( ruleOptional )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:876:1: ruleOptional
                    {
                     before(grammarAccess.getSolitaryAccess().getOptionalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOptional_in_rule__Solitary__Alternatives1827);
                    ruleOptional();

                    state._fsp--;

                     after(grammarAccess.getSolitaryAccess().getOptionalParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solitary__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:886:1: rule__Primary__Alternatives : ( ( ( rule__Primary__FeatureReferenceAssignment_0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleUnary ) | ( ( rule__Primary__Group_3__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:890:1: ( ( ( rule__Primary__FeatureReferenceAssignment_0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleUnary ) | ( ( rule__Primary__Group_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case LeftParenthesis:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RightParenthesis) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_4>=And && LA2_4<=GreaterThanSignEqualsSign)||(LA2_4>=Or_1 && LA2_4<=LeftParenthesis)||(LA2_4>=HyphenMinus && LA2_4<=GreaterThanSign)||LA2_4==RULE_ID) ) {
                        alt2=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case ExclamationMark:
                case LeftParenthesis:
                case HyphenMinus:
                    {
                    alt2=4;
                    }
                    break;
                case RULE_NULL:
                case RULE_BOOLEAN:
                case RULE_INT:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case ExclamationMark:
            case HyphenMinus:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:891:1: ( ( rule__Primary__FeatureReferenceAssignment_0 ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:891:1: ( ( rule__Primary__FeatureReferenceAssignment_0 ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:892:1: ( rule__Primary__FeatureReferenceAssignment_0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getFeatureReferenceAssignment_0()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:893:1: ( rule__Primary__FeatureReferenceAssignment_0 )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:893:2: rule__Primary__FeatureReferenceAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Primary__FeatureReferenceAssignment_0_in_rule__Primary__Alternatives1859);
                    rule__Primary__FeatureReferenceAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getFeatureReferenceAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:897:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:897:6: ( ( rule__Primary__Group_1__0 ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:898:1: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:899:1: ( rule__Primary__Group_1__0 )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:899:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1877);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:903:6: ( ruleUnary )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:903:6: ( ruleUnary )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:904:1: ruleUnary
                    {
                     before(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUnary_in_rule__Primary__Alternatives1895);
                    ruleUnary();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:909:6: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:909:6: ( ( rule__Primary__Group_3__0 ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:910:1: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:911:1: ( rule__Primary__Group_3__0 )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:911:2: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_3__0_in_rule__Primary__Alternatives1912);
                    rule__Primary__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Unary__OperatorAlternatives_1_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:920:1: rule__Unary__OperatorAlternatives_1_0 : ( ( ExclamationMark ) | ( HyphenMinus ) );
    public final void rule__Unary__OperatorAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:924:1: ( ( ExclamationMark ) | ( HyphenMinus ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ExclamationMark) ) {
                alt3=1;
            }
            else if ( (LA3_0==HyphenMinus) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:925:1: ( ExclamationMark )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:925:1: ( ExclamationMark )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:926:1: ExclamationMark
                    {
                     before(grammarAccess.getUnaryAccess().getOperatorExclamationMarkKeyword_1_0_0()); 
                    match(input,ExclamationMark,FOLLOW_ExclamationMark_in_rule__Unary__OperatorAlternatives_1_01946); 
                     after(grammarAccess.getUnaryAccess().getOperatorExclamationMarkKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:933:6: ( HyphenMinus )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:933:6: ( HyphenMinus )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:934:1: HyphenMinus
                    {
                     before(grammarAccess.getUnaryAccess().getOperatorHyphenMinusKeyword_1_0_1()); 
                    match(input,HyphenMinus,FOLLOW_HyphenMinus_in_rule__Unary__OperatorAlternatives_1_01966); 
                     after(grammarAccess.getUnaryAccess().getOperatorHyphenMinusKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__OperatorAlternatives_1_0"


    // $ANTLR start "rule__Group__Alternatives"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:946:1: rule__Group__Alternatives : ( ( ruleOr ) | ( ruleXor ) );
    public final void rule__Group__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:950:1: ( ( ruleOr ) | ( ruleXor ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Or) ) {
                alt4=1;
            }
            else if ( (LA4_0==Xor) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:951:1: ( ruleOr )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:951:1: ( ruleOr )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:952:1: ruleOr
                    {
                     before(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOr_in_rule__Group__Alternatives2000);
                    ruleOr();

                    state._fsp--;

                     after(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:957:6: ( ruleXor )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:957:6: ( ruleXor )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:958:1: ruleXor
                    {
                     before(grammarAccess.getGroupAccess().getXorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleXor_in_rule__Group__Alternatives2017);
                    ruleXor();

                    state._fsp--;

                     after(grammarAccess.getGroupAccess().getXorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:968:1: rule__Attribute__Alternatives : ( ( ruleCString ) | ( ruleNumber ) | ( ruleRange ) | ( ruleCBoolean ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:972:1: ( ( ruleCString ) | ( ruleNumber ) | ( ruleRange ) | ( ruleCBoolean ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_NULL:
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_INT) ) {
                    alt5=3;
                }
                else if ( (LA5_2==EOF||LA5_2==RightParenthesis) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:973:1: ( ruleCString )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:973:1: ( ruleCString )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:974:1: ruleCString
                    {
                     before(grammarAccess.getAttributeAccess().getCStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCString_in_rule__Attribute__Alternatives2049);
                    ruleCString();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getCStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:979:6: ( ruleNumber )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:979:6: ( ruleNumber )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:980:1: ruleNumber
                    {
                     before(grammarAccess.getAttributeAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__Attribute__Alternatives2066);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:985:6: ( ruleRange )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:985:6: ( ruleRange )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:986:1: ruleRange
                    {
                     before(grammarAccess.getAttributeAccess().getRangeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRange_in_rule__Attribute__Alternatives2083);
                    ruleRange();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getRangeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:991:6: ( ruleCBoolean )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:991:6: ( ruleCBoolean )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:992:1: ruleCBoolean
                    {
                     before(grammarAccess.getAttributeAccess().getCBooleanParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCBoolean_in_rule__Attribute__Alternatives2100);
                    ruleCBoolean();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getCBooleanParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1002:1: rule__EString__Alternatives : ( ( RULE_ID ) | ( RULE_NULL ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1006:1: ( ( RULE_ID ) | ( RULE_NULL ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_NULL) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1007:1: ( RULE_ID )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1007:1: ( RULE_ID )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1008:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives2132); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1013:6: ( RULE_NULL )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1013:6: ( RULE_NULL )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1014:1: RULE_NULL
                    {
                     before(grammarAccess.getEStringAccess().getNULLTerminalRuleCall_1()); 
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__EString__Alternatives2149); 
                     after(grammarAccess.getEStringAccess().getNULLTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EqualityOperator__Alternatives"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1024:1: rule__EqualityOperator__Alternatives : ( ( ( EqualsSignEqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1028:1: ( ( ( EqualsSignEqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EqualsSignEqualsSign) ) {
                alt7=1;
            }
            else if ( (LA7_0==ExclamationMarkEqualsSign) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1029:1: ( ( EqualsSignEqualsSign ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1029:1: ( ( EqualsSignEqualsSign ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1030:1: ( EqualsSignEqualsSign )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1031:1: ( EqualsSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1031:3: EqualsSignEqualsSign
                    {
                    match(input,EqualsSignEqualsSign,FOLLOW_EqualsSignEqualsSign_in_rule__EqualityOperator__Alternatives2182); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1036:6: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1036:6: ( ( ExclamationMarkEqualsSign ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1037:1: ( ExclamationMarkEqualsSign )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNotEqualsEnumLiteralDeclaration_1()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1038:1: ( ExclamationMarkEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1038:3: ExclamationMarkEqualsSign
                    {
                    match(input,ExclamationMarkEqualsSign,FOLLOW_ExclamationMarkEqualsSign_in_rule__EqualityOperator__Alternatives2202); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getNotEqualsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityOperator__Alternatives"


    // $ANTLR start "rule__ComparativeOperator__Alternatives"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1048:1: rule__ComparativeOperator__Alternatives : ( ( ( GreaterThanSign ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) | ( ( LessThanSignEqualsSign ) ) );
    public final void rule__ComparativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1052:1: ( ( ( GreaterThanSign ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) | ( ( LessThanSignEqualsSign ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case GreaterThanSign:
                {
                alt8=1;
                }
                break;
            case LessThanSign:
                {
                alt8=2;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt8=3;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1053:1: ( ( GreaterThanSign ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1053:1: ( ( GreaterThanSign ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1054:1: ( GreaterThanSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_0()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1055:1: ( GreaterThanSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1055:3: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FOLLOW_GreaterThanSign_in_rule__ComparativeOperator__Alternatives2237); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1060:6: ( ( LessThanSign ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1060:6: ( ( LessThanSign ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1061:1: ( LessThanSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_1()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1062:1: ( LessThanSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1062:3: LessThanSign
                    {
                    match(input,LessThanSign,FOLLOW_LessThanSign_in_rule__ComparativeOperator__Alternatives2257); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1067:6: ( ( GreaterThanSignEqualsSign ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1067:6: ( ( GreaterThanSignEqualsSign ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1068:1: ( GreaterThanSignEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGreaterOrEqualsEnumLiteralDeclaration_2()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1069:1: ( GreaterThanSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1069:3: GreaterThanSignEqualsSign
                    {
                    match(input,GreaterThanSignEqualsSign,FOLLOW_GreaterThanSignEqualsSign_in_rule__ComparativeOperator__Alternatives2277); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGreaterOrEqualsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1074:6: ( ( LessThanSignEqualsSign ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1074:6: ( ( LessThanSignEqualsSign ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1075:1: ( LessThanSignEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLessOrEqualsEnumLiteralDeclaration_3()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1076:1: ( LessThanSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1076:3: LessThanSignEqualsSign
                    {
                    match(input,LessThanSignEqualsSign,FOLLOW_LessThanSignEqualsSign_in_rule__ComparativeOperator__Alternatives2297); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLessOrEqualsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeOperator__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1088:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1092:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1093:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02329);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02332);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1100:1: rule__Model__Group__0__Impl : ( Model ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1104:1: ( ( Model ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1105:1: ( Model )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1105:1: ( Model )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1106:1: Model
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,Model,FOLLOW_Model_in_rule__Model__Group__0__Impl2360); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1119:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1123:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1124:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12391);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12394);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1131:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1135:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1136:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1136:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1137:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1138:1: ( rule__Model__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1138:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2421);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1148:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1152:1: ( rule__Model__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1153:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22451);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1159:1: rule__Model__Group__2__Impl : ( ( rule__Model__RootAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1163:1: ( ( ( rule__Model__RootAssignment_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1164:1: ( ( rule__Model__RootAssignment_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1164:1: ( ( rule__Model__RootAssignment_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1165:1: ( rule__Model__RootAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getRootAssignment_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1166:1: ( rule__Model__RootAssignment_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1166:2: rule__Model__RootAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__RootAssignment_2_in_rule__Model__Group__2__Impl2478);
            rule__Model__RootAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRootAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Disjunction__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1182:1: rule__Disjunction__Group__0 : rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 ;
    public final void rule__Disjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1186:1: ( rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1187:2: rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__02514);
            rule__Disjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__02517);
            rule__Disjunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__0"


    // $ANTLR start "rule__Disjunction__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1194:1: rule__Disjunction__Group__0__Impl : ( ruleConjunction ) ;
    public final void rule__Disjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1198:1: ( ( ruleConjunction ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1199:1: ( ruleConjunction )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1199:1: ( ruleConjunction )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1200:1: ruleConjunction
            {
             before(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Disjunction__Group__0__Impl2544);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__0__Impl"


    // $ANTLR start "rule__Disjunction__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1211:1: rule__Disjunction__Group__1 : rule__Disjunction__Group__1__Impl ;
    public final void rule__Disjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1215:1: ( rule__Disjunction__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1216:2: rule__Disjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__12573);
            rule__Disjunction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__1"


    // $ANTLR start "rule__Disjunction__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1222:1: rule__Disjunction__Group__1__Impl : ( ( rule__Disjunction__Group_1__0 )* ) ;
    public final void rule__Disjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1226:1: ( ( ( rule__Disjunction__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1227:1: ( ( rule__Disjunction__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1227:1: ( ( rule__Disjunction__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1228:1: ( rule__Disjunction__Group_1__0 )*
            {
             before(grammarAccess.getDisjunctionAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1229:1: ( rule__Disjunction__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Or_1) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1229:2: rule__Disjunction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Disjunction__Group_1__0_in_rule__Disjunction__Group__1__Impl2600);
            	    rule__Disjunction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDisjunctionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1243:1: rule__Disjunction__Group_1__0 : rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 ;
    public final void rule__Disjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1247:1: ( rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1248:2: rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1__0__Impl_in_rule__Disjunction__Group_1__02635);
            rule__Disjunction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_1__1_in_rule__Disjunction__Group_1__02638);
            rule__Disjunction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__0"


    // $ANTLR start "rule__Disjunction__Group_1__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1255:1: rule__Disjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1259:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1260:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1260:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1261:1: ()
            {
             before(grammarAccess.getDisjunctionAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1262:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1264:1: 
            {
            }

             after(grammarAccess.getDisjunctionAccess().getBinaryLeftExpAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1274:1: rule__Disjunction__Group_1__1 : rule__Disjunction__Group_1__1__Impl rule__Disjunction__Group_1__2 ;
    public final void rule__Disjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1278:1: ( rule__Disjunction__Group_1__1__Impl rule__Disjunction__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1279:2: rule__Disjunction__Group_1__1__Impl rule__Disjunction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1__1__Impl_in_rule__Disjunction__Group_1__12696);
            rule__Disjunction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_1__2_in_rule__Disjunction__Group_1__12699);
            rule__Disjunction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__1"


    // $ANTLR start "rule__Disjunction__Group_1__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1286:1: rule__Disjunction__Group_1__1__Impl : ( ( rule__Disjunction__OperatorAssignment_1_1 ) ) ;
    public final void rule__Disjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1290:1: ( ( ( rule__Disjunction__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1291:1: ( ( rule__Disjunction__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1291:1: ( ( rule__Disjunction__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1292:1: ( rule__Disjunction__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getDisjunctionAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1293:1: ( rule__Disjunction__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1293:2: rule__Disjunction__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Disjunction__OperatorAssignment_1_1_in_rule__Disjunction__Group_1__1__Impl2726);
            rule__Disjunction__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDisjunctionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1303:1: rule__Disjunction__Group_1__2 : rule__Disjunction__Group_1__2__Impl ;
    public final void rule__Disjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1307:1: ( rule__Disjunction__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1308:2: rule__Disjunction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1__2__Impl_in_rule__Disjunction__Group_1__22756);
            rule__Disjunction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__2"


    // $ANTLR start "rule__Disjunction__Group_1__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1314:1: rule__Disjunction__Group_1__2__Impl : ( ( rule__Disjunction__RightExpAssignment_1_2 ) ) ;
    public final void rule__Disjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1318:1: ( ( ( rule__Disjunction__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1319:1: ( ( rule__Disjunction__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1319:1: ( ( rule__Disjunction__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1320:1: ( rule__Disjunction__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getDisjunctionAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1321:1: ( rule__Disjunction__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1321:2: rule__Disjunction__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Disjunction__RightExpAssignment_1_2_in_rule__Disjunction__Group_1__2__Impl2783);
            rule__Disjunction__RightExpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDisjunctionAccess().getRightExpAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__2__Impl"


    // $ANTLR start "rule__Conjunction__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1337:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1341:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1342:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__02819);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__02822);
            rule__Conjunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0"


    // $ANTLR start "rule__Conjunction__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1349:1: rule__Conjunction__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1353:1: ( ( ruleEquality ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1354:1: ( ruleEquality )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1354:1: ( ruleEquality )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1355:1: ruleEquality
            {
             before(grammarAccess.getConjunctionAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__Conjunction__Group__0__Impl2849);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getEqualityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0__Impl"


    // $ANTLR start "rule__Conjunction__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1366:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1370:1: ( rule__Conjunction__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1371:2: rule__Conjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__12878);
            rule__Conjunction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1"


    // $ANTLR start "rule__Conjunction__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1377:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )* ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1381:1: ( ( ( rule__Conjunction__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1382:1: ( ( rule__Conjunction__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1382:1: ( ( rule__Conjunction__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1383:1: ( rule__Conjunction__Group_1__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1384:1: ( rule__Conjunction__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==And) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1384:2: rule__Conjunction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl2905);
            	    rule__Conjunction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getConjunctionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1398:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1402:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1403:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__02940);
            rule__Conjunction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__02943);
            rule__Conjunction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0"


    // $ANTLR start "rule__Conjunction__Group_1__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1410:1: rule__Conjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1414:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1415:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1415:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1416:1: ()
            {
             before(grammarAccess.getConjunctionAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1417:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1419:1: 
            {
            }

             after(grammarAccess.getConjunctionAccess().getBinaryLeftExpAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1429:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1433:1: ( rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1434:2: rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__13001);
            rule__Conjunction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__13004);
            rule__Conjunction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__1"


    // $ANTLR start "rule__Conjunction__Group_1__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1441:1: rule__Conjunction__Group_1__1__Impl : ( ( rule__Conjunction__OperatorAssignment_1_1 ) ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1445:1: ( ( ( rule__Conjunction__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1446:1: ( ( rule__Conjunction__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1446:1: ( ( rule__Conjunction__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1447:1: ( rule__Conjunction__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getConjunctionAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1448:1: ( rule__Conjunction__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1448:2: rule__Conjunction__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Conjunction__OperatorAssignment_1_1_in_rule__Conjunction__Group_1__1__Impl3031);
            rule__Conjunction__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1458:1: rule__Conjunction__Group_1__2 : rule__Conjunction__Group_1__2__Impl ;
    public final void rule__Conjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1462:1: ( rule__Conjunction__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1463:2: rule__Conjunction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__23061);
            rule__Conjunction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__2"


    // $ANTLR start "rule__Conjunction__Group_1__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1469:1: rule__Conjunction__Group_1__2__Impl : ( ( rule__Conjunction__RightExpAssignment_1_2 ) ) ;
    public final void rule__Conjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1473:1: ( ( ( rule__Conjunction__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1474:1: ( ( rule__Conjunction__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1474:1: ( ( rule__Conjunction__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1475:1: ( rule__Conjunction__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getConjunctionAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1476:1: ( rule__Conjunction__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1476:2: rule__Conjunction__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Conjunction__RightExpAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl3088);
            rule__Conjunction__RightExpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getRightExpAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1492:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1496:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1497:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__03124);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__03127);
            rule__Equality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1504:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1508:1: ( ( ruleComparison ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1509:1: ( ruleComparison )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1509:1: ( ruleComparison )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1510:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl3154);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1521:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1525:1: ( rule__Equality__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1526:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__13183);
            rule__Equality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1532:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1536:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1537:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1537:1: ( ( rule__Equality__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1538:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1539:1: ( rule__Equality__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ExclamationMarkEqualsSign||LA11_0==EqualsSignEqualsSign) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1539:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl3210);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1553:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1557:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1558:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__03245);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__03248);
            rule__Equality__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1565:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1569:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1570:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1570:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1571:1: ()
            {
             before(grammarAccess.getEqualityAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1572:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1574:1: 
            {
            }

             after(grammarAccess.getEqualityAccess().getBinaryLeftExpAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1584:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1588:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1589:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__13306);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__13309);
            rule__Equality__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1596:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OperatorAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1600:1: ( ( ( rule__Equality__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1601:1: ( ( rule__Equality__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1601:1: ( ( rule__Equality__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1602:1: ( rule__Equality__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1603:1: ( rule__Equality__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1603:2: rule__Equality__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OperatorAssignment_1_1_in_rule__Equality__Group_1__1__Impl3336);
            rule__Equality__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1613:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1617:1: ( rule__Equality__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1618:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__23366);
            rule__Equality__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1624:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightExpAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1628:1: ( ( ( rule__Equality__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1629:1: ( ( rule__Equality__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1629:1: ( ( rule__Equality__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1630:1: ( rule__Equality__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1631:1: ( rule__Equality__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1631:2: rule__Equality__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightExpAssignment_1_2_in_rule__Equality__Group_1__2__Impl3393);
            rule__Equality__RightExpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightExpAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1647:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1651:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1652:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__03429);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__03432);
            rule__Comparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1659:1: rule__Comparison__Group__0__Impl : ( ruleBinary ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1663:1: ( ( ruleBinary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1664:1: ( ruleBinary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1664:1: ( ruleBinary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1665:1: ruleBinary
            {
             before(grammarAccess.getComparisonAccess().getBinaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBinary_in_rule__Comparison__Group__0__Impl3459);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getBinaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1676:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1680:1: ( rule__Comparison__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1681:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__13488);
            rule__Comparison__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1687:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1691:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1692:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1692:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1693:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1694:1: ( rule__Comparison__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==LessThanSignEqualsSign||LA12_0==GreaterThanSignEqualsSign||(LA12_0>=LessThanSign && LA12_0<=GreaterThanSign)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1694:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl3515);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1708:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1712:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1713:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__03550);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__03553);
            rule__Comparison__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1720:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1724:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1725:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1725:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1726:1: ()
            {
             before(grammarAccess.getComparisonAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1727:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1729:1: 
            {
            }

             after(grammarAccess.getComparisonAccess().getBinaryLeftExpAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1739:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1743:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1744:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__13611);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__13614);
            rule__Comparison__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1751:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OperatorAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1755:1: ( ( ( rule__Comparison__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1756:1: ( ( rule__Comparison__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1756:1: ( ( rule__Comparison__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1757:1: ( rule__Comparison__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1758:1: ( rule__Comparison__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1758:2: rule__Comparison__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OperatorAssignment_1_1_in_rule__Comparison__Group_1__1__Impl3641);
            rule__Comparison__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1768:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1772:1: ( rule__Comparison__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1773:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__23671);
            rule__Comparison__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1779:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightExpAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1783:1: ( ( ( rule__Comparison__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1784:1: ( ( rule__Comparison__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1784:1: ( ( rule__Comparison__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1785:1: ( rule__Comparison__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1786:1: ( rule__Comparison__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1786:2: rule__Comparison__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightExpAssignment_1_2_in_rule__Comparison__Group_1__2__Impl3698);
            rule__Comparison__RightExpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightExpAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__Binary__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1802:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1806:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1807:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_rule__Binary__Group__0__Impl_in_rule__Binary__Group__03734);
            rule__Binary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binary__Group__1_in_rule__Binary__Group__03737);
            rule__Binary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__0"


    // $ANTLR start "rule__Binary__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1814:1: rule__Binary__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1818:1: ( ( rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1819:1: ( rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1819:1: ( rulePrimary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1820:1: rulePrimary
            {
             before(grammarAccess.getBinaryAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Binary__Group__0__Impl3764);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__0__Impl"


    // $ANTLR start "rule__Binary__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1831:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1835:1: ( rule__Binary__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1836:2: rule__Binary__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Binary__Group__1__Impl_in_rule__Binary__Group__13793);
            rule__Binary__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__1"


    // $ANTLR start "rule__Binary__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1842:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__Group_1__0 )* ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1846:1: ( ( ( rule__Binary__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1847:1: ( ( rule__Binary__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1847:1: ( ( rule__Binary__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1848:1: ( rule__Binary__Group_1__0 )*
            {
             before(grammarAccess.getBinaryAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1849:1: ( rule__Binary__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=ExclamationMark && LA13_0<=LeftParenthesis)||LA13_0==HyphenMinus||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1849:2: rule__Binary__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Binary__Group_1__0_in_rule__Binary__Group__1__Impl3820);
            	    rule__Binary__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBinaryAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__1__Impl"


    // $ANTLR start "rule__Binary__Group_1__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1863:1: rule__Binary__Group_1__0 : rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 ;
    public final void rule__Binary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1867:1: ( rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1868:2: rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Binary__Group_1__0__Impl_in_rule__Binary__Group_1__03855);
            rule__Binary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binary__Group_1__1_in_rule__Binary__Group_1__03858);
            rule__Binary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group_1__0"


    // $ANTLR start "rule__Binary__Group_1__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1875:1: rule__Binary__Group_1__0__Impl : ( () ) ;
    public final void rule__Binary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1879:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1880:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1880:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1881:1: ()
            {
             before(grammarAccess.getBinaryAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1882:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1884:1: 
            {
            }

             after(grammarAccess.getBinaryAccess().getBinaryLeftExpAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group_1__0__Impl"


    // $ANTLR start "rule__Binary__Group_1__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1894:1: rule__Binary__Group_1__1 : rule__Binary__Group_1__1__Impl ;
    public final void rule__Binary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1898:1: ( rule__Binary__Group_1__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1899:2: rule__Binary__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Binary__Group_1__1__Impl_in_rule__Binary__Group_1__13916);
            rule__Binary__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group_1__1"


    // $ANTLR start "rule__Binary__Group_1__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1905:1: rule__Binary__Group_1__1__Impl : ( ( rule__Binary__RightExpAssignment_1_1 ) ) ;
    public final void rule__Binary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1909:1: ( ( ( rule__Binary__RightExpAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1910:1: ( ( rule__Binary__RightExpAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1910:1: ( ( rule__Binary__RightExpAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1911:1: ( rule__Binary__RightExpAssignment_1_1 )
            {
             before(grammarAccess.getBinaryAccess().getRightExpAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1912:1: ( rule__Binary__RightExpAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1912:2: rule__Binary__RightExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Binary__RightExpAssignment_1_1_in_rule__Binary__Group_1__1__Impl3943);
            rule__Binary__RightExpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getRightExpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1926:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1930:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1931:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__03977);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__03980);
            rule__Primary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1938:1: rule__Primary__Group_1__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1942:1: ( ( LeftParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1943:1: ( LeftParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1943:1: ( LeftParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1944:1: LeftParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rule__Primary__Group_1__0__Impl4008); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1957:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1961:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1962:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__14039);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__14042);
            rule__Primary__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1969:1: rule__Primary__Group_1__1__Impl : ( ruleAttributeConstrain ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1973:1: ( ( ruleAttributeConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1974:1: ( ruleAttributeConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1974:1: ( ruleAttributeConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1975:1: ruleAttributeConstrain
            {
             before(grammarAccess.getPrimaryAccess().getAttributeConstrainParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleAttributeConstrain_in_rule__Primary__Group_1__1__Impl4069);
            ruleAttributeConstrain();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAttributeConstrainParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1986:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1990:1: ( rule__Primary__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1991:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__24098);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1997:1: rule__Primary__Group_1__2__Impl : ( RightParenthesis ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2001:1: ( ( RightParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2002:1: ( RightParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2002:1: ( RightParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2003:1: RightParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rule__Primary__Group_1__2__Impl4126); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_3__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2022:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2026:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2027:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_3__0__Impl_in_rule__Primary__Group_3__04163);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_3__1_in_rule__Primary__Group_3__04166);
            rule__Primary__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2034:1: rule__Primary__Group_3__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2038:1: ( ( LeftParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2039:1: ( LeftParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2039:1: ( LeftParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2040:1: LeftParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rule__Primary__Group_3__0__Impl4194); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2053:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2057:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2058:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_3__1__Impl_in_rule__Primary__Group_3__14225);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_3__2_in_rule__Primary__Group_3__14228);
            rule__Primary__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2065:1: rule__Primary__Group_3__1__Impl : ( ruleConstrain ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2069:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2070:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2070:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2071:1: ruleConstrain
            {
             before(grammarAccess.getPrimaryAccess().getConstrainParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Primary__Group_3__1__Impl4255);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getConstrainParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2082:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2086:1: ( rule__Primary__Group_3__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2087:2: rule__Primary__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_3__2__Impl_in_rule__Primary__Group_3__24284);
            rule__Primary__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2093:1: rule__Primary__Group_3__2__Impl : ( RightParenthesis ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2097:1: ( ( RightParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2098:1: ( RightParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2098:1: ( RightParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2099:1: RightParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rule__Primary__Group_3__2__Impl4312); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__Unary__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2118:1: rule__Unary__Group__0 : rule__Unary__Group__0__Impl rule__Unary__Group__1 ;
    public final void rule__Unary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2122:1: ( rule__Unary__Group__0__Impl rule__Unary__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2123:2: rule__Unary__Group__0__Impl rule__Unary__Group__1
            {
            pushFollow(FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__04349);
            rule__Unary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__04352);
            rule__Unary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group__0"


    // $ANTLR start "rule__Unary__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2130:1: rule__Unary__Group__0__Impl : ( () ) ;
    public final void rule__Unary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2134:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2135:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2135:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2136:1: ()
            {
             before(grammarAccess.getUnaryAccess().getUnaryAction_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2137:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2139:1: 
            {
            }

             after(grammarAccess.getUnaryAccess().getUnaryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group__0__Impl"


    // $ANTLR start "rule__Unary__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2149:1: rule__Unary__Group__1 : rule__Unary__Group__1__Impl rule__Unary__Group__2 ;
    public final void rule__Unary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2153:1: ( rule__Unary__Group__1__Impl rule__Unary__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2154:2: rule__Unary__Group__1__Impl rule__Unary__Group__2
            {
            pushFollow(FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__14410);
            rule__Unary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unary__Group__2_in_rule__Unary__Group__14413);
            rule__Unary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group__1"


    // $ANTLR start "rule__Unary__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2161:1: rule__Unary__Group__1__Impl : ( ( rule__Unary__OperatorAssignment_1 ) ) ;
    public final void rule__Unary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2165:1: ( ( ( rule__Unary__OperatorAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2166:1: ( ( rule__Unary__OperatorAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2166:1: ( ( rule__Unary__OperatorAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2167:1: ( rule__Unary__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryAccess().getOperatorAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2168:1: ( rule__Unary__OperatorAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2168:2: rule__Unary__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__Unary__OperatorAssignment_1_in_rule__Unary__Group__1__Impl4440);
            rule__Unary__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group__1__Impl"


    // $ANTLR start "rule__Unary__Group__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2178:1: rule__Unary__Group__2 : rule__Unary__Group__2__Impl ;
    public final void rule__Unary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2182:1: ( rule__Unary__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2183:2: rule__Unary__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Unary__Group__2__Impl_in_rule__Unary__Group__24470);
            rule__Unary__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group__2"


    // $ANTLR start "rule__Unary__Group__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2189:1: rule__Unary__Group__2__Impl : ( ( rule__Unary__ExpAssignment_2 ) ) ;
    public final void rule__Unary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2193:1: ( ( ( rule__Unary__ExpAssignment_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2194:1: ( ( rule__Unary__ExpAssignment_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2194:1: ( ( rule__Unary__ExpAssignment_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2195:1: ( rule__Unary__ExpAssignment_2 )
            {
             before(grammarAccess.getUnaryAccess().getExpAssignment_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2196:1: ( rule__Unary__ExpAssignment_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2196:2: rule__Unary__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__Unary__ExpAssignment_2_in_rule__Unary__Group__2__Impl4497);
            rule__Unary__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2212:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2216:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2217:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04533);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04536);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2224:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2228:1: ( ( RULE_ID ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2229:1: ( RULE_ID )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2229:1: ( RULE_ID )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2230:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4563); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2241:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2245:1: ( rule__QualifiedName__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2246:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14592);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2252:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2256:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2257:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2257:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2258:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2259:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==FullStop) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2259:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4619);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2273:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2277:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2278:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04654);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04657);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2285:1: rule__QualifiedName__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2289:1: ( ( FullStop ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2290:1: ( FullStop )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2290:1: ( FullStop )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2291:1: FullStop
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,FullStop,FOLLOW_FullStop_in_rule__QualifiedName__Group_1__0__Impl4685); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2304:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2308:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2309:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14716);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2315:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2319:1: ( ( RULE_ID ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2320:1: ( RULE_ID )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2320:1: ( RULE_ID )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2321:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4743); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2336:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2340:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2341:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__04776);
            rule__Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__1_in_rule__Range__Group__04779);
            rule__Range__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2348:1: rule__Range__Group__0__Impl : ( ( rule__Range__LowerAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2352:1: ( ( ( rule__Range__LowerAssignment_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2353:1: ( ( rule__Range__LowerAssignment_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2353:1: ( ( rule__Range__LowerAssignment_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2354:1: ( rule__Range__LowerAssignment_0 )
            {
             before(grammarAccess.getRangeAccess().getLowerAssignment_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2355:1: ( rule__Range__LowerAssignment_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2355:2: rule__Range__LowerAssignment_0
            {
            pushFollow(FOLLOW_rule__Range__LowerAssignment_0_in_rule__Range__Group__0__Impl4806);
            rule__Range__LowerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getLowerAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2365:1: rule__Range__Group__1 : rule__Range__Group__1__Impl ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2369:1: ( rule__Range__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2370:2: rule__Range__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__14836);
            rule__Range__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2376:1: rule__Range__Group__1__Impl : ( ( rule__Range__UpperAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2380:1: ( ( ( rule__Range__UpperAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2381:1: ( ( rule__Range__UpperAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2381:1: ( ( rule__Range__UpperAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2382:1: ( rule__Range__UpperAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getUpperAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2383:1: ( rule__Range__UpperAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2383:2: rule__Range__UpperAssignment_1
            {
            pushFollow(FOLLOW_rule__Range__UpperAssignment_1_in_rule__Range__Group__1__Impl4863);
            rule__Range__UpperAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getUpperAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2397:1: rule__Feature_Impl__Group__0 : rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 ;
    public final void rule__Feature_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2401:1: ( rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2402:2: rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__0__Impl_in_rule__Feature_Impl__Group__04897);
            rule__Feature_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group__1_in_rule__Feature_Impl__Group__04900);
            rule__Feature_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group__0"


    // $ANTLR start "rule__Feature_Impl__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2409:1: rule__Feature_Impl__Group__0__Impl : ( Feature ) ;
    public final void rule__Feature_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2413:1: ( ( Feature ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2414:1: ( Feature )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2414:1: ( Feature )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2415:1: Feature
            {
             before(grammarAccess.getFeature_ImplAccess().getFeatureKeyword_0()); 
            match(input,Feature,FOLLOW_Feature_in_rule__Feature_Impl__Group__0__Impl4928); 
             after(grammarAccess.getFeature_ImplAccess().getFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group__0__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2428:1: rule__Feature_Impl__Group__1 : rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 ;
    public final void rule__Feature_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2432:1: ( rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2433:2: rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__1__Impl_in_rule__Feature_Impl__Group__14959);
            rule__Feature_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group__2_in_rule__Feature_Impl__Group__14962);
            rule__Feature_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group__1"


    // $ANTLR start "rule__Feature_Impl__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2440:1: rule__Feature_Impl__Group__1__Impl : ( ( rule__Feature_Impl__NameAssignment_1 ) ) ;
    public final void rule__Feature_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2444:1: ( ( ( rule__Feature_Impl__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2445:1: ( ( rule__Feature_Impl__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2445:1: ( ( rule__Feature_Impl__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2446:1: ( rule__Feature_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2447:1: ( rule__Feature_Impl__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2447:2: rule__Feature_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__NameAssignment_1_in_rule__Feature_Impl__Group__1__Impl4989);
            rule__Feature_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeature_ImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group__1__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2457:1: rule__Feature_Impl__Group__2 : rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 ;
    public final void rule__Feature_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2461:1: ( rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2462:2: rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__2__Impl_in_rule__Feature_Impl__Group__25019);
            rule__Feature_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group__3_in_rule__Feature_Impl__Group__25022);
            rule__Feature_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group__2"


    // $ANTLR start "rule__Feature_Impl__Group__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2469:1: rule__Feature_Impl__Group__2__Impl : ( ( rule__Feature_Impl__Group_2__0 )? ) ;
    public final void rule__Feature_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2473:1: ( ( ( rule__Feature_Impl__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2474:1: ( ( rule__Feature_Impl__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2474:1: ( ( rule__Feature_Impl__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2475:1: ( rule__Feature_Impl__Group_2__0 )?
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2476:1: ( rule__Feature_Impl__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_BEGIN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2476:2: rule__Feature_Impl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Feature_Impl__Group_2__0_in_rule__Feature_Impl__Group__2__Impl5049);
                    rule__Feature_Impl__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeature_ImplAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group__2__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2486:1: rule__Feature_Impl__Group__3 : rule__Feature_Impl__Group__3__Impl ;
    public final void rule__Feature_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2490:1: ( rule__Feature_Impl__Group__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2491:2: rule__Feature_Impl__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__3__Impl_in_rule__Feature_Impl__Group__35080);
            rule__Feature_Impl__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group__3"


    // $ANTLR start "rule__Feature_Impl__Group__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2497:1: rule__Feature_Impl__Group__3__Impl : ( ( rule__Feature_Impl__Group_3__0 )? ) ;
    public final void rule__Feature_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2501:1: ( ( ( rule__Feature_Impl__Group_3__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2502:1: ( ( rule__Feature_Impl__Group_3__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2502:1: ( ( rule__Feature_Impl__Group_3__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2503:1: ( rule__Feature_Impl__Group_3__0 )?
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2504:1: ( rule__Feature_Impl__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LeftSquareBracket) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2504:2: rule__Feature_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Feature_Impl__Group_3__0_in_rule__Feature_Impl__Group__3__Impl5107);
                    rule__Feature_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeature_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group__3__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2522:1: rule__Feature_Impl__Group_2__0 : rule__Feature_Impl__Group_2__0__Impl rule__Feature_Impl__Group_2__1 ;
    public final void rule__Feature_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2526:1: ( rule__Feature_Impl__Group_2__0__Impl rule__Feature_Impl__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2527:2: rule__Feature_Impl__Group_2__0__Impl rule__Feature_Impl__Group_2__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__0__Impl_in_rule__Feature_Impl__Group_2__05146);
            rule__Feature_Impl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__1_in_rule__Feature_Impl__Group_2__05149);
            rule__Feature_Impl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_2__0"


    // $ANTLR start "rule__Feature_Impl__Group_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2534:1: rule__Feature_Impl__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Feature_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2538:1: ( ( RULE_BEGIN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2539:1: ( RULE_BEGIN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2539:1: ( RULE_BEGIN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2540:1: RULE_BEGIN
            {
             before(grammarAccess.getFeature_ImplAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Feature_Impl__Group_2__0__Impl5176); 
             after(grammarAccess.getFeature_ImplAccess().getBEGINTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_2__0__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2551:1: rule__Feature_Impl__Group_2__1 : rule__Feature_Impl__Group_2__1__Impl rule__Feature_Impl__Group_2__2 ;
    public final void rule__Feature_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2555:1: ( rule__Feature_Impl__Group_2__1__Impl rule__Feature_Impl__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2556:2: rule__Feature_Impl__Group_2__1__Impl rule__Feature_Impl__Group_2__2
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__1__Impl_in_rule__Feature_Impl__Group_2__15205);
            rule__Feature_Impl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__2_in_rule__Feature_Impl__Group_2__15208);
            rule__Feature_Impl__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_2__1"


    // $ANTLR start "rule__Feature_Impl__Group_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2563:1: rule__Feature_Impl__Group_2__1__Impl : ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) ) ;
    public final void rule__Feature_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2567:1: ( ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2568:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2568:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2569:1: ( rule__Feature_Impl__SubfeatureAssignment_2_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2570:1: ( rule__Feature_Impl__SubfeatureAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2570:2: rule__Feature_Impl__SubfeatureAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_1_in_rule__Feature_Impl__Group_2__1__Impl5235);
            rule__Feature_Impl__SubfeatureAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeature_ImplAccess().getSubfeatureAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_2__1__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_2__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2580:1: rule__Feature_Impl__Group_2__2 : rule__Feature_Impl__Group_2__2__Impl rule__Feature_Impl__Group_2__3 ;
    public final void rule__Feature_Impl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2584:1: ( rule__Feature_Impl__Group_2__2__Impl rule__Feature_Impl__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2585:2: rule__Feature_Impl__Group_2__2__Impl rule__Feature_Impl__Group_2__3
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__2__Impl_in_rule__Feature_Impl__Group_2__25265);
            rule__Feature_Impl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__3_in_rule__Feature_Impl__Group_2__25268);
            rule__Feature_Impl__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_2__2"


    // $ANTLR start "rule__Feature_Impl__Group_2__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2592:1: rule__Feature_Impl__Group_2__2__Impl : ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* ) ;
    public final void rule__Feature_Impl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2596:1: ( ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2597:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2597:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2598:1: ( rule__Feature_Impl__SubfeatureAssignment_2_2 )*
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureAssignment_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2599:1: ( rule__Feature_Impl__SubfeatureAssignment_2_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==QuestionMark||LA17_0==RULE_NULL||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2599:2: rule__Feature_Impl__SubfeatureAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_2_in_rule__Feature_Impl__Group_2__2__Impl5295);
            	    rule__Feature_Impl__SubfeatureAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getFeature_ImplAccess().getSubfeatureAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_2__2__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_2__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2609:1: rule__Feature_Impl__Group_2__3 : rule__Feature_Impl__Group_2__3__Impl ;
    public final void rule__Feature_Impl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2613:1: ( rule__Feature_Impl__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2614:2: rule__Feature_Impl__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__3__Impl_in_rule__Feature_Impl__Group_2__35326);
            rule__Feature_Impl__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_2__3"


    // $ANTLR start "rule__Feature_Impl__Group_2__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2620:1: rule__Feature_Impl__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Feature_Impl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2624:1: ( ( RULE_END ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2625:1: ( RULE_END )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2625:1: ( RULE_END )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2626:1: RULE_END
            {
             before(grammarAccess.getFeature_ImplAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Feature_Impl__Group_2__3__Impl5353); 
             after(grammarAccess.getFeature_ImplAccess().getENDTerminalRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_2__3__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_3__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2645:1: rule__Feature_Impl__Group_3__0 : rule__Feature_Impl__Group_3__0__Impl rule__Feature_Impl__Group_3__1 ;
    public final void rule__Feature_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2649:1: ( rule__Feature_Impl__Group_3__0__Impl rule__Feature_Impl__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2650:2: rule__Feature_Impl__Group_3__0__Impl rule__Feature_Impl__Group_3__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__0__Impl_in_rule__Feature_Impl__Group_3__05390);
            rule__Feature_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__1_in_rule__Feature_Impl__Group_3__05393);
            rule__Feature_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_3__0"


    // $ANTLR start "rule__Feature_Impl__Group_3__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2657:1: rule__Feature_Impl__Group_3__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Feature_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2661:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2662:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2662:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2663:1: LeftSquareBracket
            {
             before(grammarAccess.getFeature_ImplAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Feature_Impl__Group_3__0__Impl5421); 
             after(grammarAccess.getFeature_ImplAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_3__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2676:1: rule__Feature_Impl__Group_3__1 : rule__Feature_Impl__Group_3__1__Impl rule__Feature_Impl__Group_3__2 ;
    public final void rule__Feature_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2680:1: ( rule__Feature_Impl__Group_3__1__Impl rule__Feature_Impl__Group_3__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2681:2: rule__Feature_Impl__Group_3__1__Impl rule__Feature_Impl__Group_3__2
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__1__Impl_in_rule__Feature_Impl__Group_3__15452);
            rule__Feature_Impl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__2_in_rule__Feature_Impl__Group_3__15455);
            rule__Feature_Impl__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_3__1"


    // $ANTLR start "rule__Feature_Impl__Group_3__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2688:1: rule__Feature_Impl__Group_3__1__Impl : ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) ) ;
    public final void rule__Feature_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2692:1: ( ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2693:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2693:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2694:1: ( rule__Feature_Impl__ConstrainsAssignment_3_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsAssignment_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2695:1: ( rule__Feature_Impl__ConstrainsAssignment_3_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2695:2: rule__Feature_Impl__ConstrainsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_1_in_rule__Feature_Impl__Group_3__1__Impl5482);
            rule__Feature_Impl__ConstrainsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFeature_ImplAccess().getConstrainsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_3__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2705:1: rule__Feature_Impl__Group_3__2 : rule__Feature_Impl__Group_3__2__Impl rule__Feature_Impl__Group_3__3 ;
    public final void rule__Feature_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2709:1: ( rule__Feature_Impl__Group_3__2__Impl rule__Feature_Impl__Group_3__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2710:2: rule__Feature_Impl__Group_3__2__Impl rule__Feature_Impl__Group_3__3
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__2__Impl_in_rule__Feature_Impl__Group_3__25512);
            rule__Feature_Impl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__3_in_rule__Feature_Impl__Group_3__25515);
            rule__Feature_Impl__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_3__2"


    // $ANTLR start "rule__Feature_Impl__Group_3__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2717:1: rule__Feature_Impl__Group_3__2__Impl : ( ( rule__Feature_Impl__Group_3_2__0 )* ) ;
    public final void rule__Feature_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2721:1: ( ( ( rule__Feature_Impl__Group_3_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2722:1: ( ( rule__Feature_Impl__Group_3_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2722:1: ( ( rule__Feature_Impl__Group_3_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2723:1: ( rule__Feature_Impl__Group_3_2__0 )*
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_3_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2724:1: ( rule__Feature_Impl__Group_3_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Comma) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2724:2: rule__Feature_Impl__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__0_in_rule__Feature_Impl__Group_3__2__Impl5542);
            	    rule__Feature_Impl__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getFeature_ImplAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_3__2__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_3__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2734:1: rule__Feature_Impl__Group_3__3 : rule__Feature_Impl__Group_3__3__Impl ;
    public final void rule__Feature_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2738:1: ( rule__Feature_Impl__Group_3__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2739:2: rule__Feature_Impl__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__3__Impl_in_rule__Feature_Impl__Group_3__35573);
            rule__Feature_Impl__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_3__3"


    // $ANTLR start "rule__Feature_Impl__Group_3__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2745:1: rule__Feature_Impl__Group_3__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Feature_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2749:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2750:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2750:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2751:1: RightSquareBracket
            {
             before(grammarAccess.getFeature_ImplAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Feature_Impl__Group_3__3__Impl5601); 
             after(grammarAccess.getFeature_ImplAccess().getRightSquareBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_3__3__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_3_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2772:1: rule__Feature_Impl__Group_3_2__0 : rule__Feature_Impl__Group_3_2__0__Impl rule__Feature_Impl__Group_3_2__1 ;
    public final void rule__Feature_Impl__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2776:1: ( rule__Feature_Impl__Group_3_2__0__Impl rule__Feature_Impl__Group_3_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2777:2: rule__Feature_Impl__Group_3_2__0__Impl rule__Feature_Impl__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__0__Impl_in_rule__Feature_Impl__Group_3_2__05640);
            rule__Feature_Impl__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__1_in_rule__Feature_Impl__Group_3_2__05643);
            rule__Feature_Impl__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_3_2__0"


    // $ANTLR start "rule__Feature_Impl__Group_3_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2784:1: rule__Feature_Impl__Group_3_2__0__Impl : ( Comma ) ;
    public final void rule__Feature_Impl__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2788:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2789:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2789:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2790:1: Comma
            {
             before(grammarAccess.getFeature_ImplAccess().getCommaKeyword_3_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Feature_Impl__Group_3_2__0__Impl5671); 
             after(grammarAccess.getFeature_ImplAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_3_2__0__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_3_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2803:1: rule__Feature_Impl__Group_3_2__1 : rule__Feature_Impl__Group_3_2__1__Impl ;
    public final void rule__Feature_Impl__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2807:1: ( rule__Feature_Impl__Group_3_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2808:2: rule__Feature_Impl__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__1__Impl_in_rule__Feature_Impl__Group_3_2__15702);
            rule__Feature_Impl__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_3_2__1"


    // $ANTLR start "rule__Feature_Impl__Group_3_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2814:1: rule__Feature_Impl__Group_3_2__1__Impl : ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) ) ;
    public final void rule__Feature_Impl__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2818:1: ( ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2819:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2819:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2820:1: ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsAssignment_3_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2821:1: ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2821:2: rule__Feature_Impl__ConstrainsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_2_1_in_rule__Feature_Impl__Group_3_2__1__Impl5729);
            rule__Feature_Impl__ConstrainsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeature_ImplAccess().getConstrainsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__Group_3_2__1__Impl"


    // $ANTLR start "rule__Grouped__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2835:1: rule__Grouped__Group__0 : rule__Grouped__Group__0__Impl rule__Grouped__Group__1 ;
    public final void rule__Grouped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2839:1: ( rule__Grouped__Group__0__Impl rule__Grouped__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2840:2: rule__Grouped__Group__0__Impl rule__Grouped__Group__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group__0__Impl_in_rule__Grouped__Group__05763);
            rule__Grouped__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group__1_in_rule__Grouped__Group__05766);
            rule__Grouped__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group__0"


    // $ANTLR start "rule__Grouped__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2847:1: rule__Grouped__Group__0__Impl : ( ( rule__Grouped__NameAssignment_0 ) ) ;
    public final void rule__Grouped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2851:1: ( ( ( rule__Grouped__NameAssignment_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2852:1: ( ( rule__Grouped__NameAssignment_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2852:1: ( ( rule__Grouped__NameAssignment_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2853:1: ( rule__Grouped__NameAssignment_0 )
            {
             before(grammarAccess.getGroupedAccess().getNameAssignment_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2854:1: ( rule__Grouped__NameAssignment_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2854:2: rule__Grouped__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Grouped__NameAssignment_0_in_rule__Grouped__Group__0__Impl5793);
            rule__Grouped__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupedAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group__0__Impl"


    // $ANTLR start "rule__Grouped__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2864:1: rule__Grouped__Group__1 : rule__Grouped__Group__1__Impl rule__Grouped__Group__2 ;
    public final void rule__Grouped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2868:1: ( rule__Grouped__Group__1__Impl rule__Grouped__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2869:2: rule__Grouped__Group__1__Impl rule__Grouped__Group__2
            {
            pushFollow(FOLLOW_rule__Grouped__Group__1__Impl_in_rule__Grouped__Group__15823);
            rule__Grouped__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group__2_in_rule__Grouped__Group__15826);
            rule__Grouped__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group__1"


    // $ANTLR start "rule__Grouped__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2876:1: rule__Grouped__Group__1__Impl : ( ( rule__Grouped__Group_1__0 )? ) ;
    public final void rule__Grouped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2880:1: ( ( ( rule__Grouped__Group_1__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2881:1: ( ( rule__Grouped__Group_1__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2881:1: ( ( rule__Grouped__Group_1__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2882:1: ( rule__Grouped__Group_1__0 )?
            {
             before(grammarAccess.getGroupedAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2883:1: ( rule__Grouped__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftParenthesis) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2883:2: rule__Grouped__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Grouped__Group_1__0_in_rule__Grouped__Group__1__Impl5853);
                    rule__Grouped__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupedAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group__1__Impl"


    // $ANTLR start "rule__Grouped__Group__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2893:1: rule__Grouped__Group__2 : rule__Grouped__Group__2__Impl ;
    public final void rule__Grouped__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2897:1: ( rule__Grouped__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2898:2: rule__Grouped__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group__2__Impl_in_rule__Grouped__Group__25884);
            rule__Grouped__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group__2"


    // $ANTLR start "rule__Grouped__Group__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2904:1: rule__Grouped__Group__2__Impl : ( ( rule__Grouped__Group_2__0 )? ) ;
    public final void rule__Grouped__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2908:1: ( ( ( rule__Grouped__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2909:1: ( ( rule__Grouped__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2909:1: ( ( rule__Grouped__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2910:1: ( rule__Grouped__Group_2__0 )?
            {
             before(grammarAccess.getGroupedAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2911:1: ( rule__Grouped__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LeftSquareBracket) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2911:2: rule__Grouped__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Grouped__Group_2__0_in_rule__Grouped__Group__2__Impl5911);
                    rule__Grouped__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupedAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group__2__Impl"


    // $ANTLR start "rule__Grouped__Group_1__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2927:1: rule__Grouped__Group_1__0 : rule__Grouped__Group_1__0__Impl rule__Grouped__Group_1__1 ;
    public final void rule__Grouped__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2931:1: ( rule__Grouped__Group_1__0__Impl rule__Grouped__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2932:2: rule__Grouped__Group_1__0__Impl rule__Grouped__Group_1__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group_1__0__Impl_in_rule__Grouped__Group_1__05948);
            rule__Grouped__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_1__1_in_rule__Grouped__Group_1__05951);
            rule__Grouped__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_1__0"


    // $ANTLR start "rule__Grouped__Group_1__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2939:1: rule__Grouped__Group_1__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Grouped__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2943:1: ( ( LeftParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2944:1: ( LeftParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2944:1: ( LeftParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2945:1: LeftParenthesis
            {
             before(grammarAccess.getGroupedAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rule__Grouped__Group_1__0__Impl5979); 
             after(grammarAccess.getGroupedAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_1__0__Impl"


    // $ANTLR start "rule__Grouped__Group_1__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2958:1: rule__Grouped__Group_1__1 : rule__Grouped__Group_1__1__Impl rule__Grouped__Group_1__2 ;
    public final void rule__Grouped__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2962:1: ( rule__Grouped__Group_1__1__Impl rule__Grouped__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2963:2: rule__Grouped__Group_1__1__Impl rule__Grouped__Group_1__2
            {
            pushFollow(FOLLOW_rule__Grouped__Group_1__1__Impl_in_rule__Grouped__Group_1__16010);
            rule__Grouped__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_1__2_in_rule__Grouped__Group_1__16013);
            rule__Grouped__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_1__1"


    // $ANTLR start "rule__Grouped__Group_1__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2970:1: rule__Grouped__Group_1__1__Impl : ( ( rule__Grouped__AttributeAssignment_1_1 ) ) ;
    public final void rule__Grouped__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2974:1: ( ( ( rule__Grouped__AttributeAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2975:1: ( ( rule__Grouped__AttributeAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2975:1: ( ( rule__Grouped__AttributeAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2976:1: ( rule__Grouped__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getGroupedAccess().getAttributeAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2977:1: ( rule__Grouped__AttributeAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2977:2: rule__Grouped__AttributeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Grouped__AttributeAssignment_1_1_in_rule__Grouped__Group_1__1__Impl6040);
            rule__Grouped__AttributeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedAccess().getAttributeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_1__1__Impl"


    // $ANTLR start "rule__Grouped__Group_1__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2987:1: rule__Grouped__Group_1__2 : rule__Grouped__Group_1__2__Impl ;
    public final void rule__Grouped__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2991:1: ( rule__Grouped__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2992:2: rule__Grouped__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group_1__2__Impl_in_rule__Grouped__Group_1__26070);
            rule__Grouped__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_1__2"


    // $ANTLR start "rule__Grouped__Group_1__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2998:1: rule__Grouped__Group_1__2__Impl : ( RightParenthesis ) ;
    public final void rule__Grouped__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3002:1: ( ( RightParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3003:1: ( RightParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3003:1: ( RightParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3004:1: RightParenthesis
            {
             before(grammarAccess.getGroupedAccess().getRightParenthesisKeyword_1_2()); 
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rule__Grouped__Group_1__2__Impl6098); 
             after(grammarAccess.getGroupedAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_1__2__Impl"


    // $ANTLR start "rule__Grouped__Group_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3023:1: rule__Grouped__Group_2__0 : rule__Grouped__Group_2__0__Impl rule__Grouped__Group_2__1 ;
    public final void rule__Grouped__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3027:1: ( rule__Grouped__Group_2__0__Impl rule__Grouped__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3028:2: rule__Grouped__Group_2__0__Impl rule__Grouped__Group_2__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2__0__Impl_in_rule__Grouped__Group_2__06135);
            rule__Grouped__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_2__1_in_rule__Grouped__Group_2__06138);
            rule__Grouped__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_2__0"


    // $ANTLR start "rule__Grouped__Group_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3035:1: rule__Grouped__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Grouped__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3039:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3040:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3040:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3041:1: LeftSquareBracket
            {
             before(grammarAccess.getGroupedAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Grouped__Group_2__0__Impl6166); 
             after(grammarAccess.getGroupedAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_2__0__Impl"


    // $ANTLR start "rule__Grouped__Group_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3054:1: rule__Grouped__Group_2__1 : rule__Grouped__Group_2__1__Impl rule__Grouped__Group_2__2 ;
    public final void rule__Grouped__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3058:1: ( rule__Grouped__Group_2__1__Impl rule__Grouped__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3059:2: rule__Grouped__Group_2__1__Impl rule__Grouped__Group_2__2
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2__1__Impl_in_rule__Grouped__Group_2__16197);
            rule__Grouped__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_2__2_in_rule__Grouped__Group_2__16200);
            rule__Grouped__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_2__1"


    // $ANTLR start "rule__Grouped__Group_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3066:1: rule__Grouped__Group_2__1__Impl : ( ( rule__Grouped__ConstrainsAssignment_2_1 ) ) ;
    public final void rule__Grouped__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3070:1: ( ( ( rule__Grouped__ConstrainsAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3071:1: ( ( rule__Grouped__ConstrainsAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3071:1: ( ( rule__Grouped__ConstrainsAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3072:1: ( rule__Grouped__ConstrainsAssignment_2_1 )
            {
             before(grammarAccess.getGroupedAccess().getConstrainsAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3073:1: ( rule__Grouped__ConstrainsAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3073:2: rule__Grouped__ConstrainsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Grouped__ConstrainsAssignment_2_1_in_rule__Grouped__Group_2__1__Impl6227);
            rule__Grouped__ConstrainsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedAccess().getConstrainsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_2__1__Impl"


    // $ANTLR start "rule__Grouped__Group_2__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3083:1: rule__Grouped__Group_2__2 : rule__Grouped__Group_2__2__Impl rule__Grouped__Group_2__3 ;
    public final void rule__Grouped__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3087:1: ( rule__Grouped__Group_2__2__Impl rule__Grouped__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3088:2: rule__Grouped__Group_2__2__Impl rule__Grouped__Group_2__3
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2__2__Impl_in_rule__Grouped__Group_2__26257);
            rule__Grouped__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_2__3_in_rule__Grouped__Group_2__26260);
            rule__Grouped__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_2__2"


    // $ANTLR start "rule__Grouped__Group_2__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3095:1: rule__Grouped__Group_2__2__Impl : ( ( rule__Grouped__Group_2_2__0 )* ) ;
    public final void rule__Grouped__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3099:1: ( ( ( rule__Grouped__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3100:1: ( ( rule__Grouped__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3100:1: ( ( rule__Grouped__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3101:1: ( rule__Grouped__Group_2_2__0 )*
            {
             before(grammarAccess.getGroupedAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3102:1: ( rule__Grouped__Group_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3102:2: rule__Grouped__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Grouped__Group_2_2__0_in_rule__Grouped__Group_2__2__Impl6287);
            	    rule__Grouped__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getGroupedAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_2__2__Impl"


    // $ANTLR start "rule__Grouped__Group_2__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3112:1: rule__Grouped__Group_2__3 : rule__Grouped__Group_2__3__Impl ;
    public final void rule__Grouped__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3116:1: ( rule__Grouped__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3117:2: rule__Grouped__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2__3__Impl_in_rule__Grouped__Group_2__36318);
            rule__Grouped__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_2__3"


    // $ANTLR start "rule__Grouped__Group_2__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3123:1: rule__Grouped__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Grouped__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3127:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3128:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3128:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3129:1: RightSquareBracket
            {
             before(grammarAccess.getGroupedAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Grouped__Group_2__3__Impl6346); 
             after(grammarAccess.getGroupedAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_2__3__Impl"


    // $ANTLR start "rule__Grouped__Group_2_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3150:1: rule__Grouped__Group_2_2__0 : rule__Grouped__Group_2_2__0__Impl rule__Grouped__Group_2_2__1 ;
    public final void rule__Grouped__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3154:1: ( rule__Grouped__Group_2_2__0__Impl rule__Grouped__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3155:2: rule__Grouped__Group_2_2__0__Impl rule__Grouped__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2_2__0__Impl_in_rule__Grouped__Group_2_2__06385);
            rule__Grouped__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_2_2__1_in_rule__Grouped__Group_2_2__06388);
            rule__Grouped__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_2_2__0"


    // $ANTLR start "rule__Grouped__Group_2_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3162:1: rule__Grouped__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Grouped__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3166:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3167:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3167:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3168:1: Comma
            {
             before(grammarAccess.getGroupedAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Grouped__Group_2_2__0__Impl6416); 
             after(grammarAccess.getGroupedAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_2_2__0__Impl"


    // $ANTLR start "rule__Grouped__Group_2_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3181:1: rule__Grouped__Group_2_2__1 : rule__Grouped__Group_2_2__1__Impl ;
    public final void rule__Grouped__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3185:1: ( rule__Grouped__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3186:2: rule__Grouped__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2_2__1__Impl_in_rule__Grouped__Group_2_2__16447);
            rule__Grouped__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_2_2__1"


    // $ANTLR start "rule__Grouped__Group_2_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3192:1: rule__Grouped__Group_2_2__1__Impl : ( ( rule__Grouped__ConstrainsAssignment_2_2_1 ) ) ;
    public final void rule__Grouped__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3196:1: ( ( ( rule__Grouped__ConstrainsAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3197:1: ( ( rule__Grouped__ConstrainsAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3197:1: ( ( rule__Grouped__ConstrainsAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3198:1: ( rule__Grouped__ConstrainsAssignment_2_2_1 )
            {
             before(grammarAccess.getGroupedAccess().getConstrainsAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3199:1: ( rule__Grouped__ConstrainsAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3199:2: rule__Grouped__ConstrainsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Grouped__ConstrainsAssignment_2_2_1_in_rule__Grouped__Group_2_2__1__Impl6474);
            rule__Grouped__ConstrainsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedAccess().getConstrainsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_2_2__1__Impl"


    // $ANTLR start "rule__Mandatory__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3213:1: rule__Mandatory__Group__0 : rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 ;
    public final void rule__Mandatory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3217:1: ( rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3218:2: rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__06508);
            rule__Mandatory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__06511);
            rule__Mandatory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__0"


    // $ANTLR start "rule__Mandatory__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3225:1: rule__Mandatory__Group__0__Impl : ( ( rule__Mandatory__NameAssignment_0 ) ) ;
    public final void rule__Mandatory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3229:1: ( ( ( rule__Mandatory__NameAssignment_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3230:1: ( ( rule__Mandatory__NameAssignment_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3230:1: ( ( rule__Mandatory__NameAssignment_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3231:1: ( rule__Mandatory__NameAssignment_0 )
            {
             before(grammarAccess.getMandatoryAccess().getNameAssignment_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3232:1: ( rule__Mandatory__NameAssignment_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3232:2: rule__Mandatory__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Mandatory__NameAssignment_0_in_rule__Mandatory__Group__0__Impl6538);
            rule__Mandatory__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__0__Impl"


    // $ANTLR start "rule__Mandatory__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3242:1: rule__Mandatory__Group__1 : rule__Mandatory__Group__1__Impl rule__Mandatory__Group__2 ;
    public final void rule__Mandatory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3246:1: ( rule__Mandatory__Group__1__Impl rule__Mandatory__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3247:2: rule__Mandatory__Group__1__Impl rule__Mandatory__Group__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__16568);
            rule__Mandatory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__2_in_rule__Mandatory__Group__16571);
            rule__Mandatory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__1"


    // $ANTLR start "rule__Mandatory__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3254:1: rule__Mandatory__Group__1__Impl : ( ( rule__Mandatory__Group_1__0 )? ) ;
    public final void rule__Mandatory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3258:1: ( ( ( rule__Mandatory__Group_1__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3259:1: ( ( rule__Mandatory__Group_1__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3259:1: ( ( rule__Mandatory__Group_1__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3260:1: ( rule__Mandatory__Group_1__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3261:1: ( rule__Mandatory__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LeftCurlyBracket) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3261:2: rule__Mandatory__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_1__0_in_rule__Mandatory__Group__1__Impl6598);
                    rule__Mandatory__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMandatoryAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__1__Impl"


    // $ANTLR start "rule__Mandatory__Group__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3271:1: rule__Mandatory__Group__2 : rule__Mandatory__Group__2__Impl rule__Mandatory__Group__3 ;
    public final void rule__Mandatory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3275:1: ( rule__Mandatory__Group__2__Impl rule__Mandatory__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3276:2: rule__Mandatory__Group__2__Impl rule__Mandatory__Group__3
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__2__Impl_in_rule__Mandatory__Group__26629);
            rule__Mandatory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__3_in_rule__Mandatory__Group__26632);
            rule__Mandatory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__2"


    // $ANTLR start "rule__Mandatory__Group__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3283:1: rule__Mandatory__Group__2__Impl : ( ( rule__Mandatory__Group_2__0 )? ) ;
    public final void rule__Mandatory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3287:1: ( ( ( rule__Mandatory__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3288:1: ( ( rule__Mandatory__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3288:1: ( ( rule__Mandatory__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3289:1: ( rule__Mandatory__Group_2__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3290:1: ( rule__Mandatory__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LeftParenthesis) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3290:2: rule__Mandatory__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_2__0_in_rule__Mandatory__Group__2__Impl6659);
                    rule__Mandatory__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMandatoryAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__2__Impl"


    // $ANTLR start "rule__Mandatory__Group__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3300:1: rule__Mandatory__Group__3 : rule__Mandatory__Group__3__Impl rule__Mandatory__Group__4 ;
    public final void rule__Mandatory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3304:1: ( rule__Mandatory__Group__3__Impl rule__Mandatory__Group__4 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3305:2: rule__Mandatory__Group__3__Impl rule__Mandatory__Group__4
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__3__Impl_in_rule__Mandatory__Group__36690);
            rule__Mandatory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__4_in_rule__Mandatory__Group__36693);
            rule__Mandatory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__3"


    // $ANTLR start "rule__Mandatory__Group__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3312:1: rule__Mandatory__Group__3__Impl : ( ( rule__Mandatory__Group_3__0 )? ) ;
    public final void rule__Mandatory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3316:1: ( ( ( rule__Mandatory__Group_3__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3317:1: ( ( rule__Mandatory__Group_3__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3317:1: ( ( rule__Mandatory__Group_3__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3318:1: ( rule__Mandatory__Group_3__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3319:1: ( rule__Mandatory__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftSquareBracket) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3319:2: rule__Mandatory__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_3__0_in_rule__Mandatory__Group__3__Impl6720);
                    rule__Mandatory__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMandatoryAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__3__Impl"


    // $ANTLR start "rule__Mandatory__Group__4"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3329:1: rule__Mandatory__Group__4 : rule__Mandatory__Group__4__Impl ;
    public final void rule__Mandatory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3333:1: ( rule__Mandatory__Group__4__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3334:2: rule__Mandatory__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__4__Impl_in_rule__Mandatory__Group__46751);
            rule__Mandatory__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__4"


    // $ANTLR start "rule__Mandatory__Group__4__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3340:1: rule__Mandatory__Group__4__Impl : ( ( rule__Mandatory__Group_4__0 )? ) ;
    public final void rule__Mandatory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3344:1: ( ( ( rule__Mandatory__Group_4__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3345:1: ( ( rule__Mandatory__Group_4__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3345:1: ( ( rule__Mandatory__Group_4__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3346:1: ( rule__Mandatory__Group_4__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_4()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3347:1: ( rule__Mandatory__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Xor||LA25_0==Or) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3347:2: rule__Mandatory__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_4__0_in_rule__Mandatory__Group__4__Impl6778);
                    rule__Mandatory__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMandatoryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__4__Impl"


    // $ANTLR start "rule__Mandatory__Group_1__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3367:1: rule__Mandatory__Group_1__0 : rule__Mandatory__Group_1__0__Impl rule__Mandatory__Group_1__1 ;
    public final void rule__Mandatory__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3371:1: ( rule__Mandatory__Group_1__0__Impl rule__Mandatory__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3372:2: rule__Mandatory__Group_1__0__Impl rule__Mandatory__Group_1__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__0__Impl_in_rule__Mandatory__Group_1__06819);
            rule__Mandatory__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1__1_in_rule__Mandatory__Group_1__06822);
            rule__Mandatory__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_1__0"


    // $ANTLR start "rule__Mandatory__Group_1__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3379:1: rule__Mandatory__Group_1__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Mandatory__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3383:1: ( ( LeftCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3384:1: ( LeftCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3384:1: ( LeftCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3385:1: LeftCurlyBracket
            {
             before(grammarAccess.getMandatoryAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__Mandatory__Group_1__0__Impl6850); 
             after(grammarAccess.getMandatoryAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_1__0__Impl"


    // $ANTLR start "rule__Mandatory__Group_1__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3398:1: rule__Mandatory__Group_1__1 : rule__Mandatory__Group_1__1__Impl rule__Mandatory__Group_1__2 ;
    public final void rule__Mandatory__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3402:1: ( rule__Mandatory__Group_1__1__Impl rule__Mandatory__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3403:2: rule__Mandatory__Group_1__1__Impl rule__Mandatory__Group_1__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__1__Impl_in_rule__Mandatory__Group_1__16881);
            rule__Mandatory__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1__2_in_rule__Mandatory__Group_1__16884);
            rule__Mandatory__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_1__1"


    // $ANTLR start "rule__Mandatory__Group_1__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3410:1: rule__Mandatory__Group_1__1__Impl : ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) ) ;
    public final void rule__Mandatory__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3414:1: ( ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3415:1: ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3415:1: ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3416:1: ( rule__Mandatory__SubfeatureAssignment_1_1 )
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3417:1: ( rule__Mandatory__SubfeatureAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3417:2: rule__Mandatory__SubfeatureAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Mandatory__SubfeatureAssignment_1_1_in_rule__Mandatory__Group_1__1__Impl6911);
            rule__Mandatory__SubfeatureAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getSubfeatureAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_1__1__Impl"


    // $ANTLR start "rule__Mandatory__Group_1__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3427:1: rule__Mandatory__Group_1__2 : rule__Mandatory__Group_1__2__Impl rule__Mandatory__Group_1__3 ;
    public final void rule__Mandatory__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3431:1: ( rule__Mandatory__Group_1__2__Impl rule__Mandatory__Group_1__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3432:2: rule__Mandatory__Group_1__2__Impl rule__Mandatory__Group_1__3
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__2__Impl_in_rule__Mandatory__Group_1__26941);
            rule__Mandatory__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1__3_in_rule__Mandatory__Group_1__26944);
            rule__Mandatory__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_1__2"


    // $ANTLR start "rule__Mandatory__Group_1__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3439:1: rule__Mandatory__Group_1__2__Impl : ( ( rule__Mandatory__Group_1_2__0 )* ) ;
    public final void rule__Mandatory__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3443:1: ( ( ( rule__Mandatory__Group_1_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3444:1: ( ( rule__Mandatory__Group_1_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3444:1: ( ( rule__Mandatory__Group_1_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3445:1: ( rule__Mandatory__Group_1_2__0 )*
            {
             before(grammarAccess.getMandatoryAccess().getGroup_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3446:1: ( rule__Mandatory__Group_1_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3446:2: rule__Mandatory__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__Group_1_2__0_in_rule__Mandatory__Group_1__2__Impl6971);
            	    rule__Mandatory__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMandatoryAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_1__2__Impl"


    // $ANTLR start "rule__Mandatory__Group_1__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3456:1: rule__Mandatory__Group_1__3 : rule__Mandatory__Group_1__3__Impl ;
    public final void rule__Mandatory__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3460:1: ( rule__Mandatory__Group_1__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3461:2: rule__Mandatory__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__3__Impl_in_rule__Mandatory__Group_1__37002);
            rule__Mandatory__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_1__3"


    // $ANTLR start "rule__Mandatory__Group_1__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3467:1: rule__Mandatory__Group_1__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Mandatory__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3471:1: ( ( RightCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3472:1: ( RightCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3472:1: ( RightCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3473:1: RightCurlyBracket
            {
             before(grammarAccess.getMandatoryAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__Mandatory__Group_1__3__Impl7030); 
             after(grammarAccess.getMandatoryAccess().getRightCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_1__3__Impl"


    // $ANTLR start "rule__Mandatory__Group_1_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3494:1: rule__Mandatory__Group_1_2__0 : rule__Mandatory__Group_1_2__0__Impl rule__Mandatory__Group_1_2__1 ;
    public final void rule__Mandatory__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3498:1: ( rule__Mandatory__Group_1_2__0__Impl rule__Mandatory__Group_1_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3499:2: rule__Mandatory__Group_1_2__0__Impl rule__Mandatory__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1_2__0__Impl_in_rule__Mandatory__Group_1_2__07069);
            rule__Mandatory__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1_2__1_in_rule__Mandatory__Group_1_2__07072);
            rule__Mandatory__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_1_2__0"


    // $ANTLR start "rule__Mandatory__Group_1_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3506:1: rule__Mandatory__Group_1_2__0__Impl : ( Comma ) ;
    public final void rule__Mandatory__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3510:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3511:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3511:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3512:1: Comma
            {
             before(grammarAccess.getMandatoryAccess().getCommaKeyword_1_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Mandatory__Group_1_2__0__Impl7100); 
             after(grammarAccess.getMandatoryAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_1_2__0__Impl"


    // $ANTLR start "rule__Mandatory__Group_1_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3525:1: rule__Mandatory__Group_1_2__1 : rule__Mandatory__Group_1_2__1__Impl ;
    public final void rule__Mandatory__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3529:1: ( rule__Mandatory__Group_1_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3530:2: rule__Mandatory__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1_2__1__Impl_in_rule__Mandatory__Group_1_2__17131);
            rule__Mandatory__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_1_2__1"


    // $ANTLR start "rule__Mandatory__Group_1_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3536:1: rule__Mandatory__Group_1_2__1__Impl : ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) ) ;
    public final void rule__Mandatory__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3540:1: ( ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3541:1: ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3541:1: ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3542:1: ( rule__Mandatory__SubfeatureAssignment_1_2_1 )
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureAssignment_1_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3543:1: ( rule__Mandatory__SubfeatureAssignment_1_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3543:2: rule__Mandatory__SubfeatureAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Mandatory__SubfeatureAssignment_1_2_1_in_rule__Mandatory__Group_1_2__1__Impl7158);
            rule__Mandatory__SubfeatureAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getSubfeatureAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_1_2__1__Impl"


    // $ANTLR start "rule__Mandatory__Group_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3557:1: rule__Mandatory__Group_2__0 : rule__Mandatory__Group_2__0__Impl rule__Mandatory__Group_2__1 ;
    public final void rule__Mandatory__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3561:1: ( rule__Mandatory__Group_2__0__Impl rule__Mandatory__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3562:2: rule__Mandatory__Group_2__0__Impl rule__Mandatory__Group_2__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__0__Impl_in_rule__Mandatory__Group_2__07192);
            rule__Mandatory__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2__1_in_rule__Mandatory__Group_2__07195);
            rule__Mandatory__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_2__0"


    // $ANTLR start "rule__Mandatory__Group_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3569:1: rule__Mandatory__Group_2__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Mandatory__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3573:1: ( ( LeftParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3574:1: ( LeftParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3574:1: ( LeftParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3575:1: LeftParenthesis
            {
             before(grammarAccess.getMandatoryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rule__Mandatory__Group_2__0__Impl7223); 
             after(grammarAccess.getMandatoryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_2__0__Impl"


    // $ANTLR start "rule__Mandatory__Group_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3588:1: rule__Mandatory__Group_2__1 : rule__Mandatory__Group_2__1__Impl rule__Mandatory__Group_2__2 ;
    public final void rule__Mandatory__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3592:1: ( rule__Mandatory__Group_2__1__Impl rule__Mandatory__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3593:2: rule__Mandatory__Group_2__1__Impl rule__Mandatory__Group_2__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__1__Impl_in_rule__Mandatory__Group_2__17254);
            rule__Mandatory__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2__2_in_rule__Mandatory__Group_2__17257);
            rule__Mandatory__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_2__1"


    // $ANTLR start "rule__Mandatory__Group_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3600:1: rule__Mandatory__Group_2__1__Impl : ( ( rule__Mandatory__AttributeAssignment_2_1 ) ) ;
    public final void rule__Mandatory__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3604:1: ( ( ( rule__Mandatory__AttributeAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3605:1: ( ( rule__Mandatory__AttributeAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3605:1: ( ( rule__Mandatory__AttributeAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3606:1: ( rule__Mandatory__AttributeAssignment_2_1 )
            {
             before(grammarAccess.getMandatoryAccess().getAttributeAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3607:1: ( rule__Mandatory__AttributeAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3607:2: rule__Mandatory__AttributeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Mandatory__AttributeAssignment_2_1_in_rule__Mandatory__Group_2__1__Impl7284);
            rule__Mandatory__AttributeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getAttributeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_2__1__Impl"


    // $ANTLR start "rule__Mandatory__Group_2__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3617:1: rule__Mandatory__Group_2__2 : rule__Mandatory__Group_2__2__Impl ;
    public final void rule__Mandatory__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3621:1: ( rule__Mandatory__Group_2__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3622:2: rule__Mandatory__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__2__Impl_in_rule__Mandatory__Group_2__27314);
            rule__Mandatory__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_2__2"


    // $ANTLR start "rule__Mandatory__Group_2__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3628:1: rule__Mandatory__Group_2__2__Impl : ( RightParenthesis ) ;
    public final void rule__Mandatory__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3632:1: ( ( RightParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3633:1: ( RightParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3633:1: ( RightParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3634:1: RightParenthesis
            {
             before(grammarAccess.getMandatoryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rule__Mandatory__Group_2__2__Impl7342); 
             after(grammarAccess.getMandatoryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_2__2__Impl"


    // $ANTLR start "rule__Mandatory__Group_3__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3653:1: rule__Mandatory__Group_3__0 : rule__Mandatory__Group_3__0__Impl rule__Mandatory__Group_3__1 ;
    public final void rule__Mandatory__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3657:1: ( rule__Mandatory__Group_3__0__Impl rule__Mandatory__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3658:2: rule__Mandatory__Group_3__0__Impl rule__Mandatory__Group_3__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_3__0__Impl_in_rule__Mandatory__Group_3__07379);
            rule__Mandatory__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_3__1_in_rule__Mandatory__Group_3__07382);
            rule__Mandatory__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_3__0"


    // $ANTLR start "rule__Mandatory__Group_3__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3665:1: rule__Mandatory__Group_3__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Mandatory__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3669:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3670:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3670:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3671:1: LeftSquareBracket
            {
             before(grammarAccess.getMandatoryAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Mandatory__Group_3__0__Impl7410); 
             after(grammarAccess.getMandatoryAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_3__0__Impl"


    // $ANTLR start "rule__Mandatory__Group_3__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3684:1: rule__Mandatory__Group_3__1 : rule__Mandatory__Group_3__1__Impl rule__Mandatory__Group_3__2 ;
    public final void rule__Mandatory__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3688:1: ( rule__Mandatory__Group_3__1__Impl rule__Mandatory__Group_3__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3689:2: rule__Mandatory__Group_3__1__Impl rule__Mandatory__Group_3__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_3__1__Impl_in_rule__Mandatory__Group_3__17441);
            rule__Mandatory__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_3__2_in_rule__Mandatory__Group_3__17444);
            rule__Mandatory__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_3__1"


    // $ANTLR start "rule__Mandatory__Group_3__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3696:1: rule__Mandatory__Group_3__1__Impl : ( ( rule__Mandatory__ConstrainsAssignment_3_1 ) ) ;
    public final void rule__Mandatory__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3700:1: ( ( ( rule__Mandatory__ConstrainsAssignment_3_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3701:1: ( ( rule__Mandatory__ConstrainsAssignment_3_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3701:1: ( ( rule__Mandatory__ConstrainsAssignment_3_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3702:1: ( rule__Mandatory__ConstrainsAssignment_3_1 )
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsAssignment_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3703:1: ( rule__Mandatory__ConstrainsAssignment_3_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3703:2: rule__Mandatory__ConstrainsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Mandatory__ConstrainsAssignment_3_1_in_rule__Mandatory__Group_3__1__Impl7471);
            rule__Mandatory__ConstrainsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getConstrainsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_3__1__Impl"


    // $ANTLR start "rule__Mandatory__Group_3__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3713:1: rule__Mandatory__Group_3__2 : rule__Mandatory__Group_3__2__Impl rule__Mandatory__Group_3__3 ;
    public final void rule__Mandatory__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3717:1: ( rule__Mandatory__Group_3__2__Impl rule__Mandatory__Group_3__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3718:2: rule__Mandatory__Group_3__2__Impl rule__Mandatory__Group_3__3
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_3__2__Impl_in_rule__Mandatory__Group_3__27501);
            rule__Mandatory__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_3__3_in_rule__Mandatory__Group_3__27504);
            rule__Mandatory__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_3__2"


    // $ANTLR start "rule__Mandatory__Group_3__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3725:1: rule__Mandatory__Group_3__2__Impl : ( ( rule__Mandatory__Group_3_2__0 )* ) ;
    public final void rule__Mandatory__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3729:1: ( ( ( rule__Mandatory__Group_3_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3730:1: ( ( rule__Mandatory__Group_3_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3730:1: ( ( rule__Mandatory__Group_3_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3731:1: ( rule__Mandatory__Group_3_2__0 )*
            {
             before(grammarAccess.getMandatoryAccess().getGroup_3_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3732:1: ( rule__Mandatory__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3732:2: rule__Mandatory__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__Group_3_2__0_in_rule__Mandatory__Group_3__2__Impl7531);
            	    rule__Mandatory__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMandatoryAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_3__2__Impl"


    // $ANTLR start "rule__Mandatory__Group_3__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3742:1: rule__Mandatory__Group_3__3 : rule__Mandatory__Group_3__3__Impl ;
    public final void rule__Mandatory__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3746:1: ( rule__Mandatory__Group_3__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3747:2: rule__Mandatory__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_3__3__Impl_in_rule__Mandatory__Group_3__37562);
            rule__Mandatory__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_3__3"


    // $ANTLR start "rule__Mandatory__Group_3__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3753:1: rule__Mandatory__Group_3__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Mandatory__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3757:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3758:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3758:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3759:1: RightSquareBracket
            {
             before(grammarAccess.getMandatoryAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Mandatory__Group_3__3__Impl7590); 
             after(grammarAccess.getMandatoryAccess().getRightSquareBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_3__3__Impl"


    // $ANTLR start "rule__Mandatory__Group_3_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3780:1: rule__Mandatory__Group_3_2__0 : rule__Mandatory__Group_3_2__0__Impl rule__Mandatory__Group_3_2__1 ;
    public final void rule__Mandatory__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3784:1: ( rule__Mandatory__Group_3_2__0__Impl rule__Mandatory__Group_3_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3785:2: rule__Mandatory__Group_3_2__0__Impl rule__Mandatory__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_3_2__0__Impl_in_rule__Mandatory__Group_3_2__07629);
            rule__Mandatory__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_3_2__1_in_rule__Mandatory__Group_3_2__07632);
            rule__Mandatory__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_3_2__0"


    // $ANTLR start "rule__Mandatory__Group_3_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3792:1: rule__Mandatory__Group_3_2__0__Impl : ( Comma ) ;
    public final void rule__Mandatory__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3796:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3797:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3797:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3798:1: Comma
            {
             before(grammarAccess.getMandatoryAccess().getCommaKeyword_3_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Mandatory__Group_3_2__0__Impl7660); 
             after(grammarAccess.getMandatoryAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_3_2__0__Impl"


    // $ANTLR start "rule__Mandatory__Group_3_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3811:1: rule__Mandatory__Group_3_2__1 : rule__Mandatory__Group_3_2__1__Impl ;
    public final void rule__Mandatory__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3815:1: ( rule__Mandatory__Group_3_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3816:2: rule__Mandatory__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_3_2__1__Impl_in_rule__Mandatory__Group_3_2__17691);
            rule__Mandatory__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_3_2__1"


    // $ANTLR start "rule__Mandatory__Group_3_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3822:1: rule__Mandatory__Group_3_2__1__Impl : ( ( rule__Mandatory__ConstrainsAssignment_3_2_1 ) ) ;
    public final void rule__Mandatory__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3826:1: ( ( ( rule__Mandatory__ConstrainsAssignment_3_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3827:1: ( ( rule__Mandatory__ConstrainsAssignment_3_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3827:1: ( ( rule__Mandatory__ConstrainsAssignment_3_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3828:1: ( rule__Mandatory__ConstrainsAssignment_3_2_1 )
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsAssignment_3_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3829:1: ( rule__Mandatory__ConstrainsAssignment_3_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3829:2: rule__Mandatory__ConstrainsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Mandatory__ConstrainsAssignment_3_2_1_in_rule__Mandatory__Group_3_2__1__Impl7718);
            rule__Mandatory__ConstrainsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getConstrainsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_3_2__1__Impl"


    // $ANTLR start "rule__Mandatory__Group_4__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3843:1: rule__Mandatory__Group_4__0 : rule__Mandatory__Group_4__0__Impl rule__Mandatory__Group_4__1 ;
    public final void rule__Mandatory__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3847:1: ( rule__Mandatory__Group_4__0__Impl rule__Mandatory__Group_4__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3848:2: rule__Mandatory__Group_4__0__Impl rule__Mandatory__Group_4__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_4__0__Impl_in_rule__Mandatory__Group_4__07752);
            rule__Mandatory__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_4__1_in_rule__Mandatory__Group_4__07755);
            rule__Mandatory__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_4__0"


    // $ANTLR start "rule__Mandatory__Group_4__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3855:1: rule__Mandatory__Group_4__0__Impl : ( ( rule__Mandatory__GroupsAssignment_4_0 ) ) ;
    public final void rule__Mandatory__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3859:1: ( ( ( rule__Mandatory__GroupsAssignment_4_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3860:1: ( ( rule__Mandatory__GroupsAssignment_4_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3860:1: ( ( rule__Mandatory__GroupsAssignment_4_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3861:1: ( rule__Mandatory__GroupsAssignment_4_0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroupsAssignment_4_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3862:1: ( rule__Mandatory__GroupsAssignment_4_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3862:2: rule__Mandatory__GroupsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Mandatory__GroupsAssignment_4_0_in_rule__Mandatory__Group_4__0__Impl7782);
            rule__Mandatory__GroupsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getGroupsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_4__0__Impl"


    // $ANTLR start "rule__Mandatory__Group_4__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3872:1: rule__Mandatory__Group_4__1 : rule__Mandatory__Group_4__1__Impl ;
    public final void rule__Mandatory__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3876:1: ( rule__Mandatory__Group_4__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3877:2: rule__Mandatory__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_4__1__Impl_in_rule__Mandatory__Group_4__17812);
            rule__Mandatory__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_4__1"


    // $ANTLR start "rule__Mandatory__Group_4__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3883:1: rule__Mandatory__Group_4__1__Impl : ( ( rule__Mandatory__GroupsAssignment_4_1 )* ) ;
    public final void rule__Mandatory__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3887:1: ( ( ( rule__Mandatory__GroupsAssignment_4_1 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3888:1: ( ( rule__Mandatory__GroupsAssignment_4_1 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3888:1: ( ( rule__Mandatory__GroupsAssignment_4_1 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3889:1: ( rule__Mandatory__GroupsAssignment_4_1 )*
            {
             before(grammarAccess.getMandatoryAccess().getGroupsAssignment_4_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3890:1: ( rule__Mandatory__GroupsAssignment_4_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Xor||LA28_0==Or) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3890:2: rule__Mandatory__GroupsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__GroupsAssignment_4_1_in_rule__Mandatory__Group_4__1__Impl7839);
            	    rule__Mandatory__GroupsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMandatoryAccess().getGroupsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group_4__1__Impl"


    // $ANTLR start "rule__Optional__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3904:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3908:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3909:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__07874);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__07877);
            rule__Optional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__0"


    // $ANTLR start "rule__Optional__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3916:1: rule__Optional__Group__0__Impl : ( QuestionMark ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3920:1: ( ( QuestionMark ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3921:1: ( QuestionMark )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3921:1: ( QuestionMark )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3922:1: QuestionMark
            {
             before(grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0()); 
            match(input,QuestionMark,FOLLOW_QuestionMark_in_rule__Optional__Group__0__Impl7905); 
             after(grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__0__Impl"


    // $ANTLR start "rule__Optional__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3935:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl rule__Optional__Group__2 ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3939:1: ( rule__Optional__Group__1__Impl rule__Optional__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3940:2: rule__Optional__Group__1__Impl rule__Optional__Group__2
            {
            pushFollow(FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__17936);
            rule__Optional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__2_in_rule__Optional__Group__17939);
            rule__Optional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__1"


    // $ANTLR start "rule__Optional__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3947:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__NameAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3951:1: ( ( ( rule__Optional__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3952:1: ( ( rule__Optional__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3952:1: ( ( rule__Optional__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3953:1: ( rule__Optional__NameAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3954:1: ( rule__Optional__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3954:2: rule__Optional__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Optional__NameAssignment_1_in_rule__Optional__Group__1__Impl7966);
            rule__Optional__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__1__Impl"


    // $ANTLR start "rule__Optional__Group__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3964:1: rule__Optional__Group__2 : rule__Optional__Group__2__Impl rule__Optional__Group__3 ;
    public final void rule__Optional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3968:1: ( rule__Optional__Group__2__Impl rule__Optional__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3969:2: rule__Optional__Group__2__Impl rule__Optional__Group__3
            {
            pushFollow(FOLLOW_rule__Optional__Group__2__Impl_in_rule__Optional__Group__27996);
            rule__Optional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__3_in_rule__Optional__Group__27999);
            rule__Optional__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__2"


    // $ANTLR start "rule__Optional__Group__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3976:1: rule__Optional__Group__2__Impl : ( ( rule__Optional__Group_2__0 )? ) ;
    public final void rule__Optional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3980:1: ( ( ( rule__Optional__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3981:1: ( ( rule__Optional__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3981:1: ( ( rule__Optional__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3982:1: ( rule__Optional__Group_2__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3983:1: ( rule__Optional__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LeftCurlyBracket) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3983:2: rule__Optional__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_2__0_in_rule__Optional__Group__2__Impl8026);
                    rule__Optional__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionalAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__2__Impl"


    // $ANTLR start "rule__Optional__Group__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3993:1: rule__Optional__Group__3 : rule__Optional__Group__3__Impl rule__Optional__Group__4 ;
    public final void rule__Optional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3997:1: ( rule__Optional__Group__3__Impl rule__Optional__Group__4 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3998:2: rule__Optional__Group__3__Impl rule__Optional__Group__4
            {
            pushFollow(FOLLOW_rule__Optional__Group__3__Impl_in_rule__Optional__Group__38057);
            rule__Optional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__4_in_rule__Optional__Group__38060);
            rule__Optional__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__3"


    // $ANTLR start "rule__Optional__Group__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4005:1: rule__Optional__Group__3__Impl : ( ( rule__Optional__Group_3__0 )? ) ;
    public final void rule__Optional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4009:1: ( ( ( rule__Optional__Group_3__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4010:1: ( ( rule__Optional__Group_3__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4010:1: ( ( rule__Optional__Group_3__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4011:1: ( rule__Optional__Group_3__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4012:1: ( rule__Optional__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LeftParenthesis) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4012:2: rule__Optional__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_3__0_in_rule__Optional__Group__3__Impl8087);
                    rule__Optional__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionalAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__3__Impl"


    // $ANTLR start "rule__Optional__Group__4"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4022:1: rule__Optional__Group__4 : rule__Optional__Group__4__Impl rule__Optional__Group__5 ;
    public final void rule__Optional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4026:1: ( rule__Optional__Group__4__Impl rule__Optional__Group__5 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4027:2: rule__Optional__Group__4__Impl rule__Optional__Group__5
            {
            pushFollow(FOLLOW_rule__Optional__Group__4__Impl_in_rule__Optional__Group__48118);
            rule__Optional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__5_in_rule__Optional__Group__48121);
            rule__Optional__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__4"


    // $ANTLR start "rule__Optional__Group__4__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4034:1: rule__Optional__Group__4__Impl : ( ( rule__Optional__Group_4__0 )? ) ;
    public final void rule__Optional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4038:1: ( ( ( rule__Optional__Group_4__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4039:1: ( ( rule__Optional__Group_4__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4039:1: ( ( rule__Optional__Group_4__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4040:1: ( rule__Optional__Group_4__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_4()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4041:1: ( rule__Optional__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LeftSquareBracket) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4041:2: rule__Optional__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_4__0_in_rule__Optional__Group__4__Impl8148);
                    rule__Optional__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionalAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__4__Impl"


    // $ANTLR start "rule__Optional__Group__5"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4051:1: rule__Optional__Group__5 : rule__Optional__Group__5__Impl ;
    public final void rule__Optional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4055:1: ( rule__Optional__Group__5__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4056:2: rule__Optional__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group__5__Impl_in_rule__Optional__Group__58179);
            rule__Optional__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__5"


    // $ANTLR start "rule__Optional__Group__5__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4062:1: rule__Optional__Group__5__Impl : ( ( rule__Optional__Group_5__0 )? ) ;
    public final void rule__Optional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4066:1: ( ( ( rule__Optional__Group_5__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4067:1: ( ( rule__Optional__Group_5__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4067:1: ( ( rule__Optional__Group_5__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4068:1: ( rule__Optional__Group_5__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_5()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4069:1: ( rule__Optional__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Xor||LA32_0==Or) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4069:2: rule__Optional__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_5__0_in_rule__Optional__Group__5__Impl8206);
                    rule__Optional__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionalAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__5__Impl"


    // $ANTLR start "rule__Optional__Group_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4091:1: rule__Optional__Group_2__0 : rule__Optional__Group_2__0__Impl rule__Optional__Group_2__1 ;
    public final void rule__Optional__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4095:1: ( rule__Optional__Group_2__0__Impl rule__Optional__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4096:2: rule__Optional__Group_2__0__Impl rule__Optional__Group_2__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__0__Impl_in_rule__Optional__Group_2__08249);
            rule__Optional__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2__1_in_rule__Optional__Group_2__08252);
            rule__Optional__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_2__0"


    // $ANTLR start "rule__Optional__Group_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4103:1: rule__Optional__Group_2__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Optional__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4107:1: ( ( LeftCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4108:1: ( LeftCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4108:1: ( LeftCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4109:1: LeftCurlyBracket
            {
             before(grammarAccess.getOptionalAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__Optional__Group_2__0__Impl8280); 
             after(grammarAccess.getOptionalAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_2__0__Impl"


    // $ANTLR start "rule__Optional__Group_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4122:1: rule__Optional__Group_2__1 : rule__Optional__Group_2__1__Impl rule__Optional__Group_2__2 ;
    public final void rule__Optional__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4126:1: ( rule__Optional__Group_2__1__Impl rule__Optional__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4127:2: rule__Optional__Group_2__1__Impl rule__Optional__Group_2__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__1__Impl_in_rule__Optional__Group_2__18311);
            rule__Optional__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2__2_in_rule__Optional__Group_2__18314);
            rule__Optional__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_2__1"


    // $ANTLR start "rule__Optional__Group_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4134:1: rule__Optional__Group_2__1__Impl : ( ( rule__Optional__SubfeatureAssignment_2_1 ) ) ;
    public final void rule__Optional__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4138:1: ( ( ( rule__Optional__SubfeatureAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4139:1: ( ( rule__Optional__SubfeatureAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4139:1: ( ( rule__Optional__SubfeatureAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4140:1: ( rule__Optional__SubfeatureAssignment_2_1 )
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4141:1: ( rule__Optional__SubfeatureAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4141:2: rule__Optional__SubfeatureAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Optional__SubfeatureAssignment_2_1_in_rule__Optional__Group_2__1__Impl8341);
            rule__Optional__SubfeatureAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getSubfeatureAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_2__1__Impl"


    // $ANTLR start "rule__Optional__Group_2__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4151:1: rule__Optional__Group_2__2 : rule__Optional__Group_2__2__Impl rule__Optional__Group_2__3 ;
    public final void rule__Optional__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4155:1: ( rule__Optional__Group_2__2__Impl rule__Optional__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4156:2: rule__Optional__Group_2__2__Impl rule__Optional__Group_2__3
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__2__Impl_in_rule__Optional__Group_2__28371);
            rule__Optional__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2__3_in_rule__Optional__Group_2__28374);
            rule__Optional__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_2__2"


    // $ANTLR start "rule__Optional__Group_2__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4163:1: rule__Optional__Group_2__2__Impl : ( ( rule__Optional__Group_2_2__0 )* ) ;
    public final void rule__Optional__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4167:1: ( ( ( rule__Optional__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4168:1: ( ( rule__Optional__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4168:1: ( ( rule__Optional__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4169:1: ( rule__Optional__Group_2_2__0 )*
            {
             before(grammarAccess.getOptionalAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4170:1: ( rule__Optional__Group_2_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Comma) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4170:2: rule__Optional__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Optional__Group_2_2__0_in_rule__Optional__Group_2__2__Impl8401);
            	    rule__Optional__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getOptionalAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_2__2__Impl"


    // $ANTLR start "rule__Optional__Group_2__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4180:1: rule__Optional__Group_2__3 : rule__Optional__Group_2__3__Impl ;
    public final void rule__Optional__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4184:1: ( rule__Optional__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4185:2: rule__Optional__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__3__Impl_in_rule__Optional__Group_2__38432);
            rule__Optional__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_2__3"


    // $ANTLR start "rule__Optional__Group_2__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4191:1: rule__Optional__Group_2__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Optional__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4195:1: ( ( RightCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4196:1: ( RightCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4196:1: ( RightCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4197:1: RightCurlyBracket
            {
             before(grammarAccess.getOptionalAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__Optional__Group_2__3__Impl8460); 
             after(grammarAccess.getOptionalAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_2__3__Impl"


    // $ANTLR start "rule__Optional__Group_2_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4218:1: rule__Optional__Group_2_2__0 : rule__Optional__Group_2_2__0__Impl rule__Optional__Group_2_2__1 ;
    public final void rule__Optional__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4222:1: ( rule__Optional__Group_2_2__0__Impl rule__Optional__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4223:2: rule__Optional__Group_2_2__0__Impl rule__Optional__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_2_2__0__Impl_in_rule__Optional__Group_2_2__08499);
            rule__Optional__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2_2__1_in_rule__Optional__Group_2_2__08502);
            rule__Optional__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_2_2__0"


    // $ANTLR start "rule__Optional__Group_2_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4230:1: rule__Optional__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Optional__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4234:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4235:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4235:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4236:1: Comma
            {
             before(grammarAccess.getOptionalAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Optional__Group_2_2__0__Impl8530); 
             after(grammarAccess.getOptionalAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_2_2__0__Impl"


    // $ANTLR start "rule__Optional__Group_2_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4249:1: rule__Optional__Group_2_2__1 : rule__Optional__Group_2_2__1__Impl ;
    public final void rule__Optional__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4253:1: ( rule__Optional__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4254:2: rule__Optional__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_2_2__1__Impl_in_rule__Optional__Group_2_2__18561);
            rule__Optional__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_2_2__1"


    // $ANTLR start "rule__Optional__Group_2_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4260:1: rule__Optional__Group_2_2__1__Impl : ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) ) ;
    public final void rule__Optional__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4264:1: ( ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4265:1: ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4265:1: ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4266:1: ( rule__Optional__SubfeatureAssignment_2_2_1 )
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4267:1: ( rule__Optional__SubfeatureAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4267:2: rule__Optional__SubfeatureAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Optional__SubfeatureAssignment_2_2_1_in_rule__Optional__Group_2_2__1__Impl8588);
            rule__Optional__SubfeatureAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getSubfeatureAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_2_2__1__Impl"


    // $ANTLR start "rule__Optional__Group_3__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4281:1: rule__Optional__Group_3__0 : rule__Optional__Group_3__0__Impl rule__Optional__Group_3__1 ;
    public final void rule__Optional__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4285:1: ( rule__Optional__Group_3__0__Impl rule__Optional__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4286:2: rule__Optional__Group_3__0__Impl rule__Optional__Group_3__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__0__Impl_in_rule__Optional__Group_3__08622);
            rule__Optional__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3__1_in_rule__Optional__Group_3__08625);
            rule__Optional__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_3__0"


    // $ANTLR start "rule__Optional__Group_3__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4293:1: rule__Optional__Group_3__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Optional__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4297:1: ( ( LeftParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4298:1: ( LeftParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4298:1: ( LeftParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4299:1: LeftParenthesis
            {
             before(grammarAccess.getOptionalAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rule__Optional__Group_3__0__Impl8653); 
             after(grammarAccess.getOptionalAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_3__0__Impl"


    // $ANTLR start "rule__Optional__Group_3__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4312:1: rule__Optional__Group_3__1 : rule__Optional__Group_3__1__Impl rule__Optional__Group_3__2 ;
    public final void rule__Optional__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4316:1: ( rule__Optional__Group_3__1__Impl rule__Optional__Group_3__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4317:2: rule__Optional__Group_3__1__Impl rule__Optional__Group_3__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__1__Impl_in_rule__Optional__Group_3__18684);
            rule__Optional__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3__2_in_rule__Optional__Group_3__18687);
            rule__Optional__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_3__1"


    // $ANTLR start "rule__Optional__Group_3__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4324:1: rule__Optional__Group_3__1__Impl : ( ( rule__Optional__AttributeAssignment_3_1 ) ) ;
    public final void rule__Optional__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4328:1: ( ( ( rule__Optional__AttributeAssignment_3_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4329:1: ( ( rule__Optional__AttributeAssignment_3_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4329:1: ( ( rule__Optional__AttributeAssignment_3_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4330:1: ( rule__Optional__AttributeAssignment_3_1 )
            {
             before(grammarAccess.getOptionalAccess().getAttributeAssignment_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4331:1: ( rule__Optional__AttributeAssignment_3_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4331:2: rule__Optional__AttributeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Optional__AttributeAssignment_3_1_in_rule__Optional__Group_3__1__Impl8714);
            rule__Optional__AttributeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getAttributeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_3__1__Impl"


    // $ANTLR start "rule__Optional__Group_3__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4341:1: rule__Optional__Group_3__2 : rule__Optional__Group_3__2__Impl ;
    public final void rule__Optional__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4345:1: ( rule__Optional__Group_3__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4346:2: rule__Optional__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__2__Impl_in_rule__Optional__Group_3__28744);
            rule__Optional__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_3__2"


    // $ANTLR start "rule__Optional__Group_3__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4352:1: rule__Optional__Group_3__2__Impl : ( RightParenthesis ) ;
    public final void rule__Optional__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4356:1: ( ( RightParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4357:1: ( RightParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4357:1: ( RightParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4358:1: RightParenthesis
            {
             before(grammarAccess.getOptionalAccess().getRightParenthesisKeyword_3_2()); 
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rule__Optional__Group_3__2__Impl8772); 
             after(grammarAccess.getOptionalAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_3__2__Impl"


    // $ANTLR start "rule__Optional__Group_4__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4377:1: rule__Optional__Group_4__0 : rule__Optional__Group_4__0__Impl rule__Optional__Group_4__1 ;
    public final void rule__Optional__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4381:1: ( rule__Optional__Group_4__0__Impl rule__Optional__Group_4__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4382:2: rule__Optional__Group_4__0__Impl rule__Optional__Group_4__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_4__0__Impl_in_rule__Optional__Group_4__08809);
            rule__Optional__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_4__1_in_rule__Optional__Group_4__08812);
            rule__Optional__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_4__0"


    // $ANTLR start "rule__Optional__Group_4__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4389:1: rule__Optional__Group_4__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Optional__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4393:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4394:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4394:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4395:1: LeftSquareBracket
            {
             before(grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Optional__Group_4__0__Impl8840); 
             after(grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_4__0__Impl"


    // $ANTLR start "rule__Optional__Group_4__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4408:1: rule__Optional__Group_4__1 : rule__Optional__Group_4__1__Impl rule__Optional__Group_4__2 ;
    public final void rule__Optional__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4412:1: ( rule__Optional__Group_4__1__Impl rule__Optional__Group_4__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4413:2: rule__Optional__Group_4__1__Impl rule__Optional__Group_4__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_4__1__Impl_in_rule__Optional__Group_4__18871);
            rule__Optional__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_4__2_in_rule__Optional__Group_4__18874);
            rule__Optional__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_4__1"


    // $ANTLR start "rule__Optional__Group_4__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4420:1: rule__Optional__Group_4__1__Impl : ( ( rule__Optional__ConstrainsAssignment_4_1 ) ) ;
    public final void rule__Optional__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4424:1: ( ( ( rule__Optional__ConstrainsAssignment_4_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4425:1: ( ( rule__Optional__ConstrainsAssignment_4_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4425:1: ( ( rule__Optional__ConstrainsAssignment_4_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4426:1: ( rule__Optional__ConstrainsAssignment_4_1 )
            {
             before(grammarAccess.getOptionalAccess().getConstrainsAssignment_4_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4427:1: ( rule__Optional__ConstrainsAssignment_4_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4427:2: rule__Optional__ConstrainsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Optional__ConstrainsAssignment_4_1_in_rule__Optional__Group_4__1__Impl8901);
            rule__Optional__ConstrainsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getConstrainsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_4__1__Impl"


    // $ANTLR start "rule__Optional__Group_4__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4437:1: rule__Optional__Group_4__2 : rule__Optional__Group_4__2__Impl rule__Optional__Group_4__3 ;
    public final void rule__Optional__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4441:1: ( rule__Optional__Group_4__2__Impl rule__Optional__Group_4__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4442:2: rule__Optional__Group_4__2__Impl rule__Optional__Group_4__3
            {
            pushFollow(FOLLOW_rule__Optional__Group_4__2__Impl_in_rule__Optional__Group_4__28931);
            rule__Optional__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_4__3_in_rule__Optional__Group_4__28934);
            rule__Optional__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_4__2"


    // $ANTLR start "rule__Optional__Group_4__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4449:1: rule__Optional__Group_4__2__Impl : ( ( rule__Optional__Group_4_2__0 )* ) ;
    public final void rule__Optional__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4453:1: ( ( ( rule__Optional__Group_4_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4454:1: ( ( rule__Optional__Group_4_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4454:1: ( ( rule__Optional__Group_4_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4455:1: ( rule__Optional__Group_4_2__0 )*
            {
             before(grammarAccess.getOptionalAccess().getGroup_4_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4456:1: ( rule__Optional__Group_4_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4456:2: rule__Optional__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Optional__Group_4_2__0_in_rule__Optional__Group_4__2__Impl8961);
            	    rule__Optional__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getOptionalAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_4__2__Impl"


    // $ANTLR start "rule__Optional__Group_4__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4466:1: rule__Optional__Group_4__3 : rule__Optional__Group_4__3__Impl ;
    public final void rule__Optional__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4470:1: ( rule__Optional__Group_4__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4471:2: rule__Optional__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_4__3__Impl_in_rule__Optional__Group_4__38992);
            rule__Optional__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_4__3"


    // $ANTLR start "rule__Optional__Group_4__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4477:1: rule__Optional__Group_4__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Optional__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4481:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4482:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4482:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4483:1: RightSquareBracket
            {
             before(grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Optional__Group_4__3__Impl9020); 
             after(grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_4__3__Impl"


    // $ANTLR start "rule__Optional__Group_4_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4504:1: rule__Optional__Group_4_2__0 : rule__Optional__Group_4_2__0__Impl rule__Optional__Group_4_2__1 ;
    public final void rule__Optional__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4508:1: ( rule__Optional__Group_4_2__0__Impl rule__Optional__Group_4_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4509:2: rule__Optional__Group_4_2__0__Impl rule__Optional__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_4_2__0__Impl_in_rule__Optional__Group_4_2__09059);
            rule__Optional__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_4_2__1_in_rule__Optional__Group_4_2__09062);
            rule__Optional__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_4_2__0"


    // $ANTLR start "rule__Optional__Group_4_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4516:1: rule__Optional__Group_4_2__0__Impl : ( Comma ) ;
    public final void rule__Optional__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4520:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4521:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4521:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4522:1: Comma
            {
             before(grammarAccess.getOptionalAccess().getCommaKeyword_4_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Optional__Group_4_2__0__Impl9090); 
             after(grammarAccess.getOptionalAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_4_2__0__Impl"


    // $ANTLR start "rule__Optional__Group_4_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4535:1: rule__Optional__Group_4_2__1 : rule__Optional__Group_4_2__1__Impl ;
    public final void rule__Optional__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4539:1: ( rule__Optional__Group_4_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4540:2: rule__Optional__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_4_2__1__Impl_in_rule__Optional__Group_4_2__19121);
            rule__Optional__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_4_2__1"


    // $ANTLR start "rule__Optional__Group_4_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4546:1: rule__Optional__Group_4_2__1__Impl : ( ( rule__Optional__ConstrainsAssignment_4_2_1 ) ) ;
    public final void rule__Optional__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4550:1: ( ( ( rule__Optional__ConstrainsAssignment_4_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4551:1: ( ( rule__Optional__ConstrainsAssignment_4_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4551:1: ( ( rule__Optional__ConstrainsAssignment_4_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4552:1: ( rule__Optional__ConstrainsAssignment_4_2_1 )
            {
             before(grammarAccess.getOptionalAccess().getConstrainsAssignment_4_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4553:1: ( rule__Optional__ConstrainsAssignment_4_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4553:2: rule__Optional__ConstrainsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Optional__ConstrainsAssignment_4_2_1_in_rule__Optional__Group_4_2__1__Impl9148);
            rule__Optional__ConstrainsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getConstrainsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_4_2__1__Impl"


    // $ANTLR start "rule__Optional__Group_5__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4567:1: rule__Optional__Group_5__0 : rule__Optional__Group_5__0__Impl rule__Optional__Group_5__1 ;
    public final void rule__Optional__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4571:1: ( rule__Optional__Group_5__0__Impl rule__Optional__Group_5__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4572:2: rule__Optional__Group_5__0__Impl rule__Optional__Group_5__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_5__0__Impl_in_rule__Optional__Group_5__09182);
            rule__Optional__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_5__1_in_rule__Optional__Group_5__09185);
            rule__Optional__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_5__0"


    // $ANTLR start "rule__Optional__Group_5__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4579:1: rule__Optional__Group_5__0__Impl : ( ( rule__Optional__GroupsAssignment_5_0 ) ) ;
    public final void rule__Optional__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4583:1: ( ( ( rule__Optional__GroupsAssignment_5_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4584:1: ( ( rule__Optional__GroupsAssignment_5_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4584:1: ( ( rule__Optional__GroupsAssignment_5_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4585:1: ( rule__Optional__GroupsAssignment_5_0 )
            {
             before(grammarAccess.getOptionalAccess().getGroupsAssignment_5_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4586:1: ( rule__Optional__GroupsAssignment_5_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4586:2: rule__Optional__GroupsAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Optional__GroupsAssignment_5_0_in_rule__Optional__Group_5__0__Impl9212);
            rule__Optional__GroupsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getGroupsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_5__0__Impl"


    // $ANTLR start "rule__Optional__Group_5__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4596:1: rule__Optional__Group_5__1 : rule__Optional__Group_5__1__Impl ;
    public final void rule__Optional__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4600:1: ( rule__Optional__Group_5__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4601:2: rule__Optional__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_5__1__Impl_in_rule__Optional__Group_5__19242);
            rule__Optional__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_5__1"


    // $ANTLR start "rule__Optional__Group_5__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4607:1: rule__Optional__Group_5__1__Impl : ( ( rule__Optional__GroupsAssignment_5_1 )* ) ;
    public final void rule__Optional__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4611:1: ( ( ( rule__Optional__GroupsAssignment_5_1 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4612:1: ( ( rule__Optional__GroupsAssignment_5_1 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4612:1: ( ( rule__Optional__GroupsAssignment_5_1 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4613:1: ( rule__Optional__GroupsAssignment_5_1 )*
            {
             before(grammarAccess.getOptionalAccess().getGroupsAssignment_5_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4614:1: ( rule__Optional__GroupsAssignment_5_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Xor||LA35_0==Or) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4614:2: rule__Optional__GroupsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Optional__GroupsAssignment_5_1_in_rule__Optional__Group_5__1__Impl9269);
            	    rule__Optional__GroupsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getOptionalAccess().getGroupsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_5__1__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4628:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4632:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4633:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__09304);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__09307);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4640:1: rule__Or__Group__0__Impl : ( Or ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4644:1: ( ( Or ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4645:1: ( Or )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4645:1: ( Or )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4646:1: Or
            {
             before(grammarAccess.getOrAccess().getOrKeyword_0()); 
            match(input,Or,FOLLOW_Or_in_rule__Or__Group__0__Impl9335); 
             after(grammarAccess.getOrAccess().getOrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4659:1: rule__Or__Group__1 : rule__Or__Group__1__Impl rule__Or__Group__2 ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4663:1: ( rule__Or__Group__1__Impl rule__Or__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4664:2: rule__Or__Group__1__Impl rule__Or__Group__2
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__19366);
            rule__Or__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__2_in_rule__Or__Group__19369);
            rule__Or__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4671:1: rule__Or__Group__1__Impl : ( ( rule__Or__NameAssignment_1 ) ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4675:1: ( ( ( rule__Or__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4676:1: ( ( rule__Or__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4676:1: ( ( rule__Or__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4677:1: ( rule__Or__NameAssignment_1 )
            {
             before(grammarAccess.getOrAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4678:1: ( rule__Or__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4678:2: rule__Or__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Or__NameAssignment_1_in_rule__Or__Group__1__Impl9396);
            rule__Or__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4688:1: rule__Or__Group__2 : rule__Or__Group__2__Impl ;
    public final void rule__Or__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4692:1: ( rule__Or__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4693:2: rule__Or__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__29426);
            rule__Or__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__2"


    // $ANTLR start "rule__Or__Group__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4699:1: rule__Or__Group__2__Impl : ( ( rule__Or__Group_2__0 )? ) ;
    public final void rule__Or__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4703:1: ( ( ( rule__Or__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4704:1: ( ( rule__Or__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4704:1: ( ( rule__Or__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4705:1: ( rule__Or__Group_2__0 )?
            {
             before(grammarAccess.getOrAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4706:1: ( rule__Or__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_BEGIN) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4706:2: rule__Or__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Or__Group_2__0_in_rule__Or__Group__2__Impl9453);
                    rule__Or__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__2__Impl"


    // $ANTLR start "rule__Or__Group_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4722:1: rule__Or__Group_2__0 : rule__Or__Group_2__0__Impl rule__Or__Group_2__1 ;
    public final void rule__Or__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4726:1: ( rule__Or__Group_2__0__Impl rule__Or__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4727:2: rule__Or__Group_2__0__Impl rule__Or__Group_2__1
            {
            pushFollow(FOLLOW_rule__Or__Group_2__0__Impl_in_rule__Or__Group_2__09490);
            rule__Or__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2__1_in_rule__Or__Group_2__09493);
            rule__Or__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2__0"


    // $ANTLR start "rule__Or__Group_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4734:1: rule__Or__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Or__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4738:1: ( ( RULE_BEGIN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4739:1: ( RULE_BEGIN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4739:1: ( RULE_BEGIN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4740:1: RULE_BEGIN
            {
             before(grammarAccess.getOrAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Or__Group_2__0__Impl9520); 
             after(grammarAccess.getOrAccess().getBEGINTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2__0__Impl"


    // $ANTLR start "rule__Or__Group_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4751:1: rule__Or__Group_2__1 : rule__Or__Group_2__1__Impl rule__Or__Group_2__2 ;
    public final void rule__Or__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4755:1: ( rule__Or__Group_2__1__Impl rule__Or__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4756:2: rule__Or__Group_2__1__Impl rule__Or__Group_2__2
            {
            pushFollow(FOLLOW_rule__Or__Group_2__1__Impl_in_rule__Or__Group_2__19549);
            rule__Or__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2__2_in_rule__Or__Group_2__19552);
            rule__Or__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2__1"


    // $ANTLR start "rule__Or__Group_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4763:1: rule__Or__Group_2__1__Impl : ( ( rule__Or__GroupedAssignment_2_1 ) ) ;
    public final void rule__Or__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4767:1: ( ( ( rule__Or__GroupedAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4768:1: ( ( rule__Or__GroupedAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4768:1: ( ( rule__Or__GroupedAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4769:1: ( rule__Or__GroupedAssignment_2_1 )
            {
             before(grammarAccess.getOrAccess().getGroupedAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4770:1: ( rule__Or__GroupedAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4770:2: rule__Or__GroupedAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Or__GroupedAssignment_2_1_in_rule__Or__Group_2__1__Impl9579);
            rule__Or__GroupedAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroupedAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2__1__Impl"


    // $ANTLR start "rule__Or__Group_2__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4780:1: rule__Or__Group_2__2 : rule__Or__Group_2__2__Impl rule__Or__Group_2__3 ;
    public final void rule__Or__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4784:1: ( rule__Or__Group_2__2__Impl rule__Or__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4785:2: rule__Or__Group_2__2__Impl rule__Or__Group_2__3
            {
            pushFollow(FOLLOW_rule__Or__Group_2__2__Impl_in_rule__Or__Group_2__29609);
            rule__Or__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2__3_in_rule__Or__Group_2__29612);
            rule__Or__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2__2"


    // $ANTLR start "rule__Or__Group_2__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4792:1: rule__Or__Group_2__2__Impl : ( ( rule__Or__Group_2_2__0 )* ) ;
    public final void rule__Or__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4796:1: ( ( ( rule__Or__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4797:1: ( ( rule__Or__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4797:1: ( ( rule__Or__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4798:1: ( rule__Or__Group_2_2__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4799:1: ( rule__Or__Group_2_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==Comma||LA37_0==RULE_NULL||LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4799:2: rule__Or__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_2_2__0_in_rule__Or__Group_2__2__Impl9639);
            	    rule__Or__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2__2__Impl"


    // $ANTLR start "rule__Or__Group_2__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4809:1: rule__Or__Group_2__3 : rule__Or__Group_2__3__Impl ;
    public final void rule__Or__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4813:1: ( rule__Or__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4814:2: rule__Or__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_2__3__Impl_in_rule__Or__Group_2__39670);
            rule__Or__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2__3"


    // $ANTLR start "rule__Or__Group_2__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4820:1: rule__Or__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Or__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4824:1: ( ( RULE_END ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4825:1: ( RULE_END )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4825:1: ( RULE_END )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4826:1: RULE_END
            {
             before(grammarAccess.getOrAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Or__Group_2__3__Impl9697); 
             after(grammarAccess.getOrAccess().getENDTerminalRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2__3__Impl"


    // $ANTLR start "rule__Or__Group_2_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4845:1: rule__Or__Group_2_2__0 : rule__Or__Group_2_2__0__Impl rule__Or__Group_2_2__1 ;
    public final void rule__Or__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4849:1: ( rule__Or__Group_2_2__0__Impl rule__Or__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4850:2: rule__Or__Group_2_2__0__Impl rule__Or__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Or__Group_2_2__0__Impl_in_rule__Or__Group_2_2__09734);
            rule__Or__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2_2__1_in_rule__Or__Group_2_2__09737);
            rule__Or__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2_2__0"


    // $ANTLR start "rule__Or__Group_2_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4857:1: rule__Or__Group_2_2__0__Impl : ( ( Comma )* ) ;
    public final void rule__Or__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4861:1: ( ( ( Comma )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4862:1: ( ( Comma )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4862:1: ( ( Comma )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4863:1: ( Comma )*
            {
             before(grammarAccess.getOrAccess().getCommaKeyword_2_2_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4864:1: ( Comma )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==Comma) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4865:2: Comma
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_rule__Or__Group_2_2__0__Impl9766); 

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2_2__0__Impl"


    // $ANTLR start "rule__Or__Group_2_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4876:1: rule__Or__Group_2_2__1 : rule__Or__Group_2_2__1__Impl ;
    public final void rule__Or__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4880:1: ( rule__Or__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4881:2: rule__Or__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_2_2__1__Impl_in_rule__Or__Group_2_2__19799);
            rule__Or__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2_2__1"


    // $ANTLR start "rule__Or__Group_2_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4887:1: rule__Or__Group_2_2__1__Impl : ( ( rule__Or__GroupedAssignment_2_2_1 ) ) ;
    public final void rule__Or__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4891:1: ( ( ( rule__Or__GroupedAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4892:1: ( ( rule__Or__GroupedAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4892:1: ( ( rule__Or__GroupedAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4893:1: ( rule__Or__GroupedAssignment_2_2_1 )
            {
             before(grammarAccess.getOrAccess().getGroupedAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4894:1: ( rule__Or__GroupedAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4894:2: rule__Or__GroupedAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Or__GroupedAssignment_2_2_1_in_rule__Or__Group_2_2__1__Impl9826);
            rule__Or__GroupedAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroupedAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2_2__1__Impl"


    // $ANTLR start "rule__Xor__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4908:1: rule__Xor__Group__0 : rule__Xor__Group__0__Impl rule__Xor__Group__1 ;
    public final void rule__Xor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4912:1: ( rule__Xor__Group__0__Impl rule__Xor__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4913:2: rule__Xor__Group__0__Impl rule__Xor__Group__1
            {
            pushFollow(FOLLOW_rule__Xor__Group__0__Impl_in_rule__Xor__Group__09860);
            rule__Xor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group__1_in_rule__Xor__Group__09863);
            rule__Xor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__0"


    // $ANTLR start "rule__Xor__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4920:1: rule__Xor__Group__0__Impl : ( Xor ) ;
    public final void rule__Xor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4924:1: ( ( Xor ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4925:1: ( Xor )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4925:1: ( Xor )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4926:1: Xor
            {
             before(grammarAccess.getXorAccess().getXorKeyword_0()); 
            match(input,Xor,FOLLOW_Xor_in_rule__Xor__Group__0__Impl9891); 
             after(grammarAccess.getXorAccess().getXorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__0__Impl"


    // $ANTLR start "rule__Xor__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4939:1: rule__Xor__Group__1 : rule__Xor__Group__1__Impl rule__Xor__Group__2 ;
    public final void rule__Xor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4943:1: ( rule__Xor__Group__1__Impl rule__Xor__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4944:2: rule__Xor__Group__1__Impl rule__Xor__Group__2
            {
            pushFollow(FOLLOW_rule__Xor__Group__1__Impl_in_rule__Xor__Group__19922);
            rule__Xor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group__2_in_rule__Xor__Group__19925);
            rule__Xor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__1"


    // $ANTLR start "rule__Xor__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4951:1: rule__Xor__Group__1__Impl : ( ( rule__Xor__NameAssignment_1 ) ) ;
    public final void rule__Xor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4955:1: ( ( ( rule__Xor__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4956:1: ( ( rule__Xor__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4956:1: ( ( rule__Xor__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4957:1: ( rule__Xor__NameAssignment_1 )
            {
             before(grammarAccess.getXorAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4958:1: ( rule__Xor__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4958:2: rule__Xor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Xor__NameAssignment_1_in_rule__Xor__Group__1__Impl9952);
            rule__Xor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__1__Impl"


    // $ANTLR start "rule__Xor__Group__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4968:1: rule__Xor__Group__2 : rule__Xor__Group__2__Impl ;
    public final void rule__Xor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4972:1: ( rule__Xor__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4973:2: rule__Xor__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Xor__Group__2__Impl_in_rule__Xor__Group__29982);
            rule__Xor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__2"


    // $ANTLR start "rule__Xor__Group__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4979:1: rule__Xor__Group__2__Impl : ( ( rule__Xor__Group_2__0 )? ) ;
    public final void rule__Xor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4983:1: ( ( ( rule__Xor__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4984:1: ( ( rule__Xor__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4984:1: ( ( rule__Xor__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4985:1: ( rule__Xor__Group_2__0 )?
            {
             before(grammarAccess.getXorAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4986:1: ( rule__Xor__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_BEGIN) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4986:2: rule__Xor__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Xor__Group_2__0_in_rule__Xor__Group__2__Impl10009);
                    rule__Xor__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group__2__Impl"


    // $ANTLR start "rule__Xor__Group_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5002:1: rule__Xor__Group_2__0 : rule__Xor__Group_2__0__Impl rule__Xor__Group_2__1 ;
    public final void rule__Xor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5006:1: ( rule__Xor__Group_2__0__Impl rule__Xor__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5007:2: rule__Xor__Group_2__0__Impl rule__Xor__Group_2__1
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__0__Impl_in_rule__Xor__Group_2__010046);
            rule__Xor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2__1_in_rule__Xor__Group_2__010049);
            rule__Xor__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group_2__0"


    // $ANTLR start "rule__Xor__Group_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5014:1: rule__Xor__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Xor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5018:1: ( ( RULE_BEGIN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5019:1: ( RULE_BEGIN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5019:1: ( RULE_BEGIN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5020:1: RULE_BEGIN
            {
             before(grammarAccess.getXorAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Xor__Group_2__0__Impl10076); 
             after(grammarAccess.getXorAccess().getBEGINTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group_2__0__Impl"


    // $ANTLR start "rule__Xor__Group_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5031:1: rule__Xor__Group_2__1 : rule__Xor__Group_2__1__Impl rule__Xor__Group_2__2 ;
    public final void rule__Xor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5035:1: ( rule__Xor__Group_2__1__Impl rule__Xor__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5036:2: rule__Xor__Group_2__1__Impl rule__Xor__Group_2__2
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__1__Impl_in_rule__Xor__Group_2__110105);
            rule__Xor__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2__2_in_rule__Xor__Group_2__110108);
            rule__Xor__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group_2__1"


    // $ANTLR start "rule__Xor__Group_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5043:1: rule__Xor__Group_2__1__Impl : ( ( rule__Xor__GroupedAssignment_2_1 ) ) ;
    public final void rule__Xor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5047:1: ( ( ( rule__Xor__GroupedAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5048:1: ( ( rule__Xor__GroupedAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5048:1: ( ( rule__Xor__GroupedAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5049:1: ( rule__Xor__GroupedAssignment_2_1 )
            {
             before(grammarAccess.getXorAccess().getGroupedAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5050:1: ( rule__Xor__GroupedAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5050:2: rule__Xor__GroupedAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Xor__GroupedAssignment_2_1_in_rule__Xor__Group_2__1__Impl10135);
            rule__Xor__GroupedAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXorAccess().getGroupedAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group_2__1__Impl"


    // $ANTLR start "rule__Xor__Group_2__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5060:1: rule__Xor__Group_2__2 : rule__Xor__Group_2__2__Impl rule__Xor__Group_2__3 ;
    public final void rule__Xor__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5064:1: ( rule__Xor__Group_2__2__Impl rule__Xor__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5065:2: rule__Xor__Group_2__2__Impl rule__Xor__Group_2__3
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__2__Impl_in_rule__Xor__Group_2__210165);
            rule__Xor__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2__3_in_rule__Xor__Group_2__210168);
            rule__Xor__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group_2__2"


    // $ANTLR start "rule__Xor__Group_2__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5072:1: rule__Xor__Group_2__2__Impl : ( ( rule__Xor__Group_2_2__0 )* ) ;
    public final void rule__Xor__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5076:1: ( ( ( rule__Xor__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5077:1: ( ( rule__Xor__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5077:1: ( ( rule__Xor__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5078:1: ( rule__Xor__Group_2_2__0 )*
            {
             before(grammarAccess.getXorAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5079:1: ( rule__Xor__Group_2_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Comma||LA40_0==RULE_NULL||LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5079:2: rule__Xor__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Xor__Group_2_2__0_in_rule__Xor__Group_2__2__Impl10195);
            	    rule__Xor__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getXorAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group_2__2__Impl"


    // $ANTLR start "rule__Xor__Group_2__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5089:1: rule__Xor__Group_2__3 : rule__Xor__Group_2__3__Impl ;
    public final void rule__Xor__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5093:1: ( rule__Xor__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5094:2: rule__Xor__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__3__Impl_in_rule__Xor__Group_2__310226);
            rule__Xor__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group_2__3"


    // $ANTLR start "rule__Xor__Group_2__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5100:1: rule__Xor__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Xor__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5104:1: ( ( RULE_END ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5105:1: ( RULE_END )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5105:1: ( RULE_END )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5106:1: RULE_END
            {
             before(grammarAccess.getXorAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Xor__Group_2__3__Impl10253); 
             after(grammarAccess.getXorAccess().getENDTerminalRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group_2__3__Impl"


    // $ANTLR start "rule__Xor__Group_2_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5125:1: rule__Xor__Group_2_2__0 : rule__Xor__Group_2_2__0__Impl rule__Xor__Group_2_2__1 ;
    public final void rule__Xor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5129:1: ( rule__Xor__Group_2_2__0__Impl rule__Xor__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5130:2: rule__Xor__Group_2_2__0__Impl rule__Xor__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Xor__Group_2_2__0__Impl_in_rule__Xor__Group_2_2__010290);
            rule__Xor__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2_2__1_in_rule__Xor__Group_2_2__010293);
            rule__Xor__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group_2_2__0"


    // $ANTLR start "rule__Xor__Group_2_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5137:1: rule__Xor__Group_2_2__0__Impl : ( ( Comma )* ) ;
    public final void rule__Xor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5141:1: ( ( ( Comma )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5142:1: ( ( Comma )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5142:1: ( ( Comma )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5143:1: ( Comma )*
            {
             before(grammarAccess.getXorAccess().getCommaKeyword_2_2_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5144:1: ( Comma )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Comma) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5145:2: Comma
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_rule__Xor__Group_2_2__0__Impl10322); 

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getXorAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group_2_2__0__Impl"


    // $ANTLR start "rule__Xor__Group_2_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5156:1: rule__Xor__Group_2_2__1 : rule__Xor__Group_2_2__1__Impl ;
    public final void rule__Xor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5160:1: ( rule__Xor__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5161:2: rule__Xor__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Xor__Group_2_2__1__Impl_in_rule__Xor__Group_2_2__110355);
            rule__Xor__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group_2_2__1"


    // $ANTLR start "rule__Xor__Group_2_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5167:1: rule__Xor__Group_2_2__1__Impl : ( ( rule__Xor__GroupedAssignment_2_2_1 ) ) ;
    public final void rule__Xor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5171:1: ( ( ( rule__Xor__GroupedAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5172:1: ( ( rule__Xor__GroupedAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5172:1: ( ( rule__Xor__GroupedAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5173:1: ( rule__Xor__GroupedAssignment_2_2_1 )
            {
             before(grammarAccess.getXorAccess().getGroupedAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5174:1: ( rule__Xor__GroupedAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5174:2: rule__Xor__GroupedAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Xor__GroupedAssignment_2_2_1_in_rule__Xor__Group_2_2__1__Impl10382);
            rule__Xor__GroupedAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXorAccess().getGroupedAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__Group_2_2__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5189:1: rule__Model__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5193:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5194:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5194:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5195:1: ruleEString
            {
             before(grammarAccess.getModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Model__NameAssignment_110421);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__RootAssignment_2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5204:1: rule__Model__RootAssignment_2 : ( ruleFeature_Impl ) ;
    public final void rule__Model__RootAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5208:1: ( ( ruleFeature_Impl ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5209:1: ( ruleFeature_Impl )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5209:1: ( ruleFeature_Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5210:1: ruleFeature_Impl
            {
             before(grammarAccess.getModelAccess().getRootFeature_ImplParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFeature_Impl_in_rule__Model__RootAssignment_210452);
            ruleFeature_Impl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRootFeature_ImplParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RootAssignment_2"


    // $ANTLR start "rule__Disjunction__OperatorAssignment_1_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5219:1: rule__Disjunction__OperatorAssignment_1_1 : ( ruleDisjunctiveOperator ) ;
    public final void rule__Disjunction__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5223:1: ( ( ruleDisjunctiveOperator ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5224:1: ( ruleDisjunctiveOperator )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5224:1: ( ruleDisjunctiveOperator )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5225:1: ruleDisjunctiveOperator
            {
             before(grammarAccess.getDisjunctionAccess().getOperatorDisjunctiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDisjunctiveOperator_in_rule__Disjunction__OperatorAssignment_1_110483);
            ruleDisjunctiveOperator();

            state._fsp--;

             after(grammarAccess.getDisjunctionAccess().getOperatorDisjunctiveOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__OperatorAssignment_1_1"


    // $ANTLR start "rule__Disjunction__RightExpAssignment_1_2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5234:1: rule__Disjunction__RightExpAssignment_1_2 : ( ruleConjunction ) ;
    public final void rule__Disjunction__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5238:1: ( ( ruleConjunction ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5239:1: ( ruleConjunction )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5239:1: ( ruleConjunction )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5240:1: ruleConjunction
            {
             before(grammarAccess.getDisjunctionAccess().getRightExpConjunctionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Disjunction__RightExpAssignment_1_210514);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionAccess().getRightExpConjunctionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__RightExpAssignment_1_2"


    // $ANTLR start "rule__Conjunction__OperatorAssignment_1_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5249:1: rule__Conjunction__OperatorAssignment_1_1 : ( ruleConjunctiveOperator ) ;
    public final void rule__Conjunction__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5253:1: ( ( ruleConjunctiveOperator ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5254:1: ( ruleConjunctiveOperator )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5254:1: ( ruleConjunctiveOperator )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5255:1: ruleConjunctiveOperator
            {
             before(grammarAccess.getConjunctionAccess().getOperatorConjunctiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConjunctiveOperator_in_rule__Conjunction__OperatorAssignment_1_110545);
            ruleConjunctiveOperator();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getOperatorConjunctiveOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__OperatorAssignment_1_1"


    // $ANTLR start "rule__Conjunction__RightExpAssignment_1_2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5264:1: rule__Conjunction__RightExpAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__Conjunction__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5268:1: ( ( ruleEquality ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5269:1: ( ruleEquality )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5269:1: ( ruleEquality )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5270:1: ruleEquality
            {
             before(grammarAccess.getConjunctionAccess().getRightExpEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__Conjunction__RightExpAssignment_1_210576);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getRightExpEqualityParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__RightExpAssignment_1_2"


    // $ANTLR start "rule__Equality__OperatorAssignment_1_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5279:1: rule__Equality__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__Equality__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5283:1: ( ( ruleEqualityOperator ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5284:1: ( ruleEqualityOperator )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5284:1: ( ruleEqualityOperator )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5285:1: ruleEqualityOperator
            {
             before(grammarAccess.getEqualityAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEqualityOperator_in_rule__Equality__OperatorAssignment_1_110607);
            ruleEqualityOperator();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OperatorAssignment_1_1"


    // $ANTLR start "rule__Equality__RightExpAssignment_1_2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5294:1: rule__Equality__RightExpAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5298:1: ( ( ruleComparison ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5299:1: ( ruleComparison )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5299:1: ( ruleComparison )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5300:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightExpComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__RightExpAssignment_1_210638);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightExpComparisonParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightExpAssignment_1_2"


    // $ANTLR start "rule__Comparison__OperatorAssignment_1_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5309:1: rule__Comparison__OperatorAssignment_1_1 : ( ruleComparativeOperator ) ;
    public final void rule__Comparison__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5313:1: ( ( ruleComparativeOperator ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5314:1: ( ruleComparativeOperator )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5314:1: ( ruleComparativeOperator )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5315:1: ruleComparativeOperator
            {
             before(grammarAccess.getComparisonAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleComparativeOperator_in_rule__Comparison__OperatorAssignment_1_110669);
            ruleComparativeOperator();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OperatorAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightExpAssignment_1_2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5324:1: rule__Comparison__RightExpAssignment_1_2 : ( ruleBinary ) ;
    public final void rule__Comparison__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5328:1: ( ( ruleBinary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5329:1: ( ruleBinary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5329:1: ( ruleBinary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5330:1: ruleBinary
            {
             before(grammarAccess.getComparisonAccess().getRightExpBinaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBinary_in_rule__Comparison__RightExpAssignment_1_210700);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightExpBinaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightExpAssignment_1_2"


    // $ANTLR start "rule__Binary__RightExpAssignment_1_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5339:1: rule__Binary__RightExpAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Binary__RightExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5343:1: ( ( rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5344:1: ( rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5344:1: ( rulePrimary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5345:1: rulePrimary
            {
             before(grammarAccess.getBinaryAccess().getRightExpPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Binary__RightExpAssignment_1_110731);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getRightExpPrimaryParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__RightExpAssignment_1_1"


    // $ANTLR start "rule__Primary__FeatureReferenceAssignment_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5354:1: rule__Primary__FeatureReferenceAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Primary__FeatureReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5358:1: ( ( ( ruleQualifiedName ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5359:1: ( ( ruleQualifiedName ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5359:1: ( ( ruleQualifiedName ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5360:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getPrimaryAccess().getFeatureReferenceGroupedCrossReference_0_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5361:1: ( ruleQualifiedName )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5362:1: ruleQualifiedName
            {
             before(grammarAccess.getPrimaryAccess().getFeatureReferenceGroupedQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Primary__FeatureReferenceAssignment_010766);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getFeatureReferenceGroupedQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getFeatureReferenceGroupedCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__FeatureReferenceAssignment_0"


    // $ANTLR start "rule__AttributeConstrain__ConstrainValueAssignment"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5373:1: rule__AttributeConstrain__ConstrainValueAssignment : ( ruleAttribute ) ;
    public final void rule__AttributeConstrain__ConstrainValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5377:1: ( ( ruleAttribute ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5378:1: ( ruleAttribute )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5378:1: ( ruleAttribute )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5379:1: ruleAttribute
            {
             before(grammarAccess.getAttributeConstrainAccess().getConstrainValueAttributeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributeConstrain__ConstrainValueAssignment10801);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeConstrainAccess().getConstrainValueAttributeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstrain__ConstrainValueAssignment"


    // $ANTLR start "rule__Unary__OperatorAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5388:1: rule__Unary__OperatorAssignment_1 : ( ( rule__Unary__OperatorAlternatives_1_0 ) ) ;
    public final void rule__Unary__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5392:1: ( ( ( rule__Unary__OperatorAlternatives_1_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5393:1: ( ( rule__Unary__OperatorAlternatives_1_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5393:1: ( ( rule__Unary__OperatorAlternatives_1_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5394:1: ( rule__Unary__OperatorAlternatives_1_0 )
            {
             before(grammarAccess.getUnaryAccess().getOperatorAlternatives_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5395:1: ( rule__Unary__OperatorAlternatives_1_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5395:2: rule__Unary__OperatorAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Unary__OperatorAlternatives_1_0_in_rule__Unary__OperatorAssignment_110832);
            rule__Unary__OperatorAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAccess().getOperatorAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__OperatorAssignment_1"


    // $ANTLR start "rule__Unary__ExpAssignment_2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5404:1: rule__Unary__ExpAssignment_2 : ( rulePrimary ) ;
    public final void rule__Unary__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5408:1: ( ( rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5409:1: ( rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5409:1: ( rulePrimary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5410:1: rulePrimary
            {
             before(grammarAccess.getUnaryAccess().getExpPrimaryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Unary__ExpAssignment_210865);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getUnaryAccess().getExpPrimaryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary__ExpAssignment_2"


    // $ANTLR start "rule__Range__LowerAssignment_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5419:1: rule__Range__LowerAssignment_0 : ( RULE_INT ) ;
    public final void rule__Range__LowerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5423:1: ( ( RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5424:1: ( RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5424:1: ( RULE_INT )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5425:1: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getLowerINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Range__LowerAssignment_010896); 
             after(grammarAccess.getRangeAccess().getLowerINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__LowerAssignment_0"


    // $ANTLR start "rule__Range__UpperAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5434:1: rule__Range__UpperAssignment_1 : ( RULE_INT ) ;
    public final void rule__Range__UpperAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5438:1: ( ( RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5439:1: ( RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5439:1: ( RULE_INT )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5440:1: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getUpperINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Range__UpperAssignment_110927); 
             after(grammarAccess.getRangeAccess().getUpperINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__UpperAssignment_1"


    // $ANTLR start "rule__CString__ValueAssignment"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5449:1: rule__CString__ValueAssignment : ( ruleEString ) ;
    public final void rule__CString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5453:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5454:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5454:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5455:1: ruleEString
            {
             before(grammarAccess.getCStringAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__CString__ValueAssignment10958);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCStringAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CString__ValueAssignment"


    // $ANTLR start "rule__CBoolean__ValueAssignment"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5464:1: rule__CBoolean__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__CBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5468:1: ( ( RULE_BOOLEAN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5469:1: ( RULE_BOOLEAN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5469:1: ( RULE_BOOLEAN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5470:1: RULE_BOOLEAN
            {
             before(grammarAccess.getCBooleanAccess().getValueBOOLEANTerminalRuleCall_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__CBoolean__ValueAssignment10989); 
             after(grammarAccess.getCBooleanAccess().getValueBOOLEANTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CBoolean__ValueAssignment"


    // $ANTLR start "rule__Number__ValueAssignment"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5479:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5483:1: ( ( RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5484:1: ( RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5484:1: ( RULE_INT )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5485:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__ValueAssignment11020); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment"


    // $ANTLR start "rule__Feature_Impl__NameAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5494:1: rule__Feature_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Feature_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5498:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5499:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5499:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5500:1: ruleEString
            {
             before(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Feature_Impl__NameAssignment_111051);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__NameAssignment_1"


    // $ANTLR start "rule__Feature_Impl__SubfeatureAssignment_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5509:1: rule__Feature_Impl__SubfeatureAssignment_2_1 : ( ruleSolitary ) ;
    public final void rule__Feature_Impl__SubfeatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5513:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5514:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5514:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5515:1: ruleSolitary
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_111082);
            ruleSolitary();

            state._fsp--;

             after(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__SubfeatureAssignment_2_1"


    // $ANTLR start "rule__Feature_Impl__SubfeatureAssignment_2_2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5524:1: rule__Feature_Impl__SubfeatureAssignment_2_2 : ( ruleSolitary ) ;
    public final void rule__Feature_Impl__SubfeatureAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5528:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5529:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5529:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5530:1: ruleSolitary
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_211113);
            ruleSolitary();

            state._fsp--;

             after(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__SubfeatureAssignment_2_2"


    // $ANTLR start "rule__Feature_Impl__ConstrainsAssignment_3_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5539:1: rule__Feature_Impl__ConstrainsAssignment_3_1 : ( ruleConstrain ) ;
    public final void rule__Feature_Impl__ConstrainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5543:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5544:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5544:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5545:1: ruleConstrain
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_111144);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__ConstrainsAssignment_3_1"


    // $ANTLR start "rule__Feature_Impl__ConstrainsAssignment_3_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5554:1: rule__Feature_Impl__ConstrainsAssignment_3_2_1 : ( ruleConstrain ) ;
    public final void rule__Feature_Impl__ConstrainsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5558:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5559:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5559:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5560:1: ruleConstrain
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_2_111175);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__ConstrainsAssignment_3_2_1"


    // $ANTLR start "rule__Grouped__NameAssignment_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5569:1: rule__Grouped__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Grouped__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5573:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5574:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5574:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5575:1: ruleEString
            {
             before(grammarAccess.getGroupedAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Grouped__NameAssignment_011206);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGroupedAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__NameAssignment_0"


    // $ANTLR start "rule__Grouped__AttributeAssignment_1_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5584:1: rule__Grouped__AttributeAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__Grouped__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5588:1: ( ( ruleAttribute ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5589:1: ( ruleAttribute )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5589:1: ( ruleAttribute )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5590:1: ruleAttribute
            {
             before(grammarAccess.getGroupedAccess().getAttributeAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Grouped__AttributeAssignment_1_111237);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getGroupedAccess().getAttributeAttributeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__AttributeAssignment_1_1"


    // $ANTLR start "rule__Grouped__ConstrainsAssignment_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5599:1: rule__Grouped__ConstrainsAssignment_2_1 : ( ruleConstrain ) ;
    public final void rule__Grouped__ConstrainsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5603:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5604:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5604:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5605:1: ruleConstrain
            {
             before(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_2_111268);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__ConstrainsAssignment_2_1"


    // $ANTLR start "rule__Grouped__ConstrainsAssignment_2_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5614:1: rule__Grouped__ConstrainsAssignment_2_2_1 : ( ruleConstrain ) ;
    public final void rule__Grouped__ConstrainsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5618:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5619:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5619:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5620:1: ruleConstrain
            {
             before(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_2_2_111299);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__ConstrainsAssignment_2_2_1"


    // $ANTLR start "rule__Mandatory__NameAssignment_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5629:1: rule__Mandatory__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Mandatory__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5633:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5634:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5634:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5635:1: ruleEString
            {
             before(grammarAccess.getMandatoryAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Mandatory__NameAssignment_011330);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__NameAssignment_0"


    // $ANTLR start "rule__Mandatory__SubfeatureAssignment_1_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5644:1: rule__Mandatory__SubfeatureAssignment_1_1 : ( ruleSolitary ) ;
    public final void rule__Mandatory__SubfeatureAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5648:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5649:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5649:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5650:1: ruleSolitary
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_111361);
            ruleSolitary();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__SubfeatureAssignment_1_1"


    // $ANTLR start "rule__Mandatory__SubfeatureAssignment_1_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5659:1: rule__Mandatory__SubfeatureAssignment_1_2_1 : ( ruleSolitary ) ;
    public final void rule__Mandatory__SubfeatureAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5663:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5664:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5664:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5665:1: ruleSolitary
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_2_111392);
            ruleSolitary();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__SubfeatureAssignment_1_2_1"


    // $ANTLR start "rule__Mandatory__AttributeAssignment_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5674:1: rule__Mandatory__AttributeAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Mandatory__AttributeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5678:1: ( ( ruleAttribute ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5679:1: ( ruleAttribute )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5679:1: ( ruleAttribute )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5680:1: ruleAttribute
            {
             before(grammarAccess.getMandatoryAccess().getAttributeAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Mandatory__AttributeAssignment_2_111423);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getAttributeAttributeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__AttributeAssignment_2_1"


    // $ANTLR start "rule__Mandatory__ConstrainsAssignment_3_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5689:1: rule__Mandatory__ConstrainsAssignment_3_1 : ( ruleConstrain ) ;
    public final void rule__Mandatory__ConstrainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5693:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5694:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5694:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5695:1: ruleConstrain
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_3_111454);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__ConstrainsAssignment_3_1"


    // $ANTLR start "rule__Mandatory__ConstrainsAssignment_3_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5704:1: rule__Mandatory__ConstrainsAssignment_3_2_1 : ( ruleConstrain ) ;
    public final void rule__Mandatory__ConstrainsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5708:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5709:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5709:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5710:1: ruleConstrain
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_3_2_111485);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__ConstrainsAssignment_3_2_1"


    // $ANTLR start "rule__Mandatory__GroupsAssignment_4_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5719:1: rule__Mandatory__GroupsAssignment_4_0 : ( ruleGroup ) ;
    public final void rule__Mandatory__GroupsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5723:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5724:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5724:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5725:1: ruleGroup
            {
             before(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_4_011516);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__GroupsAssignment_4_0"


    // $ANTLR start "rule__Mandatory__GroupsAssignment_4_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5734:1: rule__Mandatory__GroupsAssignment_4_1 : ( ruleGroup ) ;
    public final void rule__Mandatory__GroupsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5738:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5739:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5739:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5740:1: ruleGroup
            {
             before(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_4_111547);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__GroupsAssignment_4_1"


    // $ANTLR start "rule__Optional__NameAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5749:1: rule__Optional__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Optional__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5753:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5754:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5754:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5755:1: ruleEString
            {
             before(grammarAccess.getOptionalAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Optional__NameAssignment_111578);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__NameAssignment_1"


    // $ANTLR start "rule__Optional__SubfeatureAssignment_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5764:1: rule__Optional__SubfeatureAssignment_2_1 : ( ruleSolitary ) ;
    public final void rule__Optional__SubfeatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5768:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5769:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5769:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5770:1: ruleSolitary
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_111609);
            ruleSolitary();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__SubfeatureAssignment_2_1"


    // $ANTLR start "rule__Optional__SubfeatureAssignment_2_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5779:1: rule__Optional__SubfeatureAssignment_2_2_1 : ( ruleSolitary ) ;
    public final void rule__Optional__SubfeatureAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5783:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5784:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5784:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5785:1: ruleSolitary
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_2_111640);
            ruleSolitary();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__SubfeatureAssignment_2_2_1"


    // $ANTLR start "rule__Optional__AttributeAssignment_3_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5794:1: rule__Optional__AttributeAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__Optional__AttributeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5798:1: ( ( ruleAttribute ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5799:1: ( ruleAttribute )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5799:1: ( ruleAttribute )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5800:1: ruleAttribute
            {
             before(grammarAccess.getOptionalAccess().getAttributeAttributeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Optional__AttributeAssignment_3_111671);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getAttributeAttributeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__AttributeAssignment_3_1"


    // $ANTLR start "rule__Optional__ConstrainsAssignment_4_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5809:1: rule__Optional__ConstrainsAssignment_4_1 : ( ruleConstrain ) ;
    public final void rule__Optional__ConstrainsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5813:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5814:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5814:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5815:1: ruleConstrain
            {
             before(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_4_111702);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__ConstrainsAssignment_4_1"


    // $ANTLR start "rule__Optional__ConstrainsAssignment_4_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5824:1: rule__Optional__ConstrainsAssignment_4_2_1 : ( ruleConstrain ) ;
    public final void rule__Optional__ConstrainsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5828:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5829:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5829:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5830:1: ruleConstrain
            {
             before(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_4_2_111733);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__ConstrainsAssignment_4_2_1"


    // $ANTLR start "rule__Optional__GroupsAssignment_5_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5839:1: rule__Optional__GroupsAssignment_5_0 : ( ruleGroup ) ;
    public final void rule__Optional__GroupsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5843:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5844:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5844:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5845:1: ruleGroup
            {
             before(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_5_011764);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__GroupsAssignment_5_0"


    // $ANTLR start "rule__Optional__GroupsAssignment_5_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5854:1: rule__Optional__GroupsAssignment_5_1 : ( ruleGroup ) ;
    public final void rule__Optional__GroupsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5858:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5859:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5859:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5860:1: ruleGroup
            {
             before(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_5_111795);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__GroupsAssignment_5_1"


    // $ANTLR start "rule__Or__NameAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5869:1: rule__Or__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Or__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5873:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5874:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5874:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5875:1: ruleEString
            {
             before(grammarAccess.getOrAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Or__NameAssignment_111826);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__NameAssignment_1"


    // $ANTLR start "rule__Or__GroupedAssignment_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5884:1: rule__Or__GroupedAssignment_2_1 : ( ruleGrouped ) ;
    public final void rule__Or__GroupedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5888:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5889:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5889:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5890:1: ruleGrouped
            {
             before(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_111857);
            ruleGrouped();

            state._fsp--;

             after(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__GroupedAssignment_2_1"


    // $ANTLR start "rule__Or__GroupedAssignment_2_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5899:1: rule__Or__GroupedAssignment_2_2_1 : ( ruleGrouped ) ;
    public final void rule__Or__GroupedAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5903:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5904:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5904:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5905:1: ruleGrouped
            {
             before(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_2_111888);
            ruleGrouped();

            state._fsp--;

             after(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__GroupedAssignment_2_2_1"


    // $ANTLR start "rule__Xor__NameAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5914:1: rule__Xor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Xor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5918:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5919:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5919:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5920:1: ruleEString
            {
             before(grammarAccess.getXorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Xor__NameAssignment_111919);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__NameAssignment_1"


    // $ANTLR start "rule__Xor__GroupedAssignment_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5929:1: rule__Xor__GroupedAssignment_2_1 : ( ruleGrouped ) ;
    public final void rule__Xor__GroupedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5933:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5934:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5934:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5935:1: ruleGrouped
            {
             before(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_111950);
            ruleGrouped();

            state._fsp--;

             after(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__GroupedAssignment_2_1"


    // $ANTLR start "rule__Xor__GroupedAssignment_2_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5944:1: rule__Xor__GroupedAssignment_2_2_1 : ( ruleGrouped ) ;
    public final void rule__Xor__GroupedAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5948:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5949:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5949:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5950:1: ruleGrouped
            {
             before(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_2_111981);
            ruleGrouped();

            state._fsp--;

             after(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xor__GroupedAssignment_2_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_entryRuleSolitary118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolitary125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Solitary__Alternatives_in_ruleSolitary155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_entryRuleConstrain182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstrain189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleConstrain219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0_in_ruleEquality410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_entryRuleBinary501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinary508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group__0_in_ruleBinary538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstrain_in_entryRuleAttributeConstrain629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeConstrain636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeConstrain__ConstrainValueAssignment_in_ruleAttributeConstrain666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__0_in_ruleUnary730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Alternatives_in_ruleGroup858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0_in_ruleRange986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCString_in_entryRuleCString1013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCString1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CString__ValueAssignment_in_ruleCString1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCBoolean_in_entryRuleCBoolean1077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCBoolean1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CBoolean__ValueAssignment_in_ruleCBoolean1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature_Impl1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__0_in_ruleFeature_Impl1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_entryRuleGrouped1333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouped1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__0_in_ruleGrouped1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory1397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional1461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0_in_ruleOptional1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_entryRuleXor1589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXor1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__0_in_ruleXor1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_1_in_ruleDisjunctiveOperator1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_And_in_ruleConjunctiveOperator1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityOperator__Alternatives_in_ruleEqualityOperator1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparativeOperator__Alternatives_in_ruleComparativeOperator1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__Solitary__Alternatives1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__Solitary__Alternatives1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__FeatureReferenceAssignment_0_in_rule__Primary__Alternatives1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_rule__Primary__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__0_in_rule__Primary__Alternatives1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMark_in_rule__Unary__OperatorAlternatives_1_01946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HyphenMinus_in_rule__Unary__OperatorAlternatives_1_01966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__Group__Alternatives2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_rule__Group__Alternatives2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCString_in_rule__Attribute__Alternatives2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Attribute__Alternatives2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__Attribute__Alternatives2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCBoolean_in_rule__Attribute__Alternatives2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__EString__Alternatives2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSignEqualsSign_in_rule__EqualityOperator__Alternatives2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMarkEqualsSign_in_rule__EqualityOperator__Alternatives2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSign_in_rule__ComparativeOperator__Alternatives2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSign_in_rule__ComparativeOperator__Alternatives2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSignEqualsSign_in_rule__ComparativeOperator__Alternatives2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSignEqualsSign_in_rule__ComparativeOperator__Alternatives2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02329 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Model_in_rule__Model__Group__0__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RootAssignment_2_in_rule__Model__Group__2__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__02514 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__02517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Disjunction__Group__0__Impl2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__12573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__0_in_rule__Disjunction__Group__1__Impl2600 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__0__Impl_in_rule__Disjunction__Group_1__02635 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__1_in_rule__Disjunction__Group_1__02638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__1__Impl_in_rule__Disjunction__Group_1__12696 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__2_in_rule__Disjunction__Group_1__12699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__OperatorAssignment_1_1_in_rule__Disjunction__Group_1__1__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__2__Impl_in_rule__Disjunction__Group_1__22756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__RightExpAssignment_1_2_in_rule__Disjunction__Group_1__2__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__02819 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__02822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__Conjunction__Group__0__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__12878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl2905 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__02940 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__02943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__13001 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__13004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__OperatorAssignment_1_1_in_rule__Conjunction__Group_1__1__Impl3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__23061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RightExpAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__03124 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__03127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__13183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl3210 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__03245 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__03248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__13306 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__13309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OperatorAssignment_1_1_in_rule__Equality__Group_1__1__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__23366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightExpAssignment_1_2_in_rule__Equality__Group_1__2__Impl3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__03429 = new BitSet(new long[]{0x0000000000300A00L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__03432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_rule__Comparison__Group__0__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__13488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl3515 = new BitSet(new long[]{0x0000000000300A02L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__03550 = new BitSet(new long[]{0x0000000000300A00L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__03553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__13611 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__13614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OperatorAssignment_1_1_in_rule__Comparison__Group_1__1__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__23671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightExpAssignment_1_2_in_rule__Comparison__Group_1__2__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group__0__Impl_in_rule__Binary__Group__03734 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Binary__Group__1_in_rule__Binary__Group__03737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Binary__Group__0__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group__1__Impl_in_rule__Binary__Group__13793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__0_in_rule__Binary__Group__1__Impl3820 = new BitSet(new long[]{0x000000008004C002L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__0__Impl_in_rule__Binary__Group_1__03855 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__1_in_rule__Binary__Group_1__03858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__1__Impl_in_rule__Binary__Group_1__13916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__RightExpAssignment_1_1_in_rule__Binary__Group_1__1__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__03977 = new BitSet(new long[]{0x0000000198000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__03980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rule__Primary__Group_1__0__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__14039 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__14042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstrain_in_rule__Primary__Group_1__1__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__24098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightParenthesis_in_rule__Primary__Group_1__2__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__0__Impl_in_rule__Primary__Group_3__04163 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__1_in_rule__Primary__Group_3__04166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rule__Primary__Group_3__0__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__1__Impl_in_rule__Primary__Group_3__14225 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__2_in_rule__Primary__Group_3__14228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Primary__Group_3__1__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__2__Impl_in_rule__Primary__Group_3__24284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightParenthesis_in_rule__Primary__Group_3__2__Impl4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__04349 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__04352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__14410 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Unary__Group__2_in_rule__Unary__Group__14413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__OperatorAssignment_1_in_rule__Unary__Group__1__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__2__Impl_in_rule__Unary__Group__24470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__ExpAssignment_2_in_rule__Unary__Group__2__Impl4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04533 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4619 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04654 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_rule__QualifiedName__Group_1__0__Impl4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__04776 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Range__Group__1_in_rule__Range__Group__04779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__LowerAssignment_0_in_rule__Range__Group__0__Impl4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__14836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__UpperAssignment_1_in_rule__Range__Group__1__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__0__Impl_in_rule__Feature_Impl__Group__04897 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__1_in_rule__Feature_Impl__Group__04900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Feature_in_rule__Feature_Impl__Group__0__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__1__Impl_in_rule__Feature_Impl__Group__14959 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__2_in_rule__Feature_Impl__Group__14962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__NameAssignment_1_in_rule__Feature_Impl__Group__1__Impl4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__2__Impl_in_rule__Feature_Impl__Group__25019 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__3_in_rule__Feature_Impl__Group__25022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__0_in_rule__Feature_Impl__Group__2__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__3__Impl_in_rule__Feature_Impl__Group__35080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__0_in_rule__Feature_Impl__Group__3__Impl5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__0__Impl_in_rule__Feature_Impl__Group_2__05146 = new BitSet(new long[]{0x0000000088400000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__1_in_rule__Feature_Impl__Group_2__05149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Feature_Impl__Group_2__0__Impl5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__1__Impl_in_rule__Feature_Impl__Group_2__15205 = new BitSet(new long[]{0x00000000C8400000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__2_in_rule__Feature_Impl__Group_2__15208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_1_in_rule__Feature_Impl__Group_2__1__Impl5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__2__Impl_in_rule__Feature_Impl__Group_2__25265 = new BitSet(new long[]{0x00000000C8400000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__3_in_rule__Feature_Impl__Group_2__25268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_2_in_rule__Feature_Impl__Group_2__2__Impl5295 = new BitSet(new long[]{0x0000000088400002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__3__Impl_in_rule__Feature_Impl__Group_2__35326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Feature_Impl__Group_2__3__Impl5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__0__Impl_in_rule__Feature_Impl__Group_3__05390 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__1_in_rule__Feature_Impl__Group_3__05393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Feature_Impl__Group_3__0__Impl5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__1__Impl_in_rule__Feature_Impl__Group_3__15452 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__2_in_rule__Feature_Impl__Group_3__15455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_1_in_rule__Feature_Impl__Group_3__1__Impl5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__2__Impl_in_rule__Feature_Impl__Group_3__25512 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__3_in_rule__Feature_Impl__Group_3__25515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__0_in_rule__Feature_Impl__Group_3__2__Impl5542 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__3__Impl_in_rule__Feature_Impl__Group_3__35573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Feature_Impl__Group_3__3__Impl5601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__0__Impl_in_rule__Feature_Impl__Group_3_2__05640 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__1_in_rule__Feature_Impl__Group_3_2__05643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Feature_Impl__Group_3_2__0__Impl5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__1__Impl_in_rule__Feature_Impl__Group_3_2__15702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_2_1_in_rule__Feature_Impl__Group_3_2__1__Impl5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__0__Impl_in_rule__Grouped__Group__05763 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_rule__Grouped__Group__1_in_rule__Grouped__Group__05766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__NameAssignment_0_in_rule__Grouped__Group__0__Impl5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__1__Impl_in_rule__Grouped__Group__15823 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_rule__Grouped__Group__2_in_rule__Grouped__Group__15826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__0_in_rule__Grouped__Group__1__Impl5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__2__Impl_in_rule__Grouped__Group__25884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__0_in_rule__Grouped__Group__2__Impl5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__0__Impl_in_rule__Grouped__Group_1__05948 = new BitSet(new long[]{0x0000000198000000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__1_in_rule__Grouped__Group_1__05951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rule__Grouped__Group_1__0__Impl5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__1__Impl_in_rule__Grouped__Group_1__16010 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__2_in_rule__Grouped__Group_1__16013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__AttributeAssignment_1_1_in_rule__Grouped__Group_1__1__Impl6040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__2__Impl_in_rule__Grouped__Group_1__26070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightParenthesis_in_rule__Grouped__Group_1__2__Impl6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__0__Impl_in_rule__Grouped__Group_2__06135 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__1_in_rule__Grouped__Group_2__06138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Grouped__Group_2__0__Impl6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__1__Impl_in_rule__Grouped__Group_2__16197 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__2_in_rule__Grouped__Group_2__16200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__ConstrainsAssignment_2_1_in_rule__Grouped__Group_2__1__Impl6227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__2__Impl_in_rule__Grouped__Group_2__26257 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__3_in_rule__Grouped__Group_2__26260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2_2__0_in_rule__Grouped__Group_2__2__Impl6287 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__3__Impl_in_rule__Grouped__Group_2__36318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Grouped__Group_2__3__Impl6346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2_2__0__Impl_in_rule__Grouped__Group_2_2__06385 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2_2__1_in_rule__Grouped__Group_2_2__06388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Grouped__Group_2_2__0__Impl6416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2_2__1__Impl_in_rule__Grouped__Group_2_2__16447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__ConstrainsAssignment_2_2_1_in_rule__Grouped__Group_2_2__1__Impl6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__06508 = new BitSet(new long[]{0x0000000002809040L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__06511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__NameAssignment_0_in_rule__Mandatory__Group__0__Impl6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__16568 = new BitSet(new long[]{0x0000000002809040L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__2_in_rule__Mandatory__Group__16571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__0_in_rule__Mandatory__Group__1__Impl6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__2__Impl_in_rule__Mandatory__Group__26629 = new BitSet(new long[]{0x0000000002809040L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__3_in_rule__Mandatory__Group__26632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__0_in_rule__Mandatory__Group__2__Impl6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__3__Impl_in_rule__Mandatory__Group__36690 = new BitSet(new long[]{0x0000000002809040L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__4_in_rule__Mandatory__Group__36693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__0_in_rule__Mandatory__Group__3__Impl6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__4__Impl_in_rule__Mandatory__Group__46751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_4__0_in_rule__Mandatory__Group__4__Impl6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__0__Impl_in_rule__Mandatory__Group_1__06819 = new BitSet(new long[]{0x0000000088400000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__1_in_rule__Mandatory__Group_1__06822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__Mandatory__Group_1__0__Impl6850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__1__Impl_in_rule__Mandatory__Group_1__16881 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__2_in_rule__Mandatory__Group_1__16884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__SubfeatureAssignment_1_1_in_rule__Mandatory__Group_1__1__Impl6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__2__Impl_in_rule__Mandatory__Group_1__26941 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__3_in_rule__Mandatory__Group_1__26944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__0_in_rule__Mandatory__Group_1__2__Impl6971 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__3__Impl_in_rule__Mandatory__Group_1__37002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__Mandatory__Group_1__3__Impl7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__0__Impl_in_rule__Mandatory__Group_1_2__07069 = new BitSet(new long[]{0x0000000088400000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__1_in_rule__Mandatory__Group_1_2__07072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Mandatory__Group_1_2__0__Impl7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__1__Impl_in_rule__Mandatory__Group_1_2__17131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__SubfeatureAssignment_1_2_1_in_rule__Mandatory__Group_1_2__1__Impl7158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__0__Impl_in_rule__Mandatory__Group_2__07192 = new BitSet(new long[]{0x0000000198000000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__1_in_rule__Mandatory__Group_2__07195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rule__Mandatory__Group_2__0__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__1__Impl_in_rule__Mandatory__Group_2__17254 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__2_in_rule__Mandatory__Group_2__17257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__AttributeAssignment_2_1_in_rule__Mandatory__Group_2__1__Impl7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__2__Impl_in_rule__Mandatory__Group_2__27314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightParenthesis_in_rule__Mandatory__Group_2__2__Impl7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__0__Impl_in_rule__Mandatory__Group_3__07379 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__1_in_rule__Mandatory__Group_3__07382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Mandatory__Group_3__0__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__1__Impl_in_rule__Mandatory__Group_3__17441 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__2_in_rule__Mandatory__Group_3__17444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__ConstrainsAssignment_3_1_in_rule__Mandatory__Group_3__1__Impl7471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__2__Impl_in_rule__Mandatory__Group_3__27501 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__3_in_rule__Mandatory__Group_3__27504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3_2__0_in_rule__Mandatory__Group_3__2__Impl7531 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__3__Impl_in_rule__Mandatory__Group_3__37562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Mandatory__Group_3__3__Impl7590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3_2__0__Impl_in_rule__Mandatory__Group_3_2__07629 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3_2__1_in_rule__Mandatory__Group_3_2__07632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Mandatory__Group_3_2__0__Impl7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3_2__1__Impl_in_rule__Mandatory__Group_3_2__17691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__ConstrainsAssignment_3_2_1_in_rule__Mandatory__Group_3_2__1__Impl7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_4__0__Impl_in_rule__Mandatory__Group_4__07752 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_4__1_in_rule__Mandatory__Group_4__07755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__GroupsAssignment_4_0_in_rule__Mandatory__Group_4__0__Impl7782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_4__1__Impl_in_rule__Mandatory__Group_4__17812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__GroupsAssignment_4_1_in_rule__Mandatory__Group_4__1__Impl7839 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__07874 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__07877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuestionMark_in_rule__Optional__Group__0__Impl7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__17936 = new BitSet(new long[]{0x0000000002809040L});
    public static final BitSet FOLLOW_rule__Optional__Group__2_in_rule__Optional__Group__17939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__NameAssignment_1_in_rule__Optional__Group__1__Impl7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__2__Impl_in_rule__Optional__Group__27996 = new BitSet(new long[]{0x0000000002809040L});
    public static final BitSet FOLLOW_rule__Optional__Group__3_in_rule__Optional__Group__27999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__0_in_rule__Optional__Group__2__Impl8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__3__Impl_in_rule__Optional__Group__38057 = new BitSet(new long[]{0x0000000002809040L});
    public static final BitSet FOLLOW_rule__Optional__Group__4_in_rule__Optional__Group__38060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__0_in_rule__Optional__Group__3__Impl8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__4__Impl_in_rule__Optional__Group__48118 = new BitSet(new long[]{0x0000000002809040L});
    public static final BitSet FOLLOW_rule__Optional__Group__5_in_rule__Optional__Group__48121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__0_in_rule__Optional__Group__4__Impl8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__5__Impl_in_rule__Optional__Group__58179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_5__0_in_rule__Optional__Group__5__Impl8206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__0__Impl_in_rule__Optional__Group_2__08249 = new BitSet(new long[]{0x0000000088400000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__1_in_rule__Optional__Group_2__08252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__Optional__Group_2__0__Impl8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__1__Impl_in_rule__Optional__Group_2__18311 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__2_in_rule__Optional__Group_2__18314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__SubfeatureAssignment_2_1_in_rule__Optional__Group_2__1__Impl8341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__2__Impl_in_rule__Optional__Group_2__28371 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__3_in_rule__Optional__Group_2__28374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__0_in_rule__Optional__Group_2__2__Impl8401 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__3__Impl_in_rule__Optional__Group_2__38432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__Optional__Group_2__3__Impl8460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__0__Impl_in_rule__Optional__Group_2_2__08499 = new BitSet(new long[]{0x0000000088400000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__1_in_rule__Optional__Group_2_2__08502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Optional__Group_2_2__0__Impl8530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__1__Impl_in_rule__Optional__Group_2_2__18561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__SubfeatureAssignment_2_2_1_in_rule__Optional__Group_2_2__1__Impl8588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__0__Impl_in_rule__Optional__Group_3__08622 = new BitSet(new long[]{0x0000000198000000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__1_in_rule__Optional__Group_3__08625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rule__Optional__Group_3__0__Impl8653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__1__Impl_in_rule__Optional__Group_3__18684 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__2_in_rule__Optional__Group_3__18687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__AttributeAssignment_3_1_in_rule__Optional__Group_3__1__Impl8714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__2__Impl_in_rule__Optional__Group_3__28744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightParenthesis_in_rule__Optional__Group_3__2__Impl8772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__0__Impl_in_rule__Optional__Group_4__08809 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__1_in_rule__Optional__Group_4__08812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Optional__Group_4__0__Impl8840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__1__Impl_in_rule__Optional__Group_4__18871 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__2_in_rule__Optional__Group_4__18874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ConstrainsAssignment_4_1_in_rule__Optional__Group_4__1__Impl8901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__2__Impl_in_rule__Optional__Group_4__28931 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__3_in_rule__Optional__Group_4__28934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4_2__0_in_rule__Optional__Group_4__2__Impl8961 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__3__Impl_in_rule__Optional__Group_4__38992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Optional__Group_4__3__Impl9020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4_2__0__Impl_in_rule__Optional__Group_4_2__09059 = new BitSet(new long[]{0x000000008004C000L});
    public static final BitSet FOLLOW_rule__Optional__Group_4_2__1_in_rule__Optional__Group_4_2__09062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Optional__Group_4_2__0__Impl9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4_2__1__Impl_in_rule__Optional__Group_4_2__19121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ConstrainsAssignment_4_2_1_in_rule__Optional__Group_4_2__1__Impl9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_5__0__Impl_in_rule__Optional__Group_5__09182 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_rule__Optional__Group_5__1_in_rule__Optional__Group_5__09185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__GroupsAssignment_5_0_in_rule__Optional__Group_5__0__Impl9212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_5__1__Impl_in_rule__Optional__Group_5__19242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__GroupsAssignment_5_1_in_rule__Optional__Group_5__1__Impl9269 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__09304 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__09307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_rule__Or__Group__0__Impl9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__19366 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Or__Group__2_in_rule__Or__Group__19369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__NameAssignment_1_in_rule__Or__Group__1__Impl9396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__29426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__0_in_rule__Or__Group__2__Impl9453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__0__Impl_in_rule__Or__Group_2__09490 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Or__Group_2__1_in_rule__Or__Group_2__09493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Or__Group_2__0__Impl9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__1__Impl_in_rule__Or__Group_2__19549 = new BitSet(new long[]{0x00000000C8020000L});
    public static final BitSet FOLLOW_rule__Or__Group_2__2_in_rule__Or__Group_2__19552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__GroupedAssignment_2_1_in_rule__Or__Group_2__1__Impl9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__2__Impl_in_rule__Or__Group_2__29609 = new BitSet(new long[]{0x00000000C8020000L});
    public static final BitSet FOLLOW_rule__Or__Group_2__3_in_rule__Or__Group_2__29612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__0_in_rule__Or__Group_2__2__Impl9639 = new BitSet(new long[]{0x0000000088020002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__3__Impl_in_rule__Or__Group_2__39670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Or__Group_2__3__Impl9697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__0__Impl_in_rule__Or__Group_2_2__09734 = new BitSet(new long[]{0x0000000088020000L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__1_in_rule__Or__Group_2_2__09737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Or__Group_2_2__0__Impl9766 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__1__Impl_in_rule__Or__Group_2_2__19799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__GroupedAssignment_2_2_1_in_rule__Or__Group_2_2__1__Impl9826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__0__Impl_in_rule__Xor__Group__09860 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Xor__Group__1_in_rule__Xor__Group__09863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_rule__Xor__Group__0__Impl9891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__1__Impl_in_rule__Xor__Group__19922 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Xor__Group__2_in_rule__Xor__Group__19925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__NameAssignment_1_in_rule__Xor__Group__1__Impl9952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__2__Impl_in_rule__Xor__Group__29982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__0_in_rule__Xor__Group__2__Impl10009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__0__Impl_in_rule__Xor__Group_2__010046 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__1_in_rule__Xor__Group_2__010049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Xor__Group_2__0__Impl10076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__1__Impl_in_rule__Xor__Group_2__110105 = new BitSet(new long[]{0x00000000C8020000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__2_in_rule__Xor__Group_2__110108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__GroupedAssignment_2_1_in_rule__Xor__Group_2__1__Impl10135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__2__Impl_in_rule__Xor__Group_2__210165 = new BitSet(new long[]{0x00000000C8020000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__3_in_rule__Xor__Group_2__210168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__0_in_rule__Xor__Group_2__2__Impl10195 = new BitSet(new long[]{0x0000000088020002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__3__Impl_in_rule__Xor__Group_2__310226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Xor__Group_2__3__Impl10253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__0__Impl_in_rule__Xor__Group_2_2__010290 = new BitSet(new long[]{0x0000000088020000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__1_in_rule__Xor__Group_2_2__010293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Xor__Group_2_2__0__Impl10322 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__1__Impl_in_rule__Xor__Group_2_2__110355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__GroupedAssignment_2_2_1_in_rule__Xor__Group_2_2__1__Impl10382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Model__NameAssignment_110421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_rule__Model__RootAssignment_210452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunctiveOperator_in_rule__Disjunction__OperatorAssignment_1_110483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Disjunction__RightExpAssignment_1_210514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunctiveOperator_in_rule__Conjunction__OperatorAssignment_1_110545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__Conjunction__RightExpAssignment_1_210576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_rule__Equality__OperatorAssignment_1_110607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__RightExpAssignment_1_210638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparativeOperator_in_rule__Comparison__OperatorAssignment_1_110669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_rule__Comparison__RightExpAssignment_1_210700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Binary__RightExpAssignment_1_110731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Primary__FeatureReferenceAssignment_010766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributeConstrain__ConstrainValueAssignment10801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__OperatorAlternatives_1_0_in_rule__Unary__OperatorAssignment_110832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Unary__ExpAssignment_210865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Range__LowerAssignment_010896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Range__UpperAssignment_110927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__CString__ValueAssignment10958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__CBoolean__ValueAssignment10989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__ValueAssignment11020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Feature_Impl__NameAssignment_111051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_111082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_211113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_111144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_2_111175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Grouped__NameAssignment_011206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Grouped__AttributeAssignment_1_111237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_2_111268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_2_2_111299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Mandatory__NameAssignment_011330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_111361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_2_111392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Mandatory__AttributeAssignment_2_111423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_3_111454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_3_2_111485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_4_011516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_4_111547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Optional__NameAssignment_111578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_111609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_2_111640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Optional__AttributeAssignment_3_111671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_4_111702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_4_2_111733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_5_011764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_5_111795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Or__NameAssignment_111826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_111857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_2_111888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Xor__NameAssignment_111919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_111950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_2_111981 = new BitSet(new long[]{0x0000000000000002L});

}