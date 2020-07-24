package application;

public class Employee extends Person {
	
	public Employee(String name) {
		super(name);    //this will call the super class constructor i.e perspn class 
		System.out.println("Employee running");
	}

}
