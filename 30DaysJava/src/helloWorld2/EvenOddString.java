package helloWorld2;

import java.util.Scanner;

public class EvenOddString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0 ; i<n+1 ; i++) {
			String Evenstr=" ";
			String oddStr=" ";

		String s = sc.nextLine();
		
		for(int j = 0 ; j< s.length() ; j++) {
			if(j%2 == 0) {
				Evenstr +=s.charAt(j);
			}
			else {
				oddStr +=s.charAt(j);
			}
			
		}
		System.out.println(Evenstr.trim() + " " + oddStr.trim());
		
		
		}
		
		
		sc.close();

	}

}
