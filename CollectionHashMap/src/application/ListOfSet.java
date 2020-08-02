package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListOfSet {

	public static void main(String[] args) {
		List<Set<String>> collectionRota = new ArrayList<>();
		
		collectionRota.add(new HashSet<String>(Set.of("running" , "pushup" , "pullup" , "leg raise")));
		collectionRota.add(new HashSet<String>(Set.of("eating" , " sleeping" , "studying" ,"playing")));
		
		for(Set<String> exercies: collectionRota) {
			for(String exercise: exercies) {
				System.out.print(exercise);
				System.out.print(" ");
			}
			System.out.println();
		}
		Set<String> daythree = collectionRota.get(1);
		
		for(var exercise: daythree) {
			System.out.println(exercise);
		}
	}

}
