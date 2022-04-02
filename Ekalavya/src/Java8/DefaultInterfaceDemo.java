package Java8;

interface I1{

	default String sayHi() {
		return "Hi";
	}
}


interface I2{

	default String sayHi() {
		return "Hello";
	}
}


public class DefaultInterfaceDemo implements I1, I2{

	public static void main(String[] args) {
		
		I1 obj =  new DefaultInterfaceDemo();
		System.out.println(obj.sayHi());

	}
	
	@Override
	public String sayHi() {
		return I2.super.sayHi();
	}

}
