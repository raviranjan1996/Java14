package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissor;

public class Game {

	private GameObject[] gameObject = { new Rock(), new Paper(), new Scissor() };
	private Random random = new Random();
	private boolean running = true;

	public void run() {

		String[] status = { "Lost", "Draw", "Win" };
		Scanner scanner = new Scanner(System.in);
		int countWin = 0;
		boolean running = true;
		int count = 0;

		do {
			GameObject randomObjects = gameObject[random.nextInt(gameObject.length)];
			System.out.print("Enter the choice->\n\t1.Rock\n\t2.Paper\n\t3.Scissor\n\t-> ");
			int chooseOption = scanner.nextInt();
			GameObject randomObjects1 = gameObject[chooseOption - 1];
			System.out.println(randomObjects1 + "<---------->" + randomObjects);
			int comparissions = randomObjects1.compareTo(randomObjects);
			System.out.println(status[comparissions + 1]);
			countWin += comparissions;
			System.out.println("\n");
			count++;
			if (count == 3) {
				running = false;
			}
		} while (running);
		System.out.println();
		scanner.close();
		if (countWin > 0) {
			System.out.println("you won the match");
		} else if (countWin < 0) {
			System.out.println("you lost the game");
		} else {
			System.out.println("The game is draw");
		}

	}

}
