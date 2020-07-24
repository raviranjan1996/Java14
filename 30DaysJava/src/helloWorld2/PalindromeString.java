package helloWorld2;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String str = "";
		for (int i = (s.length() - 1); i >= 0; i--) {
			str += s.charAt(i);
		}
		if (s.equals(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}
