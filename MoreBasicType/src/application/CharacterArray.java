package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CharacterArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
			
		char[] acc = a.toCharArray();
		Arrays.sort(acc);
		
		System.out.println(acc);
		int count =1;
		for(int i = 0 ; i<acc.length-1 ; i++) {
			if(acc[i]==acc[i+1]) {
				count++;
			}
			else {
				System.out.println("occurrance: " + acc[i] + " - "+ count);
				count=1;
			}
			
			
		}
		System.out.println("occurance: " + acc[acc.length-1]  + " , " + count);

	}

}
