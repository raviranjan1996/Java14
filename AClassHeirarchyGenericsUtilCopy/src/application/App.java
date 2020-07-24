package application;

import collection.Array;
import collection.Util;
import heirarchy.Cat;
import heirarchy.Creature;

public class App {

	public static void main(String[] args) {
		
	Array<Cat> arraySource = new Array<>(5);
		arraySource.add(new Cat("chinni"));
		arraySource.add(new Cat("bat"));
		
		for(int i = 0 ; i<arraySource.size() ; i++) {
			System.out.println(arraySource.get(i));
		}
	Array<Creature> arrayDest = new Array<>(5);
		Util.copy(arraySource, arrayDest);
		
		for(int i=0 ; i<arrayDest.size() ; i++) {
			System.out.println(arrayDest.get(i));
		}
	}
	
	
// when to use extends and when to use super?
	//-----> when we are calling list then we use extends and when we are adding something to the list then we are calling super
} //PECS = producer extends , consumer super
 