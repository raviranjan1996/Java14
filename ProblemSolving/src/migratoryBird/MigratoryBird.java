package migratoryBird;

import java.util.Scanner;

public class MigratoryBird {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] array = new int[n];
		
		for(int i=0 ; i < array.length ; i++) {
			array[i] = sc.nextInt();
		}
		int[] arr = new int[n];
		for(int i=0 ; i < array.length ; i++) {
			arr[array[i]]++;
		}
		int max =0 ; int maxpos=0;
		for(int i=0 ; i < array.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxpos=i;
			}
		}
	System.out.println(maxpos);
	}

}
