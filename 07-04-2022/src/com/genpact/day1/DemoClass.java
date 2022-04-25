package com.genpact.day1;
import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1 = ");
		num1 = sc.nextInt();
		
		System.out.println("Enter num2 = ");
		num2 = sc.nextInt();
		
		System.out.println("Enter num3 = ");
		num3 = sc.nextInt();
		
		
		if(num1 >= num2 && num2 >= num3) {
			System.out.println("num1 is greatest");
		}
		else if(num2 >= num1 && num2 >= num3) {
			System.out.println("num2 is greatest");
		}
		else {
			System.out.println("num3 is greatest");
		}
		
		//System.out.println("Largest number = "+Math.max(Math.max(num2, num3), num1));
		
	}

}