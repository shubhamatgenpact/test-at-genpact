import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Employee> aList = new ArrayList<Employee>();
		aList.add(new Employee(1, "Shubham", 70000, 12));
		aList.add(new Employee(7, "Bhuvan", 20000, 5));
		aList.add(new Employee(11, "Mayank", 89000, 15));
		aList.add(new Employee(19, "Yash", 34000, 10));

		System.out.println("***Sort by Experience***");
		// aList.sort(Comparator.comparing(Employee::getEmpExp));
		// Collections.sort(aList, (emp1, emp2) -> Double.compare(emp1.getEmpExp(),
		// emp2.getEmpExp()));
		aList.forEach(System.out::println);

		System.out.println();

		System.out.println("***Sort by Name");
		aList.sort(Comparator.comparing(Employee::getEmpName));
		// Collections.sort(aList,(emp1,emp2)->emp1.getEmpName().compareTo(emp2.getEmpName()));
		aList.forEach(System.out::println);

		System.out.println();

		System.out.println("***Sort by Sal***");
		// aList.sort(Comparator.comparing(Employee::getEmpSal));
		// Collections.sort(aList, (emp1, emp2) -> emp1.getEmpSal()-emp2.getEmpSal());
		Collections.sort(aList,(emp1,emp2)->emp1.getEmpSal()-emp2.getEmpSal());
		aList.forEach(System.out::println);
         
		System.out.println();

	}

}

/*
 * create customer class enter -- create customer account no -- create cust name
 * -- create cust acct bal -- create premium customer list -- create updated
 * customer list -- put two operation withdraw and deposit and check bal
 * operation -- when customer going to withdraw three option will display
 */
