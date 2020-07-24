package application;

import java.util.ArrayList;
import java.util.List;

public class ModifyingListWhileIterating {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(List.of(2,3,5,4,1,67));
				
		for(var it = list.listIterator() ; it.hasNext();) {
			var number = it.next(); 
			
			if(number == 3) {
				it.remove();
			}
			
			else if(number == 4) {
				it.add(400);
			}
			
			else if(number == 2) {
				it.set(5000);
			}
			
			
			System.out.println(number);
				
		}
		System.out.println();
		list.forEach(e->System.out.println(e));
		
	
		}
	}


