public class StaticDemo {

	public static void main(String[] args) {

		Child p = (Child) new Parent();

		System.out.println(p.method1());

	}
}

	class Parent {

		public static String method1() {
			return "I am parent";
		}

	}

class Child extends Parent{
	

	public static String  method1() {
		return "I am Child";
	}
	
}
