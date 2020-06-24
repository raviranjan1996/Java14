package application;

public class App {

	public static void main(String[] args) {
		String text1 = "oraNge";
		String text2 = "orange";
		// System.out.println(text1 == text2); //we cant use this for comparing the
		// string
		System.out.println(text1.equals(text2));

		// Final keyword

		final int VALUE = 10;
		System.out.println(VALUE);
		// value=11; //will give error
		
		final String USER_PASSWORD = "abc";
		System.out.println(USER_PASSWORD);
		
		final boolean OPTION=false;
		System.out.println(OPTION);
	//	OPTION =true;

	}
}
