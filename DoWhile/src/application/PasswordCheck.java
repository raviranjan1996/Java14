package application;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		String USER_PASSWORD = "abcd";

		Scanner scanner = new Scanner(System.in);
		String input = null;
		do {
			System.out.print("Enter the password :> ");
			input = scanner.nextLine();
		} while (!(USER_PASSWORD.equals(input)));
		System.out.println("Access Granted");
		scanner.close();
	}

}
