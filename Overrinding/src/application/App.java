package application;

public class App {

	public static void main(String[] args) {
		HouseCat houseCat = new HouseCat();
		houseCat.vocalized();
		houseCat.hunting();
		Tiger tiger = new Tiger();
		tiger.hunting();
		tiger.vocalized();
		
		Lion lion = new Lion();
		lion.hunting();
		lion.vocalized();
	}

}