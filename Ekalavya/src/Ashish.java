
public class Ashish {

	final int a = 10;
	final int b = 10;
	
	public  void sayHi() {
	
		System.out.println("Hii from Ashish"+a);
	}
	
	public void sayHi(String a) {
		System.out.println("Hii from Ashish");
	}
}

class AshiShChild extends Ashish {
	
	public void sayHi() {
		System.out.println("Hello from Ashish");
	}
}