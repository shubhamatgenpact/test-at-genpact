import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class MobileNumber {
	private String number;

	public MobileNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}

class Address {
	private String zipcode;

	public Address(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}

class TempStudent {
	public String name;
	public int age;
	public Address address;
	public List<MobileNumber> mobileNumbers;

	public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}

}

class Student {
	private String name;
	private int age;
	private Address address;
	private List<MobileNumber> mobileNumbers;

	public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<MobileNumber> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", mobileNumbers=" + mobileNumbers
				+ "]";
	}

}

public class HandsOn {

	public static void main(String[] args) {

		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student2 = new Student("shubham", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("5555"), new MobileNumber("9999"), new MobileNumber("1211")));

		Student student3 = new Student("pankaj", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Student> students = Arrays.asList(student1, student2, student3);

		// Get student with exact match name "jayesh"
		List<String> collect = students.stream().filter(stu -> stu.getName().equals("Jayesh")).map(stu -> stu.getName())
				.collect(Collectors.toList());
		System.out.println(collect);

		// Get student with matching address "1235"
		System.out.println();
		System.out.println("Get student with matching address 1235");
		List<String> collect3 = students.stream().filter(student -> student.getAddress().getZipcode().equals("1235"))
				.map(stu -> stu.getAddress().getZipcode()).collect(Collectors.toList());
		System.out.println(collect3);

		// Get all student having mobile numbers 3333.
		System.out.println();
		System.out.println("Get all student having mobile numbers 3333.");
		List<Student> collect4 = students.stream()
				.filter(stu -> stu.getMobileNumbers().stream().anyMatch(mob -> Objects.equals(mob.getNumber(), "3333")))
				.collect(Collectors.toList());
		System.out.println(collect4);

		// Create a List<Student> from the List<TempStudent>

		System.out.println();
		System.out.println("Create a List<Student> from the List<TempStudent>");
		TempStudent tempStudent1 = new TempStudent("Jayesh1", 201, new Address("12341"),
				Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));
		TempStudent tempStudent2 = new TempStudent("Pankaj1", 201, new Address("12351"),
				Arrays.asList(new MobileNumber("12331"), new MobileNumber("33341")));

		List<TempStudent> asList = Arrays.asList(tempStudent1, tempStudent2);

		List<Student> collect2 = asList.stream()
				.map(tmpStud -> new Student(tmpStud.name, tmpStud.age, tmpStud.address, tmpStud.mobileNumbers))
				.collect(Collectors.toList());
		System.out.println(collect2);

		System.out.println();
		System.out.println("Change the case of List<String>");
		// Change the case of List<String>
		List<String> asList2 = Arrays.asList("shubham", "pankaj", "rekha", "raj", "aman");
		asList2.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println();
		System.out.println("Sort List<String>");
		List<String> asList3 = Arrays.asList("shubham", "pankaj", "rekha", "raj", "aman");
		asList3.stream().sorted().forEach(System.out::println);

	}
}
