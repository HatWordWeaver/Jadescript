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
    // InternalGlobalJade.g:71:1: ruleModel returns [EObject current=null] : ( (lv_protocols_0_0= ruleProtocols ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_protocols_0_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:77:2: ( ( (lv_protocols_0_0= ruleProtocols ) )* )
            // InternalGlobalJade.g:78:2: ( (lv_protocols_0_0= ruleProtocols ) )*
            {
            // InternalGlobalJade.g:78:2: ( (lv_protocols_0_0= ruleProtocols ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGlobalJade.g:79:3: (lv_protocols_0_0= ruleProtocols )
            	    {
            	    // InternalGlobalJade.g:79:3: (lv_protocols_0_0= ruleProtocols )
            	    // InternalGlobalJade.g:80:4: lv_protocols_0_0= ruleProtocols
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getProtocolsProtocolsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_protocols_0_0=ruleProtocols();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"protocols",
            	    					lv_protocols_0_0,
            	    					"org.xtext.globaltype.globaljade.GlobalJade.Protocols");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleProtocols"
    // InternalGlobalJade.g:100:1: entryRuleProtocols returns [EObject current=null] : iv_ruleProtocols= ruleProtocols EOF ;
    public final EObject entryRuleProtocols() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocols = null;


        try {
            // InternalGlobalJade.g:100:50: (iv_ruleProtocols= ruleProtocols EOF )
            // InternalGlobalJade.g:101:2: iv_ruleProtocols= ruleProtocols EOF
            {
             newCompositeNode(grammarAccess.getProtocolsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtocols=ruleProtocols();

            state._fsp--;

             current =iv_ruleProtocols; 
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
    // $ANTLR end "entryRuleProtocols"


    // $ANTLR start "ruleProtocols"
    // InternalGlobalJade.g:107:1: ruleProtocols returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) )+ otherlv_5= ')' ) ;
    public final EObject ruleProtocols() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_roles_4_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:113:2: ( (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) )+ otherlv_5= ')' ) )
            // InternalGlobalJade.g:114:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) )+ otherlv_5= ')' )
            {
            // InternalGlobalJade.g:114:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) )+ otherlv_5= ')' )
            // InternalGlobalJade.g:115:3: otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocolsAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getProtocolsAccess().getProtocolKeyword_1());
            		
            // InternalGlobalJade.g:123:3: ( (lv_name_2_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:124:4: (lv_name_2_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:124:4: (lv_name_2_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:125:5: lv_name_2_0= RULE_GENERAL_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProtocolsAccess().getNameGENERAL_NAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtocolsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.GENERAL_NAME");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getProtocolsAccess().getLeftParenthesisKeyword_3());
            		
            // InternalGlobalJade.g:145:3: ( (lv_roles_4_0= ruleRole ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGlobalJade.g:146:4: (lv_roles_4_0= ruleRole )
            	    {
            	    // InternalGlobalJade.g:146:4: (lv_roles_4_0= ruleRole )
            	    // InternalGlobalJade.g:147:5: lv_roles_4_0= ruleRole
            	    {

            	    					newCompositeNode(grammarAccess.getProtocolsAccess().getRolesRoleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_roles_4_0=ruleRole();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProtocolsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"roles",
            	    						lv_roles_4_0,
            	    						"org.xtext.globaltype.globaljade.GlobalJade.Role");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProtocolsAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleProtocols"


    // $ANTLR start "entryRuleRole"
    // InternalGlobalJade.g:172:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalGlobalJade.g:172:45: (iv_ruleRole= ruleRole EOF )
            // InternalGlobalJade.g:173:2: iv_ruleRole= ruleRole EOF
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
    // InternalGlobalJade.g:179:1: ruleRole returns [EObject current=null] : (otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_role_1_0=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:185:2: ( (otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) ) ) )
            // InternalGlobalJade.g:186:2: (otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) ) )
            {
            // InternalGlobalJade.g:186:2: (otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) ) )
            // InternalGlobalJade.g:187:3: otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalGlobalJade.g:191:3: ( (lv_role_1_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:192:4: (lv_role_1_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:192:4: (lv_role_1_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:193:5: lv_role_1_0= RULE_GENERAL_NAME
            {
            lv_role_1_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_2); 

            					newLeafNode(lv_role_1_0, grammarAccess.getRoleAccess().getRoleGENERAL_NAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"role",
            						lv_role_1_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.GENERAL_NAME");
            				

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
    // $ANTLR end "ruleRole"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});

}