package org.xtext.globaltype.globaljade.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.globaltype.globaljade.services.GlobalJadeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGlobalJadeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_GENERAL_NAME", "RULE_TYPE_MESSAGE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "')'", "'{'", "'}'", "','", "'forall'", "'in'", "'do'", "'from'", "'to'", "';'", "'role'"
    };
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


        public InternalGlobalJadeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGlobalJadeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGlobalJadeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGlobalJade.g"; }


    	private GlobalJadeGrammarAccess grammarAccess;

    	public void setGrammarAccess(GlobalJadeGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalGlobalJade.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGlobalJade.g:54:1: ( ruleModel EOF )
            // InternalGlobalJade.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalGlobalJade.g:62:1: ruleModel : ( ( rule__Model__ProtocolsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:66:2: ( ( ( rule__Model__ProtocolsAssignment )* ) )
            // InternalGlobalJade.g:67:2: ( ( rule__Model__ProtocolsAssignment )* )
            {
            // InternalGlobalJade.g:67:2: ( ( rule__Model__ProtocolsAssignment )* )
            // InternalGlobalJade.g:68:3: ( rule__Model__ProtocolsAssignment )*
            {
             before(grammarAccess.getModelAccess().getProtocolsAssignment()); 
            // InternalGlobalJade.g:69:3: ( rule__Model__ProtocolsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGlobalJade.g:69:4: rule__Model__ProtocolsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ProtocolsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getProtocolsAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleProtocols"
    // InternalGlobalJade.g:78:1: entryRuleProtocols : ruleProtocols EOF ;
    public final void entryRuleProtocols() throws RecognitionException {
        try {
            // InternalGlobalJade.g:79:1: ( ruleProtocols EOF )
            // InternalGlobalJade.g:80:1: ruleProtocols EOF
            {
             before(grammarAccess.getProtocolsRule()); 
            pushFollow(FOLLOW_1);
            ruleProtocols();

            state._fsp--;

             after(grammarAccess.getProtocolsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProtocols"


    // $ANTLR start "ruleProtocols"
    // InternalGlobalJade.g:87:1: ruleProtocols : ( ( rule__Protocols__Group__0 ) ) ;
    public final void ruleProtocols() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:91:2: ( ( ( rule__Protocols__Group__0 ) ) )
            // InternalGlobalJade.g:92:2: ( ( rule__Protocols__Group__0 ) )
            {
            // InternalGlobalJade.g:92:2: ( ( rule__Protocols__Group__0 ) )
            // InternalGlobalJade.g:93:3: ( rule__Protocols__Group__0 )
            {
             before(grammarAccess.getProtocolsAccess().getGroup()); 
            // InternalGlobalJade.g:94:3: ( rule__Protocols__Group__0 )
            // InternalGlobalJade.g:94:4: rule__Protocols__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocols__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocols"


    // $ANTLR start "entryRuleFor_loop"
    // InternalGlobalJade.g:103:1: entryRuleFor_loop : ruleFor_loop EOF ;
    public final void entryRuleFor_loop() throws RecognitionException {
        try {
            // InternalGlobalJade.g:104:1: ( ruleFor_loop EOF )
            // InternalGlobalJade.g:105:1: ruleFor_loop EOF
            {
             before(grammarAccess.getFor_loopRule()); 
            pushFollow(FOLLOW_1);
            ruleFor_loop();

            state._fsp--;

             after(grammarAccess.getFor_loopRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFor_loop"


    // $ANTLR start "ruleFor_loop"
    // InternalGlobalJade.g:112:1: ruleFor_loop : ( ( rule__For_loop__Group__0 ) ) ;
    public final void ruleFor_loop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:116:2: ( ( ( rule__For_loop__Group__0 ) ) )
            // InternalGlobalJade.g:117:2: ( ( rule__For_loop__Group__0 ) )
            {
            // InternalGlobalJade.g:117:2: ( ( rule__For_loop__Group__0 ) )
            // InternalGlobalJade.g:118:3: ( rule__For_loop__Group__0 )
            {
             before(grammarAccess.getFor_loopAccess().getGroup()); 
            // InternalGlobalJade.g:119:3: ( rule__For_loop__Group__0 )
            // InternalGlobalJade.g:119:4: rule__For_loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__For_loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFor_loopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFor_loop"


    // $ANTLR start "entryRuleGlobal_message"
    // InternalGlobalJade.g:128:1: entryRuleGlobal_message : ruleGlobal_message EOF ;
    public final void entryRuleGlobal_message() throws RecognitionException {
        try {
            // InternalGlobalJade.g:129:1: ( ruleGlobal_message EOF )
            // InternalGlobalJade.g:130:1: ruleGlobal_message EOF
            {
             before(grammarAccess.getGlobal_messageRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobal_message();

            state._fsp--;

             after(grammarAccess.getGlobal_messageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGlobal_message"


    // $ANTLR start "ruleGlobal_message"
    // InternalGlobalJade.g:137:1: ruleGlobal_message : ( ( rule__Global_message__Group__0 ) ) ;
    public final void ruleGlobal_message() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:141:2: ( ( ( rule__Global_message__Group__0 ) ) )
            // InternalGlobalJade.g:142:2: ( ( rule__Global_message__Group__0 ) )
            {
            // InternalGlobalJade.g:142:2: ( ( rule__Global_message__Group__0 ) )
            // InternalGlobalJade.g:143:3: ( rule__Global_message__Group__0 )
            {
             before(grammarAccess.getGlobal_messageAccess().getGroup()); 
            // InternalGlobalJade.g:144:3: ( rule__Global_message__Group__0 )
            // InternalGlobalJade.g:144:4: rule__Global_message__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Global_message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobal_messageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobal_message"


    // $ANTLR start "entryRuleRole"
    // InternalGlobalJade.g:153:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalGlobalJade.g:154:1: ( ruleRole EOF )
            // InternalGlobalJade.g:155:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalGlobalJade.g:162:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:166:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalGlobalJade.g:167:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalGlobalJade.g:167:2: ( ( rule__Role__Group__0 ) )
            // InternalGlobalJade.g:168:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalGlobalJade.g:169:3: ( rule__Role__Group__0 )
            // InternalGlobalJade.g:169:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "rule__Protocols__Alternatives_8"
    // InternalGlobalJade.g:177:1: rule__Protocols__Alternatives_8 : ( ( ( rule__Protocols__GlobalsAssignment_8_0 ) ) | ( ( rule__Protocols__ForLoopAssignment_8_1 ) ) );
    public final void rule__Protocols__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:181:1: ( ( ( rule__Protocols__GlobalsAssignment_8_0 ) ) | ( ( rule__Protocols__ForLoopAssignment_8_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_TYPE_MESSAGE) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGlobalJade.g:182:2: ( ( rule__Protocols__GlobalsAssignment_8_0 ) )
                    {
                    // InternalGlobalJade.g:182:2: ( ( rule__Protocols__GlobalsAssignment_8_0 ) )
                    // InternalGlobalJade.g:183:3: ( rule__Protocols__GlobalsAssignment_8_0 )
                    {
                     before(grammarAccess.getProtocolsAccess().getGlobalsAssignment_8_0()); 
                    // InternalGlobalJade.g:184:3: ( rule__Protocols__GlobalsAssignment_8_0 )
                    // InternalGlobalJade.g:184:4: rule__Protocols__GlobalsAssignment_8_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Protocols__GlobalsAssignment_8_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProtocolsAccess().getGlobalsAssignment_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:188:2: ( ( rule__Protocols__ForLoopAssignment_8_1 ) )
                    {
                    // InternalGlobalJade.g:188:2: ( ( rule__Protocols__ForLoopAssignment_8_1 ) )
                    // InternalGlobalJade.g:189:3: ( rule__Protocols__ForLoopAssignment_8_1 )
                    {
                     before(grammarAccess.getProtocolsAccess().getForLoopAssignment_8_1()); 
                    // InternalGlobalJade.g:190:3: ( rule__Protocols__ForLoopAssignment_8_1 )
                    // InternalGlobalJade.g:190:4: rule__Protocols__ForLoopAssignment_8_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Protocols__ForLoopAssignment_8_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProtocolsAccess().getForLoopAssignment_8_1()); 

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
    // $ANTLR end "rule__Protocols__Alternatives_8"


    // $ANTLR start "rule__Protocols__Group__0"
    // InternalGlobalJade.g:198:1: rule__Protocols__Group__0 : rule__Protocols__Group__0__Impl rule__Protocols__Group__1 ;
    public final void rule__Protocols__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:202:1: ( rule__Protocols__Group__0__Impl rule__Protocols__Group__1 )
            // InternalGlobalJade.g:203:2: rule__Protocols__Group__0__Impl rule__Protocols__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Protocols__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocols__Group__1();

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
    // $ANTLR end "rule__Protocols__Group__0"


    // $ANTLR start "rule__Protocols__Group__0__Impl"
    // InternalGlobalJade.g:210:1: rule__Protocols__Group__0__Impl : ( 'global' ) ;
    public final void rule__Protocols__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:214:1: ( ( 'global' ) )
            // InternalGlobalJade.g:215:1: ( 'global' )
            {
            // InternalGlobalJade.g:215:1: ( 'global' )
            // InternalGlobalJade.g:216:2: 'global'
            {
             before(grammarAccess.getProtocolsAccess().getGlobalKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProtocolsAccess().getGlobalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__Group__0__Impl"


    // $ANTLR start "rule__Protocols__Group__1"
    // InternalGlobalJade.g:225:1: rule__Protocols__Group__1 : rule__Protocols__Group__1__Impl rule__Protocols__Group__2 ;
    public final void rule__Protocols__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:229:1: ( rule__Protocols__Group__1__Impl rule__Protocols__Group__2 )
            // InternalGlobalJade.g:230:2: rule__Protocols__Group__1__Impl rule__Protocols__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Protocols__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocols__Group__2();

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
    // $ANTLR end "rule__Protocols__Group__1"


    // $ANTLR start "rule__Protocols__Group__1__Impl"
    // InternalGlobalJade.g:237:1: rule__Protocols__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__Protocols__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:241:1: ( ( 'protocol' ) )
            // InternalGlobalJade.g:242:1: ( 'protocol' )
            {
            // InternalGlobalJade.g:242:1: ( 'protocol' )
            // InternalGlobalJade.g:243:2: 'protocol'
            {
             before(grammarAccess.getProtocolsAccess().getProtocolKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProtocolsAccess().getProtocolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__Group__1__Impl"


    // $ANTLR start "rule__Protocols__Group__2"
    // InternalGlobalJade.g:252:1: rule__Protocols__Group__2 : rule__Protocols__Group__2__Impl rule__Protocols__Group__3 ;
    public final void rule__Protocols__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:256:1: ( rule__Protocols__Group__2__Impl rule__Protocols__Group__3 )
            // InternalGlobalJade.g:257:2: rule__Protocols__Group__2__Impl rule__Protocols__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Protocols__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocols__Group__3();

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
    // $ANTLR end "rule__Protocols__Group__2"


    // $ANTLR start "rule__Protocols__Group__2__Impl"
    // InternalGlobalJade.g:264:1: rule__Protocols__Group__2__Impl : ( ( rule__Protocols__NameAssignment_2 ) ) ;
    public final void rule__Protocols__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:268:1: ( ( ( rule__Protocols__NameAssignment_2 ) ) )
            // InternalGlobalJade.g:269:1: ( ( rule__Protocols__NameAssignment_2 ) )
            {
            // InternalGlobalJade.g:269:1: ( ( rule__Protocols__NameAssignment_2 ) )
            // InternalGlobalJade.g:270:2: ( rule__Protocols__NameAssignment_2 )
            {
             before(grammarAccess.getProtocolsAccess().getNameAssignment_2()); 
            // InternalGlobalJade.g:271:2: ( rule__Protocols__NameAssignment_2 )
            // InternalGlobalJade.g:271:3: rule__Protocols__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Protocols__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProtocolsAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__Group__2__Impl"


    // $ANTLR start "rule__Protocols__Group__3"
    // InternalGlobalJade.g:279:1: rule__Protocols__Group__3 : rule__Protocols__Group__3__Impl rule__Protocols__Group__4 ;
    public final void rule__Protocols__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:283:1: ( rule__Protocols__Group__3__Impl rule__Protocols__Group__4 )
            // InternalGlobalJade.g:284:2: rule__Protocols__Group__3__Impl rule__Protocols__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Protocols__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocols__Group__4();

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
    // $ANTLR end "rule__Protocols__Group__3"


    // $ANTLR start "rule__Protocols__Group__3__Impl"
    // InternalGlobalJade.g:291:1: rule__Protocols__Group__3__Impl : ( '(' ) ;
    public final void rule__Protocols__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:295:1: ( ( '(' ) )
            // InternalGlobalJade.g:296:1: ( '(' )
            {
            // InternalGlobalJade.g:296:1: ( '(' )
            // InternalGlobalJade.g:297:2: '('
            {
             before(grammarAccess.getProtocolsAccess().getLeftParenthesisKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProtocolsAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__Group__3__Impl"


    // $ANTLR start "rule__Protocols__Group__4"
    // InternalGlobalJade.g:306:1: rule__Protocols__Group__4 : rule__Protocols__Group__4__Impl rule__Protocols__Group__5 ;
    public final void rule__Protocols__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:310:1: ( rule__Protocols__Group__4__Impl rule__Protocols__Group__5 )
            // InternalGlobalJade.g:311:2: rule__Protocols__Group__4__Impl rule__Protocols__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Protocols__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocols__Group__5();

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
    // $ANTLR end "rule__Protocols__Group__4"


    // $ANTLR start "rule__Protocols__Group__4__Impl"
    // InternalGlobalJade.g:318:1: rule__Protocols__Group__4__Impl : ( ( rule__Protocols__RolesAssignment_4 ) ) ;
    public final void rule__Protocols__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:322:1: ( ( ( rule__Protocols__RolesAssignment_4 ) ) )
            // InternalGlobalJade.g:323:1: ( ( rule__Protocols__RolesAssignment_4 ) )
            {
            // InternalGlobalJade.g:323:1: ( ( rule__Protocols__RolesAssignment_4 ) )
            // InternalGlobalJade.g:324:2: ( rule__Protocols__RolesAssignment_4 )
            {
             before(grammarAccess.getProtocolsAccess().getRolesAssignment_4()); 
            // InternalGlobalJade.g:325:2: ( rule__Protocols__RolesAssignment_4 )
            // InternalGlobalJade.g:325:3: rule__Protocols__RolesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Protocols__RolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProtocolsAccess().getRolesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__Group__4__Impl"


    // $ANTLR start "rule__Protocols__Group__5"
    // InternalGlobalJade.g:333:1: rule__Protocols__Group__5 : rule__Protocols__Group__5__Impl rule__Protocols__Group__6 ;
    public final void rule__Protocols__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:337:1: ( rule__Protocols__Group__5__Impl rule__Protocols__Group__6 )
            // InternalGlobalJade.g:338:2: rule__Protocols__Group__5__Impl rule__Protocols__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Protocols__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocols__Group__6();

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
    // $ANTLR end "rule__Protocols__Group__5"


    // $ANTLR start "rule__Protocols__Group__5__Impl"
    // InternalGlobalJade.g:345:1: rule__Protocols__Group__5__Impl : ( ( rule__Protocols__Group_5__0 )* ) ;
    public final void rule__Protocols__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:349:1: ( ( ( rule__Protocols__Group_5__0 )* ) )
            // InternalGlobalJade.g:350:1: ( ( rule__Protocols__Group_5__0 )* )
            {
            // InternalGlobalJade.g:350:1: ( ( rule__Protocols__Group_5__0 )* )
            // InternalGlobalJade.g:351:2: ( rule__Protocols__Group_5__0 )*
            {
             before(grammarAccess.getProtocolsAccess().getGroup_5()); 
            // InternalGlobalJade.g:352:2: ( rule__Protocols__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGlobalJade.g:352:3: rule__Protocols__Group_5__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Protocols__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProtocolsAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__Group__5__Impl"


    // $ANTLR start "rule__Protocols__Group__6"
    // InternalGlobalJade.g:360:1: rule__Protocols__Group__6 : rule__Protocols__Group__6__Impl rule__Protocols__Group__7 ;
    public final void rule__Protocols__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:364:1: ( rule__Protocols__Group__6__Impl rule__Protocols__Group__7 )
            // InternalGlobalJade.g:365:2: rule__Protocols__Group__6__Impl rule__Protocols__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Protocols__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocols__Group__7();

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
    // $ANTLR end "rule__Protocols__Group__6"


    // $ANTLR start "rule__Protocols__Group__6__Impl"
    // InternalGlobalJade.g:372:1: rule__Protocols__Group__6__Impl : ( ')' ) ;
    public final void rule__Protocols__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:376:1: ( ( ')' ) )
            // InternalGlobalJade.g:377:1: ( ')' )
            {
            // InternalGlobalJade.g:377:1: ( ')' )
            // InternalGlobalJade.g:378:2: ')'
            {
             before(grammarAccess.getProtocolsAccess().getRightParenthesisKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProtocolsAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__Group__6__Impl"


    // $ANTLR start "rule__Protocols__Group__7"
    // InternalGlobalJade.g:387:1: rule__Protocols__Group__7 : rule__Protocols__Group__7__Impl rule__Protocols__Group__8 ;
    public final void rule__Protocols__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:391:1: ( rule__Protocols__Group__7__Impl rule__Protocols__Group__8 )
            // InternalGlobalJade.g:392:2: rule__Protocols__Group__7__Impl rule__Protocols__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Protocols__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocols__Group__8();

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
    // $ANTLR end "rule__Protocols__Group__7"


    // $ANTLR start "rule__Protocols__Group__7__Impl"
    // InternalGlobalJade.g:399:1: rule__Protocols__Group__7__Impl : ( '{' ) ;
    public final void rule__Protocols__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:403:1: ( ( '{' ) )
            // InternalGlobalJade.g:404:1: ( '{' )
            {
            // InternalGlobalJade.g:404:1: ( '{' )
            // InternalGlobalJade.g:405:2: '{'
            {
             before(grammarAccess.getProtocolsAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProtocolsAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__Group__7__Impl"


    // $ANTLR start "rule__Protocols__Group__8"
    // InternalGlobalJade.g:414:1: rule__Protocols__Group__8 : rule__Protocols__Group__8__Impl rule__Protocols__Group__9 ;
    public final void rule__Protocols__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:418:1: ( rule__Protocols__Group__8__Impl rule__Protocols__Group__9 )
            // InternalGlobalJade.g:419:2: rule__Protocols__Group__8__Impl rule__Protocols__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Protocols__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocols__Group__9();

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
    // $ANTLR end "rule__Protocols__Group__8"


    // $ANTLR start "rule__Protocols__Group__8__Impl"
    // InternalGlobalJade.g:426:1: rule__Protocols__Group__8__Impl : ( ( ( rule__Protocols__Alternatives_8 ) ) ( ( rule__Protocols__Alternatives_8 )* ) ) ;
    public final void rule__Protocols__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:430:1: ( ( ( ( rule__Protocols__Alternatives_8 ) ) ( ( rule__Protocols__Alternatives_8 )* ) ) )
            // InternalGlobalJade.g:431:1: ( ( ( rule__Protocols__Alternatives_8 ) ) ( ( rule__Protocols__Alternatives_8 )* ) )
            {
            // InternalGlobalJade.g:431:1: ( ( ( rule__Protocols__Alternatives_8 ) ) ( ( rule__Protocols__Alternatives_8 )* ) )
            // InternalGlobalJade.g:432:2: ( ( rule__Protocols__Alternatives_8 ) ) ( ( rule__Protocols__Alternatives_8 )* )
            {
            // InternalGlobalJade.g:432:2: ( ( rule__Protocols__Alternatives_8 ) )
            // InternalGlobalJade.g:433:3: ( rule__Protocols__Alternatives_8 )
            {
             before(grammarAccess.getProtocolsAccess().getAlternatives_8()); 
            // InternalGlobalJade.g:434:3: ( rule__Protocols__Alternatives_8 )
            // InternalGlobalJade.g:434:4: rule__Protocols__Alternatives_8
            {
            pushFollow(FOLLOW_13);
            rule__Protocols__Alternatives_8();

            state._fsp--;


            }

             after(grammarAccess.getProtocolsAccess().getAlternatives_8()); 

            }

            // InternalGlobalJade.g:437:2: ( ( rule__Protocols__Alternatives_8 )* )
            // InternalGlobalJade.g:438:3: ( rule__Protocols__Alternatives_8 )*
            {
             before(grammarAccess.getProtocolsAccess().getAlternatives_8()); 
            // InternalGlobalJade.g:439:3: ( rule__Protocols__Alternatives_8 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TYPE_MESSAGE||LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGlobalJade.g:439:4: rule__Protocols__Alternatives_8
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Protocols__Alternatives_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProtocolsAccess().getAlternatives_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__Group__8__Impl"


    // $ANTLR start "rule__Protocols__Group__9"
    // InternalGlobalJade.g:448:1: rule__Protocols__Group__9 : rule__Protocols__Group__9__Impl ;
    public final void rule__Protocols__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:452:1: ( rule__Protocols__Group__9__Impl )
            // InternalGlobalJade.g:453:2: rule__Protocols__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocols__Group__9__Impl();

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
    // $ANTLR end "rule__Protocols__Group__9"


    // $ANTLR start "rule__Protocols__Group__9__Impl"
    // InternalGlobalJade.g:459:1: rule__Protocols__Group__9__Impl : ( '}' ) ;
    public final void rule__Protocols__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:463:1: ( ( '}' ) )
            // InternalGlobalJade.g:464:1: ( '}' )
            {
            // InternalGlobalJade.g:464:1: ( '}' )
            // InternalGlobalJade.g:465:2: '}'
            {
             before(grammarAccess.getProtocolsAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProtocolsAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__Group__9__Impl"


    // $ANTLR start "rule__Protocols__Group_5__0"
    // InternalGlobalJade.g:475:1: rule__Protocols__Group_5__0 : rule__Protocols__Group_5__0__Impl rule__Protocols__Group_5__1 ;
    public final void rule__Protocols__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:479:1: ( rule__Protocols__Group_5__0__Impl rule__Protocols__Group_5__1 )
            // InternalGlobalJade.g:480:2: rule__Protocols__Group_5__0__Impl rule__Protocols__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Protocols__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocols__Group_5__1();

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
    // $ANTLR end "rule__Protocols__Group_5__0"


    // $ANTLR start "rule__Protocols__Group_5__0__Impl"
    // InternalGlobalJade.g:487:1: rule__Protocols__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Protocols__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:491:1: ( ( ',' ) )
            // InternalGlobalJade.g:492:1: ( ',' )
            {
            // InternalGlobalJade.g:492:1: ( ',' )
            // InternalGlobalJade.g:493:2: ','
            {
             before(grammarAccess.getProtocolsAccess().getCommaKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProtocolsAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__Group_5__0__Impl"


    // $ANTLR start "rule__Protocols__Group_5__1"
    // InternalGlobalJade.g:502:1: rule__Protocols__Group_5__1 : rule__Protocols__Group_5__1__Impl ;
    public final void rule__Protocols__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:506:1: ( rule__Protocols__Group_5__1__Impl )
            // InternalGlobalJade.g:507:2: rule__Protocols__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocols__Group_5__1__Impl();

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
    // $ANTLR end "rule__Protocols__Group_5__1"


    // $ANTLR start "rule__Protocols__Group_5__1__Impl"
    // InternalGlobalJade.g:513:1: rule__Protocols__Group_5__1__Impl : ( ( rule__Protocols__RolesAssignment_5_1 ) ) ;
    public final void rule__Protocols__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:517:1: ( ( ( rule__Protocols__RolesAssignment_5_1 ) ) )
            // InternalGlobalJade.g:518:1: ( ( rule__Protocols__RolesAssignment_5_1 ) )
            {
            // InternalGlobalJade.g:518:1: ( ( rule__Protocols__RolesAssignment_5_1 ) )
            // InternalGlobalJade.g:519:2: ( rule__Protocols__RolesAssignment_5_1 )
            {
             before(grammarAccess.getProtocolsAccess().getRolesAssignment_5_1()); 
            // InternalGlobalJade.g:520:2: ( rule__Protocols__RolesAssignment_5_1 )
            // InternalGlobalJade.g:520:3: rule__Protocols__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Protocols__RolesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolsAccess().getRolesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__Group_5__1__Impl"


    // $ANTLR start "rule__For_loop__Group__0"
    // InternalGlobalJade.g:529:1: rule__For_loop__Group__0 : rule__For_loop__Group__0__Impl rule__For_loop__Group__1 ;
    public final void rule__For_loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:533:1: ( rule__For_loop__Group__0__Impl rule__For_loop__Group__1 )
            // InternalGlobalJade.g:534:2: rule__For_loop__Group__0__Impl rule__For_loop__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__For_loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For_loop__Group__1();

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
    // $ANTLR end "rule__For_loop__Group__0"


    // $ANTLR start "rule__For_loop__Group__0__Impl"
    // InternalGlobalJade.g:541:1: rule__For_loop__Group__0__Impl : ( 'forall' ) ;
    public final void rule__For_loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:545:1: ( ( 'forall' ) )
            // InternalGlobalJade.g:546:1: ( 'forall' )
            {
            // InternalGlobalJade.g:546:1: ( 'forall' )
            // InternalGlobalJade.g:547:2: 'forall'
            {
             before(grammarAccess.getFor_loopAccess().getForallKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFor_loopAccess().getForallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_loop__Group__0__Impl"


    // $ANTLR start "rule__For_loop__Group__1"
    // InternalGlobalJade.g:556:1: rule__For_loop__Group__1 : rule__For_loop__Group__1__Impl rule__For_loop__Group__2 ;
    public final void rule__For_loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:560:1: ( rule__For_loop__Group__1__Impl rule__For_loop__Group__2 )
            // InternalGlobalJade.g:561:2: rule__For_loop__Group__1__Impl rule__For_loop__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__For_loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For_loop__Group__2();

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
    // $ANTLR end "rule__For_loop__Group__1"


    // $ANTLR start "rule__For_loop__Group__1__Impl"
    // InternalGlobalJade.g:568:1: rule__For_loop__Group__1__Impl : ( ( rule__For_loop__NameAssignment_1 ) ) ;
    public final void rule__For_loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:572:1: ( ( ( rule__For_loop__NameAssignment_1 ) ) )
            // InternalGlobalJade.g:573:1: ( ( rule__For_loop__NameAssignment_1 ) )
            {
            // InternalGlobalJade.g:573:1: ( ( rule__For_loop__NameAssignment_1 ) )
            // InternalGlobalJade.g:574:2: ( rule__For_loop__NameAssignment_1 )
            {
             before(grammarAccess.getFor_loopAccess().getNameAssignment_1()); 
            // InternalGlobalJade.g:575:2: ( rule__For_loop__NameAssignment_1 )
            // InternalGlobalJade.g:575:3: rule__For_loop__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__For_loop__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFor_loopAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_loop__Group__1__Impl"


    // $ANTLR start "rule__For_loop__Group__2"
    // InternalGlobalJade.g:583:1: rule__For_loop__Group__2 : rule__For_loop__Group__2__Impl rule__For_loop__Group__3 ;
    public final void rule__For_loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:587:1: ( rule__For_loop__Group__2__Impl rule__For_loop__Group__3 )
            // InternalGlobalJade.g:588:2: rule__For_loop__Group__2__Impl rule__For_loop__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__For_loop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For_loop__Group__3();

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
    // $ANTLR end "rule__For_loop__Group__2"


    // $ANTLR start "rule__For_loop__Group__2__Impl"
    // InternalGlobalJade.g:595:1: rule__For_loop__Group__2__Impl : ( 'in' ) ;
    public final void rule__For_loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:599:1: ( ( 'in' ) )
            // InternalGlobalJade.g:600:1: ( 'in' )
            {
            // InternalGlobalJade.g:600:1: ( 'in' )
            // InternalGlobalJade.g:601:2: 'in'
            {
             before(grammarAccess.getFor_loopAccess().getInKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFor_loopAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_loop__Group__2__Impl"


    // $ANTLR start "rule__For_loop__Group__3"
    // InternalGlobalJade.g:610:1: rule__For_loop__Group__3 : rule__For_loop__Group__3__Impl rule__For_loop__Group__4 ;
    public final void rule__For_loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:614:1: ( rule__For_loop__Group__3__Impl rule__For_loop__Group__4 )
            // InternalGlobalJade.g:615:2: rule__For_loop__Group__3__Impl rule__For_loop__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__For_loop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For_loop__Group__4();

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
    // $ANTLR end "rule__For_loop__Group__3"


    // $ANTLR start "rule__For_loop__Group__3__Impl"
    // InternalGlobalJade.g:622:1: rule__For_loop__Group__3__Impl : ( ( rule__For_loop__RoleAssignment_3 ) ) ;
    public final void rule__For_loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:626:1: ( ( ( rule__For_loop__RoleAssignment_3 ) ) )
            // InternalGlobalJade.g:627:1: ( ( rule__For_loop__RoleAssignment_3 ) )
            {
            // InternalGlobalJade.g:627:1: ( ( rule__For_loop__RoleAssignment_3 ) )
            // InternalGlobalJade.g:628:2: ( rule__For_loop__RoleAssignment_3 )
            {
             before(grammarAccess.getFor_loopAccess().getRoleAssignment_3()); 
            // InternalGlobalJade.g:629:2: ( rule__For_loop__RoleAssignment_3 )
            // InternalGlobalJade.g:629:3: rule__For_loop__RoleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__For_loop__RoleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFor_loopAccess().getRoleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_loop__Group__3__Impl"


    // $ANTLR start "rule__For_loop__Group__4"
    // InternalGlobalJade.g:637:1: rule__For_loop__Group__4 : rule__For_loop__Group__4__Impl rule__For_loop__Group__5 ;
    public final void rule__For_loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:641:1: ( rule__For_loop__Group__4__Impl rule__For_loop__Group__5 )
            // InternalGlobalJade.g:642:2: rule__For_loop__Group__4__Impl rule__For_loop__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__For_loop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For_loop__Group__5();

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
    // $ANTLR end "rule__For_loop__Group__4"


    // $ANTLR start "rule__For_loop__Group__4__Impl"
    // InternalGlobalJade.g:649:1: rule__For_loop__Group__4__Impl : ( 'do' ) ;
    public final void rule__For_loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:653:1: ( ( 'do' ) )
            // InternalGlobalJade.g:654:1: ( 'do' )
            {
            // InternalGlobalJade.g:654:1: ( 'do' )
            // InternalGlobalJade.g:655:2: 'do'
            {
             before(grammarAccess.getFor_loopAccess().getDoKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFor_loopAccess().getDoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_loop__Group__4__Impl"


    // $ANTLR start "rule__For_loop__Group__5"
    // InternalGlobalJade.g:664:1: rule__For_loop__Group__5 : rule__For_loop__Group__5__Impl rule__For_loop__Group__6 ;
    public final void rule__For_loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:668:1: ( rule__For_loop__Group__5__Impl rule__For_loop__Group__6 )
            // InternalGlobalJade.g:669:2: rule__For_loop__Group__5__Impl rule__For_loop__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__For_loop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For_loop__Group__6();

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
    // $ANTLR end "rule__For_loop__Group__5"


    // $ANTLR start "rule__For_loop__Group__5__Impl"
    // InternalGlobalJade.g:676:1: rule__For_loop__Group__5__Impl : ( '{' ) ;
    public final void rule__For_loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:680:1: ( ( '{' ) )
            // InternalGlobalJade.g:681:1: ( '{' )
            {
            // InternalGlobalJade.g:681:1: ( '{' )
            // InternalGlobalJade.g:682:2: '{'
            {
             before(grammarAccess.getFor_loopAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFor_loopAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_loop__Group__5__Impl"


    // $ANTLR start "rule__For_loop__Group__6"
    // InternalGlobalJade.g:691:1: rule__For_loop__Group__6 : rule__For_loop__Group__6__Impl rule__For_loop__Group__7 ;
    public final void rule__For_loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:695:1: ( rule__For_loop__Group__6__Impl rule__For_loop__Group__7 )
            // InternalGlobalJade.g:696:2: rule__For_loop__Group__6__Impl rule__For_loop__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__For_loop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For_loop__Group__7();

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
    // $ANTLR end "rule__For_loop__Group__6"


    // $ANTLR start "rule__For_loop__Group__6__Impl"
    // InternalGlobalJade.g:703:1: rule__For_loop__Group__6__Impl : ( ( rule__For_loop__GlobalsAssignment_6 )* ) ;
    public final void rule__For_loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:707:1: ( ( ( rule__For_loop__GlobalsAssignment_6 )* ) )
            // InternalGlobalJade.g:708:1: ( ( rule__For_loop__GlobalsAssignment_6 )* )
            {
            // InternalGlobalJade.g:708:1: ( ( rule__For_loop__GlobalsAssignment_6 )* )
            // InternalGlobalJade.g:709:2: ( rule__For_loop__GlobalsAssignment_6 )*
            {
             before(grammarAccess.getFor_loopAccess().getGlobalsAssignment_6()); 
            // InternalGlobalJade.g:710:2: ( rule__For_loop__GlobalsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TYPE_MESSAGE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGlobalJade.g:710:3: rule__For_loop__GlobalsAssignment_6
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__For_loop__GlobalsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFor_loopAccess().getGlobalsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_loop__Group__6__Impl"


    // $ANTLR start "rule__For_loop__Group__7"
    // InternalGlobalJade.g:718:1: rule__For_loop__Group__7 : rule__For_loop__Group__7__Impl ;
    public final void rule__For_loop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:722:1: ( rule__For_loop__Group__7__Impl )
            // InternalGlobalJade.g:723:2: rule__For_loop__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__For_loop__Group__7__Impl();

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
    // $ANTLR end "rule__For_loop__Group__7"


    // $ANTLR start "rule__For_loop__Group__7__Impl"
    // InternalGlobalJade.g:729:1: rule__For_loop__Group__7__Impl : ( '}' ) ;
    public final void rule__For_loop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:733:1: ( ( '}' ) )
            // InternalGlobalJade.g:734:1: ( '}' )
            {
            // InternalGlobalJade.g:734:1: ( '}' )
            // InternalGlobalJade.g:735:2: '}'
            {
             before(grammarAccess.getFor_loopAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFor_loopAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_loop__Group__7__Impl"


    // $ANTLR start "rule__Global_message__Group__0"
    // InternalGlobalJade.g:745:1: rule__Global_message__Group__0 : rule__Global_message__Group__0__Impl rule__Global_message__Group__1 ;
    public final void rule__Global_message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:749:1: ( rule__Global_message__Group__0__Impl rule__Global_message__Group__1 )
            // InternalGlobalJade.g:750:2: rule__Global_message__Group__0__Impl rule__Global_message__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Global_message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global_message__Group__1();

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
    // $ANTLR end "rule__Global_message__Group__0"


    // $ANTLR start "rule__Global_message__Group__0__Impl"
    // InternalGlobalJade.g:757:1: rule__Global_message__Group__0__Impl : ( ( rule__Global_message__TypeAssignment_0 ) ) ;
    public final void rule__Global_message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:761:1: ( ( ( rule__Global_message__TypeAssignment_0 ) ) )
            // InternalGlobalJade.g:762:1: ( ( rule__Global_message__TypeAssignment_0 ) )
            {
            // InternalGlobalJade.g:762:1: ( ( rule__Global_message__TypeAssignment_0 ) )
            // InternalGlobalJade.g:763:2: ( rule__Global_message__TypeAssignment_0 )
            {
             before(grammarAccess.getGlobal_messageAccess().getTypeAssignment_0()); 
            // InternalGlobalJade.g:764:2: ( rule__Global_message__TypeAssignment_0 )
            // InternalGlobalJade.g:764:3: rule__Global_message__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Global_message__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGlobal_messageAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global_message__Group__0__Impl"


    // $ANTLR start "rule__Global_message__Group__1"
    // InternalGlobalJade.g:772:1: rule__Global_message__Group__1 : rule__Global_message__Group__1__Impl rule__Global_message__Group__2 ;
    public final void rule__Global_message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:776:1: ( rule__Global_message__Group__1__Impl rule__Global_message__Group__2 )
            // InternalGlobalJade.g:777:2: rule__Global_message__Group__1__Impl rule__Global_message__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Global_message__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global_message__Group__2();

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
    // $ANTLR end "rule__Global_message__Group__1"


    // $ANTLR start "rule__Global_message__Group__1__Impl"
    // InternalGlobalJade.g:784:1: rule__Global_message__Group__1__Impl : ( '(' ) ;
    public final void rule__Global_message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:788:1: ( ( '(' ) )
            // InternalGlobalJade.g:789:1: ( '(' )
            {
            // InternalGlobalJade.g:789:1: ( '(' )
            // InternalGlobalJade.g:790:2: '('
            {
             before(grammarAccess.getGlobal_messageAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGlobal_messageAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global_message__Group__1__Impl"


    // $ANTLR start "rule__Global_message__Group__2"
    // InternalGlobalJade.g:799:1: rule__Global_message__Group__2 : rule__Global_message__Group__2__Impl rule__Global_message__Group__3 ;
    public final void rule__Global_message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:803:1: ( rule__Global_message__Group__2__Impl rule__Global_message__Group__3 )
            // InternalGlobalJade.g:804:2: rule__Global_message__Group__2__Impl rule__Global_message__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Global_message__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global_message__Group__3();

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
    // $ANTLR end "rule__Global_message__Group__2"


    // $ANTLR start "rule__Global_message__Group__2__Impl"
    // InternalGlobalJade.g:811:1: rule__Global_message__Group__2__Impl : ( ')' ) ;
    public final void rule__Global_message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:815:1: ( ( ')' ) )
            // InternalGlobalJade.g:816:1: ( ')' )
            {
            // InternalGlobalJade.g:816:1: ( ')' )
            // InternalGlobalJade.g:817:2: ')'
            {
             before(grammarAccess.getGlobal_messageAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGlobal_messageAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global_message__Group__2__Impl"


    // $ANTLR start "rule__Global_message__Group__3"
    // InternalGlobalJade.g:826:1: rule__Global_message__Group__3 : rule__Global_message__Group__3__Impl rule__Global_message__Group__4 ;
    public final void rule__Global_message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:830:1: ( rule__Global_message__Group__3__Impl rule__Global_message__Group__4 )
            // InternalGlobalJade.g:831:2: rule__Global_message__Group__3__Impl rule__Global_message__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Global_message__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global_message__Group__4();

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
    // $ANTLR end "rule__Global_message__Group__3"


    // $ANTLR start "rule__Global_message__Group__3__Impl"
    // InternalGlobalJade.g:838:1: rule__Global_message__Group__3__Impl : ( 'from' ) ;
    public final void rule__Global_message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:842:1: ( ( 'from' ) )
            // InternalGlobalJade.g:843:1: ( 'from' )
            {
            // InternalGlobalJade.g:843:1: ( 'from' )
            // InternalGlobalJade.g:844:2: 'from'
            {
             before(grammarAccess.getGlobal_messageAccess().getFromKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGlobal_messageAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global_message__Group__3__Impl"


    // $ANTLR start "rule__Global_message__Group__4"
    // InternalGlobalJade.g:853:1: rule__Global_message__Group__4 : rule__Global_message__Group__4__Impl rule__Global_message__Group__5 ;
    public final void rule__Global_message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:857:1: ( rule__Global_message__Group__4__Impl rule__Global_message__Group__5 )
            // InternalGlobalJade.g:858:2: rule__Global_message__Group__4__Impl rule__Global_message__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Global_message__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global_message__Group__5();

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
    // $ANTLR end "rule__Global_message__Group__4"


    // $ANTLR start "rule__Global_message__Group__4__Impl"
    // InternalGlobalJade.g:865:1: rule__Global_message__Group__4__Impl : ( ( rule__Global_message__RoleAAssignment_4 ) ) ;
    public final void rule__Global_message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:869:1: ( ( ( rule__Global_message__RoleAAssignment_4 ) ) )
            // InternalGlobalJade.g:870:1: ( ( rule__Global_message__RoleAAssignment_4 ) )
            {
            // InternalGlobalJade.g:870:1: ( ( rule__Global_message__RoleAAssignment_4 ) )
            // InternalGlobalJade.g:871:2: ( rule__Global_message__RoleAAssignment_4 )
            {
             before(grammarAccess.getGlobal_messageAccess().getRoleAAssignment_4()); 
            // InternalGlobalJade.g:872:2: ( rule__Global_message__RoleAAssignment_4 )
            // InternalGlobalJade.g:872:3: rule__Global_message__RoleAAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Global_message__RoleAAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGlobal_messageAccess().getRoleAAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global_message__Group__4__Impl"


    // $ANTLR start "rule__Global_message__Group__5"
    // InternalGlobalJade.g:880:1: rule__Global_message__Group__5 : rule__Global_message__Group__5__Impl rule__Global_message__Group__6 ;
    public final void rule__Global_message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:884:1: ( rule__Global_message__Group__5__Impl rule__Global_message__Group__6 )
            // InternalGlobalJade.g:885:2: rule__Global_message__Group__5__Impl rule__Global_message__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Global_message__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global_message__Group__6();

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
    // $ANTLR end "rule__Global_message__Group__5"


    // $ANTLR start "rule__Global_message__Group__5__Impl"
    // InternalGlobalJade.g:892:1: rule__Global_message__Group__5__Impl : ( 'to' ) ;
    public final void rule__Global_message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:896:1: ( ( 'to' ) )
            // InternalGlobalJade.g:897:1: ( 'to' )
            {
            // InternalGlobalJade.g:897:1: ( 'to' )
            // InternalGlobalJade.g:898:2: 'to'
            {
             before(grammarAccess.getGlobal_messageAccess().getToKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGlobal_messageAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global_message__Group__5__Impl"


    // $ANTLR start "rule__Global_message__Group__6"
    // InternalGlobalJade.g:907:1: rule__Global_message__Group__6 : rule__Global_message__Group__6__Impl rule__Global_message__Group__7 ;
    public final void rule__Global_message__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:911:1: ( rule__Global_message__Group__6__Impl rule__Global_message__Group__7 )
            // InternalGlobalJade.g:912:2: rule__Global_message__Group__6__Impl rule__Global_message__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Global_message__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global_message__Group__7();

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
    // $ANTLR end "rule__Global_message__Group__6"


    // $ANTLR start "rule__Global_message__Group__6__Impl"
    // InternalGlobalJade.g:919:1: rule__Global_message__Group__6__Impl : ( ( rule__Global_message__RoleBAssignment_6 ) ) ;
    public final void rule__Global_message__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:923:1: ( ( ( rule__Global_message__RoleBAssignment_6 ) ) )
            // InternalGlobalJade.g:924:1: ( ( rule__Global_message__RoleBAssignment_6 ) )
            {
            // InternalGlobalJade.g:924:1: ( ( rule__Global_message__RoleBAssignment_6 ) )
            // InternalGlobalJade.g:925:2: ( rule__Global_message__RoleBAssignment_6 )
            {
             before(grammarAccess.getGlobal_messageAccess().getRoleBAssignment_6()); 
            // InternalGlobalJade.g:926:2: ( rule__Global_message__RoleBAssignment_6 )
            // InternalGlobalJade.g:926:3: rule__Global_message__RoleBAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Global_message__RoleBAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGlobal_messageAccess().getRoleBAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global_message__Group__6__Impl"


    // $ANTLR start "rule__Global_message__Group__7"
    // InternalGlobalJade.g:934:1: rule__Global_message__Group__7 : rule__Global_message__Group__7__Impl ;
    public final void rule__Global_message__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:938:1: ( rule__Global_message__Group__7__Impl )
            // InternalGlobalJade.g:939:2: rule__Global_message__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global_message__Group__7__Impl();

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
    // $ANTLR end "rule__Global_message__Group__7"


    // $ANTLR start "rule__Global_message__Group__7__Impl"
    // InternalGlobalJade.g:945:1: rule__Global_message__Group__7__Impl : ( ';' ) ;
    public final void rule__Global_message__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:949:1: ( ( ';' ) )
            // InternalGlobalJade.g:950:1: ( ';' )
            {
            // InternalGlobalJade.g:950:1: ( ';' )
            // InternalGlobalJade.g:951:2: ';'
            {
             before(grammarAccess.getGlobal_messageAccess().getSemicolonKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGlobal_messageAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global_message__Group__7__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalGlobalJade.g:961:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:965:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalGlobalJade.g:966:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

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
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalGlobalJade.g:973:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:977:1: ( ( 'role' ) )
            // InternalGlobalJade.g:978:1: ( 'role' )
            {
            // InternalGlobalJade.g:978:1: ( 'role' )
            // InternalGlobalJade.g:979:2: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalGlobalJade.g:988:1: rule__Role__Group__1 : rule__Role__Group__1__Impl ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:992:1: ( rule__Role__Group__1__Impl )
            // InternalGlobalJade.g:993:2: rule__Role__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__1__Impl();

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
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalGlobalJade.g:999:1: rule__Role__Group__1__Impl : ( ( rule__Role__RoleAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1003:1: ( ( ( rule__Role__RoleAssignment_1 ) ) )
            // InternalGlobalJade.g:1004:1: ( ( rule__Role__RoleAssignment_1 ) )
            {
            // InternalGlobalJade.g:1004:1: ( ( rule__Role__RoleAssignment_1 ) )
            // InternalGlobalJade.g:1005:2: ( rule__Role__RoleAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getRoleAssignment_1()); 
            // InternalGlobalJade.g:1006:2: ( rule__Role__RoleAssignment_1 )
            // InternalGlobalJade.g:1006:3: rule__Role__RoleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__RoleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getRoleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Model__ProtocolsAssignment"
    // InternalGlobalJade.g:1015:1: rule__Model__ProtocolsAssignment : ( ruleProtocols ) ;
    public final void rule__Model__ProtocolsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1019:1: ( ( ruleProtocols ) )
            // InternalGlobalJade.g:1020:2: ( ruleProtocols )
            {
            // InternalGlobalJade.g:1020:2: ( ruleProtocols )
            // InternalGlobalJade.g:1021:3: ruleProtocols
            {
             before(grammarAccess.getModelAccess().getProtocolsProtocolsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocols();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProtocolsProtocolsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProtocolsAssignment"


    // $ANTLR start "rule__Protocols__NameAssignment_2"
    // InternalGlobalJade.g:1030:1: rule__Protocols__NameAssignment_2 : ( RULE_GENERAL_NAME ) ;
    public final void rule__Protocols__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1034:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1035:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1035:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1036:3: RULE_GENERAL_NAME
            {
             before(grammarAccess.getProtocolsAccess().getNameGENERAL_NAMETerminalRuleCall_2_0()); 
            match(input,RULE_GENERAL_NAME,FOLLOW_2); 
             after(grammarAccess.getProtocolsAccess().getNameGENERAL_NAMETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__NameAssignment_2"


    // $ANTLR start "rule__Protocols__RolesAssignment_4"
    // InternalGlobalJade.g:1045:1: rule__Protocols__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__Protocols__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1049:1: ( ( ruleRole ) )
            // InternalGlobalJade.g:1050:2: ( ruleRole )
            {
            // InternalGlobalJade.g:1050:2: ( ruleRole )
            // InternalGlobalJade.g:1051:3: ruleRole
            {
             before(grammarAccess.getProtocolsAccess().getRolesRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getProtocolsAccess().getRolesRoleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__RolesAssignment_4"


    // $ANTLR start "rule__Protocols__RolesAssignment_5_1"
    // InternalGlobalJade.g:1060:1: rule__Protocols__RolesAssignment_5_1 : ( ruleRole ) ;
    public final void rule__Protocols__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1064:1: ( ( ruleRole ) )
            // InternalGlobalJade.g:1065:2: ( ruleRole )
            {
            // InternalGlobalJade.g:1065:2: ( ruleRole )
            // InternalGlobalJade.g:1066:3: ruleRole
            {
             before(grammarAccess.getProtocolsAccess().getRolesRoleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getProtocolsAccess().getRolesRoleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__RolesAssignment_5_1"


    // $ANTLR start "rule__Protocols__GlobalsAssignment_8_0"
    // InternalGlobalJade.g:1075:1: rule__Protocols__GlobalsAssignment_8_0 : ( ruleGlobal_message ) ;
    public final void rule__Protocols__GlobalsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1079:1: ( ( ruleGlobal_message ) )
            // InternalGlobalJade.g:1080:2: ( ruleGlobal_message )
            {
            // InternalGlobalJade.g:1080:2: ( ruleGlobal_message )
            // InternalGlobalJade.g:1081:3: ruleGlobal_message
            {
             before(grammarAccess.getProtocolsAccess().getGlobalsGlobal_messageParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobal_message();

            state._fsp--;

             after(grammarAccess.getProtocolsAccess().getGlobalsGlobal_messageParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__GlobalsAssignment_8_0"


    // $ANTLR start "rule__Protocols__ForLoopAssignment_8_1"
    // InternalGlobalJade.g:1090:1: rule__Protocols__ForLoopAssignment_8_1 : ( ruleFor_loop ) ;
    public final void rule__Protocols__ForLoopAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1094:1: ( ( ruleFor_loop ) )
            // InternalGlobalJade.g:1095:2: ( ruleFor_loop )
            {
            // InternalGlobalJade.g:1095:2: ( ruleFor_loop )
            // InternalGlobalJade.g:1096:3: ruleFor_loop
            {
             before(grammarAccess.getProtocolsAccess().getForLoopFor_loopParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFor_loop();

            state._fsp--;

             after(grammarAccess.getProtocolsAccess().getForLoopFor_loopParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocols__ForLoopAssignment_8_1"


    // $ANTLR start "rule__For_loop__NameAssignment_1"
    // InternalGlobalJade.g:1105:1: rule__For_loop__NameAssignment_1 : ( RULE_GENERAL_NAME ) ;
    public final void rule__For_loop__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1109:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1110:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1110:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1111:3: RULE_GENERAL_NAME
            {
             before(grammarAccess.getFor_loopAccess().getNameGENERAL_NAMETerminalRuleCall_1_0()); 
            match(input,RULE_GENERAL_NAME,FOLLOW_2); 
             after(grammarAccess.getFor_loopAccess().getNameGENERAL_NAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_loop__NameAssignment_1"


    // $ANTLR start "rule__For_loop__RoleAssignment_3"
    // InternalGlobalJade.g:1120:1: rule__For_loop__RoleAssignment_3 : ( RULE_GENERAL_NAME ) ;
    public final void rule__For_loop__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1124:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1125:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1125:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1126:3: RULE_GENERAL_NAME
            {
             before(grammarAccess.getFor_loopAccess().getRoleGENERAL_NAMETerminalRuleCall_3_0()); 
            match(input,RULE_GENERAL_NAME,FOLLOW_2); 
             after(grammarAccess.getFor_loopAccess().getRoleGENERAL_NAMETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_loop__RoleAssignment_3"


    // $ANTLR start "rule__For_loop__GlobalsAssignment_6"
    // InternalGlobalJade.g:1135:1: rule__For_loop__GlobalsAssignment_6 : ( ruleGlobal_message ) ;
    public final void rule__For_loop__GlobalsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1139:1: ( ( ruleGlobal_message ) )
            // InternalGlobalJade.g:1140:2: ( ruleGlobal_message )
            {
            // InternalGlobalJade.g:1140:2: ( ruleGlobal_message )
            // InternalGlobalJade.g:1141:3: ruleGlobal_message
            {
             before(grammarAccess.getFor_loopAccess().getGlobalsGlobal_messageParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobal_message();

            state._fsp--;

             after(grammarAccess.getFor_loopAccess().getGlobalsGlobal_messageParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_loop__GlobalsAssignment_6"


    // $ANTLR start "rule__Global_message__TypeAssignment_0"
    // InternalGlobalJade.g:1150:1: rule__Global_message__TypeAssignment_0 : ( RULE_TYPE_MESSAGE ) ;
    public final void rule__Global_message__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1154:1: ( ( RULE_TYPE_MESSAGE ) )
            // InternalGlobalJade.g:1155:2: ( RULE_TYPE_MESSAGE )
            {
            // InternalGlobalJade.g:1155:2: ( RULE_TYPE_MESSAGE )
            // InternalGlobalJade.g:1156:3: RULE_TYPE_MESSAGE
            {
             before(grammarAccess.getGlobal_messageAccess().getTypeTYPE_MESSAGETerminalRuleCall_0_0()); 
            match(input,RULE_TYPE_MESSAGE,FOLLOW_2); 
             after(grammarAccess.getGlobal_messageAccess().getTypeTYPE_MESSAGETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global_message__TypeAssignment_0"


    // $ANTLR start "rule__Global_message__RoleAAssignment_4"
    // InternalGlobalJade.g:1165:1: rule__Global_message__RoleAAssignment_4 : ( RULE_GENERAL_NAME ) ;
    public final void rule__Global_message__RoleAAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1169:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1170:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1170:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1171:3: RULE_GENERAL_NAME
            {
             before(grammarAccess.getGlobal_messageAccess().getRoleAGENERAL_NAMETerminalRuleCall_4_0()); 
            match(input,RULE_GENERAL_NAME,FOLLOW_2); 
             after(grammarAccess.getGlobal_messageAccess().getRoleAGENERAL_NAMETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global_message__RoleAAssignment_4"


    // $ANTLR start "rule__Global_message__RoleBAssignment_6"
    // InternalGlobalJade.g:1180:1: rule__Global_message__RoleBAssignment_6 : ( RULE_GENERAL_NAME ) ;
    public final void rule__Global_message__RoleBAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1184:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1185:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1185:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1186:3: RULE_GENERAL_NAME
            {
             before(grammarAccess.getGlobal_messageAccess().getRoleBGENERAL_NAMETerminalRuleCall_6_0()); 
            match(input,RULE_GENERAL_NAME,FOLLOW_2); 
             after(grammarAccess.getGlobal_messageAccess().getRoleBGENERAL_NAMETerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global_message__RoleBAssignment_6"


    // $ANTLR start "rule__Role__RoleAssignment_1"
    // InternalGlobalJade.g:1195:1: rule__Role__RoleAssignment_1 : ( RULE_GENERAL_NAME ) ;
    public final void rule__Role__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1199:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1200:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1200:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1201:3: RULE_GENERAL_NAME
            {
             before(grammarAccess.getRoleAccess().getRoleGENERAL_NAMETerminalRuleCall_1_0()); 
            match(input,RULE_GENERAL_NAME,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleGENERAL_NAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__RoleAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});

}