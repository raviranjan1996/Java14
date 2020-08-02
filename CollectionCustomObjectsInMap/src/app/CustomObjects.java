package app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CustomObjects  {

	public static void main(String[] args) {
		
		Map<Person, Integer>  hashMap = new HashMap<Person, Integer>();
		Map<Person, Integer> linkedHashMap = new LinkedHashMap<Person, Integer>();
		Map<Person, Integer> treeMap = new TreeMap<Person, Integer>();
		
		
		Map<Person, Integer> person1 = details(hashMap);
		Map<Person, Integer> person2 = details(linkedHashMap);
		Map<Person, Integer> person3 = details(treeMap);
		
		for(Map.Entry<Person, Integer> detail1:person1.entrySet()) {
			
			System.out.println(detail1.getKey() + ": " + detail1.getValue());
			
		}
		
		System.out.println("##########################################################");
		
		System.out.println();
		person2.forEach((person , age)-> System.out.println(person + ": " + age));
		
		System.out.println("##########################################################");
		System.out.println();
		Iterator<Map.Entry<Person, Integer>> it = person3.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Person, Integer> entry = it.next();
			
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println(person1.get(new Person("aadasdasdasd")));
		System.out.println(person1.containsKey(new Person("Ravi")));
		

	}
	
	public static Map<Person, Integer> details(Map<Person, Integer> person){
		
		person.put(new Person("Ravi"), 23);
		person.put(new Person("Rohit"), 34);
		person.put(new Person("Mayank"), 25);
		person.put(new Person("Vishi"), 6);
		person.put(new Person("Patel"), 12);
		person.put(new Person("Ravi"), 22);
		return person;
		
	}
	
	

}
