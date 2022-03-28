package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemoWithCustomKey {

	public static void main(String[] args) {
		
		Map<Employee,Integer> map = new HashMap<>();

		Employee e1= new Employee("Ashish", 101);
		Employee e2= new Employee("Gaurav", 102);
		Employee e3= new Employee("Ramesh", 103);
		Employee e4= new Employee("Dinesh", 104);
		Employee e5= new Employee("Ashish", 101);
		
		
		map.put(e1, 1000);
		map.put(e2, 2000);
		map.put(e3, 3000);
		map.put(e4, 4000);
		map.put(e5, 5000);
		
		
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
