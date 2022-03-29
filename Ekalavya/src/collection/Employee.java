package collection;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

	private String name;

	private Integer empId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Employee(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.empId);
	}

	@Override
	public boolean equals(Object obj) {

		Employee employee =  (Employee) obj;

		return (employee.getEmpId() == this.empId && employee.getName().equals(this.name));

	}

	@Override
	public int compareTo(Employee employee) {
		return this.empId.compareTo(employee.empId);
	}

}
