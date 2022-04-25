package com.genpact.day2.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee{
	
	int empId;
	String empName;
	int empSal;
	int empExp;
	String skillSet;
	
	
	public Employee(int empId, String empName, int empSal, int empExp, String skillSet) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empExp = empExp;
		this.skillSet = skillSet;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empExp=" + empExp
				+ ", skillSet=" + skillSet + "]";
	}
	
	
}

public class EmployeeInfo {
 /* 
  employee working in genpact
  details are id , name ,sal ,exp and skill

	collect data of atleast 10 employee 
	1. display the higher salary employee
	2. print the details of those employee whose skillset is java
	3. if the person exp>5 and skillset == javafullstack give the the hike of 20% in sal and print details
	4. experience is more than 10 year ask them to change skill and print details
	
	*/
	
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println("Enter employee id");
			int empId = sc.nextInt();
			System.out.println("Enter employee name");
			String empName = sc.next();
			System.out.println("Enter employee salary");
			int empSal = sc.nextInt();
			System.out.println("Enter employee experience");
			int empExp = sc.nextInt();
			System.out.println("Enter employee skillset");
			String empSkillSet = sc.next();
			
			Employee employee = new Employee(empId, empName, empSal, empExp, empSkillSet);
			arrayList.add(employee);
		}
		int maxSal =0 ;
		for (Employee employee : arrayList) {
			if(employee.empSal > maxSal) {
				maxSal = employee.empSal;
			}
		}
		System.out.println("********************************************");
		System.out.println("Max Salary Employee is = "+maxSal);
	
		
		
		System.out.println();
		
		
		System.out.println("********************************************");
		System.out.println("Details of those employee whose skillset is java");
		for (Employee employee : arrayList) {
			if(employee.skillSet.equals("java")) {
				System.out.println(employee);
			}
		}
		
		System.out.println();
		
		
		System.out.println("********************************************");
		System.out.println("person exp>5 and skillset == java give the the hike of 2000 in sal and print details");
		for (Employee employee : arrayList) {
			if(employee.empExp>5 && employee.skillSet.equals("java")) {
				System.out.println(employee);
				System.out.println("Incremented Sal is = "+(employee.empSal=employee.empSal+2000));
			}
		}
	
		System.out.println();
		
		
		System.out.println("********************************************");
		System.out.println("experience is more than 10 year ask them to change skill and print details");
		for (Employee employee : arrayList) {
			if(employee.empExp>10) {
				System.out.println(employee);
				System.out.println("Enter new skillSet");
				String empSkillSet = sc.next();
				
				employee.skillSet=empSkillSet;
				
				System.out.println(employee);
				
			}
		}
	}
}

/*

101
shubham
100000
6
java
102
ansh
10000
1
javascript
103
pulkit
20000
6
java
104
mohan
30000
12
aws
105
anshul
40000
13
nodejs

*/
 