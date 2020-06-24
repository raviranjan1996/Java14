package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int apple = 4;
		int banana = 5;

		if (apple > banana) {
			System.out.println("Condition is true");
		}
		System.out.println("end of programe");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fehrenheit temperature: ");
		double temperatureFehreinheit = sc.nextFloat();
		sc.close();
		double temperatureCelcius = (temperatureFehreinheit - 32) * (5.0 / 9.0);
		System.out.printf("The temperature in celcius is : %.2f\n", temperatureCelcius);

		if (temperatureCelcius < 21.0) {
			System.out.println("Weather is cold");
		} else {
			System.out.println("weather is hot enough");
		}

	}
}
