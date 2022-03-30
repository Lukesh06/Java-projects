package collection;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		Set<Integer> set2 = new TreeSet<>(new IntegerDescendingComparator());
		
		set2.add(25);
		set2.add(30);
		set2.add(-8);
		set2.add(5);
		
		System.out.println(set2);
		
		Student s1= new Student("Ashish", 25, "Bhopal");
		Student s2= new Student("Ashish", 10, "Bhopal");
		Student s3= new Student("Ashish", 5, "Gwalior");
		Student s4= new Student("Ramesh", 5, "Gwalior");
		
		Set<Student>set = new TreeSet<>(new StudentNameAndCityComparator());
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		System.out.println(set);
	}

}
