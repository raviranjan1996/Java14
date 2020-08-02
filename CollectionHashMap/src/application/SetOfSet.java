package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOfSet {

	public static void main(String[] args) {
		Set<Set<String>> elements = new HashSet<Set<String>>();
		
		Set<String> list = new TreeSet<String>();
		
		elements.add(list);
		list.add("mango");
		list.add("apple");
			
		
		
		for(String lists:list) {
			System.out.println(lists);
		}

	}
	
	

}
