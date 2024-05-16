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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_GENERAL_NAME", "RULE_TYPE_MESSAGE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "','", "')'", "'{'", "'}'", "'forall'", "'in'", "'do'", "'from'", "'to'", "';'", "'role'"
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

                if ( (LA1_0==13) ) {
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
    // InternalGlobalJade.g:107:1: ruleProtocols returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ')' otherlv_8= '{' ( ( (lv_globals_9_0= ruleGlobal_message ) ) | ( (lv_forLoop_10_0= ruleFor_loop ) ) )+ otherlv_11= '}' ) ;
    public final EObject ruleProtocols() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_roles_4_0 = null;

        EObject lv_roles_6_0 = null;

        EObject lv_globals_9_0 = null;

        EObject lv_forLoop_10_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:113:2: ( (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ')' otherlv_8= '{' ( ( (lv_globals_9_0= ruleGlobal_message ) ) | ( (lv_forLoop_10_0= ruleFor_loop ) ) )+ otherlv_11= '}' ) )
            // InternalGlobalJade.g:114:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ')' otherlv_8= '{' ( ( (lv_globals_9_0= ruleGlobal_message ) ) | ( (lv_forLoop_10_0= ruleFor_loop ) ) )+ otherlv_11= '}' )
            {
            // InternalGlobalJade.g:114:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ')' otherlv_8= '{' ( ( (lv_globals_9_0= ruleGlobal_message ) ) | ( (lv_forLoop_10_0= ruleFor_loop ) ) )+ otherlv_11= '}' )
            // InternalGlobalJade.g:115:3: otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ')' otherlv_8= '{' ( ( (lv_globals_9_0= ruleGlobal_message ) ) | ( (lv_forLoop_10_0= ruleFor_loop ) ) )+ otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocolsAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getProtocolsAccess().getLeftParenthesisKeyword_3());
            		
            // InternalGlobalJade.g:145:3: ( (lv_roles_4_0= ruleRole ) )
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

            // InternalGlobalJade.g:164:3: (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGlobalJade.g:165:4: otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_5, grammarAccess.getProtocolsAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalGlobalJade.g:169:4: ( (lv_roles_6_0= ruleRole ) )
            	    // InternalGlobalJade.g:170:5: (lv_roles_6_0= ruleRole )
            	    {
            	    // InternalGlobalJade.g:170:5: (lv_roles_6_0= ruleRole )
            	    // InternalGlobalJade.g:171:6: lv_roles_6_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getProtocolsAccess().getRolesRoleParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_roles_6_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProtocolsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_6_0,
            	    							"org.xtext.globaltype.globaljade.GlobalJade.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getProtocolsAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getProtocolsAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalGlobalJade.g:197:3: ( ( (lv_globals_9_0= ruleGlobal_message ) ) | ( (lv_forLoop_10_0= ruleFor_loop ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_TYPE_MESSAGE) ) {
                    alt3=1;
                }
                else if ( (LA3_0==20) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGlobalJade.g:198:4: ( (lv_globals_9_0= ruleGlobal_message ) )
            	    {
            	    // InternalGlobalJade.g:198:4: ( (lv_globals_9_0= ruleGlobal_message ) )
            	    // InternalGlobalJade.g:199:5: (lv_globals_9_0= ruleGlobal_message )
            	    {
            	    // InternalGlobalJade.g:199:5: (lv_globals_9_0= ruleGlobal_message )
            	    // InternalGlobalJade.g:200:6: lv_globals_9_0= ruleGlobal_message
            	    {

            	    						newCompositeNode(grammarAccess.getProtocolsAccess().getGlobalsGlobal_messageParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_globals_9_0=ruleGlobal_message();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProtocolsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"globals",
            	    							lv_globals_9_0,
            	    							"org.xtext.globaltype.globaljade.GlobalJade.Global_message");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGlobalJade.g:218:4: ( (lv_forLoop_10_0= ruleFor_loop ) )
            	    {
            	    // InternalGlobalJade.g:218:4: ( (lv_forLoop_10_0= ruleFor_loop ) )
            	    // InternalGlobalJade.g:219:5: (lv_forLoop_10_0= ruleFor_loop )
            	    {
            	    // InternalGlobalJade.g:219:5: (lv_forLoop_10_0= ruleFor_loop )
            	    // InternalGlobalJade.g:220:6: lv_forLoop_10_0= ruleFor_loop
            	    {

            	    						newCompositeNode(grammarAccess.getProtocolsAccess().getForLoopFor_loopParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_forLoop_10_0=ruleFor_loop();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProtocolsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"forLoop",
            	    							lv_forLoop_10_0,
            	    							"org.xtext.globaltype.globaljade.GlobalJade.For_loop");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getProtocolsAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleFor_loop"
    // InternalGlobalJade.g:246:1: entryRuleFor_loop returns [EObject current=null] : iv_ruleFor_loop= ruleFor_loop EOF ;
    public final EObject entryRuleFor_loop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor_loop = null;


        try {
            // InternalGlobalJade.g:246:49: (iv_ruleFor_loop= ruleFor_loop EOF )
            // InternalGlobalJade.g:247:2: iv_ruleFor_loop= ruleFor_loop EOF
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
    // InternalGlobalJade.g:253:1: ruleFor_loop returns [EObject current=null] : (otherlv_0= 'forall' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= 'in' ( (lv_role_3_0= RULE_GENERAL_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_globals_6_0= ruleGlobal_message ) )* otherlv_7= '}' ) ;
    public final EObject ruleFor_loop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_role_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_globals_6_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:259:2: ( (otherlv_0= 'forall' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= 'in' ( (lv_role_3_0= RULE_GENERAL_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_globals_6_0= ruleGlobal_message ) )* otherlv_7= '}' ) )
            // InternalGlobalJade.g:260:2: (otherlv_0= 'forall' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= 'in' ( (lv_role_3_0= RULE_GENERAL_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_globals_6_0= ruleGlobal_message ) )* otherlv_7= '}' )
            {
            // InternalGlobalJade.g:260:2: (otherlv_0= 'forall' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= 'in' ( (lv_role_3_0= RULE_GENERAL_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_globals_6_0= ruleGlobal_message ) )* otherlv_7= '}' )
            // InternalGlobalJade.g:261:3: otherlv_0= 'forall' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= 'in' ( (lv_role_3_0= RULE_GENERAL_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_globals_6_0= ruleGlobal_message ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFor_loopAccess().getForallKeyword_0());
            		
            // InternalGlobalJade.g:265:3: ( (lv_name_1_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:266:4: (lv_name_1_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:266:4: (lv_name_1_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:267:5: lv_name_1_0= RULE_GENERAL_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFor_loopAccess().getNameGENERAL_NAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFor_loopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.GENERAL_NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFor_loopAccess().getInKeyword_2());
            		
            // InternalGlobalJade.g:287:3: ( (lv_role_3_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:288:4: (lv_role_3_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:288:4: (lv_role_3_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:289:5: lv_role_3_0= RULE_GENERAL_NAME
            {
            lv_role_3_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_13); 

            					newLeafNode(lv_role_3_0, grammarAccess.getFor_loopAccess().getRoleGENERAL_NAMETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFor_loopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"role",
            						lv_role_3_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.GENERAL_NAME");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getFor_loopAccess().getDoKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getFor_loopAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGlobalJade.g:313:3: ( (lv_globals_6_0= ruleGlobal_message ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TYPE_MESSAGE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGlobalJade.g:314:4: (lv_globals_6_0= ruleGlobal_message )
            	    {
            	    // InternalGlobalJade.g:314:4: (lv_globals_6_0= ruleGlobal_message )
            	    // InternalGlobalJade.g:315:5: lv_globals_6_0= ruleGlobal_message
            	    {

            	    					newCompositeNode(grammarAccess.getFor_loopAccess().getGlobalsGlobal_messageParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_globals_6_0=ruleGlobal_message();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFor_loopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"globals",
            	    						lv_globals_6_0,
            	    						"org.xtext.globaltype.globaljade.GlobalJade.Global_message");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

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


    // $ANTLR start "entryRuleGlobal_message"
    // InternalGlobalJade.g:340:1: entryRuleGlobal_message returns [EObject current=null] : iv_ruleGlobal_message= ruleGlobal_message EOF ;
    public final EObject entryRuleGlobal_message() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal_message = null;


        try {
            // InternalGlobalJade.g:340:55: (iv_ruleGlobal_message= ruleGlobal_message EOF )
            // InternalGlobalJade.g:341:2: iv_ruleGlobal_message= ruleGlobal_message EOF
            {
             newCompositeNode(grammarAccess.getGlobal_messageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobal_message=ruleGlobal_message();

            state._fsp--;

             current =iv_ruleGlobal_message; 
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
    // $ANTLR end "entryRuleGlobal_message"


    // $ANTLR start "ruleGlobal_message"
    // InternalGlobalJade.g:347:1: ruleGlobal_message returns [EObject current=null] : ( ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' otherlv_2= ')' otherlv_3= 'from' ( (lv_roleA_4_0= RULE_GENERAL_NAME ) ) otherlv_5= 'to' ( (lv_roleB_6_0= RULE_GENERAL_NAME ) ) otherlv_7= ';' ) ;
    public final EObject ruleGlobal_message() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_roleA_4_0=null;
        Token otherlv_5=null;
        Token lv_roleB_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:353:2: ( ( ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' otherlv_2= ')' otherlv_3= 'from' ( (lv_roleA_4_0= RULE_GENERAL_NAME ) ) otherlv_5= 'to' ( (lv_roleB_6_0= RULE_GENERAL_NAME ) ) otherlv_7= ';' ) )
            // InternalGlobalJade.g:354:2: ( ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' otherlv_2= ')' otherlv_3= 'from' ( (lv_roleA_4_0= RULE_GENERAL_NAME ) ) otherlv_5= 'to' ( (lv_roleB_6_0= RULE_GENERAL_NAME ) ) otherlv_7= ';' )
            {
            // InternalGlobalJade.g:354:2: ( ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' otherlv_2= ')' otherlv_3= 'from' ( (lv_roleA_4_0= RULE_GENERAL_NAME ) ) otherlv_5= 'to' ( (lv_roleB_6_0= RULE_GENERAL_NAME ) ) otherlv_7= ';' )
            // InternalGlobalJade.g:355:3: ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' otherlv_2= ')' otherlv_3= 'from' ( (lv_roleA_4_0= RULE_GENERAL_NAME ) ) otherlv_5= 'to' ( (lv_roleB_6_0= RULE_GENERAL_NAME ) ) otherlv_7= ';'
            {
            // InternalGlobalJade.g:355:3: ( (lv_type_0_0= RULE_TYPE_MESSAGE ) )
            // InternalGlobalJade.g:356:4: (lv_type_0_0= RULE_TYPE_MESSAGE )
            {
            // InternalGlobalJade.g:356:4: (lv_type_0_0= RULE_TYPE_MESSAGE )
            // InternalGlobalJade.g:357:5: lv_type_0_0= RULE_TYPE_MESSAGE
            {
            lv_type_0_0=(Token)match(input,RULE_TYPE_MESSAGE,FOLLOW_6); 

            					newLeafNode(lv_type_0_0, grammarAccess.getGlobal_messageAccess().getTypeTYPE_MESSAGETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobal_messageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.TYPE_MESSAGE");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobal_messageAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobal_messageAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobal_messageAccess().getFromKeyword_3());
            		
            // InternalGlobalJade.g:385:3: ( (lv_roleA_4_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:386:4: (lv_roleA_4_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:386:4: (lv_roleA_4_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:387:5: lv_roleA_4_0= RULE_GENERAL_NAME
            {
            lv_roleA_4_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_17); 

            					newLeafNode(lv_roleA_4_0, grammarAccess.getGlobal_messageAccess().getRoleAGENERAL_NAMETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobal_messageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"roleA",
            						lv_roleA_4_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.GENERAL_NAME");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getGlobal_messageAccess().getToKeyword_5());
            		
            // InternalGlobalJade.g:407:3: ( (lv_roleB_6_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:408:4: (lv_roleB_6_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:408:4: (lv_roleB_6_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:409:5: lv_roleB_6_0= RULE_GENERAL_NAME
            {
            lv_roleB_6_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_18); 

            					newLeafNode(lv_roleB_6_0, grammarAccess.getGlobal_messageAccess().getRoleBGENERAL_NAMETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobal_messageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"roleB",
            						lv_roleB_6_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.GENERAL_NAME");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGlobal_messageAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleGlobal_message"


    // $ANTLR start "entryRuleRole"
    // InternalGlobalJade.g:433:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalGlobalJade.g:433:45: (iv_ruleRole= ruleRole EOF )
            // InternalGlobalJade.g:434:2: iv_ruleRole= ruleRole EOF
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
    // InternalGlobalJade.g:440:1: ruleRole returns [EObject current=null] : (otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_role_1_0=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:446:2: ( (otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) ) ) )
            // InternalGlobalJade.g:447:2: (otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) ) )
            {
            // InternalGlobalJade.g:447:2: (otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) ) )
            // InternalGlobalJade.g:448:3: otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalGlobalJade.g:452:3: ( (lv_role_1_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:453:4: (lv_role_1_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:453:4: (lv_role_1_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:454:5: lv_role_1_0= RULE_GENERAL_NAME
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});

}