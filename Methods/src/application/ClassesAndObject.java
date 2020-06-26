package application;

class Persons{
	String name;
}
public class ClassesAndObject {

	public static void main(String[] args) {
			Persons person = new Persons();
			person.name = "Ravi";
			Persons person1 = new Persons();
			person1.name = "Patel";
			System.out.println(person.name);
			System.out.println(person1.name);
			
	}

}  