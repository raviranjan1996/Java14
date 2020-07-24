package application;

public class App {
	public static void main(String[] args) {
		
		new Person("Ravi").Display();
		
		new Person("Patel").new Printer().print();   //we can call this also
	
		
		}
}
//we cant change the variable inside the  local class method , but we can access it if it is final and initialised in starting so that we cant change it