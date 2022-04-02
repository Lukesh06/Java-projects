package Java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamPredicateCustom {

	public static void main(String[] args) {

		Employee e1 = new Employee("Ramesh", "Pune");
		Employee e2 = new Employee("Gaurav", "Mumbai");
		Employee e3 = new Employee("Mohan", "Delhi");
		Employee e4 = new Employee("Sharad", "Pune");
		Employee e5 = new Employee("Shubham", "Banglore");
		Employee e6 = new Employee("Raghav", "Pune");

		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);

		list.stream().filter(employee -> employee.getCity().equalsIgnoreCase("Pune"))
				.map(employee -> {
					employee.setName(employee.getName().toUpperCase());
					return employee;
				}).forEach(obj -> System.out.print(obj));
		
		
		System.out.println();
		
		Map<String,List<Employee>> map = list.stream().collect(Collectors.groupingBy(employee->employee.getCity()));
		
		System.out.println(new TreeMap<>(map));
		
		
		

	}
	
	

}
