package application;

import java.util.Scanner;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter Fehreinheit temperature : ");
		Scanner sc = new Scanner(System.in);
		double fehrenheit = sc.nextDouble();
		double inCelsius = (fehrenheit - 32) * 5.0 / 9.0;
		System.out.println("Temperature in celsius  is : " + inCelsius + " deg C");

	}
}
