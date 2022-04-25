package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		
		System.out.println(hmap.isEmpty());

		hmap.put(1, "Monday");
		hmap.put(2, "Wednesday");
		hmap.put(10, "Black");
		hmap.put(4, "Red");

		System.out.println(hmap);
		System.out.println(hmap.size());

		hmap.put(2, "Pink");
		hmap.put(3, "Green");
		hmap.put(5, "Baby Pink");

		hmap.replace(2, "wednesday","monday");
		System.out.println(hmap);
		System.out.println(hmap.size());

		Iterator<Entry<Integer, String>> iterator = hmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next);
		}
	}
}
