import java.util.Random;
public class Map {
	
	public static void main(String[] args) {
		
		Animal animal[] = new Animal[50];
		Plants plant[] = new Plants[50];
		
		for(int count =0 ; count<50 ; count ++){
			Random random = new Random();
			int randomAnimal = random.nextInt(11);
			
			switch (randomAnimal) {
			case 0:
				animal[count] = new Mouse();
				break;
			case 1:
				animal[count] = new Rabbit();
				break;
			case 2: 
				animal[count] = new Deer();
				break;
			case 3:
				animal[count] = new Wolf();
				break;
			case 4:
				animal[count] = new Hawk();
				break;
			case 5:
				animal[count] = new Caterpillar();
				break;
			case 6:
				animal[count] = new Bluejay();
				break;
			case 7:
				animal[count] = new Grasshopper();
				break;
			case 8:
				animal[count] = new Fox();
				break;
			case 9:
				animal[count] = new Squirrel();
				break;
			case 10:
				plant[count] = new Grass();
				break;
			case 11:
				plant[count] = new Tree();
				break;
			}	
		}
		
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(int row = 0 ; row< 5 ; row++){
			System.out.print("| ");
			for(int column =0; column< 10 ;column ++) {
				if(animal[row+column] != null) {
				System.out.print(animal[row+column].name + ':');
				System.out.print(animal[row+column].eat() + "  |  ");
				}
				else {
					System.out.print(plant[row+column].name + ':');
					System.out.print(plant[row+column].eat() + "  |  ");
				}
			}
			System.out.println(' ');
			
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
	}

}
