package application;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultidimensionArrayPrintingDiagonal {

	public static void main(String[] args) {

		int[][] number = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		
		for(int[] subArrya:number) {
			for(int arrays:subArrya) {
				System.out.printf("%d\t" ,arrays);
			}
			System.out.println();
		}
		
		System.out.println("##############");
		
		
		Arrays.stream(number).forEach(i -> {
			Arrays.stream(i).forEach(j -> {

				System.out.printf("%d\t", j);

			});
			System.out.println();
		});

		System.out.println("------");
		IntStream.range(0, number.length).forEach(i -> {
			int[] numbers = number[i];

			IntStream.range(0, numbers.length).forEach(j -> {
				System.out.printf("%d\t", numbers[j]);
			});
			System.out.println();
		});
		System.out.println("^^^^^^^^^^^^^^^^^^^");
		int total = 0;
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				if (i == j) {
					System.out.printf("%d\t", number[i][j]);
					total += number[i][j];
				}
			}
		}
		System.out.println("total:> " + total);
		System.out.println("--------OR WE CAN USE ONLY ONE LOOP ALSO-------");
		int sum=0;
		for(int i=0 ; i<number.length;i++) {
			System.out.println(number[i][i]);
			sum +=number[i][i];
		}
		System.out.println("Total: " +sum);
	}

}
