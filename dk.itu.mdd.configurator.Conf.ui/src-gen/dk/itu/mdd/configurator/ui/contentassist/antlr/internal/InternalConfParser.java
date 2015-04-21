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


    // $ANTLR start "entryRuleComparison"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:199:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:200:1: ( ruleComparison EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:201:1: ruleComparison EOF
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:208:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:212:5: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:213:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:213:1: ( ( rule__Comparison__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:214:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:215:1: ( rule__Comparison__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:215:2: rule__Comparison__Group__0
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:227:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:228:1: ( ruleBinary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:229:1: ruleBinary EOF
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:236:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:240:5: ( ( ( rule__Binary__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:241:1: ( ( rule__Binary__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:241:1: ( ( rule__Binary__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:242:1: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:243:1: ( rule__Binary__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:243:2: rule__Binary__Group__0
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:255:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:256:1: ( rulePrimary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:257:1: rulePrimary EOF
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:264:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:268:5: ( ( ( rule__Primary__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:269:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:269:1: ( ( rule__Primary__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:270:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:271:1: ( rule__Primary__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:271:2: rule__Primary__Alternatives
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:283:1: entryRuleUnary : ruleUnary EOF ;
    public final void entryRuleUnary() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:284:1: ( ruleUnary EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:285:1: ruleUnary EOF
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:292:1: ruleUnary : ( ( rule__Unary__Group__0 ) ) ;
    public final void ruleUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:296:5: ( ( ( rule__Unary__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:297:1: ( ( rule__Unary__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:297:1: ( ( rule__Unary__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:298:1: ( rule__Unary__Group__0 )
            {
             before(grammarAccess.getUnaryAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:299:1: ( rule__Unary__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:299:2: rule__Unary__Group__0
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:311:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:312:1: ( ruleGroup EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:313:1: ruleGroup EOF
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:320:1: ruleGroup : ( ( rule__Group__Alternatives ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:324:5: ( ( ( rule__Group__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:325:1: ( ( rule__Group__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:325:1: ( ( rule__Group__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:326:1: ( rule__Group__Alternatives )
            {
             before(grammarAccess.getGroupAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:327:1: ( rule__Group__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:327:2: rule__Group__Alternatives
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


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:339:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:340:1: ( ruleEString EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:341:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString632);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString639); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:348:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:352:5: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:353:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:353:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:354:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:355:1: ( rule__EString__Alternatives )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:355:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString669);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:367:1: entryRuleFeature_Impl : ruleFeature_Impl EOF ;
    public final void entryRuleFeature_Impl() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:368:1: ( ruleFeature_Impl EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:369:1: ruleFeature_Impl EOF
            {
             before(grammarAccess.getFeature_ImplRule()); 
            pushFollow(FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl696);
            ruleFeature_Impl();

            state._fsp--;

             after(grammarAccess.getFeature_ImplRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature_Impl703); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:376:1: ruleFeature_Impl : ( ( rule__Feature_Impl__Group__0 ) ) ;
    public final void ruleFeature_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:380:5: ( ( ( rule__Feature_Impl__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:381:1: ( ( rule__Feature_Impl__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:381:1: ( ( rule__Feature_Impl__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:382:1: ( rule__Feature_Impl__Group__0 )
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:383:1: ( rule__Feature_Impl__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:383:2: rule__Feature_Impl__Group__0
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__0_in_ruleFeature_Impl733);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:395:1: entryRuleGrouped : ruleGrouped EOF ;
    public final void entryRuleGrouped() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:396:1: ( ruleGrouped EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:397:1: ruleGrouped EOF
            {
             before(grammarAccess.getGroupedRule()); 
            pushFollow(FOLLOW_ruleGrouped_in_entryRuleGrouped760);
            ruleGrouped();

            state._fsp--;

             after(grammarAccess.getGroupedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouped767); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:404:1: ruleGrouped : ( ( rule__Grouped__Group__0 ) ) ;
    public final void ruleGrouped() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:408:5: ( ( ( rule__Grouped__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:409:1: ( ( rule__Grouped__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:409:1: ( ( rule__Grouped__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:410:1: ( rule__Grouped__Group__0 )
            {
             before(grammarAccess.getGroupedAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:411:1: ( rule__Grouped__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:411:2: rule__Grouped__Group__0
            {
            pushFollow(FOLLOW_rule__Grouped__Group__0_in_ruleGrouped797);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:423:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:424:1: ( ruleMandatory EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:425:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory824);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory831); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:432:1: ruleMandatory : ( ( rule__Mandatory__Group__0 ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:436:5: ( ( ( rule__Mandatory__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:437:1: ( ( rule__Mandatory__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:437:1: ( ( rule__Mandatory__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:438:1: ( rule__Mandatory__Group__0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:439:1: ( rule__Mandatory__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:439:2: rule__Mandatory__Group__0
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory861);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:451:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:452:1: ( ruleOptional EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:453:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional888);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional895); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:460:1: ruleOptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:464:5: ( ( ( rule__Optional__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:465:1: ( ( rule__Optional__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:465:1: ( ( rule__Optional__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:466:1: ( rule__Optional__Group__0 )
            {
             before(grammarAccess.getOptionalAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:467:1: ( rule__Optional__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:467:2: rule__Optional__Group__0
            {
            pushFollow(FOLLOW_rule__Optional__Group__0_in_ruleOptional925);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:479:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:480:1: ( ruleOr EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:481:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr952);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr959); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:488:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:492:5: ( ( ( rule__Or__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:493:1: ( ( rule__Or__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:493:1: ( ( rule__Or__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:494:1: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:495:1: ( rule__Or__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:495:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr989);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:507:1: entryRuleXor : ruleXor EOF ;
    public final void entryRuleXor() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:508:1: ( ruleXor EOF )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:509:1: ruleXor EOF
            {
             before(grammarAccess.getXorRule()); 
            pushFollow(FOLLOW_ruleXor_in_entryRuleXor1016);
            ruleXor();

            state._fsp--;

             after(grammarAccess.getXorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXor1023); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:516:1: ruleXor : ( ( rule__Xor__Group__0 ) ) ;
    public final void ruleXor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:520:5: ( ( ( rule__Xor__Group__0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:521:1: ( ( rule__Xor__Group__0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:521:1: ( ( rule__Xor__Group__0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:522:1: ( rule__Xor__Group__0 )
            {
             before(grammarAccess.getXorAccess().getGroup()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:523:1: ( rule__Xor__Group__0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:523:2: rule__Xor__Group__0
            {
            pushFollow(FOLLOW_rule__Xor__Group__0_in_ruleXor1053);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:536:1: rule__Solitary__Alternatives : ( ( ruleMandatory ) | ( ruleOptional ) );
    public final void rule__Solitary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:540:1: ( ( ruleMandatory ) | ( ruleOptional ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:541:1: ( ruleMandatory )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:541:1: ( ruleMandatory )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:542:1: ruleMandatory
                    {
                     before(grammarAccess.getSolitaryAccess().getMandatoryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMandatory_in_rule__Solitary__Alternatives1090);
                    ruleMandatory();

                    state._fsp--;

                     after(grammarAccess.getSolitaryAccess().getMandatoryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:547:6: ( ruleOptional )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:547:6: ( ruleOptional )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:548:1: ruleOptional
                    {
                     before(grammarAccess.getSolitaryAccess().getOptionalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOptional_in_rule__Solitary__Alternatives1107);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:558:1: rule__Comparison__OperatorAlternatives_1_1_0 : ( ( EqualsSignEqualsSign ) | ( ExclamationMarkEqualsSign ) | ( LessThanSignEqualsSign ) | ( LessThanSign ) | ( GreaterThanSignEqualsSign ) | ( GreaterThanSign ) );
    public final void rule__Comparison__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:562:1: ( ( EqualsSignEqualsSign ) | ( ExclamationMarkEqualsSign ) | ( LessThanSignEqualsSign ) | ( LessThanSign ) | ( GreaterThanSignEqualsSign ) | ( GreaterThanSign ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:563:1: ( EqualsSignEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:563:1: ( EqualsSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:564:1: EqualsSignEqualsSign
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,EqualsSignEqualsSign,FOLLOW_EqualsSignEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01140); 
                     after(grammarAccess.getComparisonAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:571:6: ( ExclamationMarkEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:571:6: ( ExclamationMarkEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:572:1: ExclamationMarkEqualsSign
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,ExclamationMarkEqualsSign,FOLLOW_ExclamationMarkEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01160); 
                     after(grammarAccess.getComparisonAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:579:6: ( LessThanSignEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:579:6: ( LessThanSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:580:1: LessThanSignEqualsSign
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2()); 
                    match(input,LessThanSignEqualsSign,FOLLOW_LessThanSignEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01180); 
                     after(grammarAccess.getComparisonAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:587:6: ( LessThanSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:587:6: ( LessThanSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:588:1: LessThanSign
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_1_1_0_3()); 
                    match(input,LessThanSign,FOLLOW_LessThanSign_in_rule__Comparison__OperatorAlternatives_1_1_01200); 
                     after(grammarAccess.getComparisonAccess().getOperatorLessThanSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:595:6: ( GreaterThanSignEqualsSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:595:6: ( GreaterThanSignEqualsSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:596:1: GreaterThanSignEqualsSign
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_4()); 
                    match(input,GreaterThanSignEqualsSign,FOLLOW_GreaterThanSignEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01220); 
                     after(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:603:6: ( GreaterThanSign )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:603:6: ( GreaterThanSign )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:604:1: GreaterThanSign
                    {
                     before(grammarAccess.getComparisonAccess().getOperatorGreaterThanSignKeyword_1_1_0_5()); 
                    match(input,GreaterThanSign,FOLLOW_GreaterThanSign_in_rule__Comparison__OperatorAlternatives_1_1_01240); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:616:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleUnary ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:620:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleUnary ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_NULL:
            case RULE_ID:
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:621:1: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:621:1: ( ( rule__Primary__Group_0__0 ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:622:1: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:623:1: ( rule__Primary__Group_0__0 )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:623:2: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives1274);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:627:6: ( ruleUnary )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:627:6: ( ruleUnary )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:628:1: ruleUnary
                    {
                     before(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnary_in_rule__Primary__Alternatives1292);
                    ruleUnary();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getUnaryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:633:6: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:633:6: ( ( rule__Primary__Group_2__0 ) )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:634:1: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:635:1: ( rule__Primary__Group_2__0 )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:635:2: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_2__0_in_rule__Primary__Alternatives1309);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:644:1: rule__Unary__OperatorAlternatives_1_0 : ( ( ExclamationMark ) | ( HyphenMinus ) );
    public final void rule__Unary__OperatorAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:648:1: ( ( ExclamationMark ) | ( HyphenMinus ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:649:1: ( ExclamationMark )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:649:1: ( ExclamationMark )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:650:1: ExclamationMark
                    {
                     before(grammarAccess.getUnaryAccess().getOperatorExclamationMarkKeyword_1_0_0()); 
                    match(input,ExclamationMark,FOLLOW_ExclamationMark_in_rule__Unary__OperatorAlternatives_1_01343); 
                     after(grammarAccess.getUnaryAccess().getOperatorExclamationMarkKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:657:6: ( HyphenMinus )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:657:6: ( HyphenMinus )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:658:1: HyphenMinus
                    {
                     before(grammarAccess.getUnaryAccess().getOperatorHyphenMinusKeyword_1_0_1()); 
                    match(input,HyphenMinus,FOLLOW_HyphenMinus_in_rule__Unary__OperatorAlternatives_1_01363); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:670:1: rule__Group__Alternatives : ( ( ruleOr ) | ( ruleXor ) );
    public final void rule__Group__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:674:1: ( ( ruleOr ) | ( ruleXor ) )
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
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:675:1: ( ruleOr )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:675:1: ( ruleOr )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:676:1: ruleOr
                    {
                     before(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOr_in_rule__Group__Alternatives1397);
                    ruleOr();

                    state._fsp--;

                     after(grammarAccess.getGroupAccess().getOrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:681:6: ( ruleXor )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:681:6: ( ruleXor )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:682:1: ruleXor
                    {
                     before(grammarAccess.getGroupAccess().getXorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleXor_in_rule__Group__Alternatives1414);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:692:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_NULL ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:696:1: ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_NULL ) )
            int alt6=3;
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
            case RULE_NULL:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:697:1: ( RULE_STRING )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:697:1: ( RULE_STRING )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:698:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1446); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:703:6: ( RULE_ID )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:703:6: ( RULE_ID )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:704:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1463); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:709:6: ( RULE_NULL )
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:709:6: ( RULE_NULL )
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:710:1: RULE_NULL
                    {
                     before(grammarAccess.getEStringAccess().getNULLTerminalRuleCall_2()); 
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__EString__Alternatives1480); 
                     after(grammarAccess.getEStringAccess().getNULLTerminalRuleCall_2()); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:722:1: rule__Constrain__Group__0 : rule__Constrain__Group__0__Impl rule__Constrain__Group__1 ;
    public final void rule__Constrain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:726:1: ( rule__Constrain__Group__0__Impl rule__Constrain__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:727:2: rule__Constrain__Group__0__Impl rule__Constrain__Group__1
            {
            pushFollow(FOLLOW_rule__Constrain__Group__0__Impl_in_rule__Constrain__Group__01510);
            rule__Constrain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constrain__Group__1_in_rule__Constrain__Group__01513);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:734:1: rule__Constrain__Group__0__Impl : ( ruleConjunction ) ;
    public final void rule__Constrain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:738:1: ( ( ruleConjunction ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:739:1: ( ruleConjunction )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:739:1: ( ruleConjunction )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:740:1: ruleConjunction
            {
             before(grammarAccess.getConstrainAccess().getConjunctionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Constrain__Group__0__Impl1540);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:751:1: rule__Constrain__Group__1 : rule__Constrain__Group__1__Impl ;
    public final void rule__Constrain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:755:1: ( rule__Constrain__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:756:2: rule__Constrain__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Constrain__Group__1__Impl_in_rule__Constrain__Group__11569);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:762:1: rule__Constrain__Group__1__Impl : ( ( rule__Constrain__Group_1__0 )* ) ;
    public final void rule__Constrain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:766:1: ( ( ( rule__Constrain__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:767:1: ( ( rule__Constrain__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:767:1: ( ( rule__Constrain__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:768:1: ( rule__Constrain__Group_1__0 )*
            {
             before(grammarAccess.getConstrainAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:769:1: ( rule__Constrain__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==VerticalLineVerticalLine) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:769:2: rule__Constrain__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Constrain__Group_1__0_in_rule__Constrain__Group__1__Impl1596);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:783:1: rule__Constrain__Group_1__0 : rule__Constrain__Group_1__0__Impl rule__Constrain__Group_1__1 ;
    public final void rule__Constrain__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:787:1: ( rule__Constrain__Group_1__0__Impl rule__Constrain__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:788:2: rule__Constrain__Group_1__0__Impl rule__Constrain__Group_1__1
            {
            pushFollow(FOLLOW_rule__Constrain__Group_1__0__Impl_in_rule__Constrain__Group_1__01631);
            rule__Constrain__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constrain__Group_1__1_in_rule__Constrain__Group_1__01634);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:795:1: rule__Constrain__Group_1__0__Impl : ( () ) ;
    public final void rule__Constrain__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:799:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:800:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:800:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:801:1: ()
            {
             before(grammarAccess.getConstrainAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:802:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:804:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:814:1: rule__Constrain__Group_1__1 : rule__Constrain__Group_1__1__Impl rule__Constrain__Group_1__2 ;
    public final void rule__Constrain__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:818:1: ( rule__Constrain__Group_1__1__Impl rule__Constrain__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:819:2: rule__Constrain__Group_1__1__Impl rule__Constrain__Group_1__2
            {
            pushFollow(FOLLOW_rule__Constrain__Group_1__1__Impl_in_rule__Constrain__Group_1__11692);
            rule__Constrain__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constrain__Group_1__2_in_rule__Constrain__Group_1__11695);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:826:1: rule__Constrain__Group_1__1__Impl : ( ( rule__Constrain__OperatorAssignment_1_1 ) ) ;
    public final void rule__Constrain__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:830:1: ( ( ( rule__Constrain__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:831:1: ( ( rule__Constrain__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:831:1: ( ( rule__Constrain__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:832:1: ( rule__Constrain__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getConstrainAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:833:1: ( rule__Constrain__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:833:2: rule__Constrain__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Constrain__OperatorAssignment_1_1_in_rule__Constrain__Group_1__1__Impl1722);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:843:1: rule__Constrain__Group_1__2 : rule__Constrain__Group_1__2__Impl ;
    public final void rule__Constrain__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:847:1: ( rule__Constrain__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:848:2: rule__Constrain__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Constrain__Group_1__2__Impl_in_rule__Constrain__Group_1__21752);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:854:1: rule__Constrain__Group_1__2__Impl : ( ( rule__Constrain__RightExpAssignment_1_2 ) ) ;
    public final void rule__Constrain__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:858:1: ( ( ( rule__Constrain__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:859:1: ( ( rule__Constrain__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:859:1: ( ( rule__Constrain__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:860:1: ( rule__Constrain__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getConstrainAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:861:1: ( rule__Constrain__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:861:2: rule__Constrain__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Constrain__RightExpAssignment_1_2_in_rule__Constrain__Group_1__2__Impl1779);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:877:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:881:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:882:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__01815);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__01818);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:889:1: rule__Conjunction__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:893:1: ( ( ruleComparison ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:894:1: ( ruleComparison )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:894:1: ( ruleComparison )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:895:1: ruleComparison
            {
             before(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Conjunction__Group__0__Impl1845);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:906:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:910:1: ( rule__Conjunction__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:911:2: rule__Conjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__11874);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:917:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )* ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:921:1: ( ( ( rule__Conjunction__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:922:1: ( ( rule__Conjunction__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:922:1: ( ( rule__Conjunction__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:923:1: ( rule__Conjunction__Group_1__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:924:1: ( rule__Conjunction__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AmpersandAmpersand) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:924:2: rule__Conjunction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl1901);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:938:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:942:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:943:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__01936);
            rule__Conjunction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__01939);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:950:1: rule__Conjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:954:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:955:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:955:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:956:1: ()
            {
             before(grammarAccess.getConjunctionAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:957:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:959:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:969:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:973:1: ( rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:974:2: rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__11997);
            rule__Conjunction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__12000);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:981:1: rule__Conjunction__Group_1__1__Impl : ( ( rule__Conjunction__OperatorAssignment_1_1 ) ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:985:1: ( ( ( rule__Conjunction__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:986:1: ( ( rule__Conjunction__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:986:1: ( ( rule__Conjunction__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:987:1: ( rule__Conjunction__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getConjunctionAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:988:1: ( rule__Conjunction__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:988:2: rule__Conjunction__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Conjunction__OperatorAssignment_1_1_in_rule__Conjunction__Group_1__1__Impl2027);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:998:1: rule__Conjunction__Group_1__2 : rule__Conjunction__Group_1__2__Impl ;
    public final void rule__Conjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1002:1: ( rule__Conjunction__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1003:2: rule__Conjunction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__22057);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1009:1: rule__Conjunction__Group_1__2__Impl : ( ( rule__Conjunction__RightExpAssignment_1_2 ) ) ;
    public final void rule__Conjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1013:1: ( ( ( rule__Conjunction__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1014:1: ( ( rule__Conjunction__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1014:1: ( ( rule__Conjunction__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1015:1: ( rule__Conjunction__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getConjunctionAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1016:1: ( rule__Conjunction__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1016:2: rule__Conjunction__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Conjunction__RightExpAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl2084);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1032:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1036:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1037:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__02120);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__02123);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1044:1: rule__Comparison__Group__0__Impl : ( ruleBinary ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1048:1: ( ( ruleBinary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1049:1: ( ruleBinary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1049:1: ( ruleBinary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1050:1: ruleBinary
            {
             before(grammarAccess.getComparisonAccess().getBinaryParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBinary_in_rule__Comparison__Group__0__Impl2150);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1061:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1065:1: ( rule__Comparison__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1066:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__12179);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1072:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1076:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1077:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1077:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1078:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1079:1: ( rule__Comparison__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ExclamationMarkEqualsSign||(LA9_0>=LessThanSignEqualsSign && LA9_0<=GreaterThanSignEqualsSign)||(LA9_0>=LessThanSign && LA9_0<=GreaterThanSign)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1079:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl2206);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1093:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1097:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1098:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__02241);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__02244);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1105:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1109:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1110:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1110:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1111:1: ()
            {
             before(grammarAccess.getComparisonAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1112:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1114:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1124:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1128:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1129:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__12302);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__12305);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1136:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OperatorAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1140:1: ( ( ( rule__Comparison__OperatorAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1141:1: ( ( rule__Comparison__OperatorAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1141:1: ( ( rule__Comparison__OperatorAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1142:1: ( rule__Comparison__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1143:1: ( rule__Comparison__OperatorAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1143:2: rule__Comparison__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OperatorAssignment_1_1_in_rule__Comparison__Group_1__1__Impl2332);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1153:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1157:1: ( rule__Comparison__Group_1__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1158:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__22362);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1164:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightExpAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1168:1: ( ( ( rule__Comparison__RightExpAssignment_1_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1169:1: ( ( rule__Comparison__RightExpAssignment_1_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1169:1: ( ( rule__Comparison__RightExpAssignment_1_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1170:1: ( rule__Comparison__RightExpAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightExpAssignment_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1171:1: ( rule__Comparison__RightExpAssignment_1_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1171:2: rule__Comparison__RightExpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightExpAssignment_1_2_in_rule__Comparison__Group_1__2__Impl2389);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1187:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1191:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1192:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_rule__Binary__Group__0__Impl_in_rule__Binary__Group__02425);
            rule__Binary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binary__Group__1_in_rule__Binary__Group__02428);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1199:1: rule__Binary__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1203:1: ( ( rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1204:1: ( rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1204:1: ( rulePrimary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1205:1: rulePrimary
            {
             before(grammarAccess.getBinaryAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Binary__Group__0__Impl2455);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1216:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1220:1: ( rule__Binary__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1221:2: rule__Binary__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Binary__Group__1__Impl_in_rule__Binary__Group__12484);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1227:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__Group_1__0 )* ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1231:1: ( ( ( rule__Binary__Group_1__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1232:1: ( ( rule__Binary__Group_1__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1232:1: ( ( rule__Binary__Group_1__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1233:1: ( rule__Binary__Group_1__0 )*
            {
             before(grammarAccess.getBinaryAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1234:1: ( rule__Binary__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=ExclamationMark && LA10_0<=LeftParenthesis)||LA10_0==HyphenMinus||LA10_0==RULE_NULL||LA10_0==RULE_ID||LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1234:2: rule__Binary__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Binary__Group_1__0_in_rule__Binary__Group__1__Impl2511);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1248:1: rule__Binary__Group_1__0 : rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 ;
    public final void rule__Binary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1252:1: ( rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1253:2: rule__Binary__Group_1__0__Impl rule__Binary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Binary__Group_1__0__Impl_in_rule__Binary__Group_1__02546);
            rule__Binary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Binary__Group_1__1_in_rule__Binary__Group_1__02549);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1260:1: rule__Binary__Group_1__0__Impl : ( () ) ;
    public final void rule__Binary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1264:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1265:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1265:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1266:1: ()
            {
             before(grammarAccess.getBinaryAccess().getBinaryLeftExpAction_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1267:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1269:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1279:1: rule__Binary__Group_1__1 : rule__Binary__Group_1__1__Impl ;
    public final void rule__Binary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1283:1: ( rule__Binary__Group_1__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1284:2: rule__Binary__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Binary__Group_1__1__Impl_in_rule__Binary__Group_1__12607);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1290:1: rule__Binary__Group_1__1__Impl : ( ( rule__Binary__RightExpAssignment_1_1 ) ) ;
    public final void rule__Binary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1294:1: ( ( ( rule__Binary__RightExpAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1295:1: ( ( rule__Binary__RightExpAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1295:1: ( ( rule__Binary__RightExpAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1296:1: ( rule__Binary__RightExpAssignment_1_1 )
            {
             before(grammarAccess.getBinaryAccess().getRightExpAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1297:1: ( rule__Binary__RightExpAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1297:2: rule__Binary__RightExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Binary__RightExpAssignment_1_1_in_rule__Binary__Group_1__1__Impl2634);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1311:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1315:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1316:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__02668);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__02671);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1323:1: rule__Primary__Group_0__0__Impl : ( ( rule__Primary__ConstrainFeaturesAssignment_0_0 ) ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1327:1: ( ( ( rule__Primary__ConstrainFeaturesAssignment_0_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1328:1: ( ( rule__Primary__ConstrainFeaturesAssignment_0_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1328:1: ( ( rule__Primary__ConstrainFeaturesAssignment_0_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1329:1: ( rule__Primary__ConstrainFeaturesAssignment_0_0 )
            {
             before(grammarAccess.getPrimaryAccess().getConstrainFeaturesAssignment_0_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1330:1: ( rule__Primary__ConstrainFeaturesAssignment_0_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1330:2: rule__Primary__ConstrainFeaturesAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Primary__ConstrainFeaturesAssignment_0_0_in_rule__Primary__Group_0__0__Impl2698);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1340:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1344:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1345:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__12728);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__12731);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1352:1: rule__Primary__Group_0__1__Impl : ( FullStop ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1356:1: ( ( FullStop ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1357:1: ( FullStop )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1357:1: ( FullStop )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1358:1: FullStop
            {
             before(grammarAccess.getPrimaryAccess().getFullStopKeyword_0_1()); 
            match(input,FullStop,FOLLOW_FullStop_in_rule__Primary__Group_0__1__Impl2759); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1371:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3 ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1375:1: ( rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1376:2: rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__22790);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__3_in_rule__Primary__Group_0__22793);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1383:1: rule__Primary__Group_0__2__Impl : ( ( rule__Primary__GroupsAssignment_0_2 ) ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1387:1: ( ( ( rule__Primary__GroupsAssignment_0_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1388:1: ( ( rule__Primary__GroupsAssignment_0_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1388:1: ( ( rule__Primary__GroupsAssignment_0_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1389:1: ( rule__Primary__GroupsAssignment_0_2 )
            {
             before(grammarAccess.getPrimaryAccess().getGroupsAssignment_0_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1390:1: ( rule__Primary__GroupsAssignment_0_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1390:2: rule__Primary__GroupsAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Primary__GroupsAssignment_0_2_in_rule__Primary__Group_0__2__Impl2820);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1400:1: rule__Primary__Group_0__3 : rule__Primary__Group_0__3__Impl ;
    public final void rule__Primary__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1404:1: ( rule__Primary__Group_0__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1405:2: rule__Primary__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__3__Impl_in_rule__Primary__Group_0__32850);
            rule__Primary__Group_0__3__Impl();

            state._fsp--;


            }

        }
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1411:1: rule__Primary__Group_0__3__Impl : ( ( rule__Primary__Group_0_3__0 )* ) ;
    public final void rule__Primary__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1415:1: ( ( ( rule__Primary__Group_0_3__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1416:1: ( ( rule__Primary__Group_0_3__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1416:1: ( ( rule__Primary__Group_0_3__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1417:1: ( rule__Primary__Group_0_3__0 )*
            {
             before(grammarAccess.getPrimaryAccess().getGroup_0_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1418:1: ( rule__Primary__Group_0_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==FullStop) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1418:2: rule__Primary__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Primary__Group_0_3__0_in_rule__Primary__Group_0__3__Impl2877);
            	    rule__Primary__Group_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPrimaryAccess().getGroup_0_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Primary__Group_0_3__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1436:1: rule__Primary__Group_0_3__0 : rule__Primary__Group_0_3__0__Impl rule__Primary__Group_0_3__1 ;
    public final void rule__Primary__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1440:1: ( rule__Primary__Group_0_3__0__Impl rule__Primary__Group_0_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1441:2: rule__Primary__Group_0_3__0__Impl rule__Primary__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_0_3__0__Impl_in_rule__Primary__Group_0_3__02916);
            rule__Primary__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0_3__1_in_rule__Primary__Group_0_3__02919);
            rule__Primary__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0_3__0"


    // $ANTLR start "rule__Primary__Group_0_3__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1448:1: rule__Primary__Group_0_3__0__Impl : ( FullStop ) ;
    public final void rule__Primary__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1452:1: ( ( FullStop ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1453:1: ( FullStop )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1453:1: ( FullStop )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1454:1: FullStop
            {
             before(grammarAccess.getPrimaryAccess().getFullStopKeyword_0_3_0()); 
            match(input,FullStop,FOLLOW_FullStop_in_rule__Primary__Group_0_3__0__Impl2947); 
             after(grammarAccess.getPrimaryAccess().getFullStopKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_0_3__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1467:1: rule__Primary__Group_0_3__1 : rule__Primary__Group_0_3__1__Impl ;
    public final void rule__Primary__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1471:1: ( rule__Primary__Group_0_3__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1472:2: rule__Primary__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_0_3__1__Impl_in_rule__Primary__Group_0_3__12978);
            rule__Primary__Group_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0_3__1"


    // $ANTLR start "rule__Primary__Group_0_3__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1478:1: rule__Primary__Group_0_3__1__Impl : ( ( rule__Primary__ConstrainFeaturesAssignment_0_3_1 ) ) ;
    public final void rule__Primary__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1482:1: ( ( ( rule__Primary__ConstrainFeaturesAssignment_0_3_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1483:1: ( ( rule__Primary__ConstrainFeaturesAssignment_0_3_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1483:1: ( ( rule__Primary__ConstrainFeaturesAssignment_0_3_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1484:1: ( rule__Primary__ConstrainFeaturesAssignment_0_3_1 )
            {
             before(grammarAccess.getPrimaryAccess().getConstrainFeaturesAssignment_0_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1485:1: ( rule__Primary__ConstrainFeaturesAssignment_0_3_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1485:2: rule__Primary__ConstrainFeaturesAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__Primary__ConstrainFeaturesAssignment_0_3_1_in_rule__Primary__Group_0_3__1__Impl3005);
            rule__Primary__ConstrainFeaturesAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getConstrainFeaturesAssignment_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1499:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1503:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1504:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__0__Impl_in_rule__Primary__Group_2__03039);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_2__1_in_rule__Primary__Group_2__03042);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1511:1: rule__Primary__Group_2__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1515:1: ( ( LeftParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1516:1: ( LeftParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1516:1: ( LeftParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1517:1: LeftParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rule__Primary__Group_2__0__Impl3070); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1530:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1534:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1535:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__1__Impl_in_rule__Primary__Group_2__13101);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_2__2_in_rule__Primary__Group_2__13104);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1542:1: rule__Primary__Group_2__1__Impl : ( ruleConstrain ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1546:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1547:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1547:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1548:1: ruleConstrain
            {
             before(grammarAccess.getPrimaryAccess().getConstrainParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Primary__Group_2__1__Impl3131);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1559:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1563:1: ( rule__Primary__Group_2__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1564:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_2__2__Impl_in_rule__Primary__Group_2__23160);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1570:1: rule__Primary__Group_2__2__Impl : ( RightParenthesis ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1574:1: ( ( RightParenthesis ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1575:1: ( RightParenthesis )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1575:1: ( RightParenthesis )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1576:1: RightParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rule__Primary__Group_2__2__Impl3188); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1595:1: rule__Unary__Group__0 : rule__Unary__Group__0__Impl rule__Unary__Group__1 ;
    public final void rule__Unary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1599:1: ( rule__Unary__Group__0__Impl rule__Unary__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1600:2: rule__Unary__Group__0__Impl rule__Unary__Group__1
            {
            pushFollow(FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__03225);
            rule__Unary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__03228);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1607:1: rule__Unary__Group__0__Impl : ( () ) ;
    public final void rule__Unary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1611:1: ( ( () ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1612:1: ( () )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1612:1: ( () )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1613:1: ()
            {
             before(grammarAccess.getUnaryAccess().getUnaryAction_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1614:1: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1616:1: 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1626:1: rule__Unary__Group__1 : rule__Unary__Group__1__Impl rule__Unary__Group__2 ;
    public final void rule__Unary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1630:1: ( rule__Unary__Group__1__Impl rule__Unary__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1631:2: rule__Unary__Group__1__Impl rule__Unary__Group__2
            {
            pushFollow(FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__13286);
            rule__Unary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unary__Group__2_in_rule__Unary__Group__13289);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1638:1: rule__Unary__Group__1__Impl : ( ( rule__Unary__OperatorAssignment_1 ) ) ;
    public final void rule__Unary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1642:1: ( ( ( rule__Unary__OperatorAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1643:1: ( ( rule__Unary__OperatorAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1643:1: ( ( rule__Unary__OperatorAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1644:1: ( rule__Unary__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryAccess().getOperatorAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1645:1: ( rule__Unary__OperatorAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1645:2: rule__Unary__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__Unary__OperatorAssignment_1_in_rule__Unary__Group__1__Impl3316);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1655:1: rule__Unary__Group__2 : rule__Unary__Group__2__Impl ;
    public final void rule__Unary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1659:1: ( rule__Unary__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1660:2: rule__Unary__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Unary__Group__2__Impl_in_rule__Unary__Group__23346);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1666:1: rule__Unary__Group__2__Impl : ( ( rule__Unary__ExpAssignment_2 ) ) ;
    public final void rule__Unary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1670:1: ( ( ( rule__Unary__ExpAssignment_2 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1671:1: ( ( rule__Unary__ExpAssignment_2 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1671:1: ( ( rule__Unary__ExpAssignment_2 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1672:1: ( rule__Unary__ExpAssignment_2 )
            {
             before(grammarAccess.getUnaryAccess().getExpAssignment_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1673:1: ( rule__Unary__ExpAssignment_2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1673:2: rule__Unary__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__Unary__ExpAssignment_2_in_rule__Unary__Group__2__Impl3373);
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


    // $ANTLR start "rule__Feature_Impl__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1689:1: rule__Feature_Impl__Group__0 : rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 ;
    public final void rule__Feature_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1693:1: ( rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1694:2: rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__0__Impl_in_rule__Feature_Impl__Group__03409);
            rule__Feature_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group__1_in_rule__Feature_Impl__Group__03412);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1701:1: rule__Feature_Impl__Group__0__Impl : ( Feature ) ;
    public final void rule__Feature_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1705:1: ( ( Feature ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1706:1: ( Feature )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1706:1: ( Feature )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1707:1: Feature
            {
             before(grammarAccess.getFeature_ImplAccess().getFeatureKeyword_0()); 
            match(input,Feature,FOLLOW_Feature_in_rule__Feature_Impl__Group__0__Impl3440); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1720:1: rule__Feature_Impl__Group__1 : rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 ;
    public final void rule__Feature_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1724:1: ( rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1725:2: rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__1__Impl_in_rule__Feature_Impl__Group__13471);
            rule__Feature_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group__2_in_rule__Feature_Impl__Group__13474);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1732:1: rule__Feature_Impl__Group__1__Impl : ( ( rule__Feature_Impl__NameAssignment_1 ) ) ;
    public final void rule__Feature_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1736:1: ( ( ( rule__Feature_Impl__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1737:1: ( ( rule__Feature_Impl__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1737:1: ( ( rule__Feature_Impl__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1738:1: ( rule__Feature_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1739:1: ( rule__Feature_Impl__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1739:2: rule__Feature_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__NameAssignment_1_in_rule__Feature_Impl__Group__1__Impl3501);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1749:1: rule__Feature_Impl__Group__2 : rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 ;
    public final void rule__Feature_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1753:1: ( rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1754:2: rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__2__Impl_in_rule__Feature_Impl__Group__23531);
            rule__Feature_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group__3_in_rule__Feature_Impl__Group__23534);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1761:1: rule__Feature_Impl__Group__2__Impl : ( ( rule__Feature_Impl__Group_2__0 )? ) ;
    public final void rule__Feature_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1765:1: ( ( ( rule__Feature_Impl__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1766:1: ( ( rule__Feature_Impl__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1766:1: ( ( rule__Feature_Impl__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1767:1: ( rule__Feature_Impl__Group_2__0 )?
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1768:1: ( rule__Feature_Impl__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BEGIN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1768:2: rule__Feature_Impl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Feature_Impl__Group_2__0_in_rule__Feature_Impl__Group__2__Impl3561);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1778:1: rule__Feature_Impl__Group__3 : rule__Feature_Impl__Group__3__Impl ;
    public final void rule__Feature_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1782:1: ( rule__Feature_Impl__Group__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1783:2: rule__Feature_Impl__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group__3__Impl_in_rule__Feature_Impl__Group__33592);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1789:1: rule__Feature_Impl__Group__3__Impl : ( ( rule__Feature_Impl__Group_3__0 )? ) ;
    public final void rule__Feature_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1793:1: ( ( ( rule__Feature_Impl__Group_3__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1794:1: ( ( rule__Feature_Impl__Group_3__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1794:1: ( ( rule__Feature_Impl__Group_3__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1795:1: ( rule__Feature_Impl__Group_3__0 )?
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1796:1: ( rule__Feature_Impl__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftSquareBracket) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1796:2: rule__Feature_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Feature_Impl__Group_3__0_in_rule__Feature_Impl__Group__3__Impl3619);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1814:1: rule__Feature_Impl__Group_2__0 : rule__Feature_Impl__Group_2__0__Impl rule__Feature_Impl__Group_2__1 ;
    public final void rule__Feature_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1818:1: ( rule__Feature_Impl__Group_2__0__Impl rule__Feature_Impl__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1819:2: rule__Feature_Impl__Group_2__0__Impl rule__Feature_Impl__Group_2__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__0__Impl_in_rule__Feature_Impl__Group_2__03658);
            rule__Feature_Impl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__1_in_rule__Feature_Impl__Group_2__03661);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1826:1: rule__Feature_Impl__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Feature_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1830:1: ( ( RULE_BEGIN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1831:1: ( RULE_BEGIN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1831:1: ( RULE_BEGIN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1832:1: RULE_BEGIN
            {
             before(grammarAccess.getFeature_ImplAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Feature_Impl__Group_2__0__Impl3688); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1843:1: rule__Feature_Impl__Group_2__1 : rule__Feature_Impl__Group_2__1__Impl rule__Feature_Impl__Group_2__2 ;
    public final void rule__Feature_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1847:1: ( rule__Feature_Impl__Group_2__1__Impl rule__Feature_Impl__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1848:2: rule__Feature_Impl__Group_2__1__Impl rule__Feature_Impl__Group_2__2
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__1__Impl_in_rule__Feature_Impl__Group_2__13717);
            rule__Feature_Impl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__2_in_rule__Feature_Impl__Group_2__13720);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1855:1: rule__Feature_Impl__Group_2__1__Impl : ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) ) ;
    public final void rule__Feature_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1859:1: ( ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1860:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1860:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1861:1: ( rule__Feature_Impl__SubfeatureAssignment_2_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1862:1: ( rule__Feature_Impl__SubfeatureAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1862:2: rule__Feature_Impl__SubfeatureAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_1_in_rule__Feature_Impl__Group_2__1__Impl3747);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1872:1: rule__Feature_Impl__Group_2__2 : rule__Feature_Impl__Group_2__2__Impl rule__Feature_Impl__Group_2__3 ;
    public final void rule__Feature_Impl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1876:1: ( rule__Feature_Impl__Group_2__2__Impl rule__Feature_Impl__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1877:2: rule__Feature_Impl__Group_2__2__Impl rule__Feature_Impl__Group_2__3
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__2__Impl_in_rule__Feature_Impl__Group_2__23777);
            rule__Feature_Impl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__3_in_rule__Feature_Impl__Group_2__23780);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1884:1: rule__Feature_Impl__Group_2__2__Impl : ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* ) ;
    public final void rule__Feature_Impl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1888:1: ( ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1889:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1889:1: ( ( rule__Feature_Impl__SubfeatureAssignment_2_2 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1890:1: ( rule__Feature_Impl__SubfeatureAssignment_2_2 )*
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureAssignment_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1891:1: ( rule__Feature_Impl__SubfeatureAssignment_2_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==QuestionMark||LA14_0==RULE_NULL||LA14_0==RULE_ID||LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1891:2: rule__Feature_Impl__SubfeatureAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_2_in_rule__Feature_Impl__Group_2__2__Impl3807);
            	    rule__Feature_Impl__SubfeatureAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1901:1: rule__Feature_Impl__Group_2__3 : rule__Feature_Impl__Group_2__3__Impl ;
    public final void rule__Feature_Impl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1905:1: ( rule__Feature_Impl__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1906:2: rule__Feature_Impl__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_2__3__Impl_in_rule__Feature_Impl__Group_2__33838);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1912:1: rule__Feature_Impl__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Feature_Impl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1916:1: ( ( RULE_END ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1917:1: ( RULE_END )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1917:1: ( RULE_END )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1918:1: RULE_END
            {
             before(grammarAccess.getFeature_ImplAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Feature_Impl__Group_2__3__Impl3865); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1937:1: rule__Feature_Impl__Group_3__0 : rule__Feature_Impl__Group_3__0__Impl rule__Feature_Impl__Group_3__1 ;
    public final void rule__Feature_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1941:1: ( rule__Feature_Impl__Group_3__0__Impl rule__Feature_Impl__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1942:2: rule__Feature_Impl__Group_3__0__Impl rule__Feature_Impl__Group_3__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__0__Impl_in_rule__Feature_Impl__Group_3__03902);
            rule__Feature_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__1_in_rule__Feature_Impl__Group_3__03905);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1949:1: rule__Feature_Impl__Group_3__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Feature_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1953:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1954:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1954:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1955:1: LeftSquareBracket
            {
             before(grammarAccess.getFeature_ImplAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Feature_Impl__Group_3__0__Impl3933); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1968:1: rule__Feature_Impl__Group_3__1 : rule__Feature_Impl__Group_3__1__Impl rule__Feature_Impl__Group_3__2 ;
    public final void rule__Feature_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1972:1: ( rule__Feature_Impl__Group_3__1__Impl rule__Feature_Impl__Group_3__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1973:2: rule__Feature_Impl__Group_3__1__Impl rule__Feature_Impl__Group_3__2
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__1__Impl_in_rule__Feature_Impl__Group_3__13964);
            rule__Feature_Impl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__2_in_rule__Feature_Impl__Group_3__13967);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1980:1: rule__Feature_Impl__Group_3__1__Impl : ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) ) ;
    public final void rule__Feature_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1984:1: ( ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1985:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1985:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1986:1: ( rule__Feature_Impl__ConstrainsAssignment_3_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsAssignment_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1987:1: ( rule__Feature_Impl__ConstrainsAssignment_3_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1987:2: rule__Feature_Impl__ConstrainsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_1_in_rule__Feature_Impl__Group_3__1__Impl3994);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:1997:1: rule__Feature_Impl__Group_3__2 : rule__Feature_Impl__Group_3__2__Impl rule__Feature_Impl__Group_3__3 ;
    public final void rule__Feature_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2001:1: ( rule__Feature_Impl__Group_3__2__Impl rule__Feature_Impl__Group_3__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2002:2: rule__Feature_Impl__Group_3__2__Impl rule__Feature_Impl__Group_3__3
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__2__Impl_in_rule__Feature_Impl__Group_3__24024);
            rule__Feature_Impl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__3_in_rule__Feature_Impl__Group_3__24027);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2009:1: rule__Feature_Impl__Group_3__2__Impl : ( ( rule__Feature_Impl__Group_3_2__0 )* ) ;
    public final void rule__Feature_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2013:1: ( ( ( rule__Feature_Impl__Group_3_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2014:1: ( ( rule__Feature_Impl__Group_3_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2014:1: ( ( rule__Feature_Impl__Group_3_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2015:1: ( rule__Feature_Impl__Group_3_2__0 )*
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_3_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2016:1: ( rule__Feature_Impl__Group_3_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2016:2: rule__Feature_Impl__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__0_in_rule__Feature_Impl__Group_3__2__Impl4054);
            	    rule__Feature_Impl__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2026:1: rule__Feature_Impl__Group_3__3 : rule__Feature_Impl__Group_3__3__Impl ;
    public final void rule__Feature_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2030:1: ( rule__Feature_Impl__Group_3__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2031:2: rule__Feature_Impl__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3__3__Impl_in_rule__Feature_Impl__Group_3__34085);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2037:1: rule__Feature_Impl__Group_3__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Feature_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2041:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2042:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2042:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2043:1: RightSquareBracket
            {
             before(grammarAccess.getFeature_ImplAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Feature_Impl__Group_3__3__Impl4113); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2064:1: rule__Feature_Impl__Group_3_2__0 : rule__Feature_Impl__Group_3_2__0__Impl rule__Feature_Impl__Group_3_2__1 ;
    public final void rule__Feature_Impl__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2068:1: ( rule__Feature_Impl__Group_3_2__0__Impl rule__Feature_Impl__Group_3_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2069:2: rule__Feature_Impl__Group_3_2__0__Impl rule__Feature_Impl__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__0__Impl_in_rule__Feature_Impl__Group_3_2__04152);
            rule__Feature_Impl__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__1_in_rule__Feature_Impl__Group_3_2__04155);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2076:1: rule__Feature_Impl__Group_3_2__0__Impl : ( Comma ) ;
    public final void rule__Feature_Impl__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2080:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2081:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2081:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2082:1: Comma
            {
             before(grammarAccess.getFeature_ImplAccess().getCommaKeyword_3_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Feature_Impl__Group_3_2__0__Impl4183); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2095:1: rule__Feature_Impl__Group_3_2__1 : rule__Feature_Impl__Group_3_2__1__Impl ;
    public final void rule__Feature_Impl__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2099:1: ( rule__Feature_Impl__Group_3_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2100:2: rule__Feature_Impl__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature_Impl__Group_3_2__1__Impl_in_rule__Feature_Impl__Group_3_2__14214);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2106:1: rule__Feature_Impl__Group_3_2__1__Impl : ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) ) ;
    public final void rule__Feature_Impl__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2110:1: ( ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2111:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2111:1: ( ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2112:1: ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsAssignment_3_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2113:1: ( rule__Feature_Impl__ConstrainsAssignment_3_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2113:2: rule__Feature_Impl__ConstrainsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_2_1_in_rule__Feature_Impl__Group_3_2__1__Impl4241);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2127:1: rule__Grouped__Group__0 : rule__Grouped__Group__0__Impl rule__Grouped__Group__1 ;
    public final void rule__Grouped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2131:1: ( rule__Grouped__Group__0__Impl rule__Grouped__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2132:2: rule__Grouped__Group__0__Impl rule__Grouped__Group__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group__0__Impl_in_rule__Grouped__Group__04275);
            rule__Grouped__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group__1_in_rule__Grouped__Group__04278);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2139:1: rule__Grouped__Group__0__Impl : ( ( rule__Grouped__NameAssignment_0 ) ) ;
    public final void rule__Grouped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2143:1: ( ( ( rule__Grouped__NameAssignment_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2144:1: ( ( rule__Grouped__NameAssignment_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2144:1: ( ( rule__Grouped__NameAssignment_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2145:1: ( rule__Grouped__NameAssignment_0 )
            {
             before(grammarAccess.getGroupedAccess().getNameAssignment_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2146:1: ( rule__Grouped__NameAssignment_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2146:2: rule__Grouped__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Grouped__NameAssignment_0_in_rule__Grouped__Group__0__Impl4305);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2156:1: rule__Grouped__Group__1 : rule__Grouped__Group__1__Impl ;
    public final void rule__Grouped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2160:1: ( rule__Grouped__Group__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2161:2: rule__Grouped__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group__1__Impl_in_rule__Grouped__Group__14335);
            rule__Grouped__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2167:1: rule__Grouped__Group__1__Impl : ( ( rule__Grouped__Group_1__0 )? ) ;
    public final void rule__Grouped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2171:1: ( ( ( rule__Grouped__Group_1__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2172:1: ( ( rule__Grouped__Group_1__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2172:1: ( ( rule__Grouped__Group_1__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2173:1: ( rule__Grouped__Group_1__0 )?
            {
             before(grammarAccess.getGroupedAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2174:1: ( rule__Grouped__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LeftSquareBracket) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2174:2: rule__Grouped__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Grouped__Group_1__0_in_rule__Grouped__Group__1__Impl4362);
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


    // $ANTLR start "rule__Grouped__Group_1__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2188:1: rule__Grouped__Group_1__0 : rule__Grouped__Group_1__0__Impl rule__Grouped__Group_1__1 ;
    public final void rule__Grouped__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2192:1: ( rule__Grouped__Group_1__0__Impl rule__Grouped__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2193:2: rule__Grouped__Group_1__0__Impl rule__Grouped__Group_1__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group_1__0__Impl_in_rule__Grouped__Group_1__04397);
            rule__Grouped__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_1__1_in_rule__Grouped__Group_1__04400);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2200:1: rule__Grouped__Group_1__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Grouped__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2204:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2205:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2205:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2206:1: LeftSquareBracket
            {
             before(grammarAccess.getGroupedAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Grouped__Group_1__0__Impl4428); 
             after(grammarAccess.getGroupedAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2219:1: rule__Grouped__Group_1__1 : rule__Grouped__Group_1__1__Impl rule__Grouped__Group_1__2 ;
    public final void rule__Grouped__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2223:1: ( rule__Grouped__Group_1__1__Impl rule__Grouped__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2224:2: rule__Grouped__Group_1__1__Impl rule__Grouped__Group_1__2
            {
            pushFollow(FOLLOW_rule__Grouped__Group_1__1__Impl_in_rule__Grouped__Group_1__14459);
            rule__Grouped__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_1__2_in_rule__Grouped__Group_1__14462);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2231:1: rule__Grouped__Group_1__1__Impl : ( ( rule__Grouped__ConstrainsAssignment_1_1 ) ) ;
    public final void rule__Grouped__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2235:1: ( ( ( rule__Grouped__ConstrainsAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2236:1: ( ( rule__Grouped__ConstrainsAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2236:1: ( ( rule__Grouped__ConstrainsAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2237:1: ( rule__Grouped__ConstrainsAssignment_1_1 )
            {
             before(grammarAccess.getGroupedAccess().getConstrainsAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2238:1: ( rule__Grouped__ConstrainsAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2238:2: rule__Grouped__ConstrainsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Grouped__ConstrainsAssignment_1_1_in_rule__Grouped__Group_1__1__Impl4489);
            rule__Grouped__ConstrainsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedAccess().getConstrainsAssignment_1_1()); 

            }


            }

        }
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2248:1: rule__Grouped__Group_1__2 : rule__Grouped__Group_1__2__Impl rule__Grouped__Group_1__3 ;
    public final void rule__Grouped__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2252:1: ( rule__Grouped__Group_1__2__Impl rule__Grouped__Group_1__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2253:2: rule__Grouped__Group_1__2__Impl rule__Grouped__Group_1__3
            {
            pushFollow(FOLLOW_rule__Grouped__Group_1__2__Impl_in_rule__Grouped__Group_1__24519);
            rule__Grouped__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_1__3_in_rule__Grouped__Group_1__24522);
            rule__Grouped__Group_1__3();

            state._fsp--;


            }

        }
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2260:1: rule__Grouped__Group_1__2__Impl : ( ( rule__Grouped__Group_1_2__0 )* ) ;
    public final void rule__Grouped__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2264:1: ( ( ( rule__Grouped__Group_1_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2265:1: ( ( rule__Grouped__Group_1_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2265:1: ( ( rule__Grouped__Group_1_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2266:1: ( rule__Grouped__Group_1_2__0 )*
            {
             before(grammarAccess.getGroupedAccess().getGroup_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2267:1: ( rule__Grouped__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2267:2: rule__Grouped__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Grouped__Group_1_2__0_in_rule__Grouped__Group_1__2__Impl4549);
            	    rule__Grouped__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getGroupedAccess().getGroup_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Grouped__Group_1__3"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2277:1: rule__Grouped__Group_1__3 : rule__Grouped__Group_1__3__Impl ;
    public final void rule__Grouped__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2281:1: ( rule__Grouped__Group_1__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2282:2: rule__Grouped__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group_1__3__Impl_in_rule__Grouped__Group_1__34580);
            rule__Grouped__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_1__3"


    // $ANTLR start "rule__Grouped__Group_1__3__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2288:1: rule__Grouped__Group_1__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Grouped__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2292:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2293:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2293:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2294:1: RightSquareBracket
            {
             before(grammarAccess.getGroupedAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Grouped__Group_1__3__Impl4608); 
             after(grammarAccess.getGroupedAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_1__3__Impl"


    // $ANTLR start "rule__Grouped__Group_1_2__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2315:1: rule__Grouped__Group_1_2__0 : rule__Grouped__Group_1_2__0__Impl rule__Grouped__Group_1_2__1 ;
    public final void rule__Grouped__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2319:1: ( rule__Grouped__Group_1_2__0__Impl rule__Grouped__Group_1_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2320:2: rule__Grouped__Group_1_2__0__Impl rule__Grouped__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Grouped__Group_1_2__0__Impl_in_rule__Grouped__Group_1_2__04647);
            rule__Grouped__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouped__Group_1_2__1_in_rule__Grouped__Group_1_2__04650);
            rule__Grouped__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_1_2__0"


    // $ANTLR start "rule__Grouped__Group_1_2__0__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2327:1: rule__Grouped__Group_1_2__0__Impl : ( Comma ) ;
    public final void rule__Grouped__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2331:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2332:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2332:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2333:1: Comma
            {
             before(grammarAccess.getGroupedAccess().getCommaKeyword_1_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Grouped__Group_1_2__0__Impl4678); 
             after(grammarAccess.getGroupedAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_1_2__0__Impl"


    // $ANTLR start "rule__Grouped__Group_1_2__1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2346:1: rule__Grouped__Group_1_2__1 : rule__Grouped__Group_1_2__1__Impl ;
    public final void rule__Grouped__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2350:1: ( rule__Grouped__Group_1_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2351:2: rule__Grouped__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Grouped__Group_1_2__1__Impl_in_rule__Grouped__Group_1_2__14709);
            rule__Grouped__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_1_2__1"


    // $ANTLR start "rule__Grouped__Group_1_2__1__Impl"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2357:1: rule__Grouped__Group_1_2__1__Impl : ( ( rule__Grouped__ConstrainsAssignment_1_2_1 ) ) ;
    public final void rule__Grouped__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2361:1: ( ( ( rule__Grouped__ConstrainsAssignment_1_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2362:1: ( ( rule__Grouped__ConstrainsAssignment_1_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2362:1: ( ( rule__Grouped__ConstrainsAssignment_1_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2363:1: ( rule__Grouped__ConstrainsAssignment_1_2_1 )
            {
             before(grammarAccess.getGroupedAccess().getConstrainsAssignment_1_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2364:1: ( rule__Grouped__ConstrainsAssignment_1_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2364:2: rule__Grouped__ConstrainsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Grouped__ConstrainsAssignment_1_2_1_in_rule__Grouped__Group_1_2__1__Impl4736);
            rule__Grouped__ConstrainsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedAccess().getConstrainsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__Group_1_2__1__Impl"


    // $ANTLR start "rule__Mandatory__Group__0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2378:1: rule__Mandatory__Group__0 : rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 ;
    public final void rule__Mandatory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2382:1: ( rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2383:2: rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__04770);
            rule__Mandatory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__04773);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2390:1: rule__Mandatory__Group__0__Impl : ( ( rule__Mandatory__NameAssignment_0 ) ) ;
    public final void rule__Mandatory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2394:1: ( ( ( rule__Mandatory__NameAssignment_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2395:1: ( ( rule__Mandatory__NameAssignment_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2395:1: ( ( rule__Mandatory__NameAssignment_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2396:1: ( rule__Mandatory__NameAssignment_0 )
            {
             before(grammarAccess.getMandatoryAccess().getNameAssignment_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2397:1: ( rule__Mandatory__NameAssignment_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2397:2: rule__Mandatory__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Mandatory__NameAssignment_0_in_rule__Mandatory__Group__0__Impl4800);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2407:1: rule__Mandatory__Group__1 : rule__Mandatory__Group__1__Impl rule__Mandatory__Group__2 ;
    public final void rule__Mandatory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2411:1: ( rule__Mandatory__Group__1__Impl rule__Mandatory__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2412:2: rule__Mandatory__Group__1__Impl rule__Mandatory__Group__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__14830);
            rule__Mandatory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__2_in_rule__Mandatory__Group__14833);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2419:1: rule__Mandatory__Group__1__Impl : ( ( rule__Mandatory__Group_1__0 )? ) ;
    public final void rule__Mandatory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2423:1: ( ( ( rule__Mandatory__Group_1__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2424:1: ( ( rule__Mandatory__Group_1__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2424:1: ( ( rule__Mandatory__Group_1__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2425:1: ( rule__Mandatory__Group_1__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2426:1: ( rule__Mandatory__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LeftCurlyBracket) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2426:2: rule__Mandatory__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_1__0_in_rule__Mandatory__Group__1__Impl4860);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2436:1: rule__Mandatory__Group__2 : rule__Mandatory__Group__2__Impl rule__Mandatory__Group__3 ;
    public final void rule__Mandatory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2440:1: ( rule__Mandatory__Group__2__Impl rule__Mandatory__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2441:2: rule__Mandatory__Group__2__Impl rule__Mandatory__Group__3
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__2__Impl_in_rule__Mandatory__Group__24891);
            rule__Mandatory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__3_in_rule__Mandatory__Group__24894);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2448:1: rule__Mandatory__Group__2__Impl : ( ( rule__Mandatory__Group_2__0 )? ) ;
    public final void rule__Mandatory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2452:1: ( ( ( rule__Mandatory__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2453:1: ( ( rule__Mandatory__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2453:1: ( ( rule__Mandatory__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2454:1: ( rule__Mandatory__Group_2__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2455:1: ( rule__Mandatory__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftSquareBracket) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2455:2: rule__Mandatory__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_2__0_in_rule__Mandatory__Group__2__Impl4921);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2465:1: rule__Mandatory__Group__3 : rule__Mandatory__Group__3__Impl ;
    public final void rule__Mandatory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2469:1: ( rule__Mandatory__Group__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2470:2: rule__Mandatory__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__3__Impl_in_rule__Mandatory__Group__34952);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2476:1: rule__Mandatory__Group__3__Impl : ( ( rule__Mandatory__Group_3__0 )? ) ;
    public final void rule__Mandatory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2480:1: ( ( ( rule__Mandatory__Group_3__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2481:1: ( ( rule__Mandatory__Group_3__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2481:1: ( ( rule__Mandatory__Group_3__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2482:1: ( rule__Mandatory__Group_3__0 )?
            {
             before(grammarAccess.getMandatoryAccess().getGroup_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2483:1: ( rule__Mandatory__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Xor||LA20_0==Or) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2483:2: rule__Mandatory__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Mandatory__Group_3__0_in_rule__Mandatory__Group__3__Impl4979);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2501:1: rule__Mandatory__Group_1__0 : rule__Mandatory__Group_1__0__Impl rule__Mandatory__Group_1__1 ;
    public final void rule__Mandatory__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2505:1: ( rule__Mandatory__Group_1__0__Impl rule__Mandatory__Group_1__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2506:2: rule__Mandatory__Group_1__0__Impl rule__Mandatory__Group_1__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__0__Impl_in_rule__Mandatory__Group_1__05018);
            rule__Mandatory__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1__1_in_rule__Mandatory__Group_1__05021);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2513:1: rule__Mandatory__Group_1__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Mandatory__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2517:1: ( ( LeftCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2518:1: ( LeftCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2518:1: ( LeftCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2519:1: LeftCurlyBracket
            {
             before(grammarAccess.getMandatoryAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__Mandatory__Group_1__0__Impl5049); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2532:1: rule__Mandatory__Group_1__1 : rule__Mandatory__Group_1__1__Impl rule__Mandatory__Group_1__2 ;
    public final void rule__Mandatory__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2536:1: ( rule__Mandatory__Group_1__1__Impl rule__Mandatory__Group_1__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2537:2: rule__Mandatory__Group_1__1__Impl rule__Mandatory__Group_1__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__1__Impl_in_rule__Mandatory__Group_1__15080);
            rule__Mandatory__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1__2_in_rule__Mandatory__Group_1__15083);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2544:1: rule__Mandatory__Group_1__1__Impl : ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) ) ;
    public final void rule__Mandatory__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2548:1: ( ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2549:1: ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2549:1: ( ( rule__Mandatory__SubfeatureAssignment_1_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2550:1: ( rule__Mandatory__SubfeatureAssignment_1_1 )
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureAssignment_1_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2551:1: ( rule__Mandatory__SubfeatureAssignment_1_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2551:2: rule__Mandatory__SubfeatureAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Mandatory__SubfeatureAssignment_1_1_in_rule__Mandatory__Group_1__1__Impl5110);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2561:1: rule__Mandatory__Group_1__2 : rule__Mandatory__Group_1__2__Impl rule__Mandatory__Group_1__3 ;
    public final void rule__Mandatory__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2565:1: ( rule__Mandatory__Group_1__2__Impl rule__Mandatory__Group_1__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2566:2: rule__Mandatory__Group_1__2__Impl rule__Mandatory__Group_1__3
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__2__Impl_in_rule__Mandatory__Group_1__25140);
            rule__Mandatory__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1__3_in_rule__Mandatory__Group_1__25143);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2573:1: rule__Mandatory__Group_1__2__Impl : ( ( rule__Mandatory__Group_1_2__0 )* ) ;
    public final void rule__Mandatory__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2577:1: ( ( ( rule__Mandatory__Group_1_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2578:1: ( ( rule__Mandatory__Group_1_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2578:1: ( ( rule__Mandatory__Group_1_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2579:1: ( rule__Mandatory__Group_1_2__0 )*
            {
             before(grammarAccess.getMandatoryAccess().getGroup_1_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2580:1: ( rule__Mandatory__Group_1_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2580:2: rule__Mandatory__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__Group_1_2__0_in_rule__Mandatory__Group_1__2__Impl5170);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2590:1: rule__Mandatory__Group_1__3 : rule__Mandatory__Group_1__3__Impl ;
    public final void rule__Mandatory__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2594:1: ( rule__Mandatory__Group_1__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2595:2: rule__Mandatory__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1__3__Impl_in_rule__Mandatory__Group_1__35201);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2601:1: rule__Mandatory__Group_1__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Mandatory__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2605:1: ( ( RightCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2606:1: ( RightCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2606:1: ( RightCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2607:1: RightCurlyBracket
            {
             before(grammarAccess.getMandatoryAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__Mandatory__Group_1__3__Impl5229); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2628:1: rule__Mandatory__Group_1_2__0 : rule__Mandatory__Group_1_2__0__Impl rule__Mandatory__Group_1_2__1 ;
    public final void rule__Mandatory__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2632:1: ( rule__Mandatory__Group_1_2__0__Impl rule__Mandatory__Group_1_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2633:2: rule__Mandatory__Group_1_2__0__Impl rule__Mandatory__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1_2__0__Impl_in_rule__Mandatory__Group_1_2__05268);
            rule__Mandatory__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_1_2__1_in_rule__Mandatory__Group_1_2__05271);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2640:1: rule__Mandatory__Group_1_2__0__Impl : ( Comma ) ;
    public final void rule__Mandatory__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2644:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2645:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2645:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2646:1: Comma
            {
             before(grammarAccess.getMandatoryAccess().getCommaKeyword_1_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Mandatory__Group_1_2__0__Impl5299); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2659:1: rule__Mandatory__Group_1_2__1 : rule__Mandatory__Group_1_2__1__Impl ;
    public final void rule__Mandatory__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2663:1: ( rule__Mandatory__Group_1_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2664:2: rule__Mandatory__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_1_2__1__Impl_in_rule__Mandatory__Group_1_2__15330);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2670:1: rule__Mandatory__Group_1_2__1__Impl : ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) ) ;
    public final void rule__Mandatory__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2674:1: ( ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2675:1: ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2675:1: ( ( rule__Mandatory__SubfeatureAssignment_1_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2676:1: ( rule__Mandatory__SubfeatureAssignment_1_2_1 )
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureAssignment_1_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2677:1: ( rule__Mandatory__SubfeatureAssignment_1_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2677:2: rule__Mandatory__SubfeatureAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Mandatory__SubfeatureAssignment_1_2_1_in_rule__Mandatory__Group_1_2__1__Impl5357);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2691:1: rule__Mandatory__Group_2__0 : rule__Mandatory__Group_2__0__Impl rule__Mandatory__Group_2__1 ;
    public final void rule__Mandatory__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2695:1: ( rule__Mandatory__Group_2__0__Impl rule__Mandatory__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2696:2: rule__Mandatory__Group_2__0__Impl rule__Mandatory__Group_2__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__0__Impl_in_rule__Mandatory__Group_2__05391);
            rule__Mandatory__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2__1_in_rule__Mandatory__Group_2__05394);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2703:1: rule__Mandatory__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Mandatory__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2707:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2708:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2708:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2709:1: LeftSquareBracket
            {
             before(grammarAccess.getMandatoryAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Mandatory__Group_2__0__Impl5422); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2722:1: rule__Mandatory__Group_2__1 : rule__Mandatory__Group_2__1__Impl rule__Mandatory__Group_2__2 ;
    public final void rule__Mandatory__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2726:1: ( rule__Mandatory__Group_2__1__Impl rule__Mandatory__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2727:2: rule__Mandatory__Group_2__1__Impl rule__Mandatory__Group_2__2
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__1__Impl_in_rule__Mandatory__Group_2__15453);
            rule__Mandatory__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2__2_in_rule__Mandatory__Group_2__15456);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2734:1: rule__Mandatory__Group_2__1__Impl : ( ( rule__Mandatory__ConstrainsAssignment_2_1 ) ) ;
    public final void rule__Mandatory__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2738:1: ( ( ( rule__Mandatory__ConstrainsAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2739:1: ( ( rule__Mandatory__ConstrainsAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2739:1: ( ( rule__Mandatory__ConstrainsAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2740:1: ( rule__Mandatory__ConstrainsAssignment_2_1 )
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2741:1: ( rule__Mandatory__ConstrainsAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2741:2: rule__Mandatory__ConstrainsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Mandatory__ConstrainsAssignment_2_1_in_rule__Mandatory__Group_2__1__Impl5483);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2751:1: rule__Mandatory__Group_2__2 : rule__Mandatory__Group_2__2__Impl rule__Mandatory__Group_2__3 ;
    public final void rule__Mandatory__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2755:1: ( rule__Mandatory__Group_2__2__Impl rule__Mandatory__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2756:2: rule__Mandatory__Group_2__2__Impl rule__Mandatory__Group_2__3
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__2__Impl_in_rule__Mandatory__Group_2__25513);
            rule__Mandatory__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2__3_in_rule__Mandatory__Group_2__25516);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2763:1: rule__Mandatory__Group_2__2__Impl : ( ( rule__Mandatory__Group_2_2__0 )* ) ;
    public final void rule__Mandatory__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2767:1: ( ( ( rule__Mandatory__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2768:1: ( ( rule__Mandatory__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2768:1: ( ( rule__Mandatory__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2769:1: ( rule__Mandatory__Group_2_2__0 )*
            {
             before(grammarAccess.getMandatoryAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2770:1: ( rule__Mandatory__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Comma) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2770:2: rule__Mandatory__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__Group_2_2__0_in_rule__Mandatory__Group_2__2__Impl5543);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2780:1: rule__Mandatory__Group_2__3 : rule__Mandatory__Group_2__3__Impl ;
    public final void rule__Mandatory__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2784:1: ( rule__Mandatory__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2785:2: rule__Mandatory__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2__3__Impl_in_rule__Mandatory__Group_2__35574);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2791:1: rule__Mandatory__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Mandatory__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2795:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2796:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2796:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2797:1: RightSquareBracket
            {
             before(grammarAccess.getMandatoryAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Mandatory__Group_2__3__Impl5602); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2818:1: rule__Mandatory__Group_2_2__0 : rule__Mandatory__Group_2_2__0__Impl rule__Mandatory__Group_2_2__1 ;
    public final void rule__Mandatory__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2822:1: ( rule__Mandatory__Group_2_2__0__Impl rule__Mandatory__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2823:2: rule__Mandatory__Group_2_2__0__Impl rule__Mandatory__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2_2__0__Impl_in_rule__Mandatory__Group_2_2__05641);
            rule__Mandatory__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_2_2__1_in_rule__Mandatory__Group_2_2__05644);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2830:1: rule__Mandatory__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Mandatory__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2834:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2835:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2835:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2836:1: Comma
            {
             before(grammarAccess.getMandatoryAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Mandatory__Group_2_2__0__Impl5672); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2849:1: rule__Mandatory__Group_2_2__1 : rule__Mandatory__Group_2_2__1__Impl ;
    public final void rule__Mandatory__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2853:1: ( rule__Mandatory__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2854:2: rule__Mandatory__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_2_2__1__Impl_in_rule__Mandatory__Group_2_2__15703);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2860:1: rule__Mandatory__Group_2_2__1__Impl : ( ( rule__Mandatory__ConstrainsAssignment_2_2_1 ) ) ;
    public final void rule__Mandatory__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2864:1: ( ( ( rule__Mandatory__ConstrainsAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2865:1: ( ( rule__Mandatory__ConstrainsAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2865:1: ( ( rule__Mandatory__ConstrainsAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2866:1: ( rule__Mandatory__ConstrainsAssignment_2_2_1 )
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2867:1: ( rule__Mandatory__ConstrainsAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2867:2: rule__Mandatory__ConstrainsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Mandatory__ConstrainsAssignment_2_2_1_in_rule__Mandatory__Group_2_2__1__Impl5730);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2881:1: rule__Mandatory__Group_3__0 : rule__Mandatory__Group_3__0__Impl rule__Mandatory__Group_3__1 ;
    public final void rule__Mandatory__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2885:1: ( rule__Mandatory__Group_3__0__Impl rule__Mandatory__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2886:2: rule__Mandatory__Group_3__0__Impl rule__Mandatory__Group_3__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_3__0__Impl_in_rule__Mandatory__Group_3__05764);
            rule__Mandatory__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group_3__1_in_rule__Mandatory__Group_3__05767);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2893:1: rule__Mandatory__Group_3__0__Impl : ( ( rule__Mandatory__GroupsAssignment_3_0 ) ) ;
    public final void rule__Mandatory__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2897:1: ( ( ( rule__Mandatory__GroupsAssignment_3_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2898:1: ( ( rule__Mandatory__GroupsAssignment_3_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2898:1: ( ( rule__Mandatory__GroupsAssignment_3_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2899:1: ( rule__Mandatory__GroupsAssignment_3_0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroupsAssignment_3_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2900:1: ( rule__Mandatory__GroupsAssignment_3_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2900:2: rule__Mandatory__GroupsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Mandatory__GroupsAssignment_3_0_in_rule__Mandatory__Group_3__0__Impl5794);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2910:1: rule__Mandatory__Group_3__1 : rule__Mandatory__Group_3__1__Impl ;
    public final void rule__Mandatory__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2914:1: ( rule__Mandatory__Group_3__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2915:2: rule__Mandatory__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group_3__1__Impl_in_rule__Mandatory__Group_3__15824);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2921:1: rule__Mandatory__Group_3__1__Impl : ( ( rule__Mandatory__GroupsAssignment_3_1 )* ) ;
    public final void rule__Mandatory__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2925:1: ( ( ( rule__Mandatory__GroupsAssignment_3_1 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2926:1: ( ( rule__Mandatory__GroupsAssignment_3_1 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2926:1: ( ( rule__Mandatory__GroupsAssignment_3_1 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2927:1: ( rule__Mandatory__GroupsAssignment_3_1 )*
            {
             before(grammarAccess.getMandatoryAccess().getGroupsAssignment_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2928:1: ( rule__Mandatory__GroupsAssignment_3_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Xor||LA23_0==Or) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2928:2: rule__Mandatory__GroupsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__GroupsAssignment_3_1_in_rule__Mandatory__Group_3__1__Impl5851);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2942:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2946:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2947:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__05886);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__05889);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2954:1: rule__Optional__Group__0__Impl : ( QuestionMark ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2958:1: ( ( QuestionMark ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2959:1: ( QuestionMark )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2959:1: ( QuestionMark )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2960:1: QuestionMark
            {
             before(grammarAccess.getOptionalAccess().getQuestionMarkKeyword_0()); 
            match(input,QuestionMark,FOLLOW_QuestionMark_in_rule__Optional__Group__0__Impl5917); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2973:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl rule__Optional__Group__2 ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2977:1: ( rule__Optional__Group__1__Impl rule__Optional__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2978:2: rule__Optional__Group__1__Impl rule__Optional__Group__2
            {
            pushFollow(FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__15948);
            rule__Optional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__2_in_rule__Optional__Group__15951);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2985:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__NameAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2989:1: ( ( ( rule__Optional__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2990:1: ( ( rule__Optional__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2990:1: ( ( rule__Optional__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2991:1: ( rule__Optional__NameAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2992:1: ( rule__Optional__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:2992:2: rule__Optional__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Optional__NameAssignment_1_in_rule__Optional__Group__1__Impl5978);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3002:1: rule__Optional__Group__2 : rule__Optional__Group__2__Impl rule__Optional__Group__3 ;
    public final void rule__Optional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3006:1: ( rule__Optional__Group__2__Impl rule__Optional__Group__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3007:2: rule__Optional__Group__2__Impl rule__Optional__Group__3
            {
            pushFollow(FOLLOW_rule__Optional__Group__2__Impl_in_rule__Optional__Group__26008);
            rule__Optional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__3_in_rule__Optional__Group__26011);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3014:1: rule__Optional__Group__2__Impl : ( ( rule__Optional__Group_2__0 )? ) ;
    public final void rule__Optional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3018:1: ( ( ( rule__Optional__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3019:1: ( ( rule__Optional__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3019:1: ( ( rule__Optional__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3020:1: ( rule__Optional__Group_2__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3021:1: ( rule__Optional__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftCurlyBracket) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3021:2: rule__Optional__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_2__0_in_rule__Optional__Group__2__Impl6038);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3031:1: rule__Optional__Group__3 : rule__Optional__Group__3__Impl rule__Optional__Group__4 ;
    public final void rule__Optional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3035:1: ( rule__Optional__Group__3__Impl rule__Optional__Group__4 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3036:2: rule__Optional__Group__3__Impl rule__Optional__Group__4
            {
            pushFollow(FOLLOW_rule__Optional__Group__3__Impl_in_rule__Optional__Group__36069);
            rule__Optional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__4_in_rule__Optional__Group__36072);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3043:1: rule__Optional__Group__3__Impl : ( ( rule__Optional__Group_3__0 )? ) ;
    public final void rule__Optional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3047:1: ( ( ( rule__Optional__Group_3__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3048:1: ( ( rule__Optional__Group_3__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3048:1: ( ( rule__Optional__Group_3__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3049:1: ( rule__Optional__Group_3__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_3()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3050:1: ( rule__Optional__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LeftSquareBracket) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3050:2: rule__Optional__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_3__0_in_rule__Optional__Group__3__Impl6099);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3060:1: rule__Optional__Group__4 : rule__Optional__Group__4__Impl ;
    public final void rule__Optional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3064:1: ( rule__Optional__Group__4__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3065:2: rule__Optional__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group__4__Impl_in_rule__Optional__Group__46130);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3071:1: rule__Optional__Group__4__Impl : ( ( rule__Optional__Group_4__0 )? ) ;
    public final void rule__Optional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3075:1: ( ( ( rule__Optional__Group_4__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3076:1: ( ( rule__Optional__Group_4__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3076:1: ( ( rule__Optional__Group_4__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3077:1: ( rule__Optional__Group_4__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_4()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3078:1: ( rule__Optional__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Xor||LA26_0==Or) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3078:2: rule__Optional__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_4__0_in_rule__Optional__Group__4__Impl6157);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3098:1: rule__Optional__Group_2__0 : rule__Optional__Group_2__0__Impl rule__Optional__Group_2__1 ;
    public final void rule__Optional__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3102:1: ( rule__Optional__Group_2__0__Impl rule__Optional__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3103:2: rule__Optional__Group_2__0__Impl rule__Optional__Group_2__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__0__Impl_in_rule__Optional__Group_2__06198);
            rule__Optional__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2__1_in_rule__Optional__Group_2__06201);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3110:1: rule__Optional__Group_2__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Optional__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3114:1: ( ( LeftCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3115:1: ( LeftCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3115:1: ( LeftCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3116:1: LeftCurlyBracket
            {
             before(grammarAccess.getOptionalAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__Optional__Group_2__0__Impl6229); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3129:1: rule__Optional__Group_2__1 : rule__Optional__Group_2__1__Impl rule__Optional__Group_2__2 ;
    public final void rule__Optional__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3133:1: ( rule__Optional__Group_2__1__Impl rule__Optional__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3134:2: rule__Optional__Group_2__1__Impl rule__Optional__Group_2__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__1__Impl_in_rule__Optional__Group_2__16260);
            rule__Optional__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2__2_in_rule__Optional__Group_2__16263);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3141:1: rule__Optional__Group_2__1__Impl : ( ( rule__Optional__SubfeatureAssignment_2_1 ) ) ;
    public final void rule__Optional__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3145:1: ( ( ( rule__Optional__SubfeatureAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3146:1: ( ( rule__Optional__SubfeatureAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3146:1: ( ( rule__Optional__SubfeatureAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3147:1: ( rule__Optional__SubfeatureAssignment_2_1 )
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3148:1: ( rule__Optional__SubfeatureAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3148:2: rule__Optional__SubfeatureAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Optional__SubfeatureAssignment_2_1_in_rule__Optional__Group_2__1__Impl6290);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3158:1: rule__Optional__Group_2__2 : rule__Optional__Group_2__2__Impl rule__Optional__Group_2__3 ;
    public final void rule__Optional__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3162:1: ( rule__Optional__Group_2__2__Impl rule__Optional__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3163:2: rule__Optional__Group_2__2__Impl rule__Optional__Group_2__3
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__2__Impl_in_rule__Optional__Group_2__26320);
            rule__Optional__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2__3_in_rule__Optional__Group_2__26323);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3170:1: rule__Optional__Group_2__2__Impl : ( ( rule__Optional__Group_2_2__0 )* ) ;
    public final void rule__Optional__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3174:1: ( ( ( rule__Optional__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3175:1: ( ( rule__Optional__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3175:1: ( ( rule__Optional__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3176:1: ( rule__Optional__Group_2_2__0 )*
            {
             before(grammarAccess.getOptionalAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3177:1: ( rule__Optional__Group_2_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3177:2: rule__Optional__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Optional__Group_2_2__0_in_rule__Optional__Group_2__2__Impl6350);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3187:1: rule__Optional__Group_2__3 : rule__Optional__Group_2__3__Impl ;
    public final void rule__Optional__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3191:1: ( rule__Optional__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3192:2: rule__Optional__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_2__3__Impl_in_rule__Optional__Group_2__36381);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3198:1: rule__Optional__Group_2__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Optional__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3202:1: ( ( RightCurlyBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3203:1: ( RightCurlyBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3203:1: ( RightCurlyBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3204:1: RightCurlyBracket
            {
             before(grammarAccess.getOptionalAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__Optional__Group_2__3__Impl6409); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3225:1: rule__Optional__Group_2_2__0 : rule__Optional__Group_2_2__0__Impl rule__Optional__Group_2_2__1 ;
    public final void rule__Optional__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3229:1: ( rule__Optional__Group_2_2__0__Impl rule__Optional__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3230:2: rule__Optional__Group_2_2__0__Impl rule__Optional__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_2_2__0__Impl_in_rule__Optional__Group_2_2__06448);
            rule__Optional__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_2_2__1_in_rule__Optional__Group_2_2__06451);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3237:1: rule__Optional__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Optional__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3241:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3242:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3242:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3243:1: Comma
            {
             before(grammarAccess.getOptionalAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Optional__Group_2_2__0__Impl6479); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3256:1: rule__Optional__Group_2_2__1 : rule__Optional__Group_2_2__1__Impl ;
    public final void rule__Optional__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3260:1: ( rule__Optional__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3261:2: rule__Optional__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_2_2__1__Impl_in_rule__Optional__Group_2_2__16510);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3267:1: rule__Optional__Group_2_2__1__Impl : ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) ) ;
    public final void rule__Optional__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3271:1: ( ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3272:1: ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3272:1: ( ( rule__Optional__SubfeatureAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3273:1: ( rule__Optional__SubfeatureAssignment_2_2_1 )
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3274:1: ( rule__Optional__SubfeatureAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3274:2: rule__Optional__SubfeatureAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Optional__SubfeatureAssignment_2_2_1_in_rule__Optional__Group_2_2__1__Impl6537);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3288:1: rule__Optional__Group_3__0 : rule__Optional__Group_3__0__Impl rule__Optional__Group_3__1 ;
    public final void rule__Optional__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3292:1: ( rule__Optional__Group_3__0__Impl rule__Optional__Group_3__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3293:2: rule__Optional__Group_3__0__Impl rule__Optional__Group_3__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__0__Impl_in_rule__Optional__Group_3__06571);
            rule__Optional__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3__1_in_rule__Optional__Group_3__06574);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3300:1: rule__Optional__Group_3__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Optional__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3304:1: ( ( LeftSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3305:1: ( LeftSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3305:1: ( LeftSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3306:1: LeftSquareBracket
            {
             before(grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__Optional__Group_3__0__Impl6602); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3319:1: rule__Optional__Group_3__1 : rule__Optional__Group_3__1__Impl rule__Optional__Group_3__2 ;
    public final void rule__Optional__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3323:1: ( rule__Optional__Group_3__1__Impl rule__Optional__Group_3__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3324:2: rule__Optional__Group_3__1__Impl rule__Optional__Group_3__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__1__Impl_in_rule__Optional__Group_3__16633);
            rule__Optional__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3__2_in_rule__Optional__Group_3__16636);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3331:1: rule__Optional__Group_3__1__Impl : ( ( rule__Optional__ConstrainsAssignment_3_1 ) ) ;
    public final void rule__Optional__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3335:1: ( ( ( rule__Optional__ConstrainsAssignment_3_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3336:1: ( ( rule__Optional__ConstrainsAssignment_3_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3336:1: ( ( rule__Optional__ConstrainsAssignment_3_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3337:1: ( rule__Optional__ConstrainsAssignment_3_1 )
            {
             before(grammarAccess.getOptionalAccess().getConstrainsAssignment_3_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3338:1: ( rule__Optional__ConstrainsAssignment_3_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3338:2: rule__Optional__ConstrainsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Optional__ConstrainsAssignment_3_1_in_rule__Optional__Group_3__1__Impl6663);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3348:1: rule__Optional__Group_3__2 : rule__Optional__Group_3__2__Impl rule__Optional__Group_3__3 ;
    public final void rule__Optional__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3352:1: ( rule__Optional__Group_3__2__Impl rule__Optional__Group_3__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3353:2: rule__Optional__Group_3__2__Impl rule__Optional__Group_3__3
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__2__Impl_in_rule__Optional__Group_3__26693);
            rule__Optional__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3__3_in_rule__Optional__Group_3__26696);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3360:1: rule__Optional__Group_3__2__Impl : ( ( rule__Optional__Group_3_2__0 )* ) ;
    public final void rule__Optional__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3364:1: ( ( ( rule__Optional__Group_3_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3365:1: ( ( rule__Optional__Group_3_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3365:1: ( ( rule__Optional__Group_3_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3366:1: ( rule__Optional__Group_3_2__0 )*
            {
             before(grammarAccess.getOptionalAccess().getGroup_3_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3367:1: ( rule__Optional__Group_3_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Comma) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3367:2: rule__Optional__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Optional__Group_3_2__0_in_rule__Optional__Group_3__2__Impl6723);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3377:1: rule__Optional__Group_3__3 : rule__Optional__Group_3__3__Impl ;
    public final void rule__Optional__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3381:1: ( rule__Optional__Group_3__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3382:2: rule__Optional__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_3__3__Impl_in_rule__Optional__Group_3__36754);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3388:1: rule__Optional__Group_3__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Optional__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3392:1: ( ( RightSquareBracket ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3393:1: ( RightSquareBracket )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3393:1: ( RightSquareBracket )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3394:1: RightSquareBracket
            {
             before(grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__Optional__Group_3__3__Impl6782); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3415:1: rule__Optional__Group_3_2__0 : rule__Optional__Group_3_2__0__Impl rule__Optional__Group_3_2__1 ;
    public final void rule__Optional__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3419:1: ( rule__Optional__Group_3_2__0__Impl rule__Optional__Group_3_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3420:2: rule__Optional__Group_3_2__0__Impl rule__Optional__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_3_2__0__Impl_in_rule__Optional__Group_3_2__06821);
            rule__Optional__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_3_2__1_in_rule__Optional__Group_3_2__06824);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3427:1: rule__Optional__Group_3_2__0__Impl : ( Comma ) ;
    public final void rule__Optional__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3431:1: ( ( Comma ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3432:1: ( Comma )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3432:1: ( Comma )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3433:1: Comma
            {
             before(grammarAccess.getOptionalAccess().getCommaKeyword_3_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Optional__Group_3_2__0__Impl6852); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3446:1: rule__Optional__Group_3_2__1 : rule__Optional__Group_3_2__1__Impl ;
    public final void rule__Optional__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3450:1: ( rule__Optional__Group_3_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3451:2: rule__Optional__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_3_2__1__Impl_in_rule__Optional__Group_3_2__16883);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3457:1: rule__Optional__Group_3_2__1__Impl : ( ( rule__Optional__ConstrainsAssignment_3_2_1 ) ) ;
    public final void rule__Optional__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3461:1: ( ( ( rule__Optional__ConstrainsAssignment_3_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3462:1: ( ( rule__Optional__ConstrainsAssignment_3_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3462:1: ( ( rule__Optional__ConstrainsAssignment_3_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3463:1: ( rule__Optional__ConstrainsAssignment_3_2_1 )
            {
             before(grammarAccess.getOptionalAccess().getConstrainsAssignment_3_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3464:1: ( rule__Optional__ConstrainsAssignment_3_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3464:2: rule__Optional__ConstrainsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Optional__ConstrainsAssignment_3_2_1_in_rule__Optional__Group_3_2__1__Impl6910);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3478:1: rule__Optional__Group_4__0 : rule__Optional__Group_4__0__Impl rule__Optional__Group_4__1 ;
    public final void rule__Optional__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3482:1: ( rule__Optional__Group_4__0__Impl rule__Optional__Group_4__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3483:2: rule__Optional__Group_4__0__Impl rule__Optional__Group_4__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_4__0__Impl_in_rule__Optional__Group_4__06944);
            rule__Optional__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_4__1_in_rule__Optional__Group_4__06947);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3490:1: rule__Optional__Group_4__0__Impl : ( ( rule__Optional__GroupsAssignment_4_0 ) ) ;
    public final void rule__Optional__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3494:1: ( ( ( rule__Optional__GroupsAssignment_4_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3495:1: ( ( rule__Optional__GroupsAssignment_4_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3495:1: ( ( rule__Optional__GroupsAssignment_4_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3496:1: ( rule__Optional__GroupsAssignment_4_0 )
            {
             before(grammarAccess.getOptionalAccess().getGroupsAssignment_4_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3497:1: ( rule__Optional__GroupsAssignment_4_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3497:2: rule__Optional__GroupsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Optional__GroupsAssignment_4_0_in_rule__Optional__Group_4__0__Impl6974);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3507:1: rule__Optional__Group_4__1 : rule__Optional__Group_4__1__Impl ;
    public final void rule__Optional__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3511:1: ( rule__Optional__Group_4__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3512:2: rule__Optional__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_4__1__Impl_in_rule__Optional__Group_4__17004);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3518:1: rule__Optional__Group_4__1__Impl : ( ( rule__Optional__GroupsAssignment_4_1 )* ) ;
    public final void rule__Optional__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3522:1: ( ( ( rule__Optional__GroupsAssignment_4_1 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3523:1: ( ( rule__Optional__GroupsAssignment_4_1 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3523:1: ( ( rule__Optional__GroupsAssignment_4_1 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3524:1: ( rule__Optional__GroupsAssignment_4_1 )*
            {
             before(grammarAccess.getOptionalAccess().getGroupsAssignment_4_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3525:1: ( rule__Optional__GroupsAssignment_4_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Xor||LA29_0==Or) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3525:2: rule__Optional__GroupsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Optional__GroupsAssignment_4_1_in_rule__Optional__Group_4__1__Impl7031);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3539:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3543:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3544:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07066);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07069);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3551:1: rule__Or__Group__0__Impl : ( Or ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3555:1: ( ( Or ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3556:1: ( Or )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3556:1: ( Or )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3557:1: Or
            {
             before(grammarAccess.getOrAccess().getOrKeyword_0()); 
            match(input,Or,FOLLOW_Or_in_rule__Or__Group__0__Impl7097); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3570:1: rule__Or__Group__1 : rule__Or__Group__1__Impl rule__Or__Group__2 ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3574:1: ( rule__Or__Group__1__Impl rule__Or__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3575:2: rule__Or__Group__1__Impl rule__Or__Group__2
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17128);
            rule__Or__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__2_in_rule__Or__Group__17131);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3582:1: rule__Or__Group__1__Impl : ( ( rule__Or__NameAssignment_1 ) ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3586:1: ( ( ( rule__Or__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3587:1: ( ( rule__Or__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3587:1: ( ( rule__Or__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3588:1: ( rule__Or__NameAssignment_1 )
            {
             before(grammarAccess.getOrAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3589:1: ( rule__Or__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3589:2: rule__Or__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Or__NameAssignment_1_in_rule__Or__Group__1__Impl7158);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3599:1: rule__Or__Group__2 : rule__Or__Group__2__Impl ;
    public final void rule__Or__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3603:1: ( rule__Or__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3604:2: rule__Or__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__27188);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3610:1: rule__Or__Group__2__Impl : ( ( rule__Or__Group_2__0 )? ) ;
    public final void rule__Or__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3614:1: ( ( ( rule__Or__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3615:1: ( ( rule__Or__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3615:1: ( ( rule__Or__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3616:1: ( rule__Or__Group_2__0 )?
            {
             before(grammarAccess.getOrAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3617:1: ( rule__Or__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_BEGIN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3617:2: rule__Or__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Or__Group_2__0_in_rule__Or__Group__2__Impl7215);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3633:1: rule__Or__Group_2__0 : rule__Or__Group_2__0__Impl rule__Or__Group_2__1 ;
    public final void rule__Or__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3637:1: ( rule__Or__Group_2__0__Impl rule__Or__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3638:2: rule__Or__Group_2__0__Impl rule__Or__Group_2__1
            {
            pushFollow(FOLLOW_rule__Or__Group_2__0__Impl_in_rule__Or__Group_2__07252);
            rule__Or__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2__1_in_rule__Or__Group_2__07255);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3645:1: rule__Or__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Or__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3649:1: ( ( RULE_BEGIN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3650:1: ( RULE_BEGIN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3650:1: ( RULE_BEGIN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3651:1: RULE_BEGIN
            {
             before(grammarAccess.getOrAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Or__Group_2__0__Impl7282); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3662:1: rule__Or__Group_2__1 : rule__Or__Group_2__1__Impl rule__Or__Group_2__2 ;
    public final void rule__Or__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3666:1: ( rule__Or__Group_2__1__Impl rule__Or__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3667:2: rule__Or__Group_2__1__Impl rule__Or__Group_2__2
            {
            pushFollow(FOLLOW_rule__Or__Group_2__1__Impl_in_rule__Or__Group_2__17311);
            rule__Or__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2__2_in_rule__Or__Group_2__17314);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3674:1: rule__Or__Group_2__1__Impl : ( ( rule__Or__GroupedAssignment_2_1 ) ) ;
    public final void rule__Or__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3678:1: ( ( ( rule__Or__GroupedAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3679:1: ( ( rule__Or__GroupedAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3679:1: ( ( rule__Or__GroupedAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3680:1: ( rule__Or__GroupedAssignment_2_1 )
            {
             before(grammarAccess.getOrAccess().getGroupedAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3681:1: ( rule__Or__GroupedAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3681:2: rule__Or__GroupedAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Or__GroupedAssignment_2_1_in_rule__Or__Group_2__1__Impl7341);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3691:1: rule__Or__Group_2__2 : rule__Or__Group_2__2__Impl rule__Or__Group_2__3 ;
    public final void rule__Or__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3695:1: ( rule__Or__Group_2__2__Impl rule__Or__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3696:2: rule__Or__Group_2__2__Impl rule__Or__Group_2__3
            {
            pushFollow(FOLLOW_rule__Or__Group_2__2__Impl_in_rule__Or__Group_2__27371);
            rule__Or__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2__3_in_rule__Or__Group_2__27374);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3703:1: rule__Or__Group_2__2__Impl : ( ( rule__Or__Group_2_2__0 )* ) ;
    public final void rule__Or__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3707:1: ( ( ( rule__Or__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3708:1: ( ( rule__Or__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3708:1: ( ( rule__Or__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3709:1: ( rule__Or__Group_2_2__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3710:1: ( rule__Or__Group_2_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Comma||LA31_0==RULE_NULL||LA31_0==RULE_ID||LA31_0==RULE_STRING) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3710:2: rule__Or__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_2_2__0_in_rule__Or__Group_2__2__Impl7401);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3720:1: rule__Or__Group_2__3 : rule__Or__Group_2__3__Impl ;
    public final void rule__Or__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3724:1: ( rule__Or__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3725:2: rule__Or__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_2__3__Impl_in_rule__Or__Group_2__37432);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3731:1: rule__Or__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Or__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3735:1: ( ( RULE_END ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3736:1: ( RULE_END )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3736:1: ( RULE_END )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3737:1: RULE_END
            {
             before(grammarAccess.getOrAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Or__Group_2__3__Impl7459); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3756:1: rule__Or__Group_2_2__0 : rule__Or__Group_2_2__0__Impl rule__Or__Group_2_2__1 ;
    public final void rule__Or__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3760:1: ( rule__Or__Group_2_2__0__Impl rule__Or__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3761:2: rule__Or__Group_2_2__0__Impl rule__Or__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Or__Group_2_2__0__Impl_in_rule__Or__Group_2_2__07496);
            rule__Or__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_2_2__1_in_rule__Or__Group_2_2__07499);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3768:1: rule__Or__Group_2_2__0__Impl : ( ( Comma )* ) ;
    public final void rule__Or__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3772:1: ( ( ( Comma )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3773:1: ( ( Comma )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3773:1: ( ( Comma )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3774:1: ( Comma )*
            {
             before(grammarAccess.getOrAccess().getCommaKeyword_2_2_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3775:1: ( Comma )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3776:2: Comma
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_rule__Or__Group_2_2__0__Impl7528); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3787:1: rule__Or__Group_2_2__1 : rule__Or__Group_2_2__1__Impl ;
    public final void rule__Or__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3791:1: ( rule__Or__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3792:2: rule__Or__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_2_2__1__Impl_in_rule__Or__Group_2_2__17561);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3798:1: rule__Or__Group_2_2__1__Impl : ( ( rule__Or__GroupedAssignment_2_2_1 ) ) ;
    public final void rule__Or__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3802:1: ( ( ( rule__Or__GroupedAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3803:1: ( ( rule__Or__GroupedAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3803:1: ( ( rule__Or__GroupedAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3804:1: ( rule__Or__GroupedAssignment_2_2_1 )
            {
             before(grammarAccess.getOrAccess().getGroupedAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3805:1: ( rule__Or__GroupedAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3805:2: rule__Or__GroupedAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Or__GroupedAssignment_2_2_1_in_rule__Or__Group_2_2__1__Impl7588);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3819:1: rule__Xor__Group__0 : rule__Xor__Group__0__Impl rule__Xor__Group__1 ;
    public final void rule__Xor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3823:1: ( rule__Xor__Group__0__Impl rule__Xor__Group__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3824:2: rule__Xor__Group__0__Impl rule__Xor__Group__1
            {
            pushFollow(FOLLOW_rule__Xor__Group__0__Impl_in_rule__Xor__Group__07622);
            rule__Xor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group__1_in_rule__Xor__Group__07625);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3831:1: rule__Xor__Group__0__Impl : ( Xor ) ;
    public final void rule__Xor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3835:1: ( ( Xor ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3836:1: ( Xor )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3836:1: ( Xor )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3837:1: Xor
            {
             before(grammarAccess.getXorAccess().getXorKeyword_0()); 
            match(input,Xor,FOLLOW_Xor_in_rule__Xor__Group__0__Impl7653); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3850:1: rule__Xor__Group__1 : rule__Xor__Group__1__Impl rule__Xor__Group__2 ;
    public final void rule__Xor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3854:1: ( rule__Xor__Group__1__Impl rule__Xor__Group__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3855:2: rule__Xor__Group__1__Impl rule__Xor__Group__2
            {
            pushFollow(FOLLOW_rule__Xor__Group__1__Impl_in_rule__Xor__Group__17684);
            rule__Xor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group__2_in_rule__Xor__Group__17687);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3862:1: rule__Xor__Group__1__Impl : ( ( rule__Xor__NameAssignment_1 ) ) ;
    public final void rule__Xor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3866:1: ( ( ( rule__Xor__NameAssignment_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3867:1: ( ( rule__Xor__NameAssignment_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3867:1: ( ( rule__Xor__NameAssignment_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3868:1: ( rule__Xor__NameAssignment_1 )
            {
             before(grammarAccess.getXorAccess().getNameAssignment_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3869:1: ( rule__Xor__NameAssignment_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3869:2: rule__Xor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Xor__NameAssignment_1_in_rule__Xor__Group__1__Impl7714);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3879:1: rule__Xor__Group__2 : rule__Xor__Group__2__Impl ;
    public final void rule__Xor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3883:1: ( rule__Xor__Group__2__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3884:2: rule__Xor__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Xor__Group__2__Impl_in_rule__Xor__Group__27744);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3890:1: rule__Xor__Group__2__Impl : ( ( rule__Xor__Group_2__0 )? ) ;
    public final void rule__Xor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3894:1: ( ( ( rule__Xor__Group_2__0 )? ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3895:1: ( ( rule__Xor__Group_2__0 )? )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3895:1: ( ( rule__Xor__Group_2__0 )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3896:1: ( rule__Xor__Group_2__0 )?
            {
             before(grammarAccess.getXorAccess().getGroup_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3897:1: ( rule__Xor__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_BEGIN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3897:2: rule__Xor__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Xor__Group_2__0_in_rule__Xor__Group__2__Impl7771);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3913:1: rule__Xor__Group_2__0 : rule__Xor__Group_2__0__Impl rule__Xor__Group_2__1 ;
    public final void rule__Xor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3917:1: ( rule__Xor__Group_2__0__Impl rule__Xor__Group_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3918:2: rule__Xor__Group_2__0__Impl rule__Xor__Group_2__1
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__0__Impl_in_rule__Xor__Group_2__07808);
            rule__Xor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2__1_in_rule__Xor__Group_2__07811);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3925:1: rule__Xor__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Xor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3929:1: ( ( RULE_BEGIN ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3930:1: ( RULE_BEGIN )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3930:1: ( RULE_BEGIN )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3931:1: RULE_BEGIN
            {
             before(grammarAccess.getXorAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Xor__Group_2__0__Impl7838); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3942:1: rule__Xor__Group_2__1 : rule__Xor__Group_2__1__Impl rule__Xor__Group_2__2 ;
    public final void rule__Xor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3946:1: ( rule__Xor__Group_2__1__Impl rule__Xor__Group_2__2 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3947:2: rule__Xor__Group_2__1__Impl rule__Xor__Group_2__2
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__1__Impl_in_rule__Xor__Group_2__17867);
            rule__Xor__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2__2_in_rule__Xor__Group_2__17870);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3954:1: rule__Xor__Group_2__1__Impl : ( ( rule__Xor__GroupedAssignment_2_1 ) ) ;
    public final void rule__Xor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3958:1: ( ( ( rule__Xor__GroupedAssignment_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3959:1: ( ( rule__Xor__GroupedAssignment_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3959:1: ( ( rule__Xor__GroupedAssignment_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3960:1: ( rule__Xor__GroupedAssignment_2_1 )
            {
             before(grammarAccess.getXorAccess().getGroupedAssignment_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3961:1: ( rule__Xor__GroupedAssignment_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3961:2: rule__Xor__GroupedAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Xor__GroupedAssignment_2_1_in_rule__Xor__Group_2__1__Impl7897);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3971:1: rule__Xor__Group_2__2 : rule__Xor__Group_2__2__Impl rule__Xor__Group_2__3 ;
    public final void rule__Xor__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3975:1: ( rule__Xor__Group_2__2__Impl rule__Xor__Group_2__3 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3976:2: rule__Xor__Group_2__2__Impl rule__Xor__Group_2__3
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__2__Impl_in_rule__Xor__Group_2__27927);
            rule__Xor__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2__3_in_rule__Xor__Group_2__27930);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3983:1: rule__Xor__Group_2__2__Impl : ( ( rule__Xor__Group_2_2__0 )* ) ;
    public final void rule__Xor__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3987:1: ( ( ( rule__Xor__Group_2_2__0 )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3988:1: ( ( rule__Xor__Group_2_2__0 )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3988:1: ( ( rule__Xor__Group_2_2__0 )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3989:1: ( rule__Xor__Group_2_2__0 )*
            {
             before(grammarAccess.getXorAccess().getGroup_2_2()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3990:1: ( rule__Xor__Group_2_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma||LA34_0==RULE_NULL||LA34_0==RULE_ID||LA34_0==RULE_STRING) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:3990:2: rule__Xor__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Xor__Group_2_2__0_in_rule__Xor__Group_2__2__Impl7957);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4000:1: rule__Xor__Group_2__3 : rule__Xor__Group_2__3__Impl ;
    public final void rule__Xor__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4004:1: ( rule__Xor__Group_2__3__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4005:2: rule__Xor__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Xor__Group_2__3__Impl_in_rule__Xor__Group_2__37988);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4011:1: rule__Xor__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Xor__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4015:1: ( ( RULE_END ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4016:1: ( RULE_END )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4016:1: ( RULE_END )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4017:1: RULE_END
            {
             before(grammarAccess.getXorAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Xor__Group_2__3__Impl8015); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4036:1: rule__Xor__Group_2_2__0 : rule__Xor__Group_2_2__0__Impl rule__Xor__Group_2_2__1 ;
    public final void rule__Xor__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4040:1: ( rule__Xor__Group_2_2__0__Impl rule__Xor__Group_2_2__1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4041:2: rule__Xor__Group_2_2__0__Impl rule__Xor__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Xor__Group_2_2__0__Impl_in_rule__Xor__Group_2_2__08052);
            rule__Xor__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xor__Group_2_2__1_in_rule__Xor__Group_2_2__08055);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4048:1: rule__Xor__Group_2_2__0__Impl : ( ( Comma )* ) ;
    public final void rule__Xor__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4052:1: ( ( ( Comma )* ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4053:1: ( ( Comma )* )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4053:1: ( ( Comma )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4054:1: ( Comma )*
            {
             before(grammarAccess.getXorAccess().getCommaKeyword_2_2_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4055:1: ( Comma )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Comma) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4056:2: Comma
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_rule__Xor__Group_2_2__0__Impl8084); 

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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4067:1: rule__Xor__Group_2_2__1 : rule__Xor__Group_2_2__1__Impl ;
    public final void rule__Xor__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4071:1: ( rule__Xor__Group_2_2__1__Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4072:2: rule__Xor__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Xor__Group_2_2__1__Impl_in_rule__Xor__Group_2_2__18117);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4078:1: rule__Xor__Group_2_2__1__Impl : ( ( rule__Xor__GroupedAssignment_2_2_1 ) ) ;
    public final void rule__Xor__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4082:1: ( ( ( rule__Xor__GroupedAssignment_2_2_1 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4083:1: ( ( rule__Xor__GroupedAssignment_2_2_1 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4083:1: ( ( rule__Xor__GroupedAssignment_2_2_1 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4084:1: ( rule__Xor__GroupedAssignment_2_2_1 )
            {
             before(grammarAccess.getXorAccess().getGroupedAssignment_2_2_1()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4085:1: ( rule__Xor__GroupedAssignment_2_2_1 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4085:2: rule__Xor__GroupedAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Xor__GroupedAssignment_2_2_1_in_rule__Xor__Group_2_2__1__Impl8144);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4100:1: rule__Model__RootAssignment : ( ruleFeature_Impl ) ;
    public final void rule__Model__RootAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4104:1: ( ( ruleFeature_Impl ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4105:1: ( ruleFeature_Impl )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4105:1: ( ruleFeature_Impl )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4106:1: ruleFeature_Impl
            {
             before(grammarAccess.getModelAccess().getRootFeature_ImplParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFeature_Impl_in_rule__Model__RootAssignment8183);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4115:1: rule__Constrain__OperatorAssignment_1_1 : ( ( VerticalLineVerticalLine ) ) ;
    public final void rule__Constrain__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4119:1: ( ( ( VerticalLineVerticalLine ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4120:1: ( ( VerticalLineVerticalLine ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4120:1: ( ( VerticalLineVerticalLine ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4121:1: ( VerticalLineVerticalLine )
            {
             before(grammarAccess.getConstrainAccess().getOperatorVerticalLineVerticalLineKeyword_1_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4122:1: ( VerticalLineVerticalLine )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4123:1: VerticalLineVerticalLine
            {
             before(grammarAccess.getConstrainAccess().getOperatorVerticalLineVerticalLineKeyword_1_1_0()); 
            match(input,VerticalLineVerticalLine,FOLLOW_VerticalLineVerticalLine_in_rule__Constrain__OperatorAssignment_1_18219); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4138:1: rule__Constrain__RightExpAssignment_1_2 : ( ruleConjunction ) ;
    public final void rule__Constrain__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4142:1: ( ( ruleConjunction ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4143:1: ( ruleConjunction )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4143:1: ( ruleConjunction )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4144:1: ruleConjunction
            {
             before(grammarAccess.getConstrainAccess().getRightExpConjunctionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Constrain__RightExpAssignment_1_28258);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4153:1: rule__Conjunction__OperatorAssignment_1_1 : ( ( AmpersandAmpersand ) ) ;
    public final void rule__Conjunction__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4157:1: ( ( ( AmpersandAmpersand ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4158:1: ( ( AmpersandAmpersand ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4158:1: ( ( AmpersandAmpersand ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4159:1: ( AmpersandAmpersand )
            {
             before(grammarAccess.getConjunctionAccess().getOperatorAmpersandAmpersandKeyword_1_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4160:1: ( AmpersandAmpersand )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4161:1: AmpersandAmpersand
            {
             before(grammarAccess.getConjunctionAccess().getOperatorAmpersandAmpersandKeyword_1_1_0()); 
            match(input,AmpersandAmpersand,FOLLOW_AmpersandAmpersand_in_rule__Conjunction__OperatorAssignment_1_18294); 
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4176:1: rule__Conjunction__RightExpAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Conjunction__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4180:1: ( ( ruleComparison ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4181:1: ( ruleComparison )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4181:1: ( ruleComparison )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4182:1: ruleComparison
            {
             before(grammarAccess.getConjunctionAccess().getRightExpComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Conjunction__RightExpAssignment_1_28333);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4191:1: rule__Comparison__OperatorAssignment_1_1 : ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4195:1: ( ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4196:1: ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4196:1: ( ( rule__Comparison__OperatorAlternatives_1_1_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4197:1: ( rule__Comparison__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAlternatives_1_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4198:1: ( rule__Comparison__OperatorAlternatives_1_1_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4198:2: rule__Comparison__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__OperatorAlternatives_1_1_0_in_rule__Comparison__OperatorAssignment_1_18364);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4207:1: rule__Comparison__RightExpAssignment_1_2 : ( ruleBinary ) ;
    public final void rule__Comparison__RightExpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4211:1: ( ( ruleBinary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4212:1: ( ruleBinary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4212:1: ( ruleBinary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4213:1: ruleBinary
            {
             before(grammarAccess.getComparisonAccess().getRightExpBinaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleBinary_in_rule__Comparison__RightExpAssignment_1_28397);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4222:1: rule__Binary__RightExpAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Binary__RightExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4226:1: ( ( rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4227:1: ( rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4227:1: ( rulePrimary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4228:1: rulePrimary
            {
             before(grammarAccess.getBinaryAccess().getRightExpPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Binary__RightExpAssignment_1_18428);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4237:1: rule__Primary__ConstrainFeaturesAssignment_0_0 : ( ( ruleEString ) ) ;
    public final void rule__Primary__ConstrainFeaturesAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4241:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4242:1: ( ( ruleEString ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4242:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4243:1: ( ruleEString )
            {
             before(grammarAccess.getPrimaryAccess().getConstrainFeaturesSolitaryCrossReference_0_0_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4244:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4245:1: ruleEString
            {
             before(grammarAccess.getPrimaryAccess().getConstrainFeaturesSolitaryEStringParserRuleCall_0_0_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Primary__ConstrainFeaturesAssignment_0_08463);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4256:1: rule__Primary__GroupsAssignment_0_2 : ( ( ruleEString ) ) ;
    public final void rule__Primary__GroupsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4260:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4261:1: ( ( ruleEString ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4261:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4262:1: ( ruleEString )
            {
             before(grammarAccess.getPrimaryAccess().getGroupsGroupCrossReference_0_2_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4263:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4264:1: ruleEString
            {
             before(grammarAccess.getPrimaryAccess().getGroupsGroupEStringParserRuleCall_0_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Primary__GroupsAssignment_0_28502);
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


    // $ANTLR start "rule__Primary__ConstrainFeaturesAssignment_0_3_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4275:1: rule__Primary__ConstrainFeaturesAssignment_0_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Primary__ConstrainFeaturesAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4279:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4280:1: ( ( ruleEString ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4280:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4281:1: ( ruleEString )
            {
             before(grammarAccess.getPrimaryAccess().getConstrainFeaturesFeatureCrossReference_0_3_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4282:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4283:1: ruleEString
            {
             before(grammarAccess.getPrimaryAccess().getConstrainFeaturesFeatureEStringParserRuleCall_0_3_1_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Primary__ConstrainFeaturesAssignment_0_3_18541);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getConstrainFeaturesFeatureEStringParserRuleCall_0_3_1_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getConstrainFeaturesFeatureCrossReference_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ConstrainFeaturesAssignment_0_3_1"


    // $ANTLR start "rule__Unary__OperatorAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4294:1: rule__Unary__OperatorAssignment_1 : ( ( rule__Unary__OperatorAlternatives_1_0 ) ) ;
    public final void rule__Unary__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4298:1: ( ( ( rule__Unary__OperatorAlternatives_1_0 ) ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4299:1: ( ( rule__Unary__OperatorAlternatives_1_0 ) )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4299:1: ( ( rule__Unary__OperatorAlternatives_1_0 ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4300:1: ( rule__Unary__OperatorAlternatives_1_0 )
            {
             before(grammarAccess.getUnaryAccess().getOperatorAlternatives_1_0()); 
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4301:1: ( rule__Unary__OperatorAlternatives_1_0 )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4301:2: rule__Unary__OperatorAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Unary__OperatorAlternatives_1_0_in_rule__Unary__OperatorAssignment_18576);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4310:1: rule__Unary__ExpAssignment_2 : ( rulePrimary ) ;
    public final void rule__Unary__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4314:1: ( ( rulePrimary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4315:1: ( rulePrimary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4315:1: ( rulePrimary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4316:1: rulePrimary
            {
             before(grammarAccess.getUnaryAccess().getExpPrimaryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Unary__ExpAssignment_28609);
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


    // $ANTLR start "rule__Feature_Impl__NameAssignment_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4325:1: rule__Feature_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Feature_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4329:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4330:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4330:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4331:1: ruleEString
            {
             before(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Feature_Impl__NameAssignment_18640);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4340:1: rule__Feature_Impl__SubfeatureAssignment_2_1 : ( ruleSolitary ) ;
    public final void rule__Feature_Impl__SubfeatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4344:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4345:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4345:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4346:1: ruleSolitary
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_18671);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4355:1: rule__Feature_Impl__SubfeatureAssignment_2_2 : ( ruleSolitary ) ;
    public final void rule__Feature_Impl__SubfeatureAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4359:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4360:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4360:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4361:1: ruleSolitary
            {
             before(grammarAccess.getFeature_ImplAccess().getSubfeatureSolitaryParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_28702);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4370:1: rule__Feature_Impl__ConstrainsAssignment_3_1 : ( ruleConstrain ) ;
    public final void rule__Feature_Impl__ConstrainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4374:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4375:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4375:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4376:1: ruleConstrain
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_18733);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4385:1: rule__Feature_Impl__ConstrainsAssignment_3_2_1 : ( ruleConstrain ) ;
    public final void rule__Feature_Impl__ConstrainsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4389:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4390:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4390:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4391:1: ruleConstrain
            {
             before(grammarAccess.getFeature_ImplAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_2_18764);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4400:1: rule__Grouped__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Grouped__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4404:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4405:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4405:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4406:1: ruleEString
            {
             before(grammarAccess.getGroupedAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Grouped__NameAssignment_08795);
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


    // $ANTLR start "rule__Grouped__ConstrainsAssignment_1_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4415:1: rule__Grouped__ConstrainsAssignment_1_1 : ( ruleConstrain ) ;
    public final void rule__Grouped__ConstrainsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4419:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4420:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4420:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4421:1: ruleConstrain
            {
             before(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_1_18826);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__ConstrainsAssignment_1_1"


    // $ANTLR start "rule__Grouped__ConstrainsAssignment_1_2_1"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4430:1: rule__Grouped__ConstrainsAssignment_1_2_1 : ( ruleConstrain ) ;
    public final void rule__Grouped__ConstrainsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4434:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4435:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4435:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4436:1: ruleConstrain
            {
             before(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_1_2_18857);
            ruleConstrain();

            state._fsp--;

             after(grammarAccess.getGroupedAccess().getConstrainsConstrainParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouped__ConstrainsAssignment_1_2_1"


    // $ANTLR start "rule__Mandatory__NameAssignment_0"
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4445:1: rule__Mandatory__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Mandatory__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4449:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4450:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4450:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4451:1: ruleEString
            {
             before(grammarAccess.getMandatoryAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Mandatory__NameAssignment_08888);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4460:1: rule__Mandatory__SubfeatureAssignment_1_1 : ( ruleSolitary ) ;
    public final void rule__Mandatory__SubfeatureAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4464:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4465:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4465:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4466:1: ruleSolitary
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_18919);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4475:1: rule__Mandatory__SubfeatureAssignment_1_2_1 : ( ruleSolitary ) ;
    public final void rule__Mandatory__SubfeatureAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4479:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4480:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4480:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4481:1: ruleSolitary
            {
             before(grammarAccess.getMandatoryAccess().getSubfeatureSolitaryParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_2_18950);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4490:1: rule__Mandatory__ConstrainsAssignment_2_1 : ( ruleConstrain ) ;
    public final void rule__Mandatory__ConstrainsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4494:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4495:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4495:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4496:1: ruleConstrain
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_2_18981);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4505:1: rule__Mandatory__ConstrainsAssignment_2_2_1 : ( ruleConstrain ) ;
    public final void rule__Mandatory__ConstrainsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4509:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4510:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4510:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4511:1: ruleConstrain
            {
             before(grammarAccess.getMandatoryAccess().getConstrainsConstrainParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_2_2_19012);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4520:1: rule__Mandatory__GroupsAssignment_3_0 : ( ruleGroup ) ;
    public final void rule__Mandatory__GroupsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4524:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4525:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4525:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4526:1: ruleGroup
            {
             before(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_3_09043);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4535:1: rule__Mandatory__GroupsAssignment_3_1 : ( ruleGroup ) ;
    public final void rule__Mandatory__GroupsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4539:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4540:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4540:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4541:1: ruleGroup
            {
             before(grammarAccess.getMandatoryAccess().getGroupsGroupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_3_19074);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4550:1: rule__Optional__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Optional__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4554:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4555:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4555:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4556:1: ruleEString
            {
             before(grammarAccess.getOptionalAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Optional__NameAssignment_19105);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4565:1: rule__Optional__SubfeatureAssignment_2_1 : ( ruleSolitary ) ;
    public final void rule__Optional__SubfeatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4569:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4570:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4570:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4571:1: ruleSolitary
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_19136);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4580:1: rule__Optional__SubfeatureAssignment_2_2_1 : ( ruleSolitary ) ;
    public final void rule__Optional__SubfeatureAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4584:1: ( ( ruleSolitary ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4585:1: ( ruleSolitary )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4585:1: ( ruleSolitary )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4586:1: ruleSolitary
            {
             before(grammarAccess.getOptionalAccess().getSubfeatureSolitaryParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_2_19167);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4595:1: rule__Optional__ConstrainsAssignment_3_1 : ( ruleConstrain ) ;
    public final void rule__Optional__ConstrainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4599:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4600:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4600:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4601:1: ruleConstrain
            {
             before(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_3_19198);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4610:1: rule__Optional__ConstrainsAssignment_3_2_1 : ( ruleConstrain ) ;
    public final void rule__Optional__ConstrainsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4614:1: ( ( ruleConstrain ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4615:1: ( ruleConstrain )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4615:1: ( ruleConstrain )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4616:1: ruleConstrain
            {
             before(grammarAccess.getOptionalAccess().getConstrainsConstrainParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_3_2_19229);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4625:1: rule__Optional__GroupsAssignment_4_0 : ( ruleGroup ) ;
    public final void rule__Optional__GroupsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4629:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4630:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4630:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4631:1: ruleGroup
            {
             before(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_4_09260);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4640:1: rule__Optional__GroupsAssignment_4_1 : ( ruleGroup ) ;
    public final void rule__Optional__GroupsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4644:1: ( ( ruleGroup ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4645:1: ( ruleGroup )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4645:1: ( ruleGroup )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4646:1: ruleGroup
            {
             before(grammarAccess.getOptionalAccess().getGroupsGroupParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_4_19291);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4655:1: rule__Or__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Or__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4659:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4660:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4660:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4661:1: ruleEString
            {
             before(grammarAccess.getOrAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Or__NameAssignment_19322);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4670:1: rule__Or__GroupedAssignment_2_1 : ( ruleGrouped ) ;
    public final void rule__Or__GroupedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4674:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4675:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4675:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4676:1: ruleGrouped
            {
             before(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_19353);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4685:1: rule__Or__GroupedAssignment_2_2_1 : ( ruleGrouped ) ;
    public final void rule__Or__GroupedAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4689:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4690:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4690:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4691:1: ruleGrouped
            {
             before(grammarAccess.getOrAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_2_19384);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4700:1: rule__Xor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Xor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4704:1: ( ( ruleEString ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4705:1: ( ruleEString )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4705:1: ( ruleEString )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4706:1: ruleEString
            {
             before(grammarAccess.getXorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Xor__NameAssignment_19415);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4715:1: rule__Xor__GroupedAssignment_2_1 : ( ruleGrouped ) ;
    public final void rule__Xor__GroupedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4719:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4720:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4720:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4721:1: ruleGrouped
            {
             before(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_19446);
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
    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4730:1: rule__Xor__GroupedAssignment_2_2_1 : ( ruleGrouped ) ;
    public final void rule__Xor__GroupedAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4734:1: ( ( ruleGrouped ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4735:1: ( ruleGrouped )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4735:1: ( ruleGrouped )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/internal/InternalConfParser.g:4736:1: ruleGrouped
            {
             before(grammarAccess.getXorAccess().getGroupedGroupedParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_2_19477);
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
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature_Impl703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__0_in_ruleFeature_Impl733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_entryRuleGrouped760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouped767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__0_in_ruleGrouped797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0_in_ruleOptional925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_entryRuleXor1016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXor1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__0_in_ruleXor1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__Solitary__Alternatives1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__Solitary__Alternatives1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSignEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMarkEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSignEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSign_in_rule__Comparison__OperatorAlternatives_1_1_01200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSignEqualsSign_in_rule__Comparison__OperatorAlternatives_1_1_01220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSign_in_rule__Comparison__OperatorAlternatives_1_1_01240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_rule__Primary__Alternatives1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__0_in_rule__Primary__Alternatives1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMark_in_rule__Unary__OperatorAlternatives_1_01343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HyphenMinus_in_rule__Unary__OperatorAlternatives_1_01363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__Group__Alternatives1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXor_in_rule__Group__Alternatives1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__EString__Alternatives1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group__0__Impl_in_rule__Constrain__Group__01510 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Constrain__Group__1_in_rule__Constrain__Group__01513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Constrain__Group__0__Impl1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group__1__Impl_in_rule__Constrain__Group__11569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__0_in_rule__Constrain__Group__1__Impl1596 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__0__Impl_in_rule__Constrain__Group_1__01631 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__1_in_rule__Constrain__Group_1__01634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__1__Impl_in_rule__Constrain__Group_1__11692 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__2_in_rule__Constrain__Group_1__11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__OperatorAssignment_1_1_in_rule__Constrain__Group_1__1__Impl1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__Group_1__2__Impl_in_rule__Constrain__Group_1__21752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constrain__RightExpAssignment_1_2_in_rule__Constrain__Group_1__2__Impl1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__01815 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__01818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Conjunction__Group__0__Impl1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__11874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl1901 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__01936 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__01939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__11997 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__12000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__OperatorAssignment_1_1_in_rule__Conjunction__Group_1__1__Impl2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__22057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RightExpAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__02120 = new BitSet(new long[]{0x0000000000180740L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__02123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_rule__Comparison__Group__0__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__12179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl2206 = new BitSet(new long[]{0x0000000000180742L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__02241 = new BitSet(new long[]{0x0000000000180740L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__02244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__12302 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__12305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OperatorAssignment_1_1_in_rule__Comparison__Group_1__1__Impl2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__22362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightExpAssignment_1_2_in_rule__Comparison__Group_1__2__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group__0__Impl_in_rule__Binary__Group__02425 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Binary__Group__1_in_rule__Binary__Group__02428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Binary__Group__0__Impl2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group__1__Impl_in_rule__Binary__Group__12484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__0_in_rule__Binary__Group__1__Impl2511 = new BitSet(new long[]{0x00000000A4026002L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__0__Impl_in_rule__Binary__Group_1__02546 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__1_in_rule__Binary__Group_1__02549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__Group_1__1__Impl_in_rule__Binary__Group_1__12607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary__RightExpAssignment_1_1_in_rule__Binary__Group_1__1__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__02668 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__02671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ConstrainFeaturesAssignment_0_0_in_rule__Primary__Group_0__0__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__12728 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__12731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_rule__Primary__Group_0__1__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__22790 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__3_in_rule__Primary__Group_0__22793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__GroupsAssignment_0_2_in_rule__Primary__Group_0__2__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__3__Impl_in_rule__Primary__Group_0__32850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0_3__0_in_rule__Primary__Group_0__3__Impl2877 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0_3__0__Impl_in_rule__Primary__Group_0_3__02916 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0_3__1_in_rule__Primary__Group_0_3__02919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_rule__Primary__Group_0_3__0__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0_3__1__Impl_in_rule__Primary__Group_0_3__12978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ConstrainFeaturesAssignment_0_3_1_in_rule__Primary__Group_0_3__1__Impl3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__0__Impl_in_rule__Primary__Group_2__03039 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__1_in_rule__Primary__Group_2__03042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rule__Primary__Group_2__0__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__1__Impl_in_rule__Primary__Group_2__13101 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__2_in_rule__Primary__Group_2__13104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Primary__Group_2__1__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_2__2__Impl_in_rule__Primary__Group_2__23160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightParenthesis_in_rule__Primary__Group_2__2__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__03225 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__03228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__13286 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Unary__Group__2_in_rule__Unary__Group__13289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__OperatorAssignment_1_in_rule__Unary__Group__1__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__2__Impl_in_rule__Unary__Group__23346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__ExpAssignment_2_in_rule__Unary__Group__2__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__0__Impl_in_rule__Feature_Impl__Group__03409 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__1_in_rule__Feature_Impl__Group__03412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Feature_in_rule__Feature_Impl__Group__0__Impl3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__1__Impl_in_rule__Feature_Impl__Group__13471 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__2_in_rule__Feature_Impl__Group__13474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__NameAssignment_1_in_rule__Feature_Impl__Group__1__Impl3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__2__Impl_in_rule__Feature_Impl__Group__23531 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__3_in_rule__Feature_Impl__Group__23534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__0_in_rule__Feature_Impl__Group__2__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group__3__Impl_in_rule__Feature_Impl__Group__33592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__0_in_rule__Feature_Impl__Group__3__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__0__Impl_in_rule__Feature_Impl__Group_2__03658 = new BitSet(new long[]{0x00000000A4200000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__1_in_rule__Feature_Impl__Group_2__03661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Feature_Impl__Group_2__0__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__1__Impl_in_rule__Feature_Impl__Group_2__13717 = new BitSet(new long[]{0x00000000B4200000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__2_in_rule__Feature_Impl__Group_2__13720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_1_in_rule__Feature_Impl__Group_2__1__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__2__Impl_in_rule__Feature_Impl__Group_2__23777 = new BitSet(new long[]{0x00000000B4200000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__3_in_rule__Feature_Impl__Group_2__23780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__SubfeatureAssignment_2_2_in_rule__Feature_Impl__Group_2__2__Impl3807 = new BitSet(new long[]{0x00000000A4200002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_2__3__Impl_in_rule__Feature_Impl__Group_2__33838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Feature_Impl__Group_2__3__Impl3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__0__Impl_in_rule__Feature_Impl__Group_3__03902 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__1_in_rule__Feature_Impl__Group_3__03905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Feature_Impl__Group_3__0__Impl3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__1__Impl_in_rule__Feature_Impl__Group_3__13964 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__2_in_rule__Feature_Impl__Group_3__13967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_1_in_rule__Feature_Impl__Group_3__1__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__2__Impl_in_rule__Feature_Impl__Group_3__24024 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__3_in_rule__Feature_Impl__Group_3__24027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__0_in_rule__Feature_Impl__Group_3__2__Impl4054 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3__3__Impl_in_rule__Feature_Impl__Group_3__34085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Feature_Impl__Group_3__3__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__0__Impl_in_rule__Feature_Impl__Group_3_2__04152 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__1_in_rule__Feature_Impl__Group_3_2__04155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Feature_Impl__Group_3_2__0__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__Group_3_2__1__Impl_in_rule__Feature_Impl__Group_3_2__14214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature_Impl__ConstrainsAssignment_3_2_1_in_rule__Feature_Impl__Group_3_2__1__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__0__Impl_in_rule__Grouped__Group__04275 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Grouped__Group__1_in_rule__Grouped__Group__04278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__NameAssignment_0_in_rule__Grouped__Group__0__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group__1__Impl_in_rule__Grouped__Group__14335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__0_in_rule__Grouped__Group__1__Impl4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__0__Impl_in_rule__Grouped__Group_1__04397 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__1_in_rule__Grouped__Group_1__04400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Grouped__Group_1__0__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__1__Impl_in_rule__Grouped__Group_1__14459 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__2_in_rule__Grouped__Group_1__14462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__ConstrainsAssignment_1_1_in_rule__Grouped__Group_1__1__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__2__Impl_in_rule__Grouped__Group_1__24519 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__3_in_rule__Grouped__Group_1__24522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1_2__0_in_rule__Grouped__Group_1__2__Impl4549 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1__3__Impl_in_rule__Grouped__Group_1__34580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Grouped__Group_1__3__Impl4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1_2__0__Impl_in_rule__Grouped__Group_1_2__04647 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1_2__1_in_rule__Grouped__Group_1_2__04650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Grouped__Group_1_2__0__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__Group_1_2__1__Impl_in_rule__Grouped__Group_1_2__14709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouped__ConstrainsAssignment_1_2_1_in_rule__Grouped__Group_1_2__1__Impl4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__04770 = new BitSet(new long[]{0x0000000001400820L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__04773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__NameAssignment_0_in_rule__Mandatory__Group__0__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__14830 = new BitSet(new long[]{0x0000000001400820L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__2_in_rule__Mandatory__Group__14833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__0_in_rule__Mandatory__Group__1__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__2__Impl_in_rule__Mandatory__Group__24891 = new BitSet(new long[]{0x0000000001400820L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__3_in_rule__Mandatory__Group__24894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__0_in_rule__Mandatory__Group__2__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__3__Impl_in_rule__Mandatory__Group__34952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__0_in_rule__Mandatory__Group__3__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__0__Impl_in_rule__Mandatory__Group_1__05018 = new BitSet(new long[]{0x00000000A4200000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__1_in_rule__Mandatory__Group_1__05021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__Mandatory__Group_1__0__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__1__Impl_in_rule__Mandatory__Group_1__15080 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__2_in_rule__Mandatory__Group_1__15083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__SubfeatureAssignment_1_1_in_rule__Mandatory__Group_1__1__Impl5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__2__Impl_in_rule__Mandatory__Group_1__25140 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__3_in_rule__Mandatory__Group_1__25143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__0_in_rule__Mandatory__Group_1__2__Impl5170 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1__3__Impl_in_rule__Mandatory__Group_1__35201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__Mandatory__Group_1__3__Impl5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__0__Impl_in_rule__Mandatory__Group_1_2__05268 = new BitSet(new long[]{0x00000000A4200000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__1_in_rule__Mandatory__Group_1_2__05271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Mandatory__Group_1_2__0__Impl5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_1_2__1__Impl_in_rule__Mandatory__Group_1_2__15330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__SubfeatureAssignment_1_2_1_in_rule__Mandatory__Group_1_2__1__Impl5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__0__Impl_in_rule__Mandatory__Group_2__05391 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__1_in_rule__Mandatory__Group_2__05394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Mandatory__Group_2__0__Impl5422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__1__Impl_in_rule__Mandatory__Group_2__15453 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__2_in_rule__Mandatory__Group_2__15456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__ConstrainsAssignment_2_1_in_rule__Mandatory__Group_2__1__Impl5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__2__Impl_in_rule__Mandatory__Group_2__25513 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__3_in_rule__Mandatory__Group_2__25516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2_2__0_in_rule__Mandatory__Group_2__2__Impl5543 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2__3__Impl_in_rule__Mandatory__Group_2__35574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Mandatory__Group_2__3__Impl5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2_2__0__Impl_in_rule__Mandatory__Group_2_2__05641 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2_2__1_in_rule__Mandatory__Group_2_2__05644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Mandatory__Group_2_2__0__Impl5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_2_2__1__Impl_in_rule__Mandatory__Group_2_2__15703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__ConstrainsAssignment_2_2_1_in_rule__Mandatory__Group_2_2__1__Impl5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__0__Impl_in_rule__Mandatory__Group_3__05764 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__1_in_rule__Mandatory__Group_3__05767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__GroupsAssignment_3_0_in_rule__Mandatory__Group_3__0__Impl5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group_3__1__Impl_in_rule__Mandatory__Group_3__15824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__GroupsAssignment_3_1_in_rule__Mandatory__Group_3__1__Impl5851 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__05886 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__05889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuestionMark_in_rule__Optional__Group__0__Impl5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__15948 = new BitSet(new long[]{0x0000000001400820L});
    public static final BitSet FOLLOW_rule__Optional__Group__2_in_rule__Optional__Group__15951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__NameAssignment_1_in_rule__Optional__Group__1__Impl5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__2__Impl_in_rule__Optional__Group__26008 = new BitSet(new long[]{0x0000000001400820L});
    public static final BitSet FOLLOW_rule__Optional__Group__3_in_rule__Optional__Group__26011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__0_in_rule__Optional__Group__2__Impl6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__3__Impl_in_rule__Optional__Group__36069 = new BitSet(new long[]{0x0000000001400820L});
    public static final BitSet FOLLOW_rule__Optional__Group__4_in_rule__Optional__Group__36072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__0_in_rule__Optional__Group__3__Impl6099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__4__Impl_in_rule__Optional__Group__46130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__0_in_rule__Optional__Group__4__Impl6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__0__Impl_in_rule__Optional__Group_2__06198 = new BitSet(new long[]{0x00000000A4200000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__1_in_rule__Optional__Group_2__06201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__Optional__Group_2__0__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__1__Impl_in_rule__Optional__Group_2__16260 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__2_in_rule__Optional__Group_2__16263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__SubfeatureAssignment_2_1_in_rule__Optional__Group_2__1__Impl6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__2__Impl_in_rule__Optional__Group_2__26320 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__3_in_rule__Optional__Group_2__26323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__0_in_rule__Optional__Group_2__2__Impl6350 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2__3__Impl_in_rule__Optional__Group_2__36381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__Optional__Group_2__3__Impl6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__0__Impl_in_rule__Optional__Group_2_2__06448 = new BitSet(new long[]{0x00000000A4200000L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__1_in_rule__Optional__Group_2_2__06451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Optional__Group_2_2__0__Impl6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_2_2__1__Impl_in_rule__Optional__Group_2_2__16510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__SubfeatureAssignment_2_2_1_in_rule__Optional__Group_2_2__1__Impl6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__0__Impl_in_rule__Optional__Group_3__06571 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__1_in_rule__Optional__Group_3__06574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__Optional__Group_3__0__Impl6602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__1__Impl_in_rule__Optional__Group_3__16633 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__2_in_rule__Optional__Group_3__16636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ConstrainsAssignment_3_1_in_rule__Optional__Group_3__1__Impl6663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__2__Impl_in_rule__Optional__Group_3__26693 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__3_in_rule__Optional__Group_3__26696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3_2__0_in_rule__Optional__Group_3__2__Impl6723 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3__3__Impl_in_rule__Optional__Group_3__36754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__Optional__Group_3__3__Impl6782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3_2__0__Impl_in_rule__Optional__Group_3_2__06821 = new BitSet(new long[]{0x00000000A4026000L});
    public static final BitSet FOLLOW_rule__Optional__Group_3_2__1_in_rule__Optional__Group_3_2__06824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Optional__Group_3_2__0__Impl6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_3_2__1__Impl_in_rule__Optional__Group_3_2__16883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ConstrainsAssignment_3_2_1_in_rule__Optional__Group_3_2__1__Impl6910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__0__Impl_in_rule__Optional__Group_4__06944 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__1_in_rule__Optional__Group_4__06947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__GroupsAssignment_4_0_in_rule__Optional__Group_4__0__Impl6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_4__1__Impl_in_rule__Optional__Group_4__17004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__GroupsAssignment_4_1_in_rule__Optional__Group_4__1__Impl7031 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07066 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_rule__Or__Group__0__Impl7097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17128 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Or__Group__2_in_rule__Or__Group__17131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__NameAssignment_1_in_rule__Or__Group__1__Impl7158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__27188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__0_in_rule__Or__Group__2__Impl7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__0__Impl_in_rule__Or__Group_2__07252 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_rule__Or__Group_2__1_in_rule__Or__Group_2__07255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Or__Group_2__0__Impl7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__1__Impl_in_rule__Or__Group_2__17311 = new BitSet(new long[]{0x00000000B4010000L});
    public static final BitSet FOLLOW_rule__Or__Group_2__2_in_rule__Or__Group_2__17314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__GroupedAssignment_2_1_in_rule__Or__Group_2__1__Impl7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__2__Impl_in_rule__Or__Group_2__27371 = new BitSet(new long[]{0x00000000B4010000L});
    public static final BitSet FOLLOW_rule__Or__Group_2__3_in_rule__Or__Group_2__27374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__0_in_rule__Or__Group_2__2__Impl7401 = new BitSet(new long[]{0x00000000A4010002L});
    public static final BitSet FOLLOW_rule__Or__Group_2__3__Impl_in_rule__Or__Group_2__37432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Or__Group_2__3__Impl7459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__0__Impl_in_rule__Or__Group_2_2__07496 = new BitSet(new long[]{0x00000000A4010000L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__1_in_rule__Or__Group_2_2__07499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Or__Group_2_2__0__Impl7528 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Or__Group_2_2__1__Impl_in_rule__Or__Group_2_2__17561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__GroupedAssignment_2_2_1_in_rule__Or__Group_2_2__1__Impl7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__0__Impl_in_rule__Xor__Group__07622 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_rule__Xor__Group__1_in_rule__Xor__Group__07625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_rule__Xor__Group__0__Impl7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__1__Impl_in_rule__Xor__Group__17684 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Xor__Group__2_in_rule__Xor__Group__17687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__NameAssignment_1_in_rule__Xor__Group__1__Impl7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group__2__Impl_in_rule__Xor__Group__27744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__0_in_rule__Xor__Group__2__Impl7771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__0__Impl_in_rule__Xor__Group_2__07808 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__1_in_rule__Xor__Group_2__07811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Xor__Group_2__0__Impl7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__1__Impl_in_rule__Xor__Group_2__17867 = new BitSet(new long[]{0x00000000B4010000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__2_in_rule__Xor__Group_2__17870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__GroupedAssignment_2_1_in_rule__Xor__Group_2__1__Impl7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__2__Impl_in_rule__Xor__Group_2__27927 = new BitSet(new long[]{0x00000000B4010000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__3_in_rule__Xor__Group_2__27930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__0_in_rule__Xor__Group_2__2__Impl7957 = new BitSet(new long[]{0x00000000A4010002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2__3__Impl_in_rule__Xor__Group_2__37988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Xor__Group_2__3__Impl8015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__0__Impl_in_rule__Xor__Group_2_2__08052 = new BitSet(new long[]{0x00000000A4010000L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__1_in_rule__Xor__Group_2_2__08055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Xor__Group_2_2__0__Impl8084 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Xor__Group_2_2__1__Impl_in_rule__Xor__Group_2_2__18117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xor__GroupedAssignment_2_2_1_in_rule__Xor__Group_2_2__1__Impl8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_Impl_in_rule__Model__RootAssignment8183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VerticalLineVerticalLine_in_rule__Constrain__OperatorAssignment_1_18219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Constrain__RightExpAssignment_1_28258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AmpersandAmpersand_in_rule__Conjunction__OperatorAssignment_1_18294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Conjunction__RightExpAssignment_1_28333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OperatorAlternatives_1_1_0_in_rule__Comparison__OperatorAssignment_1_18364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_in_rule__Comparison__RightExpAssignment_1_28397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Binary__RightExpAssignment_1_18428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Primary__ConstrainFeaturesAssignment_0_08463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Primary__GroupsAssignment_0_28502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Primary__ConstrainFeaturesAssignment_0_3_18541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__OperatorAlternatives_1_0_in_rule__Unary__OperatorAssignment_18576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Unary__ExpAssignment_28609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Feature_Impl__NameAssignment_18640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_18671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Feature_Impl__SubfeatureAssignment_2_28702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_18733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Feature_Impl__ConstrainsAssignment_3_2_18764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Grouped__NameAssignment_08795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_1_18826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Grouped__ConstrainsAssignment_1_2_18857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Mandatory__NameAssignment_08888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_18919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Mandatory__SubfeatureAssignment_1_2_18950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_2_18981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Mandatory__ConstrainsAssignment_2_2_19012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_3_09043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Mandatory__GroupsAssignment_3_19074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Optional__NameAssignment_19105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_19136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSolitary_in_rule__Optional__SubfeatureAssignment_2_2_19167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_3_19198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstrain_in_rule__Optional__ConstrainsAssignment_3_2_19229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_4_09260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Optional__GroupsAssignment_4_19291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Or__NameAssignment_19322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_19353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Or__GroupedAssignment_2_2_19384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Xor__NameAssignment_19415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_19446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouped_in_rule__Xor__GroupedAssignment_2_2_19477 = new BitSet(new long[]{0x0000000000000002L});

}