import java.util.ArrayList;

public class Model {
	private static Model instance = null;
	public static Model getInstance() {
		if(instance == null) {
			instance = new Model();
		}
		return instance;
	}
	private ArrayList<Game> games;
	 Model () {
		//create add Game method
		
			
		
		//create remove Game method
		
		//create view games method
		
		//create update games method
	}
	public boolean addGame(Game g) {
		if(g != null) {
			games.add(g);
			return true;
		}
		else {
			return false;
		}
	}
	public ArrayList<Game> viewGames(){
		return games;
	}
}
