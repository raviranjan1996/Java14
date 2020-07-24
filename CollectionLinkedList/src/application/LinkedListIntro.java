package application;

import java.util.LinkedList;

public class LinkedListIntro {

	public static void main(String[] args) {
//Lined List:-	A linked list maintains internally a series of nodes which are just objects basically. Each nodes or object have the reference of the next node. 	
//iterating through the Linked list is bit slower then the array list		
		LinkedList<String> text = new LinkedList<>();
		text.add("ravi");
		text.add("ranjan");
		
		
		for(var texts:text) {
			System.out.println(texts);
		}
	}

}