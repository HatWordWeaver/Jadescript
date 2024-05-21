/*
 * generated by Xtext 2.34.0
 */
grammar InternalGlobalJade;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.globaltype.globaljade.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='global'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getGlobalKeyword_0());
		}
		otherlv_1='protocol'
		{
			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getProtocolKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_NAME
				{
					newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameNAMETerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getRolesRolesParserRuleCall_4_0());
				}
				lv_roles_4_0=ruleRoles
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"roles",
						lv_roles_4_0,
						"org.xtext.globaltype.globaljade.GlobalJade.Roles");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightParenthesisKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getProtocolProtocolParserRuleCall_7_0());
				}
				lv_protocol_7_0=ruleProtocol
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"protocol",
						lv_protocol_7_0,
						"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleRoles
entryRuleRoles returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRolesRule()); }
	iv_ruleRoles=ruleRoles
	{ $current=$iv_ruleRoles.current; }
	EOF;

// Rule Roles
ruleRoles returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_0_0());
				}
				lv_roles_0_0=ruleRole
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRolesRule());
					}
					add(
						$current,
						"roles",
						lv_roles_0_0,
						"org.xtext.globaltype.globaljade.GlobalJade.Role");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getRolesAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRolesAccess().getRolesRoleParserRuleCall_1_1_0());
					}
					lv_roles_2_0=ruleRole
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRolesRule());
						}
						add(
							$current,
							"roles",
							lv_roles_2_0,
							"org.xtext.globaltype.globaljade.GlobalJade.Role");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleRole
entryRuleRole returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoleRule()); }
	iv_ruleRole=ruleRole
	{ $current=$iv_ruleRole.current; }
	EOF;

// Rule Role
ruleRole returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRoleAccess().getOneRoleParserRuleCall_0());
		}
		this_OneRole_0=ruleOneRole
		{
			$current = $this_OneRole_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoleAccess().getMultipleRoleParserRuleCall_1());
		}
		this_MultipleRole_1=ruleMultipleRole
		{
			$current = $this_MultipleRole_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleOneRole
entryRuleOneRole returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOneRoleRule()); }
	iv_ruleOneRole=ruleOneRole
	{ $current=$iv_ruleOneRole.current; }
	EOF;

// Rule OneRole
ruleOneRole returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='role'
		{
			newLeafNode(otherlv_0, grammarAccess.getOneRoleAccess().getRoleKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getOneRoleAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOneRoleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
				}
			)
		)
	)
;

// Entry rule entryRuleMultipleRole
entryRuleMultipleRole returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultipleRoleRule()); }
	iv_ruleMultipleRole=ruleMultipleRole
	{ $current=$iv_ruleMultipleRole.current; }
	EOF;

// Rule MultipleRole
ruleMultipleRole returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='multrole'
		{
			newLeafNode(otherlv_0, grammarAccess.getMultipleRoleAccess().getMultroleKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMultipleRoleAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMultipleRoleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getMultipleRoleAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMultipleRoleRule());
					}
				}
				otherlv_3=RULE_NAME
				{
					newLeafNode(otherlv_3, grammarAccess.getMultipleRoleAccess().getRefOneRoleCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleProtocol
entryRuleProtocol returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProtocolRule()); }
	iv_ruleProtocol=ruleProtocol
	{ $current=$iv_ruleProtocol.current; }
	EOF;

// Rule Protocol
ruleProtocol returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getProtocolAccess().getProtocolAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getProtocolAccess().getActionsMessageParserRuleCall_1_0_0());
					}
					lv_actions_1_1=ruleMessage
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProtocolRule());
						}
						add(
							$current,
							"actions",
							lv_actions_1_1,
							"org.xtext.globaltype.globaljade.GlobalJade.Message");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getProtocolAccess().getActionsChoice_ruleParserRuleCall_1_0_1());
					}
					lv_actions_1_2=ruleChoice_rule
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProtocolRule());
						}
						add(
							$current,
							"actions",
							lv_actions_1_2,
							"org.xtext.globaltype.globaljade.GlobalJade.Choice_rule");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getProtocolAccess().getActionsFor_loopParserRuleCall_1_0_2());
					}
					lv_actions_1_3=ruleFor_loop
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProtocolRule());
						}
						add(
							$current,
							"actions",
							lv_actions_1_3,
							"org.xtext.globaltype.globaljade.GlobalJade.For_loop");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getProtocolAccess().getActionsEnd_messageParserRuleCall_1_0_3());
					}
					lv_actions_1_4=ruleEnd_message
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProtocolRule());
						}
						add(
							$current,
							"actions",
							lv_actions_1_4,
							"org.xtext.globaltype.globaljade.GlobalJade.End_message");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getProtocolAccess().getActionsRecursionParserRuleCall_1_0_4());
					}
					lv_actions_1_5=ruleRecursion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProtocolRule());
						}
						add(
							$current,
							"actions",
							lv_actions_1_5,
							"org.xtext.globaltype.globaljade.GlobalJade.Recursion");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getProtocolAccess().getActionsEnd_RecursionParserRuleCall_1_0_5());
					}
					lv_actions_1_6=ruleEnd_Recursion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProtocolRule());
						}
						add(
							$current,
							"actions",
							lv_actions_1_6,
							"org.xtext.globaltype.globaljade.GlobalJade.End_Recursion");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getProtocolAccess().getActionsContinue_RecursionParserRuleCall_1_0_6());
					}
					lv_actions_1_7=ruleContinue_Recursion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProtocolRule());
						}
						add(
							$current,
							"actions",
							lv_actions_1_7,
							"org.xtext.globaltype.globaljade.GlobalJade.Continue_Recursion");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleRecursion
