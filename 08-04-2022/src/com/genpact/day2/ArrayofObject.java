package com.genpact.day2;
 

class Student {
	int sid;
	String sname;
	String scourse;

	public Student(int sid, String sname, String scourse) {
		this.sid = sid;
		this.sname = sname;
		this.scourse = scourse;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scourse=" + scourse + "]";
	}

	
}

public class ArrayofObject {
	public static void main(String[] args) {
		Student[] stu = new Student[3];

		stu[0] = new Student(101, "Shubham Nigam", "MCA");
		stu[1] = new Student(102, "Ansh Gupta", "MCA");
		stu[2] = new Student(103, "Pulkit Nagar", "MCA");

		for (Student student : stu) {
			System.out.println(student);
		}
		
		System.out.println();
		
		
		Object[] ArrayofObj = {"Shubham",new Integer(5)};
		System.out.println(ArrayofObj[0]);
		System.out.println(ArrayofObj[1]);
	}
}
