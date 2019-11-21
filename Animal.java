
public class Animal {
	boolean Alive;
	String name;
	
	Animal(){
		this.Alive = true;
	}
	void speak() {
		System.out.println("SOUND");
	}
	String eat() {
		String eats = "The " + name + " is eating";
		return eats;
	}
	
	
}
