package application;

public class InstanceVariables {

	public static void main(String[] args) {
		Person person1 = new Person();     // new Person() is creating a object of person
		Person person2 = new Person();
		
		person1.name="joe";
		person1.age=26;
		
		person2.name="Ravi";
		person2.age=24;
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person2.name);
		System.out.println(person2.age);
		
		
	}

}

