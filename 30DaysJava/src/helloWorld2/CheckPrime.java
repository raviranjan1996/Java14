package helloWorld2;

import java.math.BigInteger;
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
         BigInteger n = scanner.nextBigInteger();
        scanner.close();

        System.out.println(n.isProbablePrime(1)? "prime" : "not prime");
        scanner.close();

	}


}