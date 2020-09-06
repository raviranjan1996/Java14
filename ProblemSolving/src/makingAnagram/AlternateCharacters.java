package makingAnagram;

import java.util.Scanner;

public class AlternateCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int count =0;
		for(int i =0 ; i < s.length()-1 ; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				count++;
			}
			else {
				continue;
			}
		}
		System.out.println(count);
		

	}

}
