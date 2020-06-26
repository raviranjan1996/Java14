package application;

public class MenuReturning {

	String[] option = { "Add Database", "Add item", "delete item", "quit program" };

	String display() {
		String menuOptions = "Enter the options:-> \n";
		for (String options : option) {
			menuOptions += String.format("%s\n", options);
		}
		return menuOptions;
	}
}
