package AveryBigSum;

import java.util.Scanner;

public class Candles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			max = array[i] > max ? array[i] : max;
		}
		
		for(int i=0 ; i < array.length ; i++) {
			if(max == array[i]) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
