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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_TYPE_MESSAGE", "RULE_CONTENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "')'", "'{'", "'}'", "','", "'role'", "'multrole'", "':'", "'rec'", "'stop'", "'continue'", "'choice'", "'at'", "'or'", "'forall'", "'in'", "'do'", "';'", "'end'", "'from'", "'to'"
    };
    public static final int RULE_NAME=4;
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
    public static final int T__36=36;
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
    // InternalGlobalJade.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_protocol_7_0= ruleProtocol ) ) otherlv_8= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_roles_4_0 = null;

        EObject lv_protocol_7_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:77:2: ( (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_protocol_7_0= ruleProtocol ) ) otherlv_8= '}' ) )
            // InternalGlobalJade.g:78:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_protocol_7_0= ruleProtocol ) ) otherlv_8= '}' )
            {
            // InternalGlobalJade.g:78:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_protocol_7_0= ruleProtocol ) ) otherlv_8= '}' )
            // InternalGlobalJade.g:79:3: otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRoles ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_protocol_7_0= ruleProtocol ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getProtocolKeyword_1());
            		
            // InternalGlobalJade.g:87:3: ( (lv_name_2_0= RULE_NAME ) )
            // InternalGlobalJade.g:88:4: (lv_name_2_0= RULE_NAME )
            {
            // InternalGlobalJade.g:88:4: (lv_name_2_0= RULE_NAME )
            // InternalGlobalJade.g:89:5: lv_name_2_0= RULE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

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
            					add(
            						current,
            						"roles",
            						lv_roles_4_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Roles");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_9); 

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
            					add(
            						current,
            						"protocol",
            						lv_protocol_7_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGlobalJade.g:198:4: otherlv_1= ',' ( (lv_roles_2_0= ruleRole ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_6); 

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
    // InternalGlobalJade.g:233:1: ruleRole returns [EObject current=null] : (this_OneRole_0= ruleOneRole | this_MultipleRole_1= ruleMultipleRole ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_OneRole_0 = null;

        EObject this_MultipleRole_1 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:239:2: ( (this_OneRole_0= ruleOneRole | this_MultipleRole_1= ruleMultipleRole ) )
            // InternalGlobalJade.g:240:2: (this_OneRole_0= ruleOneRole | this_MultipleRole_1= ruleMultipleRole )
            {
            // InternalGlobalJade.g:240:2: (this_OneRole_0= ruleOneRole | this_MultipleRole_1= ruleMultipleRole )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGlobalJade.g:241:3: this_OneRole_0= ruleOneRole
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getOneRoleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneRole_0=ruleOneRole();

                    state._fsp--;


                    			current = this_OneRole_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGlobalJade.g:250:3: this_MultipleRole_1= ruleMultipleRole
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getMultipleRoleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultipleRole_1=ruleMultipleRole();

                    state._fsp--;


                    			current = this_MultipleRole_1;
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


    // $ANTLR start "entryRuleOneRole"
    // InternalGlobalJade.g:262:1: entryRuleOneRole returns [EObject current=null] : iv_ruleOneRole= ruleOneRole EOF ;
    public final EObject entryRuleOneRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneRole = null;


        try {
            // InternalGlobalJade.g:262:48: (iv_ruleOneRole= ruleOneRole EOF )
            // InternalGlobalJade.g:263:2: iv_ruleOneRole= ruleOneRole EOF
            {
             newCompositeNode(grammarAccess.getOneRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneRole=ruleOneRole();

            state._fsp--;

             current =iv_ruleOneRole; 
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
    // $ANTLR end "entryRuleOneRole"


    // $ANTLR start "ruleOneRole"
    // InternalGlobalJade.g:269:1: ruleOneRole returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_NAME ) ) ) ;
    public final EObject ruleOneRole() throws RecognitionException {
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
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOneRoleAccess().getRoleKeyword_0());
            		
            // InternalGlobalJade.g:281:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGlobalJade.g:282:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGlobalJade.g:282:4: (lv_name_1_0= RULE_NAME )
            // InternalGlobalJade.g:283:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOneRoleAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOneRoleRule());
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
    // $ANTLR end "ruleOneRole"


    // $ANTLR start "entryRuleMultipleRole"
    // InternalGlobalJade.g:303:1: entryRuleMultipleRole returns [EObject current=null] : iv_ruleMultipleRole= ruleMultipleRole EOF ;
    public final EObject entryRuleMultipleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleRole = null;


        try {
            // InternalGlobalJade.g:303:53: (iv_ruleMultipleRole= ruleMultipleRole EOF )
            // InternalGlobalJade.g:304:2: iv_ruleMultipleRole= ruleMultipleRole EOF
            {
             newCompositeNode(grammarAccess.getMultipleRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleRole=ruleMultipleRole();

            state._fsp--;

             current =iv_ruleMultipleRole; 
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
    // $ANTLR end "entryRuleMultipleRole"


    // $ANTLR start "ruleMultipleRole"
    // InternalGlobalJade.g:310:1: ruleMultipleRole returns [EObject current=null] : (otherlv_0= 'multrole' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (otherlv_3= RULE_NAME ) ) ) ;
    public final EObject ruleMultipleRole() throws RecognitionException {
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
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleRoleAccess().getMultroleKeyword_0());
            		
            // InternalGlobalJade.g:322:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGlobalJade.g:323:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGlobalJade.g:323:4: (lv_name_1_0= RULE_NAME )
            // InternalGlobalJade.g:324:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMultipleRoleAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleRoleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleRoleAccess().getColonKeyword_2());
            		
            // InternalGlobalJade.g:344:3: ( (otherlv_3= RULE_NAME ) )
            // InternalGlobalJade.g:345:4: (otherlv_3= RULE_NAME )
            {
            // InternalGlobalJade.g:345:4: (otherlv_3= RULE_NAME )
            // InternalGlobalJade.g:346:5: otherlv_3= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleRoleRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getMultipleRoleAccess().getRefOneRoleCrossReference_3_0());
            				

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
    // $ANTLR end "ruleMultipleRole"


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
    // InternalGlobalJade.g:368:1: ruleProtocol returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) ) )* ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_1_3 = null;

        EObject lv_actions_1_4 = null;

        EObject lv_actions_1_5 = null;

        EObject lv_actions_1_6 = null;

        EObject lv_actions_1_7 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:374:2: ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) ) )* ) )
            // InternalGlobalJade.g:375:2: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) ) )* )
            {
            // InternalGlobalJade.g:375:2: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) ) )* )
            // InternalGlobalJade.g:376:3: () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) ) )*
            {
            // InternalGlobalJade.g:376:3: ()
            // InternalGlobalJade.g:377:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolAccess().getProtocolAction_0(),
            					current);
            			

            }

            // InternalGlobalJade.g:383:3: ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TYPE_MESSAGE||(LA4_0>=24 && LA4_0<=27)||LA4_0==30||LA4_0==34) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGlobalJade.g:384:4: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) )
            	    {
            	    // InternalGlobalJade.g:384:4: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) )
            	    // InternalGlobalJade.g:385:5: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion )
            	    {
            	    // InternalGlobalJade.g:385:5: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion )
            	    int alt3=7;
            	    switch ( input.LA(1) ) {
            	    case RULE_TYPE_MESSAGE:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt3=5;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt3=6;
            	        }
            	        break;
            	    case 26:
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
            	            // InternalGlobalJade.g:402:6: lv_actions_1_2= ruleChoice_rule
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsChoice_ruleParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_1_2=ruleChoice_rule();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_2,
            	            							"org.xtext.globaltype.globaljade.GlobalJade.Choice_rule");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalGlobalJade.g:418:6: lv_actions_1_3= ruleFor_loop
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsFor_loopParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_1_3=ruleFor_loop();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_3,
            	            							"org.xtext.globaltype.globaljade.GlobalJade.For_loop");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalGlobalJade.g:434:6: lv_actions_1_4= ruleEnd_message
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsEnd_messageParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_1_4=ruleEnd_message();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_4,
            	            							"org.xtext.globaltype.globaljade.GlobalJade.End_message");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalGlobalJade.g:450:6: lv_actions_1_5= ruleRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsRecursionParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_1_5=ruleRecursion();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_5,
            	            							"org.xtext.globaltype.globaljade.GlobalJade.Recursion");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 6 :
            	            // InternalGlobalJade.g:466:6: lv_actions_1_6= ruleEnd_Recursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsEnd_RecursionParserRuleCall_1_0_5());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_1_6=ruleEnd_Recursion();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_6,
            	            							"org.xtext.globaltype.globaljade.GlobalJade.End_Recursion");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 7 :
            	            // InternalGlobalJade.g:482:6: lv_actions_1_7= ruleContinue_Recursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsContinue_RecursionParserRuleCall_1_0_6());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_1_7=ruleContinue_Recursion();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_1_7,
            	            							"org.xtext.globaltype.globaljade.GlobalJade.Continue_Recursion");
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
    // InternalGlobalJade.g:504:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // InternalGlobalJade.g:504:50: (iv_ruleRecursion= ruleRecursion EOF )
            // InternalGlobalJade.g:505:2: iv_ruleRecursion= ruleRecursion EOF
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
    // InternalGlobalJade.g:511:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ) ;
    public final EObject ruleRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:517:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ) )
            // InternalGlobalJade.g:518:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' )
            {
            // InternalGlobalJade.g:518:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' )
            // InternalGlobalJade.g:519:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
            		
            // InternalGlobalJade.g:523:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGlobalJade.g:524:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGlobalJade.g:524:4: (lv_name_1_0= RULE_NAME )
            // InternalGlobalJade.g:525:5: lv_name_1_0= RULE_NAME
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

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEnd_Recursion"
    // InternalGlobalJade.g:549:1: entryRuleEnd_Recursion returns [EObject current=null] : iv_ruleEnd_Recursion= ruleEnd_Recursion EOF ;
    public final EObject entryRuleEnd_Recursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd_Recursion = null;


        try {
            // InternalGlobalJade.g:549:54: (iv_ruleEnd_Recursion= ruleEnd_Recursion EOF )
            // InternalGlobalJade.g:550:2: iv_ruleEnd_Recursion= ruleEnd_Recursion EOF
            {
             newCompositeNode(grammarAccess.getEnd_RecursionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd_Recursion=ruleEnd_Recursion();

            state._fsp--;

             current =iv_ruleEnd_Recursion; 
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
    // $ANTLR end "entryRuleEnd_Recursion"


    // $ANTLR start "ruleEnd_Recursion"
    // InternalGlobalJade.g:556:1: ruleEnd_Recursion returns [EObject current=null] : (otherlv_0= 'stop' ( (lv_name_1_0= RULE_NAME ) ) ) ;
    public final EObject ruleEnd_Recursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:562:2: ( (otherlv_0= 'stop' ( (lv_name_1_0= RULE_NAME ) ) ) )
            // InternalGlobalJade.g:563:2: (otherlv_0= 'stop' ( (lv_name_1_0= RULE_NAME ) ) )
            {
            // InternalGlobalJade.g:563:2: (otherlv_0= 'stop' ( (lv_name_1_0= RULE_NAME ) ) )
            // InternalGlobalJade.g:564:3: otherlv_0= 'stop' ( (lv_name_1_0= RULE_NAME ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnd_RecursionAccess().getStopKeyword_0());
            		
            // InternalGlobalJade.g:568:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGlobalJade.g:569:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGlobalJade.g:569:4: (lv_name_1_0= RULE_NAME )
            // InternalGlobalJade.g:570:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnd_RecursionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnd_RecursionRule());
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
    // $ANTLR end "ruleEnd_Recursion"


    // $ANTLR start "entryRuleContinue_Recursion"
    // InternalGlobalJade.g:590:1: entryRuleContinue_Recursion returns [EObject current=null] : iv_ruleContinue_Recursion= ruleContinue_Recursion EOF ;
    public final EObject entryRuleContinue_Recursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinue_Recursion = null;


        try {
            // InternalGlobalJade.g:590:59: (iv_ruleContinue_Recursion= ruleContinue_Recursion EOF )
            // InternalGlobalJade.g:591:2: iv_ruleContinue_Recursion= ruleContinue_Recursion EOF
            {
             newCompositeNode(grammarAccess.getContinue_RecursionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContinue_Recursion=ruleContinue_Recursion();

            state._fsp--;

             current =iv_ruleContinue_Recursion; 
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
    // $ANTLR end "entryRuleContinue_Recursion"


    // $ANTLR start "ruleContinue_Recursion"
    // InternalGlobalJade.g:597:1: ruleContinue_Recursion returns [EObject current=null] : (otherlv_0= 'continue' ( (lv_name_1_0= RULE_NAME ) ) ) ;
    public final EObject ruleContinue_Recursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:603:2: ( (otherlv_0= 'continue' ( (lv_name_1_0= RULE_NAME ) ) ) )
            // InternalGlobalJade.g:604:2: (otherlv_0= 'continue' ( (lv_name_1_0= RULE_NAME ) ) )
            {
            // InternalGlobalJade.g:604:2: (otherlv_0= 'continue' ( (lv_name_1_0= RULE_NAME ) ) )
            // InternalGlobalJade.g:605:3: otherlv_0= 'continue' ( (lv_name_1_0= RULE_NAME ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContinue_RecursionAccess().getContinueKeyword_0());
            		
            // InternalGlobalJade.g:609:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGlobalJade.g:610:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGlobalJade.g:610:4: (lv_name_1_0= RULE_NAME )
            // InternalGlobalJade.g:611:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContinue_RecursionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContinue_RecursionRule());
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
    // $ANTLR end "ruleContinue_Recursion"


    // $ANTLR start "entryRuleChoice_rule"
    // InternalGlobalJade.g:631:1: entryRuleChoice_rule returns [EObject current=null] : iv_ruleChoice_rule= ruleChoice_rule EOF ;
    public final EObject entryRuleChoice_rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice_rule = null;


        try {
            // InternalGlobalJade.g:631:52: (iv_ruleChoice_rule= ruleChoice_rule EOF )
            // InternalGlobalJade.g:632:2: iv_ruleChoice_rule= ruleChoice_rule EOF
            {
             newCompositeNode(grammarAccess.getChoice_ruleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoice_rule=ruleChoice_rule();

            state._fsp--;

             current =iv_ruleChoice_rule; 
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
    // $ANTLR end "entryRuleChoice_rule"


    // $ANTLR start "ruleChoice_rule"
    // InternalGlobalJade.g:638:1: ruleChoice_rule returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_name_2_0= RULE_NAME ) ) otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )* ) ;
    public final EObject ruleChoice_rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_role_name_2_0=null;
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
            // InternalGlobalJade.g:644:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_name_2_0= RULE_NAME ) ) otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )* ) )
            // InternalGlobalJade.g:645:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_name_2_0= RULE_NAME ) ) otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )* )
            {
            // InternalGlobalJade.g:645:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_name_2_0= RULE_NAME ) ) otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )* )
            // InternalGlobalJade.g:646:3: otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_name_2_0= RULE_NAME ) ) otherlv_3= '{' ( (lv_messages_4_0= ruleMessage ) ) ( (lv_branch_5_0= ruleProtocol ) ) otherlv_6= '}' (otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getChoice_ruleAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoice_ruleAccess().getAtKeyword_1());
            		
            // InternalGlobalJade.g:654:3: ( (lv_role_name_2_0= RULE_NAME ) )
            // InternalGlobalJade.g:655:4: (lv_role_name_2_0= RULE_NAME )
            {
            // InternalGlobalJade.g:655:4: (lv_role_name_2_0= RULE_NAME )
            // InternalGlobalJade.g:656:5: lv_role_name_2_0= RULE_NAME
            {
            lv_role_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_8); 

            					newLeafNode(lv_role_name_2_0, grammarAccess.getChoice_ruleAccess().getRole_nameNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoice_ruleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"role_name",
            						lv_role_name_2_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getChoice_ruleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGlobalJade.g:676:3: ( (lv_messages_4_0= ruleMessage ) )
            // InternalGlobalJade.g:677:4: (lv_messages_4_0= ruleMessage )
            {
            // InternalGlobalJade.g:677:4: (lv_messages_4_0= ruleMessage )
            // InternalGlobalJade.g:678:5: lv_messages_4_0= ruleMessage
            {

            					newCompositeNode(grammarAccess.getChoice_ruleAccess().getMessagesMessageParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_messages_4_0=ruleMessage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoice_ruleRule());
            					}
            					add(
            						current,
            						"messages",
            						lv_messages_4_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Message");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGlobalJade.g:695:3: ( (lv_branch_5_0= ruleProtocol ) )
            // InternalGlobalJade.g:696:4: (lv_branch_5_0= ruleProtocol )
            {
            // InternalGlobalJade.g:696:4: (lv_branch_5_0= ruleProtocol )
            // InternalGlobalJade.g:697:5: lv_branch_5_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getChoice_ruleAccess().getBranchProtocolParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_branch_5_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoice_ruleRule());
            					}
            					add(
            						current,
            						"branch",
            						lv_branch_5_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getChoice_ruleAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalGlobalJade.g:718:3: (otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGlobalJade.g:719:4: otherlv_7= 'or' otherlv_8= '{' ( (lv_messages_9_0= ruleMessage ) ) ( (lv_branch_10_0= ruleProtocol ) ) otherlv_11= '}'
            	    {
            	    otherlv_7=(Token)match(input,29,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoice_ruleAccess().getOrKeyword_7_0());
            	    			
            	    otherlv_8=(Token)match(input,18,FOLLOW_15); 

            	    				newLeafNode(otherlv_8, grammarAccess.getChoice_ruleAccess().getLeftCurlyBracketKeyword_7_1());
            	    			
            	    // InternalGlobalJade.g:727:4: ( (lv_messages_9_0= ruleMessage ) )
            	    // InternalGlobalJade.g:728:5: (lv_messages_9_0= ruleMessage )
            	    {
            	    // InternalGlobalJade.g:728:5: (lv_messages_9_0= ruleMessage )
            	    // InternalGlobalJade.g:729:6: lv_messages_9_0= ruleMessage
            	    {

            	    						newCompositeNode(grammarAccess.getChoice_ruleAccess().getMessagesMessageParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_messages_9_0=ruleMessage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoice_ruleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"messages",
            	    							lv_messages_9_0,
            	    							"org.xtext.globaltype.globaljade.GlobalJade.Message");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalGlobalJade.g:746:4: ( (lv_branch_10_0= ruleProtocol ) )
            	    // InternalGlobalJade.g:747:5: (lv_branch_10_0= ruleProtocol )
            	    {
            	    // InternalGlobalJade.g:747:5: (lv_branch_10_0= ruleProtocol )
            	    // InternalGlobalJade.g:748:6: lv_branch_10_0= ruleProtocol
            	    {

            	    						newCompositeNode(grammarAccess.getChoice_ruleAccess().getBranchProtocolParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_branch_10_0=ruleProtocol();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoice_ruleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branch",
            	    							lv_branch_10_0,
            	    							"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_16); 

            	    				newLeafNode(otherlv_11, grammarAccess.getChoice_ruleAccess().getRightCurlyBracketKeyword_7_4());
            	    			

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
    // $ANTLR end "ruleChoice_rule"


    // $ANTLR start "entryRuleFor_loop"
    // InternalGlobalJade.g:774:1: entryRuleFor_loop returns [EObject current=null] : iv_ruleFor_loop= ruleFor_loop EOF ;
    public final EObject entryRuleFor_loop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor_loop = null;


        try {
            // InternalGlobalJade.g:774:49: (iv_ruleFor_loop= ruleFor_loop EOF )
            // InternalGlobalJade.g:775:2: iv_ruleFor_loop= ruleFor_loop EOF
            {
             newCompositeNode(grammarAccess.getFor_loopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFor_loop=ruleFor_loop();

            state._fsp--;

             current =iv_ruleFor_loop; 
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
    // $ANTLR end "entryRuleFor_loop"


    // $ANTLR start "ruleFor_loop"
    // InternalGlobalJade.g:781:1: ruleFor_loop returns [EObject current=null] : (otherlv_0= 'forall' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= 'in' ( (lv_roleTarget_3_0= RULE_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_branch_6_0= ruleProtocol ) ) otherlv_7= '}' ) ;
    public final EObject ruleFor_loop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_roleTarget_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_branch_6_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:787:2: ( (otherlv_0= 'forall' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= 'in' ( (lv_roleTarget_3_0= RULE_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_branch_6_0= ruleProtocol ) ) otherlv_7= '}' ) )
            // InternalGlobalJade.g:788:2: (otherlv_0= 'forall' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= 'in' ( (lv_roleTarget_3_0= RULE_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_branch_6_0= ruleProtocol ) ) otherlv_7= '}' )
            {
            // InternalGlobalJade.g:788:2: (otherlv_0= 'forall' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= 'in' ( (lv_roleTarget_3_0= RULE_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_branch_6_0= ruleProtocol ) ) otherlv_7= '}' )
            // InternalGlobalJade.g:789:3: otherlv_0= 'forall' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= 'in' ( (lv_roleTarget_3_0= RULE_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_branch_6_0= ruleProtocol ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFor_loopAccess().getForallKeyword_0());
            		
            // InternalGlobalJade.g:793:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGlobalJade.g:794:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGlobalJade.g:794:4: (lv_name_1_0= RULE_NAME )
            // InternalGlobalJade.g:795:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFor_loopAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFor_loopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFor_loopAccess().getInKeyword_2());
            		
            // InternalGlobalJade.g:815:3: ( (lv_roleTarget_3_0= RULE_NAME ) )
            // InternalGlobalJade.g:816:4: (lv_roleTarget_3_0= RULE_NAME )
            {
            // InternalGlobalJade.g:816:4: (lv_roleTarget_3_0= RULE_NAME )
            // InternalGlobalJade.g:817:5: lv_roleTarget_3_0= RULE_NAME
            {
            lv_roleTarget_3_0=(Token)match(input,RULE_NAME,FOLLOW_18); 

            					newLeafNode(lv_roleTarget_3_0, grammarAccess.getFor_loopAccess().getRoleTargetNAMETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFor_loopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"roleTarget",
            						lv_roleTarget_3_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getFor_loopAccess().getDoKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getFor_loopAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGlobalJade.g:841:3: ( (lv_branch_6_0= ruleProtocol ) )
            // InternalGlobalJade.g:842:4: (lv_branch_6_0= ruleProtocol )
            {
            // InternalGlobalJade.g:842:4: (lv_branch_6_0= ruleProtocol )
            // InternalGlobalJade.g:843:5: lv_branch_6_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getFor_loopAccess().getBranchProtocolParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_branch_6_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_loopRule());
            					}
            					add(
            						current,
            						"branch",
            						lv_branch_6_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFor_loopAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFor_loop"


    // $ANTLR start "entryRuleEnd_message"
    // InternalGlobalJade.g:868:1: entryRuleEnd_message returns [EObject current=null] : iv_ruleEnd_message= ruleEnd_message EOF ;
    public final EObject entryRuleEnd_message() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd_message = null;


        try {
            // InternalGlobalJade.g:868:52: (iv_ruleEnd_message= ruleEnd_message EOF )
            // InternalGlobalJade.g:869:2: iv_ruleEnd_message= ruleEnd_message EOF
            {
             newCompositeNode(grammarAccess.getEnd_messageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd_message=ruleEnd_message();

            state._fsp--;

             current =iv_ruleEnd_message; 
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
    // $ANTLR end "entryRuleEnd_message"


    // $ANTLR start "ruleEnd_message"
    // InternalGlobalJade.g:875:1: ruleEnd_message returns [EObject current=null] : ( ( (lv_end_0_0= ruleEND_MEX ) ) otherlv_1= ';' ) ;
    public final EObject ruleEnd_message() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_end_0_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:881:2: ( ( ( (lv_end_0_0= ruleEND_MEX ) ) otherlv_1= ';' ) )
            // InternalGlobalJade.g:882:2: ( ( (lv_end_0_0= ruleEND_MEX ) ) otherlv_1= ';' )
            {
            // InternalGlobalJade.g:882:2: ( ( (lv_end_0_0= ruleEND_MEX ) ) otherlv_1= ';' )
            // InternalGlobalJade.g:883:3: ( (lv_end_0_0= ruleEND_MEX ) ) otherlv_1= ';'
            {
            // InternalGlobalJade.g:883:3: ( (lv_end_0_0= ruleEND_MEX ) )
            // InternalGlobalJade.g:884:4: (lv_end_0_0= ruleEND_MEX )
            {
            // InternalGlobalJade.g:884:4: (lv_end_0_0= ruleEND_MEX )
            // InternalGlobalJade.g:885:5: lv_end_0_0= ruleEND_MEX
            {

            					newCompositeNode(grammarAccess.getEnd_messageAccess().getEndEND_MEXParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_end_0_0=ruleEND_MEX();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnd_messageRule());
            					}
            					add(
            						current,
            						"end",
            						lv_end_0_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.END_MEX");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEnd_messageAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleEnd_message"


    // $ANTLR start "entryRuleEND_MEX"
    // InternalGlobalJade.g:910:1: entryRuleEND_MEX returns [String current=null] : iv_ruleEND_MEX= ruleEND_MEX EOF ;
    public final String entryRuleEND_MEX() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEND_MEX = null;


        try {
            // InternalGlobalJade.g:910:47: (iv_ruleEND_MEX= ruleEND_MEX EOF )
            // InternalGlobalJade.g:911:2: iv_ruleEND_MEX= ruleEND_MEX EOF
            {
             newCompositeNode(grammarAccess.getEND_MEXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEND_MEX=ruleEND_MEX();

            state._fsp--;

             current =iv_ruleEND_MEX.getText(); 
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
    // $ANTLR end "entryRuleEND_MEX"


    // $ANTLR start "ruleEND_MEX"
    // InternalGlobalJade.g:917:1: ruleEND_MEX returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'end' ;
    public final AntlrDatatypeRuleToken ruleEND_MEX() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:923:2: (kw= 'end' )
            // InternalGlobalJade.g:924:2: kw= 'end'
            {
            kw=(Token)match(input,34,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEND_MEXAccess().getEndKeyword());
            	

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
    // $ANTLR end "ruleEND_MEX"


    // $ANTLR start "entryRuleMessage"
    // InternalGlobalJade.g:932:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalGlobalJade.g:932:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalGlobalJade.g:933:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalGlobalJade.g:939:1: ruleMessage returns [EObject current=null] : ( ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' ( (lv_content_2_0= RULE_CONTENT ) ) (otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) ) )* otherlv_5= ')' otherlv_6= 'from' ( (lv_sender_7_0= RULE_NAME ) ) otherlv_8= 'to' ( (lv_receiver_9_0= RULE_NAME ) ) otherlv_10= ';' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token lv_content_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_sender_7_0=null;
        Token otherlv_8=null;
        Token lv_receiver_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:945:2: ( ( ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' ( (lv_content_2_0= RULE_CONTENT ) ) (otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) ) )* otherlv_5= ')' otherlv_6= 'from' ( (lv_sender_7_0= RULE_NAME ) ) otherlv_8= 'to' ( (lv_receiver_9_0= RULE_NAME ) ) otherlv_10= ';' ) )
            // InternalGlobalJade.g:946:2: ( ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' ( (lv_content_2_0= RULE_CONTENT ) ) (otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) ) )* otherlv_5= ')' otherlv_6= 'from' ( (lv_sender_7_0= RULE_NAME ) ) otherlv_8= 'to' ( (lv_receiver_9_0= RULE_NAME ) ) otherlv_10= ';' )
            {
            // InternalGlobalJade.g:946:2: ( ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' ( (lv_content_2_0= RULE_CONTENT ) ) (otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) ) )* otherlv_5= ')' otherlv_6= 'from' ( (lv_sender_7_0= RULE_NAME ) ) otherlv_8= 'to' ( (lv_receiver_9_0= RULE_NAME ) ) otherlv_10= ';' )
            // InternalGlobalJade.g:947:3: ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' ( (lv_content_2_0= RULE_CONTENT ) ) (otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) ) )* otherlv_5= ')' otherlv_6= 'from' ( (lv_sender_7_0= RULE_NAME ) ) otherlv_8= 'to' ( (lv_receiver_9_0= RULE_NAME ) ) otherlv_10= ';'
            {
            // InternalGlobalJade.g:947:3: ( (lv_type_0_0= RULE_TYPE_MESSAGE ) )
            // InternalGlobalJade.g:948:4: (lv_type_0_0= RULE_TYPE_MESSAGE )
            {
            // InternalGlobalJade.g:948:4: (lv_type_0_0= RULE_TYPE_MESSAGE )
            // InternalGlobalJade.g:949:5: lv_type_0_0= RULE_TYPE_MESSAGE
            {
            lv_type_0_0=(Token)match(input,RULE_TYPE_MESSAGE,FOLLOW_5); 

            					newLeafNode(lv_type_0_0, grammarAccess.getMessageAccess().getTypeTYPE_MESSAGETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.TYPE_MESSAGE");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGlobalJade.g:969:3: ( (lv_content_2_0= RULE_CONTENT ) )
            // InternalGlobalJade.g:970:4: (lv_content_2_0= RULE_CONTENT )
            {
            // InternalGlobalJade.g:970:4: (lv_content_2_0= RULE_CONTENT )
            // InternalGlobalJade.g:971:5: lv_content_2_0= RULE_CONTENT
            {
            lv_content_2_0=(Token)match(input,RULE_CONTENT,FOLLOW_21); 

            					newLeafNode(lv_content_2_0, grammarAccess.getMessageAccess().getContentCONTENTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					addWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.CONTENT");
            				

            }


            }

            // InternalGlobalJade.g:987:3: (otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGlobalJade.g:988:4: otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalGlobalJade.g:992:4: ( (lv_content_4_0= RULE_CONTENT ) )
            	    // InternalGlobalJade.g:993:5: (lv_content_4_0= RULE_CONTENT )
            	    {
            	    // InternalGlobalJade.g:993:5: (lv_content_4_0= RULE_CONTENT )
            	    // InternalGlobalJade.g:994:6: lv_content_4_0= RULE_CONTENT
            	    {
            	    lv_content_4_0=(Token)match(input,RULE_CONTENT,FOLLOW_21); 

            	    						newLeafNode(lv_content_4_0, grammarAccess.getMessageAccess().getContentCONTENTTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMessageRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"content",
            	    							lv_content_4_0,
            	    							"org.xtext.globaltype.globaljade.GlobalJade.CONTENT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getFromKeyword_5());
            		
            // InternalGlobalJade.g:1019:3: ( (lv_sender_7_0= RULE_NAME ) )
            // InternalGlobalJade.g:1020:4: (lv_sender_7_0= RULE_NAME )
            {
            // InternalGlobalJade.g:1020:4: (lv_sender_7_0= RULE_NAME )
            // InternalGlobalJade.g:1021:5: lv_sender_7_0= RULE_NAME
            {
            lv_sender_7_0=(Token)match(input,RULE_NAME,FOLLOW_23); 

            					newLeafNode(lv_sender_7_0, grammarAccess.getMessageAccess().getSenderNAMETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sender",
            						lv_sender_7_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_8=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getToKeyword_7());
            		
            // InternalGlobalJade.g:1041:3: ( (lv_receiver_9_0= RULE_NAME ) )
            // InternalGlobalJade.g:1042:4: (lv_receiver_9_0= RULE_NAME )
            {
            // InternalGlobalJade.g:1042:4: (lv_receiver_9_0= RULE_NAME )
            // InternalGlobalJade.g:1043:5: lv_receiver_9_0= RULE_NAME
            {
            lv_receiver_9_0=(Token)match(input,RULE_NAME,FOLLOW_19); 

            					newLeafNode(lv_receiver_9_0, grammarAccess.getMessageAccess().getReceiverNAMETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"receiver",
            						lv_receiver_9_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
            				

            }


            }

            otherlv_10=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMessageAccess().getSemicolonKeyword_9());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000044F080020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000044F000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});

}