package application;

import java.util.Scanner;

public class PasswordCheckingFlag {

	public static void main(String[] args) {
		String USER_PASSWORD = "abcd";
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		String input = null;
		for (;;) {
			System.out.print("Enter the Password:> ");
			input = scanner.nextLine();
			if (input.equals(USER_PASSWORD)) {
				System.out.println("Access Granted");
				break;
			} else {
				System.out.println("Incorrct Password");
				count++;
				if (count == 3) {
					System.out.println("Access Denied");
					break;
				} else {
					System.out.println("Please enter correct password");
				}
			}
		}
		scanner.close();
	}

}
