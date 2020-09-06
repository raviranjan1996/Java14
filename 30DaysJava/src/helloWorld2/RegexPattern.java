package helloWorld2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegexPattern {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		String regEx = ".+@gmail\\.com$";
		Pattern pattern = Pattern.compile(regEx);
		
		List<String> list = new ArrayList<String>();
		for(int i=0 ; i< N ; i++) {
			String name = scanner.next();
			String email = scanner.next();
			
			Matcher matcher = pattern.matcher(email);
			if(matcher.find() && email.length() <=50 && name.length() <=20) {
				list.add(name);
			}
			
			Collections.sort(list);
		}
		
		for(var array:list) {
			System.out.println(array);
		}
		
	}

}
