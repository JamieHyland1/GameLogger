import java.sql.Date;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		Game g = new Game();
		Print("Enter name of game: ");
		String name = in.nextLine();
		g.setName(name);
		Print("Enter Publisher of Game");
		String pub = in.nextLine();
		g.setPublisher(pub);
		Print("Enter price for the Game:");
		double price = in.nextDouble();
		g.setPrice(price);
		
		g.setRelease("08/11/1995");
		Print(g.toString());
	}
	//method for printing objects without having to write Sys.out
	public static void Print(Object o) {
	  System.out.print(o);	
	}
	
}
