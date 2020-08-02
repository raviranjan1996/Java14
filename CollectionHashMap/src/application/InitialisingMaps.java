package application;

import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;
public class InitialisingMaps {

	public static void main(String[] args) {
			
		// @formatter:off
		 
		

		Map<Integer, String> months = new HashMap<Integer, String>(Map.of(
				2, "Feb",
				4, "April"
			)); 
									// Map.of will only	// take 10 items
		
		
		Map<Integer, String> months1 = new HashMap<Integer, String>(Map.ofEntries(
				entry(5, "May"),
				entry(6, "june")
				
		));
									// it does'nt have any limit
		// @formatter:on
		months.put(1, "january");
		months.put(3, "march");

		months.forEach((k, v) -> {
			System.out.println(k + ": " + v);

		});

		months1.forEach((k, v) -> {

			System.out.println(k + ": " + v);

		});

	}

}
