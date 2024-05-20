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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_GENERAL_NAME", "RULE_TYPE_MESSAGE", "RULE_CONTENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'protocol'", "'('", "','", "')'", "'{'", "'}'", "'rec'", "':'", "'stop'", "'continue'", "'choice'", "'at'", "'or'", "'forall'", "'in'", "'do'", "';'", "'end'", "'from'", "'to'", "'role'"
    };
    public static final int RULE_GENERAL_NAME=4;
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
    // InternalGlobalJade.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocol ) ) otherlv_10= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_roles_4_0 = null;

        EObject lv_roles_6_0 = null;

        EObject lv_protocol_9_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:77:2: ( (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocol ) ) otherlv_10= '}' ) )
            // InternalGlobalJade.g:78:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocol ) ) otherlv_10= '}' )
            {
            // InternalGlobalJade.g:78:2: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocol ) ) otherlv_10= '}' )
            // InternalGlobalJade.g:79:3: otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '(' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )* otherlv_7= ')' otherlv_8= '{' ( (lv_protocol_9_0= ruleProtocol ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getGlobalKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getProtocolKeyword_1());
            		
            // InternalGlobalJade.g:87:3: ( (lv_name_2_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:88:4: (lv_name_2_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:88:4: (lv_name_2_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:89:5: lv_name_2_0= RULE_GENERAL_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameGENERAL_NAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.GENERAL_NAME");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftParenthesisKeyword_3());
            		
            // InternalGlobalJade.g:109:3: ( (lv_roles_4_0= ruleRole ) )
            // InternalGlobalJade.g:110:4: (lv_roles_4_0= ruleRole )
            {
            // InternalGlobalJade.g:110:4: (lv_roles_4_0= ruleRole )
            // InternalGlobalJade.g:111:5: lv_roles_4_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_roles_4_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_4_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGlobalJade.g:128:3: (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGlobalJade.g:129:4: otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalGlobalJade.g:133:4: ( (lv_roles_6_0= ruleRole ) )
            	    // InternalGlobalJade.g:134:5: (lv_roles_6_0= ruleRole )
            	    {
            	    // InternalGlobalJade.g:134:5: (lv_roles_6_0= ruleRole )
            	    // InternalGlobalJade.g:135:6: lv_roles_6_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_roles_6_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
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
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalGlobalJade.g:161:3: ( (lv_protocol_9_0= ruleProtocol ) )
            // InternalGlobalJade.g:162:4: (lv_protocol_9_0= ruleProtocol )
            {
            // InternalGlobalJade.g:162:4: (lv_protocol_9_0= ruleProtocol )
            // InternalGlobalJade.g:163:5: lv_protocol_9_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getModelAccess().getProtocolProtocolParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_protocol_9_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"protocol",
            						lv_protocol_9_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleProtocol"
    // InternalGlobalJade.g:188:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalGlobalJade.g:188:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalGlobalJade.g:189:2: iv_ruleProtocol= ruleProtocol EOF
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
    // InternalGlobalJade.g:195:1: ruleProtocol returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) ) )* ) ;
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
            // InternalGlobalJade.g:201:2: ( ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) ) )* ) )
            // InternalGlobalJade.g:202:2: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) ) )* )
            {
            // InternalGlobalJade.g:202:2: ( () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) ) )* )
            // InternalGlobalJade.g:203:3: () ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) ) )*
            {
            // InternalGlobalJade.g:203:3: ()
            // InternalGlobalJade.g:204:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolAccess().getProtocolAction_0(),
            					current);
            			

            }

            // InternalGlobalJade.g:210:3: ( ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_TYPE_MESSAGE||LA3_0==21||(LA3_0>=23 && LA3_0<=25)||LA3_0==28||LA3_0==32) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGlobalJade.g:211:4: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) )
            	    {
            	    // InternalGlobalJade.g:211:4: ( (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion ) )
            	    // InternalGlobalJade.g:212:5: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion )
            	    {
            	    // InternalGlobalJade.g:212:5: (lv_actions_1_1= ruleMessage | lv_actions_1_2= ruleChoice_rule | lv_actions_1_3= ruleFor_loop | lv_actions_1_4= ruleEnd_message | lv_actions_1_5= ruleRecursion | lv_actions_1_6= ruleEnd_Recursion | lv_actions_1_7= ruleContinue_Recursion )
            	    int alt2=7;
            	    switch ( input.LA(1) ) {
            	    case RULE_TYPE_MESSAGE:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt2=3;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt2=4;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt2=5;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt2=6;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt2=7;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt2) {
            	        case 1 :
            	            // InternalGlobalJade.g:213:6: lv_actions_1_1= ruleMessage
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsMessageParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_11);
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
            	            // InternalGlobalJade.g:229:6: lv_actions_1_2= ruleChoice_rule
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsChoice_ruleParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_11);
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
            	            // InternalGlobalJade.g:245:6: lv_actions_1_3= ruleFor_loop
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsFor_loopParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_11);
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
            	            // InternalGlobalJade.g:261:6: lv_actions_1_4= ruleEnd_message
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsEnd_messageParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_11);
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
            	            // InternalGlobalJade.g:277:6: lv_actions_1_5= ruleRecursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsRecursionParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_11);
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
            	            // InternalGlobalJade.g:293:6: lv_actions_1_6= ruleEnd_Recursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsEnd_RecursionParserRuleCall_1_0_5());
            	            					
            	            pushFollow(FOLLOW_11);
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
            	            // InternalGlobalJade.g:309:6: lv_actions_1_7= ruleContinue_Recursion
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolAccess().getActionsContinue_RecursionParserRuleCall_1_0_6());
            	            					
            	            pushFollow(FOLLOW_11);
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
            	    break loop3;
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
    // InternalGlobalJade.g:331:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // InternalGlobalJade.g:331:50: (iv_ruleRecursion= ruleRecursion EOF )
            // InternalGlobalJade.g:332:2: iv_ruleRecursion= ruleRecursion EOF
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
    // InternalGlobalJade.g:338:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= ':' ) ;
    public final EObject ruleRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:344:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= ':' ) )
            // InternalGlobalJade.g:345:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= ':' )
            {
            // InternalGlobalJade.g:345:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= ':' )
            // InternalGlobalJade.g:346:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= ':'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
            		
            // InternalGlobalJade.g:350:3: ( (lv_name_1_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:351:4: (lv_name_1_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:351:4: (lv_name_1_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:352:5: lv_name_1_0= RULE_GENERAL_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRecursionAccess().getNameGENERAL_NAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecursionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.GENERAL_NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

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
    // InternalGlobalJade.g:376:1: entryRuleEnd_Recursion returns [EObject current=null] : iv_ruleEnd_Recursion= ruleEnd_Recursion EOF ;
    public final EObject entryRuleEnd_Recursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd_Recursion = null;


        try {
            // InternalGlobalJade.g:376:54: (iv_ruleEnd_Recursion= ruleEnd_Recursion EOF )
            // InternalGlobalJade.g:377:2: iv_ruleEnd_Recursion= ruleEnd_Recursion EOF
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
    // InternalGlobalJade.g:383:1: ruleEnd_Recursion returns [EObject current=null] : (otherlv_0= 'stop' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) ) ;
    public final EObject ruleEnd_Recursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:389:2: ( (otherlv_0= 'stop' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) ) )
            // InternalGlobalJade.g:390:2: (otherlv_0= 'stop' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) )
            {
            // InternalGlobalJade.g:390:2: (otherlv_0= 'stop' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) )
            // InternalGlobalJade.g:391:3: otherlv_0= 'stop' ( (lv_name_1_0= RULE_GENERAL_NAME ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnd_RecursionAccess().getStopKeyword_0());
            		
            // InternalGlobalJade.g:395:3: ( (lv_name_1_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:396:4: (lv_name_1_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:396:4: (lv_name_1_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:397:5: lv_name_1_0= RULE_GENERAL_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnd_RecursionAccess().getNameGENERAL_NAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnd_RecursionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleEnd_Recursion"


    // $ANTLR start "entryRuleContinue_Recursion"
    // InternalGlobalJade.g:417:1: entryRuleContinue_Recursion returns [EObject current=null] : iv_ruleContinue_Recursion= ruleContinue_Recursion EOF ;
    public final EObject entryRuleContinue_Recursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinue_Recursion = null;


        try {
            // InternalGlobalJade.g:417:59: (iv_ruleContinue_Recursion= ruleContinue_Recursion EOF )
            // InternalGlobalJade.g:418:2: iv_ruleContinue_Recursion= ruleContinue_Recursion EOF
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
    // InternalGlobalJade.g:424:1: ruleContinue_Recursion returns [EObject current=null] : (otherlv_0= 'continue' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) ) ;
    public final EObject ruleContinue_Recursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:430:2: ( (otherlv_0= 'continue' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) ) )
            // InternalGlobalJade.g:431:2: (otherlv_0= 'continue' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) )
            {
            // InternalGlobalJade.g:431:2: (otherlv_0= 'continue' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) )
            // InternalGlobalJade.g:432:3: otherlv_0= 'continue' ( (lv_name_1_0= RULE_GENERAL_NAME ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContinue_RecursionAccess().getContinueKeyword_0());
            		
            // InternalGlobalJade.g:436:3: ( (lv_name_1_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:437:4: (lv_name_1_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:437:4: (lv_name_1_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:438:5: lv_name_1_0= RULE_GENERAL_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContinue_RecursionAccess().getNameGENERAL_NAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContinue_RecursionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleContinue_Recursion"


    // $ANTLR start "entryRuleChoice_rule"
    // InternalGlobalJade.g:458:1: entryRuleChoice_rule returns [EObject current=null] : iv_ruleChoice_rule= ruleChoice_rule EOF ;
    public final EObject entryRuleChoice_rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice_rule = null;


        try {
            // InternalGlobalJade.g:458:52: (iv_ruleChoice_rule= ruleChoice_rule EOF )
            // InternalGlobalJade.g:459:2: iv_ruleChoice_rule= ruleChoice_rule EOF
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
    // InternalGlobalJade.g:465:1: ruleChoice_rule returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '{' ( (lv_branch_4_0= ruleProtocol ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branch_8_0= ruleProtocol ) ) otherlv_9= '}' )* ) ;
    public final EObject ruleChoice_rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_role_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_branch_4_0 = null;

        EObject lv_branch_8_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:471:2: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '{' ( (lv_branch_4_0= ruleProtocol ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branch_8_0= ruleProtocol ) ) otherlv_9= '}' )* ) )
            // InternalGlobalJade.g:472:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '{' ( (lv_branch_4_0= ruleProtocol ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branch_8_0= ruleProtocol ) ) otherlv_9= '}' )* )
            {
            // InternalGlobalJade.g:472:2: (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '{' ( (lv_branch_4_0= ruleProtocol ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branch_8_0= ruleProtocol ) ) otherlv_9= '}' )* )
            // InternalGlobalJade.g:473:3: otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_name_2_0= RULE_GENERAL_NAME ) ) otherlv_3= '{' ( (lv_branch_4_0= ruleProtocol ) ) otherlv_5= '}' (otherlv_6= 'or' otherlv_7= '{' ( (lv_branch_8_0= ruleProtocol ) ) otherlv_9= '}' )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getChoice_ruleAccess().getChoiceKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoice_ruleAccess().getAtKeyword_1());
            		
            // InternalGlobalJade.g:481:3: ( (lv_role_name_2_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:482:4: (lv_role_name_2_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:482:4: (lv_role_name_2_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:483:5: lv_role_name_2_0= RULE_GENERAL_NAME
            {
            lv_role_name_2_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_8); 

            					newLeafNode(lv_role_name_2_0, grammarAccess.getChoice_ruleAccess().getRole_nameGENERAL_NAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoice_ruleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"role_name",
            						lv_role_name_2_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.GENERAL_NAME");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getChoice_ruleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGlobalJade.g:503:3: ( (lv_branch_4_0= ruleProtocol ) )
            // InternalGlobalJade.g:504:4: (lv_branch_4_0= ruleProtocol )
            {
            // InternalGlobalJade.g:504:4: (lv_branch_4_0= ruleProtocol )
            // InternalGlobalJade.g:505:5: lv_branch_4_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getChoice_ruleAccess().getBranchProtocolParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_branch_4_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChoice_ruleRule());
            					}
            					add(
            						current,
            						"branch",
            						lv_branch_4_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getChoice_ruleAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalGlobalJade.g:526:3: (otherlv_6= 'or' otherlv_7= '{' ( (lv_branch_8_0= ruleProtocol ) ) otherlv_9= '}' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGlobalJade.g:527:4: otherlv_6= 'or' otherlv_7= '{' ( (lv_branch_8_0= ruleProtocol ) ) otherlv_9= '}'
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getChoice_ruleAccess().getOrKeyword_6_0());
            	    			
            	    otherlv_7=(Token)match(input,19,FOLLOW_9); 

            	    				newLeafNode(otherlv_7, grammarAccess.getChoice_ruleAccess().getLeftCurlyBracketKeyword_6_1());
            	    			
            	    // InternalGlobalJade.g:535:4: ( (lv_branch_8_0= ruleProtocol ) )
            	    // InternalGlobalJade.g:536:5: (lv_branch_8_0= ruleProtocol )
            	    {
            	    // InternalGlobalJade.g:536:5: (lv_branch_8_0= ruleProtocol )
            	    // InternalGlobalJade.g:537:6: lv_branch_8_0= ruleProtocol
            	    {

            	    						newCompositeNode(grammarAccess.getChoice_ruleAccess().getBranchProtocolParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_branch_8_0=ruleProtocol();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChoice_ruleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"branch",
            	    							lv_branch_8_0,
            	    							"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,20,FOLLOW_14); 

            	    				newLeafNode(otherlv_9, grammarAccess.getChoice_ruleAccess().getRightCurlyBracketKeyword_6_3());
            	    			

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
    // $ANTLR end "ruleChoice_rule"


    // $ANTLR start "entryRuleFor_loop"
    // InternalGlobalJade.g:563:1: entryRuleFor_loop returns [EObject current=null] : iv_ruleFor_loop= ruleFor_loop EOF ;
    public final EObject entryRuleFor_loop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor_loop = null;


        try {
            // InternalGlobalJade.g:563:49: (iv_ruleFor_loop= ruleFor_loop EOF )
            // InternalGlobalJade.g:564:2: iv_ruleFor_loop= ruleFor_loop EOF
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
    // InternalGlobalJade.g:570:1: ruleFor_loop returns [EObject current=null] : (otherlv_0= 'forall' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= 'in' ( (lv_role_3_0= RULE_GENERAL_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_branch_6_0= ruleProtocol ) ) otherlv_7= '}' ) ;
    public final EObject ruleFor_loop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_role_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_branch_6_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:576:2: ( (otherlv_0= 'forall' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= 'in' ( (lv_role_3_0= RULE_GENERAL_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_branch_6_0= ruleProtocol ) ) otherlv_7= '}' ) )
            // InternalGlobalJade.g:577:2: (otherlv_0= 'forall' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= 'in' ( (lv_role_3_0= RULE_GENERAL_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_branch_6_0= ruleProtocol ) ) otherlv_7= '}' )
            {
            // InternalGlobalJade.g:577:2: (otherlv_0= 'forall' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= 'in' ( (lv_role_3_0= RULE_GENERAL_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_branch_6_0= ruleProtocol ) ) otherlv_7= '}' )
            // InternalGlobalJade.g:578:3: otherlv_0= 'forall' ( (lv_name_1_0= RULE_GENERAL_NAME ) ) otherlv_2= 'in' ( (lv_role_3_0= RULE_GENERAL_NAME ) ) otherlv_4= 'do' otherlv_5= '{' ( (lv_branch_6_0= ruleProtocol ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFor_loopAccess().getForallKeyword_0());
            		
            // InternalGlobalJade.g:582:3: ( (lv_name_1_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:583:4: (lv_name_1_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:583:4: (lv_name_1_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:584:5: lv_name_1_0= RULE_GENERAL_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFor_loopAccess().getInKeyword_2());
            		
            // InternalGlobalJade.g:604:3: ( (lv_role_3_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:605:4: (lv_role_3_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:605:4: (lv_role_3_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:606:5: lv_role_3_0= RULE_GENERAL_NAME
            {
            lv_role_3_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_16); 

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

            otherlv_4=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getFor_loopAccess().getDoKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getFor_loopAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGlobalJade.g:630:3: ( (lv_branch_6_0= ruleProtocol ) )
            // InternalGlobalJade.g:631:4: (lv_branch_6_0= ruleProtocol )
            {
            // InternalGlobalJade.g:631:4: (lv_branch_6_0= ruleProtocol )
            // InternalGlobalJade.g:632:5: lv_branch_6_0= ruleProtocol
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

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

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
    // InternalGlobalJade.g:657:1: entryRuleEnd_message returns [EObject current=null] : iv_ruleEnd_message= ruleEnd_message EOF ;
    public final EObject entryRuleEnd_message() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd_message = null;


        try {
            // InternalGlobalJade.g:657:52: (iv_ruleEnd_message= ruleEnd_message EOF )
            // InternalGlobalJade.g:658:2: iv_ruleEnd_message= ruleEnd_message EOF
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
    // InternalGlobalJade.g:664:1: ruleEnd_message returns [EObject current=null] : ( ( (lv_end_0_0= ruleEND_MEX ) ) otherlv_1= ';' ) ;
    public final EObject ruleEnd_message() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_end_0_0 = null;



        	enterRule();

        try {
            // InternalGlobalJade.g:670:2: ( ( ( (lv_end_0_0= ruleEND_MEX ) ) otherlv_1= ';' ) )
            // InternalGlobalJade.g:671:2: ( ( (lv_end_0_0= ruleEND_MEX ) ) otherlv_1= ';' )
            {
            // InternalGlobalJade.g:671:2: ( ( (lv_end_0_0= ruleEND_MEX ) ) otherlv_1= ';' )
            // InternalGlobalJade.g:672:3: ( (lv_end_0_0= ruleEND_MEX ) ) otherlv_1= ';'
            {
            // InternalGlobalJade.g:672:3: ( (lv_end_0_0= ruleEND_MEX ) )
            // InternalGlobalJade.g:673:4: (lv_end_0_0= ruleEND_MEX )
            {
            // InternalGlobalJade.g:673:4: (lv_end_0_0= ruleEND_MEX )
            // InternalGlobalJade.g:674:5: lv_end_0_0= ruleEND_MEX
            {

            					newCompositeNode(grammarAccess.getEnd_messageAccess().getEndEND_MEXParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

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
    // InternalGlobalJade.g:699:1: entryRuleEND_MEX returns [String current=null] : iv_ruleEND_MEX= ruleEND_MEX EOF ;
    public final String entryRuleEND_MEX() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEND_MEX = null;


        try {
            // InternalGlobalJade.g:699:47: (iv_ruleEND_MEX= ruleEND_MEX EOF )
            // InternalGlobalJade.g:700:2: iv_ruleEND_MEX= ruleEND_MEX EOF
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
    // InternalGlobalJade.g:706:1: ruleEND_MEX returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'end' ;
    public final AntlrDatatypeRuleToken ruleEND_MEX() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:712:2: (kw= 'end' )
            // InternalGlobalJade.g:713:2: kw= 'end'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

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
    // InternalGlobalJade.g:721:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalGlobalJade.g:721:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalGlobalJade.g:722:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalGlobalJade.g:728:1: ruleMessage returns [EObject current=null] : ( ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' ( (lv_content_2_0= RULE_CONTENT ) ) (otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) ) )* otherlv_5= ')' otherlv_6= 'from' ( (lv_roleA_7_0= RULE_GENERAL_NAME ) ) otherlv_8= 'to' ( (lv_roleB_9_0= RULE_GENERAL_NAME ) ) otherlv_10= ';' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token lv_content_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_roleA_7_0=null;
        Token otherlv_8=null;
        Token lv_roleB_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:734:2: ( ( ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' ( (lv_content_2_0= RULE_CONTENT ) ) (otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) ) )* otherlv_5= ')' otherlv_6= 'from' ( (lv_roleA_7_0= RULE_GENERAL_NAME ) ) otherlv_8= 'to' ( (lv_roleB_9_0= RULE_GENERAL_NAME ) ) otherlv_10= ';' ) )
            // InternalGlobalJade.g:735:2: ( ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' ( (lv_content_2_0= RULE_CONTENT ) ) (otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) ) )* otherlv_5= ')' otherlv_6= 'from' ( (lv_roleA_7_0= RULE_GENERAL_NAME ) ) otherlv_8= 'to' ( (lv_roleB_9_0= RULE_GENERAL_NAME ) ) otherlv_10= ';' )
            {
            // InternalGlobalJade.g:735:2: ( ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' ( (lv_content_2_0= RULE_CONTENT ) ) (otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) ) )* otherlv_5= ')' otherlv_6= 'from' ( (lv_roleA_7_0= RULE_GENERAL_NAME ) ) otherlv_8= 'to' ( (lv_roleB_9_0= RULE_GENERAL_NAME ) ) otherlv_10= ';' )
            // InternalGlobalJade.g:736:3: ( (lv_type_0_0= RULE_TYPE_MESSAGE ) ) otherlv_1= '(' ( (lv_content_2_0= RULE_CONTENT ) ) (otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) ) )* otherlv_5= ')' otherlv_6= 'from' ( (lv_roleA_7_0= RULE_GENERAL_NAME ) ) otherlv_8= 'to' ( (lv_roleB_9_0= RULE_GENERAL_NAME ) ) otherlv_10= ';'
            {
            // InternalGlobalJade.g:736:3: ( (lv_type_0_0= RULE_TYPE_MESSAGE ) )
            // InternalGlobalJade.g:737:4: (lv_type_0_0= RULE_TYPE_MESSAGE )
            {
            // InternalGlobalJade.g:737:4: (lv_type_0_0= RULE_TYPE_MESSAGE )
            // InternalGlobalJade.g:738:5: lv_type_0_0= RULE_TYPE_MESSAGE
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

            otherlv_1=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGlobalJade.g:758:3: ( (lv_content_2_0= RULE_CONTENT ) )
            // InternalGlobalJade.g:759:4: (lv_content_2_0= RULE_CONTENT )
            {
            // InternalGlobalJade.g:759:4: (lv_content_2_0= RULE_CONTENT )
            // InternalGlobalJade.g:760:5: lv_content_2_0= RULE_CONTENT
            {
            lv_content_2_0=(Token)match(input,RULE_CONTENT,FOLLOW_7); 

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

            // InternalGlobalJade.g:776:3: (otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGlobalJade.g:777:4: otherlv_3= ',' ( (lv_content_4_0= RULE_CONTENT ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_18); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalGlobalJade.g:781:4: ( (lv_content_4_0= RULE_CONTENT ) )
            	    // InternalGlobalJade.g:782:5: (lv_content_4_0= RULE_CONTENT )
            	    {
            	    // InternalGlobalJade.g:782:5: (lv_content_4_0= RULE_CONTENT )
            	    // InternalGlobalJade.g:783:6: lv_content_4_0= RULE_CONTENT
            	    {
            	    lv_content_4_0=(Token)match(input,RULE_CONTENT,FOLLOW_7); 

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
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getFromKeyword_5());
            		
            // InternalGlobalJade.g:808:3: ( (lv_roleA_7_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:809:4: (lv_roleA_7_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:809:4: (lv_roleA_7_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:810:5: lv_roleA_7_0= RULE_GENERAL_NAME
            {
            lv_roleA_7_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_20); 

            					newLeafNode(lv_roleA_7_0, grammarAccess.getMessageAccess().getRoleAGENERAL_NAMETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"roleA",
            						lv_roleA_7_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.GENERAL_NAME");
            				

            }


            }

            otherlv_8=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getToKeyword_7());
            		
            // InternalGlobalJade.g:830:3: ( (lv_roleB_9_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:831:4: (lv_roleB_9_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:831:4: (lv_roleB_9_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:832:5: lv_roleB_9_0= RULE_GENERAL_NAME
            {
            lv_roleB_9_0=(Token)match(input,RULE_GENERAL_NAME,FOLLOW_17); 

            					newLeafNode(lv_roleB_9_0, grammarAccess.getMessageAccess().getRoleBGENERAL_NAMETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"roleB",
            						lv_roleB_9_0,
            						"org.xtext.globaltype.globaljade.GlobalJade.GENERAL_NAME");
            				

            }


            }

            otherlv_10=(Token)match(input,31,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRole"
    // InternalGlobalJade.g:856:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalGlobalJade.g:856:45: (iv_ruleRole= ruleRole EOF )
            // InternalGlobalJade.g:857:2: iv_ruleRole= ruleRole EOF
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
    // InternalGlobalJade.g:863:1: ruleRole returns [EObject current=null] : (otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_role_1_0=null;


        	enterRule();

        try {
            // InternalGlobalJade.g:869:2: ( (otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) ) ) )
            // InternalGlobalJade.g:870:2: (otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) ) )
            {
            // InternalGlobalJade.g:870:2: (otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) ) )
            // InternalGlobalJade.g:871:3: otherlv_0= 'role' ( (lv_role_1_0= RULE_GENERAL_NAME ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalGlobalJade.g:875:3: ( (lv_role_1_0= RULE_GENERAL_NAME ) )
            // InternalGlobalJade.g:876:4: (lv_role_1_0= RULE_GENERAL_NAME )
            {
            // InternalGlobalJade.g:876:4: (lv_role_1_0= RULE_GENERAL_NAME )
            // InternalGlobalJade.g:877:5: lv_role_1_0= RULE_GENERAL_NAME
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000113B00020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000113A00022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});

}