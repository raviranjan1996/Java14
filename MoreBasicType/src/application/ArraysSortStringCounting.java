package application;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortStringCounting {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = ArraysSortStringCounting.isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
        
        

	}

	private static boolean isAnagram(String a, String b) {
		
		char[] arrA = a.toUpperCase().toCharArray();
		char[] arrB = b.toUpperCase().toCharArray();
		
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
		if(a.length()!=b.length()) {
			return false;
		}
		
		for(int i = 0 ; i<a.length() ; i++) {
			
			if(arrA[i] !=arrB[i]) {
				return false;
			}
		}
				
		return true;
}
}
