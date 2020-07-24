package application;

import collection.Array;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;

public class App {

	public static void main(String[] args) {
	
		Array<Cat> source = new Array<>(5);
		source.add(new Cat("whale"));
		source.add(new Cat("monkey"));
		source.add(new Cat("billi"));
		
		Array<Creature> dest = new Array<>(5);
		System.out.println();
		dest.addAll(source);
		
		for(int i=0 ; i<dest.size(); i++) {
			System.out.println(dest.get(i));
			
		}
		
	}	
// when to use extends and when to use super?
	//-----> when we are calling list then we use extends and when we are adding something to the list then we are calling super
} //PECS = producer extends , consumer super
 