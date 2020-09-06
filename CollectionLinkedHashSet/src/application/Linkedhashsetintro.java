package application;

import java.util.Collections;
import java.util.LinkedHashSet;

public class Linkedhashsetintro {

	public static void main(String[] args) {
		//linkedHashset - ordered , unique , fast , doubly linked list
		//set.of not used here , because it return a object in unordered way
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("apple");
		set.add("pear");
		set.add("cherry");
		set.add("apple");
		set.add("mango");
		
		
		
		for(var fruit:set) {
			System.out.println(fruit);
			
		}
		
	
	

	}

}
