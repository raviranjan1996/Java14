package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		{
			int value = 0;
			System.out.println(value);
		} // scope of value is only in the curly bracket

		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}

		String input;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Type 'quit' to quit the program: ");
			input = scanner.nextLine();
		} while (!input.equals("quit"));
		scanner.close();
	}
}
