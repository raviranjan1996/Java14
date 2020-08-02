package application;

import java.util.HashMap;

public class HashMapIntro {

	public static void main(String[] args) {
		//key value pair
		//not in ordered
		
		HashMap<Integer, String> people = new HashMap<>();
		people.put(0, "ravi");
		people.put(2 , "ranjan");
		people.put(3 , "ravi");
		people.put(3, "ranjan");
		
		System.out.println(people.get(1));
		people.forEach((k,v)->{
			
			System.out.println(k + ": " + v);
		});

	}

}
