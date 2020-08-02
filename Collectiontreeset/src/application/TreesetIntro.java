package application;

import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		
		return name.compareTo(o.name);
	}
}
public class TreesetIntro {

	public static void main(String[] args) {
		TreeSet<Person> people = new TreeSet<Person>();
		people.add(new Person("Ravi"));
		people.add(new Person("Albert"));
		people.add(new Person("Patel"));
		people.add(new Person("Ranjan"));
		
		for(var person:people) {
			System.out.println(person);
		}
	}

}
// in this it is necessary to implement the comparable method 