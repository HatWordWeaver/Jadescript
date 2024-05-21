/*
 * generated by Xtext 2.34.0
 */
package org.xtext.globaltype.globaljade.validation;

import java.util.HashMap;
import java.util.ArrayList;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.xtext.globaltype.globaljade.globalJade.MultipleRole;
import org.xtext.globaltype.globaljade.globalJade.OneRole;
import org.xtext.globaltype.globaljade.globalJade.Roles;
import org.xtext.globaltype.globaljade.globalJade.Role;
import org.xtext.globaltype.globaljade.globalJade.Choice_rule;
import org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage;
import org.xtext.globaltype.globaljade.globalJade.For_loop;
import org.xtext.globaltype.globaljade.globalJade.Message;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class GlobalJadeValidator extends AbstractGlobalJadeValidator {
	
	//HashMap<MultipleRole, OneRole> references;
	ArrayList<String> multipleRoles = new ArrayList<>();
	
	@Check
	public void setupMultipleRoles(Roles roles) {
		for(Role r: roles.getRoles()) {
			if(r instanceof MultipleRole) {
				String name = ((MultipleRole) r).getRef().getName();
				if(!multipleRoles.contains(name))
					multipleRoles.add(name);
				
			}
		}
	}
	
	@Check
	public void notRolesWithSameName(Roles roles) {
		ArrayList<String> allRoles = new ArrayList<>();
		for(Role r: roles.getRoles()) {
			if(!allRoles.contains(r.getName()))
				allRoles.add(r.getName());
			else
				error("Ruolo gia' dichiarato", null, GlobalJadePackage.ROLES__ROLES);
		}
	}
	


	
	@Check
	public void choiceMessageFromTheChoiceAgent(Choice_rule c) {
		if(!c.getRole_name().equals(c.getMessages().get(0).getSender())) {
			error("aspettavo: " + c.getRole_name() + " ma ho trovato: " + c.getMessages().get(0).getSender(),
					null,
					GlobalJadePackage.CHOICE_RULE);
		}
	}
	
	@Check
	public void checkForAgentExistent(For_loop f) {
		
		if(!multipleRoles.contains(f.getRoleTarget())){
			error("Trovato" + f.getRoleTarget() + 
					"Deve essere iterato un ruolo multiplo",
					null,
					GlobalJadePackage.FOR_LOOP__NAME);
		}
	}
	
	@Check
	public void checkMessageDestination(Message message) {
		if(message.getSender().equals(message.getReceiver()))
			error("Non si puo' mandare un messaggio allo stesso ruolo",
					null,
					GlobalJadePackage.MESSAGE);
	}
	
	@Check
	public void checkRecursionClosed(Message message) {
		if(multipleRoles.contains(message.getSender())) {
			error("Il ruolo multiplo non puo' mandare messaggi", null, GlobalJadePackage.MESSAGE__SENDER);
		}
	}
	
}