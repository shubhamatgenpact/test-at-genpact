import java.util.HashSet;

public class MyHashSet {
	public static void main(String[] args) {
		HashSet<Price> hSet = new HashSet<Price>();
		hSet.add(new Price("Laptop", 70000));
		hSet.add(new Price("Smart Watch", 60000));
		hSet.add(new Price("Ipad", 80000));
		hSet.add(new Price("Smart Phone", 40000));
		hSet.add(new Price("Smart Ipad", 50000));

		for (Price price : hSet) {
			System.out.println(price);
		}

		Price duplicate = new Price("Laptop", 70000);
		System.out.println("\n****Inserting duplicate****");
		hSet.add(duplicate);

		System.out.println("****After insertion****");
		for (Price price : hSet) {
			System.out.println(price);
		}
		
		System.out.println();
		System.out.println("Removing smart");
		Price.removeSmart(hSet);

		
	}
}
