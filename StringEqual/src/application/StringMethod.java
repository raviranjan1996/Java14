package application;

public class StringMethod {

	public static void main(String[] args) {

		String name = "joe";
		if (name.equals("joe")) {
			System.out.println("1. Name is joe");
		}
		if (name.equalsIgnoreCase("JOe")) {
			System.out.println("2. name is JOE");
		}

		System.out.printf("The length of %s is %d\n", name, name.length());

		System.out.println(name.toUpperCase());
		System.out.println(name.isEmpty());
		System.out.println(name.indexOf("o"));
		System.out.println(name.indexOf('e', 1));
		System.out.println(name.charAt(2));
		
	}

}
