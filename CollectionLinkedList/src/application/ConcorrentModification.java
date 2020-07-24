package application;

import java.util.ArrayList;
import java.util.List;

public class ConcorrentModification {

	public static void main(String[] args) {
		var arrayList = new ArrayList<Integer>(List.of(3,4,5,6,3,2,33));
		for(var n: arrayList) {
			arrayList.remove(n);  // we cant do this bcz it will through n concurrentModificationException 
			//for removing we use iterator.
		}
		
		

	}

}
