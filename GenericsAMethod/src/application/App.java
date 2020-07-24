package application;

import collection.Array;
import collection.Pair;
import heirarchy.Cat;

public class App {

	public static void main(String[] args) {
				
		Array<Cat> array = new Array<>(2);
		array.add(new Cat("biilli"));
		array.add(new Cat("backchod"));
		
		for(int i=0 ; i<array.size() ; i++) {
			Cat cats =  array.get(i);
		
		
		System.out.println(cats);
		}
		
		System.out.println(array);
		
		
		Cat cat = App.find(array, "billi");
		System.out.println(cat);
	}
	
	public static <R> R find(Array<? extends R> array , String text) {
		
		for(int i=0 ; i<array.size() ; i++) {
		R value=array.get(i);
		
		if(value.toString().equals(text)) {
			return value;
		}
		}
		
		return null;
	}

}