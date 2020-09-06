package helloWorld2;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Learn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = IntStream.range(1, 5+1).reduce(1, (factorial , range)-> factorial*range);
		System.out.println(value);
		
		BigInteger bg = sc.nextBigInteger();
		System.out.println(bg.isProbablePrime(1) ? "Prime":"not prime");
		
		

	}

}
