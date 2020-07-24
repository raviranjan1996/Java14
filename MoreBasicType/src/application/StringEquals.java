package application;

import java.util.Scanner;

public class StringEquals {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
        
        

	}

	private static boolean isAnagram(String a, String b) {
		
		int[] Acount = new int[256];
		int[] Bcount = new int[256];
		
		String A = a.toUpperCase();
		String B = b.toUpperCase();
		if(a.length() !=b.length()) {
			return false;
		}
		
		for(int i =  0 ; i< a.length() ; i++) {
			Acount[A.charAt(i)-'A']++;
			Bcount[B.charAt(i)-'A']++;
		}
		
		for(int j= 0 ; j<26 ; j++) {
			if(Acount[j] == Bcount[j]) {
				return true;
			}
		}
		
		return false;
}
}
