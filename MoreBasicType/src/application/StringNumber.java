package application;

import java.util.Scanner;

public class StringNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count =0;
		
		while(scanner.hasNextLine()) {
			
			count++;
			System.out.println(count + " " + scanner.nextLine());
		}
		scanner.close();
	}

}
