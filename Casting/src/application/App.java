package application;

public class App {

	public static void main(String[] args) {
		Cat cat = new HouseCat();
		cat.hunting();
		cat.vocalized();
		//	cat.purr();    // will give compile time error because purr is not known to class Cat but we can call it but using casting
		
		((HouseCat)cat).purr();
		
						
	}

} // its the variable type that depends on which methods is to call