package application;

import java.util.Arrays;
import java.util.Scanner;

public class Matching {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] A = s.toCharArray();
		Arrays.sort(A);
		int count=1;
		for (int i = 0; i <A.length-1; i++) {
			
			if(A[i] == A[i+1]) {
				count++;
			}
			else {
				System.out.println(A[i] + " , " + count);
				count=1;
			}

		}
		System.out.println(A[A.length-1]+ " , "+ count);
			sc.close();
	}

}
