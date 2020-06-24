package application;

import java.util.Scanner;

public class PasswordCheckingWIthboolean {

	public static void main(String[] args) {
		String USER_PASSWORD = "abcd";

		Scanner scanner = new Scanner(System.in);
		boolean accessGranted=false;
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter Password :> ");
			String input = scanner.nextLine();
			if(input.equals(USER_PASSWORD)) {
				System.out.println("Access Granted.");
				accessGranted=true;
				break;
			}
			else {
				System.out.println("Invalid Password please Enter correct password.");
			}
		}
		
		if(!accessGranted) {
			System.out.println("Access Denied");
		}

		scanner.close();
	}
}
