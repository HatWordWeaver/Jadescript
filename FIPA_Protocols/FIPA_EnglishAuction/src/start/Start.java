package start;

import java.util.Scanner;

import agents.Auctioneer;
import agents.Bidder;
import jade.wrapper.ContainerController;
import jadescript.java.Jadescript;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new java.util.Scanner(System.in)){
			
			ContainerController container = Jadescript.newMainContainer(1099);
			
			// create Partecipant
			Auctioneer.create(container, "Auctioneer", "Gigio", 10);
			
			
			System.out.println("Auctioneer created! "
					+ "Press any key to start the program");
			
			scanner.nextLine();
			
			// create Initiator 
			Bidder.create(container, 
					"Pietro", 60);
			
			Bidder.create(container, 
					"Paolo", 50);
			
			Bidder.create(container, 
					"Petrox", 70);
			
			Bidder.create(container, 
					"Abbiate", 76);
			
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}		
	}
}
