package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter a number");
			int a = sc.nextInt();
			System.out.println(a);
		}
		catch(InputMismatchException e) {
			System.out.println("please enter a number :- "+ e.getMessage());
		}
	}
}