import java.util.Scanner;

/*
Write a program to read a number
--> calculate the sum of odd digits (values) present in the given number. 
--> Include a class UserMainCode with a static method checkSum which accepts a positive integer . 
--> The return type should be 1 if the sum is odd .
--> In case the sum is even return -1 as output. 

Create a class Main which would get the input as a positive integer and call the static method checkSum 
present in the UserMainCode. 

Input and Output Format: 
Input consists of a positive integer n. 
Refer sample output for formatting specifications. 

Sample Input 1: 56895 
Sample Output 1: 
Sum of odd digits is odd. 

Sample Input 2: 84228 
Sample Output 2: 
Sum of odd digits is even. 
*/



class UserMainCode{
	public static int checkSum(int number) {
		// calculate sum of odd digits
		int sum = 0;
		while(number != 0) {
			int rem = number % 10;
			if(rem % 2 != 0) {
				sum = sum + rem;
			}
			number = number / 10;
		}
		// return 1 if sum is odd
		if(sum % 2 != 0) {
			return 1;
		}
		// return -1 if sum is even
		return -1;
	}
}
public class HandsOn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// taking input from the user
		System.out.println("Enter any number");
		int n = sc.nextInt();
		
		// calling checkSum method by passing the user given number
		int res = UserMainCode.checkSum(n);
		if(res == 1) {
			System.out.println("sum of odd digit is odd");
		}
		else {
			System.out.println("sum of odd digit is even");
		}
		
	}
}
