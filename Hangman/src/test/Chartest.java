package test;

import java.util.stream.IntStream;

public class Chartest {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 'a';

		System.out.println(c1 == c2);

		char c3 = '\u0000';

		System.out.println("'" + c3 + "'");

		char c4 = '\u00A9';

		System.out.println("'" + c4 + "'");
		
		char c5=65;
		System.out.println(c5);
		
		
		String text = "orange";
		for(int i=0 ; i<text.length() ; i++) {
			System.out.println(text.charAt(i));	
		}
		System.out.println("---------------------");
		String texts ="ravi";
		IntStream.range(0 ,  texts.length()).forEach(i ->{
			System.out.println(texts.charAt(i));
		});
		
	}

}
