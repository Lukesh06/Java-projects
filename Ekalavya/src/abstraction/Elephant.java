package abstraction;

public class Elephant extends Animal{

	Elephant(int colour, int noOfLegs) {
		super(colour, noOfLegs);
	}

	@Override
	public void eat() {
		System.out.println("Elephant is eating");
		
	}

}
