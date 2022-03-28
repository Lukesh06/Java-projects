package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<> ();
		
		list.add("Ashish");
		list.add("Gaurav");
		list.add("Ramesh");
		list.add("Dinesh");
	
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<> ();
		
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		
		list.addAll(3,list2);
		
		Collections.sort(list);
		
	//	System.out.println(list);
		
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	/*	
		
		for(String name:list) {
			System.out.println("Name is :: "+name);
		}
		
		
		
		
		ArrayList<Employee> listOfEmployee = new ArrayList<>();
		
		Employee e1= new Employee("Ashish", 101);
		Employee e2= new Employee("Gaurav", 102);
		Employee e3= new Employee("Ramesh", 103);
		Employee e4= new Employee("Dinesh", 104);
		
		listOfEmployee.add(e1);
		listOfEmployee.add(e2);
		listOfEmployee.add(e3);
		listOfEmployee.add(e4);
		
		
		
		
		for(Employee employee:listOfEmployee) {
			//System.out.println("Name is ::"+employee.getName()+" And Id is::"+employee.getEmpId());
		}
		
	*/	

	}

}
