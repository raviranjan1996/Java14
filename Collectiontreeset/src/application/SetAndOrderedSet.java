package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetAndOrderedSet {

	public static void main(String[] args) {
		Set<Integer> number1 = new HashSet<Integer>();
		Set<Integer> number2 = new LinkedHashSet<Integer>();
		Set<Integer> number3 = new TreeSet<Integer>();
		
		SortedSet<Integer> number4 = new TreeSet<Integer>();
		number4.add(238);
		number4.add(24);
		number4.add(25);
			
		for(var element:number4) {
			System.out.println(element);
		}
	}

}
