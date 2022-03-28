package encapsulation;

public class MainClass {

	public static void main(String[] args) {

		MainClass mainClass = new MainClass();

		Employee employee1 = mainClass.setEmployeeData(25, 4000, "Ashish");
		
		mainClass.printEmployeeData(employee1);

		Employee employee2 = mainClass.setEmployeeData(30, 4500, "Gaurav");

		mainClass.printEmployeeData(employee2);

		Employee employee3 = mainClass.setEmployeeData(35, 5500, "Amit");

		mainClass.printEmployeeData(employee3);
		
		employee3.addBonus(500);
		
		System.out.println(employee3.getSalary());
	}

	public Employee setEmployeeData(int age, int salary, String name) {

		Employee employee = new Employee();

		employee.setAge(age);
		employee.setName(name);
		employee.setSalary(salary);

		return employee;
	}

	public void printEmployeeData(Employee employee) {

		System.out.println("Name is ::: " + employee.getName());
		System.out.println("Age is ::: " + employee.getAge());
		System.out.println("Salary is ::: " + employee.getSalary());
		System.out.println("****************");

	}

}
