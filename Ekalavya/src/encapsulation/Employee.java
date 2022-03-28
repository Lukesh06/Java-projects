package encapsulation;

public class Employee {

	private int salary;
	private int age;
	private String name;

	public int getSalary() {
		// validate - Authorized
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			throw new RuntimeException("Age is not valid");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void doYourJob(String job) {
		System.out.println("My Job is :::" + job);
	}

	public void addBonus(int bonus) {
		if (bonus > 0) {
			salary = salary + bonus;
		}
	}

}
