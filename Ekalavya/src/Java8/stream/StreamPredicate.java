package Java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPredicate {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		
		for(int a=1;a<=10;a++) {
			list.add(a);
		}
		
		//list.add(2);
		//list.add(4);
		
		//System.out.println(list);

		//Set<Integer> listOfEvenNumbers = list.stream().filter(i->i%2==0).map(i->i*10).filter(i->i<50).collect(Collectors.toSet());
		
		//System.out.println(listOfEvenNumbers);
		
		
		Map<Boolean,List<Integer>> map =
				list.stream().collect(Collectors.partitioningBy(i->i%2==0));
		
		System.out.println(map);
		
	}

}
