package application;

public class App {

	public static void main(String[] args) {
	
		Animal o = (Animal)getAnimal();       // object is ultimate super class
		System.out.println(getAnimal());
		System.out.println(o);
		
		
		System.out.println(Cat.getCat());
		
		
		
	}
		
		public static Object getAnimal() {
			return new Animal();
		}
		
		
		
		
		
		
		
	
}

//single action in different ways is polymorphism