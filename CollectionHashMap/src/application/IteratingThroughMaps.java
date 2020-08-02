package application;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class IteratingThroughMaps {

	public static void main(String[] args) {
			
		
		var month = new HashMap<String, String>(Map.of(
				"jan","January",
				"feb","february",
				"mar","march",
				"apr","april",
				"may","may",
				"jun","June"
		));
		
		month.forEach((k,v)->System.out.println(k +": " + v));
		System.out.println();
		
		//better use 'var'
		for(Map.Entry<String, String> months: month.entrySet()) {
			var monthcode = months.getKey();
			var monthName = months.getValue();
			
			System.out.println(monthcode + ": " + monthName);
		}
		
		System.out.println();
		for(var monthCode : month.keySet()) {
			var monthName  = month.get(monthCode);
			System.out.println(monthCode + ": " + monthName);
			
		}
		
		
		
		System.out.println();
		//better to use var
		Iterator<Map.Entry<String,String>> it = month.entrySet().iterator();
		
		while(it.hasNext()) {
			var entry = it.next();
			
			var monthcode = entry.getKey();
			var monthname = entry.getValue();
			
			System.out.println(monthcode + ": " + monthname);
		}
			
		
		

	}

}
