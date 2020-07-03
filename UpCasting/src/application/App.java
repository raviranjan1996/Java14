package application;

public class App {

	public static void main(String[] args) {

		Cat cat = new Cat();

		Animal a1 = cat; //upcasting (sub type polymorphism)     // variable of type cat is treating as variable of type animal , it is called
							// upcasting bcz we are seting a sub type class variable to the parent class type.
		System.out.println(a1);
		System.out.println(a1==cat);
		
		a1.speak();

	}

}
