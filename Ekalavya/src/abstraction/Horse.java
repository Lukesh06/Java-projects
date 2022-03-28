package abstraction;

public class Horse extends Animal{

	Horse(int colour, int noOfLegs) {
		super(colour, noOfLegs);
	}

	@Override
	public void eat() {
		System.out.println("Horse is eating");
	}

	
}
