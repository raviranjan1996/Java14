package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

class AddingPerson {
	private int number;
	
	public AddingPerson(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String toString() {
		return "Number: " + number;
	}
}
public class ArrayListExample {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		boolean flag = true;
		System.out.println("Enter the number and type Stop if you want to Stop:-");
		var array = new ArrayList<AddingPerson>();
		int sum=0;
		while(flag) {
		
			try {
			int s = scan.nextInt();
			sum +=s;
			array.add(new AddingPerson(s));
			}
			catch(InputMismatchException e) {
				break;
			}
		}
		scan.close();
		array.sort(new Comparator<AddingPerson>() {

			@Override
			public int compare(AddingPerson num1, AddingPerson num2) {
				
				Integer number1 = num1.getNumber();
				Integer number2 = num2.getNumber();
							
				return number1.compareTo(number2);
			}
			
		});
		array.forEach(e-> System.out.println(e));
		System.out.println("Total: " + sum/array.size());
	}
}
