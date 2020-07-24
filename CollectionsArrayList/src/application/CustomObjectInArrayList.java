package application;

import java.util.ArrayList;

class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return "Person[" + name + "]";
	}
}
	


public class CustomObjectInArrayList {

	public static void main(String[] args) {
			
		var person = new ArrayList<Person>();
		person.add(new Person("Ravi"));
		person.add(new Person("ranjan"));
		person.add(new Person("patel"));
		person.add(new Person("dabloo"));
		
		person.set(1, new Person("kumar"));
		person.forEach(i->System.out.println(i));
		System.out.println("=========");
		for(int i = 0 ; i< person.size() ; i++) {
			System.out.println(person.get(i));
		}
		
		person.addAll(person);
	
	}
}