entryRuleRecursion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRecursionRule()); }
	iv_ruleRecursion=ruleRecursion
	{ $current=$iv_ruleRecursion.current; }
	EOF;

// Rule Recursion
ruleRecursion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rec'
		{
			newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRecursionAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRecursionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getRecursionAccess().getColonKeyword_2());
		}
	)
;

// Entry rule entryRuleEnd_Recursion
entryRuleEnd_Recursion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnd_RecursionRule()); }
	iv_ruleEnd_Recursion=ruleEnd_Recursion
	{ $current=$iv_ruleEnd_Recursion.current; }
	EOF;

// Rule End_Recursion
ruleEnd_Recursion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='stop'
		{
			newLeafNode(otherlv_0, grammarAccess.getEnd_RecursionAccess().getStopKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEnd_RecursionAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnd_RecursionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
				}
			)
		)
	)
;

// Entry rule entryRuleContinue_Recursion
entryRuleContinue_Recursion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContinue_RecursionRule()); }
	iv_ruleContinue_Recursion=ruleContinue_Recursion
	{ $current=$iv_ruleContinue_Recursion.current; }
	EOF;

// Rule Continue_Recursion
ruleContinue_Recursion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='continue'
		{
			newLeafNode(otherlv_0, grammarAccess.getContinue_RecursionAccess().getContinueKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getContinue_RecursionAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContinue_RecursionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
				}
			)
		)
	)
;

// Entry rule entryRuleChoice_rule
entryRuleChoice_rule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChoice_ruleRule()); }
	iv_ruleChoice_rule=ruleChoice_rule
	{ $current=$iv_ruleChoice_rule.current; }
	EOF;

// Rule Choice_rule
ruleChoice_rule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='choice'
		{
			newLeafNode(otherlv_0, grammarAccess.getChoice_ruleAccess().getChoiceKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getChoice_ruleAccess().getAtKeyword_1());
		}
		(
			(
				lv_role_name_2_0=RULE_NAME
				{
					newLeafNode(lv_role_name_2_0, grammarAccess.getChoice_ruleAccess().getRole_nameNAMETerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChoice_ruleRule());
					}
					setWithLastConsumed(
						$current,
						"role_name",
						lv_role_name_2_0,
						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getChoice_ruleAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChoice_ruleAccess().getMessagesMessageParserRuleCall_4_0());
				}
				lv_messages_4_0=ruleMessage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChoice_ruleRule());
					}
					add(
						$current,
						"messages",
						lv_messages_4_0,
						"org.xtext.globaltype.globaljade.GlobalJade.Message");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getChoice_ruleAccess().getBranchProtocolParserRuleCall_5_0());
				}
				lv_branch_5_0=ruleProtocol
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChoice_ruleRule());
					}
					add(
						$current,
						"branch",
						lv_branch_5_0,
						"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getChoice_ruleAccess().getRightCurlyBracketKeyword_6());
		}
		(
			otherlv_7='or'
			{
				newLeafNode(otherlv_7, grammarAccess.getChoice_ruleAccess().getOrKeyword_7_0());
			}
			otherlv_8='{'
			{
				newLeafNode(otherlv_8, grammarAccess.getChoice_ruleAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getChoice_ruleAccess().getMessagesMessageParserRuleCall_7_2_0());
					}
					lv_messages_9_0=ruleMessage
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getChoice_ruleRule());
						}
						add(
							$current,
							"messages",
							lv_messages_9_0,
							"org.xtext.globaltype.globaljade.GlobalJade.Message");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getChoice_ruleAccess().getBranchProtocolParserRuleCall_7_3_0());
					}
					lv_branch_10_0=ruleProtocol
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getChoice_ruleRule());
						}
						add(
							$current,
							"branch",
							lv_branch_10_0,
							"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getChoice_ruleAccess().getRightCurlyBracketKeyword_7_4());
			}
		)*
	)
;

// Entry rule entryRuleFor_loop
entryRuleFor_loop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFor_loopRule()); }
	iv_ruleFor_loop=ruleFor_loop
	{ $current=$iv_ruleFor_loop.current; }
	EOF;

