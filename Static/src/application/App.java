package application;

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
		

		/*
		 * So what we've done is by declaring this variable static we've made sure that
		 * there is only one copy of this variable. It exists. Show between all members
		 * of the class and it's associated with the class. You need to make it final to
		 * make it associated with the class and not instances of the class.
		 * 
		 * 
		 */
		 catCount=String.format(CAT_FORMATE, Cat.getCount());
		 System.out.println(catCount);
	}
}