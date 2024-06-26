/*
 * generated by Xtext 2.34.0
 */
package org.xtext.globaltype.globaljade.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.globaltype.globaljade.globalJade.Choice;
import org.xtext.globaltype.globaljade.globalJade.CloseRecursion;
import org.xtext.globaltype.globaljade.globalJade.ForEach;
import org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage;
import org.xtext.globaltype.globaljade.globalJade.Message;
import org.xtext.globaltype.globaljade.globalJade.Model;
import org.xtext.globaltype.globaljade.globalJade.Payload;
import org.xtext.globaltype.globaljade.globalJade.Protocol;
import org.xtext.globaltype.globaljade.globalJade.Recursion;
import org.xtext.globaltype.globaljade.globalJade.RoleMultiple;
import org.xtext.globaltype.globaljade.globalJade.RoleOne;
import org.xtext.globaltype.globaljade.globalJade.Roles;
import org.xtext.globaltype.globaljade.services.GlobalJadeGrammarAccess;

@SuppressWarnings("all")
public class GlobalJadeSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GlobalJadeGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GlobalJadePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GlobalJadePackage.CHOICE:
				sequence_Choice(context, (Choice) semanticObject); 
				return; 
			case GlobalJadePackage.CLOSE_RECURSION:
				sequence_CloseRecursion(context, (CloseRecursion) semanticObject); 
				return; 
			case GlobalJadePackage.FOR_EACH:
				sequence_ForEach(context, (ForEach) semanticObject); 
				return; 
			case GlobalJadePackage.MESSAGE:
				sequence_Message(context, (Message) semanticObject); 
				return; 
			case GlobalJadePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case GlobalJadePackage.PAYLOAD:
				sequence_Payload(context, (Payload) semanticObject); 
				return; 
			case GlobalJadePackage.PROTOCOL:
				sequence_Protocol(context, (Protocol) semanticObject); 
				return; 
			case GlobalJadePackage.RECURSION:
				sequence_Recursion(context, (Recursion) semanticObject); 
				return; 
			case GlobalJadePackage.ROLE_MULTIPLE:
				sequence_RoleMultiple(context, (RoleMultiple) semanticObject); 
				return; 
			case GlobalJadePackage.ROLE_ONE:
				sequence_RoleOne(context, (RoleOne) semanticObject); 
				return; 
			case GlobalJadePackage.ROLES:
				sequence_Roles(context, (Roles) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Choice returns Choice
	 *
	 * Constraint:
	 *     (role=NAME messages+=Message branch+=Protocol (messages+=Message branch+=Protocol)*)
	 * </pre>
	 */
	protected void sequence_Choice(ISerializationContext context, Choice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CloseRecursion returns CloseRecursion
	 *
	 * Constraint:
	 *     recursionVariable=[Recursion|NAME]
	 * </pre>
	 */
	protected void sequence_CloseRecursion(ISerializationContext context, CloseRecursion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GlobalJadePackage.Literals.CLOSE_RECURSION__RECURSION_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalJadePackage.Literals.CLOSE_RECURSION__RECURSION_VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCloseRecursionAccess().getRecursionVariableRecursionNAMETerminalRuleCall_1_0_1(), semanticObject.eGet(GlobalJadePackage.Literals.CLOSE_RECURSION__RECURSION_VARIABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ForEach returns ForEach
	 *
	 * Constraint:
	 *     (eachRole=Role role=[RoleMultiple|NAME] branch=Protocol)
	 * </pre>
	 */
	protected void sequence_ForEach(ISerializationContext context, ForEach semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GlobalJadePackage.Literals.FOR_EACH__EACH_ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalJadePackage.Literals.FOR_EACH__EACH_ROLE));
			if (transientValues.isValueTransient(semanticObject, GlobalJadePackage.Literals.FOR_EACH__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalJadePackage.Literals.FOR_EACH__ROLE));
			if (transientValues.isValueTransient(semanticObject, GlobalJadePackage.Literals.FOR_EACH__BRANCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalJadePackage.Literals.FOR_EACH__BRANCH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForEachAccess().getEachRoleRoleParserRuleCall_1_0(), semanticObject.getEachRole());
		feeder.accept(grammarAccess.getForEachAccess().getRoleRoleMultipleNAMETerminalRuleCall_3_0_1(), semanticObject.eGet(GlobalJadePackage.Literals.FOR_EACH__ROLE, false));
		feeder.accept(grammarAccess.getForEachAccess().getBranchProtocolParserRuleCall_5_0(), semanticObject.getBranch());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Message returns Message
	 *
	 * Constraint:
	 *     (type=MessageType payload=Payload? sender=NAME receiver=NAME)
	 * </pre>
	 */
	protected void sequence_Message(ISerializationContext context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (protocolName=NAME roles=Roles protocol=Protocol)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GlobalJadePackage.Literals.MODEL__PROTOCOL_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalJadePackage.Literals.MODEL__PROTOCOL_NAME));
			if (transientValues.isValueTransient(semanticObject, GlobalJadePackage.Literals.MODEL__ROLES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalJadePackage.Literals.MODEL__ROLES));
			if (transientValues.isValueTransient(semanticObject, GlobalJadePackage.Literals.MODEL__PROTOCOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalJadePackage.Literals.MODEL__PROTOCOL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getProtocolNameNAMETerminalRuleCall_2_0(), semanticObject.getProtocolName());
		feeder.accept(grammarAccess.getModelAccess().getRolesRolesParserRuleCall_4_0(), semanticObject.getRoles());
		feeder.accept(grammarAccess.getModelAccess().getProtocolProtocolParserRuleCall_7_0(), semanticObject.getProtocol());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Payload returns Payload
	 *
	 * Constraint:
	 *     (types+=Type types+=Type*)
	 * </pre>
	 */
	protected void sequence_Payload(ISerializationContext context, Payload semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Protocol returns Protocol
	 *
	 * Constraint:
	 *     (actions+=Message | actions+=Choice | actions+=ForEach | actions+=Recursion | actions+=CloseRecursion)*
	 * </pre>
	 */
	protected void sequence_Protocol(ISerializationContext context, Protocol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Recursion returns Recursion
	 *
	 * Constraint:
	 *     name=NAME
	 * </pre>
	 */
	protected void sequence_Recursion(ISerializationContext context, Recursion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GlobalJadePackage.Literals.RECURSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalJadePackage.Literals.RECURSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRecursionAccess().getNameNAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Role returns RoleMultiple
	 *     RoleMultiple returns RoleMultiple
	 *
	 * Constraint:
	 *     (name=NAME ref=[RoleOne|NAME])
	 * </pre>
	 */
	protected void sequence_RoleMultiple(ISerializationContext context, RoleMultiple semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GlobalJadePackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalJadePackage.Literals.ROLE__NAME));
			if (transientValues.isValueTransient(semanticObject, GlobalJadePackage.Literals.ROLE_MULTIPLE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalJadePackage.Literals.ROLE_MULTIPLE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleMultipleAccess().getNameNAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoleMultipleAccess().getRefRoleOneNAMETerminalRuleCall_3_0_1(), semanticObject.eGet(GlobalJadePackage.Literals.ROLE_MULTIPLE__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Role returns RoleOne
	 *     RoleOne returns RoleOne
	 *
	 * Constraint:
	 *     name=NAME
	 * </pre>
	 */
	protected void sequence_RoleOne(ISerializationContext context, RoleOne semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GlobalJadePackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalJadePackage.Literals.ROLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleOneAccess().getNameNAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Roles returns Roles
	 *
	 * Constraint:
	 *     (roles+=Role roles+=Role*)
	 * </pre>
	 */
	protected void sequence_Roles(ISerializationContext context, Roles semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
