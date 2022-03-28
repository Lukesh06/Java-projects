package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemoWithCustomValue {

	public static void main(String[] args) {

		
		Map<Integer,Employee> map = new HashMap<>();

		Employee e1= new Employee("Ashish", 101);
		Employee e2= new Employee("Gaurav", 102);
		Employee e3= new Employee("Ramesh", 103);
		Employee e4= new Employee("Dinesh", 104);
		Employee e5= new Employee("Ashish", 101);
		
		
		map.put(1000,e1);
		map.put(2000,e2);
		map.put(3000,e3);
		map.put(4000,e4);
		map.put(5000,e5);
		
		
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	

	}

}
