package application;

import java.util.Arrays;

public class StringList {

	public static void main(String[] args) {

		String[] str = { "ravi", "ranjan" };
		Arrays.stream(str).forEach(string -> {
			System.out.println(string);
		});

	}

}
