package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		String filePath = "E:\\java 11\\ReactionTimes\\reactiontimes.csv";

		File file = new File(filePath);

		if (file.exists()) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}

		try (var dos = new BufferedReader(new FileReader(file))) {
			String line;
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			int total = 0;
			int lineNumber = 0;
			String[] field;

			while ((line = dos.readLine()) != null) {
				field = line.split(",");
				if (field.length != 3) {
					System.err.println("Line dosent contain 3 field: " + line);
					continue;
				}

				int reactiontime = 0;
				try {
					reactiontime = Integer.parseInt(field[2]);
					
				} catch (NumberFormatException e) {
					System.out.println("number badly formated in file: " + field[2] + "on line: " + lineNumber);
				}
				min = reactiontime < min ? reactiontime : min;
				max = reactiontime > max ? reactiontime : max;

				total += reactiontime;
				lineNumber++;
			}
			
			if(lineNumber == 0) {
				return;
			}
			
			System.out.println("Min: " + min + "ms");
			System.out.println("Max: " + max + "ms");
			System.out.println("total: " +(double)total/lineNumber +"ms");
			System.out.println("Total line reads: " + lineNumber);
			
			
		} catch (NumberFormatException e) {
			System.out.println("formating mismatch:" + file);
		} catch (FileNotFoundException e) {

			System.out.println("File can not found: " + file);
		} catch (IOException e) {

			System.out.println("reading no complete: " + file);
		}
		System.out.println("reading complete");

	}
}
