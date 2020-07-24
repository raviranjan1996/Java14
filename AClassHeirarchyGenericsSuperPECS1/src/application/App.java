package application;

import collection.Array;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;

public class App {

	public static void main(String[] args) {
		
	Array<Mammal> mammal = new Array<>(4);
	mammal.add(new Mammal("dolphin "));
	mammal.add(new Mammal("sheep "));
	
	Array<Cat> cat = new Array<>(2);
	cat.add(new Cat("bilar "));
	cat.add(new Cat("billi "));
	
	App.feedAll(cat);
	App.feedAll(mammal);
	System.out.println();
	
	App.addMammal(mammal);
	App.feedAll(mammal);
	
	System.out.println();
	
	Array<Creature> creature = new Array<>(4);
	creature.add(new Creature("bat"));
	creature.add(new Creature("chinni"));
	
	addMammal(creature);
	
	for(int i= 0; i<creature.size() ; i++) {
		System.out.println(creature.get(i));
	}
		
	}
	//? is called wild card
	private static void feedAll(Array<? extends Mammal> mammal) {
		
		for(int i =0 ; i<mammal.size() ; i++) {
			Mammal c = mammal.get(i);
			c.feed();
		}
	}
	
	private static void addMammal(Array<? super Mammal> mammal) {
		mammal.add(new Mammal("girrafe "));
		mammal.add(new Mammal("kabootar "));
		
	}
// when to use extends and when to use super?
	//-----> when we are calling list then we use extends and when we are adding something to the list then we are calling super
} //PECS = producer extends , consumer super
 