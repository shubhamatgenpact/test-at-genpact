package Assesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Contact {
	String name;
	String email;
	Long mobile;
	String address;

	public Contact(String name, String email, Long mobile, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", mobile=" + mobile + ", address=" + address + "]";
	}

}

public class ContactInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Contact> aList = new ArrayList<Contact>();

		System.out.println("Enter number of input");
		int n = sc.nextInt();

		while (n-- > 0) {
			System.out.println("Enter name");
			String name = sc.next();

			System.out.println("Enter email");
			String email = sc.next();

			System.out.println("Enter mobile");
			Long mobile = sc.nextLong();

			System.out.println("Enter address");
			String address = sc.next();

			Contact contact = new Contact(name, email, mobile, address);

			aList.add(contact);
		}
		
		Collections.sort(aList,(emp1,emp2)->emp2.getMobile().compareTo(emp1.getMobile()));
		
		aList.forEach(System.out::println);

	}
}
