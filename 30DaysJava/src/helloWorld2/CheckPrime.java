package helloWorld2;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			
			String number = sc.nextLine();
			
			int number1 = Integer.parseInt(number);
			CheckPrime check = new CheckPrime();
			
			System.out.println(check.primecheck(number1));
				
		

	
	}

	private String primecheck(int number) {
			
		if(number < 2) {
			return "not prime";
		}
		else if(number ==2) {
			return "prime";
		}
		
		else if(number%2 ==0) {
			return "not prime";
		}
		
		for(int i=3 ; i <=(int)Math.sqrt(number) ; i++ ) {
			
			if(number%i ==0 ) {
				return "not prime";
			}
			
			
		}
		
		return "prime";
	}

}
