package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String USER_PASSWORD = "abcd";

		Scanner scanner = new Scanner(System.in);

		for(int i=0 ;  ; ) {			//we can user whilw also 
			System.out.print("Enter Password:> ");
			String userInput = scanner.nextLine();

			if (userInput.equals(USER_PASSWORD)) {
				System.out.println("Password Matched");
				break;
			} else {
				System.out.println("Wrong Password" + i);
			}
		}
			scanner.close();
		}
	}

