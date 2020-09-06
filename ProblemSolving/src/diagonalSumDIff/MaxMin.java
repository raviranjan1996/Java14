package diagonalSumDIff;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] array = new long[n];
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;
		
		
		for(int i=0 ; i < array.length ; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i=0 ; i <array.length ; i++) {
			long sum=0;	
			for(int j=0 ; j < array.length ; j++) {
				
				if(i==j) {
					continue;
				}
				else {
					sum +=array[j];
								
				}
			}
			max = (Long)Math.max(max, sum);
			min = (Long)Math.min(min, sum);
			
		}
		
		System.out.println(min + " " + max);

	}

}
