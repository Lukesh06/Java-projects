package staticDemo;

public class StaticDemo {

	private static Student createStudent(String name, int rollNumber) {
		Student student = new Student();
		student.setName(name);
		student.setRollNumber(rollNumber);
		return student;
	}

	private void printStudentData(Student student) {

		System.out.println("Name::" + student.getName());
		System.out.println("Roll Number::" + student.getRollNumber());
		System.out.println("Collage::" + student.getCollage());
		System.out.println("********************************");
	}

	static {
		System.out.println("static block is invoked");
	}

	public static void main(String[] args) {

		StaticDemo staticDemo = new StaticDemo();

		Student s1 = createStudent("Gaurav", 100);
		s1.setName("*******************************");

		Student s2 = createStudent("Rahul", 101);
		staticDemo.printStudentData(s1);
		s2.setCollage("Oriental");

		Student s3 = createStudent("Ajay", 102);

		Student s4 = createStudent("Shekhar", 103);

		staticDemo.printStudentData(s2);
		staticDemo.printStudentData(s3);
		staticDemo.printStudentData(s4);
	}

}
