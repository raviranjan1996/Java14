package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OperationTIme {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		
		long Arrayelements = getoperationtime(arrayList);
		
		System.out.println("Time of insertion of element in array list is : " + Arrayelements);
		
		long linkedlements = getoperationtime(linkedList);
		System.out.println("Time of insertion of elements in linked list: " + linkedlements);

	}

	public static long getoperationtime(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		for(int i = 0 ;i < 1E5 ; i++) {
		
			list.add(0,i);
		//for normal adding the elements in the array then we use array but if have to do add or remove option the linked list is more faster then the array list	
		//for iterating through elements in linked list it starts from first position whereas in array list it go to that particular index.	
		}
	
		
		return System.currentTimeMillis()-start;
		
	}
}
