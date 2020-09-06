package AveryBigSum;

import java.util.Scanner;

public class BigSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		long[] ar = new long[n];
		for(int i=0 ; i <ar.length ; i++) {
			ar[i] = sc.nextLong();
			sum += ar[i];
		}
		
		System.out.println(sum);
		

	}

}
