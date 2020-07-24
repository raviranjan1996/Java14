package application;

import java.util.Arrays;
import java.util.Scanner;

public class CountingString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] A = s.toCharArray();
		Arrays.sort(A);
		for (int i = 0; i <s.length(); i++) {
			int count = countLetter(s,A[i]);
			System.out.println("occurence of: " + s.charAt(i) + " , "+ count );
		}
			sc.close();
	}
	private static int countLetter(String s, char c) {
		int count=0;
		for(int i = 0 ;i < s.length() ; i++) {
			if(s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}
