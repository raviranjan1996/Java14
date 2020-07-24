package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;

public class Game {
	private int score = 0;
	private Scanner scanner = new Scanner(System.in);
	private Random random = new Random();
	private static int input;
	public void run() {

		for (int i = 0; i < 3; i++) {
			GameObject randomObject = pickObject();
			GameObject playerObject = getPlayerObject();
			// String compareText = playerObject.compareText(randomObject);
			System.out.println(playerObject + "--" + randomObject);
			boolean isTrue = playerObject.beats(randomObject);

			System.out.println();
			if (isTrue) {
				System.out.println(playerObject + "\tbeats\t" + randomObject);
				System.out.println("Won");
				score++;
			} else if (randomObject == playerObject) {
				System.out.println("Draw");
			} else {
				System.out.println(randomObject + "\tbeats\t" + playerObject);
				System.out.println("Lose");
				score--;
			}
		}

		if (score > 0) {
			System.out.println("Game Over: you won");
		} else if (score < 0) {
			System.out.println("Game Over: you lost");
		} else {
			System.out.println("Game Over: Its Draw");
		}
	}

	private GameObject getPlayerObject() {
		boolean isCorrect = false;
		GameObject[] gameObject = GameObject.values();
		
		do {
			System.out.println("0.Rock\n1.Paper\n2.Scissors\n");
			String line = scanner.nextLine();
			try {
				input = Integer.parseInt(line);
				if (input >= 0 && input <= 2) {
					isCorrect = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("please enter a number");

			}
		} while (!isCorrect);
		return gameObject[input];

	}

	private GameObject pickObject() {

		GameObject[] gameObject = GameObject.values();
		return gameObject[random.nextInt(gameObject.length)];
	}

}
