package application;

import java.util.Scanner;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the distance in miles ->");
		
		Scanner sc = new Scanner(System.in);
		double convertMiles = sc.nextFloat();
		sc.close();
		double kilometer = 1.60934;
		System.out.printf("%.3f Miles in Kilometer is %.2f KM\n" , convertMiles , (convertMiles*kilometer) );
		
	}
}