// Rule For_loop
ruleFor_loop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='forall'
		{
			newLeafNode(otherlv_0, grammarAccess.getFor_loopAccess().getForallKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFor_loopAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFor_loopRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
				}
			)
		)
		otherlv_2='in'
		{
			newLeafNode(otherlv_2, grammarAccess.getFor_loopAccess().getInKeyword_2());
		}
		(
			(
				lv_roleTarget_3_0=RULE_NAME
				{
					newLeafNode(lv_roleTarget_3_0, grammarAccess.getFor_loopAccess().getRoleTargetNAMETerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFor_loopRule());
					}
					setWithLastConsumed(
						$current,
						"roleTarget",
						lv_roleTarget_3_0,
						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
				}
			)
		)
		otherlv_4='do'
		{
			newLeafNode(otherlv_4, grammarAccess.getFor_loopAccess().getDoKeyword_4());
		}
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getFor_loopAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFor_loopAccess().getBranchProtocolParserRuleCall_6_0());
				}
				lv_branch_6_0=ruleProtocol
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFor_loopRule());
					}
					add(
						$current,
						"branch",
						lv_branch_6_0,
						"org.xtext.globaltype.globaljade.GlobalJade.Protocol");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getFor_loopAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleEnd_message
entryRuleEnd_message returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnd_messageRule()); }
	iv_ruleEnd_message=ruleEnd_message
	{ $current=$iv_ruleEnd_message.current; }
	EOF;

// Rule End_message
ruleEnd_message returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEnd_messageAccess().getEndEND_MEXParserRuleCall_0_0());
				}
				lv_end_0_0=ruleEND_MEX
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnd_messageRule());
					}
					add(
						$current,
						"end",
						lv_end_0_0,
						"org.xtext.globaltype.globaljade.GlobalJade.END_MEX");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=';'
		{
			newLeafNode(otherlv_1, grammarAccess.getEnd_messageAccess().getSemicolonKeyword_1());
		}
	)
;

// Entry rule entryRuleEND_MEX
entryRuleEND_MEX returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEND_MEXRule()); }
	iv_ruleEND_MEX=ruleEND_MEX
	{ $current=$iv_ruleEND_MEX.current.getText(); }
	EOF;

// Rule END_MEX
ruleEND_MEX returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='end'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getEND_MEXAccess().getEndKeyword());
	}
;

// Entry rule entryRuleMessage
entryRuleMessage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageRule()); }
	iv_ruleMessage=ruleMessage
	{ $current=$iv_ruleMessage.current; }
	EOF;

// Rule Message
ruleMessage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0=RULE_TYPE_MESSAGE
				{
					newLeafNode(lv_type_0_0, grammarAccess.getMessageAccess().getTypeTYPE_MESSAGETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_0_0,
						"org.xtext.globaltype.globaljade.GlobalJade.TYPE_MESSAGE");
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_content_2_0=RULE_CONTENT
				{
					newLeafNode(lv_content_2_0, grammarAccess.getMessageAccess().getContentCONTENTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					addWithLastConsumed(
						$current,
						"content",
						lv_content_2_0,
						"org.xtext.globaltype.globaljade.GlobalJade.CONTENT");
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getCommaKeyword_3_0());
			}
			(
				(
					lv_content_4_0=RULE_CONTENT
					{
						newLeafNode(lv_content_4_0, grammarAccess.getMessageAccess().getContentCONTENTTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMessageRule());
						}
						addWithLastConsumed(
							$current,
							"content",
							lv_content_4_0,
							"org.xtext.globaltype.globaljade.GlobalJade.CONTENT");
					}
				)
			)
		)*
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getRightParenthesisKeyword_4());
		}
		otherlv_6='from'
		{
			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getFromKeyword_5());
		}
		(
			(
				lv_sender_7_0=RULE_NAME
				{
					newLeafNode(lv_sender_7_0, grammarAccess.getMessageAccess().getSenderNAMETerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					setWithLastConsumed(
						$current,
						"sender",
						lv_sender_7_0,
						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
				}
			)
		)
		otherlv_8='to'
		{
			newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getToKeyword_7());
		}
		(
			(
				lv_receiver_9_0=RULE_NAME
				{
					newLeafNode(lv_receiver_9_0, grammarAccess.getMessageAccess().getReceiverNAMETerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					setWithLastConsumed(
						$current,
						"receiver",
						lv_receiver_9_0,
						"org.xtext.globaltype.globaljade.GlobalJade.NAME");
				}
			)
		)
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getMessageAccess().getSemicolonKeyword_9());
		}
	)
;

RULE_TYPE_MESSAGE : ('CFP'|'REJECT-PROPOSAL'|'ACCEPT-PROPOSAL'|'FAILURE'|'INFORM-DONE'|'INFORM'|'PROPOSE');

RULE_CONTENT : ('int'|'bool'|'string');

RULE_NAME : ('A'..'Z')+ ('a'..'z')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
