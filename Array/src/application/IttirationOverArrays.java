package application;

public class IttirationOverArrays {

	public static void main(String[] args) {

		String[] str = { "ravi", "ranjan", "patel" };

		for (int i = 0; i < str.length; i++) { // no bracket in length because it not a method here its just a property
												// of array
			System.out.printf("%d %s\n", i, str[i]);

		}
	}

}
