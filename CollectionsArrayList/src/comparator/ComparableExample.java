package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
   public String getName() {
	   return name;
   }
   
   public Integer getId() {
	   return id;
   }
   
   public Integer getNumber() {
	   return number;
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

class PersonComaparator implements Comparator<PersonCompare>{
	//printing in reverse alphabetical order.
	

	@Override
	public int compare(PersonCompare person1, PersonCompare person2) {
		
		int compareName = person2.getName().compareTo(person1.getName());
		int compareId = person1.getId().compareTo(person2.getId());
		
		if(compareId==0) {
			return person1.getNumber().compareTo(person2.getNumber());
		}
		
		if(compareName == 0) {
			return compareId;
		}
	
		return compareName;
	}
	
}

public class ComparableExample {

	public static void main(String[] args) {
		var person = new ArrayList<PersonCompare>();
		person.add(new PersonCompare("ravi", 20 , 1));
		person.add(new PersonCompare("patel", 24 , 4));
		person.add(new PersonCompare("dabloo", 26 , 3));
		person.add(new PersonCompare("kumar", 27 ,7));
		person.add(new PersonCompare("ravi", 20 ,2));
		person.add(new PersonCompare("patel", 24 ,3));
		person.add(new PersonCompare("dabloo", 10 ,4));
		
		Collections.sort(person);
		person.forEach(e->System.out.println(e));
		
		System.out.println("==============");
		Collections.sort(person , new PersonComaparator());
		System.out.println("\n\n");
		person.forEach(e->System.out.println(e));
		
		System.out.println();
			//sorting by anonymous class
		person.sort(new Comparator<PersonCompare>() {

			@Override
			public int compare(PersonCompare person1, PersonCompare person2) {
				Integer id1 = person1.getId();
				Integer id2 = person2.getId();
				int com =id1.compareTo(id2);
				System.out.println(com + " -> " + id1 + "," + id2);
				
				return id1.compareTo(id2);
			}
		});
		person.forEach(e->System.out.println(e));
	}

}
