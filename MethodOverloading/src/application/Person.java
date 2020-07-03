package application;

public class Person {

	private String names;
	
	public Person() {
	System.out.println("no parameter");
	}
	public Person(String names) {
		this.names = names;
	}
	
	public void greet() {
		System.out.println("hello");
	}

	public void greet(String name) {
		System.out.println(name);
	}

	public boolean greet(int a) {
		return true;
	}

	public void greet(int height ,int width) {
		if(height >150 || width>30 ) {
			System.out.println("okay");
		}
		else {
			System.out.println("not okay");
		}
	}
	public void greet(String name , int height) {
		if(height >80) {
			System.out.println(height);
		}
		System.out.println(name);
	}
	@Override
	public String toString() {
		return names;
	}
	
}
