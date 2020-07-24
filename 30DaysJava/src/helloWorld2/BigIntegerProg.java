package helloWorld2;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerProg {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		BigInteger sum;
		BigInteger mul;
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		

		
		BigInteger a = new BigInteger(num1);
		BigInteger b = new BigInteger(num2);
		
		
		sum = a.add(b);
		mul = a.multiply(b);
		
		System.out.println(sum);
		System.out.println(mul);
		
		
	}
		
		
		

	}


