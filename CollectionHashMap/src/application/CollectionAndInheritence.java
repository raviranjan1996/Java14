package application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionAndInheritence {

	public static void main(String[] args) {
		Map<Integer, Set<String>> set = new HashMap<Integer, Set<String>>();
		set.put(0, new HashSet<String>(Set.of("programming" , " teaching")));
		set.put(1, new HashSet<String>(Set.of("prog" , " teach")));
		
		
		for(Map.Entry<Integer, Set<String>> list : set.entrySet()) {
			
			var id = list.getKey();
			var name = list.getValue();
			System.out.print(id + "\t");
			for(String skills: name) {
				System.out.print(skills);
				System.out.print("\t");
			}
			
			System.out.println();
			
		}
		
		//we can do this by using inheritence
		

	}

}
