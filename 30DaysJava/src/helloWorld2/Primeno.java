package helloWorld2;

import java.math.BigInteger;
import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		BigInteger[] a = new BigInteger[n];
		
		for(int i = 0 ; i < n ; i ++) {
			a[i] = sc.nextBigInteger();
		}
		
		for(int i=0 ; i< a.length ; i++) {
			if(a[i].isProbablePrime(1)) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not prime");
			}
		}
		
		
		
		
		sc.close();
	}

}
