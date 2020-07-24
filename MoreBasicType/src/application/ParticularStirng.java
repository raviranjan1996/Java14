package application;

import java.util.Scanner;

public class ParticularStirng {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		String A = sc.nextLine();
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		String output = A.substring(start, end);
		System.out.println(output);
		sc.close();
		

	}

}
