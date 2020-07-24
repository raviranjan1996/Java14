package helloWorld2;

import java.util.Scanner;

public class BinaryChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int count = 0;
		while (number != 0) {

			number = number & (number << 1);
			
			count++;
		}
		
		System.out.println(count);
		
			sc.close();
	}
}