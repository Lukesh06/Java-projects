package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(99, "Ramesh");
		map.put(2, "Gaurav");
		map.put(3, "Manish");
		map.put(4, "Shyam");
		map.put(5, "Mohit");
		map.putIfAbsent(1, "Deepak");
		map.put(6, "Mohit");
		map.put(7, "Mohit");

		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
