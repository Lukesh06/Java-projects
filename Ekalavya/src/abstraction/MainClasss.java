package abstraction;

public class MainClasss {

	public static void main(String[] args) {
		
		MainClasss mainClass = new MainClasss();
		
		Animal animal = mainClass.getAnimal();
		
		System.out.println(animal instanceof Horse);
		
		System.out.println(animal instanceof Elephant);
		
		animal.eat();
		

	}
	
	
	private Animal getAnimal() {
		return new Elephant(10,10);
	}

}
