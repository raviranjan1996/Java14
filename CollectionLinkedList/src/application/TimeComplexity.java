package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimeComplexity {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();

		try (var dis = new BufferedWriter(new FileWriter("text.txt"))) {
			
			for (int number = 0; number < 1E6; number += 5000) {
				for (int i = 0; i < number; i++) {
					arrayList.add(i);
				}

				long duration = getTIme(arrayList);

			String	text = String.format("%d\t%d\n", number, duration);
				dis.write(text);

				System.out.println(text);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static long getTIme(List<Integer> list) {
		long start = System.currentTimeMillis();

		for(var n: list) {
			
		}
		
	
		return System.currentTimeMillis() - start;
	}

}
