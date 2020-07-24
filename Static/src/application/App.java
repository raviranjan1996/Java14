package application;

import application.Cat.People;
import application.Cat.People.Printer;

public class App {

	public static void main(String[] args) {

		final String CAT_FORMATE = "Cats counts are: %d\n";
		String catCount = String.format(CAT_FORMATE, Cat.getCount());
		System.out.println(catCount);
		Cat cat1 = new Cat("Billi");
		Cat cat2 = new Cat("bakchod billi");
		System.out.println(cat1);
		System.out.println(cat2);

		System.out.println(Cat.FOOD);
		
		Object o;
		o = new People().new Printer();
		
		((Cat.People.Printer)o).running();
			
		People people = new People();
		
		o = people.new Printer();
		
		People.Printer pp1 = (People.Printer)o;
		pp1.running();

		/*
		 * So what we've done is by declaring this variable static we've made sure that
		 * there is only one copy of this variable. It exists. Show between all members
		 * of the class and it's associated with the class. we
		 * make it associated with the class and not instances of the class.
		 * 
		 * 
		 */
		 catCount=String.format(CAT_FORMATE, Cat.getCount());
		 System.out.println(catCount);
	}
}