package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Enter Options: ");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		scanner.close();

		if (option >= 100) {
			System.out.println("Beyond the option");
		} else {
			switch (option) {
			case 0:
				System.out.println("option 0");
				break;
			case 1:
				System.out.println("option1");
				break;
			case 2:
				System.out.println("option 2");
				break;
			case 10:
				System.out.println("Exiting...");
				System.exit(0);
				break;

			default:
				System.out.println("option not matched");
				break;
			}
		}

	}
}
