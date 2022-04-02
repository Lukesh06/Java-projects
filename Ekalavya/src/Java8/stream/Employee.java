package Java8.stream;

public class Employee implements Comparable<Employee> {

	private String name;

	private String city;

	public Employee(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Employee e1) {

		return this.city.compareTo(e1.city);
	}

}
