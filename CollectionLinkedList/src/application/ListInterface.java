package application;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<Integer>();
		array.add(4);
		array.add(6);
		array.add(10);

		for(var number:array) {
			System.out.println(number);
		}
		System.out.println("======================");
		ListInterface.displayList(array);
	}
	public static void displayList(List<Integer> list) {
		list.remove(2); 
		for(var numbers: list) {
			System.out.println(numbers);
		}
		
	}

}