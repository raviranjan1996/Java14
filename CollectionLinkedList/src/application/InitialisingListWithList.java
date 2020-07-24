package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class InitialisingListWithList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(List.of(12,4,554,223,-12));     //List.of()  is a new way to add items in the list
		/*
		 * list1.add(45); list1.add(453); list1.add(12);
		 */
		
	//	List<Integer> list2 = new ArrayList<>(list1);
		//or
		
		var list2 = new ArrayList<Integer>();
		list2.add(111);
		list2.addAll(list1);
		list2.add(222);
		
		Collections.sort(list2);
		for(var n: list2) {
			System.out.println(n);
		}
		
		List<String> names = new LinkedList<>(List.of("ravi" , "ranjan" , "patel"));
		
		var name2 = new ArrayList<String>(names);
		
		name2.add("kumar");
		
		for(var namming: name2) {
			System.out.println(namming);
		}
	}

}
