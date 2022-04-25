package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Products {
	int id;
	String name;
	float price;

	public Products(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

public class LambdaExpression {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("C++");
		list.add("javscript");
		list.add("python");
		list.add("Go");

		// lambda expression for for-each loop
		list.forEach((data) -> System.out.println(data));

		List<Products> list2 = new ArrayList<Products>();
		list2.add(new Products(101, "HP Laptop", 25000f));
		list2.add(new Products(102, "Keyboard", 300f));
		list2.add(new Products(103, "Dell Mouse", 150f));

		System.out.println("Sorting of products on the basis of name");
		Collections.sort(list2, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		list2.forEach((data) -> System.out.println(data));
	}
}
