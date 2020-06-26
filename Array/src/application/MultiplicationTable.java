package application;

import java.util.stream.IntStream;

public class MultiplicationTable {

	public static void main(String[] args) {

		int[][] table = new int[12][12];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.printf("%4d\t", (i + 1) * (j + 1));
			}
			System.out.println();
		}
		System.out.println("############################################################################");
		IntStream.range(0, table.length).forEach(i -> {
			IntStream.range(0, table[i].length).forEach(j -> {
				System.out.printf("%4d\t", (i + 1) * (j + 1));
			});
			System.out.println();
		});

		int[] number = { 1, 2, 3, 4, 6, 7, 8 };
		IntStream.range(0, number.length).forEach(i -> {
			try {
				if ((number[i] + 1) == number[i + 1]) {
				} else {
					System.out.println("Missing number is :> " + (number[i] + 1));
				}
			} catch (IndexOutOfBoundsException ex) {
				System.out.println(ex.getMessage());

			}
		});

	}

}
