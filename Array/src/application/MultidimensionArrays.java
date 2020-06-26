package application;

import java.util.stream.IntStream;

public class MultidimensionArrays {

	public static void main(String[] args) {
		String[][] texts = { { "one", "two", "three" }, { "four", "five", "six" }, { "seven", "eight", "nine" }
		//(we can right this also) var texts= new String[][] { { "one", "two", "three" }, { "four", "five", "six" }, { "seven", "eight", "nine" }

		};

		IntStream.range(0, texts.length).forEach(i -> {
			String[] subarrays = texts[i];
			IntStream.range(0, subarrays.length).forEach(j -> {
				System.out.printf("%s\t", subarrays[j]);
			});
			System.out.println();
		});
		System.out.println("----------------------------");
		for (int i = 0; i < texts.length; i++) {
			String[] subarrays = texts[i];
			for (int j = 0; j < subarrays.length; j++) {
				System.out.printf("%s\t", subarrays[j]);
			}
			System.out.println();
		}
	}

}
