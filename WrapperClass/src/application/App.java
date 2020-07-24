package application;

import collection.Wrapper;
import heirarchy.Cat;

public class App {

	public static void main(String[] args) {
				
		Wrapper wrapper = new Wrapper();
		Cat cat = new Cat("bilaar");
		
		wrapper.setObject(cat);
		
		Cat retrive = (Cat)wrapper.get();
		
		System.out.println(retrive);
	
		
	}

}
