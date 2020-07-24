package application;

public class App {

	public static void main(String[] args) {
		
		Cat[] cats = {new HouseCat() , new Tiger() , new Lion()};
		for(Cat cat:cats) {
			cat.vocalized();
			cat.hunting();
			System.out.println(cat);
		}
	}

}