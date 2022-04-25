package com.genpact.day1.assignment;

import java.util.Scanner;

/*
        *
      * * 
    * * *
  * * * *
* * * * *
 */
public class RightPascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		int star = 1;
		int count=1;
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<n-1; j++) {
				System.out.print(" ");
			}
			for(int k=0 ; k<star;k++) {
				System.out.print("* ");
			}
			n=n-1;
		}
	}
}
