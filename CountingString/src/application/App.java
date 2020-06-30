package application;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		String str="raviranjan patel";

		int[] count = new int[256];
		String str1="aabbccggaa";
		
		  IntStream.range(0,str1.length()).forEach(i->{
		  count[str1.charAt(i)]++;
		  });
		  
		  for(int i=0 ; i<str1.length() ; i++) {
		  System.out.printf("%s: %d\n",str1.charAt(i),count[str1.charAt(i)]);
	
		  }
		
		StringMatch.match(str);
		
		
	}

}