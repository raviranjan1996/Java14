package application;

public class App {

	public static void main(String[] args) {
		Person person = new Person("Ravi ranjan patel");
		person.greet();
		person.greet("Ravi");
		
		boolean integer = person.greet(10);
		System.out.println(integer);
		
		person.greet(160, 40);
		person.greet("patel", 60);
		
		System.out.println(person);
		
		Person person1 = new Person();
		System.out.println(person1);
	}

}
