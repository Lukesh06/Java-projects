package Java8;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = a -> a%2 == 0;
		
		System.out.println(p1.test(15));
		
		// Name Shweta 
		
		Predicate<String> p2 = s1-> s1.equalsIgnoreCase("Shweta");
		
		if(p2.test("Shweta2")) {
			System.out.println("Shweta");
		}else {
			System.out.println("This is not shweta");
		}
		
		
		
	}

}
