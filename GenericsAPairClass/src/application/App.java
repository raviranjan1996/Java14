package application;

import collection.Pair;
import heirarchy.Cat;

public class App {

	public static void main(String[] args) {
				
		Pair<Integer , Cat> pair = new Pair<>(5 , new Cat("billlar billi"));
		System.out.println(pair);
		System.out.println(pair.getOne());
	}

}
