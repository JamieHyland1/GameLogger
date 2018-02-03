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
	private Model () {
		//create add Game method
		
		//create remove Game method
		
		//create view games method
		
		//create update games method
	}
}
