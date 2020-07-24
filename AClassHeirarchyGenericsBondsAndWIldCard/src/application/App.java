package application;

import collection.Array;
import heirarchy.Cat;
import heirarchy.Mammal;

public class App {

	public static void main(String[] args) {
		
	Array<Mammal> mammal = new Array<>(2);
	mammal.add(new Mammal("dolphin "));
	mammal.add(new Mammal("sheep "));
	
	Array<Cat> cat = new Array<>(2);
	cat.add(new Cat("bilar "));
	cat.add(new Cat("billi "));
	
	App.feedAll(cat);
	App.feedAll(mammal);
		
	}
	//? is called wild card
	public static void feedAll(Array<? extends Mammal> mammal) {
		
		for(int i =0 ; i<mammal.size() ; i++) {
			Mammal c = mammal.get(i);
			c.feed();
		}
		
	}

} 
 