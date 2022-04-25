import java.util.HashMap;
import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("Mumbai");
		list.add("Pune");
		list.add("Nagar");
		list.add("Nashik");

		System.out.println(list);
		list.add("Kolhapur");
		System.out.println(list);

		list.add(null);
		list.add(null);
		list.add("Mumbai");
		System.out.println(list);

	}
}
