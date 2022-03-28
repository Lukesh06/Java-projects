package staticDemo;

public class Student {

	private int rollNumber;
	
	private String Name;
	
	private static String collage;
	
	static {
		collage = "LNCT";
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public static String getCollage() {
		return collage;
	}
	public static void setCollage(String collage) {
		Student.collage = collage;
	}
	
	
	
}
