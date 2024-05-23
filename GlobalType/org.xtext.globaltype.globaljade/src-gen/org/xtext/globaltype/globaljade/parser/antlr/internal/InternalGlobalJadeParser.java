package org.xtext.globaltype.globaljade.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.globaltype.globaljade.services.GlobalJadeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGlobalJadeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "')'", "'{'", "'}'", "','", "'role'", "'multrole'", "':'", "'rec'", "'loop'", "';'", "'choice'", "'at'", "'or'", "'foreach'", "'in'", "'from'", "'to'", "'CFP'", "'REJECT-PROPOSAL'", "'ACCEPT-PROPOSAL'", "'FAILURE'", "'INFORM-DONE'", "'INFORM'", "'PROPOSE'", "'int'", "'string'", "'action'"
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

        public InternalGlobalJadeParser(TokenStream input, GlobalJadeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GlobalJadeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGlobalJade.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGlobalJade.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalGlobalJade.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGlobalJade.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_protocol_7_0= ruleProtocol ) ) otherlv_8= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_protocolName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_roles_4_0 = null;

        EObject lv_protocol_7_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:77:2: ( (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_protocol_7_0= ruleProtocol ) ) otherlv_8= '}' ) )
            // InternalGlobalJade.g:78:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_protocol_7_0= ruleProtocol ) ) otherlv_8= '}' )
            {
            // InternalGlobalJade.g:78:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_protocol_7_0= ruleProtocol ) ) otherlv_8= '}' )
            // InternalGlobalJade.g:79:3: otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_protocol_7_0= ruleProtocol ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getProtocolKeyword_1());
            		
            // InternalGlobalJade.g:87:3: ( (lv_protocolName_2_0= RULE_NAME ) )
            // InternalGlobalJade.g:88:4: (lv_protocolName_2_0= RULE_NAME )
            {
            // InternalGlobalJade.g:88:4: (lv_protocolName_2_0= RULE_NAME )
            // InternalGlobalJade.g:89:5: lv_protocolName_2_0= RULE_NAME
            {
            lv_protocolName_2_0=(Token)match(input,RULE_NAME,FOLLOW_5); 

            					newLeafNode(lv_protocolName_2_0, grammarAccess.getModelAccess().getProtocolNameNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protocolName",
            						lv_protocolName_2_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftParenthesisKeyword_3());
            		
            // InternalGlobalJade.g:109:3: ( (lv_roles_4_0= ruleRoles ) )
            // InternalGlobalJade.g:110:4: (lv_roles_4_0= ruleRoles )
            {
            // InternalGlobalJade.g:110:4: (lv_roles_4_0= ruleRoles )
            // InternalGlobalJade.g:111:5: lv_roles_4_0= ruleRoles
            {

            					newCompositeNode(grammarAccess.getModelAccess().getRolesRolesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_roles_4_0=ruleRoles();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"roles",
            						lv_roles_4_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Roles");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalGlobalJade.g:136:3: ( (lv_protocol_7_0= ruleProtocol ) )
            // InternalGlobalJade.g:137:4: (lv_protocol_7_0= ruleProtocol )
            {
            // InternalGlobalJade.g:137:4: (lv_protocol_7_0= ruleProtocol )
            // InternalGlobalJade.g:138:5: lv_protocol_7_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getModelAccess().getProtocolProtocolParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_protocol_7_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"protocol",
            						lv_protocol_7_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRoles"
    // InternalGlobalJade.g:163:1: entryRuleRoles returns [EObject current=null] : iv_ruleRoles= ruleRoles EOF ;
    public final EObject entryRuleRoles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoles = null;


        try {
            // InternalGlobalJade.g:163:46: (iv_ruleRoles= ruleRoles EOF )
            // InternalGlobalJade.g:164:2: iv_ruleRoles= ruleRoles EOF
            {
             newCompositeNode(grammarAccess.getRolesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoles=ruleRoles();

            state._fsp--;

             current =iv_ruleRoles; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoles"


    // $ANTLR start "ruleRoles"
    // InternalGlobalJade.g:170:1: ruleRoles returns [EObject current=null] : ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* ) ;
    public final EObject ruleRoles() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_roles_0_0 = null;

        EObject lv_roles_2_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:176:2: ( ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* ) )
            // InternalGlobalJade.g:177:2: ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* )
            {
            // InternalGlobalJade.g:177:2: ( ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )* )
            // InternalGlobalJade.g:178:3: ( (lv_roles_0_0= ruleRole ) ) (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )*
            {
            // InternalGlobalJade.g:178:3: ( (lv_roles_0_0= ruleRole ) )
            // InternalGlobalJade.g:179:4: (lv_roles_0_0= ruleRole )
            {
            // InternalGlobalJade.g:179:4: (lv_roles_0_0= ruleRole )
            // InternalGlobalJade.g:180:5: lv_roles_0_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_roles_0_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRolesRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_0_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGlobalJade.g:197:3: (otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGlobalJade.g:198:4: otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRolesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalGlobalJade.g:202:4: ( (lv_roles_2_0= ruleRole ) )
            	    // InternalGlobalJade.g:203:5: (lv_roles_2_0= ruleRole )
            	    {
            	    // InternalGlobalJade.g:203:5: (lv_roles_2_0= ruleRole )
            	    // InternalGlobalJade.g:204:6: lv_roles_2_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_roles_2_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRolesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_2_0,
            	    							"org.xtext.globaltype.globaljade.GlobalJade.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoles"


    // $ANTLR start "entryRuleRole"
    // InternalGlobalJade.g:226:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalGlobalJade.g:226:45: (iv_ruleRole= ruleRole EOF )
            // InternalGlobalJade.g:227:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalGlobalJade.g:233:1: ruleRole returns [EObject current=null] : (this_RoleOne_0= ruleRoleOne | this_RoleMultiple_1= ruleRoleMultiple ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_RoleOne_0 = null;

        EObject this_RoleMultiple_1 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:239:2: ( (this_RoleOne_0= ruleRoleOne | this_RoleMultiple_1= ruleRoleMultiple ) )
            // InternalGlobalJade.g:240:2: (this_RoleOne_0= ruleRoleOne | this_RoleMultiple_1= ruleRoleMultiple )
            {
            // InternalGlobalJade.g:240:2: (this_RoleOne_0= ruleRoleOne | this_RoleMultiple_1= ruleRoleMultiple )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
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
                    // InternalGlobalJade.g:241:3: this_RoleOne_0= ruleRoleOne
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getRoleOneParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoleOne_0=ruleRoleOne();

                    state._fsp--;


                    			current = this_RoleOne_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:250:3: this_RoleMultiple_1= ruleRoleMultiple
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getRoleMultipleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoleMultiple_1=ruleRoleMultiple();

                    state._fsp--;


                    			current = this_RoleMultiple_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleRoleOne"
    // InternalGlobalJade.g:262:1: entryRuleRoleOne returns [EObject current=null] : iv_ruleRoleOne= ruleRoleOne EOF ;
    public final EObject entryRuleRoleOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleOne = null;


        try {
            // InternalGlobalJade.g:262:48: (iv_ruleRoleOne= ruleRoleOne EOF )
            // InternalGlobalJade.g:263:2: iv_ruleRoleOne= ruleRoleOne EOF
            {
             newCompositeNode(grammarAccess.getRoleOneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleOne=ruleRoleOne();

            state._fsp--;

             current =iv_ruleRoleOne; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoleOne"


    // $ANTLR start "ruleRoleOne"
    // InternalGlobalJade.g:269:1: ruleRoleOne returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_NAME ) ) ) ;
    public final EObject ruleRoleOne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:275:2: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_NAME ) ) ) )
            // InternalGlobalJade.g:276:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_NAME ) ) )
            {
            // InternalGlobalJade.g:276:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_NAME ) ) )
            // InternalGlobalJade.g:277:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_NAME ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleOneAccess().getRoleKeyword_0());
            		
            // InternalGlobalJade.g:281:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGlobalJade.g:282:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGlobalJade.g:282:4: (lv_name_1_0= RULE_NAME )
            // InternalGlobalJade.g:283:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleOneAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleOneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleOne"


    // $ANTLR start "entryRuleRoleMultiple"
    // InternalGlobalJade.g:303:1: entryRuleRoleMultiple returns [EObject current=null] : iv_ruleRoleMultiple= ruleRoleMultiple EOF ;
    public final EObject entryRuleRoleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleMultiple = null;


        try {
            // InternalGlobalJade.g:303:53: (iv_ruleRoleMultiple= ruleRoleMultiple EOF )
            // InternalGlobalJade.g:304:2: iv_ruleRoleMultiple= ruleRoleMultiple EOF
            {
             newCompositeNode(grammarAccess.getRoleMultipleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleMultiple=ruleRoleMultiple();

            state._fsp--;

             current =iv_ruleRoleMultiple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoleMultiple"


    // $ANTLR start "ruleRoleMultiple"
    // InternalGlobalJade.g:310:1: ruleRoleMultiple returns [EObject current=null] : (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_NAME ) ) ) ;
    public final EObject ruleRoleMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:316:2: ( (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_NAME ) ) ) )
            // InternalGlobalJade.g:317:2: (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_NAME ) ) )
            {
            // InternalGlobalJade.g:317:2: (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_NAME ) ) )
            // InternalGlobalJade.g:318:3: otherlv_0= 'multrole' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_NAME ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleMultipleAccess().getMultroleKeyword_0());
            		
            // InternalGlobalJade.g:322:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGlobalJade.g:323:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGlobalJade.g:323:4: (lv_name_1_0= RULE_NAME )
            // InternalGlobalJade.g:324:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleMultipleAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleMultipleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleMultipleAccess().getColonKeyword_2());
            		
            // InternalGlobalJade.g:344:3: ( (otherlv_3= RULE_NAME ) )
            // InternalGlobalJade.g:345:4: (otherlv_3= RULE_NAME )
            {
            // InternalGlobalJade.g:345:4: (otherlv_3= RULE_NAME )
            // InternalGlobalJade.g:346:5: otherlv_3= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleMultipleRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getRoleMultipleAccess().getRefRoleOneCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleMultiple"


    // $ANTLR start "entryRuleProtocol"
    // InternalGlobalJade.g:361:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalGlobalJade.g:361:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalGlobalJade.g:362:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalGlobalJade.g:368:1: ruleProtocol returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleForEach | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_1_3 = null;

        EObject lv_actions_1_4 = null;

        EObject lv_actions_1_5 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:374:2: ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleForEach | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* ) )
            // InternalGlobalJade.g:375:2: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleForEach | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* )
            {
            // InternalGlobalJade.g:375:2: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleForEach | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )* )
            // InternalGlobalJade.g:376:3: () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleForEach | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )*
            {
            // InternalGlobalJade.g:376:3: ()
            // InternalGlobalJade.g:377:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolAccess().getProtocolAction_0(),
            					current);
            			

            }

            // InternalGlobalJade.g:383:3: ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleForEach | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=22 && LA4_0<=23)||LA4_0==25||LA4_0==28||(LA4_0>=32 && LA4_0<=38)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGlobalJade.g:384:4: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleForEach | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) )
            	    {
            	    // InternalGlobalJade.g:384:4: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleForEach | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion ) )
            	    // InternalGlobalJade.g:385:5: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleForEach | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion )
            	    {
            	    // InternalGlobalJade.g:385:5: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice | lv_actions_1_3= ruleForEach | lv_actions_1_4= ruleRecursion | lv_actions_1_5= ruleCloseRecursion )
            	    int alt3=5;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	    case 33:
            	    case 34:
            	    case 35:
            	    case 36:
            	    case 37:
            	    case 38:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt3=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // InternalGlobalJade.g:386:6: lv_actions_1_1= ruleMessage
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsMessageParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_1_1=ruleMessage();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_1,
            	            							"org.xtext.globaltype.globaljade.GlobalJade.Message");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalGlobalJade.g:402:6: lv_actions_1_2= ruleChoice
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsChoiceParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_1_2=ruleChoice();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_2,
            	            							"org.xtext.globaltype.globaljade.GlobalJade.Choice");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalGlobalJade.g:418:6: lv_actions_1_3= ruleForEach
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsForEachParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_1_3=ruleForEach();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_3,
            	            							"org.xtext.globaltype.globaljade.GlobalJade.ForEach");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalGlobalJade.g:434:6: lv_actions_1_4= ruleRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsRecursionParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_1_4=ruleRecursion();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_4,
            	            							"org.xtext.globaltype.globaljade.GlobalJade.Recursion");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalGlobalJade.g:450:6: lv_actions_1_5= ruleCloseRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsCloseRecursionParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_1_5=ruleCloseRecursion();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_5,
            	            							"org.xtext.globaltype.globaljade.GlobalJade.CloseRecursion");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleRecursion"
    // InternalGlobalJade.g:472:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // InternalGlobalJade.g:472:50: (iv_ruleRecursion= ruleRecursion EOF )
            // InternalGlobalJade.g:473:2: iv_ruleRecursion= ruleRecursion EOF
            {
             newCompositeNode(grammarAccess.getRecursionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecursion=ruleRecursion();

            state._fsp--;

             current =iv_ruleRecursion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecursion"


    // $ANTLR start "ruleRecursion"
    // InternalGlobalJade.g:479:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ) ;
    public final EObject ruleRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:485:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ) )
            // InternalGlobalJade.g:486:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' )
            {
            // InternalGlobalJade.g:486:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' )
            // InternalGlobalJade.g:487:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
            		
            // InternalGlobalJade.g:491:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGlobalJade.g:492:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGlobalJade.g:492:4: (lv_name_1_0= RULE_NAME )
            // InternalGlobalJade.g:493:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRecursionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecursionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRecursionAccess().getColonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecursion"


    // $ANTLR start "entryRuleCloseRecursion"
    // InternalGlobalJade.g:517:1: entryRuleCloseRecursion returns [EObject current=null] : iv_ruleCloseRecursion= ruleCloseRecursion EOF ;
    public final EObject entryRuleCloseRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseRecursion = null;


        try {
            // InternalGlobalJade.g:517:55: (iv_ruleCloseRecursion= ruleCloseRecursion EOF )
            // InternalGlobalJade.g:518:2: iv_ruleCloseRecursion= ruleCloseRecursion EOF
            {
             newCompositeNode(grammarAccess.getCloseRecursionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCloseRecursion=ruleCloseRecursion();

            state._fsp--;

             current =iv_ruleCloseRecursion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloseRecursion"


    // $ANTLR start "ruleCloseRecursion"
    // InternalGlobalJade.g:524:1: ruleCloseRecursion returns [EObject current=null] : (otherlv_0= 'loop' ( (otherlv_1= RULE_NAME ) ) otherlv_2= ';' ) ;
    public final EObject ruleCloseRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:530:2: ( (otherlv_0= 'loop' ( (otherlv_1= RULE_NAME ) ) otherlv_2= ';' ) )
            // InternalGlobalJade.g:531:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_NAME ) ) otherlv_2= ';' )
            {
            // InternalGlobalJade.g:531:2: (otherlv_0= 'loop' ( (otherlv_1= RULE_NAME ) ) otherlv_2= ';' )
            // InternalGlobalJade.g:532:3: otherlv_0= 'loop' ( (otherlv_1= RULE_NAME ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseRecursionAccess().getLoopKeyword_0());
            		
            // InternalGlobalJade.g:536:3: ( (otherlv_1= RULE_NAME ) )
            // InternalGlobalJade.g:537:4: (otherlv_1= RULE_NAME )
            {
            // InternalGlobalJade.g:537:4: (otherlv_1= RULE_NAME )
            // InternalGlobalJade.g:538:5: otherlv_1= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloseRecursionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_NAME,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCloseRecursionAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCloseRecursion"


    // $ANTLR start "entryRuleChoice"
    // InternalGlobalJade.g:557:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalGlobalJade.g:557:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalGlobalJade.g:558:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // InternalGlobalJade.g:564:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_2_0= RULE_NAME ) ) otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )* ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_role_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_messages_4_0 = null;

        EObject lv_branch_5_0 = null;

        EObject lv_messages_9_0 = null;

        EObject lv_branch_10_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:570:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_2_0= RULE_NAME ) ) otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )* ) )
            // InternalGlobalJade.g:571:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_2_0= RULE_NAME ) ) otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )* )
            {
            // InternalGlobalJade.g:571:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_2_0= RULE_NAME ) ) otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )* )
            // InternalGlobalJade.g:572:3: otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_2_0= RULE_NAME ) ) otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getAtKeyword_1());
            		
            // InternalGlobalJade.g:580:3: ( (lv_role_2_0= RULE_NAME ) )
            // InternalGlobalJade.g:581:4: (lv_role_2_0= RULE_NAME )
            {
            // InternalGlobalJade.g:581:4: (lv_role_2_0= RULE_NAME )
            // InternalGlobalJade.g:582:5: lv_role_2_0= RULE_NAME
            {
            lv_role_2_0=(Token)match(input,RULE_NAME,FOLLOW_8); 

            					newLeafNode(lv_role_2_0, grammarAccess.getChoiceAccess().getRoleNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"role",
            						lv_role_2_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGlobalJade.g:602:3: ( (lv_messages_4_0= ruleMessage ) )
            // InternalGlobalJade.g:603:4: (lv_messages_4_0= ruleMessage )
            {
            // InternalGlobalJade.g:603:4: (lv_messages_4_0= ruleMessage )
            // InternalGlobalJade.g:604:5: lv_messages_4_0= ruleMessage
            {

            					newCompositeNode(grammarAccess.getChoiceAccess().getMessagesMessageParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_messages_4_0=ruleMessage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceRule());
            					}
            					add(
            						current,
            						"messages",
            						lv_messages_4_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Message");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGlobalJade.g:621:3: ( (lv_branch_5_0= ruleProtocol ) )
            // InternalGlobalJade.g:622:4: (lv_branch_5_0= ruleProtocol )
            {
            // InternalGlobalJade.g:622:4: (lv_branch_5_0= ruleProtocol )
            // InternalGlobalJade.g:623:5: lv_branch_5_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getChoiceAccess().getBranchProtocolParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_branch_5_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoiceRule());
            					}
            					add(
            						current,
            						"branch",
            						lv_branch_5_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalGlobalJade.g:644:3: (otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGlobalJade.g:645:4: otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}'
            	    {
            	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoiceAccess().getOrKeyword_7_0());
            	    			
            	    otherlv_8=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_8, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_7_1());
            	    			
            	    // InternalGlobalJade.g:653:4: ( (lv_messages_9_0= ruleMessage ) )
            	    // InternalGlobalJade.g:654:5: (lv_messages_9_0= ruleMessage )
            	    {
            	    // InternalGlobalJade.g:654:5: (lv_messages_9_0= ruleMessage )
            	    // InternalGlobalJade.g:655:6: lv_messages_9_0= ruleMessage
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceAccess().getMessagesMessageParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_messages_9_0=ruleMessage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"messages",
            	    							lv_messages_9_0,
            	    							"org.xtext.globaltype.globaljade.GlobalJade.Message");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalGlobalJade.g:672:4: ( (lv_branch_10_0= ruleProtocol ) )
            	    // InternalGlobalJade.g:673:5: (lv_branch_10_0= ruleProtocol )
            	    {
            	    // InternalGlobalJade.g:673:5: (lv_branch_10_0= ruleProtocol )
            	    // InternalGlobalJade.g:674:6: lv_branch_10_0= ruleProtocol
            	    {

            	    						newCompositeNode(grammarAccess.getChoiceAccess().getBranchProtocolParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_branch_10_0=ruleProtocol();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branch",
            	    							lv_branch_10_0,
            	    							"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,17,FOLLOW_17); 

            	    				newLeafNode(otherlv_11, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_7_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleForEach"
    // InternalGlobalJade.g:700:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalGlobalJade.g:700:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalGlobalJade.g:701:2: iv_ruleForEach= ruleForEach EOF
            {
             newCompositeNode(grammarAccess.getForEachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEach=ruleForEach();

            state._fsp--;

             current =iv_ruleForEach; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForEach"


    // $ANTLR start "ruleForEach"
    // InternalGlobalJade.g:707:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRole ) ) otherlv_2= 'in' ( (otherlv_3= RULE_NAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' ) ;
    public final EObject ruleForEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_eachRole_1_0 = null;

        EObject lv_branch_5_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:713:2: ( (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRole ) ) otherlv_2= 'in' ( (otherlv_3= RULE_NAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' ) )
            // InternalGlobalJade.g:714:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRole ) ) otherlv_2= 'in' ( (otherlv_3= RULE_NAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' )
            {
            // InternalGlobalJade.g:714:2: (otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRole ) ) otherlv_2= 'in' ( (otherlv_3= RULE_NAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' )
            // InternalGlobalJade.g:715:3: otherlv_0= 'foreach' ( (lv_eachRole_1_0= ruleRole ) ) otherlv_2= 'in' ( (otherlv_3= RULE_NAME ) ) otherlv_4= '{' ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForeachKeyword_0());
            		
            // InternalGlobalJade.g:719:3: ( (lv_eachRole_1_0= ruleRole ) )
            // InternalGlobalJade.g:720:4: (lv_eachRole_1_0= ruleRole )
            {
            // InternalGlobalJade.g:720:4: (lv_eachRole_1_0= ruleRole )
            // InternalGlobalJade.g:721:5: lv_eachRole_1_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getEachRoleRoleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_eachRole_1_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachRule());
            					}
            					set(
            						current,
            						"eachRole",
            						lv_eachRole_1_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getInKeyword_2());
            		
            // InternalGlobalJade.g:742:3: ( (otherlv_3= RULE_NAME ) )
            // InternalGlobalJade.g:743:4: (otherlv_3= RULE_NAME )
            {
            // InternalGlobalJade.g:743:4: (otherlv_3= RULE_NAME )
            // InternalGlobalJade.g:744:5: otherlv_3= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_NAME,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getForEachAccess().getRoleRoleMultipleCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getForEachAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalGlobalJade.g:759:3: ( (lv_branch_5_0= ruleProtocol ) )
            // InternalGlobalJade.g:760:4: (lv_branch_5_0= ruleProtocol )
            {
            // InternalGlobalJade.g:760:4: (lv_branch_5_0= ruleProtocol )
            // InternalGlobalJade.g:761:5: lv_branch_5_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_branch_5_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachRule());
            					}
            					set(
            						current,
            						"branch",
            						lv_branch_5_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getForEachAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForEach"


    // $ANTLR start "entryRuleMessage"
    // InternalGlobalJade.g:786:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalGlobalJade.g:786:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalGlobalJade.g:787:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalGlobalJade.g:793:1: ruleMessage returns [EObject current=null] : ( ( (lv_type_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (lv_sender_5_0= RULE_NAME ) ) otherlv_6= 'to' ( (lv_receiver_7_0= RULE_NAME ) ) otherlv_8= ';' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_sender_5_0=null;
        Token otherlv_6=null;
        Token lv_receiver_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_payload_2_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:799:2: ( ( ( (lv_type_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (lv_sender_5_0= RULE_NAME ) ) otherlv_6= 'to' ( (lv_receiver_7_0= RULE_NAME ) ) otherlv_8= ';' ) )
            // InternalGlobalJade.g:800:2: ( ( (lv_type_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (lv_sender_5_0= RULE_NAME ) ) otherlv_6= 'to' ( (lv_receiver_7_0= RULE_NAME ) ) otherlv_8= ';' )
            {
            // InternalGlobalJade.g:800:2: ( ( (lv_type_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (lv_sender_5_0= RULE_NAME ) ) otherlv_6= 'to' ( (lv_receiver_7_0= RULE_NAME ) ) otherlv_8= ';' )
            // InternalGlobalJade.g:801:3: ( (lv_type_0_0= ruleMessageType ) ) otherlv_1= '(' ( (lv_payload_2_0= rulePayload ) )? otherlv_3= ')' otherlv_4= 'from' ( (lv_sender_5_0= RULE_NAME ) ) otherlv_6= 'to' ( (lv_receiver_7_0= RULE_NAME ) ) otherlv_8= ';'
            {
            // InternalGlobalJade.g:801:3: ( (lv_type_0_0= ruleMessageType ) )
            // InternalGlobalJade.g:802:4: (lv_type_0_0= ruleMessageType )
            {
            // InternalGlobalJade.g:802:4: (lv_type_0_0= ruleMessageType )
            // InternalGlobalJade.g:803:5: lv_type_0_0= ruleMessageType
            {

            					newCompositeNode(grammarAccess.getMessageAccess().getTypeMessageTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleMessageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.MessageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGlobalJade.g:824:3: ( (lv_payload_2_0= rulePayload ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=39 && LA6_0<=41)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGlobalJade.g:825:4: (lv_payload_2_0= rulePayload )
                    {
                    // InternalGlobalJade.g:825:4: (lv_payload_2_0= rulePayload )
                    // InternalGlobalJade.g:826:5: lv_payload_2_0= rulePayload
                    {

                    					newCompositeNode(grammarAccess.getMessageAccess().getPayloadPayloadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_payload_2_0=rulePayload();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMessageRule());
                    					}
                    					set(
                    						current,
                    						"payload",
                    						lv_payload_2_0,
                    						"org.xtext.globaltype.globaljade.GlobalJade.Payload");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getFromKeyword_4());
            		
            // InternalGlobalJade.g:851:3: ( (lv_sender_5_0= RULE_NAME ) )
            // InternalGlobalJade.g:852:4: (lv_sender_5_0= RULE_NAME )
            {
            // InternalGlobalJade.g:852:4: (lv_sender_5_0= RULE_NAME )
            // InternalGlobalJade.g:853:5: lv_sender_5_0= RULE_NAME
            {
            lv_sender_5_0=(Token)match(input,RULE_NAME,FOLLOW_21); 

            					newLeafNode(lv_sender_5_0, grammarAccess.getMessageAccess().getSenderNAMETerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sender",
            						lv_sender_5_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getToKeyword_6());
            		
            // InternalGlobalJade.g:873:3: ( (lv_receiver_7_0= RULE_NAME ) )
            // InternalGlobalJade.g:874:4: (lv_receiver_7_0= RULE_NAME )
            {
            // InternalGlobalJade.g:874:4: (lv_receiver_7_0= RULE_NAME )
            // InternalGlobalJade.g:875:5: lv_receiver_7_0= RULE_NAME
            {
            lv_receiver_7_0=(Token)match(input,RULE_NAME,FOLLOW_14); 

            					newLeafNode(lv_receiver_7_0, grammarAccess.getMessageAccess().getReceiverNAMETerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"receiver",
            						lv_receiver_7_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getSemicolonKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageType"
    // InternalGlobalJade.g:899:1: entryRuleMessageType returns [String current=null] : iv_ruleMessageType= ruleMessageType EOF ;
    public final String entryRuleMessageType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMessageType = null;


        try {
            // InternalGlobalJade.g:899:51: (iv_ruleMessageType= ruleMessageType EOF )
            // InternalGlobalJade.g:900:2: iv_ruleMessageType= ruleMessageType EOF
            {
             newCompositeNode(grammarAccess.getMessageTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageType=ruleMessageType();

            state._fsp--;

             current =iv_ruleMessageType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageType"


    // $ANTLR start "ruleMessageType"
    // InternalGlobalJade.g:906:1: ruleMessageType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CFP' | kw= 'REJECT-PROPOSAL' | kw= 'ACCEPT-PROPOSAL' | kw= 'FAILURE' | kw= 'INFORM-DONE' | kw= 'INFORM' | kw= 'PROPOSE' ) ;
    public final AntlrDatatypeRuleToken ruleMessageType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:912:2: ( (kw= 'CFP' | kw= 'REJECT-PROPOSAL' | kw= 'ACCEPT-PROPOSAL' | kw= 'FAILURE' | kw= 'INFORM-DONE' | kw= 'INFORM' | kw= 'PROPOSE' ) )
            // InternalGlobalJade.g:913:2: (kw= 'CFP' | kw= 'REJECT-PROPOSAL' | kw= 'ACCEPT-PROPOSAL' | kw= 'FAILURE' | kw= 'INFORM-DONE' | kw= 'INFORM' | kw= 'PROPOSE' )
            {
            // InternalGlobalJade.g:913:2: (kw= 'CFP' | kw= 'REJECT-PROPOSAL' | kw= 'ACCEPT-PROPOSAL' | kw= 'FAILURE' | kw= 'INFORM-DONE' | kw= 'INFORM' | kw= 'PROPOSE' )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt7=1;
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case 34:
                {
                alt7=3;
                }
                break;
            case 35:
                {
                alt7=4;
                }
                break;
            case 36:
                {
                alt7=5;
                }
                break;
            case 37:
                {
                alt7=6;
                }
                break;
            case 38:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGlobalJade.g:914:3: kw= 'CFP'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getCFPKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:920:3: kw= 'REJECT-PROPOSAL'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getREJECTPROPOSALKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGlobalJade.g:926:3: kw= 'ACCEPT-PROPOSAL'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getACCEPTPROPOSALKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGlobalJade.g:932:3: kw= 'FAILURE'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getFAILUREKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalGlobalJade.g:938:3: kw= 'INFORM-DONE'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getINFORMDONEKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalGlobalJade.g:944:3: kw= 'INFORM'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getINFORMKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalGlobalJade.g:950:3: kw= 'PROPOSE'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMessageTypeAccess().getPROPOSEKeyword_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageType"


    // $ANTLR start "entryRulePayload"
    // InternalGlobalJade.g:959:1: entryRulePayload returns [EObject current=null] : iv_rulePayload= rulePayload EOF ;
    public final EObject entryRulePayload() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayload = null;


        try {
            // InternalGlobalJade.g:959:48: (iv_rulePayload= rulePayload EOF )
            // InternalGlobalJade.g:960:2: iv_rulePayload= rulePayload EOF
            {
             newCompositeNode(grammarAccess.getPayloadRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePayload=rulePayload();

            state._fsp--;

             current =iv_rulePayload; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePayload"


    // $ANTLR start "rulePayload"
    // InternalGlobalJade.g:966:1: rulePayload returns [EObject current=null] : ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) ;
    public final EObject rulePayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_types_1_0 = null;

        AntlrDatatypeRuleToken lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:972:2: ( ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) ) )
            // InternalGlobalJade.g:973:2: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
            {
            // InternalGlobalJade.g:973:2: ( () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* ) )
            // InternalGlobalJade.g:974:3: () ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
            {
            // InternalGlobalJade.g:974:3: ()
            // InternalGlobalJade.g:975:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPayloadAccess().getPayloadAction_0(),
            					current);
            			

            }

            // InternalGlobalJade.g:981:3: ( ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )* )
            // InternalGlobalJade.g:982:4: ( (lv_types_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            {
            // InternalGlobalJade.g:982:4: ( (lv_types_1_0= ruleType ) )
            // InternalGlobalJade.g:983:5: (lv_types_1_0= ruleType )
            {
            // InternalGlobalJade.g:983:5: (lv_types_1_0= ruleType )
            // InternalGlobalJade.g:984:6: lv_types_1_0= ruleType
            {

            						newCompositeNode(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_11);
            lv_types_1_0=ruleType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPayloadRule());
            						}
            						add(
            							current,
            							"types",
            							lv_types_1_0,
            							"org.xtext.globaltype.globaljade.GlobalJade.Type");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalGlobalJade.g:1001:4: (otherlv_2= ',' ( (lv_types_3_0= ruleType ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGlobalJade.g:1002:5: otherlv_2= ',' ( (lv_types_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_22); 

            	    					newLeafNode(otherlv_2, grammarAccess.getPayloadAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalGlobalJade.g:1006:5: ( (lv_types_3_0= ruleType ) )
            	    // InternalGlobalJade.g:1007:6: (lv_types_3_0= ruleType )
            	    {
            	    // InternalGlobalJade.g:1007:6: (lv_types_3_0= ruleType )
            	    // InternalGlobalJade.g:1008:7: lv_types_3_0= ruleType
            	    {

            	    							newCompositeNode(grammarAccess.getPayloadAccess().getTypesTypeParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_types_3_0=ruleType();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPayloadRule());
            	    							}
            	    							add(
            	    								current,
            	    								"types",
            	    								lv_types_3_0,
            	    								"org.xtext.globaltype.globaljade.GlobalJade.Type");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePayload"


    // $ANTLR start "entryRuleType"
    // InternalGlobalJade.g:1031:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalGlobalJade.g:1031:44: (iv_ruleType= ruleType EOF )
            // InternalGlobalJade.g:1032:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGlobalJade.g:1038:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'action' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:1044:2: ( (kw= 'int' | kw= 'string' | kw= 'action' ) )
            // InternalGlobalJade.g:1045:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            {
            // InternalGlobalJade.g:1045:2: (kw= 'int' | kw= 'string' | kw= 'action' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGlobalJade.g:1046:3: kw= 'int'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:1052:3: kw= 'string'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGlobalJade.g:1058:3: kw= 'action'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getActionKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000007F12C20000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000007F12C00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000038000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000038000000000L});

}