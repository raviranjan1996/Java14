package makingAnagram;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		char[] str1 = a.toCharArray();
		char[] str2 = b.toCharArray();
		int count=0;
		int[] duplicate = new int[str2.length];
		
		for(int i=0; i < str1.length ; i++) {
			for(int j=0 ; j <str2.length ; j++) {
				if(duplicate[j] !=1 && str1[i] == str2[j]) {
					duplicate[j]=1;
					count++;
					break;
				}
			}
			
		}
		int sum = (str1.length-count) + (str2.length-count);
		
		System.out.println(sum);
		
		
		
	}

}
