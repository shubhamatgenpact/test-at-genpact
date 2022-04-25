import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Price {

	String item;
	int price;

	public Price(String item, int price) {
		super();
		this.item = item;
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Price [item=" + item + ", price=" + price + "]";
	}

	public static void removeSmart(HashSet<Price> hPrices) {

		Iterator<Price> iterator = hPrices.iterator();
		while (iterator.hasNext()) {
			String fetchedItem = iterator.next().getItem();
			
			if(fetchedItem.contains("Smart")) {
				System.out.println(fetchedItem);
				iterator.remove();
			}
			
		}
		
		hPrices.forEach(System.out::println);
		
	}

}

public class HashhSet {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("first");
		hashSet.add("second");
		hashSet.add("third");

		System.out.println("hashset data");
		System.out.println(hashSet);

		// copy elements of HashSet to Array
		String[] arr = new String[hashSet.size()];
		hashSet.toArray(arr);

		System.out.println();

		System.out.println("copied array");
		System.out.println(Arrays.toString(arr));

	}
}
