/*
 * generated by Xtext
 */
package dk.itu.mdd.configurator.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ConfAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("dk/itu/mdd/configurator/parser/antlr/internal/InternalConfParser.tokens");
	}
}