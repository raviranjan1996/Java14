package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Menu");
		System.out.println("===");

		System.out.println("\t1.Print 'Hello'");
		System.out.println("\t2.How are you?");
		System.out.println("\t3.Exit");

		System.out.println("Enter the option > ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();

		if (input == 1) {
			System.out.println("Hello");
		} else if (input == 2) {
			System.out.println("How are you");
		} else if (input == 3) {
			System.out.println("Exiting...");
			System.exit(0);
			System.out.println("Exited");
		} else {
			System.out.println("Invalid option!!!!!");
		}
		
		

	}
}
