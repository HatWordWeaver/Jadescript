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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CFP'", "'REJECT-PROPOSAL'", "'ACCEPT-PROPOSAL'", "'FAILURE'", "'INFORM-DONE'", "'INFORM'", "'PROPOSE'", "'int'", "'string'", "'action'", "'global'", "'protocol'", "'('", "')'", "'{'", "'}'", "','", "'role'", "'multrole'", "':'", "'rec'", "'loop'", "';'", "'choice'", "'at'", "'or'", "'foreach'", "'in'", "'from'", "'to'"
    };
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


    // $ANTLR start "entryRuleRoles"
    // InternalGlobalJade.g:78:1: entryRuleRoles : ruleRoles EOF ;
    public final void entryRuleRoles() throws RecognitionException {
        try {
            // InternalGlobalJade.g:79:1: ( ruleRoles EOF )
            // InternalGlobalJade.g:80:1: ruleRoles EOF
            {
             before(grammarAccess.getRolesRule()); 
            pushFollow(FOLLOW_1);
            ruleRoles();

            state._fsp--;

             after(grammarAccess.getRolesRule()); 
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
    // $ANTLR end "entryRuleRoles"


    // $ANTLR start "ruleRoles"
    // InternalGlobalJade.g:87:1: ruleRoles : ( ( rule__Roles__Group__0 ) ) ;
    public final void ruleRoles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:91:2: ( ( ( rule__Roles__Group__0 ) ) )
            // InternalGlobalJade.g:92:2: ( ( rule__Roles__Group__0 ) )
            {
            // InternalGlobalJade.g:92:2: ( ( rule__Roles__Group__0 ) )
            // InternalGlobalJade.g:93:3: ( rule__Roles__Group__0 )
            {
             before(grammarAccess.getRolesAccess().getGroup()); 
            // InternalGlobalJade.g:94:3: ( rule__Roles__Group__0 )
            // InternalGlobalJade.g:94:4: rule__Roles__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Roles__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRolesAccess().getGroup()); 

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
    // $ANTLR end "ruleRoles"


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
    // InternalGlobalJade.g:112:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:116:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalGlobalJade.g:117:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalGlobalJade.g:117:2: ( ( rule__Role__Alternatives ) )
            // InternalGlobalJade.g:118:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalGlobalJade.g:119:3: ( rule__Role__Alternatives )
            // InternalGlobalJade.g:119:4: rule__Role__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Role__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleRoleOne"
    // InternalGlobalJade.g:128:1: entryRuleRoleOne : ruleRoleOne EOF ;
    public final void entryRuleRoleOne() throws RecognitionException {
        try {
            // InternalGlobalJade.g:129:1: ( ruleRoleOne EOF )
            // InternalGlobalJade.g:130:1: ruleRoleOne EOF
            {
             before(grammarAccess.getRoleOneRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleOne();

            state._fsp--;

             after(grammarAccess.getRoleOneRule()); 
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
    // $ANTLR end "entryRuleRoleOne"


    // $ANTLR start "ruleRoleOne"
    // InternalGlobalJade.g:137:1: ruleRoleOne : ( ( rule__RoleOne__Group__0 ) ) ;
    public final void ruleRoleOne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:141:2: ( ( ( rule__RoleOne__Group__0 ) ) )
            // InternalGlobalJade.g:142:2: ( ( rule__RoleOne__Group__0 ) )
            {
            // InternalGlobalJade.g:142:2: ( ( rule__RoleOne__Group__0 ) )
            // InternalGlobalJade.g:143:3: ( rule__RoleOne__Group__0 )
            {
             before(grammarAccess.getRoleOneAccess().getGroup()); 
            // InternalGlobalJade.g:144:3: ( rule__RoleOne__Group__0 )
            // InternalGlobalJade.g:144:4: rule__RoleOne__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoleOne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleOneAccess().getGroup()); 

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
    // $ANTLR end "ruleRoleOne"


    // $ANTLR start "entryRuleRoleMultiple"
    // InternalGlobalJade.g:153:1: entryRuleRoleMultiple : ruleRoleMultiple EOF ;
    public final void entryRuleRoleMultiple() throws RecognitionException {
        try {
            // InternalGlobalJade.g:154:1: ( ruleRoleMultiple EOF )
            // InternalGlobalJade.g:155:1: ruleRoleMultiple EOF
            {
             before(grammarAccess.getRoleMultipleRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleMultiple();

            state._fsp--;

             after(grammarAccess.getRoleMultipleRule()); 
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
    // $ANTLR end "entryRuleRoleMultiple"


    // $ANTLR start "ruleRoleMultiple"
    // InternalGlobalJade.g:162:1: ruleRoleMultiple : ( ( rule__RoleMultiple__Group__0 ) ) ;
    public final void ruleRoleMultiple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:166:2: ( ( ( rule__RoleMultiple__Group__0 ) ) )
            // InternalGlobalJade.g:167:2: ( ( rule__RoleMultiple__Group__0 ) )
            {
            // InternalGlobalJade.g:167:2: ( ( rule__RoleMultiple__Group__0 ) )
            // InternalGlobalJade.g:168:3: ( rule__RoleMultiple__Group__0 )
            {
             before(grammarAccess.getRoleMultipleAccess().getGroup()); 
            // InternalGlobalJade.g:169:3: ( rule__RoleMultiple__Group__0 )
            // InternalGlobalJade.g:169:4: rule__RoleMultiple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoleMultiple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleMultipleAccess().getGroup()); 

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
    // $ANTLR end "ruleRoleMultiple"


    // $ANTLR start "entryRuleProtocol"
    // InternalGlobalJade.g:178:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // InternalGlobalJade.g:179:1: ( ruleProtocol EOF )
            // InternalGlobalJade.g:180:1: ruleProtocol EOF
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
    // InternalGlobalJade.g:187:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:191:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // InternalGlobalJade.g:192:2: ( ( rule__Protocol__Group__0 ) )
            {
            // InternalGlobalJade.g:192:2: ( ( rule__Protocol__Group__0 ) )
            // InternalGlobalJade.g:193:3: ( rule__Protocol__Group__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup()); 
            // InternalGlobalJade.g:194:3: ( rule__Protocol__Group__0 )
            // InternalGlobalJade.g:194:4: rule__Protocol__Group__0
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


    // $ANTLR start "entryRuleRecursion"
    // InternalGlobalJade.g:203:1: entryRuleRecursion : ruleRecursion EOF ;
    public final void entryRuleRecursion() throws RecognitionException {
        try {
            // InternalGlobalJade.g:204:1: ( ruleRecursion EOF )
            // InternalGlobalJade.g:205:1: ruleRecursion EOF
            {
             before(grammarAccess.getRecursionRule()); 
            pushFollow(FOLLOW_1);
            ruleRecursion();

            state._fsp--;

             after(grammarAccess.getRecursionRule()); 
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
    // $ANTLR end "entryRuleRecursion"


    // $ANTLR start "ruleRecursion"
    // InternalGlobalJade.g:212:1: ruleRecursion : ( ( rule__Recursion__Group__0 ) ) ;
    public final void ruleRecursion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:216:2: ( ( ( rule__Recursion__Group__0 ) ) )
            // InternalGlobalJade.g:217:2: ( ( rule__Recursion__Group__0 ) )
            {
            // InternalGlobalJade.g:217:2: ( ( rule__Recursion__Group__0 ) )
            // InternalGlobalJade.g:218:3: ( rule__Recursion__Group__0 )
            {
             before(grammarAccess.getRecursionAccess().getGroup()); 
            // InternalGlobalJade.g:219:3: ( rule__Recursion__Group__0 )
            // InternalGlobalJade.g:219:4: rule__Recursion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Recursion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecursionAccess().getGroup()); 

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
    // $ANTLR end "ruleRecursion"


    // $ANTLR start "entryRuleCloseRecursion"
    // InternalGlobalJade.g:228:1: entryRuleCloseRecursion : ruleCloseRecursion EOF ;
    public final void entryRuleCloseRecursion() throws RecognitionException {
        try {
            // InternalGlobalJade.g:229:1: ( ruleCloseRecursion EOF )
            // InternalGlobalJade.g:230:1: ruleCloseRecursion EOF
            {
             before(grammarAccess.getCloseRecursionRule()); 
            pushFollow(FOLLOW_1);
            ruleCloseRecursion();

            state._fsp--;

             after(grammarAccess.getCloseRecursionRule()); 
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
    // $ANTLR end "entryRuleCloseRecursion"


    // $ANTLR start "ruleCloseRecursion"
    // InternalGlobalJade.g:237:1: ruleCloseRecursion : ( ( rule__CloseRecursion__Group__0 ) ) ;
    public final void ruleCloseRecursion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:241:2: ( ( ( rule__CloseRecursion__Group__0 ) ) )
            // InternalGlobalJade.g:242:2: ( ( rule__CloseRecursion__Group__0 ) )
            {
            // InternalGlobalJade.g:242:2: ( ( rule__CloseRecursion__Group__0 ) )
            // InternalGlobalJade.g:243:3: ( rule__CloseRecursion__Group__0 )
            {
             before(grammarAccess.getCloseRecursionAccess().getGroup()); 
            // InternalGlobalJade.g:244:3: ( rule__CloseRecursion__Group__0 )
            // InternalGlobalJade.g:244:4: rule__CloseRecursion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CloseRecursion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCloseRecursionAccess().getGroup()); 

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
    // $ANTLR end "ruleCloseRecursion"


    // $ANTLR start "entryRuleChoice"
    // InternalGlobalJade.g:253:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // InternalGlobalJade.g:254:1: ( ruleChoice EOF )
            // InternalGlobalJade.g:255:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
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
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // InternalGlobalJade.g:262:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:266:2: ( ( ( rule__Choice__Group__0 ) ) )
            // InternalGlobalJade.g:267:2: ( ( rule__Choice__Group__0 ) )
            {
            // InternalGlobalJade.g:267:2: ( ( rule__Choice__Group__0 ) )
            // InternalGlobalJade.g:268:3: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // InternalGlobalJade.g:269:3: ( rule__Choice__Group__0 )
            // InternalGlobalJade.g:269:4: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getGroup()); 

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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleForEach"
    // InternalGlobalJade.g:278:1: entryRuleForEach : ruleForEach EOF ;
    public final void entryRuleForEach() throws RecognitionException {
        try {
            // InternalGlobalJade.g:279:1: ( ruleForEach EOF )
            // InternalGlobalJade.g:280:1: ruleForEach EOF
            {
             before(grammarAccess.getForEachRule()); 
            pushFollow(FOLLOW_1);
            ruleForEach();

            state._fsp--;

             after(grammarAccess.getForEachRule()); 
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
    // $ANTLR end "entryRuleForEach"


    // $ANTLR start "ruleForEach"
    // InternalGlobalJade.g:287:1: ruleForEach : ( ( rule__ForEach__Group__0 ) ) ;
    public final void ruleForEach() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:291:2: ( ( ( rule__ForEach__Group__0 ) ) )
            // InternalGlobalJade.g:292:2: ( ( rule__ForEach__Group__0 ) )
            {
            // InternalGlobalJade.g:292:2: ( ( rule__ForEach__Group__0 ) )
            // InternalGlobalJade.g:293:3: ( rule__ForEach__Group__0 )
            {
             before(grammarAccess.getForEachAccess().getGroup()); 
            // InternalGlobalJade.g:294:3: ( rule__ForEach__Group__0 )
            // InternalGlobalJade.g:294:4: rule__ForEach__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getGroup()); 

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
    // $ANTLR end "ruleForEach"


    // $ANTLR start "entryRuleMessage"
    // InternalGlobalJade.g:303:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalGlobalJade.g:304:1: ( ruleMessage EOF )
            // InternalGlobalJade.g:305:1: ruleMessage EOF
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
    // InternalGlobalJade.g:312:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:316:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalGlobalJade.g:317:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalGlobalJade.g:317:2: ( ( rule__Message__Group__0 ) )
            // InternalGlobalJade.g:318:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalGlobalJade.g:319:3: ( rule__Message__Group__0 )
            // InternalGlobalJade.g:319:4: rule__Message__Group__0
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


    // $ANTLR start "entryRuleMessageType"
    // InternalGlobalJade.g:328:1: entryRuleMessageType : ruleMessageType EOF ;
    public final void entryRuleMessageType() throws RecognitionException {
        try {
            // InternalGlobalJade.g:329:1: ( ruleMessageType EOF )
            // InternalGlobalJade.g:330:1: ruleMessageType EOF
            {
             before(grammarAccess.getMessageTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getMessageTypeRule()); 
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
    // $ANTLR end "entryRuleMessageType"


    // $ANTLR start "ruleMessageType"
    // InternalGlobalJade.g:337:1: ruleMessageType : ( ( rule__MessageType__Alternatives ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:341:2: ( ( ( rule__MessageType__Alternatives ) ) )
            // InternalGlobalJade.g:342:2: ( ( rule__MessageType__Alternatives ) )
            {
            // InternalGlobalJade.g:342:2: ( ( rule__MessageType__Alternatives ) )
            // InternalGlobalJade.g:343:3: ( rule__MessageType__Alternatives )
            {
             before(grammarAccess.getMessageTypeAccess().getAlternatives()); 
            // InternalGlobalJade.g:344:3: ( rule__MessageType__Alternatives )
            // InternalGlobalJade.g:344:4: rule__MessageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MessageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMessageType"


    // $ANTLR start "entryRulePayload"
    // InternalGlobalJade.g:353:1: entryRulePayload : rulePayload EOF ;
    public final void entryRulePayload() throws RecognitionException {
        try {
            // InternalGlobalJade.g:354:1: ( rulePayload EOF )
            // InternalGlobalJade.g:355:1: rulePayload EOF
            {
             before(grammarAccess.getPayloadRule()); 
            pushFollow(FOLLOW_1);
            rulePayload();

            state._fsp--;

             after(grammarAccess.getPayloadRule()); 
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
    // $ANTLR end "entryRulePayload"


    // $ANTLR start "rulePayload"
    // InternalGlobalJade.g:362:1: rulePayload : ( ( rule__Payload__Group__0 ) ) ;
    public final void rulePayload() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:366:2: ( ( ( rule__Payload__Group__0 ) ) )
            // InternalGlobalJade.g:367:2: ( ( rule__Payload__Group__0 ) )
            {
            // InternalGlobalJade.g:367:2: ( ( rule__Payload__Group__0 ) )
            // InternalGlobalJade.g:368:3: ( rule__Payload__Group__0 )
            {
             before(grammarAccess.getPayloadAccess().getGroup()); 
            // InternalGlobalJade.g:369:3: ( rule__Payload__Group__0 )
            // InternalGlobalJade.g:369:4: rule__Payload__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getGroup()); 

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
    // $ANTLR end "rulePayload"


    // $ANTLR start "entryRuleType"
    // InternalGlobalJade.g:378:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalGlobalJade.g:379:1: ( ruleType EOF )
            // InternalGlobalJade.g:380:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGlobalJade.g:387:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:391:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalGlobalJade.g:392:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalGlobalJade.g:392:2: ( ( rule__Type__Alternatives ) )
            // InternalGlobalJade.g:393:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalGlobalJade.g:394:3: ( rule__Type__Alternatives )
            // InternalGlobalJade.g:394:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Role__Alternatives"
    // InternalGlobalJade.g:402:1: rule__Role__Alternatives : ( ( ruleRoleOne ) | ( ruleRoleMultiple ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:406:1: ( ( ruleRoleOne ) | ( ruleRoleMultiple ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGlobalJade.g:407:2: ( ruleRoleOne )
                    {
                    // InternalGlobalJade.g:407:2: ( ruleRoleOne )
                    // InternalGlobalJade.g:408:3: ruleRoleOne
                    {
                     before(grammarAccess.getRoleAccess().getRoleOneParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRoleOne();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getRoleOneParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:413:2: ( ruleRoleMultiple )
                    {
                    // InternalGlobalJade.g:413:2: ( ruleRoleMultiple )
                    // InternalGlobalJade.g:414:3: ruleRoleMultiple
                    {
                     before(grammarAccess.getRoleAccess().getRoleMultipleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRoleMultiple();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getRoleMultipleParserRuleCall_1()); 

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
    // $ANTLR end "rule__Role__Alternatives"


    // $ANTLR start "rule__Protocol__ActionsAlternatives_1_0"
    // InternalGlobalJade.g:423:1: rule__Protocol__ActionsAlternatives_1_0 : ( ( ruleMessage ) | ( ruleChoice ) | ( ruleForEach ) | ( ruleRecursion ) | ( ruleCloseRecursion ) );
    public final void rule__Protocol__ActionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:427:1: ( ( ruleMessage ) | ( ruleChoice ) | ( ruleForEach ) | ( ruleRecursion ) | ( ruleCloseRecursion ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            case 32:
                {
                alt2=4;
                }
                break;
            case 33:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGlobalJade.g:428:2: ( ruleMessage )
                    {
                    // InternalGlobalJade.g:428:2: ( ruleMessage )
                    // InternalGlobalJade.g:429:3: ruleMessage
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
                    // InternalGlobalJade.g:434:2: ( ruleChoice )
                    {
                    // InternalGlobalJade.g:434:2: ( ruleChoice )
                    // InternalGlobalJade.g:435:3: ruleChoice
                    {
                     before(grammarAccess.getProtocolAccess().getActionsChoiceParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChoice();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsChoiceParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGlobalJade.g:440:2: ( ruleForEach )
                    {
                    // InternalGlobalJade.g:440:2: ( ruleForEach )
                    // InternalGlobalJade.g:441:3: ruleForEach
                    {
                     before(grammarAccess.getProtocolAccess().getActionsForEachParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForEach();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsForEachParserRuleCall_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGlobalJade.g:446:2: ( ruleRecursion )
                    {
                    // InternalGlobalJade.g:446:2: ( ruleRecursion )
                    // InternalGlobalJade.g:447:3: ruleRecursion
                    {
                     before(grammarAccess.getProtocolAccess().getActionsRecursionParserRuleCall_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRecursion();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsRecursionParserRuleCall_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGlobalJade.g:452:2: ( ruleCloseRecursion )
                    {
                    // InternalGlobalJade.g:452:2: ( ruleCloseRecursion )
                    // InternalGlobalJade.g:453:3: ruleCloseRecursion
                    {
                     before(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_1_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCloseRecursion();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_1_0_4()); 

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


    // $ANTLR start "rule__MessageType__Alternatives"
    // InternalGlobalJade.g:462:1: rule__MessageType__Alternatives : ( ( 'CFP' ) | ( 'REJECT-PROPOSAL' ) | ( 'ACCEPT-PROPOSAL' ) | ( 'FAILURE' ) | ( 'INFORM-DONE' ) | ( 'INFORM' ) | ( 'PROPOSE' ) );
    public final void rule__MessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:466:1: ( ( 'CFP' ) | ( 'REJECT-PROPOSAL' ) | ( 'ACCEPT-PROPOSAL' ) | ( 'FAILURE' ) | ( 'INFORM-DONE' ) | ( 'INFORM' ) | ( 'PROPOSE' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGlobalJade.g:467:2: ( 'CFP' )
                    {
                    // InternalGlobalJade.g:467:2: ( 'CFP' )
                    // InternalGlobalJade.g:468:3: 'CFP'
                    {
                     before(grammarAccess.getMessageTypeAccess().getCFPKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getCFPKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:473:2: ( 'REJECT-PROPOSAL' )
                    {
                    // InternalGlobalJade.g:473:2: ( 'REJECT-PROPOSAL' )
                    // InternalGlobalJade.g:474:3: 'REJECT-PROPOSAL'
                    {
                     before(grammarAccess.getMessageTypeAccess().getREJECTPROPOSALKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getREJECTPROPOSALKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGlobalJade.g:479:2: ( 'ACCEPT-PROPOSAL' )
                    {
                    // InternalGlobalJade.g:479:2: ( 'ACCEPT-PROPOSAL' )
                    // InternalGlobalJade.g:480:3: 'ACCEPT-PROPOSAL'
                    {
                     before(grammarAccess.getMessageTypeAccess().getACCEPTPROPOSALKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getACCEPTPROPOSALKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGlobalJade.g:485:2: ( 'FAILURE' )
                    {
                    // InternalGlobalJade.g:485:2: ( 'FAILURE' )
                    // InternalGlobalJade.g:486:3: 'FAILURE'
                    {
                     before(grammarAccess.getMessageTypeAccess().getFAILUREKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getFAILUREKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGlobalJade.g:491:2: ( 'INFORM-DONE' )
                    {
                    // InternalGlobalJade.g:491:2: ( 'INFORM-DONE' )
                    // InternalGlobalJade.g:492:3: 'INFORM-DONE'
                    {
                     before(grammarAccess.getMessageTypeAccess().getINFORMDONEKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getINFORMDONEKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGlobalJade.g:497:2: ( 'INFORM' )
                    {
                    // InternalGlobalJade.g:497:2: ( 'INFORM' )
                    // InternalGlobalJade.g:498:3: 'INFORM'
                    {
                     before(grammarAccess.getMessageTypeAccess().getINFORMKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getINFORMKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGlobalJade.g:503:2: ( 'PROPOSE' )
                    {
                    // InternalGlobalJade.g:503:2: ( 'PROPOSE' )
                    // InternalGlobalJade.g:504:3: 'PROPOSE'
                    {
                     before(grammarAccess.getMessageTypeAccess().getPROPOSEKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMessageTypeAccess().getPROPOSEKeyword_6()); 

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
    // $ANTLR end "rule__MessageType__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalGlobalJade.g:513:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'action' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:517:1: ( ( 'int' ) | ( 'string' ) | ( 'action' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGlobalJade.g:518:2: ( 'int' )
                    {
                    // InternalGlobalJade.g:518:2: ( 'int' )
                    // InternalGlobalJade.g:519:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:524:2: ( 'string' )
                    {
                    // InternalGlobalJade.g:524:2: ( 'string' )
                    // InternalGlobalJade.g:525:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGlobalJade.g:530:2: ( 'action' )
                    {
                    // InternalGlobalJade.g:530:2: ( 'action' )
                    // InternalGlobalJade.g:531:3: 'action'
                    {
                     before(grammarAccess.getTypeAccess().getActionKeyword_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getActionKeyword_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalGlobalJade.g:540:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:544:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGlobalJade.g:545:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalGlobalJade.g:552:1: rule__Model__Group__0__Impl : ( 'global' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:556:1: ( ( 'global' ) )
            // InternalGlobalJade.g:557:1: ( 'global' )
            {
            // InternalGlobalJade.g:557:1: ( 'global' )
            // InternalGlobalJade.g:558:2: 'global'
            {
             before(grammarAccess.getModelAccess().getGlobalKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGlobalJade.g:567:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:571:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalGlobalJade.g:572:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalGlobalJade.g:579:1: rule__Model__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:583:1: ( ( 'protocol' ) )
            // InternalGlobalJade.g:584:1: ( 'protocol' )
            {
            // InternalGlobalJade.g:584:1: ( 'protocol' )
            // InternalGlobalJade.g:585:2: 'protocol'
            {
             before(grammarAccess.getModelAccess().getProtocolKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGlobalJade.g:594:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:598:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalGlobalJade.g:599:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalGlobalJade.g:606:1: rule__Model__Group__2__Impl : ( ( rule__Model__ProtocolNameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:610:1: ( ( ( rule__Model__ProtocolNameAssignment_2 ) ) )
            // InternalGlobalJade.g:611:1: ( ( rule__Model__ProtocolNameAssignment_2 ) )
            {
            // InternalGlobalJade.g:611:1: ( ( rule__Model__ProtocolNameAssignment_2 ) )
            // InternalGlobalJade.g:612:2: ( rule__Model__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getProtocolNameAssignment_2()); 
            // InternalGlobalJade.g:613:2: ( rule__Model__ProtocolNameAssignment_2 )
            // InternalGlobalJade.g:613:3: rule__Model__ProtocolNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__ProtocolNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getProtocolNameAssignment_2()); 

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
    // InternalGlobalJade.g:621:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:625:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalGlobalJade.g:626:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalGlobalJade.g:633:1: rule__Model__Group__3__Impl : ( '(' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:637:1: ( ( '(' ) )
            // InternalGlobalJade.g:638:1: ( '(' )
            {
            // InternalGlobalJade.g:638:1: ( '(' )
            // InternalGlobalJade.g:639:2: '('
            {
             before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGlobalJade.g:648:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:652:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalGlobalJade.g:653:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalGlobalJade.g:660:1: rule__Model__Group__4__Impl : ( ( rule__Model__RolesAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:664:1: ( ( ( rule__Model__RolesAssignment_4 ) ) )
            // InternalGlobalJade.g:665:1: ( ( rule__Model__RolesAssignment_4 ) )
            {
            // InternalGlobalJade.g:665:1: ( ( rule__Model__RolesAssignment_4 ) )
            // InternalGlobalJade.g:666:2: ( rule__Model__RolesAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getRolesAssignment_4()); 
            // InternalGlobalJade.g:667:2: ( rule__Model__RolesAssignment_4 )
            // InternalGlobalJade.g:667:3: rule__Model__RolesAssignment_4
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
    // InternalGlobalJade.g:675:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:679:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalGlobalJade.g:680:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalGlobalJade.g:687:1: rule__Model__Group__5__Impl : ( ')' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:691:1: ( ( ')' ) )
            // InternalGlobalJade.g:692:1: ( ')' )
            {
            // InternalGlobalJade.g:692:1: ( ')' )
            // InternalGlobalJade.g:693:2: ')'
            {
             before(grammarAccess.getModelAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightParenthesisKeyword_5()); 

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
    // InternalGlobalJade.g:702:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:706:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalGlobalJade.g:707:2: rule__Model__Group__6__Impl rule__Model__Group__7
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
    // InternalGlobalJade.g:714:1: rule__Model__Group__6__Impl : ( '{' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:718:1: ( ( '{' ) )
            // InternalGlobalJade.g:719:1: ( '{' )
            {
            // InternalGlobalJade.g:719:1: ( '{' )
            // InternalGlobalJade.g:720:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); 

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
    // InternalGlobalJade.g:729:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:733:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalGlobalJade.g:734:2: rule__Model__Group__7__Impl rule__Model__Group__8
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
    // InternalGlobalJade.g:741:1: rule__Model__Group__7__Impl : ( ( rule__Model__ProtocolAssignment_7 ) ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:745:1: ( ( ( rule__Model__ProtocolAssignment_7 ) ) )
            // InternalGlobalJade.g:746:1: ( ( rule__Model__ProtocolAssignment_7 ) )
            {
            // InternalGlobalJade.g:746:1: ( ( rule__Model__ProtocolAssignment_7 ) )
            // InternalGlobalJade.g:747:2: ( rule__Model__ProtocolAssignment_7 )
            {
             before(grammarAccess.getModelAccess().getProtocolAssignment_7()); 
            // InternalGlobalJade.g:748:2: ( rule__Model__ProtocolAssignment_7 )
            // InternalGlobalJade.g:748:3: rule__Model__ProtocolAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Model__ProtocolAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getProtocolAssignment_7()); 

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
    // InternalGlobalJade.g:756:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:760:1: ( rule__Model__Group__8__Impl )
            // InternalGlobalJade.g:761:2: rule__Model__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__8__Impl();

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
    // InternalGlobalJade.g:767:1: rule__Model__Group__8__Impl : ( '}' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:771:1: ( ( '}' ) )
            // InternalGlobalJade.g:772:1: ( '}' )
            {
            // InternalGlobalJade.g:772:1: ( '}' )
            // InternalGlobalJade.g:773:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); 

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


    // $ANTLR start "rule__Roles__Group__0"
    // InternalGlobalJade.g:783:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:787:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalGlobalJade.g:788:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Roles__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Roles__Group__1();

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
    // $ANTLR end "rule__Roles__Group__0"


    // $ANTLR start "rule__Roles__Group__0__Impl"
    // InternalGlobalJade.g:795:1: rule__Roles__Group__0__Impl : ( ( rule__Roles__RolesAssignment_0 ) ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:799:1: ( ( ( rule__Roles__RolesAssignment_0 ) ) )
            // InternalGlobalJade.g:800:1: ( ( rule__Roles__RolesAssignment_0 ) )
            {
            // InternalGlobalJade.g:800:1: ( ( rule__Roles__RolesAssignment_0 ) )
            // InternalGlobalJade.g:801:2: ( rule__Roles__RolesAssignment_0 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_0()); 
            // InternalGlobalJade.g:802:2: ( rule__Roles__RolesAssignment_0 )
            // InternalGlobalJade.g:802:3: rule__Roles__RolesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Roles__RolesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRolesAccess().getRolesAssignment_0()); 

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
    // $ANTLR end "rule__Roles__Group__0__Impl"


    // $ANTLR start "rule__Roles__Group__1"
    // InternalGlobalJade.g:810:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:814:1: ( rule__Roles__Group__1__Impl )
            // InternalGlobalJade.g:815:2: rule__Roles__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Roles__Group__1__Impl();

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
    // $ANTLR end "rule__Roles__Group__1"


    // $ANTLR start "rule__Roles__Group__1__Impl"
    // InternalGlobalJade.g:821:1: rule__Roles__Group__1__Impl : ( ( rule__Roles__Group_1__0 )* ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:825:1: ( ( ( rule__Roles__Group_1__0 )* ) )
            // InternalGlobalJade.g:826:1: ( ( rule__Roles__Group_1__0 )* )
            {
            // InternalGlobalJade.g:826:1: ( ( rule__Roles__Group_1__0 )* )
            // InternalGlobalJade.g:827:2: ( rule__Roles__Group_1__0 )*
            {
             before(grammarAccess.getRolesAccess().getGroup_1()); 
            // InternalGlobalJade.g:828:2: ( rule__Roles__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGlobalJade.g:828:3: rule__Roles__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Roles__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRolesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Roles__Group__1__Impl"


    // $ANTLR start "rule__Roles__Group_1__0"
    // InternalGlobalJade.g:837:1: rule__Roles__Group_1__0 : rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 ;
    public final void rule__Roles__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:841:1: ( rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1 )
            // InternalGlobalJade.g:842:2: rule__Roles__Group_1__0__Impl rule__Roles__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Roles__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Roles__Group_1__1();

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
    // $ANTLR end "rule__Roles__Group_1__0"


    // $ANTLR start "rule__Roles__Group_1__0__Impl"
    // InternalGlobalJade.g:849:1: rule__Roles__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Roles__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:853:1: ( ( ',' ) )
            // InternalGlobalJade.g:854:1: ( ',' )
            {
            // InternalGlobalJade.g:854:1: ( ',' )
            // InternalGlobalJade.g:855:2: ','
            {
             before(grammarAccess.getRolesAccess().getCommaKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRolesAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Roles__Group_1__0__Impl"


    // $ANTLR start "rule__Roles__Group_1__1"
    // InternalGlobalJade.g:864:1: rule__Roles__Group_1__1 : rule__Roles__Group_1__1__Impl ;
    public final void rule__Roles__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:868:1: ( rule__Roles__Group_1__1__Impl )
            // InternalGlobalJade.g:869:2: rule__Roles__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Roles__Group_1__1__Impl();

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
    // $ANTLR end "rule__Roles__Group_1__1"


    // $ANTLR start "rule__Roles__Group_1__1__Impl"
    // InternalGlobalJade.g:875:1: rule__Roles__Group_1__1__Impl : ( ( rule__Roles__RolesAssignment_1_1 ) ) ;
    public final void rule__Roles__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:879:1: ( ( ( rule__Roles__RolesAssignment_1_1 ) ) )
            // InternalGlobalJade.g:880:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            {
            // InternalGlobalJade.g:880:1: ( ( rule__Roles__RolesAssignment_1_1 ) )
            // InternalGlobalJade.g:881:2: ( rule__Roles__RolesAssignment_1_1 )
            {
             before(grammarAccess.getRolesAccess().getRolesAssignment_1_1()); 
            // InternalGlobalJade.g:882:2: ( rule__Roles__RolesAssignment_1_1 )
            // InternalGlobalJade.g:882:3: rule__Roles__RolesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Roles__RolesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRolesAccess().getRolesAssignment_1_1()); 

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
    // $ANTLR end "rule__Roles__Group_1__1__Impl"


    // $ANTLR start "rule__RoleOne__Group__0"
    // InternalGlobalJade.g:891:1: rule__RoleOne__Group__0 : rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 ;
    public final void rule__RoleOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:895:1: ( rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1 )
            // InternalGlobalJade.g:896:2: rule__RoleOne__Group__0__Impl rule__RoleOne__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RoleOne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleOne__Group__1();

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
    // $ANTLR end "rule__RoleOne__Group__0"


    // $ANTLR start "rule__RoleOne__Group__0__Impl"
    // InternalGlobalJade.g:903:1: rule__RoleOne__Group__0__Impl : ( 'role' ) ;
    public final void rule__RoleOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:907:1: ( ( 'role' ) )
            // InternalGlobalJade.g:908:1: ( 'role' )
            {
            // InternalGlobalJade.g:908:1: ( 'role' )
            // InternalGlobalJade.g:909:2: 'role'
            {
             before(grammarAccess.getRoleOneAccess().getRoleKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRoleOneAccess().getRoleKeyword_0()); 

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
    // $ANTLR end "rule__RoleOne__Group__0__Impl"


    // $ANTLR start "rule__RoleOne__Group__1"
    // InternalGlobalJade.g:918:1: rule__RoleOne__Group__1 : rule__RoleOne__Group__1__Impl ;
    public final void rule__RoleOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:922:1: ( rule__RoleOne__Group__1__Impl )
            // InternalGlobalJade.g:923:2: rule__RoleOne__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoleOne__Group__1__Impl();

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
    // $ANTLR end "rule__RoleOne__Group__1"


    // $ANTLR start "rule__RoleOne__Group__1__Impl"
    // InternalGlobalJade.g:929:1: rule__RoleOne__Group__1__Impl : ( ( rule__RoleOne__NameAssignment_1 ) ) ;
    public final void rule__RoleOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:933:1: ( ( ( rule__RoleOne__NameAssignment_1 ) ) )
            // InternalGlobalJade.g:934:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            {
            // InternalGlobalJade.g:934:1: ( ( rule__RoleOne__NameAssignment_1 ) )
            // InternalGlobalJade.g:935:2: ( rule__RoleOne__NameAssignment_1 )
            {
             before(grammarAccess.getRoleOneAccess().getNameAssignment_1()); 
            // InternalGlobalJade.g:936:2: ( rule__RoleOne__NameAssignment_1 )
            // InternalGlobalJade.g:936:3: rule__RoleOne__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoleOne__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleOneAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RoleOne__Group__1__Impl"


    // $ANTLR start "rule__RoleMultiple__Group__0"
    // InternalGlobalJade.g:945:1: rule__RoleMultiple__Group__0 : rule__RoleMultiple__Group__0__Impl rule__RoleMultiple__Group__1 ;
    public final void rule__RoleMultiple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:949:1: ( rule__RoleMultiple__Group__0__Impl rule__RoleMultiple__Group__1 )
            // InternalGlobalJade.g:950:2: rule__RoleMultiple__Group__0__Impl rule__RoleMultiple__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RoleMultiple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleMultiple__Group__1();

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
    // $ANTLR end "rule__RoleMultiple__Group__0"


    // $ANTLR start "rule__RoleMultiple__Group__0__Impl"
    // InternalGlobalJade.g:957:1: rule__RoleMultiple__Group__0__Impl : ( 'multrole' ) ;
    public final void rule__RoleMultiple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:961:1: ( ( 'multrole' ) )
            // InternalGlobalJade.g:962:1: ( 'multrole' )
            {
            // InternalGlobalJade.g:962:1: ( 'multrole' )
            // InternalGlobalJade.g:963:2: 'multrole'
            {
             before(grammarAccess.getRoleMultipleAccess().getMultroleKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRoleMultipleAccess().getMultroleKeyword_0()); 

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
    // $ANTLR end "rule__RoleMultiple__Group__0__Impl"


    // $ANTLR start "rule__RoleMultiple__Group__1"
    // InternalGlobalJade.g:972:1: rule__RoleMultiple__Group__1 : rule__RoleMultiple__Group__1__Impl rule__RoleMultiple__Group__2 ;
    public final void rule__RoleMultiple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:976:1: ( rule__RoleMultiple__Group__1__Impl rule__RoleMultiple__Group__2 )
            // InternalGlobalJade.g:977:2: rule__RoleMultiple__Group__1__Impl rule__RoleMultiple__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RoleMultiple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleMultiple__Group__2();

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
    // $ANTLR end "rule__RoleMultiple__Group__1"


    // $ANTLR start "rule__RoleMultiple__Group__1__Impl"
    // InternalGlobalJade.g:984:1: rule__RoleMultiple__Group__1__Impl : ( ( rule__RoleMultiple__NameAssignment_1 ) ) ;
    public final void rule__RoleMultiple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:988:1: ( ( ( rule__RoleMultiple__NameAssignment_1 ) ) )
            // InternalGlobalJade.g:989:1: ( ( rule__RoleMultiple__NameAssignment_1 ) )
            {
            // InternalGlobalJade.g:989:1: ( ( rule__RoleMultiple__NameAssignment_1 ) )
            // InternalGlobalJade.g:990:2: ( rule__RoleMultiple__NameAssignment_1 )
            {
             before(grammarAccess.getRoleMultipleAccess().getNameAssignment_1()); 
            // InternalGlobalJade.g:991:2: ( rule__RoleMultiple__NameAssignment_1 )
            // InternalGlobalJade.g:991:3: rule__RoleMultiple__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoleMultiple__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleMultipleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RoleMultiple__Group__1__Impl"


    // $ANTLR start "rule__RoleMultiple__Group__2"
    // InternalGlobalJade.g:999:1: rule__RoleMultiple__Group__2 : rule__RoleMultiple__Group__2__Impl rule__RoleMultiple__Group__3 ;
    public final void rule__RoleMultiple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1003:1: ( rule__RoleMultiple__Group__2__Impl rule__RoleMultiple__Group__3 )
            // InternalGlobalJade.g:1004:2: rule__RoleMultiple__Group__2__Impl rule__RoleMultiple__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__RoleMultiple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoleMultiple__Group__3();

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
    // $ANTLR end "rule__RoleMultiple__Group__2"


    // $ANTLR start "rule__RoleMultiple__Group__2__Impl"
    // InternalGlobalJade.g:1011:1: rule__RoleMultiple__Group__2__Impl : ( ':' ) ;
    public final void rule__RoleMultiple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1015:1: ( ( ':' ) )
            // InternalGlobalJade.g:1016:1: ( ':' )
            {
            // InternalGlobalJade.g:1016:1: ( ':' )
            // InternalGlobalJade.g:1017:2: ':'
            {
             before(grammarAccess.getRoleMultipleAccess().getColonKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRoleMultipleAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__RoleMultiple__Group__2__Impl"


    // $ANTLR start "rule__RoleMultiple__Group__3"
    // InternalGlobalJade.g:1026:1: rule__RoleMultiple__Group__3 : rule__RoleMultiple__Group__3__Impl ;
    public final void rule__RoleMultiple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1030:1: ( rule__RoleMultiple__Group__3__Impl )
            // InternalGlobalJade.g:1031:2: rule__RoleMultiple__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoleMultiple__Group__3__Impl();

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
    // $ANTLR end "rule__RoleMultiple__Group__3"


    // $ANTLR start "rule__RoleMultiple__Group__3__Impl"
    // InternalGlobalJade.g:1037:1: rule__RoleMultiple__Group__3__Impl : ( ( rule__RoleMultiple__RefAssignment_3 ) ) ;
    public final void rule__RoleMultiple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1041:1: ( ( ( rule__RoleMultiple__RefAssignment_3 ) ) )
            // InternalGlobalJade.g:1042:1: ( ( rule__RoleMultiple__RefAssignment_3 ) )
            {
            // InternalGlobalJade.g:1042:1: ( ( rule__RoleMultiple__RefAssignment_3 ) )
            // InternalGlobalJade.g:1043:2: ( rule__RoleMultiple__RefAssignment_3 )
            {
             before(grammarAccess.getRoleMultipleAccess().getRefAssignment_3()); 
            // InternalGlobalJade.g:1044:2: ( rule__RoleMultiple__RefAssignment_3 )
            // InternalGlobalJade.g:1044:3: rule__RoleMultiple__RefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RoleMultiple__RefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleMultipleAccess().getRefAssignment_3()); 

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
    // $ANTLR end "rule__RoleMultiple__Group__3__Impl"


    // $ANTLR start "rule__Protocol__Group__0"
    // InternalGlobalJade.g:1053:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1057:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalGlobalJade.g:1058:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGlobalJade.g:1065:1: rule__Protocol__Group__0__Impl : ( () ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1069:1: ( ( () ) )
            // InternalGlobalJade.g:1070:1: ( () )
            {
            // InternalGlobalJade.g:1070:1: ( () )
            // InternalGlobalJade.g:1071:2: ()
            {
             before(grammarAccess.getProtocolAccess().getProtocolAction_0()); 
            // InternalGlobalJade.g:1072:2: ()
            // InternalGlobalJade.g:1072:3: 
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
    // InternalGlobalJade.g:1080:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1084:1: ( rule__Protocol__Group__1__Impl )
            // InternalGlobalJade.g:1085:2: rule__Protocol__Group__1__Impl
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
    // InternalGlobalJade.g:1091:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__ActionsAssignment_1 )* ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1095:1: ( ( ( rule__Protocol__ActionsAssignment_1 )* ) )
            // InternalGlobalJade.g:1096:1: ( ( rule__Protocol__ActionsAssignment_1 )* )
            {
            // InternalGlobalJade.g:1096:1: ( ( rule__Protocol__ActionsAssignment_1 )* )
            // InternalGlobalJade.g:1097:2: ( rule__Protocol__ActionsAssignment_1 )*
            {
             before(grammarAccess.getProtocolAccess().getActionsAssignment_1()); 
            // InternalGlobalJade.g:1098:2: ( rule__Protocol__ActionsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=12 && LA6_0<=18)||(LA6_0>=32 && LA6_0<=33)||LA6_0==35||LA6_0==38) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGlobalJade.g:1098:3: rule__Protocol__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Protocol__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start "rule__Recursion__Group__0"
    // InternalGlobalJade.g:1107:1: rule__Recursion__Group__0 : rule__Recursion__Group__0__Impl rule__Recursion__Group__1 ;
    public final void rule__Recursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1111:1: ( rule__Recursion__Group__0__Impl rule__Recursion__Group__1 )
            // InternalGlobalJade.g:1112:2: rule__Recursion__Group__0__Impl rule__Recursion__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Recursion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recursion__Group__1();

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
    // $ANTLR end "rule__Recursion__Group__0"


    // $ANTLR start "rule__Recursion__Group__0__Impl"
    // InternalGlobalJade.g:1119:1: rule__Recursion__Group__0__Impl : ( 'rec' ) ;
    public final void rule__Recursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1123:1: ( ( 'rec' ) )
            // InternalGlobalJade.g:1124:1: ( 'rec' )
            {
            // InternalGlobalJade.g:1124:1: ( 'rec' )
            // InternalGlobalJade.g:1125:2: 'rec'
            {
             before(grammarAccess.getRecursionAccess().getRecKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getRecKeyword_0()); 

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
    // $ANTLR end "rule__Recursion__Group__0__Impl"


    // $ANTLR start "rule__Recursion__Group__1"
    // InternalGlobalJade.g:1134:1: rule__Recursion__Group__1 : rule__Recursion__Group__1__Impl rule__Recursion__Group__2 ;
    public final void rule__Recursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1138:1: ( rule__Recursion__Group__1__Impl rule__Recursion__Group__2 )
            // InternalGlobalJade.g:1139:2: rule__Recursion__Group__1__Impl rule__Recursion__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Recursion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recursion__Group__2();

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
    // $ANTLR end "rule__Recursion__Group__1"


    // $ANTLR start "rule__Recursion__Group__1__Impl"
    // InternalGlobalJade.g:1146:1: rule__Recursion__Group__1__Impl : ( ( rule__Recursion__NameAssignment_1 ) ) ;
    public final void rule__Recursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1150:1: ( ( ( rule__Recursion__NameAssignment_1 ) ) )
            // InternalGlobalJade.g:1151:1: ( ( rule__Recursion__NameAssignment_1 ) )
            {
            // InternalGlobalJade.g:1151:1: ( ( rule__Recursion__NameAssignment_1 ) )
            // InternalGlobalJade.g:1152:2: ( rule__Recursion__NameAssignment_1 )
            {
             before(grammarAccess.getRecursionAccess().getNameAssignment_1()); 
            // InternalGlobalJade.g:1153:2: ( rule__Recursion__NameAssignment_1 )
            // InternalGlobalJade.g:1153:3: rule__Recursion__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Recursion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecursionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Recursion__Group__1__Impl"


    // $ANTLR start "rule__Recursion__Group__2"
    // InternalGlobalJade.g:1161:1: rule__Recursion__Group__2 : rule__Recursion__Group__2__Impl ;
    public final void rule__Recursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1165:1: ( rule__Recursion__Group__2__Impl )
            // InternalGlobalJade.g:1166:2: rule__Recursion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recursion__Group__2__Impl();

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
    // $ANTLR end "rule__Recursion__Group__2"


    // $ANTLR start "rule__Recursion__Group__2__Impl"
    // InternalGlobalJade.g:1172:1: rule__Recursion__Group__2__Impl : ( ':' ) ;
    public final void rule__Recursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1176:1: ( ( ':' ) )
            // InternalGlobalJade.g:1177:1: ( ':' )
            {
            // InternalGlobalJade.g:1177:1: ( ':' )
            // InternalGlobalJade.g:1178:2: ':'
            {
             before(grammarAccess.getRecursionAccess().getColonKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Recursion__Group__2__Impl"


    // $ANTLR start "rule__CloseRecursion__Group__0"
    // InternalGlobalJade.g:1188:1: rule__CloseRecursion__Group__0 : rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 ;
    public final void rule__CloseRecursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1192:1: ( rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1 )
            // InternalGlobalJade.g:1193:2: rule__CloseRecursion__Group__0__Impl rule__CloseRecursion__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CloseRecursion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CloseRecursion__Group__1();

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
    // $ANTLR end "rule__CloseRecursion__Group__0"


    // $ANTLR start "rule__CloseRecursion__Group__0__Impl"
    // InternalGlobalJade.g:1200:1: rule__CloseRecursion__Group__0__Impl : ( 'loop' ) ;
    public final void rule__CloseRecursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1204:1: ( ( 'loop' ) )
            // InternalGlobalJade.g:1205:1: ( 'loop' )
            {
            // InternalGlobalJade.g:1205:1: ( 'loop' )
            // InternalGlobalJade.g:1206:2: 'loop'
            {
             before(grammarAccess.getCloseRecursionAccess().getLoopKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCloseRecursionAccess().getLoopKeyword_0()); 

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
    // $ANTLR end "rule__CloseRecursion__Group__0__Impl"


    // $ANTLR start "rule__CloseRecursion__Group__1"
    // InternalGlobalJade.g:1215:1: rule__CloseRecursion__Group__1 : rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2 ;
    public final void rule__CloseRecursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1219:1: ( rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2 )
            // InternalGlobalJade.g:1220:2: rule__CloseRecursion__Group__1__Impl rule__CloseRecursion__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CloseRecursion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CloseRecursion__Group__2();

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
    // $ANTLR end "rule__CloseRecursion__Group__1"


    // $ANTLR start "rule__CloseRecursion__Group__1__Impl"
    // InternalGlobalJade.g:1227:1: rule__CloseRecursion__Group__1__Impl : ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) ;
    public final void rule__CloseRecursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1231:1: ( ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) ) )
            // InternalGlobalJade.g:1232:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            {
            // InternalGlobalJade.g:1232:1: ( ( rule__CloseRecursion__RecursionVariableAssignment_1 ) )
            // InternalGlobalJade.g:1233:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 
            // InternalGlobalJade.g:1234:2: ( rule__CloseRecursion__RecursionVariableAssignment_1 )
            // InternalGlobalJade.g:1234:3: rule__CloseRecursion__RecursionVariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CloseRecursion__RecursionVariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCloseRecursionAccess().getRecursionVariableAssignment_1()); 

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
    // $ANTLR end "rule__CloseRecursion__Group__1__Impl"


    // $ANTLR start "rule__CloseRecursion__Group__2"
    // InternalGlobalJade.g:1242:1: rule__CloseRecursion__Group__2 : rule__CloseRecursion__Group__2__Impl ;
    public final void rule__CloseRecursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1246:1: ( rule__CloseRecursion__Group__2__Impl )
            // InternalGlobalJade.g:1247:2: rule__CloseRecursion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CloseRecursion__Group__2__Impl();

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
    // $ANTLR end "rule__CloseRecursion__Group__2"


    // $ANTLR start "rule__CloseRecursion__Group__2__Impl"
    // InternalGlobalJade.g:1253:1: rule__CloseRecursion__Group__2__Impl : ( ';' ) ;
    public final void rule__CloseRecursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1257:1: ( ( ';' ) )
            // InternalGlobalJade.g:1258:1: ( ';' )
            {
            // InternalGlobalJade.g:1258:1: ( ';' )
            // InternalGlobalJade.g:1259:2: ';'
            {
             before(grammarAccess.getCloseRecursionAccess().getSemicolonKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCloseRecursionAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__CloseRecursion__Group__2__Impl"


    // $ANTLR start "rule__Choice__Group__0"
    // InternalGlobalJade.g:1269:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1273:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalGlobalJade.g:1274:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__1();

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
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // InternalGlobalJade.g:1281:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1285:1: ( ( 'choice' ) )
            // InternalGlobalJade.g:1286:1: ( 'choice' )
            {
            // InternalGlobalJade.g:1286:1: ( 'choice' )
            // InternalGlobalJade.g:1287:2: 'choice'
            {
             before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 

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
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // InternalGlobalJade.g:1296:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1300:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalGlobalJade.g:1301:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__2();

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
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // InternalGlobalJade.g:1308:1: rule__Choice__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1312:1: ( ( 'at' ) )
            // InternalGlobalJade.g:1313:1: ( 'at' )
            {
            // InternalGlobalJade.g:1313:1: ( 'at' )
            // InternalGlobalJade.g:1314:2: 'at'
            {
             before(grammarAccess.getChoiceAccess().getAtKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getAtKeyword_1()); 

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
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Choice__Group__2"
    // InternalGlobalJade.g:1323:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1327:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // InternalGlobalJade.g:1328:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Choice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__3();

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
    // $ANTLR end "rule__Choice__Group__2"


    // $ANTLR start "rule__Choice__Group__2__Impl"
    // InternalGlobalJade.g:1335:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__RoleAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1339:1: ( ( ( rule__Choice__RoleAssignment_2 ) ) )
            // InternalGlobalJade.g:1340:1: ( ( rule__Choice__RoleAssignment_2 ) )
            {
            // InternalGlobalJade.g:1340:1: ( ( rule__Choice__RoleAssignment_2 ) )
            // InternalGlobalJade.g:1341:2: ( rule__Choice__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 
            // InternalGlobalJade.g:1342:2: ( rule__Choice__RoleAssignment_2 )
            // InternalGlobalJade.g:1342:3: rule__Choice__RoleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Choice__RoleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 

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
    // $ANTLR end "rule__Choice__Group__2__Impl"


    // $ANTLR start "rule__Choice__Group__3"
    // InternalGlobalJade.g:1350:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1354:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // InternalGlobalJade.g:1355:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Choice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__4();

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
    // $ANTLR end "rule__Choice__Group__3"


    // $ANTLR start "rule__Choice__Group__3__Impl"
    // InternalGlobalJade.g:1362:1: rule__Choice__Group__3__Impl : ( '{' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1366:1: ( ( '{' ) )
            // InternalGlobalJade.g:1367:1: ( '{' )
            {
            // InternalGlobalJade.g:1367:1: ( '{' )
            // InternalGlobalJade.g:1368:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Choice__Group__3__Impl"


    // $ANTLR start "rule__Choice__Group__4"
    // InternalGlobalJade.g:1377:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1381:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // InternalGlobalJade.g:1382:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Choice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__5();

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
    // $ANTLR end "rule__Choice__Group__4"


    // $ANTLR start "rule__Choice__Group__4__Impl"
    // InternalGlobalJade.g:1389:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__MessagesAssignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1393:1: ( ( ( rule__Choice__MessagesAssignment_4 ) ) )
            // InternalGlobalJade.g:1394:1: ( ( rule__Choice__MessagesAssignment_4 ) )
            {
            // InternalGlobalJade.g:1394:1: ( ( rule__Choice__MessagesAssignment_4 ) )
            // InternalGlobalJade.g:1395:2: ( rule__Choice__MessagesAssignment_4 )
            {
             before(grammarAccess.getChoiceAccess().getMessagesAssignment_4()); 
            // InternalGlobalJade.g:1396:2: ( rule__Choice__MessagesAssignment_4 )
            // InternalGlobalJade.g:1396:3: rule__Choice__MessagesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Choice__MessagesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getMessagesAssignment_4()); 

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
    // $ANTLR end "rule__Choice__Group__4__Impl"


    // $ANTLR start "rule__Choice__Group__5"
    // InternalGlobalJade.g:1404:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl rule__Choice__Group__6 ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1408:1: ( rule__Choice__Group__5__Impl rule__Choice__Group__6 )
            // InternalGlobalJade.g:1409:2: rule__Choice__Group__5__Impl rule__Choice__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Choice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__6();

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
    // $ANTLR end "rule__Choice__Group__5"


    // $ANTLR start "rule__Choice__Group__5__Impl"
    // InternalGlobalJade.g:1416:1: rule__Choice__Group__5__Impl : ( ( rule__Choice__BranchAssignment_5 ) ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1420:1: ( ( ( rule__Choice__BranchAssignment_5 ) ) )
            // InternalGlobalJade.g:1421:1: ( ( rule__Choice__BranchAssignment_5 ) )
            {
            // InternalGlobalJade.g:1421:1: ( ( rule__Choice__BranchAssignment_5 ) )
            // InternalGlobalJade.g:1422:2: ( rule__Choice__BranchAssignment_5 )
            {
             before(grammarAccess.getChoiceAccess().getBranchAssignment_5()); 
            // InternalGlobalJade.g:1423:2: ( rule__Choice__BranchAssignment_5 )
            // InternalGlobalJade.g:1423:3: rule__Choice__BranchAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Choice__BranchAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getBranchAssignment_5()); 

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
    // $ANTLR end "rule__Choice__Group__5__Impl"


    // $ANTLR start "rule__Choice__Group__6"
    // InternalGlobalJade.g:1431:1: rule__Choice__Group__6 : rule__Choice__Group__6__Impl rule__Choice__Group__7 ;
    public final void rule__Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1435:1: ( rule__Choice__Group__6__Impl rule__Choice__Group__7 )
            // InternalGlobalJade.g:1436:2: rule__Choice__Group__6__Impl rule__Choice__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Choice__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__7();

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
    // $ANTLR end "rule__Choice__Group__6"


    // $ANTLR start "rule__Choice__Group__6__Impl"
    // InternalGlobalJade.g:1443:1: rule__Choice__Group__6__Impl : ( '}' ) ;
    public final void rule__Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1447:1: ( ( '}' ) )
            // InternalGlobalJade.g:1448:1: ( '}' )
            {
            // InternalGlobalJade.g:1448:1: ( '}' )
            // InternalGlobalJade.g:1449:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Choice__Group__6__Impl"


    // $ANTLR start "rule__Choice__Group__7"
    // InternalGlobalJade.g:1458:1: rule__Choice__Group__7 : rule__Choice__Group__7__Impl ;
    public final void rule__Choice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1462:1: ( rule__Choice__Group__7__Impl )
            // InternalGlobalJade.g:1463:2: rule__Choice__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__7__Impl();

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
    // $ANTLR end "rule__Choice__Group__7"


    // $ANTLR start "rule__Choice__Group__7__Impl"
    // InternalGlobalJade.g:1469:1: rule__Choice__Group__7__Impl : ( ( rule__Choice__Group_7__0 )* ) ;
    public final void rule__Choice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1473:1: ( ( ( rule__Choice__Group_7__0 )* ) )
            // InternalGlobalJade.g:1474:1: ( ( rule__Choice__Group_7__0 )* )
            {
            // InternalGlobalJade.g:1474:1: ( ( rule__Choice__Group_7__0 )* )
            // InternalGlobalJade.g:1475:2: ( rule__Choice__Group_7__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_7()); 
            // InternalGlobalJade.g:1476:2: ( rule__Choice__Group_7__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==37) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGlobalJade.g:1476:3: rule__Choice__Group_7__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Choice__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getChoiceAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Choice__Group__7__Impl"


    // $ANTLR start "rule__Choice__Group_7__0"
    // InternalGlobalJade.g:1485:1: rule__Choice__Group_7__0 : rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1 ;
    public final void rule__Choice__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1489:1: ( rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1 )
            // InternalGlobalJade.g:1490:2: rule__Choice__Group_7__0__Impl rule__Choice__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Choice__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_7__1();

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
    // $ANTLR end "rule__Choice__Group_7__0"


    // $ANTLR start "rule__Choice__Group_7__0__Impl"
    // InternalGlobalJade.g:1497:1: rule__Choice__Group_7__0__Impl : ( 'or' ) ;
    public final void rule__Choice__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1501:1: ( ( 'or' ) )
            // InternalGlobalJade.g:1502:1: ( 'or' )
            {
            // InternalGlobalJade.g:1502:1: ( 'or' )
            // InternalGlobalJade.g:1503:2: 'or'
            {
             before(grammarAccess.getChoiceAccess().getOrKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getOrKeyword_7_0()); 

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
    // $ANTLR end "rule__Choice__Group_7__0__Impl"


    // $ANTLR start "rule__Choice__Group_7__1"
    // InternalGlobalJade.g:1512:1: rule__Choice__Group_7__1 : rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2 ;
    public final void rule__Choice__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1516:1: ( rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2 )
            // InternalGlobalJade.g:1517:2: rule__Choice__Group_7__1__Impl rule__Choice__Group_7__2
            {
            pushFollow(FOLLOW_17);
            rule__Choice__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_7__2();

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
    // $ANTLR end "rule__Choice__Group_7__1"


    // $ANTLR start "rule__Choice__Group_7__1__Impl"
    // InternalGlobalJade.g:1524:1: rule__Choice__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Choice__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1528:1: ( ( '{' ) )
            // InternalGlobalJade.g:1529:1: ( '{' )
            {
            // InternalGlobalJade.g:1529:1: ( '{' )
            // InternalGlobalJade.g:1530:2: '{'
            {
             before(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__Choice__Group_7__1__Impl"


    // $ANTLR start "rule__Choice__Group_7__2"
    // InternalGlobalJade.g:1539:1: rule__Choice__Group_7__2 : rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3 ;
    public final void rule__Choice__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1543:1: ( rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3 )
            // InternalGlobalJade.g:1544:2: rule__Choice__Group_7__2__Impl rule__Choice__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__Choice__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_7__3();

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
    // $ANTLR end "rule__Choice__Group_7__2"


    // $ANTLR start "rule__Choice__Group_7__2__Impl"
    // InternalGlobalJade.g:1551:1: rule__Choice__Group_7__2__Impl : ( ( rule__Choice__MessagesAssignment_7_2 ) ) ;
    public final void rule__Choice__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1555:1: ( ( ( rule__Choice__MessagesAssignment_7_2 ) ) )
            // InternalGlobalJade.g:1556:1: ( ( rule__Choice__MessagesAssignment_7_2 ) )
            {
            // InternalGlobalJade.g:1556:1: ( ( rule__Choice__MessagesAssignment_7_2 ) )
            // InternalGlobalJade.g:1557:2: ( rule__Choice__MessagesAssignment_7_2 )
            {
             before(grammarAccess.getChoiceAccess().getMessagesAssignment_7_2()); 
            // InternalGlobalJade.g:1558:2: ( rule__Choice__MessagesAssignment_7_2 )
            // InternalGlobalJade.g:1558:3: rule__Choice__MessagesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Choice__MessagesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getMessagesAssignment_7_2()); 

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
    // $ANTLR end "rule__Choice__Group_7__2__Impl"


    // $ANTLR start "rule__Choice__Group_7__3"
    // InternalGlobalJade.g:1566:1: rule__Choice__Group_7__3 : rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4 ;
    public final void rule__Choice__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1570:1: ( rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4 )
            // InternalGlobalJade.g:1571:2: rule__Choice__Group_7__3__Impl rule__Choice__Group_7__4
            {
            pushFollow(FOLLOW_10);
            rule__Choice__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group_7__4();

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
    // $ANTLR end "rule__Choice__Group_7__3"


    // $ANTLR start "rule__Choice__Group_7__3__Impl"
    // InternalGlobalJade.g:1578:1: rule__Choice__Group_7__3__Impl : ( ( rule__Choice__BranchAssignment_7_3 ) ) ;
    public final void rule__Choice__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1582:1: ( ( ( rule__Choice__BranchAssignment_7_3 ) ) )
            // InternalGlobalJade.g:1583:1: ( ( rule__Choice__BranchAssignment_7_3 ) )
            {
            // InternalGlobalJade.g:1583:1: ( ( rule__Choice__BranchAssignment_7_3 ) )
            // InternalGlobalJade.g:1584:2: ( rule__Choice__BranchAssignment_7_3 )
            {
             before(grammarAccess.getChoiceAccess().getBranchAssignment_7_3()); 
            // InternalGlobalJade.g:1585:2: ( rule__Choice__BranchAssignment_7_3 )
            // InternalGlobalJade.g:1585:3: rule__Choice__BranchAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Choice__BranchAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getBranchAssignment_7_3()); 

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
    // $ANTLR end "rule__Choice__Group_7__3__Impl"


    // $ANTLR start "rule__Choice__Group_7__4"
    // InternalGlobalJade.g:1593:1: rule__Choice__Group_7__4 : rule__Choice__Group_7__4__Impl ;
    public final void rule__Choice__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1597:1: ( rule__Choice__Group_7__4__Impl )
            // InternalGlobalJade.g:1598:2: rule__Choice__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group_7__4__Impl();

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
    // $ANTLR end "rule__Choice__Group_7__4"


    // $ANTLR start "rule__Choice__Group_7__4__Impl"
    // InternalGlobalJade.g:1604:1: rule__Choice__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Choice__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1608:1: ( ( '}' ) )
            // InternalGlobalJade.g:1609:1: ( '}' )
            {
            // InternalGlobalJade.g:1609:1: ( '}' )
            // InternalGlobalJade.g:1610:2: '}'
            {
             before(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__Choice__Group_7__4__Impl"


    // $ANTLR start "rule__ForEach__Group__0"
    // InternalGlobalJade.g:1620:1: rule__ForEach__Group__0 : rule__ForEach__Group__0__Impl rule__ForEach__Group__1 ;
    public final void rule__ForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1624:1: ( rule__ForEach__Group__0__Impl rule__ForEach__Group__1 )
            // InternalGlobalJade.g:1625:2: rule__ForEach__Group__0__Impl rule__ForEach__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ForEach__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__1();

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
    // $ANTLR end "rule__ForEach__Group__0"


    // $ANTLR start "rule__ForEach__Group__0__Impl"
    // InternalGlobalJade.g:1632:1: rule__ForEach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1636:1: ( ( 'foreach' ) )
            // InternalGlobalJade.g:1637:1: ( 'foreach' )
            {
            // InternalGlobalJade.g:1637:1: ( 'foreach' )
            // InternalGlobalJade.g:1638:2: 'foreach'
            {
             before(grammarAccess.getForEachAccess().getForeachKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getForeachKeyword_0()); 

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
    // $ANTLR end "rule__ForEach__Group__0__Impl"


    // $ANTLR start "rule__ForEach__Group__1"
    // InternalGlobalJade.g:1647:1: rule__ForEach__Group__1 : rule__ForEach__Group__1__Impl rule__ForEach__Group__2 ;
    public final void rule__ForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1651:1: ( rule__ForEach__Group__1__Impl rule__ForEach__Group__2 )
            // InternalGlobalJade.g:1652:2: rule__ForEach__Group__1__Impl rule__ForEach__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ForEach__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__2();

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
    // $ANTLR end "rule__ForEach__Group__1"


    // $ANTLR start "rule__ForEach__Group__1__Impl"
    // InternalGlobalJade.g:1659:1: rule__ForEach__Group__1__Impl : ( ( rule__ForEach__EachRoleAssignment_1 ) ) ;
    public final void rule__ForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1663:1: ( ( ( rule__ForEach__EachRoleAssignment_1 ) ) )
            // InternalGlobalJade.g:1664:1: ( ( rule__ForEach__EachRoleAssignment_1 ) )
            {
            // InternalGlobalJade.g:1664:1: ( ( rule__ForEach__EachRoleAssignment_1 ) )
            // InternalGlobalJade.g:1665:2: ( rule__ForEach__EachRoleAssignment_1 )
            {
             before(grammarAccess.getForEachAccess().getEachRoleAssignment_1()); 
            // InternalGlobalJade.g:1666:2: ( rule__ForEach__EachRoleAssignment_1 )
            // InternalGlobalJade.g:1666:3: rule__ForEach__EachRoleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__EachRoleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getEachRoleAssignment_1()); 

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
    // $ANTLR end "rule__ForEach__Group__1__Impl"


    // $ANTLR start "rule__ForEach__Group__2"
    // InternalGlobalJade.g:1674:1: rule__ForEach__Group__2 : rule__ForEach__Group__2__Impl rule__ForEach__Group__3 ;
    public final void rule__ForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1678:1: ( rule__ForEach__Group__2__Impl rule__ForEach__Group__3 )
            // InternalGlobalJade.g:1679:2: rule__ForEach__Group__2__Impl rule__ForEach__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ForEach__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__3();

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
    // $ANTLR end "rule__ForEach__Group__2"


    // $ANTLR start "rule__ForEach__Group__2__Impl"
    // InternalGlobalJade.g:1686:1: rule__ForEach__Group__2__Impl : ( 'in' ) ;
    public final void rule__ForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1690:1: ( ( 'in' ) )
            // InternalGlobalJade.g:1691:1: ( 'in' )
            {
            // InternalGlobalJade.g:1691:1: ( 'in' )
            // InternalGlobalJade.g:1692:2: 'in'
            {
             before(grammarAccess.getForEachAccess().getInKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getInKeyword_2()); 

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
    // $ANTLR end "rule__ForEach__Group__2__Impl"


    // $ANTLR start "rule__ForEach__Group__3"
    // InternalGlobalJade.g:1701:1: rule__ForEach__Group__3 : rule__ForEach__Group__3__Impl rule__ForEach__Group__4 ;
    public final void rule__ForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1705:1: ( rule__ForEach__Group__3__Impl rule__ForEach__Group__4 )
            // InternalGlobalJade.g:1706:2: rule__ForEach__Group__3__Impl rule__ForEach__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ForEach__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__4();

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
    // $ANTLR end "rule__ForEach__Group__3"


    // $ANTLR start "rule__ForEach__Group__3__Impl"
    // InternalGlobalJade.g:1713:1: rule__ForEach__Group__3__Impl : ( ( rule__ForEach__RoleAssignment_3 ) ) ;
    public final void rule__ForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1717:1: ( ( ( rule__ForEach__RoleAssignment_3 ) ) )
            // InternalGlobalJade.g:1718:1: ( ( rule__ForEach__RoleAssignment_3 ) )
            {
            // InternalGlobalJade.g:1718:1: ( ( rule__ForEach__RoleAssignment_3 ) )
            // InternalGlobalJade.g:1719:2: ( rule__ForEach__RoleAssignment_3 )
            {
             before(grammarAccess.getForEachAccess().getRoleAssignment_3()); 
            // InternalGlobalJade.g:1720:2: ( rule__ForEach__RoleAssignment_3 )
            // InternalGlobalJade.g:1720:3: rule__ForEach__RoleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__RoleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getRoleAssignment_3()); 

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
    // $ANTLR end "rule__ForEach__Group__3__Impl"


    // $ANTLR start "rule__ForEach__Group__4"
    // InternalGlobalJade.g:1728:1: rule__ForEach__Group__4 : rule__ForEach__Group__4__Impl rule__ForEach__Group__5 ;
    public final void rule__ForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1732:1: ( rule__ForEach__Group__4__Impl rule__ForEach__Group__5 )
            // InternalGlobalJade.g:1733:2: rule__ForEach__Group__4__Impl rule__ForEach__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ForEach__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__5();

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
    // $ANTLR end "rule__ForEach__Group__4"


    // $ANTLR start "rule__ForEach__Group__4__Impl"
    // InternalGlobalJade.g:1740:1: rule__ForEach__Group__4__Impl : ( '{' ) ;
    public final void rule__ForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1744:1: ( ( '{' ) )
            // InternalGlobalJade.g:1745:1: ( '{' )
            {
            // InternalGlobalJade.g:1745:1: ( '{' )
            // InternalGlobalJade.g:1746:2: '{'
            {
             before(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ForEach__Group__4__Impl"


    // $ANTLR start "rule__ForEach__Group__5"
    // InternalGlobalJade.g:1755:1: rule__ForEach__Group__5 : rule__ForEach__Group__5__Impl rule__ForEach__Group__6 ;
    public final void rule__ForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1759:1: ( rule__ForEach__Group__5__Impl rule__ForEach__Group__6 )
            // InternalGlobalJade.g:1760:2: rule__ForEach__Group__5__Impl rule__ForEach__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__ForEach__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEach__Group__6();

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
    // $ANTLR end "rule__ForEach__Group__5"


    // $ANTLR start "rule__ForEach__Group__5__Impl"
    // InternalGlobalJade.g:1767:1: rule__ForEach__Group__5__Impl : ( ( rule__ForEach__BranchAssignment_5 ) ) ;
    public final void rule__ForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1771:1: ( ( ( rule__ForEach__BranchAssignment_5 ) ) )
            // InternalGlobalJade.g:1772:1: ( ( rule__ForEach__BranchAssignment_5 ) )
            {
            // InternalGlobalJade.g:1772:1: ( ( rule__ForEach__BranchAssignment_5 ) )
            // InternalGlobalJade.g:1773:2: ( rule__ForEach__BranchAssignment_5 )
            {
             before(grammarAccess.getForEachAccess().getBranchAssignment_5()); 
            // InternalGlobalJade.g:1774:2: ( rule__ForEach__BranchAssignment_5 )
            // InternalGlobalJade.g:1774:3: rule__ForEach__BranchAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__BranchAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForEachAccess().getBranchAssignment_5()); 

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
    // $ANTLR end "rule__ForEach__Group__5__Impl"


    // $ANTLR start "rule__ForEach__Group__6"
    // InternalGlobalJade.g:1782:1: rule__ForEach__Group__6 : rule__ForEach__Group__6__Impl ;
    public final void rule__ForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1786:1: ( rule__ForEach__Group__6__Impl )
            // InternalGlobalJade.g:1787:2: rule__ForEach__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEach__Group__6__Impl();

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
    // $ANTLR end "rule__ForEach__Group__6"


    // $ANTLR start "rule__ForEach__Group__6__Impl"
    // InternalGlobalJade.g:1793:1: rule__ForEach__Group__6__Impl : ( '}' ) ;
    public final void rule__ForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1797:1: ( ( '}' ) )
            // InternalGlobalJade.g:1798:1: ( '}' )
            {
            // InternalGlobalJade.g:1798:1: ( '}' )
            // InternalGlobalJade.g:1799:2: '}'
            {
             before(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ForEach__Group__6__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // InternalGlobalJade.g:1809:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1813:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalGlobalJade.g:1814:2: rule__Message__Group__0__Impl rule__Message__Group__1
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
    // InternalGlobalJade.g:1821:1: rule__Message__Group__0__Impl : ( ( rule__Message__TypeAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1825:1: ( ( ( rule__Message__TypeAssignment_0 ) ) )
            // InternalGlobalJade.g:1826:1: ( ( rule__Message__TypeAssignment_0 ) )
            {
            // InternalGlobalJade.g:1826:1: ( ( rule__Message__TypeAssignment_0 ) )
            // InternalGlobalJade.g:1827:2: ( rule__Message__TypeAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getTypeAssignment_0()); 
            // InternalGlobalJade.g:1828:2: ( rule__Message__TypeAssignment_0 )
            // InternalGlobalJade.g:1828:3: rule__Message__TypeAssignment_0
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
    // InternalGlobalJade.g:1836:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1840:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalGlobalJade.g:1841:2: rule__Message__Group__1__Impl rule__Message__Group__2
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
    // InternalGlobalJade.g:1848:1: rule__Message__Group__1__Impl : ( '(' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1852:1: ( ( '(' ) )
            // InternalGlobalJade.g:1853:1: ( '(' )
            {
            // InternalGlobalJade.g:1853:1: ( '(' )
            // InternalGlobalJade.g:1854:2: '('
            {
             before(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGlobalJade.g:1863:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1867:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalGlobalJade.g:1868:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalGlobalJade.g:1875:1: rule__Message__Group__2__Impl : ( ( rule__Message__PayloadAssignment_2 )? ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1879:1: ( ( ( rule__Message__PayloadAssignment_2 )? ) )
            // InternalGlobalJade.g:1880:1: ( ( rule__Message__PayloadAssignment_2 )? )
            {
            // InternalGlobalJade.g:1880:1: ( ( rule__Message__PayloadAssignment_2 )? )
            // InternalGlobalJade.g:1881:2: ( rule__Message__PayloadAssignment_2 )?
            {
             before(grammarAccess.getMessageAccess().getPayloadAssignment_2()); 
            // InternalGlobalJade.g:1882:2: ( rule__Message__PayloadAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=19 && LA8_0<=21)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGlobalJade.g:1882:3: rule__Message__PayloadAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__PayloadAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getPayloadAssignment_2()); 

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
    // InternalGlobalJade.g:1890:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1894:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalGlobalJade.g:1895:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalGlobalJade.g:1902:1: rule__Message__Group__3__Impl : ( ')' ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1906:1: ( ( ')' ) )
            // InternalGlobalJade.g:1907:1: ( ')' )
            {
            // InternalGlobalJade.g:1907:1: ( ')' )
            // InternalGlobalJade.g:1908:2: ')'
            {
             before(grammarAccess.getMessageAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getRightParenthesisKeyword_3()); 

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
    // InternalGlobalJade.g:1917:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1921:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalGlobalJade.g:1922:2: rule__Message__Group__4__Impl rule__Message__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalGlobalJade.g:1929:1: rule__Message__Group__4__Impl : ( 'from' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1933:1: ( ( 'from' ) )
            // InternalGlobalJade.g:1934:1: ( 'from' )
            {
            // InternalGlobalJade.g:1934:1: ( 'from' )
            // InternalGlobalJade.g:1935:2: 'from'
            {
             before(grammarAccess.getMessageAccess().getFromKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getFromKeyword_4()); 

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
    // InternalGlobalJade.g:1944:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1948:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // InternalGlobalJade.g:1949:2: rule__Message__Group__5__Impl rule__Message__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalGlobalJade.g:1956:1: rule__Message__Group__5__Impl : ( ( rule__Message__SenderAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1960:1: ( ( ( rule__Message__SenderAssignment_5 ) ) )
            // InternalGlobalJade.g:1961:1: ( ( rule__Message__SenderAssignment_5 ) )
            {
            // InternalGlobalJade.g:1961:1: ( ( rule__Message__SenderAssignment_5 ) )
            // InternalGlobalJade.g:1962:2: ( rule__Message__SenderAssignment_5 )
            {
             before(grammarAccess.getMessageAccess().getSenderAssignment_5()); 
            // InternalGlobalJade.g:1963:2: ( rule__Message__SenderAssignment_5 )
            // InternalGlobalJade.g:1963:3: rule__Message__SenderAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Message__SenderAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getSenderAssignment_5()); 

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
    // InternalGlobalJade.g:1971:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1975:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // InternalGlobalJade.g:1976:2: rule__Message__Group__6__Impl rule__Message__Group__7
            {
            pushFollow(FOLLOW_4);
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
    // InternalGlobalJade.g:1983:1: rule__Message__Group__6__Impl : ( 'to' ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:1987:1: ( ( 'to' ) )
            // InternalGlobalJade.g:1988:1: ( 'to' )
            {
            // InternalGlobalJade.g:1988:1: ( 'to' )
            // InternalGlobalJade.g:1989:2: 'to'
            {
             before(grammarAccess.getMessageAccess().getToKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getToKeyword_6()); 

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
    // InternalGlobalJade.g:1998:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2002:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // InternalGlobalJade.g:2003:2: rule__Message__Group__7__Impl rule__Message__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalGlobalJade.g:2010:1: rule__Message__Group__7__Impl : ( ( rule__Message__ReceiverAssignment_7 ) ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2014:1: ( ( ( rule__Message__ReceiverAssignment_7 ) ) )
            // InternalGlobalJade.g:2015:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            {
            // InternalGlobalJade.g:2015:1: ( ( rule__Message__ReceiverAssignment_7 ) )
            // InternalGlobalJade.g:2016:2: ( rule__Message__ReceiverAssignment_7 )
            {
             before(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 
            // InternalGlobalJade.g:2017:2: ( rule__Message__ReceiverAssignment_7 )
            // InternalGlobalJade.g:2017:3: rule__Message__ReceiverAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Message__ReceiverAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getReceiverAssignment_7()); 

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
    // InternalGlobalJade.g:2025:1: rule__Message__Group__8 : rule__Message__Group__8__Impl ;
    public final void rule__Message__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2029:1: ( rule__Message__Group__8__Impl )
            // InternalGlobalJade.g:2030:2: rule__Message__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__8__Impl();

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
    // InternalGlobalJade.g:2036:1: rule__Message__Group__8__Impl : ( ';' ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2040:1: ( ( ';' ) )
            // InternalGlobalJade.g:2041:1: ( ';' )
            {
            // InternalGlobalJade.g:2041:1: ( ';' )
            // InternalGlobalJade.g:2042:2: ';'
            {
             before(grammarAccess.getMessageAccess().getSemicolonKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getSemicolonKeyword_8()); 

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


    // $ANTLR start "rule__Payload__Group__0"
    // InternalGlobalJade.g:2052:1: rule__Payload__Group__0 : rule__Payload__Group__0__Impl rule__Payload__Group__1 ;
    public final void rule__Payload__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2056:1: ( rule__Payload__Group__0__Impl rule__Payload__Group__1 )
            // InternalGlobalJade.g:2057:2: rule__Payload__Group__0__Impl rule__Payload__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Payload__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Payload__Group__1();

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
    // $ANTLR end "rule__Payload__Group__0"


    // $ANTLR start "rule__Payload__Group__0__Impl"
    // InternalGlobalJade.g:2064:1: rule__Payload__Group__0__Impl : ( () ) ;
    public final void rule__Payload__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2068:1: ( ( () ) )
            // InternalGlobalJade.g:2069:1: ( () )
            {
            // InternalGlobalJade.g:2069:1: ( () )
            // InternalGlobalJade.g:2070:2: ()
            {
             before(grammarAccess.getPayloadAccess().getPayloadAction_0()); 
            // InternalGlobalJade.g:2071:2: ()
            // InternalGlobalJade.g:2071:3: 
            {
            }

             after(grammarAccess.getPayloadAccess().getPayloadAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Payload__Group__0__Impl"


    // $ANTLR start "rule__Payload__Group__1"
    // InternalGlobalJade.g:2079:1: rule__Payload__Group__1 : rule__Payload__Group__1__Impl ;
    public final void rule__Payload__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2083:1: ( rule__Payload__Group__1__Impl )
            // InternalGlobalJade.g:2084:2: rule__Payload__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group__1__Impl();

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
    // $ANTLR end "rule__Payload__Group__1"


    // $ANTLR start "rule__Payload__Group__1__Impl"
    // InternalGlobalJade.g:2090:1: rule__Payload__Group__1__Impl : ( ( rule__Payload__Group_1__0 ) ) ;
    public final void rule__Payload__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2094:1: ( ( ( rule__Payload__Group_1__0 ) ) )
            // InternalGlobalJade.g:2095:1: ( ( rule__Payload__Group_1__0 ) )
            {
            // InternalGlobalJade.g:2095:1: ( ( rule__Payload__Group_1__0 ) )
            // InternalGlobalJade.g:2096:2: ( rule__Payload__Group_1__0 )
            {
             before(grammarAccess.getPayloadAccess().getGroup_1()); 
            // InternalGlobalJade.g:2097:2: ( rule__Payload__Group_1__0 )
            // InternalGlobalJade.g:2097:3: rule__Payload__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Payload__Group__1__Impl"


    // $ANTLR start "rule__Payload__Group_1__0"
    // InternalGlobalJade.g:2106:1: rule__Payload__Group_1__0 : rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 ;
    public final void rule__Payload__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2110:1: ( rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1 )
            // InternalGlobalJade.g:2111:2: rule__Payload__Group_1__0__Impl rule__Payload__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Payload__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Payload__Group_1__1();

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
    // $ANTLR end "rule__Payload__Group_1__0"


    // $ANTLR start "rule__Payload__Group_1__0__Impl"
    // InternalGlobalJade.g:2118:1: rule__Payload__Group_1__0__Impl : ( ( rule__Payload__TypesAssignment_1_0 ) ) ;
    public final void rule__Payload__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2122:1: ( ( ( rule__Payload__TypesAssignment_1_0 ) ) )
            // InternalGlobalJade.g:2123:1: ( ( rule__Payload__TypesAssignment_1_0 ) )
            {
            // InternalGlobalJade.g:2123:1: ( ( rule__Payload__TypesAssignment_1_0 ) )
            // InternalGlobalJade.g:2124:2: ( rule__Payload__TypesAssignment_1_0 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_1_0()); 
            // InternalGlobalJade.g:2125:2: ( rule__Payload__TypesAssignment_1_0 )
            // InternalGlobalJade.g:2125:3: rule__Payload__TypesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Payload__TypesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getTypesAssignment_1_0()); 

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
    // $ANTLR end "rule__Payload__Group_1__0__Impl"


    // $ANTLR start "rule__Payload__Group_1__1"
    // InternalGlobalJade.g:2133:1: rule__Payload__Group_1__1 : rule__Payload__Group_1__1__Impl ;
    public final void rule__Payload__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2137:1: ( rule__Payload__Group_1__1__Impl )
            // InternalGlobalJade.g:2138:2: rule__Payload__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group_1__1__Impl();

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
    // $ANTLR end "rule__Payload__Group_1__1"


    // $ANTLR start "rule__Payload__Group_1__1__Impl"
    // InternalGlobalJade.g:2144:1: rule__Payload__Group_1__1__Impl : ( ( rule__Payload__Group_1_1__0 )* ) ;
    public final void rule__Payload__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2148:1: ( ( ( rule__Payload__Group_1_1__0 )* ) )
            // InternalGlobalJade.g:2149:1: ( ( rule__Payload__Group_1_1__0 )* )
            {
            // InternalGlobalJade.g:2149:1: ( ( rule__Payload__Group_1_1__0 )* )
            // InternalGlobalJade.g:2150:2: ( rule__Payload__Group_1_1__0 )*
            {
             before(grammarAccess.getPayloadAccess().getGroup_1_1()); 
            // InternalGlobalJade.g:2151:2: ( rule__Payload__Group_1_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGlobalJade.g:2151:3: rule__Payload__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Payload__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPayloadAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Payload__Group_1__1__Impl"


    // $ANTLR start "rule__Payload__Group_1_1__0"
    // InternalGlobalJade.g:2160:1: rule__Payload__Group_1_1__0 : rule__Payload__Group_1_1__0__Impl rule__Payload__Group_1_1__1 ;
    public final void rule__Payload__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2164:1: ( rule__Payload__Group_1_1__0__Impl rule__Payload__Group_1_1__1 )
            // InternalGlobalJade.g:2165:2: rule__Payload__Group_1_1__0__Impl rule__Payload__Group_1_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Payload__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Payload__Group_1_1__1();

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
    // $ANTLR end "rule__Payload__Group_1_1__0"


    // $ANTLR start "rule__Payload__Group_1_1__0__Impl"
    // InternalGlobalJade.g:2172:1: rule__Payload__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Payload__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2176:1: ( ( ',' ) )
            // InternalGlobalJade.g:2177:1: ( ',' )
            {
            // InternalGlobalJade.g:2177:1: ( ',' )
            // InternalGlobalJade.g:2178:2: ','
            {
             before(grammarAccess.getPayloadAccess().getCommaKeyword_1_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPayloadAccess().getCommaKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Payload__Group_1_1__0__Impl"


    // $ANTLR start "rule__Payload__Group_1_1__1"
    // InternalGlobalJade.g:2187:1: rule__Payload__Group_1_1__1 : rule__Payload__Group_1_1__1__Impl ;
    public final void rule__Payload__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2191:1: ( rule__Payload__Group_1_1__1__Impl )
            // InternalGlobalJade.g:2192:2: rule__Payload__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Payload__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Payload__Group_1_1__1"


    // $ANTLR start "rule__Payload__Group_1_1__1__Impl"
    // InternalGlobalJade.g:2198:1: rule__Payload__Group_1_1__1__Impl : ( ( rule__Payload__TypesAssignment_1_1_1 ) ) ;
    public final void rule__Payload__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2202:1: ( ( ( rule__Payload__TypesAssignment_1_1_1 ) ) )
            // InternalGlobalJade.g:2203:1: ( ( rule__Payload__TypesAssignment_1_1_1 ) )
            {
            // InternalGlobalJade.g:2203:1: ( ( rule__Payload__TypesAssignment_1_1_1 ) )
            // InternalGlobalJade.g:2204:2: ( rule__Payload__TypesAssignment_1_1_1 )
            {
             before(grammarAccess.getPayloadAccess().getTypesAssignment_1_1_1()); 
            // InternalGlobalJade.g:2205:2: ( rule__Payload__TypesAssignment_1_1_1 )
            // InternalGlobalJade.g:2205:3: rule__Payload__TypesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Payload__TypesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPayloadAccess().getTypesAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Payload__Group_1_1__1__Impl"


    // $ANTLR start "rule__Model__ProtocolNameAssignment_2"
    // InternalGlobalJade.g:2214:1: rule__Model__ProtocolNameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__Model__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2218:1: ( ( RULE_NAME ) )
            // InternalGlobalJade.g:2219:2: ( RULE_NAME )
            {
            // InternalGlobalJade.g:2219:2: ( RULE_NAME )
            // InternalGlobalJade.g:2220:3: RULE_NAME
            {
             before(grammarAccess.getModelAccess().getProtocolNameNAMETerminalRuleCall_2_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getProtocolNameNAMETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__ProtocolNameAssignment_2"


    // $ANTLR start "rule__Model__RolesAssignment_4"
    // InternalGlobalJade.g:2229:1: rule__Model__RolesAssignment_4 : ( ruleRoles ) ;
    public final void rule__Model__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2233:1: ( ( ruleRoles ) )
            // InternalGlobalJade.g:2234:2: ( ruleRoles )
            {
            // InternalGlobalJade.g:2234:2: ( ruleRoles )
            // InternalGlobalJade.g:2235:3: ruleRoles
            {
             before(grammarAccess.getModelAccess().getRolesRolesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRoles();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRolesRolesParserRuleCall_4_0()); 

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


    // $ANTLR start "rule__Model__ProtocolAssignment_7"
    // InternalGlobalJade.g:2244:1: rule__Model__ProtocolAssignment_7 : ( ruleProtocol ) ;
    public final void rule__Model__ProtocolAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2248:1: ( ( ruleProtocol ) )
            // InternalGlobalJade.g:2249:2: ( ruleProtocol )
            {
            // InternalGlobalJade.g:2249:2: ( ruleProtocol )
            // InternalGlobalJade.g:2250:3: ruleProtocol
            {
             before(grammarAccess.getModelAccess().getProtocolProtocolParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProtocolProtocolParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Model__ProtocolAssignment_7"


    // $ANTLR start "rule__Roles__RolesAssignment_0"
    // InternalGlobalJade.g:2259:1: rule__Roles__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2263:1: ( ( ruleRole ) )
            // InternalGlobalJade.g:2264:2: ( ruleRole )
            {
            // InternalGlobalJade.g:2264:2: ( ruleRole )
            // InternalGlobalJade.g:2265:3: ruleRole
            {
             before(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Roles__RolesAssignment_0"


    // $ANTLR start "rule__Roles__RolesAssignment_1_1"
    // InternalGlobalJade.g:2274:1: rule__Roles__RolesAssignment_1_1 : ( ruleRole ) ;
    public final void rule__Roles__RolesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2278:1: ( ( ruleRole ) )
            // InternalGlobalJade.g:2279:2: ( ruleRole )
            {
            // InternalGlobalJade.g:2279:2: ( ruleRole )
            // InternalGlobalJade.g:2280:3: ruleRole
            {
             before(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Roles__RolesAssignment_1_1"


    // $ANTLR start "rule__RoleOne__NameAssignment_1"
    // InternalGlobalJade.g:2289:1: rule__RoleOne__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__RoleOne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2293:1: ( ( RULE_NAME ) )
            // InternalGlobalJade.g:2294:2: ( RULE_NAME )
            {
            // InternalGlobalJade.g:2294:2: ( RULE_NAME )
            // InternalGlobalJade.g:2295:3: RULE_NAME
            {
             before(grammarAccess.getRoleOneAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getRoleOneAccess().getNameNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RoleOne__NameAssignment_1"


    // $ANTLR start "rule__RoleMultiple__NameAssignment_1"
    // InternalGlobalJade.g:2304:1: rule__RoleMultiple__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__RoleMultiple__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2308:1: ( ( RULE_NAME ) )
            // InternalGlobalJade.g:2309:2: ( RULE_NAME )
            {
            // InternalGlobalJade.g:2309:2: ( RULE_NAME )
            // InternalGlobalJade.g:2310:3: RULE_NAME
            {
             before(grammarAccess.getRoleMultipleAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getRoleMultipleAccess().getNameNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RoleMultiple__NameAssignment_1"


    // $ANTLR start "rule__RoleMultiple__RefAssignment_3"
    // InternalGlobalJade.g:2319:1: rule__RoleMultiple__RefAssignment_3 : ( ( RULE_NAME ) ) ;
    public final void rule__RoleMultiple__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2323:1: ( ( ( RULE_NAME ) ) )
            // InternalGlobalJade.g:2324:2: ( ( RULE_NAME ) )
            {
            // InternalGlobalJade.g:2324:2: ( ( RULE_NAME ) )
            // InternalGlobalJade.g:2325:3: ( RULE_NAME )
            {
             before(grammarAccess.getRoleMultipleAccess().getRefRoleOneCrossReference_3_0()); 
            // InternalGlobalJade.g:2326:3: ( RULE_NAME )
            // InternalGlobalJade.g:2327:4: RULE_NAME
            {
             before(grammarAccess.getRoleMultipleAccess().getRefRoleOneNAMETerminalRuleCall_3_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getRoleMultipleAccess().getRefRoleOneNAMETerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRoleMultipleAccess().getRefRoleOneCrossReference_3_0()); 

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
    // $ANTLR end "rule__RoleMultiple__RefAssignment_3"


    // $ANTLR start "rule__Protocol__ActionsAssignment_1"
    // InternalGlobalJade.g:2338:1: rule__Protocol__ActionsAssignment_1 : ( ( rule__Protocol__ActionsAlternatives_1_0 ) ) ;
    public final void rule__Protocol__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2342:1: ( ( ( rule__Protocol__ActionsAlternatives_1_0 ) ) )
            // InternalGlobalJade.g:2343:2: ( ( rule__Protocol__ActionsAlternatives_1_0 ) )
            {
            // InternalGlobalJade.g:2343:2: ( ( rule__Protocol__ActionsAlternatives_1_0 ) )
            // InternalGlobalJade.g:2344:3: ( rule__Protocol__ActionsAlternatives_1_0 )
            {
             before(grammarAccess.getProtocolAccess().getActionsAlternatives_1_0()); 
            // InternalGlobalJade.g:2345:3: ( rule__Protocol__ActionsAlternatives_1_0 )
            // InternalGlobalJade.g:2345:4: rule__Protocol__ActionsAlternatives_1_0
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


    // $ANTLR start "rule__Recursion__NameAssignment_1"
    // InternalGlobalJade.g:2353:1: rule__Recursion__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__Recursion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2357:1: ( ( RULE_NAME ) )
            // InternalGlobalJade.g:2358:2: ( RULE_NAME )
            {
            // InternalGlobalJade.g:2358:2: ( RULE_NAME )
            // InternalGlobalJade.g:2359:3: RULE_NAME
            {
             before(grammarAccess.getRecursionAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getNameNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Recursion__NameAssignment_1"


    // $ANTLR start "rule__CloseRecursion__RecursionVariableAssignment_1"
    // InternalGlobalJade.g:2368:1: rule__CloseRecursion__RecursionVariableAssignment_1 : ( ( RULE_NAME ) ) ;
    public final void rule__CloseRecursion__RecursionVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2372:1: ( ( ( RULE_NAME ) ) )
            // InternalGlobalJade.g:2373:2: ( ( RULE_NAME ) )
            {
            // InternalGlobalJade.g:2373:2: ( ( RULE_NAME ) )
            // InternalGlobalJade.g:2374:3: ( RULE_NAME )
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 
            // InternalGlobalJade.g:2375:3: ( RULE_NAME )
            // InternalGlobalJade.g:2376:4: RULE_NAME
            {
             before(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionNAMETerminalRuleCall_1_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionNAMETerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0()); 

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
    // $ANTLR end "rule__CloseRecursion__RecursionVariableAssignment_1"


    // $ANTLR start "rule__Choice__RoleAssignment_2"
    // InternalGlobalJade.g:2387:1: rule__Choice__RoleAssignment_2 : ( RULE_NAME ) ;
    public final void rule__Choice__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2391:1: ( ( RULE_NAME ) )
            // InternalGlobalJade.g:2392:2: ( RULE_NAME )
            {
            // InternalGlobalJade.g:2392:2: ( RULE_NAME )
            // InternalGlobalJade.g:2393:3: RULE_NAME
            {
             before(grammarAccess.getChoiceAccess().getRoleNAMETerminalRuleCall_2_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getRoleNAMETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Choice__RoleAssignment_2"


    // $ANTLR start "rule__Choice__MessagesAssignment_4"
    // InternalGlobalJade.g:2402:1: rule__Choice__MessagesAssignment_4 : ( ruleMessage ) ;
    public final void rule__Choice__MessagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2406:1: ( ( ruleMessage ) )
            // InternalGlobalJade.g:2407:2: ( ruleMessage )
            {
            // InternalGlobalJade.g:2407:2: ( ruleMessage )
            // InternalGlobalJade.g:2408:3: ruleMessage
            {
             before(grammarAccess.getChoiceAccess().getMessagesMessageParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getMessagesMessageParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Choice__MessagesAssignment_4"


    // $ANTLR start "rule__Choice__BranchAssignment_5"
    // InternalGlobalJade.g:2417:1: rule__Choice__BranchAssignment_5 : ( ruleProtocol ) ;
    public final void rule__Choice__BranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2421:1: ( ( ruleProtocol ) )
            // InternalGlobalJade.g:2422:2: ( ruleProtocol )
            {
            // InternalGlobalJade.g:2422:2: ( ruleProtocol )
            // InternalGlobalJade.g:2423:3: ruleProtocol
            {
             before(grammarAccess.getChoiceAccess().getBranchProtocolParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getBranchProtocolParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Choice__BranchAssignment_5"


    // $ANTLR start "rule__Choice__MessagesAssignment_7_2"
    // InternalGlobalJade.g:2432:1: rule__Choice__MessagesAssignment_7_2 : ( ruleMessage ) ;
    public final void rule__Choice__MessagesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2436:1: ( ( ruleMessage ) )
            // InternalGlobalJade.g:2437:2: ( ruleMessage )
            {
            // InternalGlobalJade.g:2437:2: ( ruleMessage )
            // InternalGlobalJade.g:2438:3: ruleMessage
            {
             before(grammarAccess.getChoiceAccess().getMessagesMessageParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getMessagesMessageParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Choice__MessagesAssignment_7_2"


    // $ANTLR start "rule__Choice__BranchAssignment_7_3"
    // InternalGlobalJade.g:2447:1: rule__Choice__BranchAssignment_7_3 : ( ruleProtocol ) ;
    public final void rule__Choice__BranchAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2451:1: ( ( ruleProtocol ) )
            // InternalGlobalJade.g:2452:2: ( ruleProtocol )
            {
            // InternalGlobalJade.g:2452:2: ( ruleProtocol )
            // InternalGlobalJade.g:2453:3: ruleProtocol
            {
             before(grammarAccess.getChoiceAccess().getBranchProtocolParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getBranchProtocolParserRuleCall_7_3_0()); 

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
    // $ANTLR end "rule__Choice__BranchAssignment_7_3"


    // $ANTLR start "rule__ForEach__EachRoleAssignment_1"
    // InternalGlobalJade.g:2462:1: rule__ForEach__EachRoleAssignment_1 : ( ruleRole ) ;
    public final void rule__ForEach__EachRoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2466:1: ( ( ruleRole ) )
            // InternalGlobalJade.g:2467:2: ( ruleRole )
            {
            // InternalGlobalJade.g:2467:2: ( ruleRole )
            // InternalGlobalJade.g:2468:3: ruleRole
            {
             before(grammarAccess.getForEachAccess().getEachRoleRoleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getForEachAccess().getEachRoleRoleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ForEach__EachRoleAssignment_1"


    // $ANTLR start "rule__ForEach__RoleAssignment_3"
    // InternalGlobalJade.g:2477:1: rule__ForEach__RoleAssignment_3 : ( ( RULE_NAME ) ) ;
    public final void rule__ForEach__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2481:1: ( ( ( RULE_NAME ) ) )
            // InternalGlobalJade.g:2482:2: ( ( RULE_NAME ) )
            {
            // InternalGlobalJade.g:2482:2: ( ( RULE_NAME ) )
            // InternalGlobalJade.g:2483:3: ( RULE_NAME )
            {
             before(grammarAccess.getForEachAccess().getRoleRoleMultipleCrossReference_3_0()); 
            // InternalGlobalJade.g:2484:3: ( RULE_NAME )
            // InternalGlobalJade.g:2485:4: RULE_NAME
            {
             before(grammarAccess.getForEachAccess().getRoleRoleMultipleNAMETerminalRuleCall_3_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getForEachAccess().getRoleRoleMultipleNAMETerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getForEachAccess().getRoleRoleMultipleCrossReference_3_0()); 

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
    // $ANTLR end "rule__ForEach__RoleAssignment_3"


    // $ANTLR start "rule__ForEach__BranchAssignment_5"
    // InternalGlobalJade.g:2496:1: rule__ForEach__BranchAssignment_5 : ( ruleProtocol ) ;
    public final void rule__ForEach__BranchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2500:1: ( ( ruleProtocol ) )
            // InternalGlobalJade.g:2501:2: ( ruleProtocol )
            {
            // InternalGlobalJade.g:2501:2: ( ruleProtocol )
            // InternalGlobalJade.g:2502:3: ruleProtocol
            {
             before(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ForEach__BranchAssignment_5"


    // $ANTLR start "rule__Message__TypeAssignment_0"
    // InternalGlobalJade.g:2511:1: rule__Message__TypeAssignment_0 : ( ruleMessageType ) ;
    public final void rule__Message__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2515:1: ( ( ruleMessageType ) )
            // InternalGlobalJade.g:2516:2: ( ruleMessageType )
            {
            // InternalGlobalJade.g:2516:2: ( ruleMessageType )
            // InternalGlobalJade.g:2517:3: ruleMessageType
            {
             before(grammarAccess.getMessageAccess().getTypeMessageTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getTypeMessageTypeParserRuleCall_0_0()); 

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


    // $ANTLR start "rule__Message__PayloadAssignment_2"
    // InternalGlobalJade.g:2526:1: rule__Message__PayloadAssignment_2 : ( rulePayload ) ;
    public final void rule__Message__PayloadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2530:1: ( ( rulePayload ) )
            // InternalGlobalJade.g:2531:2: ( rulePayload )
            {
            // InternalGlobalJade.g:2531:2: ( rulePayload )
            // InternalGlobalJade.g:2532:3: rulePayload
            {
             before(grammarAccess.getMessageAccess().getPayloadPayloadParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePayload();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getPayloadPayloadParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Message__PayloadAssignment_2"


    // $ANTLR start "rule__Message__SenderAssignment_5"
    // InternalGlobalJade.g:2541:1: rule__Message__SenderAssignment_5 : ( RULE_NAME ) ;
    public final void rule__Message__SenderAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2545:1: ( ( RULE_NAME ) )
            // InternalGlobalJade.g:2546:2: ( RULE_NAME )
            {
            // InternalGlobalJade.g:2546:2: ( RULE_NAME )
            // InternalGlobalJade.g:2547:3: RULE_NAME
            {
             before(grammarAccess.getMessageAccess().getSenderNAMETerminalRuleCall_5_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getSenderNAMETerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Message__SenderAssignment_5"


    // $ANTLR start "rule__Message__ReceiverAssignment_7"
    // InternalGlobalJade.g:2556:1: rule__Message__ReceiverAssignment_7 : ( RULE_NAME ) ;
    public final void rule__Message__ReceiverAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2560:1: ( ( RULE_NAME ) )
            // InternalGlobalJade.g:2561:2: ( RULE_NAME )
            {
            // InternalGlobalJade.g:2561:2: ( RULE_NAME )
            // InternalGlobalJade.g:2562:3: RULE_NAME
            {
             before(grammarAccess.getMessageAccess().getReceiverNAMETerminalRuleCall_7_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getReceiverNAMETerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Message__ReceiverAssignment_7"


    // $ANTLR start "rule__Payload__TypesAssignment_1_0"
    // InternalGlobalJade.g:2571:1: rule__Payload__TypesAssignment_1_0 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2575:1: ( ( ruleType ) )
            // InternalGlobalJade.g:2576:2: ( ruleType )
            {
            // InternalGlobalJade.g:2576:2: ( ruleType )
            // InternalGlobalJade.g:2577:3: ruleType
            {
             before(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Payload__TypesAssignment_1_0"


    // $ANTLR start "rule__Payload__TypesAssignment_1_1_1"
    // InternalGlobalJade.g:2586:1: rule__Payload__TypesAssignment_1_1_1 : ( ruleType ) ;
    public final void rule__Payload__TypesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGlobalJade.g:2590:1: ( ( ruleType ) )
            // InternalGlobalJade.g:2591:2: ( ruleType )
            {
            // InternalGlobalJade.g:2591:2: ( ruleType )
            // InternalGlobalJade.g:2592:3: ruleType
            {
             before(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__Payload__TypesAssignment_1_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004B0007F000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004B0007F002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000380000L});

}