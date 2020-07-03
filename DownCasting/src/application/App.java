package application;

public class App {

	public static void main(String[] args) {

		Animal a1 = new Cat();    //here the object is always gona be cat  even here is 2 variable also.

		Cat a2 = (Cat) a1; // downcasting , bcz here a1 is the variable of Animal type(Super class) and we
							// a assinging to the subclass cat type which will throw error , so we have to
							// cast it here, by doing this we can also access the method of animal to the cat
		System.out.println(a2);

		a2.jump();
		a2.speak();
	
	}

}
