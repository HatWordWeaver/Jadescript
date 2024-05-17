package org.xtext.globaltype.globaljade.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGlobalJadeLexer extends Lexer {
    public static final int RULE_GENERAL_NAME=4;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_TYPE_MESSAGE=5;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_CONTENT=6;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalGlobalJadeLexer() {;} 
    public InternalGlobalJadeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGlobalJadeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGlobalJade.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:11:7: ( 'end' )
            // InternalGlobalJade.g:11:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:12:7: ( 'global' )
            // InternalGlobalJade.g:12:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:13:7: ( 'protocol' )
            // InternalGlobalJade.g:13:9: 'protocol'
            {
            match("protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:14:7: ( '(' )
            // InternalGlobalJade.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:15:7: ( ')' )
            // InternalGlobalJade.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:16:7: ( '{' )
            // InternalGlobalJade.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:17:7: ( '}' )
            // InternalGlobalJade.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:18:7: ( ',' )
            // InternalGlobalJade.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:19:7: ( 'choice' )
            // InternalGlobalJade.g:19:9: 'choice'
            {
            match("choice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:20:7: ( 'at' )
            // InternalGlobalJade.g:20:9: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:21:7: ( 'or' )
            // InternalGlobalJade.g:21:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:22:7: ( 'forall' )
            // InternalGlobalJade.g:22:9: 'forall'
            {
            match("forall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:23:7: ( 'in' )
            // InternalGlobalJade.g:23:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:24:7: ( 'do' )
            // InternalGlobalJade.g:24:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:25:7: ( ';' )
            // InternalGlobalJade.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:26:7: ( 'from' )
            // InternalGlobalJade.g:26:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:27:7: ( 'to' )
            // InternalGlobalJade.g:27:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:28:7: ( 'role' )
            // InternalGlobalJade.g:28:9: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_TYPE_MESSAGE"
    public final void mRULE_TYPE_MESSAGE() throws RecognitionException {
        try {
            int _type = RULE_TYPE_MESSAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:1878:19: ( ( 'CFP' | 'REJECT-PROPOSAL' | 'ACCEPT-PROPOSAL' ) )
            // InternalGlobalJade.g:1878:21: ( 'CFP' | 'REJECT-PROPOSAL' | 'ACCEPT-PROPOSAL' )
            {
            // InternalGlobalJade.g:1878:21: ( 'CFP' | 'REJECT-PROPOSAL' | 'ACCEPT-PROPOSAL' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'C':
                {
                alt1=1;
                }
                break;
            case 'R':
                {
                alt1=2;
                }
                break;
            case 'A':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGlobalJade.g:1878:22: 'CFP'
                    {
                    match("CFP"); 


                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:1878:28: 'REJECT-PROPOSAL'
                    {
                    match("REJECT-PROPOSAL"); 


                    }
                    break;
                case 3 :
                    // InternalGlobalJade.g:1878:46: 'ACCEPT-PROPOSAL'
                    {
                    match("ACCEPT-PROPOSAL"); 


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
    // $ANTLR end "RULE_TYPE_MESSAGE"

    // $ANTLR start "RULE_CONTENT"
    public final void mRULE_CONTENT() throws RecognitionException {
        try {
            int _type = RULE_CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:1880:14: ( ( 'int' | 'bool' | 'string' ) )
            // InternalGlobalJade.g:1880:16: ( 'int' | 'bool' | 'string' )
            {
            // InternalGlobalJade.g:1880:16: ( 'int' | 'bool' | 'string' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt2=1;
                }
                break;
            case 'b':
                {
                alt2=2;
                }
                break;
            case 's':
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
                    // InternalGlobalJade.g:1880:17: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:1880:23: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 3 :
                    // InternalGlobalJade.g:1880:30: 'string'
                    {
                    match("string"); 


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
    // $ANTLR end "RULE_CONTENT"

    // $ANTLR start "RULE_GENERAL_NAME"
    public final void mRULE_GENERAL_NAME() throws RecognitionException {
        try {
            int _type = RULE_GENERAL_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:1882:19: ( ( 'A' .. 'Z' )+ ( 'a' .. 'z' )* )
            // InternalGlobalJade.g:1882:21: ( 'A' .. 'Z' )+ ( 'a' .. 'z' )*
            {
            // InternalGlobalJade.g:1882:21: ( 'A' .. 'Z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGlobalJade.g:1882:22: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

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

            // InternalGlobalJade.g:1882:33: ( 'a' .. 'z' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGlobalJade.g:1882:34: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GENERAL_NAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:1884:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGlobalJade.g:1884:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGlobalJade.g:1884:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGlobalJade.g:1884:11: '^'
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

            // InternalGlobalJade.g:1884:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGlobalJade.g:
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
            	    break loop6;
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
            // InternalGlobalJade.g:1886:10: ( ( '0' .. '9' )+ )
            // InternalGlobalJade.g:1886:12: ( '0' .. '9' )+
            {
            // InternalGlobalJade.g:1886:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGlobalJade.g:1886:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalGlobalJade.g:1888:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGlobalJade.g:1888:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGlobalJade.g:1888:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGlobalJade.g:1888:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGlobalJade.g:1888:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGlobalJade.g:1888:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGlobalJade.g:1888:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:1888:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGlobalJade.g:1888:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGlobalJade.g:1888:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGlobalJade.g:1888:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalGlobalJade.g:1890:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGlobalJade.g:1890:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGlobalJade.g:1890:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGlobalJade.g:1890:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalGlobalJade.g:1892:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGlobalJade.g:1892:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGlobalJade.g:1892:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGlobalJade.g:1892:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalGlobalJade.g:1892:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGlobalJade.g:1892:41: ( '\\r' )? '\\n'
                    {
                    // InternalGlobalJade.g:1892:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGlobalJade.g:1892:41: '\\r'
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
            // InternalGlobalJade.g:1894:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGlobalJade.g:1894:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGlobalJade.g:1894:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGlobalJade.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalGlobalJade.g:1896:16: ( . )
            // InternalGlobalJade.g:1896:18: .
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
        // InternalGlobalJade.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_TYPE_MESSAGE | RULE_CONTENT | RULE_GENERAL_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=28;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalGlobalJade.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalGlobalJade.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalGlobalJade.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalGlobalJade.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalGlobalJade.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalGlobalJade.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalGlobalJade.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalGlobalJade.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalGlobalJade.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalGlobalJade.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalGlobalJade.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalGlobalJade.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalGlobalJade.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalGlobalJade.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalGlobalJade.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalGlobalJade.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalGlobalJade.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalGlobalJade.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalGlobalJade.g:1:118: RULE_TYPE_MESSAGE
                {
                mRULE_TYPE_MESSAGE(); 

                }
                break;
            case 20 :
                // InternalGlobalJade.g:1:136: RULE_CONTENT
                {
                mRULE_CONTENT(); 

                }
                break;
            case 21 :
                // InternalGlobalJade.g:1:149: RULE_GENERAL_NAME
                {
                mRULE_GENERAL_NAME(); 

                }
                break;
            case 22 :
                // InternalGlobalJade.g:1:167: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalGlobalJade.g:1:175: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalGlobalJade.g:1:184: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalGlobalJade.g:1:196: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalGlobalJade.g:1:212: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalGlobalJade.g:1:228: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalGlobalJade.g:1:236: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\3\41\5\uffff\6\41\1\uffff\2\41\3\64\2\41\1\64\1\37\2\uffff\3\37\2\uffff\1\41\1\uffff\2\41\5\uffff\1\41\1\104\1\105\2\41\1\111\1\112\1\uffff\1\113\1\41\1\64\1\uffff\4\64\2\41\5\uffff\1\122\3\41\2\uffff\2\41\1\130\3\uffff\1\41\1\132\2\64\2\41\1\uffff\4\41\1\143\1\uffff\1\144\1\uffff\2\64\1\130\5\41\2\uffff\2\64\1\41\1\157\1\41\1\161\1\162\2\64\1\130\1\uffff\1\41\2\uffff\1\164\1\uffff";
    static final String DFA16_eofS =
        "\165\uffff";
    static final String DFA16_minS =
        "\1\0\1\156\1\154\1\162\5\uffff\1\150\1\164\1\162\1\157\1\156\1\157\1\uffff\2\157\3\60\1\157\1\164\1\60\1\101\2\uffff\2\0\1\52\2\uffff\1\144\1\uffff\2\157\5\uffff\1\157\2\60\1\162\1\157\2\60\1\uffff\1\60\1\154\1\60\1\uffff\4\60\1\157\1\162\5\uffff\1\60\1\142\1\164\1\151\2\uffff\1\141\1\155\1\60\3\uffff\1\145\3\60\1\154\1\151\1\uffff\1\141\1\157\1\143\1\154\1\60\1\uffff\1\60\1\uffff\3\60\1\156\1\154\1\143\1\145\1\154\2\uffff\2\60\1\147\1\60\1\157\2\60\2\55\1\60\1\uffff\1\154\2\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\156\1\154\1\162\5\uffff\1\150\1\164\2\162\1\156\1\157\1\uffff\2\157\3\172\1\157\1\164\2\172\2\uffff\2\uffff\1\57\2\uffff\1\144\1\uffff\2\157\5\uffff\1\157\2\172\1\162\1\157\2\172\1\uffff\1\172\1\154\1\172\1\uffff\4\172\1\157\1\162\5\uffff\1\172\1\142\1\164\1\151\2\uffff\1\141\1\155\1\172\3\uffff\1\145\3\172\1\154\1\151\1\uffff\1\141\1\157\1\143\1\154\1\172\1\uffff\1\172\1\uffff\3\172\1\156\1\154\1\143\1\145\1\154\2\uffff\2\172\1\147\1\172\1\157\5\172\1\uffff\1\154\2\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\1\10\6\uffff\1\17\11\uffff\1\26\1\27\3\uffff\1\33\1\34\1\uffff\1\26\2\uffff\1\4\1\5\1\6\1\7\1\10\7\uffff\1\17\3\uffff\1\25\6\uffff\1\27\1\30\1\31\1\32\1\33\4\uffff\1\12\1\13\3\uffff\1\15\1\16\1\21\6\uffff\1\1\5\uffff\1\24\1\uffff\1\23\10\uffff\1\20\1\22\12\uffff\1\2\1\uffff\1\11\1\14\1\uffff\1\3";
    static final String DFA16_specialS =
        "\1\0\32\uffff\1\2\1\1\130\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\4\37\1\34\1\4\1\5\2\37\1\10\2\37\1\35\12\32\1\37\1\17\5\37\1\24\1\27\1\22\16\27\1\23\10\27\3\37\1\30\1\31\1\37\1\12\1\25\1\11\1\16\1\1\1\14\1\2\1\31\1\15\5\31\1\13\1\3\1\31\1\21\1\26\1\20\6\31\1\6\1\37\1\7\uff82\37",
            "\1\40",
            "\1\42",
            "\1\43",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54\2\uffff\1\55",
            "\1\56",
            "\1\57",
            "",
            "\1\61",
            "\1\62",
            "\12\41\7\uffff\5\66\1\63\24\66\4\uffff\1\41\1\uffff\32\65",
            "\12\41\7\uffff\4\66\1\67\25\66\4\uffff\1\41\1\uffff\32\65",
            "\12\41\7\uffff\2\66\1\70\27\66\4\uffff\1\41\1\uffff\32\65",
            "\1\71",
            "\1\72",
            "\12\41\7\uffff\32\66\4\uffff\1\41\1\uffff\32\65",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\74",
            "\0\74",
            "\1\75\4\uffff\1\76",
            "",
            "",
            "\1\100",
            "",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\106",
            "\1\107",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\110\6\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\114",
            "\12\41\7\uffff\17\66\1\115\12\66\4\uffff\1\41\1\uffff\32\65",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\65",
            "\12\41\7\uffff\32\66\4\uffff\1\41\1\uffff\32\65",
            "\12\41\7\uffff\11\66\1\116\20\66\4\uffff\1\41\1\uffff\32\65",
            "\12\41\7\uffff\2\66\1\117\27\66\4\uffff\1\41\1\uffff\32\65",
            "\1\120",
            "\1\121",
            "",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\126",
            "\1\127",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "\1\131",
            "\12\41\7\uffff\32\66\4\uffff\1\41\1\uffff\32\65",
            "\12\41\7\uffff\4\66\1\133\25\66\4\uffff\1\41\1\uffff\32\65",
            "\12\41\7\uffff\4\66\1\134\25\66\4\uffff\1\41\1\uffff\32\65",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\2\66\1\145\27\66\4\uffff\1\41\1\uffff\32\65",
            "\12\41\7\uffff\17\66\1\146\12\66\4\uffff\1\41\1\uffff\32\65",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "\12\41\7\uffff\23\66\1\154\6\66\4\uffff\1\41\1\uffff\32\65",
            "\12\41\7\uffff\23\66\1\155\6\66\4\uffff\1\41\1\uffff\32\65",
            "\1\156",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\160",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\132\2\uffff\12\41\7\uffff\32\66\4\uffff\1\41\1\uffff\32\65",
            "\1\132\2\uffff\12\41\7\uffff\32\66\4\uffff\1\41\1\uffff\32\65",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\163",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_TYPE_MESSAGE | RULE_CONTENT | RULE_GENERAL_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='e') ) {s = 1;}

                        else if ( (LA16_0=='g') ) {s = 2;}

                        else if ( (LA16_0=='p') ) {s = 3;}

                        else if ( (LA16_0=='(') ) {s = 4;}

                        else if ( (LA16_0==')') ) {s = 5;}

                        else if ( (LA16_0=='{') ) {s = 6;}

                        else if ( (LA16_0=='}') ) {s = 7;}

                        else if ( (LA16_0==',') ) {s = 8;}

                        else if ( (LA16_0=='c') ) {s = 9;}

                        else if ( (LA16_0=='a') ) {s = 10;}

                        else if ( (LA16_0=='o') ) {s = 11;}

                        else if ( (LA16_0=='f') ) {s = 12;}

                        else if ( (LA16_0=='i') ) {s = 13;}

                        else if ( (LA16_0=='d') ) {s = 14;}

                        else if ( (LA16_0==';') ) {s = 15;}

                        else if ( (LA16_0=='t') ) {s = 16;}

                        else if ( (LA16_0=='r') ) {s = 17;}

                        else if ( (LA16_0=='C') ) {s = 18;}

                        else if ( (LA16_0=='R') ) {s = 19;}

                        else if ( (LA16_0=='A') ) {s = 20;}

                        else if ( (LA16_0=='b') ) {s = 21;}

                        else if ( (LA16_0=='s') ) {s = 22;}

                        else if ( (LA16_0=='B'||(LA16_0>='D' && LA16_0<='Q')||(LA16_0>='S' && LA16_0<='Z')) ) {s = 23;}

                        else if ( (LA16_0=='^') ) {s = 24;}

                        else if ( (LA16_0=='_'||LA16_0=='h'||(LA16_0>='j' && LA16_0<='n')||LA16_0=='q'||(LA16_0>='u' && LA16_0<='z')) ) {s = 25;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 26;}

                        else if ( (LA16_0=='\"') ) {s = 27;}

                        else if ( (LA16_0=='\'') ) {s = 28;}

                        else if ( (LA16_0=='/') ) {s = 29;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 30;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='*' && LA16_0<='+')||(LA16_0>='-' && LA16_0<='.')||LA16_0==':'||(LA16_0>='<' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_28 = input.LA(1);

                        s = -1;
                        if ( ((LA16_28>='\u0000' && LA16_28<='\uFFFF')) ) {s = 60;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_27 = input.LA(1);

                        s = -1;
                        if ( ((LA16_27>='\u0000' && LA16_27<='\uFFFF')) ) {s = 60;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}