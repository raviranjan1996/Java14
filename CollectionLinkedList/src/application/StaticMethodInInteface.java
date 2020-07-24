package application;

import java.util.ArrayList;
import java.util.List;

public class StaticMethodInInteface {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>(List.of(23,45,12));
		
		List<Integer> list1= new ArrayList<>();
		
		list1.add(333);
		list1.addAll(list);
		list1.add(111);
		
		
		for(var elements:list1) {
		System.out.println(elements);
		}
		
		Test.run();

	}

}
