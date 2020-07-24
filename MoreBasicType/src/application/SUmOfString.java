package application;

import java.util.Scanner;

public class SUmOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		System.out.println(A.toLowerCase().length() + B.toLowerCase().length());
		
		if(A.charAt(0) > B.charAt(0)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		String Aoutput = A.substring(0, 1).toUpperCase() + A.substring(1);
		String Boutput = B.substring(0,1).toUpperCase() + B.substring(1);
		
		System.out.println(Aoutput + " " + Boutput);
		sc.close();
		
		
		
		
		
	}

}
