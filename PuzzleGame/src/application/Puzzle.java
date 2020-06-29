package application;

import java.util.Scanner;

public class Puzzle {

	private boolean running = true;
	private RandomWords word = new RandomWords();
	private Scanner scanner = new Scanner(System.in);
	private int limitRemaining = 5;
	private char lastGuessedWord;
	private int count=0;

	public void run() {
		do {
			displayWord();
			getUserInput();
			checkUserInput();

		} while (running);
	}

	private void displayWord() {
		System.out.println("Tries Remaining:-> " + limitRemaining);
		System.out.println(word);
	}

	private void getUserInput() {
		try {
			System.out.print("Guess the Letter:-> ");
			String guessWord = scanner.nextLine();
			lastGuessedWord = guessWord.charAt(0);

		} catch (Exception ex) {
			count++;
			System.out.println("Warning!!!! Next time you will kicked off to the game");
			if(count == 2) {
				System.out.println("Kicked off!!!!!!");
				running = false;
			}
		}
	}

	private void checkUserInput() {
		boolean isCorrect = word.guessWord(lastGuessedWord);
		if (isCorrect) {
			if (word.isComplete()) {
				System.out.println("WINNER!!!!!");
				System.out.println("The Word is:-> " +word);
				running = false;
			}
		} else {
			limitRemaining--;
			if (limitRemaining == 0) {
				System.out.println("You lost");
				running = false;
			}
		}

	}

	public void close() {
		scanner.close();
	}

}
