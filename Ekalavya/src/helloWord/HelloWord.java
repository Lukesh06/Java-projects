package helloWord;

public class HelloWord {

	int a = 10; // Instance Variable
	
	static int c = 10; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b =20; // local variable
		
		System.out.println(b);
		
		NewClass newClass = new NewClass();
		newClass.test();
	}

}

class NewClass{
	
	 public void test() {
		System.out.println("Hii");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hii from New Class");
	}
	
}

