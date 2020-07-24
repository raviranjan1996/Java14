package application;

import java.util.Scanner;

public class StringPrint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean isCorrect = true;
		int count = 0;

		String[] str = new String[3];
		int[] number = new int[3];
		do {
			System.out.println("Enter the string and number");

			for (int i = 0; i < 3; i++) {
				str[i] = scanner.next();
				number[i] = scanner.nextInt();
				count++;
				if (count == 3) {
					isCorrect = false;
				}
			}
		} while (isCorrect);

		String formatString;
		System.out.println("================================");
		for (int j = 0; j < 3; j++) {
			formatString = String.format("%-14s %03d", str[j], number[j]);
			System.out.println(formatString);
		}

		System.out.println("================================");

		scanner.close();
	}

}
