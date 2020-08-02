package collectionsHashset;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

	public static void main(String[] args) {
	var fruit1 = new HashSet<String>(Set.of("mango" , "banana" , "cherry"));
	var fruit2 = new HashSet<String>(Set.of("apple" , "mango" , "cherry"));
	
	var union = new HashSet<String>(fruit1);
	union.addAll(fruit2);
	
	union.forEach(e-> System.out.println(e));
	
	System.out.println();
	
	var intersection = new HashSet<String>(fruit1);
	intersection.retainAll(fruit2);   // it will remove all the elements from fruit2 which is not in fruit1; 
	intersection.forEach(e-> System.out.println(e));
	

	}

}

