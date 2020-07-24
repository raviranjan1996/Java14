package application;

import java.util.ArrayList;
import java.util.Collections;

class Persons1 implements Comparable<Persons1> {
	private String name;
	private Integer id;
	public Persons1(String name , Integer id) {
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return name + " , " + id;
	}
	@Override
	public int compareTo(Persons1 o) {
		
		return name.compareTo(o.name);
	}
}

public class ArrayListSortingComparable {

	public static void main(String[] args) {
			
		var person = new ArrayList<Persons1>();
		person.add(new Persons1("pavi" , 1));
		person.add(new Persons1("pavi" , 5));
		person.add(new Persons1("pavi" , 2));
		person.add(new Persons1("ranjan" , 2));
		person.add(new Persons1("katel" , 3));
		person.add(new Persons1("dablo" , 41));
		person.add(new Persons1("dablo" , 46));
		person.add(new Persons1("dablo" , 34));
		
		
				
		Collections.sort(person);       //for this to work we implemented compareTO method which is inbuilt function of Comparable interface this is only for string object
		
		person.forEach(e -> System.out.println(e));

			//how comparable works
		String name1 = "rave";
		String name2 = "patcl";
		String name3 = "patdk";
		int compare = name1.compareTo(name2);     //it will compare the 1st letter of the string and return the integer eg- r and  p difference of these two is 2 then return 2;
		System.out.println(compare);
		
		compare = name2.compareTo(name3);
		System.out.println(compare);
	}
}

