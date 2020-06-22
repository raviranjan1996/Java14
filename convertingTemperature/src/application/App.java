package application;

import java.util.Scanner;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter Fehreinheit temperature -> ");
		Scanner sc = new Scanner(System.in);
		double fehrenheit = sc.nextFloat();
		sc.close();
		double inCelsius = (fehrenheit - 32) * 5.0 / 9.0;
		System.out.printf("%.1f degree Fahrenhiet is %.1f degree celcius. \n", fehrenheit, inCelsius);
		/*
		 * double value = 1.234; System.out.printf("hello %.2f\n", value);
		 * System.out.printf("hello %d\n", 1234);
		 */
		
	
		
		
	}
}
