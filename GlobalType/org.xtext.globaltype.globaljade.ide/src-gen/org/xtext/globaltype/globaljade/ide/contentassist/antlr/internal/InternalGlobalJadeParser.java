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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_GENERAL_NAME", "RULE_TYPE_MESSAGE", "RULE_CONTENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'end'", "'global'", "'protocol'", "'('", "')'", "'{'", "'}'", "','", "'choice'", "'at'", "'or'", "'forall'", "'in'", "'do'", "';'", "'from'", "'to'", "'role'"
    };
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
    // InternalGlobalJade.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalGlobalJade.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalGlobalJade.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalGlobalJade.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalGlobalJade.g:69:3: ( rule__Model__Group__0 )
            // InternalGlobalJade.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleProtocol"
    // InternalGlobalJade.g:78:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // InternalGlobalJade.g:79:1: ( ruleProtocol EOF )
            // InternalGlobalJade.g:80:1: ruleProtocol EOF
            {
             before(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getProtocolRule()); 
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
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalGlobalJade.g:87:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:91:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // InternalGlobalJade.g:92:2: ( ( rule__Protocol__Group__0 ) )
            {
            // InternalGlobalJade.g:92:2: ( ( rule__Protocol__Group__0 ) )
            // InternalGlobalJade.g:93:3: ( rule__Protocol__Group__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup()); 
            // InternalGlobalJade.g:94:3: ( rule__Protocol__Group__0 )
            // InternalGlobalJade.g:94:4: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup()); 

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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleChoice_rule"
    // InternalGlobalJade.g:103:1: entryRuleChoice_rule : ruleChoice_rule EOF ;
    public final void entryRuleChoice_rule() throws RecognitionException {
        try {
            // InternalGlobalJade.g:104:1: ( ruleChoice_rule EOF )
            // InternalGlobalJade.g:105:1: ruleChoice_rule EOF
            {
             before(grammarAccess.getChoice_ruleRule()); 
            pushFollow(FOLLOW_1);
            ruleChoice_rule();

            state._fsp--;

             after(grammarAccess.getChoice_ruleRule()); 
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
    // $ANTLR end "entryRuleChoice_rule"


    // $ANTLR start "ruleChoice_rule"
    // InternalGlobalJade.g:112:1: ruleChoice_rule : ( ( rule__Choice_rule__Group__0 ) ) ;
    public final void ruleChoice_rule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:116:2: ( ( ( rule__Choice_rule__Group__0 ) ) )
            // InternalGlobalJade.g:117:2: ( ( rule__Choice_rule__Group__0 ) )
            {
            // InternalGlobalJade.g:117:2: ( ( rule__Choice_rule__Group__0 ) )
            // InternalGlobalJade.g:118:3: ( rule__Choice_rule__Group__0 )
            {
             before(grammarAccess.getChoice_ruleAccess().getGroup()); 
            // InternalGlobalJade.g:119:3: ( rule__Choice_rule__Group__0 )
            // InternalGlobalJade.g:119:4: rule__Choice_rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choice_rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoice_ruleAccess().getGroup()); 

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
    // $ANTLR end "ruleChoice_rule"


    // $ANTLR start "entryRuleFor_loop"
    // InternalGlobalJade.g:128:1: entryRuleFor_loop : ruleFor_loop EOF ;
    public final void entryRuleFor_loop() throws RecognitionException {
        try {
            // InternalGlobalJade.g:129:1: ( ruleFor_loop EOF )
            // InternalGlobalJade.g:130:1: ruleFor_loop EOF
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
    // InternalGlobalJade.g:137:1: ruleFor_loop : ( ( rule__For_loop__Group__0 ) ) ;
    public final void ruleFor_loop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:141:2: ( ( ( rule__For_loop__Group__0 ) ) )
            // InternalGlobalJade.g:142:2: ( ( rule__For_loop__Group__0 ) )
            {
            // InternalGlobalJade.g:142:2: ( ( rule__For_loop__Group__0 ) )
            // InternalGlobalJade.g:143:3: ( rule__For_loop__Group__0 )
            {
             before(grammarAccess.getFor_loopAccess().getGroup()); 
            // InternalGlobalJade.g:144:3: ( rule__For_loop__Group__0 )
            // InternalGlobalJade.g:144:4: rule__For_loop__Group__0
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


    // $ANTLR start "entryRuleEnd_message"
    // InternalGlobalJade.g:153:1: entryRuleEnd_message : ruleEnd_message EOF ;
    public final void entryRuleEnd_message() throws RecognitionException {
        try {
            // InternalGlobalJade.g:154:1: ( ruleEnd_message EOF )
            // InternalGlobalJade.g:155:1: ruleEnd_message EOF
            {
             before(grammarAccess.getEnd_messageRule()); 
            pushFollow(FOLLOW_1);
            ruleEnd_message();

            state._fsp--;

             after(grammarAccess.getEnd_messageRule()); 
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
    // $ANTLR end "entryRuleEnd_message"


    // $ANTLR start "ruleEnd_message"
    // InternalGlobalJade.g:162:1: ruleEnd_message : ( ( rule__End_message__Group__0 ) ) ;
    public final void ruleEnd_message() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:166:2: ( ( ( rule__End_message__Group__0 ) ) )
            // InternalGlobalJade.g:167:2: ( ( rule__End_message__Group__0 ) )
            {
            // InternalGlobalJade.g:167:2: ( ( rule__End_message__Group__0 ) )
            // InternalGlobalJade.g:168:3: ( rule__End_message__Group__0 )
            {
             before(grammarAccess.getEnd_messageAccess().getGroup()); 
            // InternalGlobalJade.g:169:3: ( rule__End_message__Group__0 )
            // InternalGlobalJade.g:169:4: rule__End_message__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__End_message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnd_messageAccess().getGroup()); 

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
    // $ANTLR end "ruleEnd_message"


    // $ANTLR start "entryRuleEND_MEX"
    // InternalGlobalJade.g:178:1: entryRuleEND_MEX : ruleEND_MEX EOF ;
    public final void entryRuleEND_MEX() throws RecognitionException {
        try {
            // InternalGlobalJade.g:179:1: ( ruleEND_MEX EOF )
            // InternalGlobalJade.g:180:1: ruleEND_MEX EOF
            {
             before(grammarAccess.getEND_MEXRule()); 
            pushFollow(FOLLOW_1);
            ruleEND_MEX();

            state._fsp--;

             after(grammarAccess.getEND_MEXRule()); 
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
    // $ANTLR end "entryRuleEND_MEX"


    // $ANTLR start "ruleEND_MEX"
    // InternalGlobalJade.g:187:1: ruleEND_MEX : ( 'end' ) ;
    public final void ruleEND_MEX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:191:2: ( ( 'end' ) )
            // InternalGlobalJade.g:192:2: ( 'end' )
            {
            // InternalGlobalJade.g:192:2: ( 'end' )
            // InternalGlobalJade.g:193:3: 'end'
            {
             before(grammarAccess.getEND_MEXAccess().getEndKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEND_MEXAccess().getEndKeyword()); 

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
    // $ANTLR end "ruleEND_MEX"


    // $ANTLR start "entryRuleMessage"
    // InternalGlobalJade.g:203:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalGlobalJade.g:204:1: ( ruleMessage EOF )
            // InternalGlobalJade.g:205:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalGlobalJade.g:212:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:216:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalGlobalJade.g:217:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalGlobalJade.g:217:2: ( ( rule__Message__Group__0 ) )
            // InternalGlobalJade.g:218:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalGlobalJade.g:219:3: ( rule__Message__Group__0 )
            // InternalGlobalJade.g:219:4: rule__Message__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleRole"
    // InternalGlobalJade.g:228:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalGlobalJade.g:229:1: ( ruleRole EOF )
            // InternalGlobalJade.g:230:1: ruleRole EOF
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
    // InternalGlobalJade.g:237:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:241:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalGlobalJade.g:242:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalGlobalJade.g:242:2: ( ( rule__Role__Group__0 ) )
            // InternalGlobalJade.g:243:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalGlobalJade.g:244:3: ( rule__Role__Group__0 )
            // InternalGlobalJade.g:244:4: rule__Role__Group__0
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


    // $ANTLR start "rule__Protocol__ActionsAlternatives_1_0"
    // InternalGlobalJade.g:252:1: rule__Protocol__ActionsAlternatives_1_0 : ( ( ruleMessage ) | ( ruleChoice_rule ) | ( ruleFor_loop ) | ( ruleEnd_message ) );
    public final void rule__Protocol__ActionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:256:1: ( ( ruleMessage ) | ( ruleChoice_rule ) | ( ruleFor_loop ) | ( ruleEnd_message ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_TYPE_MESSAGE:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGlobalJade.g:257:2: ( ruleMessage )
                    {
                    // InternalGlobalJade.g:257:2: ( ruleMessage )
                    // InternalGlobalJade.g:258:3: ruleMessage
                    {
                     before(grammarAccess.getProtocolAccess().getActionsMessageParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsMessageParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:263:2: ( ruleChoice_rule )
                    {
                    // InternalGlobalJade.g:263:2: ( ruleChoice_rule )
                    // InternalGlobalJade.g:264:3: ruleChoice_rule
                    {
                     before(grammarAccess.getProtocolAccess().getActionsChoice_ruleParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChoice_rule();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsChoice_ruleParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGlobalJade.g:269:2: ( ruleFor_loop )
                    {
                    // InternalGlobalJade.g:269:2: ( ruleFor_loop )
                    // InternalGlobalJade.g:270:3: ruleFor_loop
                    {
                     before(grammarAccess.getProtocolAccess().getActionsFor_loopParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFor_loop();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsFor_loopParserRuleCall_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGlobalJade.g:275:2: ( ruleEnd_message )
                    {
                    // InternalGlobalJade.g:275:2: ( ruleEnd_message )
                    // InternalGlobalJade.g:276:3: ruleEnd_message
                    {
                     before(grammarAccess.getProtocolAccess().getActionsEnd_messageParserRuleCall_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEnd_message();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsEnd_messageParserRuleCall_1_0_3()); 

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
    // $ANTLR end "rule__Protocol__ActionsAlternatives_1_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalGlobalJade.g:285:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:289:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGlobalJade.g:290:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalGlobalJade.g:297:1: rule__Model__Group__0__Impl : ( 'global' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:301:1: ( ( 'global' ) )
            // InternalGlobalJade.g:302:1: ( 'global' )
            {
            // InternalGlobalJade.g:302:1: ( 'global' )
            // InternalGlobalJade.g:303:2: 'global'
            {
             before(grammarAccess.getModelAccess().getGlobalKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getGlobalKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalGlobalJade.g:312:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:316:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalGlobalJade.g:317:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalGlobalJade.g:324:1: rule__Model__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:328:1: ( ( 'protocol' ) )
            // InternalGlobalJade.g:329:1: ( 'protocol' )
            {
            // InternalGlobalJade.g:329:1: ( 'protocol' )
            // InternalGlobalJade.g:330:2: 'protocol'
            {
             before(grammarAccess.getModelAccess().getProtocolKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getProtocolKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalGlobalJade.g:339:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:343:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalGlobalJade.g:344:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalGlobalJade.g:351:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:355:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // InternalGlobalJade.g:356:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // InternalGlobalJade.g:356:1: ( ( rule__Model__NameAssignment_2 ) )
            // InternalGlobalJade.g:357:2: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // InternalGlobalJade.g:358:2: ( rule__Model__NameAssignment_2 )
            // InternalGlobalJade.g:358:3: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalGlobalJade.g:366:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:370:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalGlobalJade.g:371:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalGlobalJade.g:378:1: rule__Model__Group__3__Impl : ( '(' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:382:1: ( ( '(' ) )
            // InternalGlobalJade.g:383:1: ( '(' )
            {
            // InternalGlobalJade.g:383:1: ( '(' )
            // InternalGlobalJade.g:384:2: '('
            {
             before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalGlobalJade.g:393:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:397:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalGlobalJade.g:398:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalGlobalJade.g:405:1: rule__Model__Group__4__Impl : ( ( rule__Model__RolesAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:409:1: ( ( ( rule__Model__RolesAssignment_4 ) ) )
            // InternalGlobalJade.g:410:1: ( ( rule__Model__RolesAssignment_4 ) )
            {
            // InternalGlobalJade.g:410:1: ( ( rule__Model__RolesAssignment_4 ) )
            // InternalGlobalJade.g:411:2: ( rule__Model__RolesAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getRolesAssignment_4()); 
            // InternalGlobalJade.g:412:2: ( rule__Model__RolesAssignment_4 )
            // InternalGlobalJade.g:412:3: rule__Model__RolesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Model__RolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRolesAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalGlobalJade.g:420:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:424:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalGlobalJade.g:425:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalGlobalJade.g:432:1: rule__Model__Group__5__Impl : ( ( rule__Model__Group_5__0 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:436:1: ( ( ( rule__Model__Group_5__0 )* ) )
            // InternalGlobalJade.g:437:1: ( ( rule__Model__Group_5__0 )* )
            {
            // InternalGlobalJade.g:437:1: ( ( rule__Model__Group_5__0 )* )
            // InternalGlobalJade.g:438:2: ( rule__Model__Group_5__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_5()); 
            // InternalGlobalJade.g:439:2: ( rule__Model__Group_5__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGlobalJade.g:439:3: rule__Model__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalGlobalJade.g:447:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:451:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalGlobalJade.g:452:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalGlobalJade.g:459:1: rule__Model__Group__6__Impl : ( ')' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:463:1: ( ( ')' ) )
            // InternalGlobalJade.g:464:1: ( ')' )
            {
            // InternalGlobalJade.g:464:1: ( ')' )
            // InternalGlobalJade.g:465:2: ')'
            {
             before(grammarAccess.getModelAccess().getRightParenthesisKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalGlobalJade.g:474:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:478:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalGlobalJade.g:479:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

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
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalGlobalJade.g:486:1: rule__Model__Group__7__Impl : ( '{' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:490:1: ( ( '{' ) )
            // InternalGlobalJade.g:491:1: ( '{' )
            {
            // InternalGlobalJade.g:491:1: ( '{' )
            // InternalGlobalJade.g:492:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalGlobalJade.g:501:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:505:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalGlobalJade.g:506:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__9();

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
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalGlobalJade.g:513:1: rule__Model__Group__8__Impl : ( ( rule__Model__ProtocolAssignment_8 ) ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:517:1: ( ( ( rule__Model__ProtocolAssignment_8 ) ) )
            // InternalGlobalJade.g:518:1: ( ( rule__Model__ProtocolAssignment_8 ) )
            {
            // InternalGlobalJade.g:518:1: ( ( rule__Model__ProtocolAssignment_8 ) )
            // InternalGlobalJade.g:519:2: ( rule__Model__ProtocolAssignment_8 )
            {
             before(grammarAccess.getModelAccess().getProtocolAssignment_8()); 
            // InternalGlobalJade.g:520:2: ( rule__Model__ProtocolAssignment_8 )
            // InternalGlobalJade.g:520:3: rule__Model__ProtocolAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Model__ProtocolAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getProtocolAssignment_8()); 

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
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // InternalGlobalJade.g:528:1: rule__Model__Group__9 : rule__Model__Group__9__Impl ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:532:1: ( rule__Model__Group__9__Impl )
            // InternalGlobalJade.g:533:2: rule__Model__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__9__Impl();

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
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // InternalGlobalJade.g:539:1: rule__Model__Group__9__Impl : ( '}' ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:543:1: ( ( '}' ) )
            // InternalGlobalJade.g:544:1: ( '}' )
            {
            // InternalGlobalJade.g:544:1: ( '}' )
            // InternalGlobalJade.g:545:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group_5__0"
    // InternalGlobalJade.g:555:1: rule__Model__Group_5__0 : rule__Model__Group_5__0__Impl rule__Model__Group_5__1 ;
    public final void rule__Model__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:559:1: ( rule__Model__Group_5__0__Impl rule__Model__Group_5__1 )
            // InternalGlobalJade.g:560:2: rule__Model__Group_5__0__Impl rule__Model__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_5__1();

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
    // $ANTLR end "rule__Model__Group_5__0"


    // $ANTLR start "rule__Model__Group_5__0__Impl"
    // InternalGlobalJade.g:567:1: rule__Model__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:571:1: ( ( ',' ) )
            // InternalGlobalJade.g:572:1: ( ',' )
            {
            // InternalGlobalJade.g:572:1: ( ',' )
            // InternalGlobalJade.g:573:2: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Model__Group_5__0__Impl"


    // $ANTLR start "rule__Model__Group_5__1"
    // InternalGlobalJade.g:582:1: rule__Model__Group_5__1 : rule__Model__Group_5__1__Impl ;
    public final void rule__Model__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:586:1: ( rule__Model__Group_5__1__Impl )
            // InternalGlobalJade.g:587:2: rule__Model__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_5__1__Impl();

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
    // $ANTLR end "rule__Model__Group_5__1"


    // $ANTLR start "rule__Model__Group_5__1__Impl"
    // InternalGlobalJade.g:593:1: rule__Model__Group_5__1__Impl : ( ( rule__Model__RolesAssignment_5_1 ) ) ;
    public final void rule__Model__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:597:1: ( ( ( rule__Model__RolesAssignment_5_1 ) ) )
            // InternalGlobalJade.g:598:1: ( ( rule__Model__RolesAssignment_5_1 ) )
            {
            // InternalGlobalJade.g:598:1: ( ( rule__Model__RolesAssignment_5_1 ) )
            // InternalGlobalJade.g:599:2: ( rule__Model__RolesAssignment_5_1 )
            {
             before(grammarAccess.getModelAccess().getRolesAssignment_5_1()); 
            // InternalGlobalJade.g:600:2: ( rule__Model__RolesAssignment_5_1 )
            // InternalGlobalJade.g:600:3: rule__Model__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__RolesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRolesAssignment_5_1()); 

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
    // $ANTLR end "rule__Model__Group_5__1__Impl"


    // $ANTLR start "rule__Protocol__Group__0"
    // InternalGlobalJade.g:609:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:613:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalGlobalJade.g:614:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Protocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__1();

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
    // $ANTLR end "rule__Protocol__Group__0"


    // $ANTLR start "rule__Protocol__Group__0__Impl"
    // InternalGlobalJade.g:621:1: rule__Protocol__Group__0__Impl : ( () ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:625:1: ( ( () ) )
            // InternalGlobalJade.g:626:1: ( () )
            {
            // InternalGlobalJade.g:626:1: ( () )
            // InternalGlobalJade.g:627:2: ()
            {
             before(grammarAccess.getProtocolAccess().getProtocolAction_0()); 
            // InternalGlobalJade.g:628:2: ()
            // InternalGlobalJade.g:628:3: 
            {
            }

             after(grammarAccess.getProtocolAccess().getProtocolAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0__Impl"


    // $ANTLR start "rule__Protocol__Group__1"
    // InternalGlobalJade.g:636:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:640:1: ( rule__Protocol__Group__1__Impl )
            // InternalGlobalJade.g:641:2: rule__Protocol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__1__Impl();

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
    // $ANTLR end "rule__Protocol__Group__1"


    // $ANTLR start "rule__Protocol__Group__1__Impl"
    // InternalGlobalJade.g:647:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__ActionsAssignment_1 )* ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:651:1: ( ( ( rule__Protocol__ActionsAssignment_1 )* ) )
            // InternalGlobalJade.g:652:1: ( ( rule__Protocol__ActionsAssignment_1 )* )
            {
            // InternalGlobalJade.g:652:1: ( ( rule__Protocol__ActionsAssignment_1 )* )
            // InternalGlobalJade.g:653:2: ( rule__Protocol__ActionsAssignment_1 )*
            {
             before(grammarAccess.getProtocolAccess().getActionsAssignment_1()); 
            // InternalGlobalJade.g:654:2: ( rule__Protocol__ActionsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_TYPE_MESSAGE||LA3_0==14||LA3_0==22||LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGlobalJade.g:654:3: rule__Protocol__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Protocol__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProtocolAccess().getActionsAssignment_1()); 

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
    // $ANTLR end "rule__Protocol__Group__1__Impl"


    // $ANTLR start "rule__Choice_rule__Group__0"
    // InternalGlobalJade.g:663:1: rule__Choice_rule__Group__0 : rule__Choice_rule__Group__0__Impl rule__Choice_rule__Group__1 ;
    public final void rule__Choice_rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:667:1: ( rule__Choice_rule__Group__0__Impl rule__Choice_rule__Group__1 )
            // InternalGlobalJade.g:668:2: rule__Choice_rule__Group__0__Impl rule__Choice_rule__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Choice_rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice_rule__Group__1();

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
    // $ANTLR end "rule__Choice_rule__Group__0"


    // $ANTLR start "rule__Choice_rule__Group__0__Impl"
    // InternalGlobalJade.g:675:1: rule__Choice_rule__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice_rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:679:1: ( ( 'choice' ) )
            // InternalGlobalJade.g:680:1: ( 'choice' )
            {
            // InternalGlobalJade.g:680:1: ( 'choice' )
            // InternalGlobalJade.g:681:2: 'choice'
            {
             before(grammarAccess.getChoice_ruleAccess().getChoiceKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getChoice_ruleAccess().getChoiceKeyword_0()); 

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
    // $ANTLR end "rule__Choice_rule__Group__0__Impl"


    // $ANTLR start "rule__Choice_rule__Group__1"
    // InternalGlobalJade.g:690:1: rule__Choice_rule__Group__1 : rule__Choice_rule__Group__1__Impl rule__Choice_rule__Group__2 ;
    public final void rule__Choice_rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:694:1: ( rule__Choice_rule__Group__1__Impl rule__Choice_rule__Group__2 )
            // InternalGlobalJade.g:695:2: rule__Choice_rule__Group__1__Impl rule__Choice_rule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Choice_rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice_rule__Group__2();

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
    // $ANTLR end "rule__Choice_rule__Group__1"


    // $ANTLR start "rule__Choice_rule__Group__1__Impl"
    // InternalGlobalJade.g:702:1: rule__Choice_rule__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice_rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:706:1: ( ( 'at' ) )
            // InternalGlobalJade.g:707:1: ( 'at' )
            {
            // InternalGlobalJade.g:707:1: ( 'at' )
            // InternalGlobalJade.g:708:2: 'at'
            {
             before(grammarAccess.getChoice_ruleAccess().getAtKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChoice_ruleAccess().getAtKeyword_1()); 

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
    // $ANTLR end "rule__Choice_rule__Group__1__Impl"


    // $ANTLR start "rule__Choice_rule__Group__2"
    // InternalGlobalJade.g:717:1: rule__Choice_rule__Group__2 : rule__Choice_rule__Group__2__Impl rule__Choice_rule__Group__3 ;
    public final void rule__Choice_rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:721:1: ( rule__Choice_rule__Group__2__Impl rule__Choice_rule__Group__3 )
            // InternalGlobalJade.g:722:2: rule__Choice_rule__Group__2__Impl rule__Choice_rule__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Choice_rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice_rule__Group__3();

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
    // $ANTLR end "rule__Choice_rule__Group__2"


    // $ANTLR start "rule__Choice_rule__Group__2__Impl"
    // InternalGlobalJade.g:729:1: rule__Choice_rule__Group__2__Impl : ( ( rule__Choice_rule__Role_nameAssignment_2 ) ) ;
    public final void rule__Choice_rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:733:1: ( ( ( rule__Choice_rule__Role_nameAssignment_2 ) ) )
            // InternalGlobalJade.g:734:1: ( ( rule__Choice_rule__Role_nameAssignment_2 ) )
            {
            // InternalGlobalJade.g:734:1: ( ( rule__Choice_rule__Role_nameAssignment_2 ) )
            // InternalGlobalJade.g:735:2: ( rule__Choice_rule__Role_nameAssignment_2 )
            {
             before(grammarAccess.getChoice_ruleAccess().getRole_nameAssignment_2()); 
            // InternalGlobalJade.g:736:2: ( rule__Choice_rule__Role_nameAssignment_2 )
            // InternalGlobalJade.g:736:3: rule__Choice_rule__Role_nameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Choice_rule__Role_nameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoice_ruleAccess().getRole_nameAssignment_2()); 

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
    // $ANTLR end "rule__Choice_rule__Group__2__Impl"


    // $ANTLR start "rule__Choice_rule__Group__3"
    // InternalGlobalJade.g:744:1: rule__Choice_rule__Group__3 : rule__Choice_rule__Group__3__Impl rule__Choice_rule__Group__4 ;
    public final void rule__Choice_rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:748:1: ( rule__Choice_rule__Group__3__Impl rule__Choice_rule__Group__4 )
            // InternalGlobalJade.g:749:2: rule__Choice_rule__Group__3__Impl rule__Choice_rule__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Choice_rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice_rule__Group__4();

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
    // $ANTLR end "rule__Choice_rule__Group__3"


    // $ANTLR start "rule__Choice_rule__Group__3__Impl"
    // InternalGlobalJade.g:756:1: rule__Choice_rule__Group__3__Impl : ( '{' ) ;
    public final void rule__Choice_rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:760:1: ( ( '{' ) )
            // InternalGlobalJade.g:761:1: ( '{' )
            {
            // InternalGlobalJade.g:761:1: ( '{' )
            // InternalGlobalJade.g:762:2: '{'
            {
             before(grammarAccess.getChoice_ruleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChoice_ruleAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Choice_rule__Group__3__Impl"


    // $ANTLR start "rule__Choice_rule__Group__4"
    // InternalGlobalJade.g:771:1: rule__Choice_rule__Group__4 : rule__Choice_rule__Group__4__Impl rule__Choice_rule__Group__5 ;
    public final void rule__Choice_rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:775:1: ( rule__Choice_rule__Group__4__Impl rule__Choice_rule__Group__5 )
            // InternalGlobalJade.g:776:2: rule__Choice_rule__Group__4__Impl rule__Choice_rule__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Choice_rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice_rule__Group__5();

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
    // $ANTLR end "rule__Choice_rule__Group__4"


    // $ANTLR start "rule__Choice_rule__Group__4__Impl"
    // InternalGlobalJade.g:783:1: rule__Choice_rule__Group__4__Impl : ( ( rule__Choice_rule__MessagesAssignment_4 )* ) ;
    public final void rule__Choice_rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:787:1: ( ( ( rule__Choice_rule__MessagesAssignment_4 )* ) )
            // InternalGlobalJade.g:788:1: ( ( rule__Choice_rule__MessagesAssignment_4 )* )
            {
            // InternalGlobalJade.g:788:1: ( ( rule__Choice_rule__MessagesAssignment_4 )* )
            // InternalGlobalJade.g:789:2: ( rule__Choice_rule__MessagesAssignment_4 )*
            {
             before(grammarAccess.getChoice_ruleAccess().getMessagesAssignment_4()); 
            // InternalGlobalJade.g:790:2: ( rule__Choice_rule__MessagesAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TYPE_MESSAGE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGlobalJade.g:790:3: rule__Choice_rule__MessagesAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Choice_rule__MessagesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getChoice_ruleAccess().getMessagesAssignment_4()); 

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
    // $ANTLR end "rule__Choice_rule__Group__4__Impl"


    // $ANTLR start "rule__Choice_rule__Group__5"
    // InternalGlobalJade.g:798:1: rule__Choice_rule__Group__5 : rule__Choice_rule__Group__5__Impl rule__Choice_rule__Group__6 ;
    public final void rule__Choice_rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:802:1: ( rule__Choice_rule__Group__5__Impl rule__Choice_rule__Group__6 )
            // InternalGlobalJade.g:803:2: rule__Choice_rule__Group__5__Impl rule__Choice_rule__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Choice_rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice_rule__Group__6();

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
    // $ANTLR end "rule__Choice_rule__Group__5"


    // $ANTLR start "rule__Choice_rule__Group__5__Impl"
    // InternalGlobalJade.g:810:1: rule__Choice_rule__Group__5__Impl : ( '}' ) ;
    public final void rule__Choice_rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:814:1: ( ( '}' ) )
            // InternalGlobalJade.g:815:1: ( '}' )
            {
            // InternalGlobalJade.g:815:1: ( '}' )
            // InternalGlobalJade.g:816:2: '}'
            {
             before(grammarAccess.getChoice_ruleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChoice_ruleAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Choice_rule__Group__5__Impl"


    // $ANTLR start "rule__Choice_rule__Group__6"
    // InternalGlobalJade.g:825:1: rule__Choice_rule__Group__6 : rule__Choice_rule__Group__6__Impl ;
    public final void rule__Choice_rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:829:1: ( rule__Choice_rule__Group__6__Impl )
            // InternalGlobalJade.g:830:2: rule__Choice_rule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice_rule__Group__6__Impl();

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
    // $ANTLR end "rule__Choice_rule__Group__6"


    // $ANTLR start "rule__Choice_rule__Group__6__Impl"
    // InternalGlobalJade.g:836:1: rule__Choice_rule__Group__6__Impl : ( ( rule__Choice_rule__Group_6__0 )* ) ;
    public final void rule__Choice_rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:840:1: ( ( ( rule__Choice_rule__Group_6__0 )* ) )
            // InternalGlobalJade.g:841:1: ( ( rule__Choice_rule__Group_6__0 )* )
            {
            // InternalGlobalJade.g:841:1: ( ( rule__Choice_rule__Group_6__0 )* )
            // InternalGlobalJade.g:842:2: ( rule__Choice_rule__Group_6__0 )*
            {
             before(grammarAccess.getChoice_ruleAccess().getGroup_6()); 
            // InternalGlobalJade.g:843:2: ( rule__Choice_rule__Group_6__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGlobalJade.g:843:3: rule__Choice_rule__Group_6__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Choice_rule__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getChoice_ruleAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Choice_rule__Group__6__Impl"


    // $ANTLR start "rule__Choice_rule__Group_6__0"
    // InternalGlobalJade.g:852:1: rule__Choice_rule__Group_6__0 : rule__Choice_rule__Group_6__0__Impl rule__Choice_rule__Group_6__1 ;
    public final void rule__Choice_rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:856:1: ( rule__Choice_rule__Group_6__0__Impl rule__Choice_rule__Group_6__1 )
            // InternalGlobalJade.g:857:2: rule__Choice_rule__Group_6__0__Impl rule__Choice_rule__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Choice_rule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice_rule__Group_6__1();

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
    // $ANTLR end "rule__Choice_rule__Group_6__0"


    // $ANTLR start "rule__Choice_rule__Group_6__0__Impl"
    // InternalGlobalJade.g:864:1: rule__Choice_rule__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__Choice_rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:868:1: ( ( 'or' ) )
            // InternalGlobalJade.g:869:1: ( 'or' )
            {
            // InternalGlobalJade.g:869:1: ( 'or' )
            // InternalGlobalJade.g:870:2: 'or'
            {
             before(grammarAccess.getChoice_ruleAccess().getOrKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getChoice_ruleAccess().getOrKeyword_6_0()); 

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
    // $ANTLR end "rule__Choice_rule__Group_6__0__Impl"


    // $ANTLR start "rule__Choice_rule__Group_6__1"
    // InternalGlobalJade.g:879:1: rule__Choice_rule__Group_6__1 : rule__Choice_rule__Group_6__1__Impl rule__Choice_rule__Group_6__2 ;
    public final void rule__Choice_rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:883:1: ( rule__Choice_rule__Group_6__1__Impl rule__Choice_rule__Group_6__2 )
            // InternalGlobalJade.g:884:2: rule__Choice_rule__Group_6__1__Impl rule__Choice_rule__Group_6__2
            {
            pushFollow(FOLLOW_14);
            rule__Choice_rule__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice_rule__Group_6__2();

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
    // $ANTLR end "rule__Choice_rule__Group_6__1"


    // $ANTLR start "rule__Choice_rule__Group_6__1__Impl"
    // InternalGlobalJade.g:891:1: rule__Choice_rule__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Choice_rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:895:1: ( ( '{' ) )
            // InternalGlobalJade.g:896:1: ( '{' )
            {
            // InternalGlobalJade.g:896:1: ( '{' )
            // InternalGlobalJade.g:897:2: '{'
            {
             before(grammarAccess.getChoice_ruleAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChoice_ruleAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__Choice_rule__Group_6__1__Impl"


    // $ANTLR start "rule__Choice_rule__Group_6__2"
    // InternalGlobalJade.g:906:1: rule__Choice_rule__Group_6__2 : rule__Choice_rule__Group_6__2__Impl rule__Choice_rule__Group_6__3 ;
    public final void rule__Choice_rule__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:910:1: ( rule__Choice_rule__Group_6__2__Impl rule__Choice_rule__Group_6__3 )
            // InternalGlobalJade.g:911:2: rule__Choice_rule__Group_6__2__Impl rule__Choice_rule__Group_6__3
            {
            pushFollow(FOLLOW_14);
            rule__Choice_rule__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice_rule__Group_6__3();

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
    // $ANTLR end "rule__Choice_rule__Group_6__2"


    // $ANTLR start "rule__Choice_rule__Group_6__2__Impl"
    // InternalGlobalJade.g:918:1: rule__Choice_rule__Group_6__2__Impl : ( ( rule__Choice_rule__MessagesAssignment_6_2 )* ) ;
    public final void rule__Choice_rule__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:922:1: ( ( ( rule__Choice_rule__MessagesAssignment_6_2 )* ) )
            // InternalGlobalJade.g:923:1: ( ( rule__Choice_rule__MessagesAssignment_6_2 )* )
            {
            // InternalGlobalJade.g:923:1: ( ( rule__Choice_rule__MessagesAssignment_6_2 )* )
            // InternalGlobalJade.g:924:2: ( rule__Choice_rule__MessagesAssignment_6_2 )*
            {
             before(grammarAccess.getChoice_ruleAccess().getMessagesAssignment_6_2()); 
            // InternalGlobalJade.g:925:2: ( rule__Choice_rule__MessagesAssignment_6_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_TYPE_MESSAGE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGlobalJade.g:925:3: rule__Choice_rule__MessagesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Choice_rule__MessagesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getChoice_ruleAccess().getMessagesAssignment_6_2()); 

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
    // $ANTLR end "rule__Choice_rule__Group_6__2__Impl"


    // $ANTLR start "rule__Choice_rule__Group_6__3"
    // InternalGlobalJade.g:933:1: rule__Choice_rule__Group_6__3 : rule__Choice_rule__Group_6__3__Impl ;
    public final void rule__Choice_rule__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:937:1: ( rule__Choice_rule__Group_6__3__Impl )
            // InternalGlobalJade.g:938:2: rule__Choice_rule__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice_rule__Group_6__3__Impl();

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
    // $ANTLR end "rule__Choice_rule__Group_6__3"


    // $ANTLR start "rule__Choice_rule__Group_6__3__Impl"
    // InternalGlobalJade.g:944:1: rule__Choice_rule__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Choice_rule__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:948:1: ( ( '}' ) )
            // InternalGlobalJade.g:949:1: ( '}' )
            {
            // InternalGlobalJade.g:949:1: ( '}' )
            // InternalGlobalJade.g:950:2: '}'
            {
             before(grammarAccess.getChoice_ruleAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChoice_ruleAccess().getRightCurlyBracketKeyword_6_3()); 

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
    // $ANTLR end "rule__Choice_rule__Group_6__3__Impl"


    // $ANTLR start "rule__For_loop__Group__0"
    // InternalGlobalJade.g:960:1: rule__For_loop__Group__0 : rule__For_loop__Group__0__Impl rule__For_loop__Group__1 ;
    public final void rule__For_loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:964:1: ( rule__For_loop__Group__0__Impl rule__For_loop__Group__1 )
            // InternalGlobalJade.g:965:2: rule__For_loop__Group__0__Impl rule__For_loop__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGlobalJade.g:972:1: rule__For_loop__Group__0__Impl : ( 'forall' ) ;
    public final void rule__For_loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:976:1: ( ( 'forall' ) )
            // InternalGlobalJade.g:977:1: ( 'forall' )
            {
            // InternalGlobalJade.g:977:1: ( 'forall' )
            // InternalGlobalJade.g:978:2: 'forall'
            {
             before(grammarAccess.getFor_loopAccess().getForallKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGlobalJade.g:987:1: rule__For_loop__Group__1 : rule__For_loop__Group__1__Impl rule__For_loop__Group__2 ;
    public final void rule__For_loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:991:1: ( rule__For_loop__Group__1__Impl rule__For_loop__Group__2 )
            // InternalGlobalJade.g:992:2: rule__For_loop__Group__1__Impl rule__For_loop__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalGlobalJade.g:999:1: rule__For_loop__Group__1__Impl : ( ( rule__For_loop__NameAssignment_1 ) ) ;
    public final void rule__For_loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1003:1: ( ( ( rule__For_loop__NameAssignment_1 ) ) )
            // InternalGlobalJade.g:1004:1: ( ( rule__For_loop__NameAssignment_1 ) )
            {
            // InternalGlobalJade.g:1004:1: ( ( rule__For_loop__NameAssignment_1 ) )
            // InternalGlobalJade.g:1005:2: ( rule__For_loop__NameAssignment_1 )
            {
             before(grammarAccess.getFor_loopAccess().getNameAssignment_1()); 
            // InternalGlobalJade.g:1006:2: ( rule__For_loop__NameAssignment_1 )
            // InternalGlobalJade.g:1006:3: rule__For_loop__NameAssignment_1
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
    // InternalGlobalJade.g:1014:1: rule__For_loop__Group__2 : rule__For_loop__Group__2__Impl rule__For_loop__Group__3 ;
    public final void rule__For_loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1018:1: ( rule__For_loop__Group__2__Impl rule__For_loop__Group__3 )
            // InternalGlobalJade.g:1019:2: rule__For_loop__Group__2__Impl rule__For_loop__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalGlobalJade.g:1026:1: rule__For_loop__Group__2__Impl : ( 'in' ) ;
    public final void rule__For_loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1030:1: ( ( 'in' ) )
            // InternalGlobalJade.g:1031:1: ( 'in' )
            {
            // InternalGlobalJade.g:1031:1: ( 'in' )
            // InternalGlobalJade.g:1032:2: 'in'
            {
             before(grammarAccess.getFor_loopAccess().getInKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGlobalJade.g:1041:1: rule__For_loop__Group__3 : rule__For_loop__Group__3__Impl rule__For_loop__Group__4 ;
    public final void rule__For_loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1045:1: ( rule__For_loop__Group__3__Impl rule__For_loop__Group__4 )
            // InternalGlobalJade.g:1046:2: rule__For_loop__Group__3__Impl rule__For_loop__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalGlobalJade.g:1053:1: rule__For_loop__Group__3__Impl : ( ( rule__For_loop__RoleAssignment_3 ) ) ;
    public final void rule__For_loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1057:1: ( ( ( rule__For_loop__RoleAssignment_3 ) ) )
            // InternalGlobalJade.g:1058:1: ( ( rule__For_loop__RoleAssignment_3 ) )
            {
            // InternalGlobalJade.g:1058:1: ( ( rule__For_loop__RoleAssignment_3 ) )
            // InternalGlobalJade.g:1059:2: ( rule__For_loop__RoleAssignment_3 )
            {
             before(grammarAccess.getFor_loopAccess().getRoleAssignment_3()); 
            // InternalGlobalJade.g:1060:2: ( rule__For_loop__RoleAssignment_3 )
            // InternalGlobalJade.g:1060:3: rule__For_loop__RoleAssignment_3
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
    // InternalGlobalJade.g:1068:1: rule__For_loop__Group__4 : rule__For_loop__Group__4__Impl rule__For_loop__Group__5 ;
    public final void rule__For_loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1072:1: ( rule__For_loop__Group__4__Impl rule__For_loop__Group__5 )
            // InternalGlobalJade.g:1073:2: rule__For_loop__Group__4__Impl rule__For_loop__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalGlobalJade.g:1080:1: rule__For_loop__Group__4__Impl : ( 'do' ) ;
    public final void rule__For_loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1084:1: ( ( 'do' ) )
            // InternalGlobalJade.g:1085:1: ( 'do' )
            {
            // InternalGlobalJade.g:1085:1: ( 'do' )
            // InternalGlobalJade.g:1086:2: 'do'
            {
             before(grammarAccess.getFor_loopAccess().getDoKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGlobalJade.g:1095:1: rule__For_loop__Group__5 : rule__For_loop__Group__5__Impl rule__For_loop__Group__6 ;
    public final void rule__For_loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1099:1: ( rule__For_loop__Group__5__Impl rule__For_loop__Group__6 )
            // InternalGlobalJade.g:1100:2: rule__For_loop__Group__5__Impl rule__For_loop__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalGlobalJade.g:1107:1: rule__For_loop__Group__5__Impl : ( '{' ) ;
    public final void rule__For_loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1111:1: ( ( '{' ) )
            // InternalGlobalJade.g:1112:1: ( '{' )
            {
            // InternalGlobalJade.g:1112:1: ( '{' )
            // InternalGlobalJade.g:1113:2: '{'
            {
             before(grammarAccess.getFor_loopAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGlobalJade.g:1122:1: rule__For_loop__Group__6 : rule__For_loop__Group__6__Impl rule__For_loop__Group__7 ;
    public final void rule__For_loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1126:1: ( rule__For_loop__Group__6__Impl rule__For_loop__Group__7 )
            // InternalGlobalJade.g:1127:2: rule__For_loop__Group__6__Impl rule__For_loop__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalGlobalJade.g:1134:1: rule__For_loop__Group__6__Impl : ( ( rule__For_loop__MessagesAssignment_6 )* ) ;
    public final void rule__For_loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1138:1: ( ( ( rule__For_loop__MessagesAssignment_6 )* ) )
            // InternalGlobalJade.g:1139:1: ( ( rule__For_loop__MessagesAssignment_6 )* )
            {
            // InternalGlobalJade.g:1139:1: ( ( rule__For_loop__MessagesAssignment_6 )* )
            // InternalGlobalJade.g:1140:2: ( rule__For_loop__MessagesAssignment_6 )*
            {
             before(grammarAccess.getFor_loopAccess().getMessagesAssignment_6()); 
            // InternalGlobalJade.g:1141:2: ( rule__For_loop__MessagesAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TYPE_MESSAGE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGlobalJade.g:1141:3: rule__For_loop__MessagesAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__For_loop__MessagesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFor_loopAccess().getMessagesAssignment_6()); 

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
    // InternalGlobalJade.g:1149:1: rule__For_loop__Group__7 : rule__For_loop__Group__7__Impl ;
    public final void rule__For_loop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1153:1: ( rule__For_loop__Group__7__Impl )
            // InternalGlobalJade.g:1154:2: rule__For_loop__Group__7__Impl
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
    // InternalGlobalJade.g:1160:1: rule__For_loop__Group__7__Impl : ( '}' ) ;
    public final void rule__For_loop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1164:1: ( ( '}' ) )
            // InternalGlobalJade.g:1165:1: ( '}' )
            {
            // InternalGlobalJade.g:1165:1: ( '}' )
            // InternalGlobalJade.g:1166:2: '}'
            {
             before(grammarAccess.getFor_loopAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__End_message__Group__0"
    // InternalGlobalJade.g:1176:1: rule__End_message__Group__0 : rule__End_message__Group__0__Impl rule__End_message__Group__1 ;
    public final void rule__End_message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1180:1: ( rule__End_message__Group__0__Impl rule__End_message__Group__1 )
            // InternalGlobalJade.g:1181:2: rule__End_message__Group__0__Impl rule__End_message__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__End_message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End_message__Group__1();

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
    // $ANTLR end "rule__End_message__Group__0"


    // $ANTLR start "rule__End_message__Group__0__Impl"
    // InternalGlobalJade.g:1188:1: rule__End_message__Group__0__Impl : ( ( rule__End_message__EndAssignment_0 ) ) ;
    public final void rule__End_message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1192:1: ( ( ( rule__End_message__EndAssignment_0 ) ) )
            // InternalGlobalJade.g:1193:1: ( ( rule__End_message__EndAssignment_0 ) )
            {
            // InternalGlobalJade.g:1193:1: ( ( rule__End_message__EndAssignment_0 ) )
            // InternalGlobalJade.g:1194:2: ( rule__End_message__EndAssignment_0 )
            {
             before(grammarAccess.getEnd_messageAccess().getEndAssignment_0()); 
            // InternalGlobalJade.g:1195:2: ( rule__End_message__EndAssignment_0 )
            // InternalGlobalJade.g:1195:3: rule__End_message__EndAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__End_message__EndAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnd_messageAccess().getEndAssignment_0()); 

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
    // $ANTLR end "rule__End_message__Group__0__Impl"


    // $ANTLR start "rule__End_message__Group__1"
    // InternalGlobalJade.g:1203:1: rule__End_message__Group__1 : rule__End_message__Group__1__Impl ;
    public final void rule__End_message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1207:1: ( rule__End_message__Group__1__Impl )
            // InternalGlobalJade.g:1208:2: rule__End_message__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__End_message__Group__1__Impl();

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
    // $ANTLR end "rule__End_message__Group__1"


    // $ANTLR start "rule__End_message__Group__1__Impl"
    // InternalGlobalJade.g:1214:1: rule__End_message__Group__1__Impl : ( ';' ) ;
    public final void rule__End_message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1218:1: ( ( ';' ) )
            // InternalGlobalJade.g:1219:1: ( ';' )
            {
            // InternalGlobalJade.g:1219:1: ( ';' )
            // InternalGlobalJade.g:1220:2: ';'
            {
             before(grammarAccess.getEnd_messageAccess().getSemicolonKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnd_messageAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__End_message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // InternalGlobalJade.g:1230:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1234:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalGlobalJade.g:1235:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__1();

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
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalGlobalJade.g:1242:1: rule__Message__Group__0__Impl : ( ( rule__Message__TypeAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1246:1: ( ( ( rule__Message__TypeAssignment_0 ) ) )
            // InternalGlobalJade.g:1247:1: ( ( rule__Message__TypeAssignment_0 ) )
            {
            // InternalGlobalJade.g:1247:1: ( ( rule__Message__TypeAssignment_0 ) )
            // InternalGlobalJade.g:1248:2: ( rule__Message__TypeAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getTypeAssignment_0()); 
            // InternalGlobalJade.g:1249:2: ( rule__Message__TypeAssignment_0 )
            // InternalGlobalJade.g:1249:3: rule__Message__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Message__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // InternalGlobalJade.g:1257:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1261:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalGlobalJade.g:1262:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Message__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__2();

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
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalGlobalJade.g:1269:1: rule__Message__Group__1__Impl : ( '(' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1273:1: ( ( '(' ) )
            // InternalGlobalJade.g:1274:1: ( '(' )
            {
            // InternalGlobalJade.g:1274:1: ( '(' )
            // InternalGlobalJade.g:1275:2: '('
            {
             before(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // InternalGlobalJade.g:1284:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1288:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalGlobalJade.g:1289:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Message__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__3();

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
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // InternalGlobalJade.g:1296:1: rule__Message__Group__2__Impl : ( ( rule__Message__ContentAssignment_2 ) ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1300:1: ( ( ( rule__Message__ContentAssignment_2 ) ) )
            // InternalGlobalJade.g:1301:1: ( ( rule__Message__ContentAssignment_2 ) )
            {
            // InternalGlobalJade.g:1301:1: ( ( rule__Message__ContentAssignment_2 ) )
            // InternalGlobalJade.g:1302:2: ( rule__Message__ContentAssignment_2 )
            {
             before(grammarAccess.getMessageAccess().getContentAssignment_2()); 
            // InternalGlobalJade.g:1303:2: ( rule__Message__ContentAssignment_2 )
            // InternalGlobalJade.g:1303:3: rule__Message__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Message__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getContentAssignment_2()); 

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
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group__3"
    // InternalGlobalJade.g:1311:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1315:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalGlobalJade.g:1316:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Message__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__4();

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
    // $ANTLR end "rule__Message__Group__3"


    // $ANTLR start "rule__Message__Group__3__Impl"
    // InternalGlobalJade.g:1323:1: rule__Message__Group__3__Impl : ( ( rule__Message__Group_3__0 )* ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1327:1: ( ( ( rule__Message__Group_3__0 )* ) )
            // InternalGlobalJade.g:1328:1: ( ( rule__Message__Group_3__0 )* )
            {
            // InternalGlobalJade.g:1328:1: ( ( rule__Message__Group_3__0 )* )
            // InternalGlobalJade.g:1329:2: ( rule__Message__Group_3__0 )*
            {
             before(grammarAccess.getMessageAccess().getGroup_3()); 
            // InternalGlobalJade.g:1330:2: ( rule__Message__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGlobalJade.g:1330:3: rule__Message__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Message__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMessageAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Message__Group__3__Impl"


    // $ANTLR start "rule__Message__Group__4"
    // InternalGlobalJade.g:1338:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1342:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalGlobalJade.g:1343:2: rule__Message__Group__4__Impl rule__Message__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Message__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__5();

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
    // $ANTLR end "rule__Message__Group__4"


    // $ANTLR start "rule__Message__Group__4__Impl"
    // InternalGlobalJade.g:1350:1: rule__Message__Group__4__Impl : ( ')' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1354:1: ( ( ')' ) )
            // InternalGlobalJade.g:1355:1: ( ')' )
            {
            // InternalGlobalJade.g:1355:1: ( ')' )
            // InternalGlobalJade.g:1356:2: ')'
            {
             before(grammarAccess.getMessageAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Message__Group__4__Impl"


    // $ANTLR start "rule__Message__Group__5"
    // InternalGlobalJade.g:1365:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1369:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalGlobalJade.g:1370:2: rule__Message__Group__5__Impl rule__Message__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Message__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__6();

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
    // $ANTLR end "rule__Message__Group__5"


    // $ANTLR start "rule__Message__Group__5__Impl"
    // InternalGlobalJade.g:1377:1: rule__Message__Group__5__Impl : ( 'from' ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1381:1: ( ( 'from' ) )
            // InternalGlobalJade.g:1382:1: ( 'from' )
            {
            // InternalGlobalJade.g:1382:1: ( 'from' )
            // InternalGlobalJade.g:1383:2: 'from'
            {
             before(grammarAccess.getMessageAccess().getFromKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getFromKeyword_5()); 

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
    // $ANTLR end "rule__Message__Group__5__Impl"


    // $ANTLR start "rule__Message__Group__6"
    // InternalGlobalJade.g:1392:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1396:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalGlobalJade.g:1397:2: rule__Message__Group__6__Impl rule__Message__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Message__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__7();

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
    // $ANTLR end "rule__Message__Group__6"


    // $ANTLR start "rule__Message__Group__6__Impl"
    // InternalGlobalJade.g:1404:1: rule__Message__Group__6__Impl : ( ( rule__Message__RoleAAssignment_6 ) ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1408:1: ( ( ( rule__Message__RoleAAssignment_6 ) ) )
            // InternalGlobalJade.g:1409:1: ( ( rule__Message__RoleAAssignment_6 ) )
            {
            // InternalGlobalJade.g:1409:1: ( ( rule__Message__RoleAAssignment_6 ) )
            // InternalGlobalJade.g:1410:2: ( rule__Message__RoleAAssignment_6 )
            {
             before(grammarAccess.getMessageAccess().getRoleAAssignment_6()); 
            // InternalGlobalJade.g:1411:2: ( rule__Message__RoleAAssignment_6 )
            // InternalGlobalJade.g:1411:3: rule__Message__RoleAAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Message__RoleAAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getRoleAAssignment_6()); 

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
    // $ANTLR end "rule__Message__Group__6__Impl"


    // $ANTLR start "rule__Message__Group__7"
    // InternalGlobalJade.g:1419:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1423:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalGlobalJade.g:1424:2: rule__Message__Group__7__Impl rule__Message__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Message__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__8();

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
    // $ANTLR end "rule__Message__Group__7"


    // $ANTLR start "rule__Message__Group__7__Impl"
    // InternalGlobalJade.g:1431:1: rule__Message__Group__7__Impl : ( 'to' ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1435:1: ( ( 'to' ) )
            // InternalGlobalJade.g:1436:1: ( 'to' )
            {
            // InternalGlobalJade.g:1436:1: ( 'to' )
            // InternalGlobalJade.g:1437:2: 'to'
            {
             before(grammarAccess.getMessageAccess().getToKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getToKeyword_7()); 

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
    // $ANTLR end "rule__Message__Group__7__Impl"


    // $ANTLR start "rule__Message__Group__8"
    // InternalGlobalJade.g:1446:1: rule__Message__Group__8 : rule__Message__Group__8__Impl rule__Message__Group__9 ;
    public final void rule__Message__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1450:1: ( rule__Message__Group__8__Impl rule__Message__Group__9 )
            // InternalGlobalJade.g:1451:2: rule__Message__Group__8__Impl rule__Message__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Message__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__9();

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
    // $ANTLR end "rule__Message__Group__8"


    // $ANTLR start "rule__Message__Group__8__Impl"
    // InternalGlobalJade.g:1458:1: rule__Message__Group__8__Impl : ( ( rule__Message__RoleBAssignment_8 ) ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1462:1: ( ( ( rule__Message__RoleBAssignment_8 ) ) )
            // InternalGlobalJade.g:1463:1: ( ( rule__Message__RoleBAssignment_8 ) )
            {
            // InternalGlobalJade.g:1463:1: ( ( rule__Message__RoleBAssignment_8 ) )
            // InternalGlobalJade.g:1464:2: ( rule__Message__RoleBAssignment_8 )
            {
             before(grammarAccess.getMessageAccess().getRoleBAssignment_8()); 
            // InternalGlobalJade.g:1465:2: ( rule__Message__RoleBAssignment_8 )
            // InternalGlobalJade.g:1465:3: rule__Message__RoleBAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Message__RoleBAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getRoleBAssignment_8()); 

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
    // $ANTLR end "rule__Message__Group__8__Impl"


    // $ANTLR start "rule__Message__Group__9"
    // InternalGlobalJade.g:1473:1: rule__Message__Group__9 : rule__Message__Group__9__Impl ;
    public final void rule__Message__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1477:1: ( rule__Message__Group__9__Impl )
            // InternalGlobalJade.g:1478:2: rule__Message__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__9__Impl();

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
    // $ANTLR end "rule__Message__Group__9"


    // $ANTLR start "rule__Message__Group__9__Impl"
    // InternalGlobalJade.g:1484:1: rule__Message__Group__9__Impl : ( ';' ) ;
    public final void rule__Message__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1488:1: ( ( ';' ) )
            // InternalGlobalJade.g:1489:1: ( ';' )
            {
            // InternalGlobalJade.g:1489:1: ( ';' )
            // InternalGlobalJade.g:1490:2: ';'
            {
             before(grammarAccess.getMessageAccess().getSemicolonKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getSemicolonKeyword_9()); 

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
    // $ANTLR end "rule__Message__Group__9__Impl"


    // $ANTLR start "rule__Message__Group_3__0"
    // InternalGlobalJade.g:1500:1: rule__Message__Group_3__0 : rule__Message__Group_3__0__Impl rule__Message__Group_3__1 ;
    public final void rule__Message__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1504:1: ( rule__Message__Group_3__0__Impl rule__Message__Group_3__1 )
            // InternalGlobalJade.g:1505:2: rule__Message__Group_3__0__Impl rule__Message__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Message__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group_3__1();

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
    // $ANTLR end "rule__Message__Group_3__0"


    // $ANTLR start "rule__Message__Group_3__0__Impl"
    // InternalGlobalJade.g:1512:1: rule__Message__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Message__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1516:1: ( ( ',' ) )
            // InternalGlobalJade.g:1517:1: ( ',' )
            {
            // InternalGlobalJade.g:1517:1: ( ',' )
            // InternalGlobalJade.g:1518:2: ','
            {
             before(grammarAccess.getMessageAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Message__Group_3__0__Impl"


    // $ANTLR start "rule__Message__Group_3__1"
    // InternalGlobalJade.g:1527:1: rule__Message__Group_3__1 : rule__Message__Group_3__1__Impl ;
    public final void rule__Message__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1531:1: ( rule__Message__Group_3__1__Impl )
            // InternalGlobalJade.g:1532:2: rule__Message__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group_3__1__Impl();

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
    // $ANTLR end "rule__Message__Group_3__1"


    // $ANTLR start "rule__Message__Group_3__1__Impl"
    // InternalGlobalJade.g:1538:1: rule__Message__Group_3__1__Impl : ( ( rule__Message__ContentAssignment_3_1 ) ) ;
    public final void rule__Message__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1542:1: ( ( ( rule__Message__ContentAssignment_3_1 ) ) )
            // InternalGlobalJade.g:1543:1: ( ( rule__Message__ContentAssignment_3_1 ) )
            {
            // InternalGlobalJade.g:1543:1: ( ( rule__Message__ContentAssignment_3_1 ) )
            // InternalGlobalJade.g:1544:2: ( rule__Message__ContentAssignment_3_1 )
            {
             before(grammarAccess.getMessageAccess().getContentAssignment_3_1()); 
            // InternalGlobalJade.g:1545:2: ( rule__Message__ContentAssignment_3_1 )
            // InternalGlobalJade.g:1545:3: rule__Message__ContentAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Message__ContentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getContentAssignment_3_1()); 

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
    // $ANTLR end "rule__Message__Group_3__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalGlobalJade.g:1554:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1558:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalGlobalJade.g:1559:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGlobalJade.g:1566:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1570:1: ( ( 'role' ) )
            // InternalGlobalJade.g:1571:1: ( 'role' )
            {
            // InternalGlobalJade.g:1571:1: ( 'role' )
            // InternalGlobalJade.g:1572:2: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGlobalJade.g:1581:1: rule__Role__Group__1 : rule__Role__Group__1__Impl ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1585:1: ( rule__Role__Group__1__Impl )
            // InternalGlobalJade.g:1586:2: rule__Role__Group__1__Impl
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
    // InternalGlobalJade.g:1592:1: rule__Role__Group__1__Impl : ( ( rule__Role__RoleAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1596:1: ( ( ( rule__Role__RoleAssignment_1 ) ) )
            // InternalGlobalJade.g:1597:1: ( ( rule__Role__RoleAssignment_1 ) )
            {
            // InternalGlobalJade.g:1597:1: ( ( rule__Role__RoleAssignment_1 ) )
            // InternalGlobalJade.g:1598:2: ( rule__Role__RoleAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getRoleAssignment_1()); 
            // InternalGlobalJade.g:1599:2: ( rule__Role__RoleAssignment_1 )
            // InternalGlobalJade.g:1599:3: rule__Role__RoleAssignment_1
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


    // $ANTLR start "rule__Model__NameAssignment_2"
    // InternalGlobalJade.g:1608:1: rule__Model__NameAssignment_2 : ( RULE_GENERAL_NAME ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1612:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1613:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1613:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1614:3: RULE_GENERAL_NAME
            {
             before(grammarAccess.getModelAccess().getNameGENERAL_NAMETerminalRuleCall_2_0()); 
            match(input,RULE_GENERAL_NAME,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameGENERAL_NAMETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__RolesAssignment_4"
    // InternalGlobalJade.g:1623:1: rule__Model__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1627:1: ( ( ruleRole ) )
            // InternalGlobalJade.g:1628:2: ( ruleRole )
            {
            // InternalGlobalJade.g:1628:2: ( ruleRole )
            // InternalGlobalJade.g:1629:3: ruleRole
            {
             before(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__RolesAssignment_4"


    // $ANTLR start "rule__Model__RolesAssignment_5_1"
    // InternalGlobalJade.g:1638:1: rule__Model__RolesAssignment_5_1 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1642:1: ( ( ruleRole ) )
            // InternalGlobalJade.g:1643:2: ( ruleRole )
            {
            // InternalGlobalJade.g:1643:2: ( ruleRole )
            // InternalGlobalJade.g:1644:3: ruleRole
            {
             before(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Model__RolesAssignment_5_1"


    // $ANTLR start "rule__Model__ProtocolAssignment_8"
    // InternalGlobalJade.g:1653:1: rule__Model__ProtocolAssignment_8 : ( ruleProtocol ) ;
    public final void rule__Model__ProtocolAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1657:1: ( ( ruleProtocol ) )
            // InternalGlobalJade.g:1658:2: ( ruleProtocol )
            {
            // InternalGlobalJade.g:1658:2: ( ruleProtocol )
            // InternalGlobalJade.g:1659:3: ruleProtocol
            {
             before(grammarAccess.getModelAccess().getProtocolProtocolParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProtocolProtocolParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Model__ProtocolAssignment_8"


    // $ANTLR start "rule__Protocol__ActionsAssignment_1"
    // InternalGlobalJade.g:1668:1: rule__Protocol__ActionsAssignment_1 : ( ( rule__Protocol__ActionsAlternatives_1_0 ) ) ;
    public final void rule__Protocol__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1672:1: ( ( ( rule__Protocol__ActionsAlternatives_1_0 ) ) )
            // InternalGlobalJade.g:1673:2: ( ( rule__Protocol__ActionsAlternatives_1_0 ) )
            {
            // InternalGlobalJade.g:1673:2: ( ( rule__Protocol__ActionsAlternatives_1_0 ) )
            // InternalGlobalJade.g:1674:3: ( rule__Protocol__ActionsAlternatives_1_0 )
            {
             before(grammarAccess.getProtocolAccess().getActionsAlternatives_1_0()); 
            // InternalGlobalJade.g:1675:3: ( rule__Protocol__ActionsAlternatives_1_0 )
            // InternalGlobalJade.g:1675:4: rule__Protocol__ActionsAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__ActionsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getActionsAlternatives_1_0()); 

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
    // $ANTLR end "rule__Protocol__ActionsAssignment_1"


    // $ANTLR start "rule__Choice_rule__Role_nameAssignment_2"
    // InternalGlobalJade.g:1683:1: rule__Choice_rule__Role_nameAssignment_2 : ( RULE_GENERAL_NAME ) ;
    public final void rule__Choice_rule__Role_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1687:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1688:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1688:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1689:3: RULE_GENERAL_NAME
            {
             before(grammarAccess.getChoice_ruleAccess().getRole_nameGENERAL_NAMETerminalRuleCall_2_0()); 
            match(input,RULE_GENERAL_NAME,FOLLOW_2); 
             after(grammarAccess.getChoice_ruleAccess().getRole_nameGENERAL_NAMETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Choice_rule__Role_nameAssignment_2"


    // $ANTLR start "rule__Choice_rule__MessagesAssignment_4"
    // InternalGlobalJade.g:1698:1: rule__Choice_rule__MessagesAssignment_4 : ( ruleMessage ) ;
    public final void rule__Choice_rule__MessagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1702:1: ( ( ruleMessage ) )
            // InternalGlobalJade.g:1703:2: ( ruleMessage )
            {
            // InternalGlobalJade.g:1703:2: ( ruleMessage )
            // InternalGlobalJade.g:1704:3: ruleMessage
            {
             before(grammarAccess.getChoice_ruleAccess().getMessagesMessageParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getChoice_ruleAccess().getMessagesMessageParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Choice_rule__MessagesAssignment_4"


    // $ANTLR start "rule__Choice_rule__MessagesAssignment_6_2"
    // InternalGlobalJade.g:1713:1: rule__Choice_rule__MessagesAssignment_6_2 : ( ruleMessage ) ;
    public final void rule__Choice_rule__MessagesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1717:1: ( ( ruleMessage ) )
            // InternalGlobalJade.g:1718:2: ( ruleMessage )
            {
            // InternalGlobalJade.g:1718:2: ( ruleMessage )
            // InternalGlobalJade.g:1719:3: ruleMessage
            {
             before(grammarAccess.getChoice_ruleAccess().getMessagesMessageParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getChoice_ruleAccess().getMessagesMessageParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Choice_rule__MessagesAssignment_6_2"


    // $ANTLR start "rule__For_loop__NameAssignment_1"
    // InternalGlobalJade.g:1728:1: rule__For_loop__NameAssignment_1 : ( RULE_GENERAL_NAME ) ;
    public final void rule__For_loop__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1732:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1733:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1733:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1734:3: RULE_GENERAL_NAME
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
    // InternalGlobalJade.g:1743:1: rule__For_loop__RoleAssignment_3 : ( RULE_GENERAL_NAME ) ;
    public final void rule__For_loop__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1747:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1748:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1748:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1749:3: RULE_GENERAL_NAME
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


    // $ANTLR start "rule__For_loop__MessagesAssignment_6"
    // InternalGlobalJade.g:1758:1: rule__For_loop__MessagesAssignment_6 : ( ruleMessage ) ;
    public final void rule__For_loop__MessagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1762:1: ( ( ruleMessage ) )
            // InternalGlobalJade.g:1763:2: ( ruleMessage )
            {
            // InternalGlobalJade.g:1763:2: ( ruleMessage )
            // InternalGlobalJade.g:1764:3: ruleMessage
            {
             before(grammarAccess.getFor_loopAccess().getMessagesMessageParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getFor_loopAccess().getMessagesMessageParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__For_loop__MessagesAssignment_6"


    // $ANTLR start "rule__End_message__EndAssignment_0"
    // InternalGlobalJade.g:1773:1: rule__End_message__EndAssignment_0 : ( ruleEND_MEX ) ;
    public final void rule__End_message__EndAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1777:1: ( ( ruleEND_MEX ) )
            // InternalGlobalJade.g:1778:2: ( ruleEND_MEX )
            {
            // InternalGlobalJade.g:1778:2: ( ruleEND_MEX )
            // InternalGlobalJade.g:1779:3: ruleEND_MEX
            {
             before(grammarAccess.getEnd_messageAccess().getEndEND_MEXParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEND_MEX();

            state._fsp--;

             after(grammarAccess.getEnd_messageAccess().getEndEND_MEXParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__End_message__EndAssignment_0"


    // $ANTLR start "rule__Message__TypeAssignment_0"
    // InternalGlobalJade.g:1788:1: rule__Message__TypeAssignment_0 : ( RULE_TYPE_MESSAGE ) ;
    public final void rule__Message__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1792:1: ( ( RULE_TYPE_MESSAGE ) )
            // InternalGlobalJade.g:1793:2: ( RULE_TYPE_MESSAGE )
            {
            // InternalGlobalJade.g:1793:2: ( RULE_TYPE_MESSAGE )
            // InternalGlobalJade.g:1794:3: RULE_TYPE_MESSAGE
            {
             before(grammarAccess.getMessageAccess().getTypeTYPE_MESSAGETerminalRuleCall_0_0()); 
            match(input,RULE_TYPE_MESSAGE,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getTypeTYPE_MESSAGETerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Message__TypeAssignment_0"


    // $ANTLR start "rule__Message__ContentAssignment_2"
    // InternalGlobalJade.g:1803:1: rule__Message__ContentAssignment_2 : ( RULE_CONTENT ) ;
    public final void rule__Message__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1807:1: ( ( RULE_CONTENT ) )
            // InternalGlobalJade.g:1808:2: ( RULE_CONTENT )
            {
            // InternalGlobalJade.g:1808:2: ( RULE_CONTENT )
            // InternalGlobalJade.g:1809:3: RULE_CONTENT
            {
             before(grammarAccess.getMessageAccess().getContentCONTENTTerminalRuleCall_2_0()); 
            match(input,RULE_CONTENT,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getContentCONTENTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Message__ContentAssignment_2"


    // $ANTLR start "rule__Message__ContentAssignment_3_1"
    // InternalGlobalJade.g:1818:1: rule__Message__ContentAssignment_3_1 : ( RULE_CONTENT ) ;
    public final void rule__Message__ContentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1822:1: ( ( RULE_CONTENT ) )
            // InternalGlobalJade.g:1823:2: ( RULE_CONTENT )
            {
            // InternalGlobalJade.g:1823:2: ( RULE_CONTENT )
            // InternalGlobalJade.g:1824:3: RULE_CONTENT
            {
             before(grammarAccess.getMessageAccess().getContentCONTENTTerminalRuleCall_3_1_0()); 
            match(input,RULE_CONTENT,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getContentCONTENTTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Message__ContentAssignment_3_1"


    // $ANTLR start "rule__Message__RoleAAssignment_6"
    // InternalGlobalJade.g:1833:1: rule__Message__RoleAAssignment_6 : ( RULE_GENERAL_NAME ) ;
    public final void rule__Message__RoleAAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1837:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1838:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1838:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1839:3: RULE_GENERAL_NAME
            {
             before(grammarAccess.getMessageAccess().getRoleAGENERAL_NAMETerminalRuleCall_6_0()); 
            match(input,RULE_GENERAL_NAME,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getRoleAGENERAL_NAMETerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Message__RoleAAssignment_6"


    // $ANTLR start "rule__Message__RoleBAssignment_8"
    // InternalGlobalJade.g:1848:1: rule__Message__RoleBAssignment_8 : ( RULE_GENERAL_NAME ) ;
    public final void rule__Message__RoleBAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1852:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1853:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1853:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1854:3: RULE_GENERAL_NAME
            {
             before(grammarAccess.getMessageAccess().getRoleBGENERAL_NAMETerminalRuleCall_8_0()); 
            match(input,RULE_GENERAL_NAME,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getRoleBGENERAL_NAMETerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Message__RoleBAssignment_8"


    // $ANTLR start "rule__Role__RoleAssignment_1"
    // InternalGlobalJade.g:1863:1: rule__Role__RoleAssignment_1 : ( RULE_GENERAL_NAME ) ;
    public final void rule__Role__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1867:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:1868:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:1868:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:1869:3: RULE_GENERAL_NAME
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002404020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002404022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});

}