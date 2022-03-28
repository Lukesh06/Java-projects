package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Employee> set = new HashSet<>();

		Employee e1= new Employee("Ashish", 101);
		Employee e2= new Employee("Gaurav", 102);
		Employee e3= new Employee("Ramesh", 103);
		Employee e4= new Employee("Dinesh", 104);
		Employee e5= new Employee("Ashish", 101);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
	
		for(Employee abc : set) {
			System.out.println(abc.getEmpId());
		}
		

	}

}
