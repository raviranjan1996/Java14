package application;

import java.util.LinkedList;
import java.util.List;

public class ReturningList {

	public static void main(String[] args) {
					
		List<Integer> linkedList =  new LinkedList<>();
		
		List<Integer> elements = ReturningList.getoperationTIme(linkedList);
		
		for(var numbers:elements) {
			System.out.println(numbers);
		}
		

	}
	
	public static List<Integer> getoperationTIme(List<Integer> list) {
		
				
		for(int i = 0 ; i< 1E5 ; i++) {
			list.add(i);
		}
		
		return list;
		
	}

}
