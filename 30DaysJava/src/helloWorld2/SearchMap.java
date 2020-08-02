package helloWorld2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> list = new LinkedHashMap<String, Integer>();
		int contacts = sc.nextInt();
		sc.nextLine();
		for(int i =0 ; i< contacts ; i++) {
			String name = sc.nextLine().trim();
			int number = sc.nextInt();
			sc.nextLine();
			
			list.put(name, number);
		}
		
		while(sc.hasNext()) {
			String text = sc.nextLine().trim();
			if(list.containsKey(text)) {
			
				System.out.println(text + "=" + list.get(text));
			}
			else {
				System.out.println("Not found");
			}
					
		}
		
		sc.close();
	}
}

