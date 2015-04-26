
/*
 * generated by Xtext
 */
lexer grammar InternalConfLexer;


@header {
package dk.itu.mdd.configurator.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}




Feature : 'Feature';

Xor : 'Xor';

ExclamationMarkEqualsSign : '!=';

AmpersandAmpersand : '&&';

LessThanSignEqualsSign : '<=';

EqualsSignEqualsSign : '==';

GreaterThanSignEqualsSign : '>=';

Or : 'Or';

VerticalLineVerticalLine : '||';

ExclamationMark : '!';

LeftParenthesis : '(';

RightParenthesis : ')';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

LessThanSign : '<';

GreaterThanSign : '>';

QuestionMark : '?';

LeftSquareBracket : '[';

RightSquareBracket : ']';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';



RULE_NULL : 'null';

RULE_BOOLEAN : ('true'|'false');

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



