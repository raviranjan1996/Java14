package application;

import entity.Apple;
import entity.Banana;
import entity.Fruit;

public class App {

	public static void main(String[] args) {
		Fruit fruit = new Apple();
		System.out.println(fruit);
		
		Fruit fruit1 = new Banana(); 
				System.out.println(fruit1);
	}

}
