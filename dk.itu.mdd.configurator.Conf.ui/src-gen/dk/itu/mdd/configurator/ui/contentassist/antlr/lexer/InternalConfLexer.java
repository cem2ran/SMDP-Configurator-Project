package dk.itu.mdd.configurator.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfLexer extends Lexer {
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

    public InternalConfLexer() {;} 
    public InternalConfLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalConfLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g"; }

    // $ANTLR start "Feature"
    public final void mFeature() throws RecognitionException {
        try {
            int _type = Feature;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:19:9: ( 'Feature' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:19:11: 'Feature'
            {
            match("Feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Feature"

    // $ANTLR start "Xor"
    public final void mXor() throws RecognitionException {
        try {
            int _type = Xor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:21:5: ( 'Xor' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:21:7: 'Xor'
            {
            match("Xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Xor"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:23:27: ( '!=' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:23:29: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "AmpersandAmpersand"
    public final void mAmpersandAmpersand() throws RecognitionException {
        try {
            int _type = AmpersandAmpersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:25:20: ( '&&' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:25:22: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AmpersandAmpersand"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:27:24: ( '<=' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:27:26: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:29:22: ( '==' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:29:24: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:31:27: ( '>=' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:31:29: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:33:4: ( 'Or' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:33:6: 'Or'
            {
            match("Or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:35:26: ( '||' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:35:28: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLineVerticalLine"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:37:17: ( '!' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:37:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:39:17: ( '(' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:39:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:41:18: ( ')' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:41:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:43:7: ( ',' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:43:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:45:13: ( '-' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:45:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:47:10: ( '.' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:47:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:49:14: ( '<' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:49:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:51:17: ( '>' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:51:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:53:14: ( '?' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:53:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMark"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:55:19: ( '[' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:55:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:57:20: ( ']' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:57:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:59:18: ( '{' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:59:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:61:19: ( '}' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:61:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:65:11: ( 'null' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:65:13: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:67:21: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:67:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:69:19: ()
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:69:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:71:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:71:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:71:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:71:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:71:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:73:10: ( ( '0' .. '9' )+ )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:73:12: ( '0' .. '9' )+
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:73:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:73:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:75:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:75:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:75:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:75:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:75:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:75:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:75:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:75:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:75:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:75:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:75:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:77:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:77:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:77:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:77:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:79:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:79:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:79:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:79:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:79:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:79:41: ( '\\r' )? '\\n'
                    {
                    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:79:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:79:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:81:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:81:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:81:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:83:16: ( . )
            // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:83:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:8: ( Feature | Xor | ExclamationMarkEqualsSign | AmpersandAmpersand | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | Or | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Comma | HyphenMinus | FullStop | LessThanSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_NULL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=30;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:10: Feature
                {
                mFeature(); 

                }
                break;
            case 2 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:18: Xor
                {
                mXor(); 

                }
                break;
            case 3 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:22: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 4 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:48: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 5 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:67: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 6 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:90: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 7 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:111: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 8 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:137: Or
                {
                mOr(); 

                }
                break;
            case 9 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:140: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 10 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:165: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 11 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:181: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 12 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:197: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 13 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:214: Comma
                {
                mComma(); 

                }
                break;
            case 14 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:220: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 15 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:232: FullStop
                {
                mFullStop(); 

                }
                break;
            case 16 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:241: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 17 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:254: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 18 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:270: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 19 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:283: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 20 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:301: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 21 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:320: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 22 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:337: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 23 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:355: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 24 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:365: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:373: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:382: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:394: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:410: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:426: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // ../dk.itu.mdd.configurator.Conf.ui/src-gen/dk/itu/mdd/configurator/ui/contentassist/antlr/lexer/InternalConfLexer.g:1:434: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\2\36\1\41\1\34\1\44\1\34\1\47\1\36\1\34\12\uffff\1\36\1\34\2\uffff\3\34\2\uffff\1\36\1\uffff\1\36\10\uffff\1\74\13\uffff\1\36\5\uffff\1\36\1\77\1\uffff\2\36\1\uffff\1\102\1\36\1\uffff\1\36\1\105\1\uffff";
    static final String DFA12_eofS =
        "\106\uffff";
    static final String DFA12_minS =
        "\1\0\1\145\1\157\1\75\1\46\3\75\1\162\1\174\12\uffff\1\165\1\101\2\uffff\2\0\1\52\2\uffff\1\141\1\uffff\1\162\10\uffff\1\60\13\uffff\1\154\5\uffff\1\164\1\60\1\uffff\1\154\1\165\1\uffff\1\60\1\162\1\uffff\1\145\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\145\1\157\1\75\1\46\3\75\1\162\1\174\12\uffff\1\165\1\172\2\uffff\2\uffff\1\57\2\uffff\1\141\1\uffff\1\162\10\uffff\1\172\13\uffff\1\154\5\uffff\1\164\1\172\1\uffff\1\154\1\165\1\uffff\1\172\1\162\1\uffff\1\145\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\12\uffff\1\13\1\14\1\15\1\16\1\17\1\22\1\23\1\24\1\25\1\26\2\uffff\1\30\1\31\3\uffff\1\35\1\36\1\uffff\1\30\1\uffff\1\3\1\12\1\4\1\5\1\20\1\6\1\7\1\21\1\uffff\1\11\1\13\1\14\1\15\1\16\1\17\1\22\1\23\1\24\1\25\1\26\1\uffff\1\31\1\32\1\33\1\34\1\35\2\uffff\1\10\2\uffff\1\2\2\uffff\1\27\2\uffff\1\1";
    static final String DFA12_specialS =
        "\1\1\27\uffff\1\2\1\0\54\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\3\1\30\3\34\1\4\1\31\1\12\1\13\2\34\1\14\1\15\1\16\1\32\12\27\2\34\1\5\1\6\1\7\1\17\1\34\5\26\1\1\10\26\1\10\10\26\1\2\2\26\1\20\1\34\1\21\1\25\1\26\1\34\15\26\1\24\14\26\1\22\1\11\1\23\uff82\34",
            "\1\35",
            "\1\37",
            "\1\40",
            "\1\42",
            "\1\43",
            "\1\45",
            "\1\46",
            "\1\50",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\66",
            "\0\66",
            "\1\67\4\uffff\1\70",
            "",
            "",
            "\1\72",
            "",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\100",
            "\1\101",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\103",
            "",
            "\1\104",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Feature | Xor | ExclamationMarkEqualsSign | AmpersandAmpersand | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | Or | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Comma | HyphenMinus | FullStop | LessThanSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_NULL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFF')) ) {s = 54;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='F') ) {s = 1;}

                        else if ( (LA12_0=='X') ) {s = 2;}

                        else if ( (LA12_0=='!') ) {s = 3;}

                        else if ( (LA12_0=='&') ) {s = 4;}

                        else if ( (LA12_0=='<') ) {s = 5;}

                        else if ( (LA12_0=='=') ) {s = 6;}

                        else if ( (LA12_0=='>') ) {s = 7;}

                        else if ( (LA12_0=='O') ) {s = 8;}

                        else if ( (LA12_0=='|') ) {s = 9;}

                        else if ( (LA12_0=='(') ) {s = 10;}

                        else if ( (LA12_0==')') ) {s = 11;}

                        else if ( (LA12_0==',') ) {s = 12;}

                        else if ( (LA12_0=='-') ) {s = 13;}

                        else if ( (LA12_0=='.') ) {s = 14;}

                        else if ( (LA12_0=='?') ) {s = 15;}

                        else if ( (LA12_0=='[') ) {s = 16;}

                        else if ( (LA12_0==']') ) {s = 17;}

                        else if ( (LA12_0=='{') ) {s = 18;}

                        else if ( (LA12_0=='}') ) {s = 19;}

                        else if ( (LA12_0=='n') ) {s = 20;}

                        else if ( (LA12_0=='^') ) {s = 21;}

                        else if ( ((LA12_0>='A' && LA12_0<='E')||(LA12_0>='G' && LA12_0<='N')||(LA12_0>='P' && LA12_0<='W')||(LA12_0>='Y' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='m')||(LA12_0>='o' && LA12_0<='z')) ) {s = 22;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 23;}

                        else if ( (LA12_0=='\"') ) {s = 24;}

                        else if ( (LA12_0=='\'') ) {s = 25;}

                        else if ( (LA12_0=='/') ) {s = 26;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 27;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='%')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>=':' && LA12_0<=';')||LA12_0=='@'||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFF')) ) {s = 54;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}