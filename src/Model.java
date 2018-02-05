import java.util.ArrayList;

public class Model {
	private static Model instance = null;
	public static Model getInstance() {
		if(instance == null) {
			instance = new Model();
		}
		return instance;
	}
	private ArrayList<Game> games = new ArrayList<Game>();
	 Model () {
		//create add Game method

		//create remove Game method
		
		//create view games method
		
		//create update games method
	}
	public boolean addGame(Game g) {
		try {
			//g.toString();
			this.games.add(g);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	public ArrayList<Game> viewGames(){
		return games;
	}
}
