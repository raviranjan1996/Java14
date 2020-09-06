package divisibleSum;

import java.util.Scanner;

public class DivisibleSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = sc.nextInt();
		int count=0;
		int[] array = new int[n];
		
		
		for(int i=0 ; i <array.length ; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j <array.length; j++) {
					if((array[i]+array[j])%sum == 0) {
						count++;
					}
			}
		}
		
		System.out.println(count);

	}

}
