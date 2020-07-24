package helloWorld2;

import java.util.Scanner;

public class RverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] number = new int[n];
		
			for(int i=0 ; i<number.length ; i++) {
				number[i] = sc.nextInt();
			}
			for(int j = (number.length-1) ; j >=0 ;j--) {
				System.out.print(number[j]+ " ");
			}
			
			sc.close();
	}

}
