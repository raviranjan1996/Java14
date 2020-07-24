package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>(List.of(2,3,5,4,1,67));
				
		for(Iterator<Integer> it = list.iterator() ; it.hasNext();) {
			Integer number = it.next();   //return the current elements and sending this to the next reference
			
			System.out.println(number);
				
		}
		
		System.out.println("++++++++++++++++++++");
		
		Iterator<Integer> its = list.iterator();
		while(its.hasNext()) {
			Integer number = its.next();
			System.out.println(number);
		}
	}

}
