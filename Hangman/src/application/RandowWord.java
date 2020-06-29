package application;

import java.util.Random;

public class RandowWord {
	private String[] randomWord = { "ravi", "ranjan", "patel", "dabloo", "babloo", "anuradha", "vishi", "mom", "dad",
			"jijaji" };

	private String chosenWord;

	private Random random = new Random();

	private char[] characters;

	public RandowWord() {

		chosenWord = randomWord[random.nextInt(randomWord.length)];
		characters = new char[chosenWord.length()];
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (char c : characters) {

			stringBuilder.append(c == '\u0000' ? '_' : c);
			stringBuilder.append(' ');
			// stringBuilder = c=='\u0000'?stringBuilder.append('_').append('
			// '):stringBuilder.append(c).append(' ');
			/*
			 * if(c=='\u0000') { stringBuilder.append('_'); } else {
			 * stringBuilder.append(c); } stringBuilder.append(' ');
			 */
		}
		return stringBuilder.toString();
	}

	public boolean guessWord(char c) {
		// fill in c in the character array wherever its found in the random word.

		boolean isCorrect = false;
		for (int i = 0; i < chosenWord.length(); i++) {
			if (c == chosenWord.charAt(i)) {
				characters[i] = c;
				isCorrect = true;
			}
		}
		return isCorrect;

	}

	public boolean completeRamdomWord() {
		for (char c : characters) {
			if (c == '\u0000') {
				return false;
			}
		}
		return true;
	}

}
