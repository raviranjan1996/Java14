package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.print("Enter option y/n: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		switch (input) {
		case "y":
			System.out.println("proceeding..");
			break;
		case "N":
			System.out.println("not proceeding");
			break;
		case "1":
			System.out.println("not proceeding..");
			break;
		default:
			System.out.println("out of process");
			break;
		}

	}
}
