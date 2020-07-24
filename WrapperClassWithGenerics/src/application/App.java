package application;

import collection.Wrapper;
import heirarchy.Cat;
import heirarchy.Creature;

public class App {

	public static void main(String[] args) {
				
		Wrapper<Cat> wrapper = new Wrapper<>();
		Cat cat = new Cat("bilaar");
		
		wrapper.setObject(cat);
		
		Cat retrive = wrapper.get();
		System.out.println(retrive);
		
		Wrapper<Creature> wrap = new Wrapper<>();
		
		Cat cat1 = new Cat("backchod billi");
		
		wrap.setObject(cat1);
		
		Creature creat = wrap.get();
		System.out.println(creat);
		
		//generics is generally a syntactic check .
		//to make a program bug free
	}

}
