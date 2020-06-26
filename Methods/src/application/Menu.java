package application;

public class Menu {

	String[] options = { "1. View Database", "2. Add new Items", "3. Delete Items", "4. Quit Program" };

	void display() {
		System.out.println("Choose the option:-> ");
		for (String option : options) {
			
			System.out.println(option);
		}
	}
}
