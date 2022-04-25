package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	float sal;

	public Employee(int id, String name, float sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

}

public class StreamsAPI {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "ram", 100000f));
		list.add(new Employee(102, "shyam", 200000f));
		list.add(new Employee(103, "vijay", 250000f));
		list.add(new Employee(104, "ajay", 155000f));
		list.add(new Employee(105, "aman", 167000f));

		// lambda expression for for-each
		list.forEach((data) -> System.out.println(data));

		System.out.println();

		List<Float> salary = list.stream().filter(emp -> emp.sal > 100000f).map(emp -> emp.sal)
				.collect(Collectors.toList());
		System.out.println(salary);

		// filtering those employee names which starts with 'a'
		List<Employee> collect = list.stream().filter(nm -> nm.name.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect);

		// check if anyname present in the list start with s or not
		boolean anyMatch = list.stream().anyMatch((b) -> b.name.startsWith("s"));
		System.out.println(anyMatch);

		// check if all name
		boolean anyMatch2 = list.stream().allMatch((b) -> b.name.startsWith("s"));
		System.out.println(anyMatch2);

		// count those names which start with a
		long count = list.stream().filter(nm -> nm.name.startsWith("a")).count();
		System.out.println(count);

		list.stream().map(s -> s.name).sorted().map(String::toUpperCase).forEach(System.out::println);

		System.out.println();

		list.stream().sorted((s1, s2) -> s1.name.compareTo(s2.name)).forEach(System.out::println);

		List<String> asList = Arrays.asList("abc", "ghi", "jkl");

		// flatmap convert 2d array into single list
		String[][] arr = new String[][] { { "a", "b" }, { "x", "y" }, { "r", "t" } };
		List<String[]> asList2 = Arrays.stream(arr).collect(Collectors.toList());

	}
}
