package application;

import java.util.Scanner;

public class App {
	public static Scanner scanner = new Scanner(System.in);
	private static int num;

	public static void main(String[] args) {

		int number = App.getNumber();
		System.out.println("Entered number is:-> " + number);
		scanner.close();
	}

	private static int getNumber() {
		boolean gotAnumber = false;
		do {
			System.out.println("Enter the number:-> ");
			String line = scanner.nextLine();
			try {
				num = Integer.parseInt(line);
				gotAnumber = true;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number please enter number");

			}
		} while (!gotAnumber);

		return num;
	}

}
