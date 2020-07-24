package application;

import java.util.ArrayList;
import java.util.Collections;

class PersonCompare implements Comparable<PersonCompare> {
   private String name;
   private Integer id;
   private Integer number;
   
   
   public PersonCompare(String name , int  id , int number) {
	   this.name = name;
	   this.id = id;
	   this.number = number;
   }
   
   public String toString() {
	   return name + " , " + id +" , " + number;
   }
   
   @Override
   public int compareTo(PersonCompare o) {
	   int comparision  = name.compareTo(o.name);
	   int ids = id.compareTo(o.id);
	   
	   if(ids ==0) {
		   return number.compareTo(o.number);
	   }
	   
	   if(comparision == 0) {
		   return ids;
	   }
	   
	   return comparision;
   }
}


public class ComparableExample {

	public static void main(String[] args) {
		var person = new ArrayList<PersonCompare>();
		person.add(new PersonCompare("ravi", 23 , 1));
		person.add(new PersonCompare("patel", 24 , 4));
		person.add(new PersonCompare("dabloo", 26 , 3));
		person.add(new PersonCompare("kumar", 27 ,7));
		person.add(new PersonCompare("ravi", 20 ,2));
		person.add(new PersonCompare("patel", 24 ,3));
		person.add(new PersonCompare("dabloo", 10 ,4));
		
		Collections.sort(person);
		
		person.forEach(e->System.out.println(e));
		
		String name = "ravi@gmail.com";
		
	}

}
