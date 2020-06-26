package application;

import java.util.Arrays;
import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		int count[] = {5};
		IntStream.range(0, 5).forEach(loop -> {
			System.out.println("Count : > " + count[0]++);
			
		});
		
		String[] str = {"ravi","ranjan"};
		Arrays.stream(str).forEach(string ->{
			
			System.out.println(string);
		});
		
	}
}
