package application;

import package1.Person;
import package2.Employee;

public class App {

	public static void main(String[] args) {
		Person person = new Person("ravi");
	//	System.out.println(person.name);
		Employee empl = new Employee("patel");
		
		
		//System.out.println(empl.name);
		

	}

}
// public - can be accessed anywhere
// private = only in the same class where the variable or method is defined;
//protected- anywher in the same package we can access it or in the subclass also
//no modifier - can be used in the same package but not outside the package