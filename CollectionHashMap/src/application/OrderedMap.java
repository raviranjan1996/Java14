package application;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {

	public static void main(String[] args) {
		// HashSet LinkedHashSet  TreeSet
		//HashMap LinkedHashMap  TreeMap
		
		Map<Integer, String> month = new LinkedHashMap<Integer, String>();  //ordered but as we as add same will give
		month.put(1, "Jan");
		month.put(4, "April");
		month.put(7, "july");
		
		Iterator<Map.Entry<Integer, String>> it = month.entrySet().iterator();
		
		while(it.hasNext()) {
			var entry = it.next();
			
			var monthno = entry.getKey();
			var monthname= entry.getValue();
			
			
			System.out.println(monthno + ": " + monthname);
		}
		
		System.out.println();
		Map<Integer, String> months = new TreeMap<Integer, String>();    // sort in natural order
		months.put(4, "April");
		months.put(2, "Feb");
		months.put(3, "March");
		
		months.forEach((k ,v)->System.out.println(k + ": " + v));
	}

}
