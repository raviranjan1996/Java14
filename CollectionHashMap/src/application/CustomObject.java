package application;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;

	}

	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {
		
		return name.compareTo(o.name);
	}

}

public class CustomObject {

	public static void main(String[] args) {
		Map<Person, Integer> peopleHash = new HashMap<>();
		Map<Person, Integer> peopleLinked = new LinkedHashMap<>();
		Map<Person, Integer> peopleTree = new TreeMap<>();

		var person = peoples(peopleHash);
		var person2=peoples(peopleLinked);
		var person3 = peoples(peopleTree);

		for (Map.Entry<Person, Integer> persons : person.entrySet()) {
			var name = persons.getKey();
			var age = persons.getValue();
			System.out.println(name + ": " + age);
		}
		
		System.out.println("----------------------------------------");
		person2.forEach((k,v)->{
			System.out.println(k + ": " + v);
			
		});
		System.out.println("----------------------------------------");
		Iterator<Map.Entry<Person , Integer>> it = person3.entrySet().iterator();
		
		while(it.hasNext()) {
			var entry = it.next();
			
			var name = entry.getKey();
			var age = entry.getValue();
			
			System.out.println(name + ": " + age);
		}
		
		System.out.println("=========================");
		System.out.println(person.get(new Person("fasfasf")));
		System.out.println(person.containsKey(new Person("ravi")));

	}

	public static Map<Person, Integer> peoples(Map<Person, Integer> person) {

		person.put(new Person("ravi"), 20);
		person.put(new Person("patel"), 24);
		person.put(new Person("ranjan"), 18);
		person.put(new Person("ravi"), 21);
		person.put(new Person("rohit"), 34);
		person.put(new Person("kumar"), 56);

		return person;

	}

}
