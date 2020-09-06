package AveryBigSum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;





public class Lexography {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
	    java.util.SortedSet<String> array = new java.util.TreeSet<String>();
				
		for(int i=0; i <s.length()-(k-1) ; i++) {
			
			array.add(s.substring(i, i+k));
		}
		
	System.out.println(array.first());
	System.out.println(array.last());
	}

}
