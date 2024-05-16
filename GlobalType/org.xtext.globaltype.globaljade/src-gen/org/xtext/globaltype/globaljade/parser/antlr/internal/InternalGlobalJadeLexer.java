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
    public static final int RULE_GENERAL_NAME=4;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_TYPE_MESSAGE=5;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:14:7: ( ',' )
            // InternalGlobalJade.g:14:9: ','
            {
            match(','); 

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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:18:7: ( 'forall' )
            // InternalGlobalJade.g:18:9: 'forall'
            {
            match("forall"); 


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
            // InternalGlobalJade.g:19:7: ( 'in' )
            // InternalGlobalJade.g:19:9: 'in'
            {
            match("in"); 


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
            // InternalGlobalJade.g:20:7: ( 'do' )
            // InternalGlobalJade.g:20:9: 'do'
            {
            match("do"); 


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
            // InternalGlobalJade.g:21:7: ( 'from' )
            // InternalGlobalJade.g:21:9: 'from'
            {
            match("from"); 


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
            // InternalGlobalJade.g:22:7: ( 'to' )
            // InternalGlobalJade.g:22:9: 'to'
            {
            match("to"); 


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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:24:7: ( 'role' )
            // InternalGlobalJade.g:24:9: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_TYPE_MESSAGE"
    public final void mRULE_TYPE_MESSAGE() throws RecognitionException {
        try {
            int _type = RULE_TYPE_MESSAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:473:19: ( ( 'CFP' | 'REJECT-PROPOSAL' | 'ACCEPT-PROPOSAL' ) )
            // InternalGlobalJade.g:473:21: ( 'CFP' | 'REJECT-PROPOSAL' | 'ACCEPT-PROPOSAL' )
            {
            // InternalGlobalJade.g:473:21: ( 'CFP' | 'REJECT-PROPOSAL' | 'ACCEPT-PROPOSAL' )
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
                    // InternalGlobalJade.g:473:22: 'CFP'
                    {
                    match("CFP"); 


                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:473:28: 'REJECT-PROPOSAL'
                    {
                    match("REJECT-PROPOSAL"); 


                    }
                    break;
                case 3 :
                    // InternalGlobalJade.g:473:46: 'ACCEPT-PROPOSAL'
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

    // $ANTLR start "RULE_GENERAL_NAME"
    public final void mRULE_GENERAL_NAME() throws RecognitionException {
        try {
            int _type = RULE_GENERAL_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGlobalJade.g:475:19: ( ( 'A' .. 'Z' )+ ( 'a' .. 'z' )* )
            // InternalGlobalJade.g:475:21: ( 'A' .. 'Z' )+ ( 'a' .. 'z' )*
            {
            // InternalGlobalJade.g:475:21: ( 'A' .. 'Z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGlobalJade.g:475:22: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalGlobalJade.g:475:33: ( 'a' .. 'z' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGlobalJade.g:475:34: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // InternalGlobalJade.g:477:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGlobalJade.g:477:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGlobalJade.g:477:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGlobalJade.g:477:11: '^'
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

            // InternalGlobalJade.g:477:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    break loop5;
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
            // InternalGlobalJade.g:479:10: ( ( '0' .. '9' )+ )
            // InternalGlobalJade.g:479:12: ( '0' .. '9' )+
            {
            // InternalGlobalJade.g:479:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGlobalJade.g:479:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // InternalGlobalJade.g:481:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGlobalJade.g:481:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGlobalJade.g:481:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGlobalJade.g:481:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGlobalJade.g:481:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGlobalJade.g:481:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGlobalJade.g:481:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:481:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGlobalJade.g:481:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGlobalJade.g:481:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGlobalJade.g:481:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalGlobalJade.g:483:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGlobalJade.g:483:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGlobalJade.g:483:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGlobalJade.g:483:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalGlobalJade.g:485:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGlobalJade.g:485:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGlobalJade.g:485:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGlobalJade.g:485:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalGlobalJade.g:485:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGlobalJade.g:485:41: ( '\\r' )? '\\n'
                    {
                    // InternalGlobalJade.g:485:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGlobalJade.g:485:41: '\\r'
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
            // InternalGlobalJade.g:487:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGlobalJade.g:487:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGlobalJade.g:487:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalGlobalJade.g:489:16: ( . )
            // InternalGlobalJade.g:489:18: .
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
        // InternalGlobalJade.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_TYPE_MESSAGE | RULE_GENERAL_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=23;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalGlobalJade.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalGlobalJade.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalGlobalJade.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalGlobalJade.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalGlobalJade.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalGlobalJade.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalGlobalJade.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalGlobalJade.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalGlobalJade.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalGlobalJade.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalGlobalJade.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalGlobalJade.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalGlobalJade.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalGlobalJade.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalGlobalJade.g:1:94: RULE_TYPE_MESSAGE
                {
                mRULE_TYPE_MESSAGE(); 

                }
                break;
            case 16 :
                // InternalGlobalJade.g:1:112: RULE_GENERAL_NAME
                {
                mRULE_GENERAL_NAME(); 

                }
                break;
            case 17 :
                // InternalGlobalJade.g:1:130: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // InternalGlobalJade.g:1:138: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // InternalGlobalJade.g:1:147: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalGlobalJade.g:1:159: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // InternalGlobalJade.g:1:175: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalGlobalJade.g:1:191: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalGlobalJade.g:1:199: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\2\33\5\uffff\4\33\1\uffff\1\33\4\53\1\31\2\uffff\3\31\2\uffff\1\33\1\uffff\1\33\5\uffff\2\33\1\70\1\71\1\72\1\uffff\1\33\2\53\1\uffff\3\53\5\uffff\4\33\3\uffff\1\33\1\104\2\53\3\33\1\112\1\113\1\uffff\2\53\3\33\2\uffff\2\53\1\123\1\33\1\125\2\53\1\uffff\1\33\1\uffff\1\127\1\uffff";
    static final String DFA15_eofS =
        "\130\uffff";
    static final String DFA15_minS =
        "\1\0\1\154\1\162\5\uffff\1\157\1\156\2\157\1\uffff\1\157\4\60\1\101\2\uffff\2\0\1\52\2\uffff\1\157\1\uffff\1\157\5\uffff\1\162\1\157\3\60\1\uffff\1\154\2\60\1\uffff\3\60\5\uffff\1\142\1\164\1\141\1\155\3\uffff\1\145\3\60\1\141\1\157\1\154\2\60\1\uffff\2\60\1\154\1\143\1\154\2\uffff\3\60\1\157\1\60\2\55\1\uffff\1\154\1\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\154\1\162\5\uffff\1\162\1\156\2\157\1\uffff\1\157\5\172\2\uffff\2\uffff\1\57\2\uffff\1\157\1\uffff\1\157\5\uffff\1\162\1\157\3\172\1\uffff\1\154\2\172\1\uffff\3\172\5\uffff\1\142\1\164\1\141\1\155\3\uffff\1\145\3\172\1\141\1\157\1\154\2\172\1\uffff\2\172\1\154\1\143\1\154\2\uffff\3\172\1\157\3\172\1\uffff\1\154\1\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\4\uffff\1\15\6\uffff\1\21\1\22\3\uffff\1\26\1\27\1\uffff\1\21\1\uffff\1\3\1\4\1\5\1\6\1\7\5\uffff\1\15\3\uffff\1\20\3\uffff\1\22\1\23\1\24\1\25\1\26\4\uffff\1\11\1\12\1\14\11\uffff\1\17\5\uffff\1\13\1\16\7\uffff\1\1\1\uffff\1\10\1\uffff\1\2";
    static final String DFA15_specialS =
        "\1\1\24\uffff\1\0\1\2\101\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\4\31\1\26\1\3\1\5\2\31\1\4\2\31\1\27\12\24\1\31\1\14\5\31\1\20\1\21\1\16\16\21\1\17\10\21\3\31\1\22\1\23\1\31\3\23\1\12\1\23\1\10\1\1\1\23\1\11\6\23\1\2\1\23\1\15\1\23\1\13\6\23\1\6\1\31\1\7\uff82\31",
            "\1\32",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "\1\42\2\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "\1\50",
            "\12\33\7\uffff\5\54\1\51\24\54\4\uffff\1\33\1\uffff\32\52",
            "\12\33\7\uffff\4\54\1\55\25\54\4\uffff\1\33\1\uffff\32\52",
            "\12\33\7\uffff\2\54\1\56\27\54\4\uffff\1\33\1\uffff\32\52",
            "\12\33\7\uffff\32\54\4\uffff\1\33\1\uffff\32\52",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\0\60",
            "\0\60",
            "\1\61\4\uffff\1\62",
            "",
            "",
            "\1\64",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "\1\67",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\73",
            "\12\33\7\uffff\17\54\1\74\12\54\4\uffff\1\33\1\uffff\32\52",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\52",
            "",
            "\12\33\7\uffff\32\54\4\uffff\1\33\1\uffff\32\52",
            "\12\33\7\uffff\11\54\1\75\20\54\4\uffff\1\33\1\uffff\32\52",
            "\12\33\7\uffff\2\54\1\76\27\54\4\uffff\1\33\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "\1\103",
            "\12\33\7\uffff\32\54\4\uffff\1\33\1\uffff\32\52",
            "\12\33\7\uffff\4\54\1\105\25\54\4\uffff\1\33\1\uffff\32\52",
            "\12\33\7\uffff\4\54\1\106\25\54\4\uffff\1\33\1\uffff\32\52",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\2\54\1\114\27\54\4\uffff\1\33\1\uffff\32\52",
            "\12\33\7\uffff\17\54\1\115\12\54\4\uffff\1\33\1\uffff\32\52",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "\12\33\7\uffff\23\54\1\121\6\54\4\uffff\1\33\1\uffff\32\52",
            "\12\33\7\uffff\23\54\1\122\6\54\4\uffff\1\33\1\uffff\32\52",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\124",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\104\2\uffff\12\33\7\uffff\32\54\4\uffff\1\33\1\uffff\32\52",
            "\1\104\2\uffff\12\33\7\uffff\32\54\4\uffff\1\33\1\uffff\32\52",
            "",
            "\1\126",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_TYPE_MESSAGE | RULE_GENERAL_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_21 = input.LA(1);

                        s = -1;
                        if ( ((LA15_21>='\u0000' && LA15_21<='\uFFFF')) ) {s = 48;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='g') ) {s = 1;}

                        else if ( (LA15_0=='p') ) {s = 2;}

                        else if ( (LA15_0=='(') ) {s = 3;}

                        else if ( (LA15_0==',') ) {s = 4;}

                        else if ( (LA15_0==')') ) {s = 5;}

                        else if ( (LA15_0=='{') ) {s = 6;}

                        else if ( (LA15_0=='}') ) {s = 7;}

                        else if ( (LA15_0=='f') ) {s = 8;}

                        else if ( (LA15_0=='i') ) {s = 9;}

                        else if ( (LA15_0=='d') ) {s = 10;}

                        else if ( (LA15_0=='t') ) {s = 11;}

                        else if ( (LA15_0==';') ) {s = 12;}

                        else if ( (LA15_0=='r') ) {s = 13;}

                        else if ( (LA15_0=='C') ) {s = 14;}

                        else if ( (LA15_0=='R') ) {s = 15;}

                        else if ( (LA15_0=='A') ) {s = 16;}

                        else if ( (LA15_0=='B'||(LA15_0>='D' && LA15_0<='Q')||(LA15_0>='S' && LA15_0<='Z')) ) {s = 17;}

                        else if ( (LA15_0=='^') ) {s = 18;}

                        else if ( (LA15_0=='_'||(LA15_0>='a' && LA15_0<='c')||LA15_0=='e'||LA15_0=='h'||(LA15_0>='j' && LA15_0<='o')||LA15_0=='q'||LA15_0=='s'||(LA15_0>='u' && LA15_0<='z')) ) {s = 19;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 20;}

                        else if ( (LA15_0=='\"') ) {s = 21;}

                        else if ( (LA15_0=='\'') ) {s = 22;}

                        else if ( (LA15_0=='/') ) {s = 23;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 24;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||LA15_0==':'||(LA15_0>='<' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_22 = input.LA(1);

                        s = -1;
                        if ( ((LA15_22>='\u0000' && LA15_22<='\uFFFF')) ) {s = 48;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}