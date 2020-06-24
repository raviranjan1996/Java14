package application;

public class App {

	public static void main(String[] args) {
		
		int cat =30;
		int dogs=20;
		int elephant=30;
		
		boolean moreDogsThanCats = dogs>cat;
		System.out.println("More dogs than cats: " + moreDogsThanCats);
		
		//equality operator
		System.out.printf("Same no. of cats and dogs %b\n" , cat==dogs);
		System.out.printf("Same no. of cats and elephant %b\n" , cat==elephant);
		System.out.printf("No. of cats grater than elephant %b\n" , cat>=elephant);
		
		
		
		// do not use == with doubles- it will give unpredictable result

	}
}
