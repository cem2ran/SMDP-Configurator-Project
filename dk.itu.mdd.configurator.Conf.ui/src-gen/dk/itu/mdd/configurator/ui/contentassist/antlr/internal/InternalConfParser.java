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
    		tokenNameToValue.put("FullStopFullStop", "'..'");
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:95:1: ruleModel : ( ( rule__Model__RootAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:99:5: ( ( ( rule__Model__RootAssignment ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:100:1: ( ( rule__Model__RootAssignment ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:100:1: ( ( rule__Model__RootAssignment ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:101:1: ( rule__Model__RootAssignment )
            {
             before(grammarAccess.getModelAccess().getRootAssignment()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:102:1: ( rule__Model__RootAssignment )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:102:2: rule__Model__RootAssignment
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:116:1: entryRuleSolitary : ruleSolitary EOF ;
    public final void entryRuleSolitary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:117:1: ( ruleSolitary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:118:1: ruleSolitary EOF
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:125:1: ruleSolitary : ( ( rule__Solitary__Alternatives ) ) ;
    public final void ruleSolitary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:129:5: ( ( ( rule__Solitary__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:130:1: ( ( rule__Solitary__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:130:1: ( ( rule__Solitary__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:131:1: ( rule__Solitary__Alternatives )
            {
             before(grammarAccess.getSolitaryAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:132:1: ( rule__Solitary__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:132:2: rule__Solitary__Alternatives
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:144:1: entryRuleConstrain : ruleConstrain EOF ;
    public final void entryRuleConstrain() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:145:1: ( ruleConstrain EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:146:1: ruleConstrain EOF
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:153:1: ruleConstrain : ( ( rule__Constrain__Group__0 ) ) ;
    public final void ruleConstrain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:157:5: ( ( ( rule__Constrain__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:158:1: ( ( rule__Constrain__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:158:1: ( ( rule__Constrain__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:159:1: ( rule__Constrain__Group__0 )
            {
             before(grammarAccess.getConstrainAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:160:1: ( rule__Constrain__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:160:2: rule__Constrain__Group__0
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:172:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:173:1: ( ruleConjunction EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:174:1: ruleConjunction EOF
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:181:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:185:5: ( ( ( rule__Conjunction__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:186:1: ( ( rule__Conjunction__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:186:1: ( ( rule__Conjunction__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:187:1: ( rule__Conjunction__Group__0 )
            {
             before(grammarAccess.getConjunctionAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:188:1: ( rule__Conjunction__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:188:2: rule__Conjunction__Group__0
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


    // $ANTLR start "entryRuleComparison"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:200:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:201:1: ( ruleComparison EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:202:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison312);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison319); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:209:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:213:5: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:214:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:214:1: ( ( rule__Comparison__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:215:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:216:1: ( rule__Comparison__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:216:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison349);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:228:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:229:1: ( ruleBinary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:230:1: ruleBinary EOF
            {
             before(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_ruleBinary_in_entryRuleBinary376);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getBinaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinary383); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:237:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:241:5: ( ( ( rule__Binary__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:242:1: ( ( rule__Binary__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:242:1: ( ( rule__Binary__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:243:1: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:244:1: ( rule__Binary__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:244:2: rule__Binary__Group__0
            {
            pushFollow(FOLLOW_rule__Binary__Group__0_in_ruleBinary413);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:256:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:257:1: ( rulePrimary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:258:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary440);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary447); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:265:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:269:5: ( ( ( rule__Primary__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:270:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:270:1: ( ( rule__Primary__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:271:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:272:1: ( rule__Primary__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:272:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary477);
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


    // $ANTLR start "entryRuleUnary"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:284:1: entryRuleUnary : ruleUnary EOF ;
    public final void entryRuleUnary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:285:1: ( ruleUnary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:286:1: ruleUnary EOF
            {
             before(grammarAccess.getUnaryRule()); 
            pushFollow(FOLLOW_ruleUnary_in_entryRuleUnary504);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getUnaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary511); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:293:1: ruleUnary : ( ( rule__Unary__Group__0 ) ) ;
    public final void ruleUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:297:5: ( ( ( rule__Unary__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:298:1: ( ( rule__Unary__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:298:1: ( ( rule__Unary__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:299:1: ( rule__Unary__Group__0 )
            {
             before(grammarAccess.getUnaryAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:300:1: ( rule__Unary__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:300:2: rule__Unary__Group__0
            {
            pushFollow(FOLLOW_rule__Unary__Group__0_in_ruleUnary541);
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


    // $ANTLR start "entryRuleGroup"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:312:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:313:1: ( ruleGroup EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:314:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup568);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup575); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:321:1: ruleGroup : ( ( rule__Group__Alternatives ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:325:5: ( ( ( rule__Group__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:326:1: ( ( rule__Group__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:326:1: ( ( rule__Group__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:327:1: ( rule__Group__Alternatives )
            {
             before(grammarAccess.getGroupAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:328:1: ( rule__Group__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:328:2: rule__Group__Alternatives
            {
            pushFollow(FOLLOW_rule__Group__Alternatives_in_ruleGroup605);
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


    // $ANTLR start "entryRuleRange"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:340:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:341:1: ( ruleRange EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:342:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange632);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange639); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:349:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:353:5: ( ( ( rule__Range__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:354:1: ( ( rule__Range__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:354:1: ( ( rule__Range__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:355:1: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:356:1: ( rule__Range__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:356:2: rule__Range__Group__0
            {
            pushFollow(FOLLOW_rule__Range__Group__0_in_ruleRange669);
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


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:368:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:369:1: ( ruleEString EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:370:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString696);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString703); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:377:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:381:5: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:382:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:382:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:383:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:384:1: ( rule__EString__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:384:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString733);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:396:1: entryRuleFeature_Impl : ruleFeature_Impl EOF ;
    public final void entryRuleFeature_Impl() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:397:1: ( ruleFeature_Impl EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:398:1: ruleFeature_Impl EOF
            {
             before(grammarAccess.getFeature_ImplRule()); 
            pushFollow(FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl760);
            ruleFeature_Impl();

            state._fsp--;

             after(grammarAccess.getFeature_ImplRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature_Impl767); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:405:1: ruleFeature_Impl : ( ( rule__Feature_Impl__Group__0 ) ) ;
    public final void ruleFeature_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:409:5: ( ( ( rule__Feature_Impl__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:410:1: ( ( rule__Feature_Impl__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:410:1: ( ( rule__Feature_Impl__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:411:1: ( rule__Feature_Impl__Group__0 )
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:412:1: ( rule__Feature_Impl__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:412:2: rule__Feature_Impl__Group__0
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__0_in_ruleFeature_Impl797);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:424:1: entryRuleGrouped : ruleGrouped EOF ;
    public final void entryRuleGrouped() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:425:1: ( ruleGrouped EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:426:1: ruleGrouped EOF
            {
             before(grammarAccess.getGroupedRule()); 
            pushFollow(FOLLOW_ruleGrouped_in_entryRuleGrouped824);
            ruleGrouped();

            state._fsp--;

             after(grammarAccess.getGroupedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouped831); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:433:1: ruleGrouped : ( ( rule__Grouped__Group__0 ) ) ;
    public final void ruleGrouped() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:437:5: ( ( ( rule__Grouped__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:438:1: ( ( rule__Grouped__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:438:1: ( ( rule__Grouped__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:439:1: ( rule__Grouped__Group__0 )
            {
             before(grammarAccess.getGroupedAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:440:1: ( rule__Grouped__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:440:2: rule__Grouped__Group__0
            {
            pushFollow(FOLLOW_rule__Grouped__Group__0_in_ruleGrouped861);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:452:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:453:1: ( ruleMandatory EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:454:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory888);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory895); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:461:1: ruleMandatory : ( ( rule__Mandatory__Group__0 ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:465:5: ( ( ( rule__Mandatory__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:466:1: ( ( rule__Mandatory__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:466:1: ( ( rule__Mandatory__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:467:1: ( rule__Mandatory__Group__0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:468:1: ( rule__Mandatory__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:468:2: rule__Mandatory__Group__0
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory925);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:480:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:481:1: ( ruleOptional EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:482:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional952);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional959); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:489:1: ruleOptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:493:5: ( ( ( rule__Optional__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:494:1: ( ( rule__Optional__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:494:1: ( ( rule__Optional__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:495:1: ( rule__Optional__Group__0 )
            {
             before(grammarAccess.getOptionalAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:496:1: ( rule__Optional__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:496:2: rule__Optional__Group__0
            {
            pushFollow(FOLLOW_rule__Optional__Group__0_in_ruleOptional989);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:508:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:509:1: ( ruleOr EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:510:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1016);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1023); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:517:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:521:5: ( ( ( rule__Or__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:522:1: ( ( rule__Or__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:522:1: ( ( rule__Or__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:523:1: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:524:1: ( rule__Or__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:524:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr1053);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:536:1: entryRuleXor : ruleXor EOF ;
    public final void entryRuleXor() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:537:1: ( ruleXor EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:538:1: ruleXor EOF
            {
             before(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_ruleXor_in_entryRuleXor1080);
            ruleXor();

            state._fsp--;

             after(grammarAccess.getXorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXor1087); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:545:1: ruleXor : ( ( rule__Xor__Group__0 ) ) ;
    public final void ruleXor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:549:5: ( ( ( rule__Xor__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:550:1: ( ( rule__Xor__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:550:1: ( ( rule__Xor__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:551:1: ( rule__Xor__Group__0 )
            {
             before(grammarAccess.getXorAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:552:1: ( rule__Xor__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:552:2: rule__Xor__Group__0
            {
            pushFollow(FOLLOW_rule__Xor__Group__0_in_ruleXor1117);
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


    // $ANTLR start "rule__Solitary__Alternatives"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:565:1: rule__Solitary__Alternatives : ( ( ruleMandatory ) | ( ruleOptional ) );
    public final void rule__Solitary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:569:1: ( ( ruleMandatory ) | ( ruleOptional ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:570:1: ( ruleMandatory )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:570:1: ( ruleMandatory )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:571:1: ruleMandatory
                    {
                     before(grammarAccess.getSolitaryAccess().getMandatoryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMandatory_in_rule__Solitary__Alternatives1154);
                    ruleMandatory();

                    state._fsp--;

                     after(grammarAccess.getSolitaryAccess().getMandatoryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:576:6: ( ruleOptional )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:576:6: ( ruleOptional )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:577:1: ruleOptional
                    {
                     before(grammarAccess.getSolitaryAccess().getOptionalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOptional_in_rule__Solitary__Alternatives1171);
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


    // $ANTLR start "rule__Comparison__OperatorAlternatives_1_1_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:587:1: rule__Comparison__OperatorAlternatives_1_1_0 : ( ( EqualsSignEqualsSign ) | ( ExclamationMarkEqualsSign ) | ( LessThanSignEqualsSign ) | ( LessThanSign ) | ( GreaterThanSignEqualsSign ) | ( GreaterThanSign ) );
    public final void rule__Comparison__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:591:1: ( ( EqualsSignEqualsSign ) | ( ExclamationMarkEqualsSign ) | ( LessThanSignEqualsSign ) | ( LessThanSign ) | ( GreaterThanSignEqualsSign ) | ( GreaterThanSign ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case EqualsSignEqualsSign:
                {
                alt2=1;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt2=2;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt2=3;
                }
                break;
            case LessThanSign:
                {
                alt2=4;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt2=5;
                }
                break;
            case GreaterThanSign:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:592:1: ( EqualsSignEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:592:1: ( EqualsSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:593:1: EqualsSignEqualsSign
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,EqualsSignEqualsSign,FOLLOW_EqualsSignEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01204); 
                     after(grammarAccess.getComparisonAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:600:6: ( ExclamationMarkEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:600:6: ( ExclamationMarkEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:601:1: ExclamationMarkEqualsSign
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,ExclamationMarkEqualsSign,FOLLOW_ExclamationMarkEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01224); 
                     after(grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:608:6: ( LessThanSignEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:608:6: ( LessThanSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:609:1: LessThanSignEqualsSign
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2()); 
                    match(input,LessThanSignEqualsSign,FOLLOW_LessThanSignEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01244); 
                     after(grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:616:6: ( LessThanSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:616:6: ( LessThanSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:617:1: LessThanSign
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_1_1_0_3()); 
                    match(input,LessThanSign,FOLLOW_LessThanSign_in_rule__Comparison__OperatorAlternatives_1_1_01264); 
                     after(grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:624:6: ( GreaterThanSignEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:624:6: ( GreaterThanSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:625:1: GreaterThanSignEqualsSign
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_4()); 
                    match(input,GreaterThanSignEqualsSign,FOLLOW_GreaterThanSignEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01284); 
                     after(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:632:6: ( GreaterThanSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:632:6: ( GreaterThanSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:633:1: GreaterThanSign
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignKeyword_1_1_0_5()); 
                    match(input,GreaterThanSign,FOLLOW_GreaterThanSign_in_rule__Comparison__OperatorAlternatives_1_1_01304); 
                     after(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignKeyword_1_1_0_5()); 

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
    // $ANTLR end "rule__Comparison__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:645:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleUnary ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:649:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleUnary ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_NULL:
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case ExclamationMark:
            case HyphenMinus:
                {
                alt3=2;
                }
                break;
            case LeftParenthesis:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:650:1: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:650:1: ( ( rule__Primary__Group_0__0 ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:651:1: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:652:1: ( rule__Primary__Group_0__0 )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:652:2: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives1338);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:656:6: ( ruleUnary )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:656:6: ( ruleUnary )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:657:1: ruleUnary
                    {
                     before(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnary_in_rule__Primary__Alternatives1356);
                    ruleUnary();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:662:6: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:662:6: ( ( rule__Primary__Group_2__0 ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:663:1: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:664:1: ( rule__Primary__Group_2__0 )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:664:2: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_2__0_in_rule__Primary__Alternatives1373);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:673:1: rule__Unary__OperatorAlternatives_1_0 : ( ( ExclamationMark ) | ( HyphenMinus ) );
    public final void rule__Unary__OperatorAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:677:1: ( ( ExclamationMark ) | ( HyphenMinus ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ExclamationMark) ) {
                alt4=1;
            }
            else if ( (LA4_0==HyphenMinus) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:678:1: ( ExclamationMark )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:678:1: ( ExclamationMark )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:679:1: ExclamationMark
                    {
                     before(grammarAccess.getUnaryAccess().getOperatorExclamationMarkKeyword_1_0_0()); 
                    match(input,ExclamationMark,FOLLOW_ExclamationMark_in_rule__Unary__OperatorAlternatives_1_01407); 
                     after(grammarAccess.getUnaryAccess().getOperatorExclamationMarkKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:686:6: ( HyphenMinus )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:686:6: ( HyphenMinus )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:687:1: HyphenMinus
                    {
                     before(grammarAccess.getUnaryAccess().getOperatorHyphenMinusKeyword_1_0_1()); 
                    match(input,HyphenMinus,FOLLOW_HyphenMinus_in_rule__Unary__OperatorAlternatives_1_01427); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:699:1: rule__Group__Alternatives : ( ( ruleOr ) | ( ruleXor ) );
    public final void rule__Group__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:703:1: ( ( ruleOr ) | ( ruleXor ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Or) ) {
                alt5=1;
            }
            else if ( (LA5_0==Xor) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:704:1: ( ruleOr )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:704:1: ( ruleOr )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:705:1: ruleOr
                    {
                     before(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOr_in_rule__Group__Alternatives1461);
                    ruleOr();

                    state._fsp--;

                     after(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:710:6: ( ruleXor )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:710:6: ( ruleXor )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:711:1: ruleXor
                    {
                     before(grammarAccess.getGroupAccess().getXorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleXor_in_rule__Group__Alternatives1478);
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


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:721:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_INT ) | ( RULE_NULL ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:725:1: ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_INT ) | ( RULE_NULL ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
                {
                alt6=3;
                }
                break;
            case RULE_NULL:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:726:1: ( RULE_STRING )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:726:1: ( RULE_STRING )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:727:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1510); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:732:6: ( RULE_ID )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:732:6: ( RULE_ID )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:733:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1527); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:738:6: ( RULE_INT )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:738:6: ( RULE_INT )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:739:1: RULE_INT
                    {
                     before(grammarAccess.getEStringAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EString__Alternatives1544); 
                     after(grammarAccess.getEStringAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:744:6: ( RULE_NULL )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:744:6: ( RULE_NULL )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:745:1: RULE_NULL
                    {
                     before(grammarAccess.getEStringAccess().getNULLTerminalRuleCall_3()); 
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__EString__Alternatives1561); 
                     after(grammarAccess.getEStringAccess().getNULLTerminalRuleCall_3()); 

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


    // $ANTLR start "rule__Constrain__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:757:1: rule__Constrain__Group__0 : rule__Constrain__Group__0__Impl rule__Constrain__Group__1 ;
    public final void rule__Constrain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:761:1: ( rule__Constrain__Group__0__Impl rule__Constrain__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:762:2: rule__Constrain__Group__0__Impl rule__Constrain__Group__1
            {
            pushFollow(FOLLOW_rule__Constrain__Group__0__Impl_in_rule__Constrain__Group__01591);
            rule__Constrain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constrain__Group__1_in_rule__Constrain__Group__01594);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:769:1: rule__Constrain__Group__0__Impl : ( ruleConjunction ) ;
    public final void rule__Constrain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:773:1: ( ( ruleConjunction ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:774:1: ( ruleConjunction )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:774:1: ( ruleConjunction )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:775:1: ruleConjunction
            {
             before(grammarAccess.getConstrainAccess().getConjunctionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Constrain__Group__0__Impl1621);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:786:1: rule__Constrain__Group__1 : rule__Constrain__Group__1__Impl ;
    public final void rule__Constrain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:790:1: ( rule__Constrain__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:791:2: rule__Constrain__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Constrain__Group__1__Impl_in_rule__Constrain__Group__11650);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:797:1: rule__Constrain__Group__1__Impl : ( ( rule__Constrain__Group_1__0 )* ) ;
    public final void rule__Constrain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:801:1: ( ( ( rule__Constrain__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:802:1: ( ( rule__Constrain__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:802:1: ( ( rule__Constrain__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:803:1: ( rule__Constrain__Group_1__0 )*
            {
             before(grammarAccess.getConstrainAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:804:1: ( rule__Constrain__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==VerticalLineVerticalLine) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:804:2: rule__Constrain__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Constrain__Group_1__0_in_rule__Constrain__Group__1__Impl1677);
            	    rule__Constrain__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:818:1: rule__Constrain__Group_1__0 : rule__Constrain__Group_1__0__Impl rule__Constrain__Group_1__1 ;
    public final void rule__Constrain__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:822:1: ( rule__Constrain__Group_1__0__Impl rule__Constrain__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:823:2: rule__Constrain__Group_1__0__Impl rule__Constrain__Group_1__1
            {
            pushFollow(FOLLOW_rule__Constrain__Group_1__0__Impl_in_rule__Constrain__Group_1__01712);
            rule__Constrain__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constrain__Group_1__1_in_rule__Constrain__Group_1__01715);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:830:1: rule__Constrain__Group_1__0__Impl : ( () ) ;
    public final void rule__Constrain__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:834:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:835:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:835:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:836:1: ()
            {
             before(grammarAccess.getConstrainAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:837:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:839:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:849:1: rule__Constrain__Group_1__1 : rule__Constrain__Group_1__1__Impl rule__Constrain__Group_1__2 ;
    public final void rule__Constrain__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:853:1: ( rule__Constrain__Group_1__1__Impl rule__Constrain__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:854:2: rule__Constrain__Group_1__1__Impl rule__Constrain__Group_1__2
            {
            pushFollow(FOLLOW_rule__Constrain__Group_1__1__Impl_in_rule__Constrain__Group_1__11773);
            rule__Constrain__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constrain__Group_1__2_in_rule__Constrain__Group_1__11776);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:861:1: rule__Constrain__Group_1__1__Impl : ( ( rule__Constrain__OperatorAssignment_1_1 ) ) ;
    public final void rule__Constrain__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:865:1: ( ( ( rule__Constrain__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:866:1: ( ( rule__Constrain__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:866:1: ( ( rule__Constrain__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:867:1: ( rule__Constrain__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getConstrainAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:868:1: ( rule__Constrain__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:868:2: rule__Constrain__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Constrain__OperatorAssignment_1_1_in_rule__Constrain__Group_1__1__Impl1803);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:878:1: rule__Constrain__Group_1__2 : rule__Constrain__Group_1__2__Impl ;
    public final void rule__Constrain__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:882:1: ( rule__Constrain__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:883:2: rule__Constrain__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Constrain__Group_1__2__Impl_in_rule__Constrain__Group_1__21833);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:889:1: rule__Constrain__Group_1__2__Impl : ( ( rule__Constrain__RightExpAssignment_1_2 ) ) ;
    public final void rule__Constrain__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:893:1: ( ( ( rule__Constrain__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:894:1: ( ( rule__Constrain__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:894:1: ( ( rule__Constrain__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:895:1: ( rule__Constrain__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getConstrainAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:896:1: ( rule__Constrain__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:896:2: rule__Constrain__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Constrain__RightExpAssignment_1_2_in_rule__Constrain__Group_1__2__Impl1860);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:912:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:916:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:917:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__01896);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__01899);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:924:1: rule__Conjunction__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:928:1: ( ( ruleComparison ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:929:1: ( ruleComparison )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:929:1: ( ruleComparison )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:930:1: ruleComparison
            {
             before(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Conjunction__Group__0__Impl1926);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:941:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:945:1: ( rule__Conjunction__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:946:2: rule__Conjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__11955);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:952:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )* ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:956:1: ( ( ( rule__Conjunction__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:957:1: ( ( rule__Conjunction__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:957:1: ( ( rule__Conjunction__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:958:1: ( rule__Conjunction__Group_1__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:959:1: ( rule__Conjunction__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AmpersandAmpersand) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:959:2: rule__Conjunction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl1982);
            	    rule__Conjunction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:973:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:977:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:978:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__02017);
            rule__Conjunction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__02020);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:985:1: rule__Conjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:989:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:990:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:990:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:991:1: ()
            {
             before(grammarAccess.getConjunctionAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:992:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:994:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1004:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1008:1: ( rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1009:2: rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__12078);
            rule__Conjunction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__12081);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1016:1: rule__Conjunction__Group_1__1__Impl : ( ( rule__Conjunction__OperatorAssignment_1_1 ) ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1020:1: ( ( ( rule__Conjunction__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1021:1: ( ( rule__Conjunction__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1021:1: ( ( rule__Conjunction__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1022:1: ( rule__Conjunction__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getConjunctionAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1023:1: ( rule__Conjunction__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1023:2: rule__Conjunction__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Conjunction__OperatorAssignment_1_1_in_rule__Conjunction__Group_1__1__Impl2108);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1033:1: rule__Conjunction__Group_1__2 : rule__Conjunction__Group_1__2__Impl ;
    public final void rule__Conjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1037:1: ( rule__Conjunction__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1038:2: rule__Conjunction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__22138);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1044:1: rule__Conjunction__Group_1__2__Impl : ( ( rule__Conjunction__RightExpAssignment_1_2 ) ) ;
    public final void rule__Conjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1048:1: ( ( ( rule__Conjunction__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1049:1: ( ( rule__Conjunction__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1049:1: ( ( rule__Conjunction__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1050:1: ( rule__Conjunction__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getConjunctionAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1051:1: ( rule__Conjunction__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1051:2: rule__Conjunction__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Conjunction__RightExpAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl2165);
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


    // $ANTLR start "rule__Comparison__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1067:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1071:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1072:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__02201);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__02204);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1079:1: rule__Comparison__Group__0__Impl : ( ruleBinary ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1083:1: ( ( ruleBinary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1084:1: ( ruleBinary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1084:1: ( ruleBinary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1085:1: ruleBinary
            {
             before(grammarAccess.getComparisonAccess().getBinaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBinary_in_rule__Comparison__Group__0__Impl2231);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1096:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1100:1: ( rule__Comparison__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1101:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__12260);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1107:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1111:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1112:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1112:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1113:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1114:1: ( rule__Comparison__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ExclamationMarkEqualsSign||(LA9_0>=LessThanSignEqualsSign && LA9_0<=GreaterThanSignEqualsSign)||(LA9_0>=LessThanSign && LA9_0<=GreaterThanSign)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1114:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl2287);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1128:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1132:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1133:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__02322);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__02325);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1140:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1144:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1145:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1145:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1146:1: ()
            {
             before(grammarAccess.getComparisonAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1147:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1149:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1159:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1163:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1164:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__12383);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__12386);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1171:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OperatorAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1175:1: ( ( ( rule__Comparison__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1176:1: ( ( rule__Comparison__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1176:1: ( ( rule__Comparison__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1177:1: ( rule__Comparison__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1178:1: ( rule__Comparison__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1178:2: rule__Comparison__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OperatorAssignment_1_1_in_rule__Comparison__Group_1__1__Impl2413);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1188:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1192:1: ( rule__Comparison__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1193:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__22443);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1199:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightExpAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1203:1: ( ( ( rule__Comparison__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1204:1: ( ( rule__Comparison__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1204:1: ( ( rule__Comparison__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1205:1: ( rule__Comparison__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1206:1: ( rule__Comparison__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1206:2: rule__Comparison__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightExpAssignment_1_2_in_rule__Comparison__Group_1__2__Impl2470);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1222:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1226:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1227:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_rule__Binary__Group__0__Impl_in_rule__Binary__Group__02506);
            rule__Binary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binary__Group__1_in_rule__Binary__Group__02509);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1234:1: rule__Binary__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1238:1: ( ( rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1239:1: ( rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1239:1: ( rulePrimary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1240:1: rulePrimary
            {
             before(grammarAccess.getBinaryAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Binary__Group__0__Impl2536);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1251:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1255:1: ( rule__Binary__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1256:2: rule__Binary__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Binary__Group__1__Impl_in_rule__Binary__Group__12565);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1262:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__Group_1__0 )* ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1266:1: ( ( ( rule__Binary__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1267:1: ( ( rule__Binary__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1267:1: ( ( rule__Binary__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1268:1: ( rule__Binary__Group_1__0 )*
            {
             before(grammarAccess.getBinaryAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1269:1: ( rule__Binary__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=ExclamationMark && LA10_0<=LeftParenthesis)||LA10_0==HyphenMinus||LA10_0==RULE_NULL||(LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1269:2: rule__Binary__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Binary__Group_1__0_in_rule__Binary__Group__1__Impl2592);
            	    rule__Binary__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1283:1: rule__Binary__Group_1__0 : rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 ;
    public final void rule__Binary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1287:1: ( rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1288:2: rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Binary__Group_1__0__Impl_in_rule__Binary__Group_1__02627);
            rule__Binary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binary__Group_1__1_in_rule__Binary__Group_1__02630);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1295:1: rule__Binary__Group_1__0__Impl : ( () ) ;
    public final void rule__Binary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1299:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1300:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1300:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1301:1: ()
            {
             before(grammarAccess.getBinaryAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1302:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1304:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1314:1: rule__Binary__Group_1__1 : rule__Binary__Group_1__1__Impl ;
    public final void rule__Binary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1318:1: ( rule__Binary__Group_1__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1319:2: rule__Binary__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Binary__Group_1__1__Impl_in_rule__Binary__Group_1__12688);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1325:1: rule__Binary__Group_1__1__Impl : ( ( rule__Binary__RightExpAssignment_1_1 ) ) ;
    public final void rule__Binary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1329:1: ( ( ( rule__Binary__RightExpAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1330:1: ( ( rule__Binary__RightExpAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1330:1: ( ( rule__Binary__RightExpAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1331:1: ( rule__Binary__RightExpAssignment_1_1 )
            {
             before(grammarAccess.getBinaryAccess().getRightExpAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1332:1: ( rule__Binary__RightExpAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1332:2: rule__Binary__RightExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Binary__RightExpAssignment_1_1_in_rule__Binary__Group_1__1__Impl2715);
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


    // $ANTLR start "rule__Primary__Group_0__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1346:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1350:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1351:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__02749);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__02752);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1358:1: rule__Primary__Group_0__0__Impl : ( ( rule__Primary__ConstrainFeaturesAssignment_0_0 ) ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1362:1: ( ( ( rule__Primary__ConstrainFeaturesAssignment_0_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1363:1: ( ( rule__Primary__ConstrainFeaturesAssignment_0_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1363:1: ( ( rule__Primary__ConstrainFeaturesAssignment_0_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1364:1: ( rule__Primary__ConstrainFeaturesAssignment_0_0 )
            {
             before(grammarAccess.getPrimaryAccess().getConstrainFeaturesAssignment_0_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1365:1: ( rule__Primary__ConstrainFeaturesAssignment_0_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1365:2: rule__Primary__ConstrainFeaturesAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Primary__ConstrainFeaturesAssignment_0_0_in_rule__Primary__Group_0__0__Impl2779);
            rule__Primary__ConstrainFeaturesAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getConstrainFeaturesAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1375:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1379:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1380:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__12809);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__12812);
            rule__Primary__Group_0__2();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1387:1: rule__Primary__Group_0__1__Impl : ( FullStop ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1391:1: ( ( FullStop ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1392:1: ( FullStop )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1392:1: ( FullStop )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1393:1: FullStop
            {
             before(grammarAccess.getPrimaryAccess().getFullStopKeyword_0_1()); 
            match(input,FullStop,FOLLOW_FullStop_in_rule__Primary__Group_0__1__Impl2840); 
             after(grammarAccess.getPrimaryAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1406:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3 ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1410:1: ( rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1411:2: rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__22871);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__3_in_rule__Primary__Group_0__22874);
            rule__Primary__Group_0__3();

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
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1418:1: rule__Primary__Group_0__2__Impl : ( ( rule__Primary__GroupsAssignment_0_2 ) ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1422:1: ( ( ( rule__Primary__GroupsAssignment_0_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1423:1: ( ( rule__Primary__GroupsAssignment_0_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1423:1: ( ( rule__Primary__GroupsAssignment_0_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1424:1: ( rule__Primary__GroupsAssignment_0_2 )
            {
             before(grammarAccess.getPrimaryAccess().getGroupsAssignment_0_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1425:1: ( rule__Primary__GroupsAssignment_0_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1425:2: rule__Primary__GroupsAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Primary__GroupsAssignment_0_2_in_rule__Primary__Group_0__2__Impl2901);
            rule__Primary__GroupsAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getGroupsAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1435:1: rule__Primary__Group_0__3 : rule__Primary__Group_0__3__Impl rule__Primary__Group_0__4 ;
    public final void rule__Primary__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1439:1: ( rule__Primary__Group_0__3__Impl rule__Primary__Group_0__4 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1440:2: rule__Primary__Group_0__3__Impl rule__Primary__Group_0__4
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__3__Impl_in_rule__Primary__Group_0__32931);
            rule__Primary__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__4_in_rule__Primary__Group_0__32934);
            rule__Primary__Group_0__4();

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
    // $ANTLR end "rule__Primary__Group_0__3"


    // $ANTLR start "rule__Primary__Group_0__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1447:1: rule__Primary__Group_0__3__Impl : ( FullStop ) ;
    public final void rule__Primary__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1451:1: ( ( FullStop ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1452:1: ( FullStop )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1452:1: ( FullStop )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1453:1: FullStop
            {
             before(grammarAccess.getPrimaryAccess().getFullStopKeyword_0_3()); 
            match(input,FullStop,FOLLOW_FullStop_in_rule__Primary__Group_0__3__Impl2962); 
             after(grammarAccess.getPrimaryAccess().getFullStopKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__3__Impl"


    // $ANTLR start "rule__Primary__Group_0__4"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1466:1: rule__Primary__Group_0__4 : rule__Primary__Group_0__4__Impl ;
    public final void rule__Primary__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1470:1: ( rule__Primary__Group_0__4__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1471:2: rule__Primary__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__4__Impl_in_rule__Primary__Group_0__42993);
            rule__Primary__Group_0__4__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__4"


    // $ANTLR start "rule__Primary__Group_0__4__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1477:1: rule__Primary__Group_0__4__Impl : ( ( rule__Primary__ConstrainFeaturesAssignment_0_4 ) ) ;
    public final void rule__Primary__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1481:1: ( ( ( rule__Primary__ConstrainFeaturesAssignment_0_4 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1482:1: ( ( rule__Primary__ConstrainFeaturesAssignment_0_4 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1482:1: ( ( rule__Primary__ConstrainFeaturesAssignment_0_4 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1483:1: ( rule__Primary__ConstrainFeaturesAssignment_0_4 )
            {
             before(grammarAccess.getPrimaryAccess().getConstrainFeaturesAssignment_0_4()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1484:1: ( rule__Primary__ConstrainFeaturesAssignment_0_4 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1484:2: rule__Primary__ConstrainFeaturesAssignment_0_4
            {
            pushFollow(FOLLOW_rule__Primary__ConstrainFeaturesAssignment_0_4_in_rule__Primary__Group_0__4__Impl3020);
            rule__Primary__ConstrainFeaturesAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getConstrainFeaturesAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__4__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1504:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1508:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1509:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__0__Impl_in_rule__Primary__Group_2__03060);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_2__1_in_rule__Primary__Group_2__03063);
            rule__Primary__Group_2__1();

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
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1516:1: rule__Primary__Group_2__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1520:1: ( ( LeftParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1521:1: ( LeftParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1521:1: ( LeftParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1522:1: LeftParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rule__Primary__Group_2__0__Impl3091); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1535:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1539:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1540:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__1__Impl_in_rule__Primary__Group_2__13122);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_2__2_in_rule__Primary__Group_2__13125);
            rule__Primary__Group_2__2();

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
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1547:1: rule__Primary__Group_2__1__Impl : ( ruleConstrain ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1551:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1552:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1552:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1553:1: ruleConstrain
            {
             before(grammarAccess.getPrimaryAccess().getConstrainParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Primary__Group_2__1__Impl3152);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getConstrainParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1564:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1568:1: ( rule__Primary__Group_2__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1569:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__2__Impl_in_rule__Primary__Group_2__23181);
            rule__Primary__Group_2__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1575:1: rule__Primary__Group_2__2__Impl : ( RightParenthesis ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1579:1: ( ( RightParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1580:1: ( RightParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1580:1: ( RightParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1581:1: RightParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rule__Primary__Group_2__2__Impl3209); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__Unary__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1600:1: rule__Unary__Group__0 : rule__Unary__Group__0__Impl rule__Unary__Group__1 ;
    public final void rule__Unary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1604:1: ( rule__Unary__Group__0__Impl rule__Unary__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1605:2: rule__Unary__Group__0__Impl rule__Unary__Group__1
            {
            pushFollow(FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__03246);
            rule__Unary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__03249);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1612:1: rule__Unary__Group__0__Impl : ( () ) ;
    public final void rule__Unary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1616:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1617:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1617:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1618:1: ()
            {
             before(grammarAccess.getUnaryAccess().getUnaryAction_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1619:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1621:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1631:1: rule__Unary__Group__1 : rule__Unary__Group__1__Impl rule__Unary__Group__2 ;
    public final void rule__Unary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1635:1: ( rule__Unary__Group__1__Impl rule__Unary__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1636:2: rule__Unary__Group__1__Impl rule__Unary__Group__2
            {
            pushFollow(FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__13307);
            rule__Unary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unary__Group__2_in_rule__Unary__Group__13310);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1643:1: rule__Unary__Group__1__Impl : ( ( rule__Unary__OperatorAssignment_1 ) ) ;
    public final void rule__Unary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1647:1: ( ( ( rule__Unary__OperatorAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1648:1: ( ( rule__Unary__OperatorAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1648:1: ( ( rule__Unary__OperatorAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1649:1: ( rule__Unary__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryAccess().getOperatorAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1650:1: ( rule__Unary__OperatorAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1650:2: rule__Unary__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__Unary__OperatorAssignment_1_in_rule__Unary__Group__1__Impl3337);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1660:1: rule__Unary__Group__2 : rule__Unary__Group__2__Impl ;
    public final void rule__Unary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1664:1: ( rule__Unary__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1665:2: rule__Unary__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Unary__Group__2__Impl_in_rule__Unary__Group__23367);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1671:1: rule__Unary__Group__2__Impl : ( ( rule__Unary__ExpAssignment_2 ) ) ;
    public final void rule__Unary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1675:1: ( ( ( rule__Unary__ExpAssignment_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1676:1: ( ( rule__Unary__ExpAssignment_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1676:1: ( ( rule__Unary__ExpAssignment_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1677:1: ( rule__Unary__ExpAssignment_2 )
            {
             before(grammarAccess.getUnaryAccess().getExpAssignment_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1678:1: ( rule__Unary__ExpAssignment_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1678:2: rule__Unary__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__Unary__ExpAssignment_2_in_rule__Unary__Group__2__Impl3394);
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


    // $ANTLR start "rule__Range__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1694:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1698:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1699:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__03430);
            rule__Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__1_in_rule__Range__Group__03433);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1706:1: rule__Range__Group__0__Impl : ( ( rule__Range__NameAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1710:1: ( ( ( rule__Range__NameAssignment_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1711:1: ( ( rule__Range__NameAssignment_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1711:1: ( ( rule__Range__NameAssignment_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1712:1: ( rule__Range__NameAssignment_0 )
            {
             before(grammarAccess.getRangeAccess().getNameAssignment_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1713:1: ( rule__Range__NameAssignment_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1713:2: rule__Range__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Range__NameAssignment_0_in_rule__Range__Group__0__Impl3460);
            rule__Range__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1723:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1727:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1728:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__13490);
            rule__Range__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__2_in_rule__Range__Group__13493);
            rule__Range__Group__2();

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1735:1: rule__Range__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1739:1: ( ( RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1740:1: ( RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1740:1: ( RULE_INT )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1741:1: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Range__Group__1__Impl3520); 
             after(grammarAccess.getRangeAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Range__Group__2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1752:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1756:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1757:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FOLLOW_rule__Range__Group__2__Impl_in_rule__Range__Group__23549);
            rule__Range__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Range__Group__3_in_rule__Range__Group__23552);
            rule__Range__Group__3();

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
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1764:1: rule__Range__Group__2__Impl : ( FullStopFullStop ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1768:1: ( ( FullStopFullStop ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1769:1: ( FullStopFullStop )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1769:1: ( FullStopFullStop )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1770:1: FullStopFullStop
            {
             before(grammarAccess.getRangeAccess().getFullStopFullStopKeyword_2()); 
            match(input,FullStopFullStop,FOLLOW_FullStopFullStop_in_rule__Range__Group__2__Impl3580); 
             after(grammarAccess.getRangeAccess().getFullStopFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1783:1: rule__Range__Group__3 : rule__Range__Group__3__Impl ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1787:1: ( rule__Range__Group__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1788:2: rule__Range__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group__3__Impl_in_rule__Range__Group__33611);
            rule__Range__Group__3__Impl();

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
    // $ANTLR end "rule__Range__Group__3"


    // $ANTLR start "rule__Range__Group__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1794:1: rule__Range__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1798:1: ( ( RULE_INT ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1799:1: ( RULE_INT )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1799:1: ( RULE_INT )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1800:1: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Range__Group__3__Impl3638); 
             after(grammarAccess.getRangeAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1819:1: rule__Feature_Impl__Group__0 : rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 ;
    public final void rule__Feature_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1823:1: ( rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1824:2: rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__0__Impl_in_rule__Feature_Impl__Group__03675);
            rule__Feature_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group__1_in_rule__Feature_Impl__Group__03678);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1831:1: rule__Feature_Impl__Group__0__Impl : ( Feature ) ;
    public final void rule__Feature_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1835:1: ( ( Feature ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1836:1: ( Feature )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1836:1: ( Feature )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1837:1: Feature
            {
             before(grammarAccess.getFeature_ImplAccess().getFeatureKeyword_0()); 
            match(input,Feature,FOLLOW_Feature_in_rule__Feature_Impl__Group__0__Impl3706); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1850:1: rule__Feature_Impl__Group__1 : rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 ;
    public final void rule__Feature_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1854:1: ( rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1855:2: rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__1__Impl_in_rule__Feature_Impl__Group__13737);
            rule__Feature_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group__2_in_rule__Feature_Impl__Group__13740);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1862:1: rule__Feature_Impl__Group__1__Impl : ( ( rule__Feature_Impl__NameAssignment_1 ) ) ;
    public final void rule__Feature_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1866:1: ( ( ( rule__Feature_Impl__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1867:1: ( ( rule__Feature_Impl__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1867:1: ( ( rule__Feature_Impl__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1868:1: ( rule__Feature_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1869:1: ( rule__Feature_Impl__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1869:2: rule__Feature_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__NameAssignment_1_in_rule__Feature_Impl__Group__1__Impl3767);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1879:1: rule__Feature_Impl__Group__2 : rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 ;
    public final void rule__Feature_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1883:1: ( rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1884:2: rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__2__Impl_in_rule__Feature_Impl__Group__23797);
            rule__Feature_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group__3_in_rule__Feature_Impl__Group__23800);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1891:1: rule__Feature_Impl__Group__2__Impl : ( ( rule__Feature_Impl__Group_2__0 )? ) ;
    public final void rule__Feature_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1895:1: ( ( ( rule__Feature_Impl__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1896:1: ( ( rule__Feature_Impl__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1896:1: ( ( rule__Feature_Impl__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1897:1: ( rule__Feature_Impl__Group_2__0 )?
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1898:1: ( rule__Feature_Impl__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_BEGIN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1898:2: rule__Feature_Impl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Feature_Impl__Group_2__0_in_rule__Feature_Impl__Group__2__Impl3827);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1908:1: rule__Feature_Impl__Group__3 : rule__Feature_Impl__Group__3__Impl ;
    public final void rule__Feature_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1912:1: ( rule__Feature_Impl__Group__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1913:2: rule__Feature_Impl__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__3__Impl_in_rule__Feature_Impl__Group__33858);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1919:1: rule__Feature_Impl__Group__3__Impl : ( ( rule__Feature_Impl__Group_3__0 )? ) ;
    public final void rule__Feature_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1923:1: ( ( ( rule__Feature_Impl__Group_3__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1924:1: ( ( rule__Feature_Impl__Group_3__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1924:1: ( ( rule__Feature_Impl__Group_3__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1925:1: ( rule__Feature_Impl__Group_3__0 )?
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1926:1: ( rule__Feature_Impl__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LeftSquareBracket) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1926:2: rule__Feature_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Feature_Impl__Group_3__0_in_rule__Feature_Impl__Group__3__Impl3885);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1944:1: rule__Feature_Impl__Group_2__0 : rule__Feature_Impl__Group_2__0__Impl rule__Feature_Impl__Group_2__1 ;
    public final void rule__Feature_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1948:1: ( rule__Feature_Impl__Group_2__0__Impl rule__Feature_Impl__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1949:2: rule__Feature_Impl__Group_2__0__Impl rule__Feature_Impl__Group_2__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__0__Impl_in_rule__Feature_Impl__Group_2__03924);
            rule__Feature_Impl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__1_in_rule__Feature_Impl__Group_2__03927);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1956:1: rule__Feature_Impl__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Feature_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1960:1: ( ( RULE_BEGIN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1961:1: ( RULE_BEGIN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1961:1: ( RULE_BEGIN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1962:1: RULE_BEGIN
            {
             before(grammarAccess.getFeature_ImplAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Feature_Impl__Group_2__0__Impl3954); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1973:1: rule__Feature_Impl__Group_2__1 : rule__Feature_Impl__Group_2__1__Impl rule__Feature_Impl__Group_2__2 ;
    public final void rule__Feature_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1977:1: ( rule__Feature_Impl__Group_2__1__Impl rule__Feature_Impl__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1978:2: rule__Feature_Impl__Group_2__1__Impl rule__Feature_Impl__Group_2__2
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__1__Impl_in_rule__Feature_Impl__Group_2__13983);
            rule__Feature_Impl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__2_in_rule__Feature_Impl__Group_2__13986);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1985:1: rule__Feature_Impl__Group_2__1__Impl : ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) ) ;
    public final void rule__Feature_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1989:1: ( ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1990:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1990:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1991:1: ( rule__Feature_Impl__SubfeatureAssignment_2_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1992:1: ( rule__Feature_Impl__SubfeatureAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1992:2: rule__Feature_Impl__SubfeatureAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_1_in_rule__Feature_Impl__Group_2__1__Impl4013);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2002:1: rule__Feature_Impl__Group_2__2 : rule__Feature_Impl__Group_2__2__Impl rule__Feature_Impl__Group_2__3 ;
    public final void rule__Feature_Impl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2006:1: ( rule__Feature_Impl__Group_2__2__Impl rule__Feature_Impl__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2007:2: rule__Feature_Impl__Group_2__2__Impl rule__Feature_Impl__Group_2__3
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__2__Impl_in_rule__Feature_Impl__Group_2__24043);
            rule__Feature_Impl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__3_in_rule__Feature_Impl__Group_2__24046);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2014:1: rule__Feature_Impl__Group_2__2__Impl : ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* ) ;
    public final void rule__Feature_Impl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2018:1: ( ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2019:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2019:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2020:1: ( rule__Feature_Impl__SubfeatureAssignment_2_2 )*
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureAssignment_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2021:1: ( rule__Feature_Impl__SubfeatureAssignment_2_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==QuestionMark||LA13_0==RULE_NULL||(LA13_0>=RULE_ID && LA13_0<=RULE_STRING)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2021:2: rule__Feature_Impl__SubfeatureAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_2_in_rule__Feature_Impl__Group_2__2__Impl4073);
            	    rule__Feature_Impl__SubfeatureAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2031:1: rule__Feature_Impl__Group_2__3 : rule__Feature_Impl__Group_2__3__Impl ;
    public final void rule__Feature_Impl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2035:1: ( rule__Feature_Impl__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2036:2: rule__Feature_Impl__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__3__Impl_in_rule__Feature_Impl__Group_2__34104);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2042:1: rule__Feature_Impl__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Feature_Impl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2046:1: ( ( RULE_END ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2047:1: ( RULE_END )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2047:1: ( RULE_END )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2048:1: RULE_END
            {
             before(grammarAccess.getFeature_ImplAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Feature_Impl__Group_2__3__Impl4131); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2067:1: rule__Feature_Impl__Group_3__0 : rule__Feature_Impl__Group_3__0__Impl rule__Feature_Impl__Group_3__1 ;
    public final void rule__Feature_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2071:1: ( rule__Feature_Impl__Group_3__0__Impl rule__Feature_Impl__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2072:2: rule__Feature_Impl__Group_3__0__Impl rule__Feature_Impl__Group_3__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__0__Impl_in_rule__Feature_Impl__Group_3__04168);
            rule__Feature_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__1_in_rule__Feature_Impl__Group_3__04171);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2079:1: rule__Feature_Impl__Group_3__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Feature_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2083:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2084:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2084:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2085:1: LeftSquareBracket
            {
             before(grammarAccess.getFeature_ImplAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Feature_Impl__Group_3__0__Impl4199); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2098:1: rule__Feature_Impl__Group_3__1 : rule__Feature_Impl__Group_3__1__Impl rule__Feature_Impl__Group_3__2 ;
    public final void rule__Feature_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2102:1: ( rule__Feature_Impl__Group_3__1__Impl rule__Feature_Impl__Group_3__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2103:2: rule__Feature_Impl__Group_3__1__Impl rule__Feature_Impl__Group_3__2
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__1__Impl_in_rule__Feature_Impl__Group_3__14230);
            rule__Feature_Impl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__2_in_rule__Feature_Impl__Group_3__14233);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2110:1: rule__Feature_Impl__Group_3__1__Impl : ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) ) ;
    public final void rule__Feature_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2114:1: ( ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2115:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2115:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2116:1: ( rule__Feature_Impl__ConstrainsAssignment_3_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsAssignment_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2117:1: ( rule__Feature_Impl__ConstrainsAssignment_3_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2117:2: rule__Feature_Impl__ConstrainsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_1_in_rule__Feature_Impl__Group_3__1__Impl4260);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2127:1: rule__Feature_Impl__Group_3__2 : rule__Feature_Impl__Group_3__2__Impl rule__Feature_Impl__Group_3__3 ;
    public final void rule__Feature_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2131:1: ( rule__Feature_Impl__Group_3__2__Impl rule__Feature_Impl__Group_3__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2132:2: rule__Feature_Impl__Group_3__2__Impl rule__Feature_Impl__Group_3__3
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__2__Impl_in_rule__Feature_Impl__Group_3__24290);
            rule__Feature_Impl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__3_in_rule__Feature_Impl__Group_3__24293);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2139:1: rule__Feature_Impl__Group_3__2__Impl : ( ( rule__Feature_Impl__Group_3_2__0 )* ) ;
    public final void rule__Feature_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2143:1: ( ( ( rule__Feature_Impl__Group_3_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2144:1: ( ( rule__Feature_Impl__Group_3_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2144:1: ( ( rule__Feature_Impl__Group_3_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2145:1: ( rule__Feature_Impl__Group_3_2__0 )*
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_3_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2146:1: ( rule__Feature_Impl__Group_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2146:2: rule__Feature_Impl__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__0_in_rule__Feature_Impl__Group_3__2__Impl4320);
            	    rule__Feature_Impl__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2156:1: rule__Feature_Impl__Group_3__3 : rule__Feature_Impl__Group_3__3__Impl ;
    public final void rule__Feature_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2160:1: ( rule__Feature_Impl__Group_3__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2161:2: rule__Feature_Impl__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__3__Impl_in_rule__Feature_Impl__Group_3__34351);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2167:1: rule__Feature_Impl__Group_3__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Feature_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2171:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2172:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2172:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2173:1: RightSquareBracket
            {
             before(grammarAccess.getFeature_ImplAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Feature_Impl__Group_3__3__Impl4379); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2194:1: rule__Feature_Impl__Group_3_2__0 : rule__Feature_Impl__Group_3_2__0__Impl rule__Feature_Impl__Group_3_2__1 ;
    public final void rule__Feature_Impl__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2198:1: ( rule__Feature_Impl__Group_3_2__0__Impl rule__Feature_Impl__Group_3_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2199:2: rule__Feature_Impl__Group_3_2__0__Impl rule__Feature_Impl__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__0__Impl_in_rule__Feature_Impl__Group_3_2__04418);
            rule__Feature_Impl__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__1_in_rule__Feature_Impl__Group_3_2__04421);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2206:1: rule__Feature_Impl__Group_3_2__0__Impl : ( Comma ) ;
    public final void rule__Feature_Impl__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2210:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2211:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2211:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2212:1: Comma
            {
             before(grammarAccess.getFeature_ImplAccess().getCommaKeyword_3_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Feature_Impl__Group_3_2__0__Impl4449); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2225:1: rule__Feature_Impl__Group_3_2__1 : rule__Feature_Impl__Group_3_2__1__Impl ;
    public final void rule__Feature_Impl__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2229:1: ( rule__Feature_Impl__Group_3_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2230:2: rule__Feature_Impl__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__1__Impl_in_rule__Feature_Impl__Group_3_2__14480);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2236:1: rule__Feature_Impl__Group_3_2__1__Impl : ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) ) ;
    public final void rule__Feature_Impl__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2240:1: ( ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2241:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2241:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2242:1: ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsAssignment_3_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2243:1: ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2243:2: rule__Feature_Impl__ConstrainsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_2_1_in_rule__Feature_Impl__Group_3_2__1__Impl4507);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2257:1: rule__Grouped__Group__0 : rule__Grouped__Group__0__Impl rule__Grouped__Group__1 ;
    public final void rule__Grouped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2261:1: ( rule__Grouped__Group__0__Impl rule__Grouped__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2262:2: rule__Grouped__Group__0__Impl rule__Grouped__Group__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group__0__Impl_in_rule__Grouped__Group__04541);
            rule__Grouped__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group__1_in_rule__Grouped__Group__04544);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2269:1: rule__Grouped__Group__0__Impl : ( ( rule__Grouped__NameAssignment_0 ) ) ;
    public final void rule__Grouped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2273:1: ( ( ( rule__Grouped__NameAssignment_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2274:1: ( ( rule__Grouped__NameAssignment_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2274:1: ( ( rule__Grouped__NameAssignment_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2275:1: ( rule__Grouped__NameAssignment_0 )
            {
             before(grammarAccess.getGroupedAccess().getNameAssignment_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2276:1: ( rule__Grouped__NameAssignment_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2276:2: rule__Grouped__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Grouped__NameAssignment_0_in_rule__Grouped__Group__0__Impl4571);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2286:1: rule__Grouped__Group__1 : rule__Grouped__Group__1__Impl rule__Grouped__Group__2 ;
    public final void rule__Grouped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2290:1: ( rule__Grouped__Group__1__Impl rule__Grouped__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2291:2: rule__Grouped__Group__1__Impl rule__Grouped__Group__2
            {
            pushFollow(FOLLOW_rule__Grouped__Group__1__Impl_in_rule__Grouped__Group__14601);
            rule__Grouped__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group__2_in_rule__Grouped__Group__14604);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2298:1: rule__Grouped__Group__1__Impl : ( ( rule__Grouped__RangeAssignment_1 )? ) ;
    public final void rule__Grouped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2302:1: ( ( ( rule__Grouped__RangeAssignment_1 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2303:1: ( ( rule__Grouped__RangeAssignment_1 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2303:1: ( ( rule__Grouped__RangeAssignment_1 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2304:1: ( rule__Grouped__RangeAssignment_1 )?
            {
             before(grammarAccess.getGroupedAccess().getRangeAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2305:1: ( rule__Grouped__RangeAssignment_1 )?
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2305:2: rule__Grouped__RangeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Grouped__RangeAssignment_1_in_rule__Grouped__Group__1__Impl4631);
                    rule__Grouped__RangeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupedAccess().getRangeAssignment_1()); 

            }


            }

        }
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2315:1: rule__Grouped__Group__2 : rule__Grouped__Group__2__Impl ;
    public final void rule__Grouped__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2319:1: ( rule__Grouped__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2320:2: rule__Grouped__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group__2__Impl_in_rule__Grouped__Group__24662);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2326:1: rule__Grouped__Group__2__Impl : ( ( rule__Grouped__Group_2__0 )? ) ;
    public final void rule__Grouped__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2330:1: ( ( ( rule__Grouped__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2331:1: ( ( rule__Grouped__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2331:1: ( ( rule__Grouped__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2332:1: ( rule__Grouped__Group_2__0 )?
            {
             before(grammarAccess.getGroupedAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2333:1: ( rule__Grouped__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LeftSquareBracket) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2333:2: rule__Grouped__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Grouped__Group_2__0_in_rule__Grouped__Group__2__Impl4689);
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


    // $ANTLR start "rule__Grouped__Group_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2349:1: rule__Grouped__Group_2__0 : rule__Grouped__Group_2__0__Impl rule__Grouped__Group_2__1 ;
    public final void rule__Grouped__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2353:1: ( rule__Grouped__Group_2__0__Impl rule__Grouped__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2354:2: rule__Grouped__Group_2__0__Impl rule__Grouped__Group_2__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2__0__Impl_in_rule__Grouped__Group_2__04726);
            rule__Grouped__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_2__1_in_rule__Grouped__Group_2__04729);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2361:1: rule__Grouped__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Grouped__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2365:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2366:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2366:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2367:1: LeftSquareBracket
            {
             before(grammarAccess.getGroupedAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Grouped__Group_2__0__Impl4757); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2380:1: rule__Grouped__Group_2__1 : rule__Grouped__Group_2__1__Impl rule__Grouped__Group_2__2 ;
    public final void rule__Grouped__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2384:1: ( rule__Grouped__Group_2__1__Impl rule__Grouped__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2385:2: rule__Grouped__Group_2__1__Impl rule__Grouped__Group_2__2
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2__1__Impl_in_rule__Grouped__Group_2__14788);
            rule__Grouped__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_2__2_in_rule__Grouped__Group_2__14791);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2392:1: rule__Grouped__Group_2__1__Impl : ( ( rule__Grouped__ConstrainsAssignment_2_1 ) ) ;
    public final void rule__Grouped__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2396:1: ( ( ( rule__Grouped__ConstrainsAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2397:1: ( ( rule__Grouped__ConstrainsAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2397:1: ( ( rule__Grouped__ConstrainsAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2398:1: ( rule__Grouped__ConstrainsAssignment_2_1 )
            {
             before(grammarAccess.getGroupedAccess().getConstrainsAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2399:1: ( rule__Grouped__ConstrainsAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2399:2: rule__Grouped__ConstrainsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Grouped__ConstrainsAssignment_2_1_in_rule__Grouped__Group_2__1__Impl4818);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2409:1: rule__Grouped__Group_2__2 : rule__Grouped__Group_2__2__Impl rule__Grouped__Group_2__3 ;
    public final void rule__Grouped__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2413:1: ( rule__Grouped__Group_2__2__Impl rule__Grouped__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2414:2: rule__Grouped__Group_2__2__Impl rule__Grouped__Group_2__3
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2__2__Impl_in_rule__Grouped__Group_2__24848);
            rule__Grouped__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_2__3_in_rule__Grouped__Group_2__24851);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2421:1: rule__Grouped__Group_2__2__Impl : ( ( rule__Grouped__Group_2_2__0 )* ) ;
    public final void rule__Grouped__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2425:1: ( ( ( rule__Grouped__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2426:1: ( ( rule__Grouped__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2426:1: ( ( rule__Grouped__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2427:1: ( rule__Grouped__Group_2_2__0 )*
            {
             before(grammarAccess.getGroupedAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2428:1: ( rule__Grouped__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2428:2: rule__Grouped__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Grouped__Group_2_2__0_in_rule__Grouped__Group_2__2__Impl4878);
            	    rule__Grouped__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2438:1: rule__Grouped__Group_2__3 : rule__Grouped__Group_2__3__Impl ;
    public final void rule__Grouped__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2442:1: ( rule__Grouped__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2443:2: rule__Grouped__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2__3__Impl_in_rule__Grouped__Group_2__34909);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2449:1: rule__Grouped__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Grouped__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2453:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2454:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2454:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2455:1: RightSquareBracket
            {
             before(grammarAccess.getGroupedAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Grouped__Group_2__3__Impl4937); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2476:1: rule__Grouped__Group_2_2__0 : rule__Grouped__Group_2_2__0__Impl rule__Grouped__Group_2_2__1 ;
    public final void rule__Grouped__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2480:1: ( rule__Grouped__Group_2_2__0__Impl rule__Grouped__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2481:2: rule__Grouped__Group_2_2__0__Impl rule__Grouped__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2_2__0__Impl_in_rule__Grouped__Group_2_2__04976);
            rule__Grouped__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_2_2__1_in_rule__Grouped__Group_2_2__04979);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2488:1: rule__Grouped__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Grouped__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2492:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2493:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2493:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2494:1: Comma
            {
             before(grammarAccess.getGroupedAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Grouped__Group_2_2__0__Impl5007); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2507:1: rule__Grouped__Group_2_2__1 : rule__Grouped__Group_2_2__1__Impl ;
    public final void rule__Grouped__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2511:1: ( rule__Grouped__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2512:2: rule__Grouped__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group_2_2__1__Impl_in_rule__Grouped__Group_2_2__15038);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2518:1: rule__Grouped__Group_2_2__1__Impl : ( ( rule__Grouped__ConstrainsAssignment_2_2_1 ) ) ;
    public final void rule__Grouped__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2522:1: ( ( ( rule__Grouped__ConstrainsAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2523:1: ( ( rule__Grouped__ConstrainsAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2523:1: ( ( rule__Grouped__ConstrainsAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2524:1: ( rule__Grouped__ConstrainsAssignment_2_2_1 )
            {
             before(grammarAccess.getGroupedAccess().getConstrainsAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2525:1: ( rule__Grouped__ConstrainsAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2525:2: rule__Grouped__ConstrainsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Grouped__ConstrainsAssignment_2_2_1_in_rule__Grouped__Group_2_2__1__Impl5065);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2539:1: rule__Mandatory__Group__0 : rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 ;
    public final void rule__Mandatory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2543:1: ( rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2544:2: rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__05099);
            rule__Mandatory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__05102);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2551:1: rule__Mandatory__Group__0__Impl : ( ( rule__Mandatory__NameAssignment_0 ) ) ;
    public final void rule__Mandatory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2555:1: ( ( ( rule__Mandatory__NameAssignment_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2556:1: ( ( rule__Mandatory__NameAssignment_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2556:1: ( ( rule__Mandatory__NameAssignment_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2557:1: ( rule__Mandatory__NameAssignment_0 )
            {
             before(grammarAccess.getMandatoryAccess().getNameAssignment_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2558:1: ( rule__Mandatory__NameAssignment_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2558:2: rule__Mandatory__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Mandatory__NameAssignment_0_in_rule__Mandatory__Group__0__Impl5129);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2568:1: rule__Mandatory__Group__1 : rule__Mandatory__Group__1__Impl rule__Mandatory__Group__2 ;
    public final void rule__Mandatory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2572:1: ( rule__Mandatory__Group__1__Impl rule__Mandatory__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2573:2: rule__Mandatory__Group__1__Impl rule__Mandatory__Group__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__15159);
            rule__Mandatory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__2_in_rule__Mandatory__Group__15162);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2580:1: rule__Mandatory__Group__1__Impl : ( ( rule__Mandatory__Group_1__0 )? ) ;
    public final void rule__Mandatory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2584:1: ( ( ( rule__Mandatory__Group_1__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2585:1: ( ( rule__Mandatory__Group_1__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2585:1: ( ( rule__Mandatory__Group_1__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2586:1: ( rule__Mandatory__Group_1__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2587:1: ( rule__Mandatory__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LeftCurlyBracket) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2587:2: rule__Mandatory__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_1__0_in_rule__Mandatory__Group__1__Impl5189);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2597:1: rule__Mandatory__Group__2 : rule__Mandatory__Group__2__Impl rule__Mandatory__Group__3 ;
    public final void rule__Mandatory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2601:1: ( rule__Mandatory__Group__2__Impl rule__Mandatory__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2602:2: rule__Mandatory__Group__2__Impl rule__Mandatory__Group__3
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__2__Impl_in_rule__Mandatory__Group__25220);
            rule__Mandatory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__3_in_rule__Mandatory__Group__25223);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2609:1: rule__Mandatory__Group__2__Impl : ( ( rule__Mandatory__Group_2__0 )? ) ;
    public final void rule__Mandatory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2613:1: ( ( ( rule__Mandatory__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2614:1: ( ( rule__Mandatory__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2614:1: ( ( rule__Mandatory__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2615:1: ( rule__Mandatory__Group_2__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2616:1: ( rule__Mandatory__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftSquareBracket) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2616:2: rule__Mandatory__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_2__0_in_rule__Mandatory__Group__2__Impl5250);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2626:1: rule__Mandatory__Group__3 : rule__Mandatory__Group__3__Impl ;
    public final void rule__Mandatory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2630:1: ( rule__Mandatory__Group__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2631:2: rule__Mandatory__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__3__Impl_in_rule__Mandatory__Group__35281);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2637:1: rule__Mandatory__Group__3__Impl : ( ( rule__Mandatory__Group_3__0 )? ) ;
    public final void rule__Mandatory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2641:1: ( ( ( rule__Mandatory__Group_3__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2642:1: ( ( rule__Mandatory__Group_3__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2642:1: ( ( rule__Mandatory__Group_3__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2643:1: ( rule__Mandatory__Group_3__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2644:1: ( rule__Mandatory__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Xor||LA20_0==Or) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2644:2: rule__Mandatory__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_3__0_in_rule__Mandatory__Group__3__Impl5308);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2662:1: rule__Mandatory__Group_1__0 : rule__Mandatory__Group_1__0__Impl rule__Mandatory__Group_1__1 ;
    public final void rule__Mandatory__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2666:1: ( rule__Mandatory__Group_1__0__Impl rule__Mandatory__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2667:2: rule__Mandatory__Group_1__0__Impl rule__Mandatory__Group_1__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__0__Impl_in_rule__Mandatory__Group_1__05347);
            rule__Mandatory__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1__1_in_rule__Mandatory__Group_1__05350);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2674:1: rule__Mandatory__Group_1__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Mandatory__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2678:1: ( ( LeftCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2679:1: ( LeftCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2679:1: ( LeftCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2680:1: LeftCurlyBracket
            {
             before(grammarAccess.getMandatoryAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__Mandatory__Group_1__0__Impl5378); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2693:1: rule__Mandatory__Group_1__1 : rule__Mandatory__Group_1__1__Impl rule__Mandatory__Group_1__2 ;
    public final void rule__Mandatory__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2697:1: ( rule__Mandatory__Group_1__1__Impl rule__Mandatory__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2698:2: rule__Mandatory__Group_1__1__Impl rule__Mandatory__Group_1__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__1__Impl_in_rule__Mandatory__Group_1__15409);
            rule__Mandatory__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1__2_in_rule__Mandatory__Group_1__15412);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2705:1: rule__Mandatory__Group_1__1__Impl : ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) ) ;
    public final void rule__Mandatory__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2709:1: ( ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2710:1: ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2710:1: ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2711:1: ( rule__Mandatory__SubfeatureAssignment_1_1 )
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2712:1: ( rule__Mandatory__SubfeatureAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2712:2: rule__Mandatory__SubfeatureAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Mandatory__SubfeatureAssignment_1_1_in_rule__Mandatory__Group_1__1__Impl5439);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2722:1: rule__Mandatory__Group_1__2 : rule__Mandatory__Group_1__2__Impl rule__Mandatory__Group_1__3 ;
    public final void rule__Mandatory__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2726:1: ( rule__Mandatory__Group_1__2__Impl rule__Mandatory__Group_1__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2727:2: rule__Mandatory__Group_1__2__Impl rule__Mandatory__Group_1__3
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__2__Impl_in_rule__Mandatory__Group_1__25469);
            rule__Mandatory__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1__3_in_rule__Mandatory__Group_1__25472);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2734:1: rule__Mandatory__Group_1__2__Impl : ( ( rule__Mandatory__Group_1_2__0 )* ) ;
    public final void rule__Mandatory__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2738:1: ( ( ( rule__Mandatory__Group_1_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2739:1: ( ( rule__Mandatory__Group_1_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2739:1: ( ( rule__Mandatory__Group_1_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2740:1: ( rule__Mandatory__Group_1_2__0 )*
            {
             before(grammarAccess.getMandatoryAccess().getGroup_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2741:1: ( rule__Mandatory__Group_1_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2741:2: rule__Mandatory__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__Group_1_2__0_in_rule__Mandatory__Group_1__2__Impl5499);
            	    rule__Mandatory__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2751:1: rule__Mandatory__Group_1__3 : rule__Mandatory__Group_1__3__Impl ;
    public final void rule__Mandatory__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2755:1: ( rule__Mandatory__Group_1__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2756:2: rule__Mandatory__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__3__Impl_in_rule__Mandatory__Group_1__35530);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2762:1: rule__Mandatory__Group_1__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Mandatory__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2766:1: ( ( RightCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2767:1: ( RightCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2767:1: ( RightCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2768:1: RightCurlyBracket
            {
             before(grammarAccess.getMandatoryAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__Mandatory__Group_1__3__Impl5558); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2789:1: rule__Mandatory__Group_1_2__0 : rule__Mandatory__Group_1_2__0__Impl rule__Mandatory__Group_1_2__1 ;
    public final void rule__Mandatory__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2793:1: ( rule__Mandatory__Group_1_2__0__Impl rule__Mandatory__Group_1_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2794:2: rule__Mandatory__Group_1_2__0__Impl rule__Mandatory__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1_2__0__Impl_in_rule__Mandatory__Group_1_2__05597);
            rule__Mandatory__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1_2__1_in_rule__Mandatory__Group_1_2__05600);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2801:1: rule__Mandatory__Group_1_2__0__Impl : ( Comma ) ;
    public final void rule__Mandatory__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2805:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2806:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2806:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2807:1: Comma
            {
             before(grammarAccess.getMandatoryAccess().getCommaKeyword_1_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Mandatory__Group_1_2__0__Impl5628); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2820:1: rule__Mandatory__Group_1_2__1 : rule__Mandatory__Group_1_2__1__Impl ;
    public final void rule__Mandatory__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2824:1: ( rule__Mandatory__Group_1_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2825:2: rule__Mandatory__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1_2__1__Impl_in_rule__Mandatory__Group_1_2__15659);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2831:1: rule__Mandatory__Group_1_2__1__Impl : ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) ) ;
    public final void rule__Mandatory__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2835:1: ( ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2836:1: ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2836:1: ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2837:1: ( rule__Mandatory__SubfeatureAssignment_1_2_1 )
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureAssignment_1_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2838:1: ( rule__Mandatory__SubfeatureAssignment_1_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2838:2: rule__Mandatory__SubfeatureAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Mandatory__SubfeatureAssignment_1_2_1_in_rule__Mandatory__Group_1_2__1__Impl5686);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2852:1: rule__Mandatory__Group_2__0 : rule__Mandatory__Group_2__0__Impl rule__Mandatory__Group_2__1 ;
    public final void rule__Mandatory__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2856:1: ( rule__Mandatory__Group_2__0__Impl rule__Mandatory__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2857:2: rule__Mandatory__Group_2__0__Impl rule__Mandatory__Group_2__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__0__Impl_in_rule__Mandatory__Group_2__05720);
            rule__Mandatory__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2__1_in_rule__Mandatory__Group_2__05723);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2864:1: rule__Mandatory__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Mandatory__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2868:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2869:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2869:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2870:1: LeftSquareBracket
            {
             before(grammarAccess.getMandatoryAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Mandatory__Group_2__0__Impl5751); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2883:1: rule__Mandatory__Group_2__1 : rule__Mandatory__Group_2__1__Impl rule__Mandatory__Group_2__2 ;
    public final void rule__Mandatory__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2887:1: ( rule__Mandatory__Group_2__1__Impl rule__Mandatory__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2888:2: rule__Mandatory__Group_2__1__Impl rule__Mandatory__Group_2__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__1__Impl_in_rule__Mandatory__Group_2__15782);
            rule__Mandatory__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2__2_in_rule__Mandatory__Group_2__15785);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2895:1: rule__Mandatory__Group_2__1__Impl : ( ( rule__Mandatory__ConstrainsAssignment_2_1 ) ) ;
    public final void rule__Mandatory__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2899:1: ( ( ( rule__Mandatory__ConstrainsAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2900:1: ( ( rule__Mandatory__ConstrainsAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2900:1: ( ( rule__Mandatory__ConstrainsAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2901:1: ( rule__Mandatory__ConstrainsAssignment_2_1 )
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2902:1: ( rule__Mandatory__ConstrainsAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2902:2: rule__Mandatory__ConstrainsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Mandatory__ConstrainsAssignment_2_1_in_rule__Mandatory__Group_2__1__Impl5812);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2912:1: rule__Mandatory__Group_2__2 : rule__Mandatory__Group_2__2__Impl rule__Mandatory__Group_2__3 ;
    public final void rule__Mandatory__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2916:1: ( rule__Mandatory__Group_2__2__Impl rule__Mandatory__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2917:2: rule__Mandatory__Group_2__2__Impl rule__Mandatory__Group_2__3
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__2__Impl_in_rule__Mandatory__Group_2__25842);
            rule__Mandatory__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2__3_in_rule__Mandatory__Group_2__25845);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2924:1: rule__Mandatory__Group_2__2__Impl : ( ( rule__Mandatory__Group_2_2__0 )* ) ;
    public final void rule__Mandatory__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2928:1: ( ( ( rule__Mandatory__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2929:1: ( ( rule__Mandatory__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2929:1: ( ( rule__Mandatory__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2930:1: ( rule__Mandatory__Group_2_2__0 )*
            {
             before(grammarAccess.getMandatoryAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2931:1: ( rule__Mandatory__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Comma) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2931:2: rule__Mandatory__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__Group_2_2__0_in_rule__Mandatory__Group_2__2__Impl5872);
            	    rule__Mandatory__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2941:1: rule__Mandatory__Group_2__3 : rule__Mandatory__Group_2__3__Impl ;
    public final void rule__Mandatory__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2945:1: ( rule__Mandatory__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2946:2: rule__Mandatory__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__3__Impl_in_rule__Mandatory__Group_2__35903);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2952:1: rule__Mandatory__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Mandatory__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2956:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2957:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2957:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2958:1: RightSquareBracket
            {
             before(grammarAccess.getMandatoryAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Mandatory__Group_2__3__Impl5931); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2979:1: rule__Mandatory__Group_2_2__0 : rule__Mandatory__Group_2_2__0__Impl rule__Mandatory__Group_2_2__1 ;
    public final void rule__Mandatory__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2983:1: ( rule__Mandatory__Group_2_2__0__Impl rule__Mandatory__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2984:2: rule__Mandatory__Group_2_2__0__Impl rule__Mandatory__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2_2__0__Impl_in_rule__Mandatory__Group_2_2__05970);
            rule__Mandatory__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2_2__1_in_rule__Mandatory__Group_2_2__05973);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2991:1: rule__Mandatory__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Mandatory__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2995:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2996:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2996:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2997:1: Comma
            {
             before(grammarAccess.getMandatoryAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Mandatory__Group_2_2__0__Impl6001); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3010:1: rule__Mandatory__Group_2_2__1 : rule__Mandatory__Group_2_2__1__Impl ;
    public final void rule__Mandatory__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3014:1: ( rule__Mandatory__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3015:2: rule__Mandatory__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2_2__1__Impl_in_rule__Mandatory__Group_2_2__16032);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3021:1: rule__Mandatory__Group_2_2__1__Impl : ( ( rule__Mandatory__ConstrainsAssignment_2_2_1 ) ) ;
    public final void rule__Mandatory__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3025:1: ( ( ( rule__Mandatory__ConstrainsAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3026:1: ( ( rule__Mandatory__ConstrainsAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3026:1: ( ( rule__Mandatory__ConstrainsAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3027:1: ( rule__Mandatory__ConstrainsAssignment_2_2_1 )
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3028:1: ( rule__Mandatory__ConstrainsAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3028:2: rule__Mandatory__ConstrainsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Mandatory__ConstrainsAssignment_2_2_1_in_rule__Mandatory__Group_2_2__1__Impl6059);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3042:1: rule__Mandatory__Group_3__0 : rule__Mandatory__Group_3__0__Impl rule__Mandatory__Group_3__1 ;
    public final void rule__Mandatory__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3046:1: ( rule__Mandatory__Group_3__0__Impl rule__Mandatory__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3047:2: rule__Mandatory__Group_3__0__Impl rule__Mandatory__Group_3__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_3__0__Impl_in_rule__Mandatory__Group_3__06093);
            rule__Mandatory__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_3__1_in_rule__Mandatory__Group_3__06096);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3054:1: rule__Mandatory__Group_3__0__Impl : ( ( rule__Mandatory__GroupsAssignment_3_0 ) ) ;
    public final void rule__Mandatory__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3058:1: ( ( ( rule__Mandatory__GroupsAssignment_3_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3059:1: ( ( rule__Mandatory__GroupsAssignment_3_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3059:1: ( ( rule__Mandatory__GroupsAssignment_3_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3060:1: ( rule__Mandatory__GroupsAssignment_3_0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroupsAssignment_3_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3061:1: ( rule__Mandatory__GroupsAssignment_3_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3061:2: rule__Mandatory__GroupsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Mandatory__GroupsAssignment_3_0_in_rule__Mandatory__Group_3__0__Impl6123);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3071:1: rule__Mandatory__Group_3__1 : rule__Mandatory__Group_3__1__Impl ;
    public final void rule__Mandatory__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3075:1: ( rule__Mandatory__Group_3__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3076:2: rule__Mandatory__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_3__1__Impl_in_rule__Mandatory__Group_3__16153);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3082:1: rule__Mandatory__Group_3__1__Impl : ( ( rule__Mandatory__GroupsAssignment_3_1 )* ) ;
    public final void rule__Mandatory__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3086:1: ( ( ( rule__Mandatory__GroupsAssignment_3_1 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3087:1: ( ( rule__Mandatory__GroupsAssignment_3_1 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3087:1: ( ( rule__Mandatory__GroupsAssignment_3_1 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3088:1: ( rule__Mandatory__GroupsAssignment_3_1 )*
            {
             before(grammarAccess.getMandatoryAccess().getGroupsAssignment_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3089:1: ( rule__Mandatory__GroupsAssignment_3_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Xor||LA23_0==Or) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3089:2: rule__Mandatory__GroupsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__GroupsAssignment_3_1_in_rule__Mandatory__Group_3__1__Impl6180);
            	    rule__Mandatory__GroupsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3103:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3107:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3108:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__06215);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__06218);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3115:1: rule__Optional__Group__0__Impl : ( QuestionMark ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3119:1: ( ( QuestionMark ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3120:1: ( QuestionMark )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3120:1: ( QuestionMark )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3121:1: QuestionMark
            {
             before(grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0()); 
            match(input,QuestionMark,FOLLOW_QuestionMark_in_rule__Optional__Group__0__Impl6246); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3134:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl rule__Optional__Group__2 ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3138:1: ( rule__Optional__Group__1__Impl rule__Optional__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3139:2: rule__Optional__Group__1__Impl rule__Optional__Group__2
            {
            pushFollow(FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__16277);
            rule__Optional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__2_in_rule__Optional__Group__16280);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3146:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__NameAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3150:1: ( ( ( rule__Optional__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3151:1: ( ( rule__Optional__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3151:1: ( ( rule__Optional__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3152:1: ( rule__Optional__NameAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3153:1: ( rule__Optional__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3153:2: rule__Optional__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Optional__NameAssignment_1_in_rule__Optional__Group__1__Impl6307);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3163:1: rule__Optional__Group__2 : rule__Optional__Group__2__Impl rule__Optional__Group__3 ;
    public final void rule__Optional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3167:1: ( rule__Optional__Group__2__Impl rule__Optional__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3168:2: rule__Optional__Group__2__Impl rule__Optional__Group__3
            {
            pushFollow(FOLLOW_rule__Optional__Group__2__Impl_in_rule__Optional__Group__26337);
            rule__Optional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__3_in_rule__Optional__Group__26340);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3175:1: rule__Optional__Group__2__Impl : ( ( rule__Optional__Group_2__0 )? ) ;
    public final void rule__Optional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3179:1: ( ( ( rule__Optional__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3180:1: ( ( rule__Optional__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3180:1: ( ( rule__Optional__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3181:1: ( rule__Optional__Group_2__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3182:1: ( rule__Optional__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftCurlyBracket) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3182:2: rule__Optional__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_2__0_in_rule__Optional__Group__2__Impl6367);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3192:1: rule__Optional__Group__3 : rule__Optional__Group__3__Impl rule__Optional__Group__4 ;
    public final void rule__Optional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3196:1: ( rule__Optional__Group__3__Impl rule__Optional__Group__4 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3197:2: rule__Optional__Group__3__Impl rule__Optional__Group__4
            {
            pushFollow(FOLLOW_rule__Optional__Group__3__Impl_in_rule__Optional__Group__36398);
            rule__Optional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__4_in_rule__Optional__Group__36401);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3204:1: rule__Optional__Group__3__Impl : ( ( rule__Optional__Group_3__0 )? ) ;
    public final void rule__Optional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3208:1: ( ( ( rule__Optional__Group_3__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3209:1: ( ( rule__Optional__Group_3__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3209:1: ( ( rule__Optional__Group_3__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3210:1: ( rule__Optional__Group_3__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3211:1: ( rule__Optional__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LeftSquareBracket) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3211:2: rule__Optional__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_3__0_in_rule__Optional__Group__3__Impl6428);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3221:1: rule__Optional__Group__4 : rule__Optional__Group__4__Impl ;
    public final void rule__Optional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3225:1: ( rule__Optional__Group__4__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3226:2: rule__Optional__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group__4__Impl_in_rule__Optional__Group__46459);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3232:1: rule__Optional__Group__4__Impl : ( ( rule__Optional__Group_4__0 )? ) ;
    public final void rule__Optional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3236:1: ( ( ( rule__Optional__Group_4__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3237:1: ( ( rule__Optional__Group_4__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3237:1: ( ( rule__Optional__Group_4__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3238:1: ( rule__Optional__Group_4__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_4()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3239:1: ( rule__Optional__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Xor||LA26_0==Or) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3239:2: rule__Optional__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_4__0_in_rule__Optional__Group__4__Impl6486);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3259:1: rule__Optional__Group_2__0 : rule__Optional__Group_2__0__Impl rule__Optional__Group_2__1 ;
    public final void rule__Optional__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3263:1: ( rule__Optional__Group_2__0__Impl rule__Optional__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3264:2: rule__Optional__Group_2__0__Impl rule__Optional__Group_2__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__0__Impl_in_rule__Optional__Group_2__06527);
            rule__Optional__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2__1_in_rule__Optional__Group_2__06530);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3271:1: rule__Optional__Group_2__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Optional__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3275:1: ( ( LeftCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3276:1: ( LeftCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3276:1: ( LeftCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3277:1: LeftCurlyBracket
            {
             before(grammarAccess.getOptionalAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__Optional__Group_2__0__Impl6558); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3290:1: rule__Optional__Group_2__1 : rule__Optional__Group_2__1__Impl rule__Optional__Group_2__2 ;
    public final void rule__Optional__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3294:1: ( rule__Optional__Group_2__1__Impl rule__Optional__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3295:2: rule__Optional__Group_2__1__Impl rule__Optional__Group_2__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__1__Impl_in_rule__Optional__Group_2__16589);
            rule__Optional__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2__2_in_rule__Optional__Group_2__16592);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3302:1: rule__Optional__Group_2__1__Impl : ( ( rule__Optional__SubfeatureAssignment_2_1 ) ) ;
    public final void rule__Optional__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3306:1: ( ( ( rule__Optional__SubfeatureAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3307:1: ( ( rule__Optional__SubfeatureAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3307:1: ( ( rule__Optional__SubfeatureAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3308:1: ( rule__Optional__SubfeatureAssignment_2_1 )
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3309:1: ( rule__Optional__SubfeatureAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3309:2: rule__Optional__SubfeatureAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Optional__SubfeatureAssignment_2_1_in_rule__Optional__Group_2__1__Impl6619);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3319:1: rule__Optional__Group_2__2 : rule__Optional__Group_2__2__Impl rule__Optional__Group_2__3 ;
    public final void rule__Optional__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3323:1: ( rule__Optional__Group_2__2__Impl rule__Optional__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3324:2: rule__Optional__Group_2__2__Impl rule__Optional__Group_2__3
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__2__Impl_in_rule__Optional__Group_2__26649);
            rule__Optional__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2__3_in_rule__Optional__Group_2__26652);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3331:1: rule__Optional__Group_2__2__Impl : ( ( rule__Optional__Group_2_2__0 )* ) ;
    public final void rule__Optional__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3335:1: ( ( ( rule__Optional__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3336:1: ( ( rule__Optional__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3336:1: ( ( rule__Optional__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3337:1: ( rule__Optional__Group_2_2__0 )*
            {
             before(grammarAccess.getOptionalAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3338:1: ( rule__Optional__Group_2_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3338:2: rule__Optional__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Optional__Group_2_2__0_in_rule__Optional__Group_2__2__Impl6679);
            	    rule__Optional__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3348:1: rule__Optional__Group_2__3 : rule__Optional__Group_2__3__Impl ;
    public final void rule__Optional__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3352:1: ( rule__Optional__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3353:2: rule__Optional__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__3__Impl_in_rule__Optional__Group_2__36710);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3359:1: rule__Optional__Group_2__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Optional__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3363:1: ( ( RightCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3364:1: ( RightCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3364:1: ( RightCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3365:1: RightCurlyBracket
            {
             before(grammarAccess.getOptionalAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__Optional__Group_2__3__Impl6738); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3386:1: rule__Optional__Group_2_2__0 : rule__Optional__Group_2_2__0__Impl rule__Optional__Group_2_2__1 ;
    public final void rule__Optional__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3390:1: ( rule__Optional__Group_2_2__0__Impl rule__Optional__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3391:2: rule__Optional__Group_2_2__0__Impl rule__Optional__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_2_2__0__Impl_in_rule__Optional__Group_2_2__06777);
            rule__Optional__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2_2__1_in_rule__Optional__Group_2_2__06780);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3398:1: rule__Optional__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Optional__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3402:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3403:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3403:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3404:1: Comma
            {
             before(grammarAccess.getOptionalAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Optional__Group_2_2__0__Impl6808); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3417:1: rule__Optional__Group_2_2__1 : rule__Optional__Group_2_2__1__Impl ;
    public final void rule__Optional__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3421:1: ( rule__Optional__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3422:2: rule__Optional__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_2_2__1__Impl_in_rule__Optional__Group_2_2__16839);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3428:1: rule__Optional__Group_2_2__1__Impl : ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) ) ;
    public final void rule__Optional__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3432:1: ( ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3433:1: ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3433:1: ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3434:1: ( rule__Optional__SubfeatureAssignment_2_2_1 )
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3435:1: ( rule__Optional__SubfeatureAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3435:2: rule__Optional__SubfeatureAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Optional__SubfeatureAssignment_2_2_1_in_rule__Optional__Group_2_2__1__Impl6866);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3449:1: rule__Optional__Group_3__0 : rule__Optional__Group_3__0__Impl rule__Optional__Group_3__1 ;
    public final void rule__Optional__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3453:1: ( rule__Optional__Group_3__0__Impl rule__Optional__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3454:2: rule__Optional__Group_3__0__Impl rule__Optional__Group_3__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__0__Impl_in_rule__Optional__Group_3__06900);
            rule__Optional__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3__1_in_rule__Optional__Group_3__06903);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3461:1: rule__Optional__Group_3__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Optional__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3465:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3466:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3466:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3467:1: LeftSquareBracket
            {
             before(grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Optional__Group_3__0__Impl6931); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3480:1: rule__Optional__Group_3__1 : rule__Optional__Group_3__1__Impl rule__Optional__Group_3__2 ;
    public final void rule__Optional__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3484:1: ( rule__Optional__Group_3__1__Impl rule__Optional__Group_3__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3485:2: rule__Optional__Group_3__1__Impl rule__Optional__Group_3__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__1__Impl_in_rule__Optional__Group_3__16962);
            rule__Optional__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3__2_in_rule__Optional__Group_3__16965);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3492:1: rule__Optional__Group_3__1__Impl : ( ( rule__Optional__ConstrainsAssignment_3_1 ) ) ;
    public final void rule__Optional__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3496:1: ( ( ( rule__Optional__ConstrainsAssignment_3_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3497:1: ( ( rule__Optional__ConstrainsAssignment_3_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3497:1: ( ( rule__Optional__ConstrainsAssignment_3_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3498:1: ( rule__Optional__ConstrainsAssignment_3_1 )
            {
             before(grammarAccess.getOptionalAccess().getConstrainsAssignment_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3499:1: ( rule__Optional__ConstrainsAssignment_3_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3499:2: rule__Optional__ConstrainsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Optional__ConstrainsAssignment_3_1_in_rule__Optional__Group_3__1__Impl6992);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3509:1: rule__Optional__Group_3__2 : rule__Optional__Group_3__2__Impl rule__Optional__Group_3__3 ;
    public final void rule__Optional__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3513:1: ( rule__Optional__Group_3__2__Impl rule__Optional__Group_3__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3514:2: rule__Optional__Group_3__2__Impl rule__Optional__Group_3__3
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__2__Impl_in_rule__Optional__Group_3__27022);
            rule__Optional__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3__3_in_rule__Optional__Group_3__27025);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3521:1: rule__Optional__Group_3__2__Impl : ( ( rule__Optional__Group_3_2__0 )* ) ;
    public final void rule__Optional__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3525:1: ( ( ( rule__Optional__Group_3_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3526:1: ( ( rule__Optional__Group_3_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3526:1: ( ( rule__Optional__Group_3_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3527:1: ( rule__Optional__Group_3_2__0 )*
            {
             before(grammarAccess.getOptionalAccess().getGroup_3_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3528:1: ( rule__Optional__Group_3_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Comma) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3528:2: rule__Optional__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Optional__Group_3_2__0_in_rule__Optional__Group_3__2__Impl7052);
            	    rule__Optional__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3538:1: rule__Optional__Group_3__3 : rule__Optional__Group_3__3__Impl ;
    public final void rule__Optional__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3542:1: ( rule__Optional__Group_3__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3543:2: rule__Optional__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__3__Impl_in_rule__Optional__Group_3__37083);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3549:1: rule__Optional__Group_3__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Optional__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3553:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3554:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3554:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3555:1: RightSquareBracket
            {
             before(grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Optional__Group_3__3__Impl7111); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3576:1: rule__Optional__Group_3_2__0 : rule__Optional__Group_3_2__0__Impl rule__Optional__Group_3_2__1 ;
    public final void rule__Optional__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3580:1: ( rule__Optional__Group_3_2__0__Impl rule__Optional__Group_3_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3581:2: rule__Optional__Group_3_2__0__Impl rule__Optional__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_3_2__0__Impl_in_rule__Optional__Group_3_2__07150);
            rule__Optional__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3_2__1_in_rule__Optional__Group_3_2__07153);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3588:1: rule__Optional__Group_3_2__0__Impl : ( Comma ) ;
    public final void rule__Optional__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3592:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3593:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3593:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3594:1: Comma
            {
             before(grammarAccess.getOptionalAccess().getCommaKeyword_3_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Optional__Group_3_2__0__Impl7181); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3607:1: rule__Optional__Group_3_2__1 : rule__Optional__Group_3_2__1__Impl ;
    public final void rule__Optional__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3611:1: ( rule__Optional__Group_3_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3612:2: rule__Optional__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_3_2__1__Impl_in_rule__Optional__Group_3_2__17212);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3618:1: rule__Optional__Group_3_2__1__Impl : ( ( rule__Optional__ConstrainsAssignment_3_2_1 ) ) ;
    public final void rule__Optional__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3622:1: ( ( ( rule__Optional__ConstrainsAssignment_3_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3623:1: ( ( rule__Optional__ConstrainsAssignment_3_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3623:1: ( ( rule__Optional__ConstrainsAssignment_3_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3624:1: ( rule__Optional__ConstrainsAssignment_3_2_1 )
            {
             before(grammarAccess.getOptionalAccess().getConstrainsAssignment_3_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3625:1: ( rule__Optional__ConstrainsAssignment_3_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3625:2: rule__Optional__ConstrainsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Optional__ConstrainsAssignment_3_2_1_in_rule__Optional__Group_3_2__1__Impl7239);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3639:1: rule__Optional__Group_4__0 : rule__Optional__Group_4__0__Impl rule__Optional__Group_4__1 ;
    public final void rule__Optional__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3643:1: ( rule__Optional__Group_4__0__Impl rule__Optional__Group_4__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3644:2: rule__Optional__Group_4__0__Impl rule__Optional__Group_4__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_4__0__Impl_in_rule__Optional__Group_4__07273);
            rule__Optional__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_4__1_in_rule__Optional__Group_4__07276);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3651:1: rule__Optional__Group_4__0__Impl : ( ( rule__Optional__GroupsAssignment_4_0 ) ) ;
    public final void rule__Optional__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3655:1: ( ( ( rule__Optional__GroupsAssignment_4_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3656:1: ( ( rule__Optional__GroupsAssignment_4_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3656:1: ( ( rule__Optional__GroupsAssignment_4_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3657:1: ( rule__Optional__GroupsAssignment_4_0 )
            {
             before(grammarAccess.getOptionalAccess().getGroupsAssignment_4_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3658:1: ( rule__Optional__GroupsAssignment_4_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3658:2: rule__Optional__GroupsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Optional__GroupsAssignment_4_0_in_rule__Optional__Group_4__0__Impl7303);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3668:1: rule__Optional__Group_4__1 : rule__Optional__Group_4__1__Impl ;
    public final void rule__Optional__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3672:1: ( rule__Optional__Group_4__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3673:2: rule__Optional__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_4__1__Impl_in_rule__Optional__Group_4__17333);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3679:1: rule__Optional__Group_4__1__Impl : ( ( rule__Optional__GroupsAssignment_4_1 )* ) ;
    public final void rule__Optional__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3683:1: ( ( ( rule__Optional__GroupsAssignment_4_1 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3684:1: ( ( rule__Optional__GroupsAssignment_4_1 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3684:1: ( ( rule__Optional__GroupsAssignment_4_1 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3685:1: ( rule__Optional__GroupsAssignment_4_1 )*
            {
             before(grammarAccess.getOptionalAccess().getGroupsAssignment_4_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3686:1: ( rule__Optional__GroupsAssignment_4_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Xor||LA29_0==Or) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3686:2: rule__Optional__GroupsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Optional__GroupsAssignment_4_1_in_rule__Optional__Group_4__1__Impl7360);
            	    rule__Optional__GroupsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3700:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3704:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3705:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07395);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07398);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3712:1: rule__Or__Group__0__Impl : ( Or ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3716:1: ( ( Or ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3717:1: ( Or )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3717:1: ( Or )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3718:1: Or
            {
             before(grammarAccess.getOrAccess().getOrKeyword_0()); 
            match(input,Or,FOLLOW_Or_in_rule__Or__Group__0__Impl7426); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3731:1: rule__Or__Group__1 : rule__Or__Group__1__Impl rule__Or__Group__2 ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3735:1: ( rule__Or__Group__1__Impl rule__Or__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3736:2: rule__Or__Group__1__Impl rule__Or__Group__2
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17457);
            rule__Or__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__2_in_rule__Or__Group__17460);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3743:1: rule__Or__Group__1__Impl : ( ( rule__Or__NameAssignment_1 ) ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3747:1: ( ( ( rule__Or__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3748:1: ( ( rule__Or__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3748:1: ( ( rule__Or__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3749:1: ( rule__Or__NameAssignment_1 )
            {
             before(grammarAccess.getOrAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3750:1: ( rule__Or__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3750:2: rule__Or__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Or__NameAssignment_1_in_rule__Or__Group__1__Impl7487);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3760:1: rule__Or__Group__2 : rule__Or__Group__2__Impl ;
    public final void rule__Or__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3764:1: ( rule__Or__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3765:2: rule__Or__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__27517);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3771:1: rule__Or__Group__2__Impl : ( ( rule__Or__Group_2__0 )? ) ;
    public final void rule__Or__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3775:1: ( ( ( rule__Or__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3776:1: ( ( rule__Or__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3776:1: ( ( rule__Or__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3777:1: ( rule__Or__Group_2__0 )?
            {
             before(grammarAccess.getOrAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3778:1: ( rule__Or__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_BEGIN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3778:2: rule__Or__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Or__Group_2__0_in_rule__Or__Group__2__Impl7544);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3794:1: rule__Or__Group_2__0 : rule__Or__Group_2__0__Impl rule__Or__Group_2__1 ;
    public final void rule__Or__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3798:1: ( rule__Or__Group_2__0__Impl rule__Or__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3799:2: rule__Or__Group_2__0__Impl rule__Or__Group_2__1
            {
            pushFollow(FOLLOW_rule__Or__Group_2__0__Impl_in_rule__Or__Group_2__07581);
            rule__Or__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2__1_in_rule__Or__Group_2__07584);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3806:1: rule__Or__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Or__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3810:1: ( ( RULE_BEGIN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3811:1: ( RULE_BEGIN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3811:1: ( RULE_BEGIN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3812:1: RULE_BEGIN
            {
             before(grammarAccess.getOrAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Or__Group_2__0__Impl7611); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3823:1: rule__Or__Group_2__1 : rule__Or__Group_2__1__Impl rule__Or__Group_2__2 ;
    public final void rule__Or__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3827:1: ( rule__Or__Group_2__1__Impl rule__Or__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3828:2: rule__Or__Group_2__1__Impl rule__Or__Group_2__2
            {
            pushFollow(FOLLOW_rule__Or__Group_2__1__Impl_in_rule__Or__Group_2__17640);
            rule__Or__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2__2_in_rule__Or__Group_2__17643);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3835:1: rule__Or__Group_2__1__Impl : ( ( rule__Or__GroupedAssignment_2_1 ) ) ;
    public final void rule__Or__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3839:1: ( ( ( rule__Or__GroupedAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3840:1: ( ( rule__Or__GroupedAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3840:1: ( ( rule__Or__GroupedAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3841:1: ( rule__Or__GroupedAssignment_2_1 )
            {
             before(grammarAccess.getOrAccess().getGroupedAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3842:1: ( rule__Or__GroupedAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3842:2: rule__Or__GroupedAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Or__GroupedAssignment_2_1_in_rule__Or__Group_2__1__Impl7670);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3852:1: rule__Or__Group_2__2 : rule__Or__Group_2__2__Impl rule__Or__Group_2__3 ;
    public final void rule__Or__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3856:1: ( rule__Or__Group_2__2__Impl rule__Or__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3857:2: rule__Or__Group_2__2__Impl rule__Or__Group_2__3
            {
            pushFollow(FOLLOW_rule__Or__Group_2__2__Impl_in_rule__Or__Group_2__27700);
            rule__Or__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2__3_in_rule__Or__Group_2__27703);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3864:1: rule__Or__Group_2__2__Impl : ( ( rule__Or__Group_2_2__0 )* ) ;
    public final void rule__Or__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3868:1: ( ( ( rule__Or__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3869:1: ( ( rule__Or__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3869:1: ( ( rule__Or__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3870:1: ( rule__Or__Group_2_2__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3871:1: ( rule__Or__Group_2_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Comma||LA31_0==RULE_NULL||(LA31_0>=RULE_ID && LA31_0<=RULE_STRING)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3871:2: rule__Or__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_2_2__0_in_rule__Or__Group_2__2__Impl7730);
            	    rule__Or__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3881:1: rule__Or__Group_2__3 : rule__Or__Group_2__3__Impl ;
    public final void rule__Or__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3885:1: ( rule__Or__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3886:2: rule__Or__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_2__3__Impl_in_rule__Or__Group_2__37761);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3892:1: rule__Or__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Or__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3896:1: ( ( RULE_END ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3897:1: ( RULE_END )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3897:1: ( RULE_END )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3898:1: RULE_END
            {
             before(grammarAccess.getOrAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Or__Group_2__3__Impl7788); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3917:1: rule__Or__Group_2_2__0 : rule__Or__Group_2_2__0__Impl rule__Or__Group_2_2__1 ;
    public final void rule__Or__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3921:1: ( rule__Or__Group_2_2__0__Impl rule__Or__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3922:2: rule__Or__Group_2_2__0__Impl rule__Or__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Or__Group_2_2__0__Impl_in_rule__Or__Group_2_2__07825);
            rule__Or__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2_2__1_in_rule__Or__Group_2_2__07828);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3929:1: rule__Or__Group_2_2__0__Impl : ( ( Comma )* ) ;
    public final void rule__Or__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3933:1: ( ( ( Comma )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3934:1: ( ( Comma )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3934:1: ( ( Comma )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3935:1: ( Comma )*
            {
             before(grammarAccess.getOrAccess().getCommaKeyword_2_2_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3936:1: ( Comma )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3937:2: Comma
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_rule__Or__Group_2_2__0__Impl7857); 

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3948:1: rule__Or__Group_2_2__1 : rule__Or__Group_2_2__1__Impl ;
    public final void rule__Or__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3952:1: ( rule__Or__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3953:2: rule__Or__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_2_2__1__Impl_in_rule__Or__Group_2_2__17890);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3959:1: rule__Or__Group_2_2__1__Impl : ( ( rule__Or__GroupedAssignment_2_2_1 ) ) ;
    public final void rule__Or__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3963:1: ( ( ( rule__Or__GroupedAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3964:1: ( ( rule__Or__GroupedAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3964:1: ( ( rule__Or__GroupedAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3965:1: ( rule__Or__GroupedAssignment_2_2_1 )
            {
             before(grammarAccess.getOrAccess().getGroupedAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3966:1: ( rule__Or__GroupedAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3966:2: rule__Or__GroupedAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Or__GroupedAssignment_2_2_1_in_rule__Or__Group_2_2__1__Impl7917);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3980:1: rule__Xor__Group__0 : rule__Xor__Group__0__Impl rule__Xor__Group__1 ;
    public final void rule__Xor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3984:1: ( rule__Xor__Group__0__Impl rule__Xor__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3985:2: rule__Xor__Group__0__Impl rule__Xor__Group__1
            {
            pushFollow(FOLLOW_rule__Xor__Group__0__Impl_in_rule__Xor__Group__07951);
            rule__Xor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group__1_in_rule__Xor__Group__07954);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3992:1: rule__Xor__Group__0__Impl : ( Xor ) ;
    public final void rule__Xor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3996:1: ( ( Xor ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3997:1: ( Xor )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3997:1: ( Xor )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3998:1: Xor
            {
             before(grammarAccess.getXorAccess().getXorKeyword_0()); 
            match(input,Xor,FOLLOW_Xor_in_rule__Xor__Group__0__Impl7982); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4011:1: rule__Xor__Group__1 : rule__Xor__Group__1__Impl rule__Xor__Group__2 ;
    public final void rule__Xor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4015:1: ( rule__Xor__Group__1__Impl rule__Xor__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4016:2: rule__Xor__Group__1__Impl rule__Xor__Group__2
            {
            pushFollow(FOLLOW_rule__Xor__Group__1__Impl_in_rule__Xor__Group__18013);
            rule__Xor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group__2_in_rule__Xor__Group__18016);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4023:1: rule__Xor__Group__1__Impl : ( ( rule__Xor__NameAssignment_1 ) ) ;
    public final void rule__Xor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4027:1: ( ( ( rule__Xor__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4028:1: ( ( rule__Xor__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4028:1: ( ( rule__Xor__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4029:1: ( rule__Xor__NameAssignment_1 )
            {
             before(grammarAccess.getXorAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4030:1: ( rule__Xor__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4030:2: rule__Xor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Xor__NameAssignment_1_in_rule__Xor__Group__1__Impl8043);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4040:1: rule__Xor__Group__2 : rule__Xor__Group__2__Impl ;
    public final void rule__Xor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4044:1: ( rule__Xor__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4045:2: rule__Xor__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Xor__Group__2__Impl_in_rule__Xor__Group__28073);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4051:1: rule__Xor__Group__2__Impl : ( ( rule__Xor__Group_2__0 )? ) ;
    public final void rule__Xor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4055:1: ( ( ( rule__Xor__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4056:1: ( ( rule__Xor__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4056:1: ( ( rule__Xor__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4057:1: ( rule__Xor__Group_2__0 )?
            {
             before(grammarAccess.getXorAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4058:1: ( rule__Xor__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_BEGIN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4058:2: rule__Xor__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Xor__Group_2__0_in_rule__Xor__Group__2__Impl8100);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4074:1: rule__Xor__Group_2__0 : rule__Xor__Group_2__0__Impl rule__Xor__Group_2__1 ;
    public final void rule__Xor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4078:1: ( rule__Xor__Group_2__0__Impl rule__Xor__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4079:2: rule__Xor__Group_2__0__Impl rule__Xor__Group_2__1
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__0__Impl_in_rule__Xor__Group_2__08137);
            rule__Xor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2__1_in_rule__Xor__Group_2__08140);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4086:1: rule__Xor__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Xor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4090:1: ( ( RULE_BEGIN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4091:1: ( RULE_BEGIN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4091:1: ( RULE_BEGIN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4092:1: RULE_BEGIN
            {
             before(grammarAccess.getXorAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Xor__Group_2__0__Impl8167); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4103:1: rule__Xor__Group_2__1 : rule__Xor__Group_2__1__Impl rule__Xor__Group_2__2 ;
    public final void rule__Xor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4107:1: ( rule__Xor__Group_2__1__Impl rule__Xor__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4108:2: rule__Xor__Group_2__1__Impl rule__Xor__Group_2__2
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__1__Impl_in_rule__Xor__Group_2__18196);
            rule__Xor__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2__2_in_rule__Xor__Group_2__18199);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4115:1: rule__Xor__Group_2__1__Impl : ( ( rule__Xor__GroupedAssignment_2_1 ) ) ;
    public final void rule__Xor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4119:1: ( ( ( rule__Xor__GroupedAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4120:1: ( ( rule__Xor__GroupedAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4120:1: ( ( rule__Xor__GroupedAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4121:1: ( rule__Xor__GroupedAssignment_2_1 )
            {
             before(grammarAccess.getXorAccess().getGroupedAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4122:1: ( rule__Xor__GroupedAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4122:2: rule__Xor__GroupedAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Xor__GroupedAssignment_2_1_in_rule__Xor__Group_2__1__Impl8226);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4132:1: rule__Xor__Group_2__2 : rule__Xor__Group_2__2__Impl rule__Xor__Group_2__3 ;
    public final void rule__Xor__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4136:1: ( rule__Xor__Group_2__2__Impl rule__Xor__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4137:2: rule__Xor__Group_2__2__Impl rule__Xor__Group_2__3
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__2__Impl_in_rule__Xor__Group_2__28256);
            rule__Xor__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2__3_in_rule__Xor__Group_2__28259);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4144:1: rule__Xor__Group_2__2__Impl : ( ( rule__Xor__Group_2_2__0 )* ) ;
    public final void rule__Xor__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4148:1: ( ( ( rule__Xor__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4149:1: ( ( rule__Xor__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4149:1: ( ( rule__Xor__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4150:1: ( rule__Xor__Group_2_2__0 )*
            {
             before(grammarAccess.getXorAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4151:1: ( rule__Xor__Group_2_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma||LA34_0==RULE_NULL||(LA34_0>=RULE_ID && LA34_0<=RULE_STRING)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4151:2: rule__Xor__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Xor__Group_2_2__0_in_rule__Xor__Group_2__2__Impl8286);
            	    rule__Xor__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4161:1: rule__Xor__Group_2__3 : rule__Xor__Group_2__3__Impl ;
    public final void rule__Xor__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4165:1: ( rule__Xor__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4166:2: rule__Xor__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__3__Impl_in_rule__Xor__Group_2__38317);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4172:1: rule__Xor__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Xor__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4176:1: ( ( RULE_END ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4177:1: ( RULE_END )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4177:1: ( RULE_END )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4178:1: RULE_END
            {
             before(grammarAccess.getXorAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Xor__Group_2__3__Impl8344); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4197:1: rule__Xor__Group_2_2__0 : rule__Xor__Group_2_2__0__Impl rule__Xor__Group_2_2__1 ;
    public final void rule__Xor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4201:1: ( rule__Xor__Group_2_2__0__Impl rule__Xor__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4202:2: rule__Xor__Group_2_2__0__Impl rule__Xor__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Xor__Group_2_2__0__Impl_in_rule__Xor__Group_2_2__08381);
            rule__Xor__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2_2__1_in_rule__Xor__Group_2_2__08384);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4209:1: rule__Xor__Group_2_2__0__Impl : ( ( Comma )* ) ;
    public final void rule__Xor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4213:1: ( ( ( Comma )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4214:1: ( ( Comma )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4214:1: ( ( Comma )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4215:1: ( Comma )*
            {
             before(grammarAccess.getXorAccess().getCommaKeyword_2_2_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4216:1: ( Comma )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Comma) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4217:2: Comma
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_rule__Xor__Group_2_2__0__Impl8413); 

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4228:1: rule__Xor__Group_2_2__1 : rule__Xor__Group_2_2__1__Impl ;
    public final void rule__Xor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4232:1: ( rule__Xor__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4233:2: rule__Xor__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Xor__Group_2_2__1__Impl_in_rule__Xor__Group_2_2__18446);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4239:1: rule__Xor__Group_2_2__1__Impl : ( ( rule__Xor__GroupedAssignment_2_2_1 ) ) ;
    public final void rule__Xor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4243:1: ( ( ( rule__Xor__GroupedAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4244:1: ( ( rule__Xor__GroupedAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4244:1: ( ( rule__Xor__GroupedAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4245:1: ( rule__Xor__GroupedAssignment_2_2_1 )
            {
             before(grammarAccess.getXorAccess().getGroupedAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4246:1: ( rule__Xor__GroupedAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4246:2: rule__Xor__GroupedAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Xor__GroupedAssignment_2_2_1_in_rule__Xor__Group_2_2__1__Impl8473);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4261:1: rule__Model__RootAssignment : ( ruleFeature_Impl ) ;
    public final void rule__Model__RootAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4265:1: ( ( ruleFeature_Impl ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4266:1: ( ruleFeature_Impl )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4266:1: ( ruleFeature_Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4267:1: ruleFeature_Impl
            {
             before(grammarAccess.getModelAccess().getRootFeature_ImplParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFeature_Impl_in_rule__Model__RootAssignment8512);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4276:1: rule__Constrain__OperatorAssignment_1_1 : ( ( VerticalLineVerticalLine ) ) ;
    public final void rule__Constrain__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4280:1: ( ( ( VerticalLineVerticalLine ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4281:1: ( ( VerticalLineVerticalLine ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4281:1: ( ( VerticalLineVerticalLine ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4282:1: ( VerticalLineVerticalLine )
            {
             before(grammarAccess.getConstrainAccess().getOperatorVerticalLineVerticalLineKeyword_1_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4283:1: ( VerticalLineVerticalLine )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4284:1: VerticalLineVerticalLine
            {
             before(grammarAccess.getConstrainAccess().getOperatorVerticalLineVerticalLineKeyword_1_1_0()); 
            match(input,VerticalLineVerticalLine,FOLLOW_VerticalLineVerticalLine_in_rule__Constrain__OperatorAssignment_1_18548); 
             after(grammarAccess.getConstrainAccess().getOperatorVerticalLineVerticalLineKeyword_1_1_0()); 

            }

             after(grammarAccess.getConstrainAccess().getOperatorVerticalLineVerticalLineKeyword_1_1_0()); 

            }


            }

        }
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4299:1: rule__Constrain__RightExpAssignment_1_2 : ( ruleConjunction ) ;
    public final void rule__Constrain__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4303:1: ( ( ruleConjunction ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4304:1: ( ruleConjunction )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4304:1: ( ruleConjunction )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4305:1: ruleConjunction
            {
             before(grammarAccess.getConstrainAccess().getRightExpConjunctionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Constrain__RightExpAssignment_1_28587);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4314:1: rule__Conjunction__OperatorAssignment_1_1 : ( ( AmpersandAmpersand ) ) ;
    public final void rule__Conjunction__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4318:1: ( ( ( AmpersandAmpersand ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4319:1: ( ( AmpersandAmpersand ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4319:1: ( ( AmpersandAmpersand ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4320:1: ( AmpersandAmpersand )
            {
             before(grammarAccess.getConjunctionAccess().getOperatorAmpersandAmpersandKeyword_1_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4321:1: ( AmpersandAmpersand )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4322:1: AmpersandAmpersand
            {
             before(grammarAccess.getConjunctionAccess().getOperatorAmpersandAmpersandKeyword_1_1_0()); 
            match(input,AmpersandAmpersand,FOLLOW_AmpersandAmpersand_in_rule__Conjunction__OperatorAssignment_1_18623); 
             after(grammarAccess.getConjunctionAccess().getOperatorAmpersandAmpersandKeyword_1_1_0()); 

            }

             after(grammarAccess.getConjunctionAccess().getOperatorAmpersandAmpersandKeyword_1_1_0()); 

            }


            }

        }
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4337:1: rule__Conjunction__RightExpAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Conjunction__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4341:1: ( ( ruleComparison ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4342:1: ( ruleComparison )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4342:1: ( ruleComparison )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4343:1: ruleComparison
            {
             before(grammarAccess.getConjunctionAccess().getRightExpComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Conjunction__RightExpAssignment_1_28662);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getRightExpComparisonParserRuleCall_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Comparison__OperatorAssignment_1_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4352:1: rule__Comparison__OperatorAssignment_1_1 : ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4356:1: ( ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4357:1: ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4357:1: ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4358:1: ( rule__Comparison__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAlternatives_1_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4359:1: ( rule__Comparison__OperatorAlternatives_1_1_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4359:2: rule__Comparison__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__OperatorAlternatives_1_1_0_in_rule__Comparison__OperatorAssignment_1_18693);
            rule__Comparison__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4368:1: rule__Comparison__RightExpAssignment_1_2 : ( ruleBinary ) ;
    public final void rule__Comparison__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4372:1: ( ( ruleBinary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4373:1: ( ruleBinary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4373:1: ( ruleBinary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4374:1: ruleBinary
            {
             before(grammarAccess.getComparisonAccess().getRightExpBinaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBinary_in_rule__Comparison__RightExpAssignment_1_28726);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4383:1: rule__Binary__RightExpAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Binary__RightExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4387:1: ( ( rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4388:1: ( rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4388:1: ( rulePrimary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4389:1: rulePrimary
            {
             before(grammarAccess.getBinaryAccess().getRightExpPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Binary__RightExpAssignment_1_18757);
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


    // $ANTLR start "rule__Primary__ConstrainFeaturesAssignment_0_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4398:1: rule__Primary__ConstrainFeaturesAssignment_0_0 : ( ( ruleEString ) ) ;
    public final void rule__Primary__ConstrainFeaturesAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4402:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4403:1: ( ( ruleEString ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4403:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4404:1: ( ruleEString )
            {
             before(grammarAccess.getPrimaryAccess().getConstrainFeaturesSolitaryCrossReference_0_0_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4405:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4406:1: ruleEString
            {
             before(grammarAccess.getPrimaryAccess().getConstrainFeaturesSolitaryEStringParserRuleCall_0_0_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Primary__ConstrainFeaturesAssignment_0_08792);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getConstrainFeaturesSolitaryEStringParserRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getConstrainFeaturesSolitaryCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ConstrainFeaturesAssignment_0_0"


    // $ANTLR start "rule__Primary__GroupsAssignment_0_2"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4417:1: rule__Primary__GroupsAssignment_0_2 : ( ( ruleEString ) ) ;
    public final void rule__Primary__GroupsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4421:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4422:1: ( ( ruleEString ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4422:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4423:1: ( ruleEString )
            {
             before(grammarAccess.getPrimaryAccess().getGroupsGroupCrossReference_0_2_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4424:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4425:1: ruleEString
            {
             before(grammarAccess.getPrimaryAccess().getGroupsGroupEStringParserRuleCall_0_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Primary__GroupsAssignment_0_28831);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getGroupsGroupEStringParserRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getGroupsGroupCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__GroupsAssignment_0_2"


    // $ANTLR start "rule__Primary__ConstrainFeaturesAssignment_0_4"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4436:1: rule__Primary__ConstrainFeaturesAssignment_0_4 : ( ( ruleEString ) ) ;
    public final void rule__Primary__ConstrainFeaturesAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4440:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4441:1: ( ( ruleEString ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4441:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4442:1: ( ruleEString )
            {
             before(grammarAccess.getPrimaryAccess().getConstrainFeaturesFeatureCrossReference_0_4_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4443:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4444:1: ruleEString
            {
             before(grammarAccess.getPrimaryAccess().getConstrainFeaturesFeatureEStringParserRuleCall_0_4_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Primary__ConstrainFeaturesAssignment_0_48870);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getConstrainFeaturesFeatureEStringParserRuleCall_0_4_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getConstrainFeaturesFeatureCrossReference_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ConstrainFeaturesAssignment_0_4"


    // $ANTLR start "rule__Unary__OperatorAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4455:1: rule__Unary__OperatorAssignment_1 : ( ( rule__Unary__OperatorAlternatives_1_0 ) ) ;
    public final void rule__Unary__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4459:1: ( ( ( rule__Unary__OperatorAlternatives_1_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4460:1: ( ( rule__Unary__OperatorAlternatives_1_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4460:1: ( ( rule__Unary__OperatorAlternatives_1_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4461:1: ( rule__Unary__OperatorAlternatives_1_0 )
            {
             before(grammarAccess.getUnaryAccess().getOperatorAlternatives_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4462:1: ( rule__Unary__OperatorAlternatives_1_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4462:2: rule__Unary__OperatorAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Unary__OperatorAlternatives_1_0_in_rule__Unary__OperatorAssignment_18905);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4471:1: rule__Unary__ExpAssignment_2 : ( rulePrimary ) ;
    public final void rule__Unary__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4475:1: ( ( rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4476:1: ( rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4476:1: ( rulePrimary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4477:1: rulePrimary
            {
             before(grammarAccess.getUnaryAccess().getExpPrimaryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Unary__ExpAssignment_28938);
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


    // $ANTLR start "rule__Range__NameAssignment_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4486:1: rule__Range__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Range__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4490:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4491:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4491:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4492:1: ruleEString
            {
             before(grammarAccess.getRangeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Range__NameAssignment_08969);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__NameAssignment_0"


    // $ANTLR start "rule__Feature_Impl__NameAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4501:1: rule__Feature_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Feature_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4505:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4506:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4506:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4507:1: ruleEString
            {
             before(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Feature_Impl__NameAssignment_19000);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4516:1: rule__Feature_Impl__SubfeatureAssignment_2_1 : ( ruleSolitary ) ;
    public final void rule__Feature_Impl__SubfeatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4520:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4521:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4521:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4522:1: ruleSolitary
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_19031);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4531:1: rule__Feature_Impl__SubfeatureAssignment_2_2 : ( ruleSolitary ) ;
    public final void rule__Feature_Impl__SubfeatureAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4535:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4536:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4536:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4537:1: ruleSolitary
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_29062);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4546:1: rule__Feature_Impl__ConstrainsAssignment_3_1 : ( ruleConstrain ) ;
    public final void rule__Feature_Impl__ConstrainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4550:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4551:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4551:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4552:1: ruleConstrain
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_19093);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4561:1: rule__Feature_Impl__ConstrainsAssignment_3_2_1 : ( ruleConstrain ) ;
    public final void rule__Feature_Impl__ConstrainsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4565:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4566:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4566:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4567:1: ruleConstrain
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_2_19124);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4576:1: rule__Grouped__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Grouped__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4580:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4581:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4581:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4582:1: ruleEString
            {
             before(grammarAccess.getGroupedAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Grouped__NameAssignment_09155);
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


    // $ANTLR start "rule__Grouped__RangeAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4591:1: rule__Grouped__RangeAssignment_1 : ( ruleRange ) ;
    public final void rule__Grouped__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4595:1: ( ( ruleRange ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4596:1: ( ruleRange )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4596:1: ( ruleRange )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4597:1: ruleRange
            {
             before(grammarAccess.getGroupedAccess().getRangeRangeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRange_in_rule__Grouped__RangeAssignment_19186);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getGroupedAccess().getRangeRangeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__RangeAssignment_1"


    // $ANTLR start "rule__Grouped__ConstrainsAssignment_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4606:1: rule__Grouped__ConstrainsAssignment_2_1 : ( ruleConstrain ) ;
    public final void rule__Grouped__ConstrainsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4610:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4611:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4611:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4612:1: ruleConstrain
            {
             before(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_2_19217);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4621:1: rule__Grouped__ConstrainsAssignment_2_2_1 : ( ruleConstrain ) ;
    public final void rule__Grouped__ConstrainsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4625:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4626:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4626:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4627:1: ruleConstrain
            {
             before(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_2_2_19248);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4636:1: rule__Mandatory__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Mandatory__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4640:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4641:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4641:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4642:1: ruleEString
            {
             before(grammarAccess.getMandatoryAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Mandatory__NameAssignment_09279);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4651:1: rule__Mandatory__SubfeatureAssignment_1_1 : ( ruleSolitary ) ;
    public final void rule__Mandatory__SubfeatureAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4655:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4656:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4656:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4657:1: ruleSolitary
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_19310);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4666:1: rule__Mandatory__SubfeatureAssignment_1_2_1 : ( ruleSolitary ) ;
    public final void rule__Mandatory__SubfeatureAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4670:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4671:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4671:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4672:1: ruleSolitary
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_2_19341);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4681:1: rule__Mandatory__ConstrainsAssignment_2_1 : ( ruleConstrain ) ;
    public final void rule__Mandatory__ConstrainsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4685:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4686:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4686:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4687:1: ruleConstrain
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_2_19372);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4696:1: rule__Mandatory__ConstrainsAssignment_2_2_1 : ( ruleConstrain ) ;
    public final void rule__Mandatory__ConstrainsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4700:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4701:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4701:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4702:1: ruleConstrain
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_2_2_19403);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4711:1: rule__Mandatory__GroupsAssignment_3_0 : ( ruleGroup ) ;
    public final void rule__Mandatory__GroupsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4715:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4716:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4716:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4717:1: ruleGroup
            {
             before(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_3_09434);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4726:1: rule__Mandatory__GroupsAssignment_3_1 : ( ruleGroup ) ;
    public final void rule__Mandatory__GroupsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4730:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4731:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4731:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4732:1: ruleGroup
            {
             before(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_3_19465);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4741:1: rule__Optional__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Optional__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4745:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4746:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4746:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4747:1: ruleEString
            {
             before(grammarAccess.getOptionalAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Optional__NameAssignment_19496);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4756:1: rule__Optional__SubfeatureAssignment_2_1 : ( ruleSolitary ) ;
    public final void rule__Optional__SubfeatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4760:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4761:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4761:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4762:1: ruleSolitary
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_19527);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4771:1: rule__Optional__SubfeatureAssignment_2_2_1 : ( ruleSolitary ) ;
    public final void rule__Optional__SubfeatureAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4775:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4776:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4776:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4777:1: ruleSolitary
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_2_19558);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4786:1: rule__Optional__ConstrainsAssignment_3_1 : ( ruleConstrain ) ;
    public final void rule__Optional__ConstrainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4790:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4791:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4791:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4792:1: ruleConstrain
            {
             before(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_3_19589);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4801:1: rule__Optional__ConstrainsAssignment_3_2_1 : ( ruleConstrain ) ;
    public final void rule__Optional__ConstrainsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4805:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4806:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4806:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4807:1: ruleConstrain
            {
             before(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_3_2_19620);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4816:1: rule__Optional__GroupsAssignment_4_0 : ( ruleGroup ) ;
    public final void rule__Optional__GroupsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4820:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4821:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4821:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4822:1: ruleGroup
            {
             before(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_4_09651);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4831:1: rule__Optional__GroupsAssignment_4_1 : ( ruleGroup ) ;
    public final void rule__Optional__GroupsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4835:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4836:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4836:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4837:1: ruleGroup
            {
             before(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_4_19682);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4846:1: rule__Or__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Or__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4850:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4851:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4851:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4852:1: ruleEString
            {
             before(grammarAccess.getOrAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Or__NameAssignment_19713);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4861:1: rule__Or__GroupedAssignment_2_1 : ( ruleGrouped ) ;
    public final void rule__Or__GroupedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4865:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4866:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4866:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4867:1: ruleGrouped
            {
             before(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_19744);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4876:1: rule__Or__GroupedAssignment_2_2_1 : ( ruleGrouped ) ;
    public final void rule__Or__GroupedAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4880:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4881:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4881:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4882:1: ruleGrouped
            {
             before(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_2_19775);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4891:1: rule__Xor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Xor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4895:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4896:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4896:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4897:1: ruleEString
            {
             before(grammarAccess.getXorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Xor__NameAssignment_19806);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4906:1: rule__Xor__GroupedAssignment_2_1 : ( ruleGrouped ) ;
    public final void rule__Xor__GroupedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4910:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4911:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4911:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4912:1: ruleGrouped
            {
             before(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_19837);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4921:1: rule__Xor__GroupedAssignment_2_2_1 : ( ruleGrouped ) ;
    public final void rule__Xor__GroupedAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4925:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4926:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4926:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4927:1: ruleGrouped
            {
             before(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_2_19868);
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
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_entryRuleBinary376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinary383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group__0_in_ruleBinary413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__0_in_ruleUnary541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Alternatives_in_ruleGroup605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0_in_ruleRange669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature_Impl767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__0_in_ruleFeature_Impl797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_entryRuleGrouped824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouped831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__0_in_ruleGrouped861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0_in_ruleOptional989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_entryRuleXor1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXor1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__0_in_ruleXor1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__Solitary__Alternatives1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__Solitary__Alternatives1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSignEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMarkEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSignEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSign_in_rule__Comparison__OperatorAlternatives_1_1_01264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSignEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSign_in_rule__Comparison__OperatorAlternatives_1_1_01304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_rule__Primary__Alternatives1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__0_in_rule__Primary__Alternatives1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMark_in_rule__Unary__OperatorAlternatives_1_01407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HyphenMinus_in_rule__Unary__OperatorAlternatives_1_01427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__Group__Alternatives1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_rule__Group__Alternatives1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EString__Alternatives1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__EString__Alternatives1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group__0__Impl_in_rule__Constrain__Group__01591 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Constrain__Group__1_in_rule__Constrain__Group__01594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Constrain__Group__0__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group__1__Impl_in_rule__Constrain__Group__11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__0_in_rule__Constrain__Group__1__Impl1677 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__0__Impl_in_rule__Constrain__Group_1__01712 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__1_in_rule__Constrain__Group_1__01715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__1__Impl_in_rule__Constrain__Group_1__11773 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__2_in_rule__Constrain__Group_1__11776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__OperatorAssignment_1_1_in_rule__Constrain__Group_1__1__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__2__Impl_in_rule__Constrain__Group_1__21833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__RightExpAssignment_1_2_in_rule__Constrain__Group_1__2__Impl1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__01896 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__01899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Conjunction__Group__0__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__11955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl1982 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__02017 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__02020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__12078 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__12081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__OperatorAssignment_1_1_in_rule__Conjunction__Group_1__1__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__22138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RightExpAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__02201 = new BitSet(new long[]{0x0000000000300E40L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__02204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_rule__Comparison__Group__0__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__12260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl2287 = new BitSet(new long[]{0x0000000000300E42L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__02322 = new BitSet(new long[]{0x0000000000300E40L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__02325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__12383 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__12386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OperatorAssignment_1_1_in_rule__Comparison__Group_1__1__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__22443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightExpAssignment_1_2_in_rule__Comparison__Group_1__2__Impl2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group__0__Impl_in_rule__Binary__Group__02506 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Binary__Group__1_in_rule__Binary__Group__02509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Binary__Group__0__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group__1__Impl_in_rule__Binary__Group__12565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__0_in_rule__Binary__Group__1__Impl2592 = new BitSet(new long[]{0x00000001C804C002L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__0__Impl_in_rule__Binary__Group_1__02627 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__1_in_rule__Binary__Group_1__02630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__1__Impl_in_rule__Binary__Group_1__12688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__RightExpAssignment_1_1_in_rule__Binary__Group_1__1__Impl2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__02749 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__02752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ConstrainFeaturesAssignment_0_0_in_rule__Primary__Group_0__0__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__12809 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__12812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_rule__Primary__Group_0__1__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__22871 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__3_in_rule__Primary__Group_0__22874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__GroupsAssignment_0_2_in_rule__Primary__Group_0__2__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__3__Impl_in_rule__Primary__Group_0__32931 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__4_in_rule__Primary__Group_0__32934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_rule__Primary__Group_0__3__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__4__Impl_in_rule__Primary__Group_0__42993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ConstrainFeaturesAssignment_0_4_in_rule__Primary__Group_0__4__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__0__Impl_in_rule__Primary__Group_2__03060 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__1_in_rule__Primary__Group_2__03063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rule__Primary__Group_2__0__Impl3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__1__Impl_in_rule__Primary__Group_2__13122 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__2_in_rule__Primary__Group_2__13125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Primary__Group_2__1__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__2__Impl_in_rule__Primary__Group_2__23181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightParenthesis_in_rule__Primary__Group_2__2__Impl3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__03246 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__03249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__13307 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Unary__Group__2_in_rule__Unary__Group__13310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__OperatorAssignment_1_in_rule__Unary__Group__1__Impl3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__2__Impl_in_rule__Unary__Group__23367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__ExpAssignment_2_in_rule__Unary__Group__2__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__03430 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Range__Group__1_in_rule__Range__Group__03433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__NameAssignment_0_in_rule__Range__Group__0__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__13490 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Range__Group__2_in_rule__Range__Group__13493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Range__Group__1__Impl3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__2__Impl_in_rule__Range__Group__23549 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Range__Group__3_in_rule__Range__Group__23552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FullStopFullStop_in_rule__Range__Group__2__Impl3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__3__Impl_in_rule__Range__Group__33611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Range__Group__3__Impl3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__0__Impl_in_rule__Feature_Impl__Group__03675 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__1_in_rule__Feature_Impl__Group__03678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Feature_in_rule__Feature_Impl__Group__0__Impl3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__1__Impl_in_rule__Feature_Impl__Group__13737 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__2_in_rule__Feature_Impl__Group__13740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__NameAssignment_1_in_rule__Feature_Impl__Group__1__Impl3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__2__Impl_in_rule__Feature_Impl__Group__23797 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__3_in_rule__Feature_Impl__Group__23800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__0_in_rule__Feature_Impl__Group__2__Impl3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__3__Impl_in_rule__Feature_Impl__Group__33858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__0_in_rule__Feature_Impl__Group__3__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__0__Impl_in_rule__Feature_Impl__Group_2__03924 = new BitSet(new long[]{0x00000001C8400000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__1_in_rule__Feature_Impl__Group_2__03927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Feature_Impl__Group_2__0__Impl3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__1__Impl_in_rule__Feature_Impl__Group_2__13983 = new BitSet(new long[]{0x00000001E8400000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__2_in_rule__Feature_Impl__Group_2__13986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_1_in_rule__Feature_Impl__Group_2__1__Impl4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__2__Impl_in_rule__Feature_Impl__Group_2__24043 = new BitSet(new long[]{0x00000001E8400000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__3_in_rule__Feature_Impl__Group_2__24046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_2_in_rule__Feature_Impl__Group_2__2__Impl4073 = new BitSet(new long[]{0x00000001C8400002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__3__Impl_in_rule__Feature_Impl__Group_2__34104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Feature_Impl__Group_2__3__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__0__Impl_in_rule__Feature_Impl__Group_3__04168 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__1_in_rule__Feature_Impl__Group_3__04171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Feature_Impl__Group_3__0__Impl4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__1__Impl_in_rule__Feature_Impl__Group_3__14230 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__2_in_rule__Feature_Impl__Group_3__14233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_1_in_rule__Feature_Impl__Group_3__1__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__2__Impl_in_rule__Feature_Impl__Group_3__24290 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__3_in_rule__Feature_Impl__Group_3__24293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__0_in_rule__Feature_Impl__Group_3__2__Impl4320 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__3__Impl_in_rule__Feature_Impl__Group_3__34351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Feature_Impl__Group_3__3__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__0__Impl_in_rule__Feature_Impl__Group_3_2__04418 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__1_in_rule__Feature_Impl__Group_3_2__04421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Feature_Impl__Group_3_2__0__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__1__Impl_in_rule__Feature_Impl__Group_3_2__14480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_2_1_in_rule__Feature_Impl__Group_3_2__1__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__0__Impl_in_rule__Grouped__Group__04541 = new BitSet(new long[]{0x00000001C8800000L});
    public static final BitSet FOLLOW_rule__Grouped__Group__1_in_rule__Grouped__Group__04544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__NameAssignment_0_in_rule__Grouped__Group__0__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__1__Impl_in_rule__Grouped__Group__14601 = new BitSet(new long[]{0x00000001C8800000L});
    public static final BitSet FOLLOW_rule__Grouped__Group__2_in_rule__Grouped__Group__14604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__RangeAssignment_1_in_rule__Grouped__Group__1__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__2__Impl_in_rule__Grouped__Group__24662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__0_in_rule__Grouped__Group__2__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__0__Impl_in_rule__Grouped__Group_2__04726 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__1_in_rule__Grouped__Group_2__04729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Grouped__Group_2__0__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__1__Impl_in_rule__Grouped__Group_2__14788 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__2_in_rule__Grouped__Group_2__14791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__ConstrainsAssignment_2_1_in_rule__Grouped__Group_2__1__Impl4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__2__Impl_in_rule__Grouped__Group_2__24848 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__3_in_rule__Grouped__Group_2__24851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2_2__0_in_rule__Grouped__Group_2__2__Impl4878 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2__3__Impl_in_rule__Grouped__Group_2__34909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Grouped__Group_2__3__Impl4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2_2__0__Impl_in_rule__Grouped__Group_2_2__04976 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2_2__1_in_rule__Grouped__Group_2_2__04979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Grouped__Group_2_2__0__Impl5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_2_2__1__Impl_in_rule__Grouped__Group_2_2__15038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__ConstrainsAssignment_2_2_1_in_rule__Grouped__Group_2_2__1__Impl5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__05099 = new BitSet(new long[]{0x0000000002801020L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__05102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__NameAssignment_0_in_rule__Mandatory__Group__0__Impl5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__15159 = new BitSet(new long[]{0x0000000002801020L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__2_in_rule__Mandatory__Group__15162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__0_in_rule__Mandatory__Group__1__Impl5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__2__Impl_in_rule__Mandatory__Group__25220 = new BitSet(new long[]{0x0000000002801020L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__3_in_rule__Mandatory__Group__25223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__0_in_rule__Mandatory__Group__2__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__3__Impl_in_rule__Mandatory__Group__35281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__0_in_rule__Mandatory__Group__3__Impl5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__0__Impl_in_rule__Mandatory__Group_1__05347 = new BitSet(new long[]{0x00000001C8400000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__1_in_rule__Mandatory__Group_1__05350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__Mandatory__Group_1__0__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__1__Impl_in_rule__Mandatory__Group_1__15409 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__2_in_rule__Mandatory__Group_1__15412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__SubfeatureAssignment_1_1_in_rule__Mandatory__Group_1__1__Impl5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__2__Impl_in_rule__Mandatory__Group_1__25469 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__3_in_rule__Mandatory__Group_1__25472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__0_in_rule__Mandatory__Group_1__2__Impl5499 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__3__Impl_in_rule__Mandatory__Group_1__35530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__Mandatory__Group_1__3__Impl5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__0__Impl_in_rule__Mandatory__Group_1_2__05597 = new BitSet(new long[]{0x00000001C8400000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__1_in_rule__Mandatory__Group_1_2__05600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Mandatory__Group_1_2__0__Impl5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__1__Impl_in_rule__Mandatory__Group_1_2__15659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__SubfeatureAssignment_1_2_1_in_rule__Mandatory__Group_1_2__1__Impl5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__0__Impl_in_rule__Mandatory__Group_2__05720 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__1_in_rule__Mandatory__Group_2__05723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Mandatory__Group_2__0__Impl5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__1__Impl_in_rule__Mandatory__Group_2__15782 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__2_in_rule__Mandatory__Group_2__15785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__ConstrainsAssignment_2_1_in_rule__Mandatory__Group_2__1__Impl5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__2__Impl_in_rule__Mandatory__Group_2__25842 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__3_in_rule__Mandatory__Group_2__25845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2_2__0_in_rule__Mandatory__Group_2__2__Impl5872 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__3__Impl_in_rule__Mandatory__Group_2__35903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Mandatory__Group_2__3__Impl5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2_2__0__Impl_in_rule__Mandatory__Group_2_2__05970 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2_2__1_in_rule__Mandatory__Group_2_2__05973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Mandatory__Group_2_2__0__Impl6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2_2__1__Impl_in_rule__Mandatory__Group_2_2__16032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__ConstrainsAssignment_2_2_1_in_rule__Mandatory__Group_2_2__1__Impl6059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__0__Impl_in_rule__Mandatory__Group_3__06093 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__1_in_rule__Mandatory__Group_3__06096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__GroupsAssignment_3_0_in_rule__Mandatory__Group_3__0__Impl6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__1__Impl_in_rule__Mandatory__Group_3__16153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__GroupsAssignment_3_1_in_rule__Mandatory__Group_3__1__Impl6180 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__06215 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__06218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuestionMark_in_rule__Optional__Group__0__Impl6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__16277 = new BitSet(new long[]{0x0000000002801020L});
    public static final BitSet FOLLOW_rule__Optional__Group__2_in_rule__Optional__Group__16280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__NameAssignment_1_in_rule__Optional__Group__1__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__2__Impl_in_rule__Optional__Group__26337 = new BitSet(new long[]{0x0000000002801020L});
    public static final BitSet FOLLOW_rule__Optional__Group__3_in_rule__Optional__Group__26340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__0_in_rule__Optional__Group__2__Impl6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__3__Impl_in_rule__Optional__Group__36398 = new BitSet(new long[]{0x0000000002801020L});
    public static final BitSet FOLLOW_rule__Optional__Group__4_in_rule__Optional__Group__36401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__0_in_rule__Optional__Group__3__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__4__Impl_in_rule__Optional__Group__46459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__0_in_rule__Optional__Group__4__Impl6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__0__Impl_in_rule__Optional__Group_2__06527 = new BitSet(new long[]{0x00000001C8400000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__1_in_rule__Optional__Group_2__06530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__Optional__Group_2__0__Impl6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__1__Impl_in_rule__Optional__Group_2__16589 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__2_in_rule__Optional__Group_2__16592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__SubfeatureAssignment_2_1_in_rule__Optional__Group_2__1__Impl6619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__2__Impl_in_rule__Optional__Group_2__26649 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__3_in_rule__Optional__Group_2__26652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__0_in_rule__Optional__Group_2__2__Impl6679 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__3__Impl_in_rule__Optional__Group_2__36710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__Optional__Group_2__3__Impl6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__0__Impl_in_rule__Optional__Group_2_2__06777 = new BitSet(new long[]{0x00000001C8400000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__1_in_rule__Optional__Group_2_2__06780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Optional__Group_2_2__0__Impl6808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__1__Impl_in_rule__Optional__Group_2_2__16839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__SubfeatureAssignment_2_2_1_in_rule__Optional__Group_2_2__1__Impl6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__0__Impl_in_rule__Optional__Group_3__06900 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__1_in_rule__Optional__Group_3__06903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Optional__Group_3__0__Impl6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__1__Impl_in_rule__Optional__Group_3__16962 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__2_in_rule__Optional__Group_3__16965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ConstrainsAssignment_3_1_in_rule__Optional__Group_3__1__Impl6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__2__Impl_in_rule__Optional__Group_3__27022 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__3_in_rule__Optional__Group_3__27025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3_2__0_in_rule__Optional__Group_3__2__Impl7052 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__3__Impl_in_rule__Optional__Group_3__37083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Optional__Group_3__3__Impl7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3_2__0__Impl_in_rule__Optional__Group_3_2__07150 = new BitSet(new long[]{0x00000001C804C000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3_2__1_in_rule__Optional__Group_3_2__07153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Optional__Group_3_2__0__Impl7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3_2__1__Impl_in_rule__Optional__Group_3_2__17212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ConstrainsAssignment_3_2_1_in_rule__Optional__Group_3_2__1__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__0__Impl_in_rule__Optional__Group_4__07273 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__1_in_rule__Optional__Group_4__07276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__GroupsAssignment_4_0_in_rule__Optional__Group_4__0__Impl7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__1__Impl_in_rule__Optional__Group_4__17333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__GroupsAssignment_4_1_in_rule__Optional__Group_4__1__Impl7360 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07395 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_rule__Or__Group__0__Impl7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17457 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Or__Group__2_in_rule__Or__Group__17460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__NameAssignment_1_in_rule__Or__Group__1__Impl7487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__27517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__0_in_rule__Or__Group__2__Impl7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__0__Impl_in_rule__Or__Group_2__07581 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_rule__Or__Group_2__1_in_rule__Or__Group_2__07584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Or__Group_2__0__Impl7611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__1__Impl_in_rule__Or__Group_2__17640 = new BitSet(new long[]{0x00000001E8020000L});
    public static final BitSet FOLLOW_rule__Or__Group_2__2_in_rule__Or__Group_2__17643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__GroupedAssignment_2_1_in_rule__Or__Group_2__1__Impl7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__2__Impl_in_rule__Or__Group_2__27700 = new BitSet(new long[]{0x00000001E8020000L});
    public static final BitSet FOLLOW_rule__Or__Group_2__3_in_rule__Or__Group_2__27703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__0_in_rule__Or__Group_2__2__Impl7730 = new BitSet(new long[]{0x00000001C8020002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__3__Impl_in_rule__Or__Group_2__37761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Or__Group_2__3__Impl7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__0__Impl_in_rule__Or__Group_2_2__07825 = new BitSet(new long[]{0x00000001C8020000L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__1_in_rule__Or__Group_2_2__07828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Or__Group_2_2__0__Impl7857 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__1__Impl_in_rule__Or__Group_2_2__17890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__GroupedAssignment_2_2_1_in_rule__Or__Group_2_2__1__Impl7917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__0__Impl_in_rule__Xor__Group__07951 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_rule__Xor__Group__1_in_rule__Xor__Group__07954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_rule__Xor__Group__0__Impl7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__1__Impl_in_rule__Xor__Group__18013 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Xor__Group__2_in_rule__Xor__Group__18016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__NameAssignment_1_in_rule__Xor__Group__1__Impl8043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__2__Impl_in_rule__Xor__Group__28073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__0_in_rule__Xor__Group__2__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__0__Impl_in_rule__Xor__Group_2__08137 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__1_in_rule__Xor__Group_2__08140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Xor__Group_2__0__Impl8167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__1__Impl_in_rule__Xor__Group_2__18196 = new BitSet(new long[]{0x00000001E8020000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__2_in_rule__Xor__Group_2__18199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__GroupedAssignment_2_1_in_rule__Xor__Group_2__1__Impl8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__2__Impl_in_rule__Xor__Group_2__28256 = new BitSet(new long[]{0x00000001E8020000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__3_in_rule__Xor__Group_2__28259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__0_in_rule__Xor__Group_2__2__Impl8286 = new BitSet(new long[]{0x00000001C8020002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__3__Impl_in_rule__Xor__Group_2__38317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Xor__Group_2__3__Impl8344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__0__Impl_in_rule__Xor__Group_2_2__08381 = new BitSet(new long[]{0x00000001C8020000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__1_in_rule__Xor__Group_2_2__08384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Xor__Group_2_2__0__Impl8413 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__1__Impl_in_rule__Xor__Group_2_2__18446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__GroupedAssignment_2_2_1_in_rule__Xor__Group_2_2__1__Impl8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_rule__Model__RootAssignment8512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VerticalLineVerticalLine_in_rule__Constrain__OperatorAssignment_1_18548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Constrain__RightExpAssignment_1_28587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AmpersandAmpersand_in_rule__Conjunction__OperatorAssignment_1_18623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Conjunction__RightExpAssignment_1_28662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OperatorAlternatives_1_1_0_in_rule__Comparison__OperatorAssignment_1_18693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_rule__Comparison__RightExpAssignment_1_28726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Binary__RightExpAssignment_1_18757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Primary__ConstrainFeaturesAssignment_0_08792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Primary__GroupsAssignment_0_28831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Primary__ConstrainFeaturesAssignment_0_48870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__OperatorAlternatives_1_0_in_rule__Unary__OperatorAssignment_18905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Unary__ExpAssignment_28938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Range__NameAssignment_08969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Feature_Impl__NameAssignment_19000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_19031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_29062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_19093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_2_19124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Grouped__NameAssignment_09155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__Grouped__RangeAssignment_19186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_2_19217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_2_2_19248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Mandatory__NameAssignment_09279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_19310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_2_19341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_2_19372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_2_2_19403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_3_09434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_3_19465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Optional__NameAssignment_19496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_19527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_2_19558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_3_19589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_3_2_19620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_4_09651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_4_19682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Or__NameAssignment_19713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_19744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_2_19775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Xor__NameAssignment_19806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_19837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_2_19868 = new BitSet(new long[]{0x0000000000000002L});

}