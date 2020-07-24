package application;

public class App {

	public static void main(String[] args) {
			
		Fruit[] fruit = Fruit.values();
		for(var fruits:fruit) {
			System.out.println(fruits);
			
		switch(fruits) {
		case APPLE :  System.out.println("apple:-" + fruits.ordinal());
			break;
		case BANANA: System.out.println("banana:-" + fruits.ordinal());
			break;
		case GUAVA: System.out.println("guava:-" + fruits.ordinal());
			break;
			default: System.out.println("invalid:-");
				break;
		}
		}
	}
} 
 