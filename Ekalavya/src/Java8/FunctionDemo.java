package Java8;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer,Boolean> f1 = a-> a%2==0;
		
		System.out.println(f1.apply(5));
		
		// 
		
		Function<String,ArrayList<Integer>> f2 = s1 -> {
			ArrayList<Integer> list = new ArrayList<>();
			String[] str = s1.split(" ");
			list.add(Integer.valueOf(str[0]));
			list.add(Integer.valueOf(str[1]));
			return list;
		};
		
		System.out.println( f2.apply("12 13"));
	}
	
}
