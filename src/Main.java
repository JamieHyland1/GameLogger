import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		Model m = Model.getInstance();
		int choice,delete;
		Game g = new Game();
//		Print("=======================================================================================");
//	    Print("---------------------------------GAME LOGGER-------------------------------------------");
//	    Print("=======================================================================================");
	    do {
	    	Print("1. Add Game."
	    			+ "\n2. View Games."
	    			+ "\n3. Exit.");
	    	choice = in.nextInt();
	    	switch(choice) {
		    	case 1:
		    		if(addGame(in,m) == true) {
		    			Print("The game was added succesfully ");
		    		}else {
		    			Print("The game was not added, please try again");
		    		}
		    		
		    		break;
		    	case 2:
		    		viewGames(m);
		    		break;
	    	}
	    	
	    }while(choice != 3); {
	    	Print("Goodbye");
	    }
		
	}
	private static void viewGames(Model m) {
		try {
			ArrayList<Game> gList = m.viewGames();
			for(Game g : gList) {
				Print(g.toString());
			}
		}
		catch(NullPointerException e) {
			Print("No Games have been added");
		}
		
	}
	
	
	private static Boolean addGame(Scanner in, Model m) {
		Print("=======================================================");
		Print("Enter name of game:");
		String n = in.nextLine();
		Print("=======================================================");
		Print("Enter game publisher:");
		String pub = in.nextLine();
		Print("=======================================================");
		Print("Enter Price:");
		double p = in.nextDouble();
		Print("=======================================================");
		Print("Enter in release date: (dd/mm/yyyy)");
		String d = in.nextLine();
		Print("=======================================================");
		Game g = new Game(n,pub,d,p);
		//Print(g.toString());
		return m.addGame(g);
	}
	
	//method for printing objects without having to write Sys.out
	public static void Print(Object o) {
	  System.out.println(o);	
	}
	
}
