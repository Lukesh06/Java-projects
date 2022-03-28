package oopsConcepts;

public class Inheritance {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Number result = animal.addition(10, 5);
		System.out.println(result);
		
		result = animal.addition(10, 5, 20);
		System.out.println(result);
		
		Animal horse = new Horse();
		result = horse.addition(5, 10);
		System.out.println(result);
	}

}

class Animal {
	public void breathing() {
		System.out.println("Breathing::::");
	}

	protected void eating() {
		System.out.println("Eating::::");
	}

	public Number addition(int a, int b) {
		return a + b;
	}

	public Number addition(int a, int b, int c) {
		return a + b + c;
	}

}

class Horse extends Animal {

	public void running() {
		System.out.println("Horse is running");
	}

	@Override
	public Integer addition(int a, int b) {
		return a * b;
	}

	@Override
	public void eating() {
		System.out.println("Horse is Eating::::");

	}

	public String sayHi() {
		return "Hi";
	}

	public String sayHello() {
		return "Hello";
	}
}
