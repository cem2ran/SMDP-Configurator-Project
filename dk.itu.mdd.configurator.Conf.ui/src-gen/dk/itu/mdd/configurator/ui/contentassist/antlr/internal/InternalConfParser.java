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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Feature", "Xor", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "Or", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Comma", "HyphenMinus", "FullStop", "LessThanSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_NULL", "RULE_BOOLEAN", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=29;
    public static final int Or=11;
    public static final int RULE_BEGIN=28;
    public static final int VerticalLineVerticalLine=12;
    public static final int RULE_BOOLEAN=27;
    public static final int RULE_STRING=32;
    public static final int RULE_NULL=26;
    public static final int Feature=4;
    public static final int LessThanSign=19;
    public static final int RULE_SL_COMMENT=34;
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
    public static final int RULE_ID=30;
    public static final int RULE_WS=35;
    public static final int RightParenthesis=15;
    public static final int LeftCurlyBracket=24;
    public static final int RULE_ANY_OTHER=36;
    public static final int GreaterThanSignEqualsSign=10;
    public static final int EqualsSignEqualsSign=9;
    public static final int QuestionMark=21;
    public static final int RULE_INT=31;
    public static final int RULE_ML_COMMENT=33;
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
    		tokenNameToValue.put("AmpersandAmpersand", "'&&'");
    		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
    		tokenNameToValue.put("EqualsSignEqualsSign", "'=='");
    		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
    		tokenNameToValue.put("Or", "'Or'");
    		tokenNameToValue.put("VerticalLineVerticalLine", "'||'");
    		tokenNameToValue.put("Xor", "'Xor'");
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:85:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:86:1: ( ruleModel EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:87:1: ruleModel EOF
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:94:1: ruleModel : ( ( rule__Model__RootAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:98:5: ( ( ( rule__Model__RootAssignment ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:99:1: ( ( rule__Model__RootAssignment ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:99:1: ( ( rule__Model__RootAssignment ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:100:1: ( rule__Model__RootAssignment )
            {
             before(grammarAccess.getModelAccess().getRootAssignment()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:101:1: ( rule__Model__RootAssignment )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:101:2: rule__Model__RootAssignment
            {
            pushFollow(FOLLOW_rule__Model__RootAssignment_in_ruleModel91);
            rule__Model__RootAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRootAssignment()); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:115:1: entryRuleSolitary : ruleSolitary EOF ;
    public final void entryRuleSolitary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:116:1: ( ruleSolitary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:117:1: ruleSolitary EOF
            {
             before(grammarAccess.getSolitaryRule()); 
            pushFollow(FOLLOW_ruleSolitary_in_entryRuleSolitary120);
            ruleSolitary();

            state._fsp--;

             after(grammarAccess.getSolitaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSolitary127); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:124:1: ruleSolitary : ( ( rule__Solitary__Alternatives ) ) ;
    public final void ruleSolitary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:128:5: ( ( ( rule__Solitary__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:129:1: ( ( rule__Solitary__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:129:1: ( ( rule__Solitary__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:130:1: ( rule__Solitary__Alternatives )
            {
             before(grammarAccess.getSolitaryAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:131:1: ( rule__Solitary__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:131:2: rule__Solitary__Alternatives
            {
            pushFollow(FOLLOW_rule__Solitary__Alternatives_in_ruleSolitary157);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:143:1: entryRuleConstrain : ruleConstrain EOF ;
    public final void entryRuleConstrain() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:144:1: ( ruleConstrain EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:145:1: ruleConstrain EOF
            {
             before(grammarAccess.getConstrainRule()); 
            pushFollow(FOLLOW_ruleConstrain_in_entryRuleConstrain184);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getConstrainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstrain191); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:152:1: ruleConstrain : ( ( rule__Constrain__Group__0 ) ) ;
    public final void ruleConstrain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:156:5: ( ( ( rule__Constrain__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:157:1: ( ( rule__Constrain__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:157:1: ( ( rule__Constrain__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:158:1: ( rule__Constrain__Group__0 )
            {
             before(grammarAccess.getConstrainAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:159:1: ( rule__Constrain__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:159:2: rule__Constrain__Group__0
            {
            pushFollow(FOLLOW_rule__Constrain__Group__0_in_ruleConstrain221);
            rule__Constrain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstrainAccess().getGroup()); 

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


    // $ANTLR start "entryRuleConjunction"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:171:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:172:1: ( ruleConjunction EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:173:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction248);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction255); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:180:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:184:5: ( ( ( rule__Conjunction__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:185:1: ( ( rule__Conjunction__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:185:1: ( ( rule__Conjunction__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:186:1: ( rule__Conjunction__Group__0 )
            {
             before(grammarAccess.getConjunctionAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:187:1: ( rule__Conjunction__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:187:2: rule__Conjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction285);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:199:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:200:1: ( ruleEquality EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:201:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality312);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality319); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:208:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:212:5: ( ( ( rule__Equality__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:213:1: ( ( rule__Equality__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:213:1: ( ( rule__Equality__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:214:1: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:215:1: ( rule__Equality__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:215:2: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_rule__Equality__Group__0_in_ruleEquality349);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:227:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:228:1: ( ruleComparison EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:229:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison376);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison383); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:236:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:240:5: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:241:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:241:1: ( ( rule__Comparison__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:242:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:243:1: ( rule__Comparison__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:243:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison413);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:255:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:256:1: ( ruleBinary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:257:1: ruleBinary EOF
            {
             before(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_ruleBinary_in_entryRuleBinary440);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getBinaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinary447); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:264:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:268:5: ( ( ( rule__Binary__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:269:1: ( ( rule__Binary__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:269:1: ( ( rule__Binary__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:270:1: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:271:1: ( rule__Binary__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:271:2: rule__Binary__Group__0
            {
            pushFollow(FOLLOW_rule__Binary__Group__0_in_ruleBinary477);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:283:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:284:1: ( rulePrimary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:285:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary504);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary511); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:292:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:296:5: ( ( ( rule__Primary__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:297:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:297:1: ( ( rule__Primary__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:298:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:299:1: ( rule__Primary__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:299:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary541);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:311:1: entryRuleAttributeConstrain : ruleAttributeConstrain EOF ;
    public final void entryRuleAttributeConstrain() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:312:1: ( ruleAttributeConstrain EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:313:1: ruleAttributeConstrain EOF
            {
             before(grammarAccess.getAttributeConstrainRule()); 
            pushFollow(FOLLOW_ruleAttributeConstrain_in_entryRuleAttributeConstrain568);
            ruleAttributeConstrain();

            state._fsp--;

             after(grammarAccess.getAttributeConstrainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeConstrain575); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:320:1: ruleAttributeConstrain : ( ( rule__AttributeConstrain__ConstrainValueAssignment ) ) ;
    public final void ruleAttributeConstrain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:324:5: ( ( ( rule__AttributeConstrain__ConstrainValueAssignment ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:325:1: ( ( rule__AttributeConstrain__ConstrainValueAssignment ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:325:1: ( ( rule__AttributeConstrain__ConstrainValueAssignment ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:326:1: ( rule__AttributeConstrain__ConstrainValueAssignment )
            {
             before(grammarAccess.getAttributeConstrainAccess().getConstrainValueAssignment()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:327:1: ( rule__AttributeConstrain__ConstrainValueAssignment )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:327:2: rule__AttributeConstrain__ConstrainValueAssignment
            {
            pushFollow(FOLLOW_rule__AttributeConstrain__ConstrainValueAssignment_in_ruleAttributeConstrain605);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:339:1: entryRuleUnary : ruleUnary EOF ;
    public final void entryRuleUnary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:340:1: ( ruleUnary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:341:1: ruleUnary EOF
            {
             before(grammarAccess.getUnaryRule()); 
            pushFollow(FOLLOW_ruleUnary_in_entryRuleUnary632);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getUnaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary639); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:348:1: ruleUnary : ( ( rule__Unary__Group__0 ) ) ;
    public final void ruleUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:352:5: ( ( ( rule__Unary__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:353:1: ( ( rule__Unary__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:353:1: ( ( rule__Unary__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:354:1: ( rule__Unary__Group__0 )
            {
             before(grammarAccess.getUnaryAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:355:1: ( rule__Unary__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:355:2: rule__Unary__Group__0
            {
            pushFollow(FOLLOW_rule__Unary__Group__0_in_ruleUnary669);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:367:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:368:1: ( ruleQualifiedName EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:369:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName696);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName703); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:376:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:380:5: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:381:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:381:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:382:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:383:1: ( rule__QualifiedName__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:383:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName733);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:395:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:396:1: ( ruleGroup EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:397:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup760);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup767); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:404:1: ruleGroup : ( ( rule__Group__Alternatives ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:408:5: ( ( ( rule__Group__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:409:1: ( ( rule__Group__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:409:1: ( ( rule__Group__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:410:1: ( rule__Group__Alternatives )
            {
             before(grammarAccess.getGroupAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:411:1: ( rule__Group__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:411:2: rule__Group__Alternatives
            {
            pushFollow(FOLLOW_rule__Group__Alternatives_in_ruleGroup797);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:423:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:424:1: ( ruleAttribute EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:425:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute824);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute831); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:432:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:436:5: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:437:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:437:1: ( ( rule__Attribute__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:438:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:439:1: ( rule__Attribute__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:439:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute861);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:451:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:452:1: ( ruleRange EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:453:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange888);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange895); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:460:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:464:5: ( ( ( rule__Range__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:465:1: ( ( rule__Range__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:465:1: ( ( rule__Range__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:466:1: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:467:1: ( rule__Range__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:467:2: rule__Range__Group__0
            {
            pushFollow(FOLLOW_rule__Range__Group__0_in_ruleRange925);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:479:1: entryRuleCString : ruleCString EOF ;
    public final void entryRuleCString() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:480:1: ( ruleCString EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:481:1: ruleCString EOF
            {
             before(grammarAccess.getCStringRule()); 
            pushFollow(FOLLOW_ruleCString_in_entryRuleCString952);
            ruleCString();

            state._fsp--;

             after(grammarAccess.getCStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCString959); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:488:1: ruleCString : ( ( rule__CString__ValueAssignment ) ) ;
    public final void ruleCString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:492:5: ( ( ( rule__CString__ValueAssignment ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:493:1: ( ( rule__CString__ValueAssignment ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:493:1: ( ( rule__CString__ValueAssignment ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:494:1: ( rule__CString__ValueAssignment )
            {
             before(grammarAccess.getCStringAccess().getValueAssignment()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:495:1: ( rule__CString__ValueAssignment )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:495:2: rule__CString__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CString__ValueAssignment_in_ruleCString989);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:507:1: entryRuleCBoolean : ruleCBoolean EOF ;
    public final void entryRuleCBoolean() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:508:1: ( ruleCBoolean EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:509:1: ruleCBoolean EOF
            {
             before(grammarAccess.getCBooleanRule()); 
            pushFollow(FOLLOW_ruleCBoolean_in_entryRuleCBoolean1016);
            ruleCBoolean();

            state._fsp--;

             after(grammarAccess.getCBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCBoolean1023); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:516:1: ruleCBoolean : ( ( rule__CBoolean__ValueAssignment ) ) ;
    public final void ruleCBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:520:5: ( ( ( rule__CBoolean__ValueAssignment ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:521:1: ( ( rule__CBoolean__ValueAssignment ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:521:1: ( ( rule__CBoolean__ValueAssignment ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:522:1: ( rule__CBoolean__ValueAssignment )
            {
             before(grammarAccess.getCBooleanAccess().getValueAssignment()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:523:1: ( rule__CBoolean__ValueAssignment )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:523:2: rule__CBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CBoolean__ValueAssignment_in_ruleCBoolean1053);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:535:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:536:1: ( ruleNumber EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:537:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1080);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1087); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:544:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:548:5: ( ( ( rule__Number__ValueAssignment ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:549:1: ( ( rule__Number__ValueAssignment ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:549:1: ( ( rule__Number__ValueAssignment ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:550:1: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:551:1: ( rule__Number__ValueAssignment )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:551:2: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1117);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:563:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:564:1: ( ruleEString EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:565:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1144);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1151); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:572:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:576:5: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:577:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:577:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:578:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:579:1: ( rule__EString__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:579:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString1181);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:591:1: entryRuleFeature_Impl : ruleFeature_Impl EOF ;
    public final void entryRuleFeature_Impl() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:592:1: ( ruleFeature_Impl EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:593:1: ruleFeature_Impl EOF
            {
             before(grammarAccess.getFeature_ImplRule()); 
            pushFollow(FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl1208);
            ruleFeature_Impl();

            state._fsp--;

             after(grammarAccess.getFeature_ImplRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature_Impl1215); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:600:1: ruleFeature_Impl : ( ( rule__Feature_Impl__Group__0 ) ) ;
    public final void ruleFeature_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:604:5: ( ( ( rule__Feature_Impl__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:605:1: ( ( rule__Feature_Impl__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:605:1: ( ( rule__Feature_Impl__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:606:1: ( rule__Feature_Impl__Group__0 )
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:607:1: ( rule__Feature_Impl__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:607:2: rule__Feature_Impl__Group__0
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__0_in_ruleFeature_Impl1245);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:619:1: entryRuleGrouped : ruleGrouped EOF ;
    public final void entryRuleGrouped() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:620:1: ( ruleGrouped EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:621:1: ruleGrouped EOF
            {
             before(grammarAccess.getGroupedRule()); 
            pushFollow(FOLLOW_ruleGrouped_in_entryRuleGrouped1272);
            ruleGrouped();

            state._fsp--;

             after(grammarAccess.getGroupedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouped1279); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:628:1: ruleGrouped : ( ( rule__Grouped__Group__0 ) ) ;
    public final void ruleGrouped() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:632:5: ( ( ( rule__Grouped__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:633:1: ( ( rule__Grouped__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:633:1: ( ( rule__Grouped__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:634:1: ( rule__Grouped__Group__0 )
            {
             before(grammarAccess.getGroupedAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:635:1: ( rule__Grouped__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:635:2: rule__Grouped__Group__0
            {
            pushFollow(FOLLOW_rule__Grouped__Group__0_in_ruleGrouped1309);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:647:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:648:1: ( ruleMandatory EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:649:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory1336);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory1343); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:656:1: ruleMandatory : ( ( rule__Mandatory__Group__0 ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:660:5: ( ( ( rule__Mandatory__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:661:1: ( ( rule__Mandatory__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:661:1: ( ( rule__Mandatory__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:662:1: ( rule__Mandatory__Group__0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:663:1: ( rule__Mandatory__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:663:2: rule__Mandatory__Group__0
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory1373);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:675:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:676:1: ( ruleOptional EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:677:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional1400);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional1407); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:684:1: ruleOptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:688:5: ( ( ( rule__Optional__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:689:1: ( ( rule__Optional__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:689:1: ( ( rule__Optional__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:690:1: ( rule__Optional__Group__0 )
            {
             before(grammarAccess.getOptionalAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:691:1: ( rule__Optional__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:691:2: rule__Optional__Group__0
            {
            pushFollow(FOLLOW_rule__Optional__Group__0_in_ruleOptional1437);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:703:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:704:1: ( ruleOr EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:705:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1464);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1471); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:712:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:716:5: ( ( ( rule__Or__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:717:1: ( ( rule__Or__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:717:1: ( ( rule__Or__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:718:1: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:719:1: ( rule__Or__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:719:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr1501);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:731:1: entryRuleXor : ruleXor EOF ;
    public final void entryRuleXor() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:732:1: ( ruleXor EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:733:1: ruleXor EOF
            {
             before(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_ruleXor_in_entryRuleXor1528);
            ruleXor();

            state._fsp--;

             after(grammarAccess.getXorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXor1535); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:740:1: ruleXor : ( ( rule__Xor__Group__0 ) ) ;
    public final void ruleXor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:744:5: ( ( ( rule__Xor__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:745:1: ( ( rule__Xor__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:745:1: ( ( rule__Xor__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:746:1: ( rule__Xor__Group__0 )
            {
             before(grammarAccess.getXorAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:747:1: ( rule__Xor__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:747:2: rule__Xor__Group__0
            {
            pushFollow(FOLLOW_rule__Xor__Group__0_in_ruleXor1565);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:760:1: ruleDisjunctiveOperator : ( ( VerticalLineVerticalLine ) ) ;
    public final void ruleDisjunctiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:764:1: ( ( ( VerticalLineVerticalLine ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:765:1: ( ( VerticalLineVerticalLine ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:765:1: ( ( VerticalLineVerticalLine ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:766:1: ( VerticalLineVerticalLine )
            {
             before(grammarAccess.getDisjunctiveOperatorAccess().getDisjunctionEnumLiteralDeclaration()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:767:1: ( VerticalLineVerticalLine )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:767:3: VerticalLineVerticalLine
            {
            match(input,VerticalLineVerticalLine,FOLLOW_VerticalLineVerticalLine_in_ruleDisjunctiveOperator1603); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:780:1: ruleConjunctiveOperator : ( ( AmpersandAmpersand ) ) ;
    public final void ruleConjunctiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:784:1: ( ( ( AmpersandAmpersand ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:785:1: ( ( AmpersandAmpersand ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:785:1: ( ( AmpersandAmpersand ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:786:1: ( AmpersandAmpersand )
            {
             before(grammarAccess.getConjunctiveOperatorAccess().getConjunctionEnumLiteralDeclaration()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:787:1: ( AmpersandAmpersand )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:787:3: AmpersandAmpersand
            {
            match(input,AmpersandAmpersand,FOLLOW_AmpersandAmpersand_in_ruleConjunctiveOperator1641); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:800:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:804:1: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:805:1: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:805:1: ( ( rule__EqualityOperator__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:806:1: ( rule__EqualityOperator__Alternatives )
            {
             before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:807:1: ( rule__EqualityOperator__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:807:2: rule__EqualityOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__EqualityOperator__Alternatives_in_ruleEqualityOperator1678);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:819:1: ruleComparativeOperator : ( ( rule__ComparativeOperator__Alternatives ) ) ;
    public final void ruleComparativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:823:1: ( ( ( rule__ComparativeOperator__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:824:1: ( ( rule__ComparativeOperator__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:824:1: ( ( rule__ComparativeOperator__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:825:1: ( rule__ComparativeOperator__Alternatives )
            {
             before(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:826:1: ( rule__ComparativeOperator__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:826:2: rule__ComparativeOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparativeOperator__Alternatives_in_ruleComparativeOperator1714);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:838:1: rule__Solitary__Alternatives : ( ( ruleMandatory ) | ( ruleOptional ) );
    public final void rule__Solitary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:842:1: ( ( ruleMandatory ) | ( ruleOptional ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:843:1: ( ruleMandatory )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:843:1: ( ruleMandatory )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:844:1: ruleMandatory
                    {
                     before(grammarAccess.getSolitaryAccess().getMandatoryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMandatory_in_rule__Solitary__Alternatives1750);
                    ruleMandatory();

                    state._fsp--;

                     after(grammarAccess.getSolitaryAccess().getMandatoryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:849:6: ( ruleOptional )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:849:6: ( ruleOptional )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:850:1: ruleOptional
                    {
                     before(grammarAccess.getSolitaryAccess().getOptionalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOptional_in_rule__Solitary__Alternatives1767);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:860:1: rule__Primary__Alternatives : ( ( ( rule__Primary__FeatureReferenceAssignment_0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleUnary ) | ( ( rule__Primary__Group_3__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:864:1: ( ( ( rule__Primary__FeatureReferenceAssignment_0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleUnary ) | ( ( rule__Primary__Group_3__0 ) ) )
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

                    if ( ((LA2_4>=ExclamationMarkEqualsSign && LA2_4<=GreaterThanSignEqualsSign)||(LA2_4>=VerticalLineVerticalLine && LA2_4<=LeftParenthesis)||(LA2_4>=HyphenMinus && LA2_4<=GreaterThanSign)||LA2_4==RULE_ID) ) {
                        alt2=4;
                    }
                    else if ( (LA2_4==RightParenthesis) ) {
                        alt2=2;
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:865:1: ( ( rule__Primary__FeatureReferenceAssignment_0 ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:865:1: ( ( rule__Primary__FeatureReferenceAssignment_0 ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:866:1: ( rule__Primary__FeatureReferenceAssignment_0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getFeatureReferenceAssignment_0()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:867:1: ( rule__Primary__FeatureReferenceAssignment_0 )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:867:2: rule__Primary__FeatureReferenceAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Primary__FeatureReferenceAssignment_0_in_rule__Primary__Alternatives1799);
                    rule__Primary__FeatureReferenceAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getFeatureReferenceAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:871:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:871:6: ( ( rule__Primary__Group_1__0 ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:872:1: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:873:1: ( rule__Primary__Group_1__0 )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:873:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1817);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:877:6: ( ruleUnary )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:877:6: ( ruleUnary )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:878:1: ruleUnary
                    {
                     before(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUnary_in_rule__Primary__Alternatives1835);
                    ruleUnary();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:883:6: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:883:6: ( ( rule__Primary__Group_3__0 ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:884:1: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:885:1: ( rule__Primary__Group_3__0 )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:885:2: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_3__0_in_rule__Primary__Alternatives1852);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:894:1: rule__Unary__OperatorAlternatives_1_0 : ( ( ExclamationMark ) | ( HyphenMinus ) );
    public final void rule__Unary__OperatorAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:898:1: ( ( ExclamationMark ) | ( HyphenMinus ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:899:1: ( ExclamationMark )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:899:1: ( ExclamationMark )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:900:1: ExclamationMark
                    {
                     before(grammarAccess.getUnaryAccess().getOperatorExclamationMarkKeyword_1_0_0()); 
                    match(input,ExclamationMark,FOLLOW_ExclamationMark_in_rule__Unary__OperatorAlternatives_1_01886); 
                     after(grammarAccess.getUnaryAccess().getOperatorExclamationMarkKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:907:6: ( HyphenMinus )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:907:6: ( HyphenMinus )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:908:1: HyphenMinus
                    {
                     before(grammarAccess.getUnaryAccess().getOperatorHyphenMinusKeyword_1_0_1()); 
                    match(input,HyphenMinus,FOLLOW_HyphenMinus_in_rule__Unary__OperatorAlternatives_1_01906); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:920:1: rule__Group__Alternatives : ( ( ruleOr ) | ( ruleXor ) );
    public final void rule__Group__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:924:1: ( ( ruleOr ) | ( ruleXor ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:925:1: ( ruleOr )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:925:1: ( ruleOr )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:926:1: ruleOr
                    {
                     before(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOr_in_rule__Group__Alternatives1940);
                    ruleOr();

                    state._fsp--;

                     after(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:931:6: ( ruleXor )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:931:6: ( ruleXor )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:932:1: ruleXor
                    {
                     before(grammarAccess.getGroupAccess().getXorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleXor_in_rule__Group__Alternatives1957);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:942:1: rule__Attribute__Alternatives : ( ( ruleCString ) | ( ruleNumber ) | ( ruleRange ) | ( ruleCBoolean ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:946:1: ( ( ruleCString ) | ( ruleNumber ) | ( ruleRange ) | ( ruleCBoolean ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:947:1: ( ruleCString )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:947:1: ( ruleCString )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:948:1: ruleCString
                    {
                     before(grammarAccess.getAttributeAccess().getCStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCString_in_rule__Attribute__Alternatives1989);
                    ruleCString();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getCStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:953:6: ( ruleNumber )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:953:6: ( ruleNumber )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:954:1: ruleNumber
                    {
                     before(grammarAccess.getAttributeAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumber_in_rule__Attribute__Alternatives2006);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:959:6: ( ruleRange )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:959:6: ( ruleRange )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:960:1: ruleRange
                    {
                     before(grammarAccess.getAttributeAccess().getRangeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRange_in_rule__Attribute__Alternatives2023);
                    ruleRange();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getRangeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:965:6: ( ruleCBoolean )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:965:6: ( ruleCBoolean )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:966:1: ruleCBoolean
                    {
                     before(grammarAccess.getAttributeAccess().getCBooleanParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCBoolean_in_rule__Attribute__Alternatives2040);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:976:1: rule__EString__Alternatives : ( ( RULE_ID ) | ( RULE_NULL ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:980:1: ( ( RULE_ID ) | ( RULE_NULL ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:981:1: ( RULE_ID )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:981:1: ( RULE_ID )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:982:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives2072); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:987:6: ( RULE_NULL )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:987:6: ( RULE_NULL )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:988:1: RULE_NULL
                    {
                     before(grammarAccess.getEStringAccess().getNULLTerminalRuleCall_1()); 
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__EString__Alternatives2089); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:998:1: rule__EqualityOperator__Alternatives : ( ( ( EqualsSignEqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1002:1: ( ( ( EqualsSignEqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1003:1: ( ( EqualsSignEqualsSign ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1003:1: ( ( EqualsSignEqualsSign ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1004:1: ( EqualsSignEqualsSign )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1005:1: ( EqualsSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1005:3: EqualsSignEqualsSign
                    {
                    match(input,EqualsSignEqualsSign,FOLLOW_EqualsSignEqualsSign_in_rule__EqualityOperator__Alternatives2122); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1010:6: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1010:6: ( ( ExclamationMarkEqualsSign ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1011:1: ( ExclamationMarkEqualsSign )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNotEqualsEnumLiteralDeclaration_1()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1012:1: ( ExclamationMarkEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1012:3: ExclamationMarkEqualsSign
                    {
                    match(input,ExclamationMarkEqualsSign,FOLLOW_ExclamationMarkEqualsSign_in_rule__EqualityOperator__Alternatives2142); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1022:1: rule__ComparativeOperator__Alternatives : ( ( ( GreaterThanSign ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) | ( ( LessThanSignEqualsSign ) ) );
    public final void rule__ComparativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1026:1: ( ( ( GreaterThanSign ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) | ( ( LessThanSignEqualsSign ) ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1027:1: ( ( GreaterThanSign ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1027:1: ( ( GreaterThanSign ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1028:1: ( GreaterThanSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_0()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1029:1: ( GreaterThanSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1029:3: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FOLLOW_GreaterThanSign_in_rule__ComparativeOperator__Alternatives2177); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGreaterThanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1034:6: ( ( LessThanSign ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1034:6: ( ( LessThanSign ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1035:1: ( LessThanSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_1()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1036:1: ( LessThanSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1036:3: LessThanSign
                    {
                    match(input,LessThanSign,FOLLOW_LessThanSign_in_rule__ComparativeOperator__Alternatives2197); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLessThanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1041:6: ( ( GreaterThanSignEqualsSign ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1041:6: ( ( GreaterThanSignEqualsSign ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1042:1: ( GreaterThanSignEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGreaterOrEqualsEnumLiteralDeclaration_2()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1043:1: ( GreaterThanSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1043:3: GreaterThanSignEqualsSign
                    {
                    match(input,GreaterThanSignEqualsSign,FOLLOW_GreaterThanSignEqualsSign_in_rule__ComparativeOperator__Alternatives2217); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGreaterOrEqualsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1048:6: ( ( LessThanSignEqualsSign ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1048:6: ( ( LessThanSignEqualsSign ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1049:1: ( LessThanSignEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLessOrEqualsEnumLiteralDeclaration_3()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1050:1: ( LessThanSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1050:3: LessThanSignEqualsSign
                    {
                    match(input,LessThanSignEqualsSign,FOLLOW_LessThanSignEqualsSign_in_rule__ComparativeOperator__Alternatives2237); 

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


    // $ANTLR start "rule__Constrain__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1062:1: rule__Constrain__Group__0 : rule__Constrain__Group__0__Impl rule__Constrain__Group__1 ;
    public final void rule__Constrain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1066:1: ( rule__Constrain__Group__0__Impl rule__Constrain__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1067:2: rule__Constrain__Group__0__Impl rule__Constrain__Group__1
            {
            pushFollow(FOLLOW_rule__Constrain__Group__0__Impl_in_rule__Constrain__Group__02269);
            rule__Constrain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constrain__Group__1_in_rule__Constrain__Group__02272);
            rule__Constrain__Group__1();

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
    // $ANTLR end "rule__Constrain__Group__0"


    // $ANTLR start "rule__Constrain__Group__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1074:1: rule__Constrain__Group__0__Impl : ( ruleConjunction ) ;
    public final void rule__Constrain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1078:1: ( ( ruleConjunction ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1079:1: ( ruleConjunction )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1079:1: ( ruleConjunction )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1080:1: ruleConjunction
            {
             before(grammarAccess.getConstrainAccess().getConjunctionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Constrain__Group__0__Impl2299);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConstrainAccess().getConjunctionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Constrain__Group__0__Impl"


    // $ANTLR start "rule__Constrain__Group__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1091:1: rule__Constrain__Group__1 : rule__Constrain__Group__1__Impl ;
    public final void rule__Constrain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1095:1: ( rule__Constrain__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1096:2: rule__Constrain__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Constrain__Group__1__Impl_in_rule__Constrain__Group__12328);
            rule__Constrain__Group__1__Impl();

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
    // $ANTLR end "rule__Constrain__Group__1"


    // $ANTLR start "rule__Constrain__Group__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1102:1: rule__Constrain__Group__1__Impl : ( ( rule__Constrain__Group_1__0 )* ) ;
    public final void rule__Constrain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1106:1: ( ( ( rule__Constrain__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1107:1: ( ( rule__Constrain__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1107:1: ( ( rule__Constrain__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1108:1: ( rule__Constrain__Group_1__0 )*
            {
             before(grammarAccess.getConstrainAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1109:1: ( rule__Constrain__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==VerticalLineVerticalLine) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1109:2: rule__Constrain__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Constrain__Group_1__0_in_rule__Constrain__Group__1__Impl2355);
            	    rule__Constrain__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getConstrainAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Constrain__Group__1__Impl"


    // $ANTLR start "rule__Constrain__Group_1__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1123:1: rule__Constrain__Group_1__0 : rule__Constrain__Group_1__0__Impl rule__Constrain__Group_1__1 ;
    public final void rule__Constrain__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1127:1: ( rule__Constrain__Group_1__0__Impl rule__Constrain__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1128:2: rule__Constrain__Group_1__0__Impl rule__Constrain__Group_1__1
            {
            pushFollow(FOLLOW_rule__Constrain__Group_1__0__Impl_in_rule__Constrain__Group_1__02390);
            rule__Constrain__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constrain__Group_1__1_in_rule__Constrain__Group_1__02393);
            rule__Constrain__Group_1__1();

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
    // $ANTLR end "rule__Constrain__Group_1__0"


    // $ANTLR start "rule__Constrain__Group_1__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1135:1: rule__Constrain__Group_1__0__Impl : ( () ) ;
    public final void rule__Constrain__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1139:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1140:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1140:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1141:1: ()
            {
             before(grammarAccess.getConstrainAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1142:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1144:1: 
            {
            }

             after(grammarAccess.getConstrainAccess().getBinaryLeftExpAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constrain__Group_1__0__Impl"


    // $ANTLR start "rule__Constrain__Group_1__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1154:1: rule__Constrain__Group_1__1 : rule__Constrain__Group_1__1__Impl rule__Constrain__Group_1__2 ;
    public final void rule__Constrain__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1158:1: ( rule__Constrain__Group_1__1__Impl rule__Constrain__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1159:2: rule__Constrain__Group_1__1__Impl rule__Constrain__Group_1__2
            {
            pushFollow(FOLLOW_rule__Constrain__Group_1__1__Impl_in_rule__Constrain__Group_1__12451);
            rule__Constrain__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constrain__Group_1__2_in_rule__Constrain__Group_1__12454);
            rule__Constrain__Group_1__2();

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
    // $ANTLR end "rule__Constrain__Group_1__1"


    // $ANTLR start "rule__Constrain__Group_1__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1166:1: rule__Constrain__Group_1__1__Impl : ( ( rule__Constrain__OperatorAssignment_1_1 ) ) ;
    public final void rule__Constrain__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1170:1: ( ( ( rule__Constrain__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1171:1: ( ( rule__Constrain__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1171:1: ( ( rule__Constrain__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1172:1: ( rule__Constrain__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getConstrainAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1173:1: ( rule__Constrain__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1173:2: rule__Constrain__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Constrain__OperatorAssignment_1_1_in_rule__Constrain__Group_1__1__Impl2481);
            rule__Constrain__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstrainAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Constrain__Group_1__1__Impl"


    // $ANTLR start "rule__Constrain__Group_1__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1183:1: rule__Constrain__Group_1__2 : rule__Constrain__Group_1__2__Impl ;
    public final void rule__Constrain__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1187:1: ( rule__Constrain__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1188:2: rule__Constrain__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Constrain__Group_1__2__Impl_in_rule__Constrain__Group_1__22511);
            rule__Constrain__Group_1__2__Impl();

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
    // $ANTLR end "rule__Constrain__Group_1__2"


    // $ANTLR start "rule__Constrain__Group_1__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1194:1: rule__Constrain__Group_1__2__Impl : ( ( rule__Constrain__RightExpAssignment_1_2 ) ) ;
    public final void rule__Constrain__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1198:1: ( ( ( rule__Constrain__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1199:1: ( ( rule__Constrain__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1199:1: ( ( rule__Constrain__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1200:1: ( rule__Constrain__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getConstrainAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1201:1: ( rule__Constrain__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1201:2: rule__Constrain__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Constrain__RightExpAssignment_1_2_in_rule__Constrain__Group_1__2__Impl2538);
            rule__Constrain__RightExpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConstrainAccess().getRightExpAssignment_1_2()); 

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
    // $ANTLR end "rule__Constrain__Group_1__2__Impl"


    // $ANTLR start "rule__Conjunction__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1217:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1221:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1222:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__02574);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__02577);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1229:1: rule__Conjunction__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1233:1: ( ( ruleEquality ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1234:1: ( ruleEquality )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1234:1: ( ruleEquality )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1235:1: ruleEquality
            {
             before(grammarAccess.getConjunctionAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__Conjunction__Group__0__Impl2604);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1246:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1250:1: ( rule__Conjunction__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1251:2: rule__Conjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__12633);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1257:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )* ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1261:1: ( ( ( rule__Conjunction__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1262:1: ( ( rule__Conjunction__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1262:1: ( ( rule__Conjunction__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1263:1: ( rule__Conjunction__Group_1__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1264:1: ( rule__Conjunction__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AmpersandAmpersand) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1264:2: rule__Conjunction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl2660);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1278:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1282:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1283:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__02695);
            rule__Conjunction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__02698);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1290:1: rule__Conjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1294:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1295:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1295:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1296:1: ()
            {
             before(grammarAccess.getConjunctionAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1297:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1299:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1309:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1313:1: ( rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1314:2: rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__12756);
            rule__Conjunction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__12759);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1321:1: rule__Conjunction__Group_1__1__Impl : ( ( rule__Conjunction__OperatorAssignment_1_1 ) ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1325:1: ( ( ( rule__Conjunction__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1326:1: ( ( rule__Conjunction__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1326:1: ( ( rule__Conjunction__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1327:1: ( rule__Conjunction__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getConjunctionAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1328:1: ( rule__Conjunction__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1328:2: rule__Conjunction__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Conjunction__OperatorAssignment_1_1_in_rule__Conjunction__Group_1__1__Impl2786);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1338:1: rule__Conjunction__Group_1__2 : rule__Conjunction__Group_1__2__Impl ;
    public final void rule__Conjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1342:1: ( rule__Conjunction__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1343:2: rule__Conjunction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__22816);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1349:1: rule__Conjunction__Group_1__2__Impl : ( ( rule__Conjunction__RightExpAssignment_1_2 ) ) ;
    public final void rule__Conjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1353:1: ( ( ( rule__Conjunction__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1354:1: ( ( rule__Conjunction__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1354:1: ( ( rule__Conjunction__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1355:1: ( rule__Conjunction__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getConjunctionAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1356:1: ( rule__Conjunction__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1356:2: rule__Conjunction__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Conjunction__RightExpAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl2843);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1372:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1376:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1377:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__02879);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__02882);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1384:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1388:1: ( ( ruleComparison ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1389:1: ( ruleComparison )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1389:1: ( ruleComparison )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1390:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl2909);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1401:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1405:1: ( rule__Equality__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1406:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__12938);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1412:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1416:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1417:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1417:1: ( ( rule__Equality__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1418:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1419:1: ( rule__Equality__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ExclamationMarkEqualsSign||LA11_0==EqualsSignEqualsSign) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1419:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl2965);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1433:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1437:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1438:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__03000);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__03003);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1445:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1449:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1450:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1450:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1451:1: ()
            {
             before(grammarAccess.getEqualityAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1452:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1454:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1464:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1468:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1469:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__13061);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__13064);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1476:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OperatorAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1480:1: ( ( ( rule__Equality__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1481:1: ( ( rule__Equality__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1481:1: ( ( rule__Equality__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1482:1: ( rule__Equality__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1483:1: ( rule__Equality__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1483:2: rule__Equality__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OperatorAssignment_1_1_in_rule__Equality__Group_1__1__Impl3091);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1493:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1497:1: ( rule__Equality__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1498:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__23121);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1504:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightExpAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1508:1: ( ( ( rule__Equality__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1509:1: ( ( rule__Equality__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1509:1: ( ( rule__Equality__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1510:1: ( rule__Equality__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1511:1: ( rule__Equality__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1511:2: rule__Equality__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightExpAssignment_1_2_in_rule__Equality__Group_1__2__Impl3148);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1527:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1531:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1532:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__03184);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__03187);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1539:1: rule__Comparison__Group__0__Impl : ( ruleBinary ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1543:1: ( ( ruleBinary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1544:1: ( ruleBinary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1544:1: ( ruleBinary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1545:1: ruleBinary
            {
             before(grammarAccess.getComparisonAccess().getBinaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBinary_in_rule__Comparison__Group__0__Impl3214);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1556:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1560:1: ( rule__Comparison__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1561:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__13243);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1567:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1571:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1572:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1572:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1573:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1574:1: ( rule__Comparison__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==LessThanSignEqualsSign||LA12_0==GreaterThanSignEqualsSign||(LA12_0>=LessThanSign && LA12_0<=GreaterThanSign)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1574:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl3270);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1588:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1592:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1593:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__03305);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__03308);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1600:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1604:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1605:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1605:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1606:1: ()
            {
             before(grammarAccess.getComparisonAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1607:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1609:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1619:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1623:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1624:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__13366);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__13369);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1631:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OperatorAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1635:1: ( ( ( rule__Comparison__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1636:1: ( ( rule__Comparison__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1636:1: ( ( rule__Comparison__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1637:1: ( rule__Comparison__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1638:1: ( rule__Comparison__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1638:2: rule__Comparison__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OperatorAssignment_1_1_in_rule__Comparison__Group_1__1__Impl3396);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1648:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1652:1: ( rule__Comparison__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1653:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__23426);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1659:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightExpAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1663:1: ( ( ( rule__Comparison__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1664:1: ( ( rule__Comparison__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1664:1: ( ( rule__Comparison__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1665:1: ( rule__Comparison__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1666:1: ( rule__Comparison__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1666:2: rule__Comparison__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightExpAssignment_1_2_in_rule__Comparison__Group_1__2__Impl3453);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1682:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1686:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1687:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_rule__Binary__Group__0__Impl_in_rule__Binary__Group__03489);
            rule__Binary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binary__Group__1_in_rule__Binary__Group__03492);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1694:1: rule__Binary__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1698:1: ( ( rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1699:1: ( rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1699:1: ( rulePrimary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1700:1: rulePrimary
            {
             before(grammarAccess.getBinaryAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Binary__Group__0__Impl3519);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1711:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1715:1: ( rule__Binary__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1716:2: rule__Binary__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Binary__Group__1__Impl_in_rule__Binary__Group__13548);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1722:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__Group_1__0 )* ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1726:1: ( ( ( rule__Binary__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1727:1: ( ( rule__Binary__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1727:1: ( ( rule__Binary__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1728:1: ( rule__Binary__Group_1__0 )*
            {
             before(grammarAccess.getBinaryAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1729:1: ( rule__Binary__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=ExclamationMark && LA13_0<=LeftParenthesis)||LA13_0==HyphenMinus||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1729:2: rule__Binary__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Binary__Group_1__0_in_rule__Binary__Group__1__Impl3575);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1743:1: rule__Binary__Group_1__0 : rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 ;
    public final void rule__Binary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1747:1: ( rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1748:2: rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Binary__Group_1__0__Impl_in_rule__Binary__Group_1__03610);
            rule__Binary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binary__Group_1__1_in_rule__Binary__Group_1__03613);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1755:1: rule__Binary__Group_1__0__Impl : ( () ) ;
    public final void rule__Binary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1759:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1760:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1760:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1761:1: ()
            {
             before(grammarAccess.getBinaryAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1762:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1764:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1774:1: rule__Binary__Group_1__1 : rule__Binary__Group_1__1__Impl ;
    public final void rule__Binary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1778:1: ( rule__Binary__Group_1__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1779:2: rule__Binary__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Binary__Group_1__1__Impl_in_rule__Binary__Group_1__13671);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1785:1: rule__Binary__Group_1__1__Impl : ( ( rule__Binary__RightExpAssignment_1_1 ) ) ;
    public final void rule__Binary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1789:1: ( ( ( rule__Binary__RightExpAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1790:1: ( ( rule__Binary__RightExpAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1790:1: ( ( rule__Binary__RightExpAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1791:1: ( rule__Binary__RightExpAssignment_1_1 )
            {
             before(grammarAccess.getBinaryAccess().getRightExpAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1792:1: ( rule__Binary__RightExpAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1792:2: rule__Binary__RightExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Binary__RightExpAssignment_1_1_in_rule__Binary__Group_1__1__Impl3698);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1806:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1810:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1811:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__03732);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__03735);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1818:1: rule__Primary__Group_1__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1822:1: ( ( LeftParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1823:1: ( LeftParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1823:1: ( LeftParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1824:1: LeftParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rule__Primary__Group_1__0__Impl3763); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1837:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1841:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1842:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__13794);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__13797);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1849:1: rule__Primary__Group_1__1__Impl : ( ruleAttributeConstrain ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1853:1: ( ( ruleAttributeConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1854:1: ( ruleAttributeConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1854:1: ( ruleAttributeConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1855:1: ruleAttributeConstrain
            {
             before(grammarAccess.getPrimaryAccess().getAttributeConstrainParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleAttributeConstrain_in_rule__Primary__Group_1__1__Impl3824);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1866:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1870:1: ( rule__Primary__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1871:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__23853);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1877:1: rule__Primary__Group_1__2__Impl : ( RightParenthesis ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1881:1: ( ( RightParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1882:1: ( RightParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1882:1: ( RightParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1883:1: RightParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rule__Primary__Group_1__2__Impl3881); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1902:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1906:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1907:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_3__0__Impl_in_rule__Primary__Group_3__03918);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_3__1_in_rule__Primary__Group_3__03921);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1914:1: rule__Primary__Group_3__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1918:1: ( ( LeftParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1919:1: ( LeftParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1919:1: ( LeftParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1920:1: LeftParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rule__Primary__Group_3__0__Impl3949); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1933:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1937:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1938:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_3__1__Impl_in_rule__Primary__Group_3__13980);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_3__2_in_rule__Primary__Group_3__13983);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1945:1: rule__Primary__Group_3__1__Impl : ( ruleConstrain ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1949:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1950:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1950:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1951:1: ruleConstrain
            {
             before(grammarAccess.getPrimaryAccess().getConstrainParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Primary__Group_3__1__Impl4010);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1962:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1966:1: ( rule__Primary__Group_3__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1967:2: rule__Primary__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_3__2__Impl_in_rule__Primary__Group_3__24039);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1973:1: rule__Primary__Group_3__2__Impl : ( RightParenthesis ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1977:1: ( ( RightParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1978:1: ( RightParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1978:1: ( RightParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1979:1: RightParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rule__Primary__Group_3__2__Impl4067); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1998:1: rule__Unary__Group__0 : rule__Unary__Group__0__Impl rule__Unary__Group__1 ;
    public final void rule__Unary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2002:1: ( rule__Unary__Group__0__Impl rule__Unary__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2003:2: rule__Unary__Group__0__Impl rule__Unary__Group__1
            {
            pushFollow(FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__04104);
            rule__Unary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__04107);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2010:1: rule__Unary__Group__0__Impl : ( () ) ;
    public final void rule__Unary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2014:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2015:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2015:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2016:1: ()
            {
             before(grammarAccess.getUnaryAccess().getUnaryAction_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2017:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2019:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2029:1: rule__Unary__Group__1 : rule__Unary__Group__1__Impl rule__Unary__Group__2 ;
    public final void rule__Unary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2033:1: ( rule__Unary__Group__1__Impl rule__Unary__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2034:2: rule__Unary__Group__1__Impl rule__Unary__Group__2
            {
            pushFollow(FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__14165);
            rule__Unary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unary__Group__2_in_rule__Unary__Group__14168);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2041:1: rule__Unary__Group__1__Impl : ( ( rule__Unary__OperatorAssignment_1 ) ) ;
    public final void rule__Unary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2045:1: ( ( ( rule__Unary__OperatorAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2046:1: ( ( rule__Unary__OperatorAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2046:1: ( ( rule__Unary__OperatorAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2047:1: ( rule__Unary__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryAccess().getOperatorAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2048:1: ( rule__Unary__OperatorAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2048:2: rule__Unary__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__Unary__OperatorAssignment_1_in_rule__Unary__Group__1__Impl4195);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2058:1: rule__Unary__Group__2 : rule__Unary__Group__2__Impl ;
    public final void rule__Unary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2062:1: ( rule__Unary__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2063:2: rule__Unary__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Unary__Group__2__Impl_in_rule__Unary__Group__24225);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2069:1: rule__Unary__Group__2__Impl : ( ( rule__Unary__ExpAssignment_2 ) ) ;
    public final void rule__Unary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2073:1: ( ( ( rule__Unary__ExpAssignment_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2074:1: ( ( rule__Unary__ExpAssignment_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2074:1: ( ( rule__Unary__ExpAssignment_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2075:1: ( rule__Unary__ExpAssignment_2 )
            {
             before(grammarAccess.getUnaryAccess().getExpAssignment_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2076:1: ( rule__Unary__ExpAssignment_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2076:2: rule__Unary__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__Unary__ExpAssignment_2_in_rule__Unary__Group__2__Impl4252);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2092:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2096:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2097:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04288);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04291);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2104:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2108:1: ( ( RULE_ID ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2109:1: ( RULE_ID )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2109:1: ( RULE_ID )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2110:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4318); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2121:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2125:1: ( rule__QualifiedName__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2126:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14347);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2132:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2136:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2137:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2137:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2138:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2139:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==FullStop) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2139:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4374);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2153:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2157:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2158:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04409);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04412);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2165:1: rule__QualifiedName__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2169:1: ( ( FullStop ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2170:1: ( FullStop )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2170:1: ( FullStop )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2171:1: FullStop
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,FullStop,FOLLOW_FullStop_in_rule__QualifiedName__Group_1__0__Impl4440); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2184:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2188:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2189:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14471);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2195:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2199:1: ( ( RULE_ID ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2200:1: ( RULE_ID )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2200:1: ( RULE_ID )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2201:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4498); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2216:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2220:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2221:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__04531);
            rule__Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__1_in_rule__Range__Group__04534);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2228:1: rule__Range__Group__0__Impl : ( ( rule__Range__LowerAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2232:1: ( ( ( rule__Range__LowerAssignment_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2233:1: ( ( rule__Range__LowerAssignment_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2233:1: ( ( rule__Range__LowerAssignment_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2234:1: ( rule__Range__LowerAssignment_0 )
            {
             before(grammarAccess.getRangeAccess().getLowerAssignment_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2235:1: ( rule__Range__LowerAssignment_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2235:2: rule__Range__LowerAssignment_0
            {
            pushFollow(FOLLOW_rule__Range__LowerAssignment_0_in_rule__Range__Group__0__Impl4561);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2245:1: rule__Range__Group__1 : rule__Range__Group__1__Impl ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2249:1: ( rule__Range__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2250:2: rule__Range__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__14591);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2256:1: rule__Range__Group__1__Impl : ( ( rule__Range__UpperAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2260:1: ( ( ( rule__Range__UpperAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2261:1: ( ( rule__Range__UpperAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2261:1: ( ( rule__Range__UpperAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2262:1: ( rule__Range__UpperAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getUpperAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2263:1: ( rule__Range__UpperAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2263:2: rule__Range__UpperAssignment_1
            {
            pushFollow(FOLLOW_rule__Range__UpperAssignment_1_in_rule__Range__Group__1__Impl4618);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2277:1: rule__Feature_Impl__Group__0 : rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 ;
    public final void rule__Feature_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2281:1: ( rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2282:2: rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__0__Impl_in_rule__Feature_Impl__Group__04652);
            rule__Feature_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group__1_in_rule__Feature_Impl__Group__04655);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2289:1: rule__Feature_Impl__Group__0__Impl : ( Feature ) ;
    public final void rule__Feature_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2293:1: ( ( Feature ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2294:1: ( Feature )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2294:1: ( Feature )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2295:1: Feature
            {
             before(grammarAccess.getFeature_ImplAccess().getFeatureKeyword_0()); 
            match(input,Feature,FOLLOW_Feature_in_rule__Feature_Impl__Group__0__Impl4683); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2308:1: rule__Feature_Impl__Group__1 : rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 ;
    public final void rule__Feature_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2312:1: ( rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2313:2: rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__1__Impl_in_rule__Feature_Impl__Group__14714);
            rule__Feature_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group__2_in_rule__Feature_Impl__Group__14717);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2320:1: rule__Feature_Impl__Group__1__Impl : ( ( rule__Feature_Impl__NameAssignment_1 ) ) ;
    public final void rule__Feature_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2324:1: ( ( ( rule__Feature_Impl__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2325:1: ( ( rule__Feature_Impl__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2325:1: ( ( rule__Feature_Impl__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2326:1: ( rule__Feature_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2327:1: ( rule__Feature_Impl__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2327:2: rule__Feature_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__NameAssignment_1_in_rule__Feature_Impl__Group__1__Impl4744);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2337:1: rule__Feature_Impl__Group__2 : rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 ;
    public final void rule__Feature_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2341:1: ( rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2342:2: rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__2__Impl_in_rule__Feature_Impl__Group__24774);
            rule__Feature_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group__3_in_rule__Feature_Impl__Group__24777);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2349:1: rule__Feature_Impl__Group__2__Impl : ( ( rule__Feature_Impl__Group_2__0 )? ) ;
    public final void rule__Feature_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2353:1: ( ( ( rule__Feature_Impl__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2354:1: ( ( rule__Feature_Impl__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2354:1: ( ( rule__Feature_Impl__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2355:1: ( rule__Feature_Impl__Group_2__0 )?
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2356:1: ( rule__Feature_Impl__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_BEGIN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2356:2: rule__Feature_Impl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Feature_Impl__Group_2__0_in_rule__Feature_Impl__Group__2__Impl4804);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2366:1: rule__Feature_Impl__Group__3 : rule__Feature_Impl__Group__3__Impl ;
    public final void rule__Feature_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2370:1: ( rule__Feature_Impl__Group__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2371:2: rule__Feature_Impl__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__3__Impl_in_rule__Feature_Impl__Group__34835);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2377:1: rule__Feature_Impl__Group__3__Impl : ( ( rule__Feature_Impl__Group_3__0 )? ) ;
    public final void rule__Feature_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2381:1: ( ( ( rule__Feature_Impl__Group_3__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2382:1: ( ( rule__Feature_Impl__Group_3__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2382:1: ( ( rule__Feature_Impl__Group_3__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2383:1: ( rule__Feature_Impl__Group_3__0 )?
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2384:1: ( rule__Feature_Impl__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LeftSquareBracket) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2384:2: rule__Feature_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Feature_Impl__Group_3__0_in_rule__Feature_Impl__Group__3__Impl4862);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2402:1: rule__Feature_Impl__Group_2__0 : rule__Feature_Impl__Group_2__0__Impl rule__Feature_Impl__Group_2__1 ;
    public final void rule__Feature_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2406:1: ( rule__Feature_Impl__Group_2__0__Impl rule__Feature_Impl__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2407:2: rule__Feature_Impl__Group_2__0__Impl rule__Feature_Impl__Group_2__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__0__Impl_in_rule__Feature_Impl__Group_2__04901);
            rule__Feature_Impl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__1_in_rule__Feature_Impl__Group_2__04904);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2414:1: rule__Feature_Impl__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Feature_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2418:1: ( ( RULE_BEGIN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2419:1: ( RULE_BEGIN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2419:1: ( RULE_BEGIN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2420:1: RULE_BEGIN
            {
             before(grammarAccess.getFeature_ImplAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Feature_Impl__Group_2__0__Impl4931); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2431:1: rule__Feature_Impl__Group_2__1 : rule__Feature_Impl__Group_2__1__Impl rule__Feature_Impl__Group_2__2 ;
    public final void rule__Feature_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2435:1: ( rule__Feature_Impl__Group_2__1__Impl rule__Feature_Impl__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2436:2: rule__Feature_Impl__Group_2__1__Impl rule__Feature_Impl__Group_2__2
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__1__Impl_in_rule__Feature_Impl__Group_2__14960);
            rule__Feature_Impl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__2_in_rule__Feature_Impl__Group_2__14963);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2443:1: rule__Feature_Impl__Group_2__1__Impl : ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) ) ;
    public final void rule__Feature_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2447:1: ( ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2448:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2448:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2449:1: ( rule__Feature_Impl__SubfeatureAssignment_2_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2450:1: ( rule__Feature_Impl__SubfeatureAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2450:2: rule__Feature_Impl__SubfeatureAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_1_in_rule__Feature_Impl__Group_2__1__Impl4990);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2460:1: rule__Feature_Impl__Group_2__2 : rule__Feature_Impl__Group_2__2__Impl rule__Feature_Impl__Group_2__3 ;
    public final void rule__Feature_Impl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2464:1: ( rule__Feature_Impl__Group_2__2__Impl rule__Feature_Impl__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2465:2: rule__Feature_Impl__Group_2__2__Impl rule__Feature_Impl__Group_2__3
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__2__Impl_in_rule__Feature_Impl__Group_2__25020);
            rule__Feature_Impl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__3_in_rule__Feature_Impl__Group_2__25023);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2472:1: rule__Feature_Impl__Group_2__2__Impl : ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* ) ;
    public final void rule__Feature_Impl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2476:1: ( ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2477:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2477:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2478:1: ( rule__Feature_Impl__SubfeatureAssignment_2_2 )*
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureAssignment_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2479:1: ( rule__Feature_Impl__SubfeatureAssignment_2_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==QuestionMark||LA17_0==RULE_NULL||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2479:2: rule__Feature_Impl__SubfeatureAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_2_in_rule__Feature_Impl__Group_2__2__Impl5050);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2489:1: rule__Feature_Impl__Group_2__3 : rule__Feature_Impl__Group_2__3__Impl ;
    public final void rule__Feature_Impl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2493:1: ( rule__Feature_Impl__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2494:2: rule__Feature_Impl__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__3__Impl_in_rule__Feature_Impl__Group_2__35081);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2500:1: rule__Feature_Impl__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Feature_Impl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2504:1: ( ( RULE_END ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2505:1: ( RULE_END )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2505:1: ( RULE_END )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2506:1: RULE_END
            {
             before(grammarAccess.getFeature_ImplAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Feature_Impl__Group_2__3__Impl5108); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2525:1: rule__Feature_Impl__Group_3__0 : rule__Feature_Impl__Group_3__0__Impl rule__Feature_Impl__Group_3__1 ;
    public final void rule__Feature_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2529:1: ( rule__Feature_Impl__Group_3__0__Impl rule__Feature_Impl__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2530:2: rule__Feature_Impl__Group_3__0__Impl rule__Feature_Impl__Group_3__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__0__Impl_in_rule__Feature_Impl__Group_3__05145);
            rule__Feature_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__1_in_rule__Feature_Impl__Group_3__05148);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2537:1: rule__Feature_Impl__Group_3__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Feature_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2541:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2542:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2542:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2543:1: LeftSquareBracket
            {
             before(grammarAccess.getFeature_ImplAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Feature_Impl__Group_3__0__Impl5176); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2556:1: rule__Feature_Impl__Group_3__1 : rule__Feature_Impl__Group_3__1__Impl rule__Feature_Impl__Group_3__2 ;
    public final void rule__Feature_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2560:1: ( rule__Feature_Impl__Group_3__1__Impl rule__Feature_Impl__Group_3__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2561:2: rule__Feature_Impl__Group_3__1__Impl rule__Feature_Impl__Group_3__2
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__1__Impl_in_rule__Feature_Impl__Group_3__15207);
            rule__Feature_Impl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__2_in_rule__Feature_Impl__Group_3__15210);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2568:1: rule__Feature_Impl__Group_3__1__Impl : ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) ) ;
    public final void rule__Feature_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2572:1: ( ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2573:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2573:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2574:1: ( rule__Feature_Impl__ConstrainsAssignment_3_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsAssignment_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2575:1: ( rule__Feature_Impl__ConstrainsAssignment_3_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2575:2: rule__Feature_Impl__ConstrainsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_1_in_rule__Feature_Impl__Group_3__1__Impl5237);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2585:1: rule__Feature_Impl__Group_3__2 : rule__Feature_Impl__Group_3__2__Impl rule__Feature_Impl__Group_3__3 ;
    public final void rule__Feature_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2589:1: ( rule__Feature_Impl__Group_3__2__Impl rule__Feature_Impl__Group_3__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2590:2: rule__Feature_Impl__Group_3__2__Impl rule__Feature_Impl__Group_3__3
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__2__Impl_in_rule__Feature_Impl__Group_3__25267);
            rule__Feature_Impl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__3_in_rule__Feature_Impl__Group_3__25270);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2597:1: rule__Feature_Impl__Group_3__2__Impl : ( ( rule__Feature_Impl__Group_3_2__0 )* ) ;
    public final void rule__Feature_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2601:1: ( ( ( rule__Feature_Impl__Group_3_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2602:1: ( ( rule__Feature_Impl__Group_3_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2602:1: ( ( rule__Feature_Impl__Group_3_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2603:1: ( rule__Feature_Impl__Group_3_2__0 )*
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_3_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2604:1: ( rule__Feature_Impl__Group_3_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Comma) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2604:2: rule__Feature_Impl__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__0_in_rule__Feature_Impl__Group_3__2__Impl5297);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2614:1: rule__Feature_Impl__Group_3__3 : rule__Feature_Impl__Group_3__3__Impl ;
    public final void rule__Feature_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2618:1: ( rule__Feature_Impl__Group_3__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2619:2: rule__Feature_Impl__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__3__Impl_in_rule__Feature_Impl__Group_3__35328);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2625:1: rule__Feature_Impl__Group_3__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Feature_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2629:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2630:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2630:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2631:1: RightSquareBracket
            {
             before(grammarAccess.getFeature_ImplAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Feature_Impl__Group_3__3__Impl5356); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2652:1: rule__Feature_Impl__Group_3_2__0 : rule__Feature_Impl__Group_3_2__0__Impl rule__Feature_Impl__Group_3_2__1 ;
    public final void rule__Feature_Impl__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2656:1: ( rule__Feature_Impl__Group_3_2__0__Impl rule__Feature_Impl__Group_3_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2657:2: rule__Feature_Impl__Group_3_2__0__Impl rule__Feature_Impl__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__0__Impl_in_rule__Feature_Impl__Group_3_2__05395);
            rule__Feature_Impl__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__1_in_rule__Feature_Impl__Group_3_2__05398);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2664:1: rule__Feature_Impl__Group_3_2__0__Impl : ( Comma ) ;
    public final void rule__Feature_Impl__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2668:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2669:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2669:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2670:1: Comma
            {
             before(grammarAccess.getFeature_ImplAccess().getCommaKeyword_3_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Feature_Impl__Group_3_2__0__Impl5426); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2683:1: rule__Feature_Impl__Group_3_2__1 : rule__Feature_Impl__Group_3_2__1__Impl ;
    public final void rule__Feature_Impl__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2687:1: ( rule__Feature_Impl__Group_3_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2688:2: rule__Feature_Impl__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__1__Impl_in_rule__Feature_Impl__Group_3_2__15457);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2694:1: rule__Feature_Impl__Group_3_2__1__Impl : ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) ) ;
    public final void rule__Feature_Impl__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2698:1: ( ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2699:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2699:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2700:1: ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsAssignment_3_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2701:1: ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2701:2: rule__Feature_Impl__ConstrainsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_2_1_in_rule__Feature_Impl__Group_3_2__1__Impl5484);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2715:1: rule__Grouped__Group__0 : rule__Grouped__Group__0__Impl rule__Grouped__Group__1 ;
    public final void rule__Grouped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2719:1: ( rule__Grouped__Group__0__Impl rule__Grouped__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2720:2: rule__Grouped__Group__0__Impl rule__Grouped__Group__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group__0__Impl_in_rule__Grouped__Group__05518);
            rule__Grouped__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group__1_in_rule__Grouped__Group__05521);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2727:1: rule__Grouped__Group__0__Impl : ( ( rule__Grouped__NameAssignment_0 ) ) ;
    public final void rule__Grouped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2731:1: ( ( ( rule__Grouped__NameAssignment_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2732:1: ( ( rule__Grouped__NameAssignment_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2732:1: ( ( rule__Grouped__NameAssignment_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2733:1: ( rule__Grouped__NameAssignment_0 )
            {
             before(grammarAccess.getGroupedAccess().getNameAssignment_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2734:1: ( rule__Grouped__NameAssignment_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2734:2: rule__Grouped__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Grouped__NameAssignment_0_in_rule__Grouped__Group__0__Impl5548);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2744:1: rule__Grouped__Group__1 : rule__Grouped__Group__1__Impl rule__Grouped__Group__2 ;
    public final void rule__Grouped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2748:1: ( rule__Grouped__Group__1__Impl rule__Grouped__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2749:2: rule__Grouped__Group__1__Impl rule__Grouped__Group__2
            {
            pushFollow(FOLLOW_rule__Grouped__Group__1__Impl_in_rule__Grouped__Group__15578);
            rule__Grouped__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group__2_in_rule__Grouped__Group__15581);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2756:1: rule__Grouped__Group__1__Impl : ( ( rule__Grouped__Group_1__0 )? ) ;
    public final void rule__Grouped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2760:1: ( ( ( rule__Grouped__Group_1__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2761:1: ( ( rule__Grouped__Group_1__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2761:1: ( ( rule__Grouped__Group_1__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2762:1: ( rule__Grouped__Group_1__0 )?
            {
             before(grammarAccess.getGroupedAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2763:1: ( rule__Grouped__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftParenthesis) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2763:2: rule__Grouped__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Grouped__Group_1__0_in_rule__Grouped__Group__1__Impl5608);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2773:1: rule__Grouped__Group__2 : rule__Grouped__Group__2__Impl ;
    public final void rule__Grouped__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2777:1: ( rule__Grouped__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2778:2: rule__Grouped__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group__2__Impl_in_rule__Grouped__Group__25639);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2784:1: rule__Grouped__Group__2__Impl : ( ( rule__Grouped__Group_2__0 )? ) ;
    public final void rule__Grouped__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2788:1: ( ( ( rule__Grouped__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2789:1: ( ( rule__Grouped__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2789:1: ( ( rule__Grouped__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2790:1: ( rule__Grouped__Group_2__0 )?
            {
             before(grammarAccess.getGroupedAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2791:1: ( rule__Grouped__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LeftSquareBracket) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2791:2: rule__Grouped__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Grouped__Group_2__0_in_rule__Grouped__Group__2__Impl5666);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2807:1: rule__Grouped__Group_1__0 : rule__Grouped__Group_1__0__Impl rule__Grouped__Group_1__1 ;
    public final void rule__Grouped__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2811:1: ( rule__Grouped__Group_1__0__Impl rule__Grouped__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2812:2: rule__Grouped__Group_1__0__Impl rule__Grouped__Group_1__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group_1__0__Impl_in_rule__Grouped__Group_1__05703);
            rule__Grouped__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_1__1_in_rule__Grouped__Group_1__05706);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2819:1: rule__Grouped__Group_1__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Grouped__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2823:1: ( ( LeftParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2824:1: ( LeftParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2824:1: ( LeftParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2825:1: LeftParenthesis
            {
             before(grammarAccess.getGroupedAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rule__Grouped__Group_1__0__Impl5734); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2838:1: rule__Grouped__Group_1__1 : rule__Grouped__Group_1__1__Impl rule__Grouped__Group_1__2 ;
    public final void rule__Grouped__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2842:1: ( rule__Grouped__Group_1__1__Impl rule__Grouped__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2843:2: rule__Grouped__Group_1__1__Impl rule__Grouped__Group_1__2
            {
            pushFollow(FOLLOW_rule__Grouped__Group_1__1__Impl_in_rule__Grouped__Group_1__15765);
            rule__Grouped__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_1__2_in_rule__Grouped__Group_1__15768);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2850:1: rule__Grouped__Group_1__1__Impl : ( ( rule__Grouped__AttributeAssignment_1_1 ) ) ;
    public final void rule__Grouped__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2854:1: ( ( ( rule__Grouped__AttributeAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2855:1: ( ( rule__Grouped__AttributeAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2855:1: ( ( rule__Grouped__AttributeAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2856:1: ( rule__Grouped__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getGroupedAccess().getAttributeAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2857:1: ( rule__Grouped__AttributeAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2857:2: rule__Grouped__AttributeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Grouped__AttributeAssignment_1_1_in_rule__Grouped__Group_1__1__Impl5795);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2867:1: rule__Grouped__Group_1__2 : rule__Grouped__Group_1__2__Impl ;
    public final void rule__Grouped__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2871:1: ( rule__Grouped__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2872:2: rule__Grouped__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group_1__2__Impl_in_rule__Grouped__Group_1__25825);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2878:1: rule__Grouped__Group_1__2__Impl : ( RightParenthesis ) ;
    public final void rule__Grouped__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2882:1: ( ( RightParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2883:1: ( RightParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2883:1: ( RightParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2884:1: RightParenthesis
            {
             before(grammarAccess.getGroupedAccess().getRightParenthesisKeyword_1_2()); 
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rule__Grouped__Group_1__2__Impl5853); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2903:1: rule__Grouped__Group_2__0 : rule__Grouped__Group_2__0__Impl rule__Grouped__Group_2__1 ;
    public final void rule__Grouped__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2907:1: ( rule__Grouped__Group_2__0__Impl rule__Grouped__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2908:2: rule__Grouped__Group_2__0__Impl rule__Grouped__Group_2__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2__0__Impl_in_rule__Grouped__Group_2__05890);
            rule__Grouped__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_2__1_in_rule__Grouped__Group_2__05893);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2915:1: rule__Grouped__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Grouped__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2919:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2920:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2920:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2921:1: LeftSquareBracket
            {
             before(grammarAccess.getGroupedAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Grouped__Group_2__0__Impl5921); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2934:1: rule__Grouped__Group_2__1 : rule__Grouped__Group_2__1__Impl rule__Grouped__Group_2__2 ;
    public final void rule__Grouped__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2938:1: ( rule__Grouped__Group_2__1__Impl rule__Grouped__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2939:2: rule__Grouped__Group_2__1__Impl rule__Grouped__Group_2__2
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2__1__Impl_in_rule__Grouped__Group_2__15952);
            rule__Grouped__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_2__2_in_rule__Grouped__Group_2__15955);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2946:1: rule__Grouped__Group_2__1__Impl : ( ( rule__Grouped__ConstrainsAssignment_2_1 ) ) ;
    public final void rule__Grouped__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2950:1: ( ( ( rule__Grouped__ConstrainsAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2951:1: ( ( rule__Grouped__ConstrainsAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2951:1: ( ( rule__Grouped__ConstrainsAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2952:1: ( rule__Grouped__ConstrainsAssignment_2_1 )
            {
             before(grammarAccess.getGroupedAccess().getConstrainsAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2953:1: ( rule__Grouped__ConstrainsAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2953:2: rule__Grouped__ConstrainsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Grouped__ConstrainsAssignment_2_1_in_rule__Grouped__Group_2__1__Impl5982);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2963:1: rule__Grouped__Group_2__2 : rule__Grouped__Group_2__2__Impl rule__Grouped__Group_2__3 ;
    public final void rule__Grouped__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2967:1: ( rule__Grouped__Group_2__2__Impl rule__Grouped__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2968:2: rule__Grouped__Group_2__2__Impl rule__Grouped__Group_2__3
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2__2__Impl_in_rule__Grouped__Group_2__26012);
            rule__Grouped__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_2__3_in_rule__Grouped__Group_2__26015);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2975:1: rule__Grouped__Group_2__2__Impl : ( ( rule__Grouped__Group_2_2__0 )* ) ;
    public final void rule__Grouped__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2979:1: ( ( ( rule__Grouped__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2980:1: ( ( rule__Grouped__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2980:1: ( ( rule__Grouped__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2981:1: ( rule__Grouped__Group_2_2__0 )*
            {
             before(grammarAccess.getGroupedAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2982:1: ( rule__Grouped__Group_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2982:2: rule__Grouped__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Grouped__Group_2_2__0_in_rule__Grouped__Group_2__2__Impl6042);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2992:1: rule__Grouped__Group_2__3 : rule__Grouped__Group_2__3__Impl ;
    public final void rule__Grouped__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2996:1: ( rule__Grouped__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2997:2: rule__Grouped__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2__3__Impl_in_rule__Grouped__Group_2__36073);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3003:1: rule__Grouped__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Grouped__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3007:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3008:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3008:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3009:1: RightSquareBracket
            {
             before(grammarAccess.getGroupedAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Grouped__Group_2__3__Impl6101); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3030:1: rule__Grouped__Group_2_2__0 : rule__Grouped__Group_2_2__0__Impl rule__Grouped__Group_2_2__1 ;
    public final void rule__Grouped__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3034:1: ( rule__Grouped__Group_2_2__0__Impl rule__Grouped__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3035:2: rule__Grouped__Group_2_2__0__Impl rule__Grouped__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2_2__0__Impl_in_rule__Grouped__Group_2_2__06140);
            rule__Grouped__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_2_2__1_in_rule__Grouped__Group_2_2__06143);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3042:1: rule__Grouped__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Grouped__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3046:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3047:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3047:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3048:1: Comma
            {
             before(grammarAccess.getGroupedAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Grouped__Group_2_2__0__Impl6171); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3061:1: rule__Grouped__Group_2_2__1 : rule__Grouped__Group_2_2__1__Impl ;
    public final void rule__Grouped__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3065:1: ( rule__Grouped__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3066:2: rule__Grouped__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2_2__1__Impl_in_rule__Grouped__Group_2_2__16202);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3072:1: rule__Grouped__Group_2_2__1__Impl : ( ( rule__Grouped__ConstrainsAssignment_2_2_1 ) ) ;
    public final void rule__Grouped__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3076:1: ( ( ( rule__Grouped__ConstrainsAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3077:1: ( ( rule__Grouped__ConstrainsAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3077:1: ( ( rule__Grouped__ConstrainsAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3078:1: ( rule__Grouped__ConstrainsAssignment_2_2_1 )
            {
             before(grammarAccess.getGroupedAccess().getConstrainsAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3079:1: ( rule__Grouped__ConstrainsAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3079:2: rule__Grouped__ConstrainsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Grouped__ConstrainsAssignment_2_2_1_in_rule__Grouped__Group_2_2__1__Impl6229);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3093:1: rule__Mandatory__Group__0 : rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 ;
    public final void rule__Mandatory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3097:1: ( rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3098:2: rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__06263);
            rule__Mandatory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__06266);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3105:1: rule__Mandatory__Group__0__Impl : ( ( rule__Mandatory__NameAssignment_0 ) ) ;
    public final void rule__Mandatory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3109:1: ( ( ( rule__Mandatory__NameAssignment_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3110:1: ( ( rule__Mandatory__NameAssignment_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3110:1: ( ( rule__Mandatory__NameAssignment_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3111:1: ( rule__Mandatory__NameAssignment_0 )
            {
             before(grammarAccess.getMandatoryAccess().getNameAssignment_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3112:1: ( rule__Mandatory__NameAssignment_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3112:2: rule__Mandatory__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Mandatory__NameAssignment_0_in_rule__Mandatory__Group__0__Impl6293);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3122:1: rule__Mandatory__Group__1 : rule__Mandatory__Group__1__Impl rule__Mandatory__Group__2 ;
    public final void rule__Mandatory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3126:1: ( rule__Mandatory__Group__1__Impl rule__Mandatory__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3127:2: rule__Mandatory__Group__1__Impl rule__Mandatory__Group__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__16323);
            rule__Mandatory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__2_in_rule__Mandatory__Group__16326);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3134:1: rule__Mandatory__Group__1__Impl : ( ( rule__Mandatory__Group_1__0 )? ) ;
    public final void rule__Mandatory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3138:1: ( ( ( rule__Mandatory__Group_1__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3139:1: ( ( rule__Mandatory__Group_1__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3139:1: ( ( rule__Mandatory__Group_1__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3140:1: ( rule__Mandatory__Group_1__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3141:1: ( rule__Mandatory__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LeftCurlyBracket) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3141:2: rule__Mandatory__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_1__0_in_rule__Mandatory__Group__1__Impl6353);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3151:1: rule__Mandatory__Group__2 : rule__Mandatory__Group__2__Impl rule__Mandatory__Group__3 ;
    public final void rule__Mandatory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3155:1: ( rule__Mandatory__Group__2__Impl rule__Mandatory__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3156:2: rule__Mandatory__Group__2__Impl rule__Mandatory__Group__3
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__2__Impl_in_rule__Mandatory__Group__26384);
            rule__Mandatory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__3_in_rule__Mandatory__Group__26387);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3163:1: rule__Mandatory__Group__2__Impl : ( ( rule__Mandatory__Group_2__0 )? ) ;
    public final void rule__Mandatory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3167:1: ( ( ( rule__Mandatory__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3168:1: ( ( rule__Mandatory__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3168:1: ( ( rule__Mandatory__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3169:1: ( rule__Mandatory__Group_2__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3170:1: ( rule__Mandatory__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LeftSquareBracket) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3170:2: rule__Mandatory__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_2__0_in_rule__Mandatory__Group__2__Impl6414);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3180:1: rule__Mandatory__Group__3 : rule__Mandatory__Group__3__Impl ;
    public final void rule__Mandatory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3184:1: ( rule__Mandatory__Group__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3185:2: rule__Mandatory__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__3__Impl_in_rule__Mandatory__Group__36445);
            rule__Mandatory__Group__3__Impl();

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3191:1: rule__Mandatory__Group__3__Impl : ( ( rule__Mandatory__Group_3__0 )? ) ;
    public final void rule__Mandatory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3195:1: ( ( ( rule__Mandatory__Group_3__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3196:1: ( ( rule__Mandatory__Group_3__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3196:1: ( ( rule__Mandatory__Group_3__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3197:1: ( rule__Mandatory__Group_3__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3198:1: ( rule__Mandatory__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Xor||LA24_0==Or) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3198:2: rule__Mandatory__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_3__0_in_rule__Mandatory__Group__3__Impl6472);
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


    // $ANTLR start "rule__Mandatory__Group_1__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3216:1: rule__Mandatory__Group_1__0 : rule__Mandatory__Group_1__0__Impl rule__Mandatory__Group_1__1 ;
    public final void rule__Mandatory__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3220:1: ( rule__Mandatory__Group_1__0__Impl rule__Mandatory__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3221:2: rule__Mandatory__Group_1__0__Impl rule__Mandatory__Group_1__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__0__Impl_in_rule__Mandatory__Group_1__06511);
            rule__Mandatory__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1__1_in_rule__Mandatory__Group_1__06514);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3228:1: rule__Mandatory__Group_1__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Mandatory__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3232:1: ( ( LeftCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3233:1: ( LeftCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3233:1: ( LeftCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3234:1: LeftCurlyBracket
            {
             before(grammarAccess.getMandatoryAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__Mandatory__Group_1__0__Impl6542); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3247:1: rule__Mandatory__Group_1__1 : rule__Mandatory__Group_1__1__Impl rule__Mandatory__Group_1__2 ;
    public final void rule__Mandatory__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3251:1: ( rule__Mandatory__Group_1__1__Impl rule__Mandatory__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3252:2: rule__Mandatory__Group_1__1__Impl rule__Mandatory__Group_1__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__1__Impl_in_rule__Mandatory__Group_1__16573);
            rule__Mandatory__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1__2_in_rule__Mandatory__Group_1__16576);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3259:1: rule__Mandatory__Group_1__1__Impl : ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) ) ;
    public final void rule__Mandatory__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3263:1: ( ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3264:1: ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3264:1: ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3265:1: ( rule__Mandatory__SubfeatureAssignment_1_1 )
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3266:1: ( rule__Mandatory__SubfeatureAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3266:2: rule__Mandatory__SubfeatureAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Mandatory__SubfeatureAssignment_1_1_in_rule__Mandatory__Group_1__1__Impl6603);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3276:1: rule__Mandatory__Group_1__2 : rule__Mandatory__Group_1__2__Impl rule__Mandatory__Group_1__3 ;
    public final void rule__Mandatory__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3280:1: ( rule__Mandatory__Group_1__2__Impl rule__Mandatory__Group_1__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3281:2: rule__Mandatory__Group_1__2__Impl rule__Mandatory__Group_1__3
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__2__Impl_in_rule__Mandatory__Group_1__26633);
            rule__Mandatory__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1__3_in_rule__Mandatory__Group_1__26636);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3288:1: rule__Mandatory__Group_1__2__Impl : ( ( rule__Mandatory__Group_1_2__0 )* ) ;
    public final void rule__Mandatory__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3292:1: ( ( ( rule__Mandatory__Group_1_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3293:1: ( ( rule__Mandatory__Group_1_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3293:1: ( ( rule__Mandatory__Group_1_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3294:1: ( rule__Mandatory__Group_1_2__0 )*
            {
             before(grammarAccess.getMandatoryAccess().getGroup_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3295:1: ( rule__Mandatory__Group_1_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Comma) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3295:2: rule__Mandatory__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__Group_1_2__0_in_rule__Mandatory__Group_1__2__Impl6663);
            	    rule__Mandatory__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3305:1: rule__Mandatory__Group_1__3 : rule__Mandatory__Group_1__3__Impl ;
    public final void rule__Mandatory__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3309:1: ( rule__Mandatory__Group_1__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3310:2: rule__Mandatory__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__3__Impl_in_rule__Mandatory__Group_1__36694);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3316:1: rule__Mandatory__Group_1__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Mandatory__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3320:1: ( ( RightCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3321:1: ( RightCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3321:1: ( RightCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3322:1: RightCurlyBracket
            {
             before(grammarAccess.getMandatoryAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__Mandatory__Group_1__3__Impl6722); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3343:1: rule__Mandatory__Group_1_2__0 : rule__Mandatory__Group_1_2__0__Impl rule__Mandatory__Group_1_2__1 ;
    public final void rule__Mandatory__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3347:1: ( rule__Mandatory__Group_1_2__0__Impl rule__Mandatory__Group_1_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3348:2: rule__Mandatory__Group_1_2__0__Impl rule__Mandatory__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1_2__0__Impl_in_rule__Mandatory__Group_1_2__06761);
            rule__Mandatory__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1_2__1_in_rule__Mandatory__Group_1_2__06764);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3355:1: rule__Mandatory__Group_1_2__0__Impl : ( Comma ) ;
    public final void rule__Mandatory__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3359:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3360:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3360:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3361:1: Comma
            {
             before(grammarAccess.getMandatoryAccess().getCommaKeyword_1_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Mandatory__Group_1_2__0__Impl6792); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3374:1: rule__Mandatory__Group_1_2__1 : rule__Mandatory__Group_1_2__1__Impl ;
    public final void rule__Mandatory__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3378:1: ( rule__Mandatory__Group_1_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3379:2: rule__Mandatory__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1_2__1__Impl_in_rule__Mandatory__Group_1_2__16823);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3385:1: rule__Mandatory__Group_1_2__1__Impl : ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) ) ;
    public final void rule__Mandatory__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3389:1: ( ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3390:1: ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3390:1: ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3391:1: ( rule__Mandatory__SubfeatureAssignment_1_2_1 )
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureAssignment_1_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3392:1: ( rule__Mandatory__SubfeatureAssignment_1_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3392:2: rule__Mandatory__SubfeatureAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Mandatory__SubfeatureAssignment_1_2_1_in_rule__Mandatory__Group_1_2__1__Impl6850);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3406:1: rule__Mandatory__Group_2__0 : rule__Mandatory__Group_2__0__Impl rule__Mandatory__Group_2__1 ;
    public final void rule__Mandatory__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3410:1: ( rule__Mandatory__Group_2__0__Impl rule__Mandatory__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3411:2: rule__Mandatory__Group_2__0__Impl rule__Mandatory__Group_2__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__0__Impl_in_rule__Mandatory__Group_2__06884);
            rule__Mandatory__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2__1_in_rule__Mandatory__Group_2__06887);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3418:1: rule__Mandatory__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Mandatory__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3422:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3423:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3423:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3424:1: LeftSquareBracket
            {
             before(grammarAccess.getMandatoryAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Mandatory__Group_2__0__Impl6915); 
             after(grammarAccess.getMandatoryAccess().getLeftSquareBracketKeyword_2_0()); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3437:1: rule__Mandatory__Group_2__1 : rule__Mandatory__Group_2__1__Impl rule__Mandatory__Group_2__2 ;
    public final void rule__Mandatory__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3441:1: ( rule__Mandatory__Group_2__1__Impl rule__Mandatory__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3442:2: rule__Mandatory__Group_2__1__Impl rule__Mandatory__Group_2__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__1__Impl_in_rule__Mandatory__Group_2__16946);
            rule__Mandatory__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2__2_in_rule__Mandatory__Group_2__16949);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3449:1: rule__Mandatory__Group_2__1__Impl : ( ( rule__Mandatory__ConstrainsAssignment_2_1 ) ) ;
    public final void rule__Mandatory__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3453:1: ( ( ( rule__Mandatory__ConstrainsAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3454:1: ( ( rule__Mandatory__ConstrainsAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3454:1: ( ( rule__Mandatory__ConstrainsAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3455:1: ( rule__Mandatory__ConstrainsAssignment_2_1 )
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3456:1: ( rule__Mandatory__ConstrainsAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3456:2: rule__Mandatory__ConstrainsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Mandatory__ConstrainsAssignment_2_1_in_rule__Mandatory__Group_2__1__Impl6976);
            rule__Mandatory__ConstrainsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getConstrainsAssignment_2_1()); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3466:1: rule__Mandatory__Group_2__2 : rule__Mandatory__Group_2__2__Impl rule__Mandatory__Group_2__3 ;
    public final void rule__Mandatory__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3470:1: ( rule__Mandatory__Group_2__2__Impl rule__Mandatory__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3471:2: rule__Mandatory__Group_2__2__Impl rule__Mandatory__Group_2__3
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__2__Impl_in_rule__Mandatory__Group_2__27006);
            rule__Mandatory__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2__3_in_rule__Mandatory__Group_2__27009);
            rule__Mandatory__Group_2__3();

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3478:1: rule__Mandatory__Group_2__2__Impl : ( ( rule__Mandatory__Group_2_2__0 )* ) ;
    public final void rule__Mandatory__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3482:1: ( ( ( rule__Mandatory__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3483:1: ( ( rule__Mandatory__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3483:1: ( ( rule__Mandatory__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3484:1: ( rule__Mandatory__Group_2_2__0 )*
            {
             before(grammarAccess.getMandatoryAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3485:1: ( rule__Mandatory__Group_2_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3485:2: rule__Mandatory__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__Group_2_2__0_in_rule__Mandatory__Group_2__2__Impl7036);
            	    rule__Mandatory__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMandatoryAccess().getGroup_2_2()); 

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


    // $ANTLR start "rule__Mandatory__Group_2__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3495:1: rule__Mandatory__Group_2__3 : rule__Mandatory__Group_2__3__Impl ;
    public final void rule__Mandatory__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3499:1: ( rule__Mandatory__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3500:2: rule__Mandatory__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__3__Impl_in_rule__Mandatory__Group_2__37067);
            rule__Mandatory__Group_2__3__Impl();

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
    // $ANTLR end "rule__Mandatory__Group_2__3"


    // $ANTLR start "rule__Mandatory__Group_2__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3506:1: rule__Mandatory__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Mandatory__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3510:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3511:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3511:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3512:1: RightSquareBracket
            {
             before(grammarAccess.getMandatoryAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Mandatory__Group_2__3__Impl7095); 
             after(grammarAccess.getMandatoryAccess().getRightSquareBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__Mandatory__Group_2__3__Impl"


    // $ANTLR start "rule__Mandatory__Group_2_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3533:1: rule__Mandatory__Group_2_2__0 : rule__Mandatory__Group_2_2__0__Impl rule__Mandatory__Group_2_2__1 ;
    public final void rule__Mandatory__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3537:1: ( rule__Mandatory__Group_2_2__0__Impl rule__Mandatory__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3538:2: rule__Mandatory__Group_2_2__0__Impl rule__Mandatory__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2_2__0__Impl_in_rule__Mandatory__Group_2_2__07134);
            rule__Mandatory__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2_2__1_in_rule__Mandatory__Group_2_2__07137);
            rule__Mandatory__Group_2_2__1();

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
    // $ANTLR end "rule__Mandatory__Group_2_2__0"


    // $ANTLR start "rule__Mandatory__Group_2_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3545:1: rule__Mandatory__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Mandatory__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3549:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3550:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3550:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3551:1: Comma
            {
             before(grammarAccess.getMandatoryAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Mandatory__Group_2_2__0__Impl7165); 
             after(grammarAccess.getMandatoryAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Mandatory__Group_2_2__0__Impl"


    // $ANTLR start "rule__Mandatory__Group_2_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3564:1: rule__Mandatory__Group_2_2__1 : rule__Mandatory__Group_2_2__1__Impl ;
    public final void rule__Mandatory__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3568:1: ( rule__Mandatory__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3569:2: rule__Mandatory__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2_2__1__Impl_in_rule__Mandatory__Group_2_2__17196);
            rule__Mandatory__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Mandatory__Group_2_2__1"


    // $ANTLR start "rule__Mandatory__Group_2_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3575:1: rule__Mandatory__Group_2_2__1__Impl : ( ( rule__Mandatory__ConstrainsAssignment_2_2_1 ) ) ;
    public final void rule__Mandatory__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3579:1: ( ( ( rule__Mandatory__ConstrainsAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3580:1: ( ( rule__Mandatory__ConstrainsAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3580:1: ( ( rule__Mandatory__ConstrainsAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3581:1: ( rule__Mandatory__ConstrainsAssignment_2_2_1 )
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3582:1: ( rule__Mandatory__ConstrainsAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3582:2: rule__Mandatory__ConstrainsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Mandatory__ConstrainsAssignment_2_2_1_in_rule__Mandatory__Group_2_2__1__Impl7223);
            rule__Mandatory__ConstrainsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getConstrainsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Mandatory__Group_2_2__1__Impl"


    // $ANTLR start "rule__Mandatory__Group_3__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3596:1: rule__Mandatory__Group_3__0 : rule__Mandatory__Group_3__0__Impl rule__Mandatory__Group_3__1 ;
    public final void rule__Mandatory__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3600:1: ( rule__Mandatory__Group_3__0__Impl rule__Mandatory__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3601:2: rule__Mandatory__Group_3__0__Impl rule__Mandatory__Group_3__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_3__0__Impl_in_rule__Mandatory__Group_3__07257);
            rule__Mandatory__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_3__1_in_rule__Mandatory__Group_3__07260);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3608:1: rule__Mandatory__Group_3__0__Impl : ( ( rule__Mandatory__GroupsAssignment_3_0 ) ) ;
    public final void rule__Mandatory__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3612:1: ( ( ( rule__Mandatory__GroupsAssignment_3_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3613:1: ( ( rule__Mandatory__GroupsAssignment_3_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3613:1: ( ( rule__Mandatory__GroupsAssignment_3_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3614:1: ( rule__Mandatory__GroupsAssignment_3_0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroupsAssignment_3_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3615:1: ( rule__Mandatory__GroupsAssignment_3_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3615:2: rule__Mandatory__GroupsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Mandatory__GroupsAssignment_3_0_in_rule__Mandatory__Group_3__0__Impl7287);
            rule__Mandatory__GroupsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getGroupsAssignment_3_0()); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3625:1: rule__Mandatory__Group_3__1 : rule__Mandatory__Group_3__1__Impl ;
    public final void rule__Mandatory__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3629:1: ( rule__Mandatory__Group_3__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3630:2: rule__Mandatory__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_3__1__Impl_in_rule__Mandatory__Group_3__17317);
            rule__Mandatory__Group_3__1__Impl();

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3636:1: rule__Mandatory__Group_3__1__Impl : ( ( rule__Mandatory__GroupsAssignment_3_1 )* ) ;
    public final void rule__Mandatory__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3640:1: ( ( ( rule__Mandatory__GroupsAssignment_3_1 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3641:1: ( ( rule__Mandatory__GroupsAssignment_3_1 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3641:1: ( ( rule__Mandatory__GroupsAssignment_3_1 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3642:1: ( rule__Mandatory__GroupsAssignment_3_1 )*
            {
             before(grammarAccess.getMandatoryAccess().getGroupsAssignment_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3643:1: ( rule__Mandatory__GroupsAssignment_3_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Xor||LA27_0==Or) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3643:2: rule__Mandatory__GroupsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__GroupsAssignment_3_1_in_rule__Mandatory__Group_3__1__Impl7344);
            	    rule__Mandatory__GroupsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMandatoryAccess().getGroupsAssignment_3_1()); 

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


    // $ANTLR start "rule__Optional__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3657:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3661:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3662:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__07379);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__07382);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3669:1: rule__Optional__Group__0__Impl : ( QuestionMark ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3673:1: ( ( QuestionMark ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3674:1: ( QuestionMark )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3674:1: ( QuestionMark )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3675:1: QuestionMark
            {
             before(grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0()); 
            match(input,QuestionMark,FOLLOW_QuestionMark_in_rule__Optional__Group__0__Impl7410); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3688:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl rule__Optional__Group__2 ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3692:1: ( rule__Optional__Group__1__Impl rule__Optional__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3693:2: rule__Optional__Group__1__Impl rule__Optional__Group__2
            {
            pushFollow(FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__17441);
            rule__Optional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__2_in_rule__Optional__Group__17444);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3700:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__NameAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3704:1: ( ( ( rule__Optional__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3705:1: ( ( rule__Optional__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3705:1: ( ( rule__Optional__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3706:1: ( rule__Optional__NameAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3707:1: ( rule__Optional__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3707:2: rule__Optional__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Optional__NameAssignment_1_in_rule__Optional__Group__1__Impl7471);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3717:1: rule__Optional__Group__2 : rule__Optional__Group__2__Impl rule__Optional__Group__3 ;
    public final void rule__Optional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3721:1: ( rule__Optional__Group__2__Impl rule__Optional__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3722:2: rule__Optional__Group__2__Impl rule__Optional__Group__3
            {
            pushFollow(FOLLOW_rule__Optional__Group__2__Impl_in_rule__Optional__Group__27501);
            rule__Optional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__3_in_rule__Optional__Group__27504);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3729:1: rule__Optional__Group__2__Impl : ( ( rule__Optional__Group_2__0 )? ) ;
    public final void rule__Optional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3733:1: ( ( ( rule__Optional__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3734:1: ( ( rule__Optional__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3734:1: ( ( rule__Optional__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3735:1: ( rule__Optional__Group_2__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3736:1: ( rule__Optional__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LeftCurlyBracket) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3736:2: rule__Optional__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_2__0_in_rule__Optional__Group__2__Impl7531);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3746:1: rule__Optional__Group__3 : rule__Optional__Group__3__Impl rule__Optional__Group__4 ;
    public final void rule__Optional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3750:1: ( rule__Optional__Group__3__Impl rule__Optional__Group__4 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3751:2: rule__Optional__Group__3__Impl rule__Optional__Group__4
            {
            pushFollow(FOLLOW_rule__Optional__Group__3__Impl_in_rule__Optional__Group__37562);
            rule__Optional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__4_in_rule__Optional__Group__37565);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3758:1: rule__Optional__Group__3__Impl : ( ( rule__Optional__Group_3__0 )? ) ;
    public final void rule__Optional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3762:1: ( ( ( rule__Optional__Group_3__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3763:1: ( ( rule__Optional__Group_3__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3763:1: ( ( rule__Optional__Group_3__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3764:1: ( rule__Optional__Group_3__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3765:1: ( rule__Optional__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LeftSquareBracket) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3765:2: rule__Optional__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_3__0_in_rule__Optional__Group__3__Impl7592);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3775:1: rule__Optional__Group__4 : rule__Optional__Group__4__Impl ;
    public final void rule__Optional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3779:1: ( rule__Optional__Group__4__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3780:2: rule__Optional__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group__4__Impl_in_rule__Optional__Group__47623);
            rule__Optional__Group__4__Impl();

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3786:1: rule__Optional__Group__4__Impl : ( ( rule__Optional__Group_4__0 )? ) ;
    public final void rule__Optional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3790:1: ( ( ( rule__Optional__Group_4__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3791:1: ( ( rule__Optional__Group_4__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3791:1: ( ( rule__Optional__Group_4__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3792:1: ( rule__Optional__Group_4__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_4()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3793:1: ( rule__Optional__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Xor||LA30_0==Or) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3793:2: rule__Optional__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_4__0_in_rule__Optional__Group__4__Impl7650);
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


    // $ANTLR start "rule__Optional__Group_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3813:1: rule__Optional__Group_2__0 : rule__Optional__Group_2__0__Impl rule__Optional__Group_2__1 ;
    public final void rule__Optional__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3817:1: ( rule__Optional__Group_2__0__Impl rule__Optional__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3818:2: rule__Optional__Group_2__0__Impl rule__Optional__Group_2__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__0__Impl_in_rule__Optional__Group_2__07691);
            rule__Optional__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2__1_in_rule__Optional__Group_2__07694);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3825:1: rule__Optional__Group_2__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Optional__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3829:1: ( ( LeftCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3830:1: ( LeftCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3830:1: ( LeftCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3831:1: LeftCurlyBracket
            {
             before(grammarAccess.getOptionalAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__Optional__Group_2__0__Impl7722); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3844:1: rule__Optional__Group_2__1 : rule__Optional__Group_2__1__Impl rule__Optional__Group_2__2 ;
    public final void rule__Optional__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3848:1: ( rule__Optional__Group_2__1__Impl rule__Optional__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3849:2: rule__Optional__Group_2__1__Impl rule__Optional__Group_2__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__1__Impl_in_rule__Optional__Group_2__17753);
            rule__Optional__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2__2_in_rule__Optional__Group_2__17756);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3856:1: rule__Optional__Group_2__1__Impl : ( ( rule__Optional__SubfeatureAssignment_2_1 ) ) ;
    public final void rule__Optional__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3860:1: ( ( ( rule__Optional__SubfeatureAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3861:1: ( ( rule__Optional__SubfeatureAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3861:1: ( ( rule__Optional__SubfeatureAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3862:1: ( rule__Optional__SubfeatureAssignment_2_1 )
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3863:1: ( rule__Optional__SubfeatureAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3863:2: rule__Optional__SubfeatureAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Optional__SubfeatureAssignment_2_1_in_rule__Optional__Group_2__1__Impl7783);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3873:1: rule__Optional__Group_2__2 : rule__Optional__Group_2__2__Impl rule__Optional__Group_2__3 ;
    public final void rule__Optional__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3877:1: ( rule__Optional__Group_2__2__Impl rule__Optional__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3878:2: rule__Optional__Group_2__2__Impl rule__Optional__Group_2__3
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__2__Impl_in_rule__Optional__Group_2__27813);
            rule__Optional__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2__3_in_rule__Optional__Group_2__27816);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3885:1: rule__Optional__Group_2__2__Impl : ( ( rule__Optional__Group_2_2__0 )* ) ;
    public final void rule__Optional__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3889:1: ( ( ( rule__Optional__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3890:1: ( ( rule__Optional__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3890:1: ( ( rule__Optional__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3891:1: ( rule__Optional__Group_2_2__0 )*
            {
             before(grammarAccess.getOptionalAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3892:1: ( rule__Optional__Group_2_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Comma) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3892:2: rule__Optional__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Optional__Group_2_2__0_in_rule__Optional__Group_2__2__Impl7843);
            	    rule__Optional__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3902:1: rule__Optional__Group_2__3 : rule__Optional__Group_2__3__Impl ;
    public final void rule__Optional__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3906:1: ( rule__Optional__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3907:2: rule__Optional__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__3__Impl_in_rule__Optional__Group_2__37874);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3913:1: rule__Optional__Group_2__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Optional__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3917:1: ( ( RightCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3918:1: ( RightCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3918:1: ( RightCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3919:1: RightCurlyBracket
            {
             before(grammarAccess.getOptionalAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__Optional__Group_2__3__Impl7902); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3940:1: rule__Optional__Group_2_2__0 : rule__Optional__Group_2_2__0__Impl rule__Optional__Group_2_2__1 ;
    public final void rule__Optional__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3944:1: ( rule__Optional__Group_2_2__0__Impl rule__Optional__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3945:2: rule__Optional__Group_2_2__0__Impl rule__Optional__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_2_2__0__Impl_in_rule__Optional__Group_2_2__07941);
            rule__Optional__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2_2__1_in_rule__Optional__Group_2_2__07944);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3952:1: rule__Optional__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Optional__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3956:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3957:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3957:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3958:1: Comma
            {
             before(grammarAccess.getOptionalAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Optional__Group_2_2__0__Impl7972); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3971:1: rule__Optional__Group_2_2__1 : rule__Optional__Group_2_2__1__Impl ;
    public final void rule__Optional__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3975:1: ( rule__Optional__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3976:2: rule__Optional__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_2_2__1__Impl_in_rule__Optional__Group_2_2__18003);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3982:1: rule__Optional__Group_2_2__1__Impl : ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) ) ;
    public final void rule__Optional__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3986:1: ( ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3987:1: ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3987:1: ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3988:1: ( rule__Optional__SubfeatureAssignment_2_2_1 )
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3989:1: ( rule__Optional__SubfeatureAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3989:2: rule__Optional__SubfeatureAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Optional__SubfeatureAssignment_2_2_1_in_rule__Optional__Group_2_2__1__Impl8030);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4003:1: rule__Optional__Group_3__0 : rule__Optional__Group_3__0__Impl rule__Optional__Group_3__1 ;
    public final void rule__Optional__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4007:1: ( rule__Optional__Group_3__0__Impl rule__Optional__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4008:2: rule__Optional__Group_3__0__Impl rule__Optional__Group_3__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__0__Impl_in_rule__Optional__Group_3__08064);
            rule__Optional__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3__1_in_rule__Optional__Group_3__08067);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4015:1: rule__Optional__Group_3__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Optional__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4019:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4020:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4020:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4021:1: LeftSquareBracket
            {
             before(grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Optional__Group_3__0__Impl8095); 
             after(grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_3_0()); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4034:1: rule__Optional__Group_3__1 : rule__Optional__Group_3__1__Impl rule__Optional__Group_3__2 ;
    public final void rule__Optional__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4038:1: ( rule__Optional__Group_3__1__Impl rule__Optional__Group_3__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4039:2: rule__Optional__Group_3__1__Impl rule__Optional__Group_3__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__1__Impl_in_rule__Optional__Group_3__18126);
            rule__Optional__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3__2_in_rule__Optional__Group_3__18129);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4046:1: rule__Optional__Group_3__1__Impl : ( ( rule__Optional__ConstrainsAssignment_3_1 ) ) ;
    public final void rule__Optional__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4050:1: ( ( ( rule__Optional__ConstrainsAssignment_3_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4051:1: ( ( rule__Optional__ConstrainsAssignment_3_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4051:1: ( ( rule__Optional__ConstrainsAssignment_3_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4052:1: ( rule__Optional__ConstrainsAssignment_3_1 )
            {
             before(grammarAccess.getOptionalAccess().getConstrainsAssignment_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4053:1: ( rule__Optional__ConstrainsAssignment_3_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4053:2: rule__Optional__ConstrainsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Optional__ConstrainsAssignment_3_1_in_rule__Optional__Group_3__1__Impl8156);
            rule__Optional__ConstrainsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getConstrainsAssignment_3_1()); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4063:1: rule__Optional__Group_3__2 : rule__Optional__Group_3__2__Impl rule__Optional__Group_3__3 ;
    public final void rule__Optional__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4067:1: ( rule__Optional__Group_3__2__Impl rule__Optional__Group_3__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4068:2: rule__Optional__Group_3__2__Impl rule__Optional__Group_3__3
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__2__Impl_in_rule__Optional__Group_3__28186);
            rule__Optional__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3__3_in_rule__Optional__Group_3__28189);
            rule__Optional__Group_3__3();

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4075:1: rule__Optional__Group_3__2__Impl : ( ( rule__Optional__Group_3_2__0 )* ) ;
    public final void rule__Optional__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4079:1: ( ( ( rule__Optional__Group_3_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4080:1: ( ( rule__Optional__Group_3_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4080:1: ( ( rule__Optional__Group_3_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4081:1: ( rule__Optional__Group_3_2__0 )*
            {
             before(grammarAccess.getOptionalAccess().getGroup_3_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4082:1: ( rule__Optional__Group_3_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4082:2: rule__Optional__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Optional__Group_3_2__0_in_rule__Optional__Group_3__2__Impl8216);
            	    rule__Optional__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getOptionalAccess().getGroup_3_2()); 

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


    // $ANTLR start "rule__Optional__Group_3__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4092:1: rule__Optional__Group_3__3 : rule__Optional__Group_3__3__Impl ;
    public final void rule__Optional__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4096:1: ( rule__Optional__Group_3__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4097:2: rule__Optional__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__3__Impl_in_rule__Optional__Group_3__38247);
            rule__Optional__Group_3__3__Impl();

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
    // $ANTLR end "rule__Optional__Group_3__3"


    // $ANTLR start "rule__Optional__Group_3__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4103:1: rule__Optional__Group_3__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Optional__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4107:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4108:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4108:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4109:1: RightSquareBracket
            {
             before(grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Optional__Group_3__3__Impl8275); 
             after(grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_3_3()); 

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
    // $ANTLR end "rule__Optional__Group_3__3__Impl"


    // $ANTLR start "rule__Optional__Group_3_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4130:1: rule__Optional__Group_3_2__0 : rule__Optional__Group_3_2__0__Impl rule__Optional__Group_3_2__1 ;
    public final void rule__Optional__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4134:1: ( rule__Optional__Group_3_2__0__Impl rule__Optional__Group_3_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4135:2: rule__Optional__Group_3_2__0__Impl rule__Optional__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_3_2__0__Impl_in_rule__Optional__Group_3_2__08314);
            rule__Optional__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3_2__1_in_rule__Optional__Group_3_2__08317);
            rule__Optional__Group_3_2__1();

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
    // $ANTLR end "rule__Optional__Group_3_2__0"


    // $ANTLR start "rule__Optional__Group_3_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4142:1: rule__Optional__Group_3_2__0__Impl : ( Comma ) ;
    public final void rule__Optional__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4146:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4147:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4147:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4148:1: Comma
            {
             before(grammarAccess.getOptionalAccess().getCommaKeyword_3_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Optional__Group_3_2__0__Impl8345); 
             after(grammarAccess.getOptionalAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Optional__Group_3_2__0__Impl"


    // $ANTLR start "rule__Optional__Group_3_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4161:1: rule__Optional__Group_3_2__1 : rule__Optional__Group_3_2__1__Impl ;
    public final void rule__Optional__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4165:1: ( rule__Optional__Group_3_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4166:2: rule__Optional__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_3_2__1__Impl_in_rule__Optional__Group_3_2__18376);
            rule__Optional__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Optional__Group_3_2__1"


    // $ANTLR start "rule__Optional__Group_3_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4172:1: rule__Optional__Group_3_2__1__Impl : ( ( rule__Optional__ConstrainsAssignment_3_2_1 ) ) ;
    public final void rule__Optional__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4176:1: ( ( ( rule__Optional__ConstrainsAssignment_3_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4177:1: ( ( rule__Optional__ConstrainsAssignment_3_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4177:1: ( ( rule__Optional__ConstrainsAssignment_3_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4178:1: ( rule__Optional__ConstrainsAssignment_3_2_1 )
            {
             before(grammarAccess.getOptionalAccess().getConstrainsAssignment_3_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4179:1: ( rule__Optional__ConstrainsAssignment_3_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4179:2: rule__Optional__ConstrainsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Optional__ConstrainsAssignment_3_2_1_in_rule__Optional__Group_3_2__1__Impl8403);
            rule__Optional__ConstrainsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getConstrainsAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Optional__Group_3_2__1__Impl"


    // $ANTLR start "rule__Optional__Group_4__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4193:1: rule__Optional__Group_4__0 : rule__Optional__Group_4__0__Impl rule__Optional__Group_4__1 ;
    public final void rule__Optional__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4197:1: ( rule__Optional__Group_4__0__Impl rule__Optional__Group_4__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4198:2: rule__Optional__Group_4__0__Impl rule__Optional__Group_4__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_4__0__Impl_in_rule__Optional__Group_4__08437);
            rule__Optional__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_4__1_in_rule__Optional__Group_4__08440);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4205:1: rule__Optional__Group_4__0__Impl : ( ( rule__Optional__GroupsAssignment_4_0 ) ) ;
    public final void rule__Optional__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4209:1: ( ( ( rule__Optional__GroupsAssignment_4_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4210:1: ( ( rule__Optional__GroupsAssignment_4_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4210:1: ( ( rule__Optional__GroupsAssignment_4_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4211:1: ( rule__Optional__GroupsAssignment_4_0 )
            {
             before(grammarAccess.getOptionalAccess().getGroupsAssignment_4_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4212:1: ( rule__Optional__GroupsAssignment_4_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4212:2: rule__Optional__GroupsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Optional__GroupsAssignment_4_0_in_rule__Optional__Group_4__0__Impl8467);
            rule__Optional__GroupsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getGroupsAssignment_4_0()); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4222:1: rule__Optional__Group_4__1 : rule__Optional__Group_4__1__Impl ;
    public final void rule__Optional__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4226:1: ( rule__Optional__Group_4__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4227:2: rule__Optional__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_4__1__Impl_in_rule__Optional__Group_4__18497);
            rule__Optional__Group_4__1__Impl();

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4233:1: rule__Optional__Group_4__1__Impl : ( ( rule__Optional__GroupsAssignment_4_1 )* ) ;
    public final void rule__Optional__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4237:1: ( ( ( rule__Optional__GroupsAssignment_4_1 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4238:1: ( ( rule__Optional__GroupsAssignment_4_1 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4238:1: ( ( rule__Optional__GroupsAssignment_4_1 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4239:1: ( rule__Optional__GroupsAssignment_4_1 )*
            {
             before(grammarAccess.getOptionalAccess().getGroupsAssignment_4_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4240:1: ( rule__Optional__GroupsAssignment_4_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Xor||LA33_0==Or) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4240:2: rule__Optional__GroupsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Optional__GroupsAssignment_4_1_in_rule__Optional__Group_4__1__Impl8524);
            	    rule__Optional__GroupsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getOptionalAccess().getGroupsAssignment_4_1()); 

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


    // $ANTLR start "rule__Or__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4254:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4258:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4259:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__08559);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__08562);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4266:1: rule__Or__Group__0__Impl : ( Or ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4270:1: ( ( Or ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4271:1: ( Or )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4271:1: ( Or )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4272:1: Or
            {
             before(grammarAccess.getOrAccess().getOrKeyword_0()); 
            match(input,Or,FOLLOW_Or_in_rule__Or__Group__0__Impl8590); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4285:1: rule__Or__Group__1 : rule__Or__Group__1__Impl rule__Or__Group__2 ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4289:1: ( rule__Or__Group__1__Impl rule__Or__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4290:2: rule__Or__Group__1__Impl rule__Or__Group__2
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__18621);
            rule__Or__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__2_in_rule__Or__Group__18624);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4297:1: rule__Or__Group__1__Impl : ( ( rule__Or__NameAssignment_1 ) ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4301:1: ( ( ( rule__Or__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4302:1: ( ( rule__Or__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4302:1: ( ( rule__Or__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4303:1: ( rule__Or__NameAssignment_1 )
            {
             before(grammarAccess.getOrAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4304:1: ( rule__Or__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4304:2: rule__Or__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Or__NameAssignment_1_in_rule__Or__Group__1__Impl8651);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4314:1: rule__Or__Group__2 : rule__Or__Group__2__Impl ;
    public final void rule__Or__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4318:1: ( rule__Or__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4319:2: rule__Or__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__28681);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4325:1: rule__Or__Group__2__Impl : ( ( rule__Or__Group_2__0 )? ) ;
    public final void rule__Or__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4329:1: ( ( ( rule__Or__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4330:1: ( ( rule__Or__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4330:1: ( ( rule__Or__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4331:1: ( rule__Or__Group_2__0 )?
            {
             before(grammarAccess.getOrAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4332:1: ( rule__Or__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_BEGIN) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4332:2: rule__Or__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Or__Group_2__0_in_rule__Or__Group__2__Impl8708);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4348:1: rule__Or__Group_2__0 : rule__Or__Group_2__0__Impl rule__Or__Group_2__1 ;
    public final void rule__Or__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4352:1: ( rule__Or__Group_2__0__Impl rule__Or__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4353:2: rule__Or__Group_2__0__Impl rule__Or__Group_2__1
            {
            pushFollow(FOLLOW_rule__Or__Group_2__0__Impl_in_rule__Or__Group_2__08745);
            rule__Or__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2__1_in_rule__Or__Group_2__08748);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4360:1: rule__Or__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Or__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4364:1: ( ( RULE_BEGIN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4365:1: ( RULE_BEGIN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4365:1: ( RULE_BEGIN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4366:1: RULE_BEGIN
            {
             before(grammarAccess.getOrAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Or__Group_2__0__Impl8775); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4377:1: rule__Or__Group_2__1 : rule__Or__Group_2__1__Impl rule__Or__Group_2__2 ;
    public final void rule__Or__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4381:1: ( rule__Or__Group_2__1__Impl rule__Or__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4382:2: rule__Or__Group_2__1__Impl rule__Or__Group_2__2
            {
            pushFollow(FOLLOW_rule__Or__Group_2__1__Impl_in_rule__Or__Group_2__18804);
            rule__Or__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2__2_in_rule__Or__Group_2__18807);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4389:1: rule__Or__Group_2__1__Impl : ( ( rule__Or__GroupedAssignment_2_1 ) ) ;
    public final void rule__Or__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4393:1: ( ( ( rule__Or__GroupedAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4394:1: ( ( rule__Or__GroupedAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4394:1: ( ( rule__Or__GroupedAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4395:1: ( rule__Or__GroupedAssignment_2_1 )
            {
             before(grammarAccess.getOrAccess().getGroupedAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4396:1: ( rule__Or__GroupedAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4396:2: rule__Or__GroupedAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Or__GroupedAssignment_2_1_in_rule__Or__Group_2__1__Impl8834);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4406:1: rule__Or__Group_2__2 : rule__Or__Group_2__2__Impl rule__Or__Group_2__3 ;
    public final void rule__Or__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4410:1: ( rule__Or__Group_2__2__Impl rule__Or__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4411:2: rule__Or__Group_2__2__Impl rule__Or__Group_2__3
            {
            pushFollow(FOLLOW_rule__Or__Group_2__2__Impl_in_rule__Or__Group_2__28864);
            rule__Or__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2__3_in_rule__Or__Group_2__28867);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4418:1: rule__Or__Group_2__2__Impl : ( ( rule__Or__Group_2_2__0 )* ) ;
    public final void rule__Or__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4422:1: ( ( ( rule__Or__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4423:1: ( ( rule__Or__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4423:1: ( ( rule__Or__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4424:1: ( rule__Or__Group_2_2__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4425:1: ( rule__Or__Group_2_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Comma||LA35_0==RULE_NULL||LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4425:2: rule__Or__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_2_2__0_in_rule__Or__Group_2__2__Impl8894);
            	    rule__Or__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4435:1: rule__Or__Group_2__3 : rule__Or__Group_2__3__Impl ;
    public final void rule__Or__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4439:1: ( rule__Or__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4440:2: rule__Or__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_2__3__Impl_in_rule__Or__Group_2__38925);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4446:1: rule__Or__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Or__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4450:1: ( ( RULE_END ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4451:1: ( RULE_END )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4451:1: ( RULE_END )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4452:1: RULE_END
            {
             before(grammarAccess.getOrAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Or__Group_2__3__Impl8952); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4471:1: rule__Or__Group_2_2__0 : rule__Or__Group_2_2__0__Impl rule__Or__Group_2_2__1 ;
    public final void rule__Or__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4475:1: ( rule__Or__Group_2_2__0__Impl rule__Or__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4476:2: rule__Or__Group_2_2__0__Impl rule__Or__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Or__Group_2_2__0__Impl_in_rule__Or__Group_2_2__08989);
            rule__Or__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2_2__1_in_rule__Or__Group_2_2__08992);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4483:1: rule__Or__Group_2_2__0__Impl : ( ( Comma )* ) ;
    public final void rule__Or__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4487:1: ( ( ( Comma )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4488:1: ( ( Comma )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4488:1: ( ( Comma )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4489:1: ( Comma )*
            {
             before(grammarAccess.getOrAccess().getCommaKeyword_2_2_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4490:1: ( Comma )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==Comma) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4491:2: Comma
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_rule__Or__Group_2_2__0__Impl9021); 

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4502:1: rule__Or__Group_2_2__1 : rule__Or__Group_2_2__1__Impl ;
    public final void rule__Or__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4506:1: ( rule__Or__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4507:2: rule__Or__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_2_2__1__Impl_in_rule__Or__Group_2_2__19054);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4513:1: rule__Or__Group_2_2__1__Impl : ( ( rule__Or__GroupedAssignment_2_2_1 ) ) ;
    public final void rule__Or__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4517:1: ( ( ( rule__Or__GroupedAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4518:1: ( ( rule__Or__GroupedAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4518:1: ( ( rule__Or__GroupedAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4519:1: ( rule__Or__GroupedAssignment_2_2_1 )
            {
             before(grammarAccess.getOrAccess().getGroupedAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4520:1: ( rule__Or__GroupedAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4520:2: rule__Or__GroupedAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Or__GroupedAssignment_2_2_1_in_rule__Or__Group_2_2__1__Impl9081);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4534:1: rule__Xor__Group__0 : rule__Xor__Group__0__Impl rule__Xor__Group__1 ;
    public final void rule__Xor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4538:1: ( rule__Xor__Group__0__Impl rule__Xor__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4539:2: rule__Xor__Group__0__Impl rule__Xor__Group__1
            {
            pushFollow(FOLLOW_rule__Xor__Group__0__Impl_in_rule__Xor__Group__09115);
            rule__Xor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group__1_in_rule__Xor__Group__09118);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4546:1: rule__Xor__Group__0__Impl : ( Xor ) ;
    public final void rule__Xor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4550:1: ( ( Xor ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4551:1: ( Xor )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4551:1: ( Xor )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4552:1: Xor
            {
             before(grammarAccess.getXorAccess().getXorKeyword_0()); 
            match(input,Xor,FOLLOW_Xor_in_rule__Xor__Group__0__Impl9146); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4565:1: rule__Xor__Group__1 : rule__Xor__Group__1__Impl rule__Xor__Group__2 ;
    public final void rule__Xor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4569:1: ( rule__Xor__Group__1__Impl rule__Xor__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4570:2: rule__Xor__Group__1__Impl rule__Xor__Group__2
            {
            pushFollow(FOLLOW_rule__Xor__Group__1__Impl_in_rule__Xor__Group__19177);
            rule__Xor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group__2_in_rule__Xor__Group__19180);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4577:1: rule__Xor__Group__1__Impl : ( ( rule__Xor__NameAssignment_1 ) ) ;
    public final void rule__Xor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4581:1: ( ( ( rule__Xor__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4582:1: ( ( rule__Xor__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4582:1: ( ( rule__Xor__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4583:1: ( rule__Xor__NameAssignment_1 )
            {
             before(grammarAccess.getXorAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4584:1: ( rule__Xor__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4584:2: rule__Xor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Xor__NameAssignment_1_in_rule__Xor__Group__1__Impl9207);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4594:1: rule__Xor__Group__2 : rule__Xor__Group__2__Impl ;
    public final void rule__Xor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4598:1: ( rule__Xor__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4599:2: rule__Xor__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Xor__Group__2__Impl_in_rule__Xor__Group__29237);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4605:1: rule__Xor__Group__2__Impl : ( ( rule__Xor__Group_2__0 )? ) ;
    public final void rule__Xor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4609:1: ( ( ( rule__Xor__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4610:1: ( ( rule__Xor__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4610:1: ( ( rule__Xor__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4611:1: ( rule__Xor__Group_2__0 )?
            {
             before(grammarAccess.getXorAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4612:1: ( rule__Xor__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_BEGIN) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4612:2: rule__Xor__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Xor__Group_2__0_in_rule__Xor__Group__2__Impl9264);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4628:1: rule__Xor__Group_2__0 : rule__Xor__Group_2__0__Impl rule__Xor__Group_2__1 ;
    public final void rule__Xor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4632:1: ( rule__Xor__Group_2__0__Impl rule__Xor__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4633:2: rule__Xor__Group_2__0__Impl rule__Xor__Group_2__1
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__0__Impl_in_rule__Xor__Group_2__09301);
            rule__Xor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2__1_in_rule__Xor__Group_2__09304);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4640:1: rule__Xor__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Xor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4644:1: ( ( RULE_BEGIN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4645:1: ( RULE_BEGIN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4645:1: ( RULE_BEGIN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4646:1: RULE_BEGIN
            {
             before(grammarAccess.getXorAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Xor__Group_2__0__Impl9331); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4657:1: rule__Xor__Group_2__1 : rule__Xor__Group_2__1__Impl rule__Xor__Group_2__2 ;
    public final void rule__Xor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4661:1: ( rule__Xor__Group_2__1__Impl rule__Xor__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4662:2: rule__Xor__Group_2__1__Impl rule__Xor__Group_2__2
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__1__Impl_in_rule__Xor__Group_2__19360);
            rule__Xor__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2__2_in_rule__Xor__Group_2__19363);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4669:1: rule__Xor__Group_2__1__Impl : ( ( rule__Xor__GroupedAssignment_2_1 ) ) ;
    public final void rule__Xor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4673:1: ( ( ( rule__Xor__GroupedAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4674:1: ( ( rule__Xor__GroupedAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4674:1: ( ( rule__Xor__GroupedAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4675:1: ( rule__Xor__GroupedAssignment_2_1 )
            {
             before(grammarAccess.getXorAccess().getGroupedAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4676:1: ( rule__Xor__GroupedAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4676:2: rule__Xor__GroupedAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Xor__GroupedAssignment_2_1_in_rule__Xor__Group_2__1__Impl9390);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4686:1: rule__Xor__Group_2__2 : rule__Xor__Group_2__2__Impl rule__Xor__Group_2__3 ;
    public final void rule__Xor__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4690:1: ( rule__Xor__Group_2__2__Impl rule__Xor__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4691:2: rule__Xor__Group_2__2__Impl rule__Xor__Group_2__3
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__2__Impl_in_rule__Xor__Group_2__29420);
            rule__Xor__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2__3_in_rule__Xor__Group_2__29423);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4698:1: rule__Xor__Group_2__2__Impl : ( ( rule__Xor__Group_2_2__0 )* ) ;
    public final void rule__Xor__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4702:1: ( ( ( rule__Xor__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4703:1: ( ( rule__Xor__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4703:1: ( ( rule__Xor__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4704:1: ( rule__Xor__Group_2_2__0 )*
            {
             before(grammarAccess.getXorAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4705:1: ( rule__Xor__Group_2_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==Comma||LA38_0==RULE_NULL||LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4705:2: rule__Xor__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Xor__Group_2_2__0_in_rule__Xor__Group_2__2__Impl9450);
            	    rule__Xor__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4715:1: rule__Xor__Group_2__3 : rule__Xor__Group_2__3__Impl ;
    public final void rule__Xor__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4719:1: ( rule__Xor__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4720:2: rule__Xor__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__3__Impl_in_rule__Xor__Group_2__39481);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4726:1: rule__Xor__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Xor__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4730:1: ( ( RULE_END ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4731:1: ( RULE_END )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4731:1: ( RULE_END )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4732:1: RULE_END
            {
             before(grammarAccess.getXorAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Xor__Group_2__3__Impl9508); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4751:1: rule__Xor__Group_2_2__0 : rule__Xor__Group_2_2__0__Impl rule__Xor__Group_2_2__1 ;
    public final void rule__Xor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4755:1: ( rule__Xor__Group_2_2__0__Impl rule__Xor__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4756:2: rule__Xor__Group_2_2__0__Impl rule__Xor__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Xor__Group_2_2__0__Impl_in_rule__Xor__Group_2_2__09545);
            rule__Xor__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2_2__1_in_rule__Xor__Group_2_2__09548);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4763:1: rule__Xor__Group_2_2__0__Impl : ( ( Comma )* ) ;
    public final void rule__Xor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4767:1: ( ( ( Comma )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4768:1: ( ( Comma )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4768:1: ( ( Comma )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4769:1: ( Comma )*
            {
             before(grammarAccess.getXorAccess().getCommaKeyword_2_2_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4770:1: ( Comma )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Comma) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4771:2: Comma
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_rule__Xor__Group_2_2__0__Impl9577); 

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4782:1: rule__Xor__Group_2_2__1 : rule__Xor__Group_2_2__1__Impl ;
    public final void rule__Xor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4786:1: ( rule__Xor__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4787:2: rule__Xor__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Xor__Group_2_2__1__Impl_in_rule__Xor__Group_2_2__19610);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4793:1: rule__Xor__Group_2_2__1__Impl : ( ( rule__Xor__GroupedAssignment_2_2_1 ) ) ;
    public final void rule__Xor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4797:1: ( ( ( rule__Xor__GroupedAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4798:1: ( ( rule__Xor__GroupedAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4798:1: ( ( rule__Xor__GroupedAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4799:1: ( rule__Xor__GroupedAssignment_2_2_1 )
            {
             before(grammarAccess.getXorAccess().getGroupedAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4800:1: ( rule__Xor__GroupedAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4800:2: rule__Xor__GroupedAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Xor__GroupedAssignment_2_2_1_in_rule__Xor__Group_2_2__1__Impl9637);
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


    // $ANTLR start "rule__Model__RootAssignment"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4815:1: rule__Model__RootAssignment : ( ruleFeature_Impl ) ;
    public final void rule__Model__RootAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4819:1: ( ( ruleFeature_Impl ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4820:1: ( ruleFeature_Impl )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4820:1: ( ruleFeature_Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4821:1: ruleFeature_Impl
            {
             before(grammarAccess.getModelAccess().getRootFeature_ImplParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFeature_Impl_in_rule__Model__RootAssignment9676);
            ruleFeature_Impl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRootFeature_ImplParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__RootAssignment"


    // $ANTLR start "rule__Constrain__OperatorAssignment_1_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4830:1: rule__Constrain__OperatorAssignment_1_1 : ( ruleDisjunctiveOperator ) ;
    public final void rule__Constrain__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4834:1: ( ( ruleDisjunctiveOperator ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4835:1: ( ruleDisjunctiveOperator )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4835:1: ( ruleDisjunctiveOperator )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4836:1: ruleDisjunctiveOperator
            {
             before(grammarAccess.getConstrainAccess().getOperatorDisjunctiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDisjunctiveOperator_in_rule__Constrain__OperatorAssignment_1_19707);
            ruleDisjunctiveOperator();

            state._fsp--;

             after(grammarAccess.getConstrainAccess().getOperatorDisjunctiveOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Constrain__OperatorAssignment_1_1"


    // $ANTLR start "rule__Constrain__RightExpAssignment_1_2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4845:1: rule__Constrain__RightExpAssignment_1_2 : ( ruleConjunction ) ;
    public final void rule__Constrain__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4849:1: ( ( ruleConjunction ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4850:1: ( ruleConjunction )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4850:1: ( ruleConjunction )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4851:1: ruleConjunction
            {
             before(grammarAccess.getConstrainAccess().getRightExpConjunctionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Constrain__RightExpAssignment_1_29738);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConstrainAccess().getRightExpConjunctionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Constrain__RightExpAssignment_1_2"


    // $ANTLR start "rule__Conjunction__OperatorAssignment_1_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4860:1: rule__Conjunction__OperatorAssignment_1_1 : ( ruleConjunctiveOperator ) ;
    public final void rule__Conjunction__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4864:1: ( ( ruleConjunctiveOperator ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4865:1: ( ruleConjunctiveOperator )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4865:1: ( ruleConjunctiveOperator )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4866:1: ruleConjunctiveOperator
            {
             before(grammarAccess.getConjunctionAccess().getOperatorConjunctiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConjunctiveOperator_in_rule__Conjunction__OperatorAssignment_1_19769);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4875:1: rule__Conjunction__RightExpAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__Conjunction__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4879:1: ( ( ruleEquality ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4880:1: ( ruleEquality )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4880:1: ( ruleEquality )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4881:1: ruleEquality
            {
             before(grammarAccess.getConjunctionAccess().getRightExpEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__Conjunction__RightExpAssignment_1_29800);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4890:1: rule__Equality__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__Equality__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4894:1: ( ( ruleEqualityOperator ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4895:1: ( ruleEqualityOperator )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4895:1: ( ruleEqualityOperator )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4896:1: ruleEqualityOperator
            {
             before(grammarAccess.getEqualityAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEqualityOperator_in_rule__Equality__OperatorAssignment_1_19831);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4905:1: rule__Equality__RightExpAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4909:1: ( ( ruleComparison ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4910:1: ( ruleComparison )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4910:1: ( ruleComparison )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4911:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightExpComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__RightExpAssignment_1_29862);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4920:1: rule__Comparison__OperatorAssignment_1_1 : ( ruleComparativeOperator ) ;
    public final void rule__Comparison__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4924:1: ( ( ruleComparativeOperator ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4925:1: ( ruleComparativeOperator )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4925:1: ( ruleComparativeOperator )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4926:1: ruleComparativeOperator
            {
             before(grammarAccess.getComparisonAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleComparativeOperator_in_rule__Comparison__OperatorAssignment_1_19893);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4935:1: rule__Comparison__RightExpAssignment_1_2 : ( ruleBinary ) ;
    public final void rule__Comparison__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4939:1: ( ( ruleBinary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4940:1: ( ruleBinary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4940:1: ( ruleBinary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4941:1: ruleBinary
            {
             before(grammarAccess.getComparisonAccess().getRightExpBinaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBinary_in_rule__Comparison__RightExpAssignment_1_29924);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4950:1: rule__Binary__RightExpAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Binary__RightExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4954:1: ( ( rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4955:1: ( rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4955:1: ( rulePrimary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4956:1: rulePrimary
            {
             before(grammarAccess.getBinaryAccess().getRightExpPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Binary__RightExpAssignment_1_19955);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4965:1: rule__Primary__FeatureReferenceAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Primary__FeatureReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4969:1: ( ( ( ruleQualifiedName ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4970:1: ( ( ruleQualifiedName ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4970:1: ( ( ruleQualifiedName ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4971:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getPrimaryAccess().getFeatureReferenceGroupedCrossReference_0_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4972:1: ( ruleQualifiedName )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4973:1: ruleQualifiedName
            {
             before(grammarAccess.getPrimaryAccess().getFeatureReferenceGroupedQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Primary__FeatureReferenceAssignment_09990);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4984:1: rule__AttributeConstrain__ConstrainValueAssignment : ( ruleAttribute ) ;
    public final void rule__AttributeConstrain__ConstrainValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4988:1: ( ( ruleAttribute ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4989:1: ( ruleAttribute )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4989:1: ( ruleAttribute )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4990:1: ruleAttribute
            {
             before(grammarAccess.getAttributeConstrainAccess().getConstrainValueAttributeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributeConstrain__ConstrainValueAssignment10025);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4999:1: rule__Unary__OperatorAssignment_1 : ( ( rule__Unary__OperatorAlternatives_1_0 ) ) ;
    public final void rule__Unary__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5003:1: ( ( ( rule__Unary__OperatorAlternatives_1_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5004:1: ( ( rule__Unary__OperatorAlternatives_1_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5004:1: ( ( rule__Unary__OperatorAlternatives_1_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5005:1: ( rule__Unary__OperatorAlternatives_1_0 )
            {
             before(grammarAccess.getUnaryAccess().getOperatorAlternatives_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5006:1: ( rule__Unary__OperatorAlternatives_1_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5006:2: rule__Unary__OperatorAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Unary__OperatorAlternatives_1_0_in_rule__Unary__OperatorAssignment_110056);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5015:1: rule__Unary__ExpAssignment_2 : ( rulePrimary ) ;
    public final void rule__Unary__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5019:1: ( ( rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5020:1: ( rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5020:1: ( rulePrimary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5021:1: rulePrimary
            {
             before(grammarAccess.getUnaryAccess().getExpPrimaryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Unary__ExpAssignment_210089);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5030:1: rule__Range__LowerAssignment_0 : ( RULE_INT ) ;
    public final void rule__Range__LowerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5034:1: ( ( RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5035:1: ( RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5035:1: ( RULE_INT )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5036:1: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getLowerINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Range__LowerAssignment_010120); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5045:1: rule__Range__UpperAssignment_1 : ( RULE_INT ) ;
    public final void rule__Range__UpperAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5049:1: ( ( RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5050:1: ( RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5050:1: ( RULE_INT )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5051:1: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getUpperINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Range__UpperAssignment_110151); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5060:1: rule__CString__ValueAssignment : ( ruleEString ) ;
    public final void rule__CString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5064:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5065:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5065:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5066:1: ruleEString
            {
             before(grammarAccess.getCStringAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__CString__ValueAssignment10182);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5075:1: rule__CBoolean__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__CBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5079:1: ( ( RULE_BOOLEAN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5080:1: ( RULE_BOOLEAN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5080:1: ( RULE_BOOLEAN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5081:1: RULE_BOOLEAN
            {
             before(grammarAccess.getCBooleanAccess().getValueBOOLEANTerminalRuleCall_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__CBoolean__ValueAssignment10213); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5090:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5094:1: ( ( RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5095:1: ( RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5095:1: ( RULE_INT )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5096:1: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__ValueAssignment10244); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5105:1: rule__Feature_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Feature_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5109:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5110:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5110:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5111:1: ruleEString
            {
             before(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Feature_Impl__NameAssignment_110275);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5120:1: rule__Feature_Impl__SubfeatureAssignment_2_1 : ( ruleSolitary ) ;
    public final void rule__Feature_Impl__SubfeatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5124:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5125:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5125:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5126:1: ruleSolitary
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_110306);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5135:1: rule__Feature_Impl__SubfeatureAssignment_2_2 : ( ruleSolitary ) ;
    public final void rule__Feature_Impl__SubfeatureAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5139:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5140:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5140:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5141:1: ruleSolitary
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_210337);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5150:1: rule__Feature_Impl__ConstrainsAssignment_3_1 : ( ruleConstrain ) ;
    public final void rule__Feature_Impl__ConstrainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5154:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5155:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5155:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5156:1: ruleConstrain
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_110368);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5165:1: rule__Feature_Impl__ConstrainsAssignment_3_2_1 : ( ruleConstrain ) ;
    public final void rule__Feature_Impl__ConstrainsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5169:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5170:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5170:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5171:1: ruleConstrain
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_2_110399);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5180:1: rule__Grouped__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Grouped__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5184:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5185:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5185:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5186:1: ruleEString
            {
             before(grammarAccess.getGroupedAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Grouped__NameAssignment_010430);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5195:1: rule__Grouped__AttributeAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__Grouped__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5199:1: ( ( ruleAttribute ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5200:1: ( ruleAttribute )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5200:1: ( ruleAttribute )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5201:1: ruleAttribute
            {
             before(grammarAccess.getGroupedAccess().getAttributeAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Grouped__AttributeAssignment_1_110461);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5210:1: rule__Grouped__ConstrainsAssignment_2_1 : ( ruleConstrain ) ;
    public final void rule__Grouped__ConstrainsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5214:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5215:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5215:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5216:1: ruleConstrain
            {
             before(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_2_110492);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5225:1: rule__Grouped__ConstrainsAssignment_2_2_1 : ( ruleConstrain ) ;
    public final void rule__Grouped__ConstrainsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5229:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5230:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5230:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5231:1: ruleConstrain
            {
             before(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_2_2_110523);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5240:1: rule__Mandatory__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Mandatory__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5244:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5245:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5245:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5246:1: ruleEString
            {
             before(grammarAccess.getMandatoryAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Mandatory__NameAssignment_010554);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5255:1: rule__Mandatory__SubfeatureAssignment_1_1 : ( ruleSolitary ) ;
    public final void rule__Mandatory__SubfeatureAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5259:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5260:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5260:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5261:1: ruleSolitary
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_110585);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5270:1: rule__Mandatory__SubfeatureAssignment_1_2_1 : ( ruleSolitary ) ;
    public final void rule__Mandatory__SubfeatureAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5274:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5275:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5275:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5276:1: ruleSolitary
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_2_110616);
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


    // $ANTLR start "rule__Mandatory__ConstrainsAssignment_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5285:1: rule__Mandatory__ConstrainsAssignment_2_1 : ( ruleConstrain ) ;
    public final void rule__Mandatory__ConstrainsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5289:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5290:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5290:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5291:1: ruleConstrain
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_2_110647);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Mandatory__ConstrainsAssignment_2_1"


    // $ANTLR start "rule__Mandatory__ConstrainsAssignment_2_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5300:1: rule__Mandatory__ConstrainsAssignment_2_2_1 : ( ruleConstrain ) ;
    public final void rule__Mandatory__ConstrainsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5304:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5305:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5305:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5306:1: ruleConstrain
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_2_2_110678);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__Mandatory__ConstrainsAssignment_2_2_1"


    // $ANTLR start "rule__Mandatory__GroupsAssignment_3_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5315:1: rule__Mandatory__GroupsAssignment_3_0 : ( ruleGroup ) ;
    public final void rule__Mandatory__GroupsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5319:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5320:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5320:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5321:1: ruleGroup
            {
             before(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_3_010709);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Mandatory__GroupsAssignment_3_0"


    // $ANTLR start "rule__Mandatory__GroupsAssignment_3_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5330:1: rule__Mandatory__GroupsAssignment_3_1 : ( ruleGroup ) ;
    public final void rule__Mandatory__GroupsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5334:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5335:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5335:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5336:1: ruleGroup
            {
             before(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_3_110740);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Mandatory__GroupsAssignment_3_1"


    // $ANTLR start "rule__Optional__NameAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5345:1: rule__Optional__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Optional__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5349:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5350:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5350:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5351:1: ruleEString
            {
             before(grammarAccess.getOptionalAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Optional__NameAssignment_110771);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5360:1: rule__Optional__SubfeatureAssignment_2_1 : ( ruleSolitary ) ;
    public final void rule__Optional__SubfeatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5364:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5365:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5365:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5366:1: ruleSolitary
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_110802);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5375:1: rule__Optional__SubfeatureAssignment_2_2_1 : ( ruleSolitary ) ;
    public final void rule__Optional__SubfeatureAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5379:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5380:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5380:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5381:1: ruleSolitary
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_2_110833);
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


    // $ANTLR start "rule__Optional__ConstrainsAssignment_3_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5390:1: rule__Optional__ConstrainsAssignment_3_1 : ( ruleConstrain ) ;
    public final void rule__Optional__ConstrainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5394:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5395:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5395:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5396:1: ruleConstrain
            {
             before(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_3_110864);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Optional__ConstrainsAssignment_3_1"


    // $ANTLR start "rule__Optional__ConstrainsAssignment_3_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5405:1: rule__Optional__ConstrainsAssignment_3_2_1 : ( ruleConstrain ) ;
    public final void rule__Optional__ConstrainsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5409:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5410:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5410:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5411:1: ruleConstrain
            {
             before(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_3_2_110895);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__Optional__ConstrainsAssignment_3_2_1"


    // $ANTLR start "rule__Optional__GroupsAssignment_4_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5420:1: rule__Optional__GroupsAssignment_4_0 : ( ruleGroup ) ;
    public final void rule__Optional__GroupsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5424:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5425:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5425:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5426:1: ruleGroup
            {
             before(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_4_010926);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Optional__GroupsAssignment_4_0"


    // $ANTLR start "rule__Optional__GroupsAssignment_4_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5435:1: rule__Optional__GroupsAssignment_4_1 : ( ruleGroup ) ;
    public final void rule__Optional__GroupsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5439:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5440:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5440:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5441:1: ruleGroup
            {
             before(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_4_110957);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Optional__GroupsAssignment_4_1"


    // $ANTLR start "rule__Or__NameAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5450:1: rule__Or__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Or__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5454:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5455:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5455:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5456:1: ruleEString
            {
             before(grammarAccess.getOrAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Or__NameAssignment_110988);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5465:1: rule__Or__GroupedAssignment_2_1 : ( ruleGrouped ) ;
    public final void rule__Or__GroupedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5469:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5470:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5470:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5471:1: ruleGrouped
            {
             before(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_111019);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5480:1: rule__Or__GroupedAssignment_2_2_1 : ( ruleGrouped ) ;
    public final void rule__Or__GroupedAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5484:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5485:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5485:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5486:1: ruleGrouped
            {
             before(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_2_111050);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5495:1: rule__Xor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Xor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5499:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5500:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5500:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5501:1: ruleEString
            {
             before(grammarAccess.getXorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Xor__NameAssignment_111081);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5510:1: rule__Xor__GroupedAssignment_2_1 : ( ruleGrouped ) ;
    public final void rule__Xor__GroupedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5514:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5515:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5515:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5516:1: ruleGrouped
            {
             before(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_111112);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5525:1: rule__Xor__GroupedAssignment_2_2_1 : ( ruleGrouped ) ;
    public final void rule__Xor__GroupedAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5529:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5530:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5530:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:5531:1: ruleGrouped
            {
             before(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_2_111143);
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
    public static final BitSet FOLLOW_rule__Model__RootAssignment_in_ruleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_entryRuleSolitary120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSolitary127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Solitary__Alternatives_in_ruleSolitary157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_entryRuleConstrain184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstrain191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group__0_in_ruleConstrain221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0_in_ruleEquality349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_entryRuleBinary440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinary447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group__0_in_ruleBinary477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstrain_in_entryRuleAttributeConstrain568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeConstrain575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeConstrain__ConstrainValueAssignment_in_ruleAttributeConstrain605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__0_in_ruleUnary669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Alternatives_in_ruleGroup797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0_in_ruleRange925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCString_in_entryRuleCString952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCString959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CString__ValueAssignment_in_ruleCString989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCBoolean_in_entryRuleCBoolean1016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCBoolean1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CBoolean__ValueAssignment_in_ruleCBoolean1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__ValueAssignment_in_ruleNumber1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature_Impl1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__0_in_ruleFeature_Impl1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_entryRuleGrouped1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouped1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__0_in_ruleGrouped1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory1336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional1400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0_in_ruleOptional1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_entryRuleXor1528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXor1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__0_in_ruleXor1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VerticalLineVerticalLine_in_ruleDisjunctiveOperator1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AmpersandAmpersand_in_ruleConjunctiveOperator1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityOperator__Alternatives_in_ruleEqualityOperator1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparativeOperator__Alternatives_in_ruleComparativeOperator1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__Solitary__Alternatives1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__Solitary__Alternatives1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__FeatureReferenceAssignment_0_in_rule__Primary__Alternatives1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_rule__Primary__Alternatives1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__0_in_rule__Primary__Alternatives1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMark_in_rule__Unary__OperatorAlternatives_1_01886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HyphenMinus_in_rule__Unary__OperatorAlternatives_1_01906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__Group__Alternatives1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_rule__Group__Alternatives1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCString_in_rule__Attribute__Alternatives1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Attribute__Alternatives2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__Attribute__Alternatives2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCBoolean_in_rule__Attribute__Alternatives2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__EString__Alternatives2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSignEqualsSign_in_rule__EqualityOperator__Alternatives2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMarkEqualsSign_in_rule__EqualityOperator__Alternatives2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSign_in_rule__ComparativeOperator__Alternatives2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSign_in_rule__ComparativeOperator__Alternatives2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSignEqualsSign_in_rule__ComparativeOperator__Alternatives2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSignEqualsSign_in_rule__ComparativeOperator__Alternatives2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group__0__Impl_in_rule__Constrain__Group__02269 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Constrain__Group__1_in_rule__Constrain__Group__02272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Constrain__Group__0__Impl2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group__1__Impl_in_rule__Constrain__Group__12328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__0_in_rule__Constrain__Group__1__Impl2355 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__0__Impl_in_rule__Constrain__Group_1__02390 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__1_in_rule__Constrain__Group_1__02393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__1__Impl_in_rule__Constrain__Group_1__12451 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__2_in_rule__Constrain__Group_1__12454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__OperatorAssignment_1_1_in_rule__Constrain__Group_1__1__Impl2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__2__Impl_in_rule__Constrain__Group_1__22511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__RightExpAssignment_1_2_in_rule__Constrain__Group_1__2__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__02574 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__02577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__Conjunction__Group__0__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__12633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl2660 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__02695 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__02698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__12756 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__12759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__OperatorAssignment_1_1_in_rule__Conjunction__Group_1__1__Impl2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__22816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RightExpAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__02879 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__02882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__12938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl2965 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__03000 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__03003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__13061 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__13064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OperatorAssignment_1_1_in_rule__Equality__Group_1__1__Impl3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__23121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightExpAssignment_1_2_in_rule__Equality__Group_1__2__Impl3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__03184 = new BitSet(new long[]{0x0000000000180500L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__03187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_rule__Comparison__Group__0__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__13243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl3270 = new BitSet(new long[]{0x0000000000180502L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__03305 = new BitSet(new long[]{0x0000000000180500L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__03308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__13366 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__13369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OperatorAssignment_1_1_in_rule__Comparison__Group_1__1__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__23426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightExpAssignment_1_2_in_rule__Comparison__Group_1__2__Impl3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group__0__Impl_in_rule__Binary__Group__03489 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Binary__Group__1_in_rule__Binary__Group__03492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Binary__Group__0__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group__1__Impl_in_rule__Binary__Group__13548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__0_in_rule__Binary__Group__1__Impl3575 = new BitSet(new long[]{0x0000000040026002L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__0__Impl_in_rule__Binary__Group_1__03610 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__1_in_rule__Binary__Group_1__03613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__1__Impl_in_rule__Binary__Group_1__13671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__RightExpAssignment_1_1_in_rule__Binary__Group_1__1__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__03732 = new BitSet(new long[]{0x00000000CC000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__03735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rule__Primary__Group_1__0__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__13794 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__13797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstrain_in_rule__Primary__Group_1__1__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__23853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightParenthesis_in_rule__Primary__Group_1__2__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__0__Impl_in_rule__Primary__Group_3__03918 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__1_in_rule__Primary__Group_3__03921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rule__Primary__Group_3__0__Impl3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__1__Impl_in_rule__Primary__Group_3__13980 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__2_in_rule__Primary__Group_3__13983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Primary__Group_3__1__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__2__Impl_in_rule__Primary__Group_3__24039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightParenthesis_in_rule__Primary__Group_3__2__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__04104 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__04107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__14165 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Unary__Group__2_in_rule__Unary__Group__14168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__OperatorAssignment_1_in_rule__Unary__Group__1__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__2__Impl_in_rule__Unary__Group__24225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__ExpAssignment_2_in_rule__Unary__Group__2__Impl4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04288 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4374 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04409 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_rule__QualifiedName__Group_1__0__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__04531 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Range__Group__1_in_rule__Range__Group__04534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__LowerAssignment_0_in_rule__Range__Group__0__Impl4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__14591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__UpperAssignment_1_in_rule__Range__Group__1__Impl4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__0__Impl_in_rule__Feature_Impl__Group__04652 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__1_in_rule__Feature_Impl__Group__04655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Feature_in_rule__Feature_Impl__Group__0__Impl4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__1__Impl_in_rule__Feature_Impl__Group__14714 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__2_in_rule__Feature_Impl__Group__14717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__NameAssignment_1_in_rule__Feature_Impl__Group__1__Impl4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__2__Impl_in_rule__Feature_Impl__Group__24774 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__3_in_rule__Feature_Impl__Group__24777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__0_in_rule__Feature_Impl__Group__2__Impl4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__3__Impl_in_rule__Feature_Impl__Group__34835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__0_in_rule__Feature_Impl__Group__3__Impl4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__0__Impl_in_rule__Feature_Impl__Group_2__04901 = new BitSet(new long[]{0x0000000044200000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__1_in_rule__Feature_Impl__Group_2__04904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Feature_Impl__Group_2__0__Impl4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__1__Impl_in_rule__Feature_Impl__Group_2__14960 = new BitSet(new long[]{0x0000000064200000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__2_in_rule__Feature_Impl__Group_2__14963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_1_in_rule__Feature_Impl__Group_2__1__Impl4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__2__Impl_in_rule__Feature_Impl__Group_2__25020 = new BitSet(new long[]{0x0000000064200000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__3_in_rule__Feature_Impl__Group_2__25023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_2_in_rule__Feature_Impl__Group_2__2__Impl5050 = new BitSet(new long[]{0x0000000044200002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__3__Impl_in_rule__Feature_Impl__Group_2__35081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Feature_Impl__Group_2__3__Impl5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__0__Impl_in_rule__Feature_Impl__Group_3__05145 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__1_in_rule__Feature_Impl__Group_3__05148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Feature_Impl__Group_3__0__Impl5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__1__Impl_in_rule__Feature_Impl__Group_3__15207 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__2_in_rule__Feature_Impl__Group_3__15210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_1_in_rule__Feature_Impl__Group_3__1__Impl5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__2__Impl_in_rule__Feature_Impl__Group_3__25267 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__3_in_rule__Feature_Impl__Group_3__25270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__0_in_rule__Feature_Impl__Group_3__2__Impl5297 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__3__Impl_in_rule__Feature_Impl__Group_3__35328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Feature_Impl__Group_3__3__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__0__Impl_in_rule__Feature_Impl__Group_3_2__05395 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__1_in_rule__Feature_Impl__Group_3_2__05398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Feature_Impl__Group_3_2__0__Impl5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__1__Impl_in_rule__Feature_Impl__Group_3_2__15457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_2_1_in_rule__Feature_Impl__Group_3_2__1__Impl5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__0__Impl_in_rule__Grouped__Group__05518 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_rule__Grouped__Group__1_in_rule__Grouped__Group__05521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__NameAssignment_0_in_rule__Grouped__Group__0__Impl5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__1__Impl_in_rule__Grouped__Group__15578 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_rule__Grouped__Group__2_in_rule__Grouped__Group__15581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__0_in_rule__Grouped__Group__1__Impl5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__2__Impl_in_rule__Grouped__Group__25639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__0_in_rule__Grouped__Group__2__Impl5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__0__Impl_in_rule__Grouped__Group_1__05703 = new BitSet(new long[]{0x00000000CC000000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__1_in_rule__Grouped__Group_1__05706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rule__Grouped__Group_1__0__Impl5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__1__Impl_in_rule__Grouped__Group_1__15765 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__2_in_rule__Grouped__Group_1__15768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__AttributeAssignment_1_1_in_rule__Grouped__Group_1__1__Impl5795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__2__Impl_in_rule__Grouped__Group_1__25825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightParenthesis_in_rule__Grouped__Group_1__2__Impl5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__0__Impl_in_rule__Grouped__Group_2__05890 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__1_in_rule__Grouped__Group_2__05893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Grouped__Group_2__0__Impl5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__1__Impl_in_rule__Grouped__Group_2__15952 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__2_in_rule__Grouped__Group_2__15955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__ConstrainsAssignment_2_1_in_rule__Grouped__Group_2__1__Impl5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__2__Impl_in_rule__Grouped__Group_2__26012 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__3_in_rule__Grouped__Group_2__26015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2_2__0_in_rule__Grouped__Group_2__2__Impl6042 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__3__Impl_in_rule__Grouped__Group_2__36073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Grouped__Group_2__3__Impl6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2_2__0__Impl_in_rule__Grouped__Group_2_2__06140 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2_2__1_in_rule__Grouped__Group_2_2__06143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Grouped__Group_2_2__0__Impl6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2_2__1__Impl_in_rule__Grouped__Group_2_2__16202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__ConstrainsAssignment_2_2_1_in_rule__Grouped__Group_2_2__1__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__06263 = new BitSet(new long[]{0x0000000001400820L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__06266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__NameAssignment_0_in_rule__Mandatory__Group__0__Impl6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__16323 = new BitSet(new long[]{0x0000000001400820L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__2_in_rule__Mandatory__Group__16326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__0_in_rule__Mandatory__Group__1__Impl6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__2__Impl_in_rule__Mandatory__Group__26384 = new BitSet(new long[]{0x0000000001400820L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__3_in_rule__Mandatory__Group__26387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__0_in_rule__Mandatory__Group__2__Impl6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__3__Impl_in_rule__Mandatory__Group__36445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__0_in_rule__Mandatory__Group__3__Impl6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__0__Impl_in_rule__Mandatory__Group_1__06511 = new BitSet(new long[]{0x0000000044200000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__1_in_rule__Mandatory__Group_1__06514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__Mandatory__Group_1__0__Impl6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__1__Impl_in_rule__Mandatory__Group_1__16573 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__2_in_rule__Mandatory__Group_1__16576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__SubfeatureAssignment_1_1_in_rule__Mandatory__Group_1__1__Impl6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__2__Impl_in_rule__Mandatory__Group_1__26633 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__3_in_rule__Mandatory__Group_1__26636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__0_in_rule__Mandatory__Group_1__2__Impl6663 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__3__Impl_in_rule__Mandatory__Group_1__36694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__Mandatory__Group_1__3__Impl6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__0__Impl_in_rule__Mandatory__Group_1_2__06761 = new BitSet(new long[]{0x0000000044200000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__1_in_rule__Mandatory__Group_1_2__06764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Mandatory__Group_1_2__0__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__1__Impl_in_rule__Mandatory__Group_1_2__16823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__SubfeatureAssignment_1_2_1_in_rule__Mandatory__Group_1_2__1__Impl6850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__0__Impl_in_rule__Mandatory__Group_2__06884 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__1_in_rule__Mandatory__Group_2__06887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Mandatory__Group_2__0__Impl6915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__1__Impl_in_rule__Mandatory__Group_2__16946 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__2_in_rule__Mandatory__Group_2__16949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__ConstrainsAssignment_2_1_in_rule__Mandatory__Group_2__1__Impl6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__2__Impl_in_rule__Mandatory__Group_2__27006 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__3_in_rule__Mandatory__Group_2__27009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2_2__0_in_rule__Mandatory__Group_2__2__Impl7036 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__3__Impl_in_rule__Mandatory__Group_2__37067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Mandatory__Group_2__3__Impl7095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2_2__0__Impl_in_rule__Mandatory__Group_2_2__07134 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2_2__1_in_rule__Mandatory__Group_2_2__07137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Mandatory__Group_2_2__0__Impl7165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2_2__1__Impl_in_rule__Mandatory__Group_2_2__17196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__ConstrainsAssignment_2_2_1_in_rule__Mandatory__Group_2_2__1__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__0__Impl_in_rule__Mandatory__Group_3__07257 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__1_in_rule__Mandatory__Group_3__07260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__GroupsAssignment_3_0_in_rule__Mandatory__Group_3__0__Impl7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__1__Impl_in_rule__Mandatory__Group_3__17317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__GroupsAssignment_3_1_in_rule__Mandatory__Group_3__1__Impl7344 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__07379 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__07382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuestionMark_in_rule__Optional__Group__0__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__17441 = new BitSet(new long[]{0x0000000001400820L});
    public static final BitSet FOLLOW_rule__Optional__Group__2_in_rule__Optional__Group__17444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__NameAssignment_1_in_rule__Optional__Group__1__Impl7471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__2__Impl_in_rule__Optional__Group__27501 = new BitSet(new long[]{0x0000000001400820L});
    public static final BitSet FOLLOW_rule__Optional__Group__3_in_rule__Optional__Group__27504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__0_in_rule__Optional__Group__2__Impl7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__3__Impl_in_rule__Optional__Group__37562 = new BitSet(new long[]{0x0000000001400820L});
    public static final BitSet FOLLOW_rule__Optional__Group__4_in_rule__Optional__Group__37565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__0_in_rule__Optional__Group__3__Impl7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__4__Impl_in_rule__Optional__Group__47623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__0_in_rule__Optional__Group__4__Impl7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__0__Impl_in_rule__Optional__Group_2__07691 = new BitSet(new long[]{0x0000000044200000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__1_in_rule__Optional__Group_2__07694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__Optional__Group_2__0__Impl7722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__1__Impl_in_rule__Optional__Group_2__17753 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__2_in_rule__Optional__Group_2__17756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__SubfeatureAssignment_2_1_in_rule__Optional__Group_2__1__Impl7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__2__Impl_in_rule__Optional__Group_2__27813 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__3_in_rule__Optional__Group_2__27816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__0_in_rule__Optional__Group_2__2__Impl7843 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__3__Impl_in_rule__Optional__Group_2__37874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__Optional__Group_2__3__Impl7902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__0__Impl_in_rule__Optional__Group_2_2__07941 = new BitSet(new long[]{0x0000000044200000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__1_in_rule__Optional__Group_2_2__07944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Optional__Group_2_2__0__Impl7972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__1__Impl_in_rule__Optional__Group_2_2__18003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__SubfeatureAssignment_2_2_1_in_rule__Optional__Group_2_2__1__Impl8030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__0__Impl_in_rule__Optional__Group_3__08064 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__1_in_rule__Optional__Group_3__08067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Optional__Group_3__0__Impl8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__1__Impl_in_rule__Optional__Group_3__18126 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__2_in_rule__Optional__Group_3__18129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ConstrainsAssignment_3_1_in_rule__Optional__Group_3__1__Impl8156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__2__Impl_in_rule__Optional__Group_3__28186 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__3_in_rule__Optional__Group_3__28189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3_2__0_in_rule__Optional__Group_3__2__Impl8216 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__3__Impl_in_rule__Optional__Group_3__38247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Optional__Group_3__3__Impl8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3_2__0__Impl_in_rule__Optional__Group_3_2__08314 = new BitSet(new long[]{0x0000000040026000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3_2__1_in_rule__Optional__Group_3_2__08317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Optional__Group_3_2__0__Impl8345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3_2__1__Impl_in_rule__Optional__Group_3_2__18376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ConstrainsAssignment_3_2_1_in_rule__Optional__Group_3_2__1__Impl8403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__0__Impl_in_rule__Optional__Group_4__08437 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__1_in_rule__Optional__Group_4__08440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__GroupsAssignment_4_0_in_rule__Optional__Group_4__0__Impl8467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__1__Impl_in_rule__Optional__Group_4__18497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__GroupsAssignment_4_1_in_rule__Optional__Group_4__1__Impl8524 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__08559 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__08562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_rule__Or__Group__0__Impl8590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__18621 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Or__Group__2_in_rule__Or__Group__18624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__NameAssignment_1_in_rule__Or__Group__1__Impl8651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__28681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__0_in_rule__Or__Group__2__Impl8708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__0__Impl_in_rule__Or__Group_2__08745 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_rule__Or__Group_2__1_in_rule__Or__Group_2__08748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Or__Group_2__0__Impl8775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__1__Impl_in_rule__Or__Group_2__18804 = new BitSet(new long[]{0x0000000064010000L});
    public static final BitSet FOLLOW_rule__Or__Group_2__2_in_rule__Or__Group_2__18807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__GroupedAssignment_2_1_in_rule__Or__Group_2__1__Impl8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__2__Impl_in_rule__Or__Group_2__28864 = new BitSet(new long[]{0x0000000064010000L});
    public static final BitSet FOLLOW_rule__Or__Group_2__3_in_rule__Or__Group_2__28867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__0_in_rule__Or__Group_2__2__Impl8894 = new BitSet(new long[]{0x0000000044010002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__3__Impl_in_rule__Or__Group_2__38925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Or__Group_2__3__Impl8952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__0__Impl_in_rule__Or__Group_2_2__08989 = new BitSet(new long[]{0x0000000044010000L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__1_in_rule__Or__Group_2_2__08992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Or__Group_2_2__0__Impl9021 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__1__Impl_in_rule__Or__Group_2_2__19054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__GroupedAssignment_2_2_1_in_rule__Or__Group_2_2__1__Impl9081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__0__Impl_in_rule__Xor__Group__09115 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_rule__Xor__Group__1_in_rule__Xor__Group__09118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_rule__Xor__Group__0__Impl9146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__1__Impl_in_rule__Xor__Group__19177 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Xor__Group__2_in_rule__Xor__Group__19180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__NameAssignment_1_in_rule__Xor__Group__1__Impl9207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__2__Impl_in_rule__Xor__Group__29237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__0_in_rule__Xor__Group__2__Impl9264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__0__Impl_in_rule__Xor__Group_2__09301 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__1_in_rule__Xor__Group_2__09304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Xor__Group_2__0__Impl9331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__1__Impl_in_rule__Xor__Group_2__19360 = new BitSet(new long[]{0x0000000064010000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__2_in_rule__Xor__Group_2__19363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__GroupedAssignment_2_1_in_rule__Xor__Group_2__1__Impl9390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__2__Impl_in_rule__Xor__Group_2__29420 = new BitSet(new long[]{0x0000000064010000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__3_in_rule__Xor__Group_2__29423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__0_in_rule__Xor__Group_2__2__Impl9450 = new BitSet(new long[]{0x0000000044010002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__3__Impl_in_rule__Xor__Group_2__39481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Xor__Group_2__3__Impl9508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__0__Impl_in_rule__Xor__Group_2_2__09545 = new BitSet(new long[]{0x0000000044010000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__1_in_rule__Xor__Group_2_2__09548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Xor__Group_2_2__0__Impl9577 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__1__Impl_in_rule__Xor__Group_2_2__19610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__GroupedAssignment_2_2_1_in_rule__Xor__Group_2_2__1__Impl9637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_rule__Model__RootAssignment9676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunctiveOperator_in_rule__Constrain__OperatorAssignment_1_19707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Constrain__RightExpAssignment_1_29738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunctiveOperator_in_rule__Conjunction__OperatorAssignment_1_19769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__Conjunction__RightExpAssignment_1_29800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_rule__Equality__OperatorAssignment_1_19831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__RightExpAssignment_1_29862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparativeOperator_in_rule__Comparison__OperatorAssignment_1_19893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_rule__Comparison__RightExpAssignment_1_29924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Binary__RightExpAssignment_1_19955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Primary__FeatureReferenceAssignment_09990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributeConstrain__ConstrainValueAssignment10025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__OperatorAlternatives_1_0_in_rule__Unary__OperatorAssignment_110056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Unary__ExpAssignment_210089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Range__LowerAssignment_010120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Range__UpperAssignment_110151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__CString__ValueAssignment10182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__CBoolean__ValueAssignment10213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__ValueAssignment10244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Feature_Impl__NameAssignment_110275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_110306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_210337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_110368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_2_110399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Grouped__NameAssignment_010430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Grouped__AttributeAssignment_1_110461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_2_110492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_2_2_110523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Mandatory__NameAssignment_010554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_110585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_2_110616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_2_110647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_2_2_110678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_3_010709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_3_110740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Optional__NameAssignment_110771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_110802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_2_110833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_3_110864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_3_2_110895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_4_010926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_4_110957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Or__NameAssignment_110988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_111019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_2_111050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Xor__NameAssignment_111081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_111112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_2_111143 = new BitSet(new long[]{0x0000000000000002L});

}