package start;

import java.util.Scanner;

import jadescript.java.Jadescript;
import jade.wrapper.ContainerController;
import FIPArequest.agents.Initiator;
import FIPArequest.agents.Partecipant;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new java.util.Scanner(System.in)){
			
			
			ContainerController container = Jadescript.newMainContainer(1099);
			
			// create Partecipant
			Partecipant.create(container, "Partecipant");
			
			
			System.out.println("Partecipant created! "
					+ "Press any key to start the program");
			
			scanner.nextLine();

			/*
			 * > 1: string for naming the Initiator;
			 * > 2: boolean for notification or not;
			 * > 3: number for conversation id;
			 * > 4: first value of operation;
			 * > 5: second value of operation;
			 * > 6: operation requested. They are accepted:
			 * 		"ADD", "SUB", "MUL", "DIV".
			 *  	others strings are refused and cause a not agree message on request.
			 */
			
			// create Initiator 
			Initiator.create(container, 
					"Initiator", true, 3, 3, 9, "MUL");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}

