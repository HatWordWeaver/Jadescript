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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_GENERAL_NAME", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "')'", "'role'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_GENERAL_NAME=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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

                if ( (LA1_0==12) ) {
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


    // $ANTLR start "entryRuleRole"
    // InternalGlobalJade.g:103:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalGlobalJade.g:104:1: ( ruleRole EOF )
            // InternalGlobalJade.g:105:1: ruleRole EOF
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
    // InternalGlobalJade.g:112:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:116:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalGlobalJade.g:117:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalGlobalJade.g:117:2: ( ( rule__Role__Group__0 ) )
            // InternalGlobalJade.g:118:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalGlobalJade.g:119:3: ( rule__Role__Group__0 )
            // InternalGlobalJade.g:119:4: rule__Role__Group__0
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


    // $ANTLR start "rule__Protocols__Group__0"
    // InternalGlobalJade.g:127:1: rule__Protocols__Group__0 : rule__Protocols__Group__0__Impl rule__Protocols__Group__1 ;
    public final void rule__Protocols__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:131:1: ( rule__Protocols__Group__0__Impl rule__Protocols__Group__1 )
            // InternalGlobalJade.g:132:2: rule__Protocols__Group__0__Impl rule__Protocols__Group__1
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
    // InternalGlobalJade.g:139:1: rule__Protocols__Group__0__Impl : ( 'global' ) ;
    public final void rule__Protocols__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:143:1: ( ( 'global' ) )
            // InternalGlobalJade.g:144:1: ( 'global' )
            {
            // InternalGlobalJade.g:144:1: ( 'global' )
            // InternalGlobalJade.g:145:2: 'global'
            {
             before(grammarAccess.getProtocolsAccess().getGlobalKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalGlobalJade.g:154:1: rule__Protocols__Group__1 : rule__Protocols__Group__1__Impl rule__Protocols__Group__2 ;
    public final void rule__Protocols__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:158:1: ( rule__Protocols__Group__1__Impl rule__Protocols__Group__2 )
            // InternalGlobalJade.g:159:2: rule__Protocols__Group__1__Impl rule__Protocols__Group__2
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
    // InternalGlobalJade.g:166:1: rule__Protocols__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__Protocols__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:170:1: ( ( 'protocol' ) )
            // InternalGlobalJade.g:171:1: ( 'protocol' )
            {
            // InternalGlobalJade.g:171:1: ( 'protocol' )
            // InternalGlobalJade.g:172:2: 'protocol'
            {
             before(grammarAccess.getProtocolsAccess().getProtocolKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGlobalJade.g:181:1: rule__Protocols__Group__2 : rule__Protocols__Group__2__Impl rule__Protocols__Group__3 ;
    public final void rule__Protocols__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:185:1: ( rule__Protocols__Group__2__Impl rule__Protocols__Group__3 )
            // InternalGlobalJade.g:186:2: rule__Protocols__Group__2__Impl rule__Protocols__Group__3
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
    // InternalGlobalJade.g:193:1: rule__Protocols__Group__2__Impl : ( ( rule__Protocols__NameAssignment_2 ) ) ;
    public final void rule__Protocols__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:197:1: ( ( ( rule__Protocols__NameAssignment_2 ) ) )
            // InternalGlobalJade.g:198:1: ( ( rule__Protocols__NameAssignment_2 ) )
            {
            // InternalGlobalJade.g:198:1: ( ( rule__Protocols__NameAssignment_2 ) )
            // InternalGlobalJade.g:199:2: ( rule__Protocols__NameAssignment_2 )
            {
             before(grammarAccess.getProtocolsAccess().getNameAssignment_2()); 
            // InternalGlobalJade.g:200:2: ( rule__Protocols__NameAssignment_2 )
            // InternalGlobalJade.g:200:3: rule__Protocols__NameAssignment_2
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
    // InternalGlobalJade.g:208:1: rule__Protocols__Group__3 : rule__Protocols__Group__3__Impl rule__Protocols__Group__4 ;
    public final void rule__Protocols__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:212:1: ( rule__Protocols__Group__3__Impl rule__Protocols__Group__4 )
            // InternalGlobalJade.g:213:2: rule__Protocols__Group__3__Impl rule__Protocols__Group__4
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
    // InternalGlobalJade.g:220:1: rule__Protocols__Group__3__Impl : ( '(' ) ;
    public final void rule__Protocols__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:224:1: ( ( '(' ) )
            // InternalGlobalJade.g:225:1: ( '(' )
            {
            // InternalGlobalJade.g:225:1: ( '(' )
            // InternalGlobalJade.g:226:2: '('
            {
             before(grammarAccess.getProtocolsAccess().getLeftParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGlobalJade.g:235:1: rule__Protocols__Group__4 : rule__Protocols__Group__4__Impl rule__Protocols__Group__5 ;
    public final void rule__Protocols__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:239:1: ( rule__Protocols__Group__4__Impl rule__Protocols__Group__5 )
            // InternalGlobalJade.g:240:2: rule__Protocols__Group__4__Impl rule__Protocols__Group__5
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
    // InternalGlobalJade.g:247:1: rule__Protocols__Group__4__Impl : ( ( ( rule__Protocols__RolesAssignment_4 ) ) ( ( rule__Protocols__RolesAssignment_4 )* ) ) ;
    public final void rule__Protocols__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:251:1: ( ( ( ( rule__Protocols__RolesAssignment_4 ) ) ( ( rule__Protocols__RolesAssignment_4 )* ) ) )
            // InternalGlobalJade.g:252:1: ( ( ( rule__Protocols__RolesAssignment_4 ) ) ( ( rule__Protocols__RolesAssignment_4 )* ) )
            {
            // InternalGlobalJade.g:252:1: ( ( ( rule__Protocols__RolesAssignment_4 ) ) ( ( rule__Protocols__RolesAssignment_4 )* ) )
            // InternalGlobalJade.g:253:2: ( ( rule__Protocols__RolesAssignment_4 ) ) ( ( rule__Protocols__RolesAssignment_4 )* )
            {
            // InternalGlobalJade.g:253:2: ( ( rule__Protocols__RolesAssignment_4 ) )
            // InternalGlobalJade.g:254:3: ( rule__Protocols__RolesAssignment_4 )
            {
             before(grammarAccess.getProtocolsAccess().getRolesAssignment_4()); 
            // InternalGlobalJade.g:255:3: ( rule__Protocols__RolesAssignment_4 )
            // InternalGlobalJade.g:255:4: rule__Protocols__RolesAssignment_4
            {
            pushFollow(FOLLOW_9);
            rule__Protocols__RolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProtocolsAccess().getRolesAssignment_4()); 

            }

            // InternalGlobalJade.g:258:2: ( ( rule__Protocols__RolesAssignment_4 )* )
            // InternalGlobalJade.g:259:3: ( rule__Protocols__RolesAssignment_4 )*
            {
             before(grammarAccess.getProtocolsAccess().getRolesAssignment_4()); 
            // InternalGlobalJade.g:260:3: ( rule__Protocols__RolesAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGlobalJade.g:260:4: rule__Protocols__RolesAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Protocols__RolesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProtocolsAccess().getRolesAssignment_4()); 

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
    // $ANTLR end "rule__Protocols__Group__4__Impl"


    // $ANTLR start "rule__Protocols__Group__5"
    // InternalGlobalJade.g:269:1: rule__Protocols__Group__5 : rule__Protocols__Group__5__Impl ;
    public final void rule__Protocols__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:273:1: ( rule__Protocols__Group__5__Impl )
            // InternalGlobalJade.g:274:2: rule__Protocols__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocols__Group__5__Impl();

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
    // InternalGlobalJade.g:280:1: rule__Protocols__Group__5__Impl : ( ')' ) ;
    public final void rule__Protocols__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:284:1: ( ( ')' ) )
            // InternalGlobalJade.g:285:1: ( ')' )
            {
            // InternalGlobalJade.g:285:1: ( ')' )
            // InternalGlobalJade.g:286:2: ')'
            {
             before(grammarAccess.getProtocolsAccess().getRightParenthesisKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProtocolsAccess().getRightParenthesisKeyword_5()); 

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


    // $ANTLR start "rule__Role__Group__0"
    // InternalGlobalJade.g:296:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:300:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalGlobalJade.g:301:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalGlobalJade.g:308:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:312:1: ( ( 'role' ) )
            // InternalGlobalJade.g:313:1: ( 'role' )
            {
            // InternalGlobalJade.g:313:1: ( 'role' )
            // InternalGlobalJade.g:314:2: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGlobalJade.g:323:1: rule__Role__Group__1 : rule__Role__Group__1__Impl ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:327:1: ( rule__Role__Group__1__Impl )
            // InternalGlobalJade.g:328:2: rule__Role__Group__1__Impl
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
    // InternalGlobalJade.g:334:1: rule__Role__Group__1__Impl : ( ( rule__Role__RoleAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:338:1: ( ( ( rule__Role__RoleAssignment_1 ) ) )
            // InternalGlobalJade.g:339:1: ( ( rule__Role__RoleAssignment_1 ) )
            {
            // InternalGlobalJade.g:339:1: ( ( rule__Role__RoleAssignment_1 ) )
            // InternalGlobalJade.g:340:2: ( rule__Role__RoleAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getRoleAssignment_1()); 
            // InternalGlobalJade.g:341:2: ( rule__Role__RoleAssignment_1 )
            // InternalGlobalJade.g:341:3: rule__Role__RoleAssignment_1
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
    // InternalGlobalJade.g:350:1: rule__Model__ProtocolsAssignment : ( ruleProtocols ) ;
    public final void rule__Model__ProtocolsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:354:1: ( ( ruleProtocols ) )
            // InternalGlobalJade.g:355:2: ( ruleProtocols )
            {
            // InternalGlobalJade.g:355:2: ( ruleProtocols )
            // InternalGlobalJade.g:356:3: ruleProtocols
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
    // InternalGlobalJade.g:365:1: rule__Protocols__NameAssignment_2 : ( RULE_GENERAL_NAME ) ;
    public final void rule__Protocols__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:369:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:370:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:370:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:371:3: RULE_GENERAL_NAME
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
    // InternalGlobalJade.g:380:1: rule__Protocols__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__Protocols__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:384:1: ( ( ruleRole ) )
            // InternalGlobalJade.g:385:2: ( ruleRole )
            {
            // InternalGlobalJade.g:385:2: ( ruleRole )
            // InternalGlobalJade.g:386:3: ruleRole
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


    // $ANTLR start "rule__Role__RoleAssignment_1"
    // InternalGlobalJade.g:395:1: rule__Role__RoleAssignment_1 : ( RULE_GENERAL_NAME ) ;
    public final void rule__Role__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:399:1: ( ( RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:400:2: ( RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:400:2: ( RULE_GENERAL_NAME )
            // InternalGlobalJade.g:401:3: RULE_GENERAL_NAME
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});

}