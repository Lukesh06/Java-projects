package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		
		Student s1= new Student("Ashish", 12, "Indore");
		Student s2= new Student("Ramesh", 10, "Bhopal");
		Student s3= new Student("Dinesh", 11, "Agra");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		Collections.sort(studentList, new StudentNameComparator());
		
		//System.out.println(studentList);
		
		
		Set<Student>set = new TreeSet<>(new StudentNameComparator());
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set);
	}

}
