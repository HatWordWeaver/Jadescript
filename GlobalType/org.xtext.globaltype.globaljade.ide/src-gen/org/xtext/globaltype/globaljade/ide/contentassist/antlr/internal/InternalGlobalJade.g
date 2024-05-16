/*
 * generated by Xtext 2.34.0
 */
grammar InternalGlobalJade;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.globaltype.globaljade.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getProtocolsAssignment()); }
		(rule__Model__ProtocolsAssignment)*
		{ after(grammarAccess.getModelAccess().getProtocolsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProtocols
entryRuleProtocols
:
{ before(grammarAccess.getProtocolsRule()); }
	 ruleProtocols
{ after(grammarAccess.getProtocolsRule()); } 
	 EOF 
;

// Rule Protocols
ruleProtocols 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProtocolsAccess().getGroup()); }
		(rule__Protocols__Group__0)
		{ after(grammarAccess.getProtocolsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFor_loop
entryRuleFor_loop
:
{ before(grammarAccess.getFor_loopRule()); }
	 ruleFor_loop
{ after(grammarAccess.getFor_loopRule()); } 
	 EOF 
;

// Rule For_loop
ruleFor_loop 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFor_loopAccess().getGroup()); }
		(rule__For_loop__Group__0)
		{ after(grammarAccess.getFor_loopAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGlobal_message
entryRuleGlobal_message
:
{ before(grammarAccess.getGlobal_messageRule()); }
	 ruleGlobal_message
{ after(grammarAccess.getGlobal_messageRule()); } 
	 EOF 
;

// Rule Global_message
ruleGlobal_message 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGlobal_messageAccess().getGroup()); }
		(rule__Global_message__Group__0)
		{ after(grammarAccess.getGlobal_messageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRole
entryRuleRole
:
{ before(grammarAccess.getRoleRule()); }
	 ruleRole
{ after(grammarAccess.getRoleRule()); } 
	 EOF 
;

// Rule Role
ruleRole 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRoleAccess().getGroup()); }
		(rule__Role__Group__0)
		{ after(grammarAccess.getRoleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Alternatives_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProtocolsAccess().getGlobalsAssignment_8_0()); }
		(rule__Protocols__GlobalsAssignment_8_0)
		{ after(grammarAccess.getProtocolsAccess().getGlobalsAssignment_8_0()); }
	)
	|
	(
		{ before(grammarAccess.getProtocolsAccess().getForLoopAssignment_8_1()); }
		(rule__Protocols__ForLoopAssignment_8_1)
		{ after(grammarAccess.getProtocolsAccess().getForLoopAssignment_8_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocols__Group__0__Impl
	rule__Protocols__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolsAccess().getGlobalKeyword_0()); }
	'global'
	{ after(grammarAccess.getProtocolsAccess().getGlobalKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocols__Group__1__Impl
	rule__Protocols__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolsAccess().getProtocolKeyword_1()); }
	'protocol'
	{ after(grammarAccess.getProtocolsAccess().getProtocolKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocols__Group__2__Impl
	rule__Protocols__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolsAccess().getNameAssignment_2()); }
	(rule__Protocols__NameAssignment_2)
	{ after(grammarAccess.getProtocolsAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocols__Group__3__Impl
	rule__Protocols__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolsAccess().getLeftParenthesisKeyword_3()); }
	'('
	{ after(grammarAccess.getProtocolsAccess().getLeftParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocols__Group__4__Impl
	rule__Protocols__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolsAccess().getRolesAssignment_4()); }
	(rule__Protocols__RolesAssignment_4)
	{ after(grammarAccess.getProtocolsAccess().getRolesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocols__Group__5__Impl
	rule__Protocols__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolsAccess().getGroup_5()); }
	(rule__Protocols__Group_5__0)*
	{ after(grammarAccess.getProtocolsAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocols__Group__6__Impl
	rule__Protocols__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolsAccess().getRightParenthesisKeyword_6()); }
	')'
	{ after(grammarAccess.getProtocolsAccess().getRightParenthesisKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocols__Group__7__Impl
	rule__Protocols__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolsAccess().getLeftCurlyBracketKeyword_7()); }
	'{'
	{ after(grammarAccess.getProtocolsAccess().getLeftCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocols__Group__8__Impl
	rule__Protocols__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getProtocolsAccess().getAlternatives_8()); }
		(rule__Protocols__Alternatives_8)
		{ after(grammarAccess.getProtocolsAccess().getAlternatives_8()); }
	)
	(
		{ before(grammarAccess.getProtocolsAccess().getAlternatives_8()); }
		(rule__Protocols__Alternatives_8)*
		{ after(grammarAccess.getProtocolsAccess().getAlternatives_8()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocols__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolsAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getProtocolsAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Protocols__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocols__Group_5__0__Impl
	rule__Protocols__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolsAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getProtocolsAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocols__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolsAccess().getRolesAssignment_5_1()); }
	(rule__Protocols__RolesAssignment_5_1)
	{ after(grammarAccess.getProtocolsAccess().getRolesAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__For_loop__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__For_loop__Group__0__Impl
	rule__For_loop__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFor_loopAccess().getForallKeyword_0()); }
	'forall'
	{ after(grammarAccess.getFor_loopAccess().getForallKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__For_loop__Group__1__Impl
	rule__For_loop__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFor_loopAccess().getNameAssignment_1()); }
	(rule__For_loop__NameAssignment_1)
	{ after(grammarAccess.getFor_loopAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__For_loop__Group__2__Impl
	rule__For_loop__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFor_loopAccess().getInKeyword_2()); }
	'in'
	{ after(grammarAccess.getFor_loopAccess().getInKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__For_loop__Group__3__Impl
	rule__For_loop__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFor_loopAccess().getRoleAssignment_3()); }
	(rule__For_loop__RoleAssignment_3)
	{ after(grammarAccess.getFor_loopAccess().getRoleAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__For_loop__Group__4__Impl
	rule__For_loop__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFor_loopAccess().getDoKeyword_4()); }
	'do'
	{ after(grammarAccess.getFor_loopAccess().getDoKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__For_loop__Group__5__Impl
	rule__For_loop__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFor_loopAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getFor_loopAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__For_loop__Group__6__Impl
	rule__For_loop__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFor_loopAccess().getGlobalsAssignment_6()); }
	(rule__For_loop__GlobalsAssignment_6)*
	{ after(grammarAccess.getFor_loopAccess().getGlobalsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__For_loop__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFor_loopAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getFor_loopAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Global_message__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Global_message__Group__0__Impl
	rule__Global_message__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGlobal_messageAccess().getTypeAssignment_0()); }
	(rule__Global_message__TypeAssignment_0)
	{ after(grammarAccess.getGlobal_messageAccess().getTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Global_message__Group__1__Impl
	rule__Global_message__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGlobal_messageAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getGlobal_messageAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Global_message__Group__2__Impl
	rule__Global_message__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGlobal_messageAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getGlobal_messageAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Global_message__Group__3__Impl
	rule__Global_message__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGlobal_messageAccess().getFromKeyword_3()); }
	'from'
	{ after(grammarAccess.getGlobal_messageAccess().getFromKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Global_message__Group__4__Impl
	rule__Global_message__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGlobal_messageAccess().getRoleAAssignment_4()); }
	(rule__Global_message__RoleAAssignment_4)
	{ after(grammarAccess.getGlobal_messageAccess().getRoleAAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Global_message__Group__5__Impl
	rule__Global_message__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGlobal_messageAccess().getToKeyword_5()); }
	'to'
	{ after(grammarAccess.getGlobal_messageAccess().getToKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Global_message__Group__6__Impl
	rule__Global_message__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGlobal_messageAccess().getRoleBAssignment_6()); }
	(rule__Global_message__RoleBAssignment_6)
	{ after(grammarAccess.getGlobal_messageAccess().getRoleBAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Global_message__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGlobal_messageAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getGlobal_messageAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Role__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Role__Group__0__Impl
	rule__Role__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Role__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoleAccess().getRoleKeyword_0()); }
	'role'
	{ after(grammarAccess.getRoleAccess().getRoleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Role__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Role__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Role__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoleAccess().getRoleAssignment_1()); }
	(rule__Role__RoleAssignment_1)
	{ after(grammarAccess.getRoleAccess().getRoleAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ProtocolsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getProtocolsProtocolsParserRuleCall_0()); }
		ruleProtocols
		{ after(grammarAccess.getModelAccess().getProtocolsProtocolsParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProtocolsAccess().getNameGENERAL_NAMETerminalRuleCall_2_0()); }
		RULE_GENERAL_NAME
		{ after(grammarAccess.getProtocolsAccess().getNameGENERAL_NAMETerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__RolesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProtocolsAccess().getRolesRoleParserRuleCall_4_0()); }
		ruleRole
		{ after(grammarAccess.getProtocolsAccess().getRolesRoleParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__RolesAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProtocolsAccess().getRolesRoleParserRuleCall_5_1_0()); }
		ruleRole
		{ after(grammarAccess.getProtocolsAccess().getRolesRoleParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__GlobalsAssignment_8_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProtocolsAccess().getGlobalsGlobal_messageParserRuleCall_8_0_0()); }
		ruleGlobal_message
		{ after(grammarAccess.getProtocolsAccess().getGlobalsGlobal_messageParserRuleCall_8_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocols__ForLoopAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProtocolsAccess().getForLoopFor_loopParserRuleCall_8_1_0()); }
		ruleFor_loop
		{ after(grammarAccess.getProtocolsAccess().getForLoopFor_loopParserRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFor_loopAccess().getNameGENERAL_NAMETerminalRuleCall_1_0()); }
		RULE_GENERAL_NAME
		{ after(grammarAccess.getFor_loopAccess().getNameGENERAL_NAMETerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__RoleAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFor_loopAccess().getRoleGENERAL_NAMETerminalRuleCall_3_0()); }
		RULE_GENERAL_NAME
		{ after(grammarAccess.getFor_loopAccess().getRoleGENERAL_NAMETerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__For_loop__GlobalsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFor_loopAccess().getGlobalsGlobal_messageParserRuleCall_6_0()); }
		ruleGlobal_message
		{ after(grammarAccess.getFor_loopAccess().getGlobalsGlobal_messageParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGlobal_messageAccess().getTypeTYPE_MESSAGETerminalRuleCall_0_0()); }
		RULE_TYPE_MESSAGE
		{ after(grammarAccess.getGlobal_messageAccess().getTypeTYPE_MESSAGETerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__RoleAAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGlobal_messageAccess().getRoleAGENERAL_NAMETerminalRuleCall_4_0()); }
		RULE_GENERAL_NAME
		{ after(grammarAccess.getGlobal_messageAccess().getRoleAGENERAL_NAMETerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Global_message__RoleBAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGlobal_messageAccess().getRoleBGENERAL_NAMETerminalRuleCall_6_0()); }
		RULE_GENERAL_NAME
		{ after(grammarAccess.getGlobal_messageAccess().getRoleBGENERAL_NAMETerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Role__RoleAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoleAccess().getRoleGENERAL_NAMETerminalRuleCall_1_0()); }
		RULE_GENERAL_NAME
		{ after(grammarAccess.getRoleAccess().getRoleGENERAL_NAMETerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_TYPE_MESSAGE : ('CFP'|'REJECT-PROPOSAL'|'ACCEPT-PROPOSAL');

RULE_GENERAL_NAME : ('A'..'Z')+ ('a'..'z')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
