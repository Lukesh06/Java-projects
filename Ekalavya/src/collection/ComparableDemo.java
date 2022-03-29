package collection;

import java.util.Set;
import java.util.TreeSet;

public class ComparableDemo {
	
	static Set<Employee> set  = new TreeSet<>();
	
	public static void main(String[] args) {
		
		Employee e1= new Employee("Ashish", 101);
		Employee e2= new Employee("Gaurav", 105);
		Employee e3= new Employee("Ramesh", 103);
		Employee e4= new Employee("Dinesh", 104);
		Employee e5= new Employee("Mahesh", 102);
		
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		System.out.println(set);

	}

}
