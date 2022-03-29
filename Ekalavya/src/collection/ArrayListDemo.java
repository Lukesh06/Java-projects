package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Employee> listOfEmployee = new ArrayList<>();

		Employee e1 = new Employee("Ashish", 102);
		Employee e2 = new Employee("Gaurav", 104);
		Employee e3 = new Employee("Ramesh", 103);
		Employee e4 = new Employee("Dinesh", 101);

		listOfEmployee.add(e1);
		listOfEmployee.add(e2);
		listOfEmployee.add(e3);
		listOfEmployee.add(e4);
		
		Collections.sort(listOfEmployee);
		
		System.out.println(listOfEmployee);

	}

}
