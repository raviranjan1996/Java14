package application;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
		System.out.println("person running");
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public String toString() {
		return name;
	}
}
