
public class Plants {
	
	boolean Alive;
	String name;
	
	Plants(){
		this.Alive = true;
	}
	void speak() {
		System.out.println("I don't speak");
	}
	String eat() {
		String eats = "The " + name + " is photosynthysing the sunlight ";
		return eats;
	}

}
