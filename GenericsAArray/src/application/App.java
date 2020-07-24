package application;

import collection.Array;
import collection.Pair;
import heirarchy.Cat;

public class App {

	public static void main(String[] args) {
				
		Array<Cat> array = new Array<>(2);
		array.add(new Cat("billi"));
		array.add(new Cat("backchod"));
		
		for(int i=0 ; i<2 ; i++) {
			Cat cats =  array.get(i);
		
		
		System.out.println(cats);
		}
		
		System.out.println(array);
		
		
	}

}