package collectionsHashset;

import java.util.HashSet;

public class HashsetIntro {

	public static void main(String[] args) {
		HashSet<String> string = new HashSet<>();      // it will only store unique elements not duplicate // it is unordered 
		string.add("apple");
		string.add("mango");
		string.add("banana");
		string.add("kiwi");
		string.add("kiwi");
		System.out.println(string.contains("apple"));
		System.out.println(string.contains("kiwi"));
		for(int i = 0 ; i<string.size() ; i++) {
			System.out.println(string.size());
		}
		
		string.forEach(e->System.out.print(e + " "));
		

	}

}

