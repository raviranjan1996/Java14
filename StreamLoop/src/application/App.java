package application;

import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		int count[] = {5};
		IntStream.range(0, 5).forEach(loop -> {
			System.out.println("Count : > " + count[0]++);
			
		});
	}
}
