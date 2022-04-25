package com.genpact.day1.assignment;

import java.util.Scanner;

public class mat {
	// matrix with 3 rows and 4 cols
	// design original , transpose matrix and find out sum of all elements

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		System.out.println("Enter cols");
		int cols = sc.nextInt();
		int[][] mat = new int[rows][cols];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("original matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < rows; i++) {
			for (int j = i; j < cols; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		
		for(int i=0 ; i<rows ;i++) {
			for(int j=0 ; j<cols/2;j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[i][cols-1-j];
				mat[i][cols-1-j] = temp;
			}
		}
		System.out.println("transpose of matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}
}
