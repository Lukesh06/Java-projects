package collection;

import java.util.Comparator;

public class StudentNameAndCityComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		int result = s1.getName().compareTo(s2.getName());

		if (result == 0) {
			result = s1.getCity().compareTo(s2.getCity());
		}

		if(result ==0) {
			result = s1.getStandard().compareTo(s2.getStandard());
		}
		
		return result;

	}

}
