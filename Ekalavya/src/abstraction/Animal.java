package abstraction;

public abstract class Animal {

	int colour;
	int noOfLegs;
	
	abstract public void eat();
	
	public void breathing() {
		System.out.println("Animal is breathing");
		System.out.println(colour);
	}
	
	Animal(int colour, int noOfLegs){
		this.colour = colour;
		this.noOfLegs = noOfLegs;
	}
	
}
