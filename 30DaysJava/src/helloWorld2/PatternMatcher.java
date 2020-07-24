package helloWorld2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int testCases = Integer.parseInt(scan.nextLine());
		while(testCases > 0) {
			
		String s = scan.nextLine();
		
		String pattern="(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";


		
		Pattern pt = Pattern.compile(pattern);
		
		Matcher m = pt.matcher(s);
		
		if(m.matches()) {
			System.out.println("valid");
		}
		else {
			System.out.println("no");
		}
		
	}
		scan.close();
	}
}
