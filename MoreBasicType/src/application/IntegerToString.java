package application;

import java.util.Scanner;

public class IntegerToString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		String s= Integer.toString(i);
		System.out.println(s);

	}

}
