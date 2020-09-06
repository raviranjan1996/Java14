package makingAnagram;

import java.util.Scanner;

public class Strinchild {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int[] array = new int[26];
		
		int index=0;
		int count=0;
		for(int i=0 ; i < c1.length ; i++) {
			for(int j=0 ; j<=i ; j++) {
				
				if(c1[i] == c2[j]) {
					index = c1[i] -'A';
					
					array[index]++;
					
				break;	
				}
			}
		}
		
		for(int k=0 ; k<array.length ;k++) {
			if(array[k]>0) {
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
