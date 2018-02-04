import java.sql.Date;

public class Game {
	private String name;
	private String publisher;
	private String release;
	private double price;
	
	public Game() {
		//empty constructor 
	}
	
	public Game(String n, String pub, String r, double p) {
		this.name = n;
		this.publisher = pub;
		this.release = r;
		this.price = p;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Game [Name: " + name + ", Publisher: " + publisher + ", Release: " + release + ", Price: " + price + "]";
	}
}
