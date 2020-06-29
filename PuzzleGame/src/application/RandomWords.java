package application;

import java.util.Random;

public class RandomWords {
	
	private String[] randomWord = { "distinct", "section", "piece", "writing", "usually", "dealing", "single", "theme",
			"indentation", "indicated", "numbering", "new", "line", "with", "and"};
	private String choosenWord;
	private char[] characters; 
	
	private Random random = new Random();
	
	public RandomWords() {
		choosenWord = randomWord[random.nextInt(randomWord.length)];
		characters = new char[choosenWord.length()];
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		
		for(char c : characters) {
			stringBuilder.append(c=='\u0000'?"_":c).append(' ');
	}
		return stringBuilder.toString();
	}

	public boolean guessWord(char lastGuessedWord) {
		boolean isCorrect = false;
		for(int i=0 ; i<choosenWord.length(); i++) {
			if(lastGuessedWord == choosenWord.charAt(i)) {
				characters[i]=lastGuessedWord;
				isCorrect =true;
			}
		}
		
		return isCorrect;
	}
	
	public boolean isComplete() {
		
		for(char c: characters) {
			if(c == '\u0000') {
				return false;
			}
		}
		return true;
	}
}
