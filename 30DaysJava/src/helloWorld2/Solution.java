package helloWorld2;

import java.util.*;

class Persons {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Persons(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Persons {

	private int[] testScores;

	public Student(String firstName, String lastName, int id, int[] testScores2) {
		super(firstName, lastName, id);
		this.testScores = testScores2;
	}

	public Character calculate() {

		double sum = 0;
		double avg=0;
		for (int i = 0; i < testScores.length; i++) {

			sum = (sum + testScores[i]);
		}
			avg = sum/testScores.length;
			return  avg > 89 ? 'O' : avg >79 ? 'E' : avg >69 ? 'A' : avg >54 ?'P' :avg >39 ?'D' : 'T' ;
		
	}
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
