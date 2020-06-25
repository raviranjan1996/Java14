package application;

import java.util.Scanner;

public class StringPrograme {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		do {
			System.out.println("Enter the command\n\t1.Start\n\t2.Stop\n\t3.Quit");
			String input = scanner.nextLine();
			if (input.isBlank()) {
				continue;
			}
			if (input.equalsIgnoreCase("Start")) {
				System.out.println("Machine Starting...");

			} else if (input.equalsIgnoreCase("Stop")) {
				System.out.println("MAchine Stoping..");
			} else if (input.equalsIgnoreCase("quit")) {
				running = false;
				break;
			} else {
				System.out.println("Unrecognised command");
			}

		} while (running);
		scanner.close();
	}
}
