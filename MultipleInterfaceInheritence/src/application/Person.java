package application;

public class Person implements Greeter , Speaker {

	@Override
	public void greet() {
	System.out.println("greeterrr");
		
	}

	@Override
	public void speak() {
		System.out.println("speakerrrr");
		
	}

}
