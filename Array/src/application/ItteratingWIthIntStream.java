package application;

import java.util.stream.IntStream;

public class ItteratingWIthIntStream {

	public static void main(String[] args) {
		String[] str = {"ravi" , "ranjan" , "patel"};
		IntStream.range(0,str.length).forEach(i -> {
			System.out.printf("%d %s\n" ,i ,str[i]);
		});
	}
}
