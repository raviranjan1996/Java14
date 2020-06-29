package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true;
	private RandowWord word = new RandowWord();
	private Scanner scanner = new Scanner(System.in);
	private int limitRemaining = 5;
	private char lastguess;

	public void run() {
		do {
			displayWord();
			getUserInput();
			checkUserInput();
		} while (running);
	}

	private void displayWord() {
		System.out.println("Tries Remaining: " + limitRemaining);
		System.out.println(word);

	}

	private void getUserInput() {

		// ask the user to get the user input and get the character as string and pass
		// the character to randomword class
try {
		System.out.print("Guess the letter:-> ");
		String guess = scanner.nextLine();
		lastguess = guess.charAt(0);

	}
catch(Exception e)
{
	System.out.println("Blank attempt your tries has been decreased");
}
	}

	private void checkUserInput() {
		boolean isCorrect = word.guessWord(lastguess);
		if (isCorrect) {
			if (word.completeRamdomWord()) {
				System.out.println("WINNER!!!!");
				System.out.println("The word is:-> " + word);
				running = false;
			}
		} else {
			limitRemaining--;
			if (limitRemaining == 0) {
				System.out.println("LOOSER!!!!!!!");
				running = false;
			}
		}

	}

	public void close() {
		scanner.close();
	}
}
