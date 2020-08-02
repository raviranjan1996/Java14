package application;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapsOfList {

	public static void main(String[] args) {
		Map<Integer, List<String>> socities = new HashMap<>();
		socities.put(0, new LinkedList<>(List.of("hj", "wh", "qa")));
		socities.put(1, new LinkedList<>(List.of("er", "re", "wq")));

		for (Map.Entry<Integer, List<String>> elements : socities.entrySet()) {

			var integer = elements.getKey();
			var name = elements.getValue();

			System.out.print(integer + "\t");
			for (String person : name) {

				System.out.print(person);
				System.out.print("\t");
			}
			System.out.println();
		}

		System.out.println("===================================================================");
		socities.forEach((k, v) -> System.out.println(k + ": " + v));

		System.out.println("===================================================================");
		var l = socities.get(1);

		for (String list : l) {
			System.out.println(list);
		}

	}

}
