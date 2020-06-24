package application;

import java.util.Scanner;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean getCodeword = false;
		for (;;) {
			System.out.print("> ");
			String input = scanner.nextLine();
			if (input.equals("quit")) {
				break;
			} else if (input.equals("hello")) {
				getCodeword = true;
			}
		}
		if (getCodeword) {
			System.out.println("codeword found");
		} else {
			System.out.println("codeword not found");
		}
		scanner.close();
	}

}
