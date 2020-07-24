package application;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;



public class CurrencyFormat {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		Locale indLocal = new Locale("en", "IN");
		
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india = NumberFormat.getCurrencyInstance(indLocal);
		NumberFormat china =NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		
		System.out.println("US: " + us.format(payment));
		System.out.println("INDIA: " + india.format(payment));
		System.out.println("CHINA: " + china.format(payment));
		System.out.println("FRANCE: " + france.format(payment));
		
		
		
		
	}

}
