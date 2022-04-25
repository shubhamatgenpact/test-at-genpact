package com.genpact.day1.assignment;

import java.util.Scanner;

/*
Welcome to BhartiyaTasteBuds.com To order 
South Indian Dish, Enter 1
To order North Indian Dish, Enter 2
To order Rajasthani Dish, Enter 3
To order Gujrati Dish, Enter 4
To order Bengali Dish, Enter 5
To order Desserts, Enter 6
To Exit, Enter 9 

Enter your choice :
2
Welcome to North Indian Food Court You get : 
Chole Bhature : 2 Pieces
Litti Chokha : 4 Pieces: 

*/
public class restraunt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
 			System.out.println("***** Welcome to BhartiyaTasteBuds.com *****");
 			System.out.println("To order South Indian Dish, Enter 1");
 			System.out.println("To order North Indian Dish, Enter 2");
 			System.out.println("To order Rajasthani Dish, Enter 3");
 			System.out.println("To order Gujrati Dish, Enter 4");
 			System.out.println("To order Bengali Dish, Enter 5");
 			System.out.println("To order Desserts, Enter 6");
 			System.out.println("To Exit, Enter 9");
 			
 			System.out.println("Enter your choice : ");
 			int choice = sc.nextInt();
 			System.out.println();
 			switch (choice) {
 			
			case 1:
				System.out.println("South Indian Dishes are");
				System.out.println("1. Idli");
				System.out.println("2. Vada");
				System.out.println("3. Rassam");
				System.out.println("4. Dosa");
				break;
			case 2:
				System.out.println("North Indian Dishes are");
				System.out.println("1. Amritsari Chole Bhature");
				System.out.println("2. Kashmiri Rogan Josh");
				System.out.println("3. Dilli ki Chaat");
				break;
			case 3:
				System.out.println("Rajasthani Dishes are");
				System.out.println("1. Dal Bati");
				System.out.println("2. Ghevar");
				System.out.println("3. Til Patti");
				break;
			case 4:
				System.out.println("Gujrati Dishes are");
				System.out.println("1. Khaman Dhokla");
				System.out.println("2. Fada");
				break;
			case 5:
				System.out.println("Bengali Dishes are");
				System.out.println("1. Roshogulla");
				break;
			case 6:
				System.out.println("Desserts are");
				System.out.println("1. Gulabjamun");
				System.out.println("2. Rasmalai");
				System.out.println("3. Gujia");
				System.out.println("4. Gajar Halwa");
				break;
			case 9:
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Wrong choice");
				System.out.println();
				break;
			}
		}
	}
}
