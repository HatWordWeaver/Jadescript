package StartContractNet;

import java.util.Scanner;

import agents.Initiator;
import agents.Participant;
import jade.wrapper.ContainerController;
import jadescript.java.Jadescript;
import jadescript.util.JadescriptList;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try (Scanner scanner = new java.util.Scanner(System.in)){
					
					ContainerController container = Jadescript.newMainContainer(1099);
					
					// create Participant
					Participant.create(container, "1", 7, "PT1S");
					Participant.create(container, "2", 5, "PT15S");
					Participant.create(container, "3", 8, "PT2S");
					Participant.create(container, "4", 3, "PT5S");
					
					
					System.out.println("Participants created! "
							+ "Press any key to start the program");
					
					scanner.nextLine();
					
					// create Initiator 
					Initiator.create(container, "Paolo", JadescriptList.of(Jadescript.asAid("1"), 
							Jadescript.asAid("2"), Jadescript.asAid("3"), Jadescript.asAid("4")),
							10, 20, "ADD", 12);
				
					
				} catch(Exception ex) {
					ex.printStackTrace();
				}		
			}
		}

