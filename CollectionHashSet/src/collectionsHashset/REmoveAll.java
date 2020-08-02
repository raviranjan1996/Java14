package collectionsHashset;

import java.util.HashSet;
import java.util.Set;

public class REmoveAll {

	public static void main(String[] args) {
	var fruit1 = new HashSet<String>(Set.of("mango" , "banana" , "cherry"));
	var fruit2 = new HashSet<String>(Set.of("apple" , "mango" , "cherry"));
	
	var onlyInFruit1 = new HashSet<String>(fruit1);
	onlyInFruit1.removeAll(fruit2);  //it will remove all the elements from fruit1 which is common in fruit2;
	onlyInFruit1.forEach(e->System.out.println(e));
	
	
	

	var onlyInFruit2 = new HashSet<String>(fruit2);
	onlyInFruit2.removeAll(fruit1);  //it will remove all the elements from fruit2 which is common in fruit1;
	onlyInFruit1.forEach(e->System.out.println(e));
	
	}

}

