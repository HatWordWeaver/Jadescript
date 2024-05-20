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
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int RULE_TYPE_MESSAGE=5;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
            // InternalGlobalJade.g:19:7: ( 'rec' )
            // InternalGlobalJade.g:19:9: 'rec'
            {
            match("rec"); 


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
            // InternalGlobalJade.g:20:7: ( ':' )
            // InternalGlobalJade.g:20:9: ':'
            {
            match(':'); 

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
            // InternalGlobalJade.g:21:7: ( 'stop' )
            // InternalGlobalJade.g:21:9: 'stop'
            {
            match("stop"); 


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
            // InternalGlobalJade.g:22:7: ( 'continue' )
            // InternalGlobalJade.g:22:9: 'continue'
            {
            match("continue"); 


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
            // InternalGlobalJade.g:23:7: ( 'choice' )
            // InternalGlobalJade.g:23:9: 'choice'
            {
            match("choice"); 


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
            // InternalGlobalJade.g:24:7: ( 'at' )
            // InternalGlobalJade.g:24:9: 'at'
            {
            match("at"); 


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
            // InternalGlobalJade.g:25:7: ( 'or' )
            // InternalGlobalJade.g:25:9: 'or'
            {
            match("or"); 


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
            // InternalGlobalJade.g:26:7: ( 'forall' )
            // InternalGlobalJade.g:26:9: 'forall'
            {
            match("forall"); 


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
            // InternalGlobalJade.g:27:7: ( 'in' )
            // InternalGlobalJade.g:27:9: 'in'
            {
            match("in"); 


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
            // InternalGlobalJade.g:28:7: ( 'do' )
            // InternalGlobalJade.g:28:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:29:7: ( ';' )
            // InternalGlobalJade.g:29:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:30:7: ( 'from' )
            // InternalGlobalJade.g:30:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:31:7: ( 'to' )
            // InternalGlobalJade.g:31:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:32:7: ( 'role' )
            // InternalGlobalJade.g:32:9: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "RULE_TYPE_MESSAGE"
    public final void mRULE_TYPE_MESSAGE() throws RecognitionException {
        try {
            int _type = RULE_TYPE_MESSAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:2205:19: ( ( 'CFP' | 'REJECT-PROPOSAL' | 'ACCEPT-PROPOSAL' | 'FAILURE' | 'INFORM-DONE' | 'INFORM' ) )
            // InternalGlobalJade.g:2205:21: ( 'CFP' | 'REJECT-PROPOSAL' | 'ACCEPT-PROPOSAL' | 'FAILURE' | 'INFORM-DONE' | 'INFORM' )
            {
            // InternalGlobalJade.g:2205:21: ( 'CFP' | 'REJECT-PROPOSAL' | 'ACCEPT-PROPOSAL' | 'FAILURE' | 'INFORM-DONE' | 'INFORM' )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGlobalJade.g:2205:22: 'CFP'
                    {
                    match("CFP"); 


                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:2205:28: 'REJECT-PROPOSAL'
                    {
                    match("REJECT-PROPOSAL"); 


                    }
                    break;
                case 3 :
                    // InternalGlobalJade.g:2205:46: 'ACCEPT-PROPOSAL'
                    {
                    match("ACCEPT-PROPOSAL"); 


                    }
                    break;
                case 4 :
                    // InternalGlobalJade.g:2205:64: 'FAILURE'
                    {
                    match("FAILURE"); 


                    }
                    break;
                case 5 :
                    // InternalGlobalJade.g:2205:74: 'INFORM-DONE'
                    {
                    match("INFORM-DONE"); 


                    }
                    break;
                case 6 :
                    // InternalGlobalJade.g:2205:88: 'INFORM'
                    {
                    match("INFORM"); 


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
            // InternalGlobalJade.g:2207:14: ( ( 'int' | 'bool' | 'string' ) )
            // InternalGlobalJade.g:2207:16: ( 'int' | 'bool' | 'string' )
            {
            // InternalGlobalJade.g:2207:16: ( 'int' | 'bool' | 'string' )
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
                    // InternalGlobalJade.g:2207:17: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:2207:23: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 3 :
                    // InternalGlobalJade.g:2207:30: 'string'
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
            // InternalGlobalJade.g:2209:19: ( ( 'A' .. 'Z' )+ ( 'a' .. 'z' )* )
            // InternalGlobalJade.g:2209:21: ( 'A' .. 'Z' )+ ( 'a' .. 'z' )*
            {
            // InternalGlobalJade.g:2209:21: ( 'A' .. 'Z' )+
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
            	    // InternalGlobalJade.g:2209:22: 'A' .. 'Z'
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

            // InternalGlobalJade.g:2209:33: ( 'a' .. 'z' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGlobalJade.g:2209:34: 'a' .. 'z'
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
            // InternalGlobalJade.g:2211:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGlobalJade.g:2211:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGlobalJade.g:2211:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGlobalJade.g:2211:11: '^'
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

            // InternalGlobalJade.g:2211:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalGlobalJade.g:2213:10: ( ( '0' .. '9' )+ )
            // InternalGlobalJade.g:2213:12: ( '0' .. '9' )+
            {
            // InternalGlobalJade.g:2213:12: ( '0' .. '9' )+
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
            	    // InternalGlobalJade.g:2213:13: '0' .. '9'
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
            // InternalGlobalJade.g:2215:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGlobalJade.g:2215:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGlobalJade.g:2215:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalGlobalJade.g:2215:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGlobalJade.g:2215:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalGlobalJade.g:2215:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGlobalJade.g:2215:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalGlobalJade.g:2215:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGlobalJade.g:2215:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalGlobalJade.g:2215:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGlobalJade.g:2215:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalGlobalJade.g:2217:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGlobalJade.g:2217:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGlobalJade.g:2217:24: ( options {greedy=false; } : . )*
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
            	    // InternalGlobalJade.g:2217:52: .
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
            // InternalGlobalJade.g:2219:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGlobalJade.g:2219:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGlobalJade.g:2219:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGlobalJade.g:2219:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalGlobalJade.g:2219:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGlobalJade.g:2219:41: ( '\\r' )? '\\n'
                    {
                    // InternalGlobalJade.g:2219:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGlobalJade.g:2219:41: '\\r'
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
            // InternalGlobalJade.g:2221:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGlobalJade.g:2221:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGlobalJade.g:2221:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalGlobalJade.g:2223:16: ( . )
            // InternalGlobalJade.g:2223:18: .
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
        // InternalGlobalJade.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_TYPE_MESSAGE | RULE_CONTENT | RULE_GENERAL_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=32;
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
                // InternalGlobalJade.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalGlobalJade.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalGlobalJade.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalGlobalJade.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalGlobalJade.g:1:142: RULE_TYPE_MESSAGE
                {
                mRULE_TYPE_MESSAGE(); 

                }
                break;
            case 24 :
                // InternalGlobalJade.g:1:160: RULE_CONTENT
                {
                mRULE_CONTENT(); 

                }
                break;
            case 25 :
                // InternalGlobalJade.g:1:173: RULE_GENERAL_NAME
                {
                mRULE_GENERAL_NAME(); 

                }
                break;
            case 26 :
                // InternalGlobalJade.g:1:191: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // InternalGlobalJade.g:1:199: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // InternalGlobalJade.g:1:208: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // InternalGlobalJade.g:1:220: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // InternalGlobalJade.g:1:236: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // InternalGlobalJade.g:1:252: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // InternalGlobalJade.g:1:260: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA1_eotS =
        "\12\uffff\1\14\2\uffff";
    static final String DFA1_eofS =
        "\15\uffff";
    static final String DFA1_minS =
        "\1\101\4\uffff\1\116\1\106\1\117\1\122\1\115\1\55\2\uffff";
    static final String DFA1_maxS =
        "\1\122\4\uffff\1\116\1\106\1\117\1\122\1\115\1\55\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\6\uffff\1\5\1\6";
    static final String DFA1_specialS =
        "\15\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\1\uffff\1\1\2\uffff\1\4\2\uffff\1\5\10\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "2205:21: ( 'CFP' | 'REJECT-PROPOSAL' | 'ACCEPT-PROPOSAL' | 'FAILURE' | 'INFORM-DONE' | 'INFORM' )";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\3\44\5\uffff\1\44\1\uffff\7\44\1\uffff\1\44\5\74\1\44\1\74\1\42\2\uffff\3\42\2\uffff\1\44\1\uffff\2\44\5\uffff\2\44\1\uffff\3\44\1\121\1\122\2\44\1\126\1\127\1\uffff\1\130\2\74\1\uffff\5\74\1\44\5\uffff\1\137\2\44\1\142\5\44\2\uffff\2\44\1\152\3\uffff\1\153\4\74\1\44\1\uffff\2\44\1\uffff\1\163\1\164\4\44\1\171\2\uffff\4\74\1\152\2\44\2\uffff\4\44\1\uffff\4\74\1\u0088\1\44\1\152\1\44\1\u008b\1\u008c\3\74\1\153\1\uffff\2\44\2\uffff\1\153\1\u0090\1\u0091\2\uffff";
    static final String DFA16_eofS =
        "\u0092\uffff";
    static final String DFA16_minS =
        "\1\0\1\156\1\154\1\162\5\uffff\1\145\1\uffff\1\164\1\150\1\164\1\162\1\157\1\156\1\157\1\uffff\1\157\5\60\1\157\1\60\1\101\2\uffff\2\0\1\52\2\uffff\1\144\1\uffff\2\157\5\uffff\1\143\1\154\1\uffff\1\157\1\156\1\157\2\60\1\162\1\157\2\60\1\uffff\3\60\1\uffff\5\60\1\157\5\uffff\1\60\1\142\1\164\1\60\1\145\1\160\1\151\1\164\1\151\2\uffff\1\141\1\155\1\60\3\uffff\5\60\1\154\1\uffff\1\141\1\157\1\uffff\2\60\1\156\1\151\1\143\1\154\1\60\2\uffff\5\60\1\154\1\143\2\uffff\1\147\1\156\1\145\1\154\1\uffff\5\60\1\157\1\60\1\165\2\60\2\55\2\60\1\uffff\1\154\1\145\2\uffff\3\60\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\156\1\154\1\162\5\uffff\1\157\1\uffff\1\164\1\157\1\164\2\162\1\156\1\157\1\uffff\1\157\5\172\1\157\2\172\2\uffff\2\uffff\1\57\2\uffff\1\144\1\uffff\2\157\5\uffff\1\143\1\154\1\uffff\1\162\1\156\1\157\2\172\1\162\1\157\2\172\1\uffff\3\172\1\uffff\5\172\1\157\5\uffff\1\172\1\142\1\164\1\172\1\145\1\160\1\151\1\164\1\151\2\uffff\1\141\1\155\1\172\3\uffff\5\172\1\154\1\uffff\1\141\1\157\1\uffff\2\172\1\156\1\151\1\143\1\154\1\172\2\uffff\5\172\1\154\1\143\2\uffff\1\147\1\156\1\145\1\154\1\uffff\5\172\1\157\1\172\1\165\6\172\1\uffff\1\154\1\145\2\uffff\3\172\2\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\7\uffff\1\23\11\uffff\1\32\1\33\3\uffff\1\37\1\40\1\uffff\1\32\2\uffff\1\4\1\5\1\6\1\7\1\10\2\uffff\1\12\11\uffff\1\23\3\uffff\1\31\6\uffff\1\33\1\34\1\35\1\36\1\37\11\uffff\1\16\1\17\3\uffff\1\21\1\22\1\25\6\uffff\1\1\2\uffff\1\11\7\uffff\1\30\1\27\7\uffff\1\26\1\13\4\uffff\1\24\16\uffff\1\2\2\uffff\1\15\1\20\3\uffff\1\3\1\14";
    static final String DFA16_specialS =
        "\1\0\35\uffff\1\2\1\1\162\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\36\4\42\1\37\1\4\1\5\2\42\1\10\2\42\1\40\12\35\1\12\1\22\5\42\1\26\1\32\1\24\2\32\1\27\2\32\1\30\10\32\1\25\10\32\3\42\1\33\1\34\1\42\1\15\1\31\1\14\1\21\1\1\1\17\1\2\1\34\1\20\5\34\1\16\1\3\1\34\1\11\1\13\1\23\6\34\1\6\1\42\1\7\uff82\42",
            "\1\43",
            "\1\45",
            "\1\46",
            "",
            "",
            "",
            "",
            "",
            "\1\54\11\uffff\1\55",
            "",
            "\1\57",
            "\1\61\6\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\64\2\uffff\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\71",
            "\12\44\7\uffff\5\75\1\72\24\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\4\75\1\76\25\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\2\75\1\77\27\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\1\100\31\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\15\75\1\101\14\75\4\uffff\1\44\1\uffff\32\73",
            "\1\102",
            "\12\44\7\uffff\32\75\4\uffff\1\44\1\uffff\32\73",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\0\104",
            "\0\104",
            "\1\105\4\uffff\1\106",
            "",
            "",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "",
            "\1\115\2\uffff\1\116",
            "\1\117",
            "\1\120",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\123",
            "\1\124",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\125\6\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\17\75\1\131\12\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\73",
            "",
            "\12\44\7\uffff\32\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\11\75\1\132\20\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\2\75\1\133\27\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\10\75\1\134\21\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\5\75\1\135\24\75\4\uffff\1\44\1\uffff\32\73",
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\140",
            "\1\141",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "",
            "\1\150",
            "\1\151",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\12\44\7\uffff\32\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\4\75\1\154\25\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\4\75\1\155\25\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\13\75\1\156\16\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\16\75\1\157\13\75\4\uffff\1\44\1\uffff\32\73",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\2\75\1\172\27\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\17\75\1\173\12\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\24\75\1\174\5\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\21\75\1\175\10\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\176",
            "\1\177",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\12\44\7\uffff\23\75\1\u0084\6\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\23\75\1\u0085\6\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\21\75\1\u0086\10\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\14\75\1\u0087\15\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0089",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008a",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\153\2\uffff\12\44\7\uffff\32\75\4\uffff\1\44\1\uffff\32\73",
            "\1\153\2\uffff\12\44\7\uffff\32\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\4\75\1\u008d\25\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\32\75\4\uffff\1\44\1\uffff\32\73",
            "",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "\12\44\7\uffff\32\75\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_TYPE_MESSAGE | RULE_CONTENT | RULE_GENERAL_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
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

                        else if ( (LA16_0=='r') ) {s = 9;}

                        else if ( (LA16_0==':') ) {s = 10;}

                        else if ( (LA16_0=='s') ) {s = 11;}

                        else if ( (LA16_0=='c') ) {s = 12;}

                        else if ( (LA16_0=='a') ) {s = 13;}

                        else if ( (LA16_0=='o') ) {s = 14;}

                        else if ( (LA16_0=='f') ) {s = 15;}

                        else if ( (LA16_0=='i') ) {s = 16;}

                        else if ( (LA16_0=='d') ) {s = 17;}

                        else if ( (LA16_0==';') ) {s = 18;}

                        else if ( (LA16_0=='t') ) {s = 19;}

                        else if ( (LA16_0=='C') ) {s = 20;}

                        else if ( (LA16_0=='R') ) {s = 21;}

                        else if ( (LA16_0=='A') ) {s = 22;}

                        else if ( (LA16_0=='F') ) {s = 23;}

                        else if ( (LA16_0=='I') ) {s = 24;}

                        else if ( (LA16_0=='b') ) {s = 25;}

                        else if ( (LA16_0=='B'||(LA16_0>='D' && LA16_0<='E')||(LA16_0>='G' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='Q')||(LA16_0>='S' && LA16_0<='Z')) ) {s = 26;}

                        else if ( (LA16_0=='^') ) {s = 27;}

                        else if ( (LA16_0=='_'||LA16_0=='h'||(LA16_0>='j' && LA16_0<='n')||LA16_0=='q'||(LA16_0>='u' && LA16_0<='z')) ) {s = 28;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 29;}

                        else if ( (LA16_0=='\"') ) {s = 30;}

                        else if ( (LA16_0=='\'') ) {s = 31;}

                        else if ( (LA16_0=='/') ) {s = 32;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 33;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='*' && LA16_0<='+')||(LA16_0>='-' && LA16_0<='.')||(LA16_0>='<' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_31 = input.LA(1);

                        s = -1;
                        if ( ((LA16_31>='\u0000' && LA16_31<='\uFFFF')) ) {s = 68;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_30 = input.LA(1);

                        s = -1;
                        if ( ((LA16_30>='\u0000' && LA16_30<='\uFFFF')) ) {s = 68;}

                        else s = 34;

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