package application;

import java.util.ArrayList;
import java.util.Collections;

class Persons {
	private String name;
	public Persons(String name) {
		this.name = name;
	}
	public String toString() {
		return "Person[" + name + "]";
	}
}

public class ArrayListSorting {

	public static void main(String[] args) {
			
		var person = new ArrayList<Persons>();
		person.add(new Persons("Ravi"));
		person.add(new Persons("ranjan"));
		person.add(new Persons("patel"));
		person.add(new Persons("dablo"));
		
		person.set(1, new Persons("kumar"));
		
		
		//Collections.sort(person);     we can not do this for sorting the objects we have some other method (read next sections)
		person.forEach(i->System.out.println(i));
		System.out.println("=========");
		for(int i = 0 ; i< person.size() ; i++) {
			System.out.println(person.get(i));
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%");
		
		ArrayList<Double> number = new ArrayList<>();
		number.add(2.345);
		number.add(34.34);
		number.add(22.995);
		number.add(3.1);
		
		Collections.sort(number);      // will sort the element in number in asscending order
		number.forEach(e -> System.out.println(e));
	
		
		
	}
}

