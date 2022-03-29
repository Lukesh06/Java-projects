package collection;

public class Student {

	private String name;

	private Integer standard;

	private String city;
	
	

	public Student(String name, Integer standard, String city) {
		super();
		this.name = name;
		this.standard = standard;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStandard() {
		return standard;
	}

	public void setStandard(Integer standard) {
		this.standard = standard;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", standard=" + standard + ", city=" + city + "]";
	}

	
}
