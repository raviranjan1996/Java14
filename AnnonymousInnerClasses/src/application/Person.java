package application;

public class Person {

	private String name;
	
	public class Printer {
		public void print() {
			System.out.println(name);
		}
	}
	public Person(String names) {
		this.name = names;
	}
	
	public void Display() {
		new Printer().print();
	}
	
}
// non static inner classes are associated with objects so we can call the variable in the the inner class also