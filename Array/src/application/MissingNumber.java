package application;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:> ");
		int n = scanner.nextInt();
		int[] number = new int[n];
		int sumNumber;
		int sum=0;
		System.out.println("Enter the number in the arrays:> ");
		IntStream.range(1, number.length).forEach(i -> {
			number[i] = scanner.nextInt();
		});
		for (int numbers : number) {
			sum +=numbers;
		}
		sumNumber = n*(n+1)/2;
		System.out.println("Total sum is:> " +sumNumber);
		int missingNumber = sumNumber-sum;
		System.out.println("Missing number is:-> " +missingNumber);
		scanner.close();
	}
}
