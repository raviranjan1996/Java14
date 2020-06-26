package application;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[3];

		IntStream.range(0, number.length).forEach(i -> {

			System.out.print("Enter the number :>");
			number[i] = scanner.nextInt();
		});
		int sum = 0;
		System.out.println("you entered");
		for (int numbers : number) {
			System.out.println(numbers);
			sum += numbers;
		}
		/*
		 * for (int j = 0; j < number.length; j++) { System.out.println(number[j]); sum
		 * += number[j]; }
		 */
		System.out.println("Sum is:> " +sum);
		scanner.close();
	}

}
