package application;

public class App {
	public static void main(String[] args) {
		
	Person person = new Person();
	person.print();
	
	new Person.Head().print();
	
	}
}
//we cant change the variable inside the  local class method , but we can access it if it is final and initialised in starting so that we cant change it