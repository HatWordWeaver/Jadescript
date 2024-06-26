package org.xtext.globaltype.globaljade.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGlobalJadeLexer extends Lexer {
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:11:7: ( 'global' )
            // InternalGlobalJade.g:11:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:12:7: ( 'protocol' )
            // InternalGlobalJade.g:12:9: 'protocol'
            {
            match("protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:13:7: ( '(' )
            // InternalGlobalJade.g:13:9: '('
            {
            match('('); 

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
            // InternalGlobalJade.g:14:7: ( ')' )
            // InternalGlobalJade.g:14:9: ')'
            {
            match(')'); 

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
            // InternalGlobalJade.g:15:7: ( '{' )
            // InternalGlobalJade.g:15:9: '{'
            {
            match('{'); 

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
            // InternalGlobalJade.g:16:7: ( '}' )
            // InternalGlobalJade.g:16:9: '}'
            {
            match('}'); 

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
            // InternalGlobalJade.g:17:7: ( ',' )
            // InternalGlobalJade.g:17:9: ','
            {
            match(','); 

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
            // InternalGlobalJade.g:18:7: ( 'role' )
            // InternalGlobalJade.g:18:9: 'role'
            {
            match("role"); 


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
            // InternalGlobalJade.g:19:7: ( 'multrole' )
            // InternalGlobalJade.g:19:9: 'multrole'
            {
            match("multrole"); 


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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:21:7: ( 'rec' )
            // InternalGlobalJade.g:21:9: 'rec'
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
            // InternalGlobalJade.g:22:7: ( 'loop' )
            // InternalGlobalJade.g:22:9: 'loop'
            {
            match("loop"); 


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
            // InternalGlobalJade.g:23:7: ( ';' )
            // InternalGlobalJade.g:23:9: ';'
            {
            match(';'); 

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
            // InternalGlobalJade.g:24:7: ( 'choice' )
            // InternalGlobalJade.g:24:9: 'choice'
            {
            match("choice"); 


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
            // InternalGlobalJade.g:25:7: ( 'at' )
            // InternalGlobalJade.g:25:9: 'at'
            {
            match("at"); 


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
            // InternalGlobalJade.g:26:7: ( 'or' )
            // InternalGlobalJade.g:26:9: 'or'
            {
            match("or"); 


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
            // InternalGlobalJade.g:27:7: ( 'foreach' )
            // InternalGlobalJade.g:27:9: 'foreach'
            {
            match("foreach"); 


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
            // InternalGlobalJade.g:28:7: ( 'in' )
            // InternalGlobalJade.g:28:9: 'in'
            {
            match("in"); 


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
            // InternalGlobalJade.g:29:7: ( 'from' )
            // InternalGlobalJade.g:29:9: 'from'
            {
            match("from"); 


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
            // InternalGlobalJade.g:30:7: ( 'to' )
            // InternalGlobalJade.g:30:9: 'to'
            {
            match("to"); 


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
            // InternalGlobalJade.g:31:7: ( 'CFP' )
            // InternalGlobalJade.g:31:9: 'CFP'
            {
            match("CFP"); 


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
            // InternalGlobalJade.g:32:7: ( 'REJECT-PROPOSAL' )
            // InternalGlobalJade.g:32:9: 'REJECT-PROPOSAL'
            {
            match("REJECT-PROPOSAL"); 


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
            // InternalGlobalJade.g:33:7: ( 'ACCEPT-PROPOSAL' )
            // InternalGlobalJade.g:33:9: 'ACCEPT-PROPOSAL'
            {
            match("ACCEPT-PROPOSAL"); 


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
            // InternalGlobalJade.g:34:7: ( 'FAILURE' )
            // InternalGlobalJade.g:34:9: 'FAILURE'
            {
            match("FAILURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:35:7: ( 'INFORM-DONE' )
            // InternalGlobalJade.g:35:9: 'INFORM-DONE'
            {
            match("INFORM-DONE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:36:7: ( 'INFORM' )
            // InternalGlobalJade.g:36:9: 'INFORM'
            {
            match("INFORM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:37:7: ( 'PROPOSE' )
            // InternalGlobalJade.g:37:9: 'PROPOSE'
            {
            match("PROPOSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:38:7: ( 'int' )
            // InternalGlobalJade.g:38:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:39:7: ( 'string' )
            // InternalGlobalJade.g:39:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:40:7: ( 'action' )
            // InternalGlobalJade.g:40:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:1066:11: ( ( 'A' .. 'Z' )+ ( 'a' .. 'z' )* )
            // InternalGlobalJade.g:1066:13: ( 'A' .. 'Z' )+ ( 'a' .. 'z' )*
            {
            // InternalGlobalJade.g:1066:13: ( 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGlobalJade.g:1066:14: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalGlobalJade.g:1066:25: ( 'a' .. 'z' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGlobalJade.g:1066:26: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

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
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:1068:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGlobalJade.g:1068:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGlobalJade.g:1068:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGlobalJade.g:1068:11: '^'
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

            // InternalGlobalJade.g:1068:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:1070:10: ( ( '0' .. '9' )+ )
            // InternalGlobalJade.g:1070:12: ( '0' .. '9' )+
            {
            // InternalGlobalJade.g:1070:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGlobalJade.g:1070:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // InternalGlobalJade.g:1072:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGlobalJade.g:1072:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGlobalJade.g:1072:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGlobalJade.g:1072:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGlobalJade.g:1072:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGlobalJade.g:1072:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGlobalJade.g:1072:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:1072:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGlobalJade.g:1072:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGlobalJade.g:1072:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGlobalJade.g:1072:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalGlobalJade.g:1074:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGlobalJade.g:1074:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGlobalJade.g:1074:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGlobalJade.g:1074:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalGlobalJade.g:1076:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGlobalJade.g:1076:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGlobalJade.g:1076:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGlobalJade.g:1076:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalGlobalJade.g:1076:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGlobalJade.g:1076:41: ( '\\r' )? '\\n'
                    {
                    // InternalGlobalJade.g:1076:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalGlobalJade.g:1076:41: '\\r'
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
            // InternalGlobalJade.g:1078:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGlobalJade.g:1078:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGlobalJade.g:1078:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalGlobalJade.g:1080:16: ( . )
            // InternalGlobalJade.g:1080:18: .
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
        // InternalGlobalJade.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=38;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalGlobalJade.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalGlobalJade.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalGlobalJade.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalGlobalJade.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalGlobalJade.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalGlobalJade.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalGlobalJade.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalGlobalJade.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalGlobalJade.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalGlobalJade.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalGlobalJade.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalGlobalJade.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalGlobalJade.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalGlobalJade.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalGlobalJade.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalGlobalJade.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalGlobalJade.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalGlobalJade.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalGlobalJade.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalGlobalJade.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalGlobalJade.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalGlobalJade.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalGlobalJade.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalGlobalJade.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalGlobalJade.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalGlobalJade.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalGlobalJade.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalGlobalJade.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalGlobalJade.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalGlobalJade.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalGlobalJade.g:1:190: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 32 :
                // InternalGlobalJade.g:1:200: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalGlobalJade.g:1:208: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // InternalGlobalJade.g:1:217: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalGlobalJade.g:1:229: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalGlobalJade.g:1:245: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalGlobalJade.g:1:261: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalGlobalJade.g:1:269: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\44\5\uffff\2\44\1\uffff\1\44\1\uffff\6\44\6\72\1\44\1\72\1\42\2\uffff\3\42\2\uffff\1\44\1\uffff\1\44\5\uffff\3\44\1\uffff\1\44\1\uffff\1\44\1\117\1\44\1\121\2\44\1\125\1\126\1\72\1\uffff\7\72\1\44\5\uffff\3\44\1\141\3\44\1\uffff\1\44\1\uffff\2\44\1\150\2\uffff\1\151\5\72\3\44\1\162\1\uffff\1\44\1\164\3\44\1\170\2\uffff\5\72\3\44\1\uffff\1\44\1\uffff\3\44\1\uffff\5\72\1\44\1\u008b\2\44\1\u008e\1\u008f\1\44\3\72\1\u0095\1\72\1\u0097\1\uffff\2\44\2\uffff\1\u009a\2\uffff\1\u009b\2\uffff\1\u009c\1\uffff\1\u009d\1\u009e\5\uffff";
    static final String DFA14_eofS =
        "\u009f\uffff";
    static final String DFA14_minS =
        "\1\0\1\154\1\162\5\uffff\1\145\1\165\1\uffff\1\157\1\uffff\1\150\1\143\1\162\1\157\1\156\1\157\6\60\1\164\1\60\1\101\2\uffff\2\0\1\52\2\uffff\1\157\1\uffff\1\157\5\uffff\1\154\1\143\1\154\1\uffff\1\157\1\uffff\1\157\1\60\1\164\1\60\1\162\1\157\3\60\1\uffff\7\60\1\162\5\uffff\1\142\1\164\1\145\1\60\1\164\1\160\1\151\1\uffff\1\151\1\uffff\1\145\1\155\1\60\2\uffff\6\60\1\151\1\141\1\157\1\60\1\uffff\1\162\1\60\1\143\1\157\1\141\1\60\2\uffff\5\60\1\156\1\154\1\143\1\uffff\1\157\1\uffff\1\145\1\156\1\143\1\uffff\5\60\1\147\1\60\1\157\1\154\2\60\1\150\2\55\1\60\1\55\2\60\1\uffff\1\154\1\145\2\uffff\1\60\2\uffff\1\60\2\uffff\1\60\1\uffff\2\60\5\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\154\1\162\5\uffff\1\157\1\165\1\uffff\1\157\1\uffff\1\150\1\164\2\162\1\156\1\157\6\172\1\164\2\172\2\uffff\2\uffff\1\57\2\uffff\1\157\1\uffff\1\157\5\uffff\1\154\1\143\1\154\1\uffff\1\157\1\uffff\1\157\1\172\1\164\1\172\1\162\1\157\3\172\1\uffff\7\172\1\162\5\uffff\1\142\1\164\1\145\1\172\1\164\1\160\1\151\1\uffff\1\151\1\uffff\1\145\1\155\1\172\2\uffff\6\172\1\151\1\141\1\157\1\172\1\uffff\1\162\1\172\1\143\1\157\1\141\1\172\2\uffff\5\172\1\156\1\154\1\143\1\uffff\1\157\1\uffff\1\145\1\156\1\143\1\uffff\5\172\1\147\1\172\1\157\1\154\2\172\1\150\6\172\1\uffff\1\154\1\145\2\uffff\1\172\2\uffff\1\172\2\uffff\1\172\1\uffff\2\172\5\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\2\uffff\1\12\1\uffff\1\15\17\uffff\1\40\1\41\3\uffff\1\45\1\46\1\uffff\1\40\1\uffff\1\3\1\4\1\5\1\6\1\7\3\uffff\1\12\1\uffff\1\15\11\uffff\1\37\10\uffff\1\41\1\42\1\43\1\44\1\45\7\uffff\1\17\1\uffff\1\20\3\uffff\1\22\1\24\12\uffff\1\13\6\uffff\1\34\1\25\10\uffff\1\10\1\uffff\1\14\3\uffff\1\23\22\uffff\1\1\2\uffff\1\16\1\36\1\uffff\1\26\1\27\1\uffff\1\31\1\32\1\uffff\1\35\2\uffff\1\21\1\30\1\33\1\2\1\11";
    static final String DFA14_specialS =
        "\1\0\35\uffff\1\2\1\1\177\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\36\4\42\1\37\1\3\1\4\2\42\1\7\2\42\1\40\12\35\1\12\1\14\5\42\1\25\1\32\1\23\2\32\1\26\2\32\1\27\6\32\1\30\1\32\1\24\10\32\3\42\1\33\1\34\1\42\1\16\1\34\1\15\2\34\1\20\1\1\1\34\1\21\2\34\1\13\1\11\1\34\1\17\1\2\1\34\1\10\1\31\1\22\6\34\1\5\1\42\1\6\uff82\42",
            "\1\43",
            "\1\45",
            "",
            "",
            "",
            "",
            "",
            "\1\54\11\uffff\1\53",
            "\1\55",
            "",
            "\1\57",
            "",
            "\1\61",
            "\1\63\20\uffff\1\62",
            "\1\64",
            "\1\65\2\uffff\1\66",
            "\1\67",
            "\1\70",
            "\12\44\7\uffff\5\74\1\71\24\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\4\74\1\75\25\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\2\74\1\76\27\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\1\77\31\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\15\74\1\100\14\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\21\74\1\101\10\74\4\uffff\1\44\1\uffff\32\73",
            "\1\102",
            "\12\44\7\uffff\32\74\4\uffff\1\44\1\uffff\32\73",
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
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "",
            "\1\116",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\120",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\122",
            "\1\123",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\124\6\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\17\74\1\127\12\74\4\uffff\1\44\1\uffff\32\73",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\32\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\11\74\1\130\20\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\2\74\1\131\27\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\10\74\1\132\21\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\5\74\1\133\24\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\16\74\1\134\13\74\4\uffff\1\44\1\uffff\32\73",
            "\1\135",
            "",
            "",
            "",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\4\74\1\152\25\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\4\74\1\153\25\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\13\74\1\154\16\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\16\74\1\155\13\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\17\74\1\156\12\74\4\uffff\1\44\1\uffff\32\73",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\163",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\2\74\1\171\27\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\17\74\1\172\12\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\24\74\1\173\5\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\21\74\1\174\10\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\16\74\1\175\13\74\4\uffff\1\44\1\uffff\32\73",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\12\44\7\uffff\23\74\1\u0085\6\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\23\74\1\u0086\6\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\21\74\1\u0087\10\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\14\74\1\u0088\15\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\22\74\1\u0089\7\74\4\uffff\1\44\1\uffff\32\73",
            "\1\u008a",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008c",
            "\1\u008d",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0090",
            "\1\u0091\2\uffff\12\44\7\uffff\32\74\4\uffff\1\44\1\uffff\32\73",
            "\1\u0092\2\uffff\12\44\7\uffff\32\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\4\74\1\u0093\25\74\4\uffff\1\44\1\uffff\32\73",
            "\1\u0094\2\uffff\12\44\7\uffff\32\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\4\74\1\u0096\25\74\4\uffff\1\44\1\uffff\32\73",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\74\4\uffff\1\44\1\uffff\32\73",
            "",
            "",
            "\12\44\7\uffff\32\74\4\uffff\1\44\1\uffff\32\73",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='g') ) {s = 1;}

                        else if ( (LA14_0=='p') ) {s = 2;}

                        else if ( (LA14_0=='(') ) {s = 3;}

                        else if ( (LA14_0==')') ) {s = 4;}

                        else if ( (LA14_0=='{') ) {s = 5;}

                        else if ( (LA14_0=='}') ) {s = 6;}

                        else if ( (LA14_0==',') ) {s = 7;}

                        else if ( (LA14_0=='r') ) {s = 8;}

                        else if ( (LA14_0=='m') ) {s = 9;}

                        else if ( (LA14_0==':') ) {s = 10;}

                        else if ( (LA14_0=='l') ) {s = 11;}

                        else if ( (LA14_0==';') ) {s = 12;}

                        else if ( (LA14_0=='c') ) {s = 13;}

                        else if ( (LA14_0=='a') ) {s = 14;}

                        else if ( (LA14_0=='o') ) {s = 15;}

                        else if ( (LA14_0=='f') ) {s = 16;}

                        else if ( (LA14_0=='i') ) {s = 17;}

                        else if ( (LA14_0=='t') ) {s = 18;}

                        else if ( (LA14_0=='C') ) {s = 19;}

                        else if ( (LA14_0=='R') ) {s = 20;}

                        else if ( (LA14_0=='A') ) {s = 21;}

                        else if ( (LA14_0=='F') ) {s = 22;}

                        else if ( (LA14_0=='I') ) {s = 23;}

                        else if ( (LA14_0=='P') ) {s = 24;}

                        else if ( (LA14_0=='s') ) {s = 25;}

                        else if ( (LA14_0=='B'||(LA14_0>='D' && LA14_0<='E')||(LA14_0>='G' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='O')||LA14_0=='Q'||(LA14_0>='S' && LA14_0<='Z')) ) {s = 26;}

                        else if ( (LA14_0=='^') ) {s = 27;}

                        else if ( (LA14_0=='_'||LA14_0=='b'||(LA14_0>='d' && LA14_0<='e')||LA14_0=='h'||(LA14_0>='j' && LA14_0<='k')||LA14_0=='n'||LA14_0=='q'||(LA14_0>='u' && LA14_0<='z')) ) {s = 28;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 29;}

                        else if ( (LA14_0=='\"') ) {s = 30;}

                        else if ( (LA14_0=='\'') ) {s = 31;}

                        else if ( (LA14_0=='/') ) {s = 32;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 33;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>='<' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_31 = input.LA(1);

                        s = -1;
                        if ( ((LA14_31>='\u0000' && LA14_31<='\uFFFF')) ) {s = 68;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_30 = input.LA(1);

                        s = -1;
                        if ( ((LA14_30>='\u0000' && LA14_30<='\uFFFF')) ) {s = 68;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}