package contructor;

public class Student {

	private int rollNumber;
	
	private String name;
	
	private static String collage;
	
	static {
		collage = "LNCT";
	}
	
	Student(String name, int rollNumber){
		this.name = name;
		this.rollNumber = rollNumber;
	}

	private Student() {
	}
	
	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public static String getCollage() {
		return collage;
	}
	
	
}
