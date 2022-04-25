package com.genpact.day1.assignment;

import java.util.Scanner;

/*
   *
  ***
 *****
*******
 *****
  ***
   *
*/
public class LeftRightPascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int space = n-1;
		
		// this first outer loop is for first upper half of pattern
		for(int i = 1 ; i<=n ; i++) {
			// this loop is for spacing
			for(int j=1 ; j<=space ; j++) {
				System.out.print(" ");
			}
			space--;
			// this loop is for printing star
			for(int j=1;j<=2*i-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		space = 1;
		// this second loop is for second half of pattern
		for(int j=1 ; j<=n-1 ; j++) {
			// this loop is for spacing
			for(int i=1 ; i<=space ; i++) {
				System.out.print(" ");
			}
			space++;
			
			for(int i=1 ; i<=2*(n-j)-1;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
