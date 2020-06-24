package application;

public class App {

	public static void main(String[] args) {
		int otters = 5;
		int giraffe =10;
		int elephant = 11;
		
		otters++;
		++giraffe;
		elephant--;
		
		int animals = otters++;
		int totalAnimals = --elephant + ++otters +giraffe++ +elephant;
		System.out.printf("Otters: %d\nGiraffe: %d\nElephant: %d\n" , otters , giraffe , elephant);
		System.out.println(animals);
		System.out.println(totalAnimals);
		
		
		var count=0.55;   //we can use var for all type to datatypes that is double float int 
		while(count<10) {
			System.out.println("count: " +count);
			count++;
		}
		
		
		
	}
}
 