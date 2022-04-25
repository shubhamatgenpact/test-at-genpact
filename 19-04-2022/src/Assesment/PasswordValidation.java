package Assesment;

import java.util.Scanner;

class UserMainCode {

	public static boolean checkPassword(String password) {

		// valid password should satisfy following rules
		// minimum 8 char length
		// should have one lower case , one upper case , one digit and one special
		// character
		boolean status = true;
		char[] array = password.toCharArray();
		int lower = 0, upper = 0, digits = 0, special = 0;

		for (int i = 0; i < array.length; i++) {
			if (Character.isDigit(array[i]))
				digits++;
			if (Character.isLowerCase(array[i]))
				lower++;
			if (Character.isUpperCase(array[i]))
				upper++;
			if (array[i] == '!' || array[i] == '@' || array[i] == '#' || array[i] == '$' || array[i] == '$'
					|| array[i] == '%' || array[i] == '^' || array[i] == '&' || array[i] == '*')
				special++;
		}

		if (!(lower > 0))
			status = false;

		if (!(upper > 0))
			status = false;

		if (!(digits > 0))
			status = false;

		if (!(special > 0))
			status = false;

		return status;

	}
}

public class PasswordValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
		String password = sc.next();
		boolean checkPassword = UserMainCode.checkPassword(password);
		if (checkPassword) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}

	}
}
