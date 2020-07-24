package helloWorld2;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] number = new int[n];
		int sum = 0;
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}

		for (int i = 0; i < number.length; i++) {
			sum = 0;
			for (int j = i; j < number.length; j++) {
				sum += number[j];
				if (sum < 0) {
					count++;

				}

			}
		}
		System.out.println(count);
		sc.close();

	}
}
