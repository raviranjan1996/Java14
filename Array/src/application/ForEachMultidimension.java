package application;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ForEachMultidimension {

	public static void main(String[] args) {
		/* String[][] */ var  texts = new String[][] { { "one", "two", "three" }, { "four", "five", "six" },
				{ "seven", "eight", "nine" } };
			texts[1][1]="eleven";
		for (String[] subArrays : texts) {
			for (String word : subArrays) {
				System.out.printf("%s\t", word);
			}
			System.out.println();
		}

		System.out.println("--------------------------");
		Arrays.stream(texts).forEach(subArrays -> {
			Arrays.stream(subArrays).forEach(word -> {

				System.out.printf("%s\t", word);

			});
			System.out.println();
		});

		System.out.println("--------------------");
		IntStream.range(0, texts.length).forEach(i -> {
			String[] subArrays = texts[i];

			IntStream.range(0, subArrays.length).forEach(j -> {
				System.out.printf("%s\t", subArrays[j]);
			});
			System.out.println();
		});
		System.out.println("--------------------------");
		for (int i = 0; i < texts.length; i++) {
			String[] subarrays=texts[i];
			for (int j = 0; j < texts[i].length; j++) {
				System.out.printf("%s\t",texts[i][j]);
			}
			System.out.println();
		}
	}

}
