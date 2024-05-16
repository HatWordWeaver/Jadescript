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
import org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage;
import org.xtext.globaltype.globaljade.globalJade.Model;
import org.xtext.globaltype.globaljade.globalJade.Protocols;
import org.xtext.globaltype.globaljade.globalJade.Role;
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
			case GlobalJadePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case GlobalJadePackage.PROTOCOLS:
				sequence_Protocols(context, (Protocols) semanticObject); 
				return; 
			case GlobalJadePackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     protocols+=Protocols+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Protocols returns Protocols
	 *
	 * Constraint:
	 *     (name=GENERAL_NAME roles+=Role+)
	 * </pre>
	 */
	protected void sequence_Protocols(ISerializationContext context, Protocols semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     role=GENERAL_NAME
	 * </pre>
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GlobalJadePackage.Literals.ROLE__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlobalJadePackage.Literals.ROLE__ROLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleAccess().getRoleGENERAL_NAMETerminalRuleCall_1_0(), semanticObject.getRole());
		feeder.finish();
	}
	
	
}
