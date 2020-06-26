package application;

public class MenuReturningString {

	public static void main(String[] args) {
		MenuReturning menuReturning = new MenuReturning();
		String menuOption = menuReturning.display();
		System.out.printf(menuOption);
	}
}
