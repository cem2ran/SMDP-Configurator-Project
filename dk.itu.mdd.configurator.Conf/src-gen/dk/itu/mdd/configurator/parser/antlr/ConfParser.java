/*
 * generated by Xtext
 */
package dk.itu.mdd.configurator.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import dk.itu.mdd.configurator.services.ConfGrammarAccess;

public class ConfParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ConfGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.antlr.runtime.TokenSource createLexer(org.antlr.runtime.CharStream stream) {
		return new dk.itu.mdd.configurator.parser.antlr.ConfTokenSource(super.createLexer(stream));
	}

	/**
	 * Indentation aware languages do not support partial parsing since the lexer is inherently stateful.
	 * Override and return {@code true} if your terminal splitting is stateless.
	 */
	@Override
	protected boolean isReparseSupported() {
		return false;
	}

	@Override
	protected dk.itu.mdd.configurator.parser.antlr.internal.InternalConfParser createParser(XtextTokenStream stream) {
		return new dk.itu.mdd.configurator.parser.antlr.internal.InternalConfParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public ConfGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ConfGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
