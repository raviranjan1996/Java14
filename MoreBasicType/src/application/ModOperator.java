package application;

public class ModOperator {

	public static void main(String[] args) {

		int value = 234;
		int calue2 = 23;
		System.out.println(value / calue2);
		System.out.println(value % calue2);

		for (int i = 0; i < 1_000; i++) {
			if (i % 100 == 0) {
				System.out.println("processed " + i + " Lines");
			}

		//	System.out.println(i % 12);
		}

		int number = 345;
		int temp = 0 ;
		while(number !=0) {
			temp += number%10;
			number = number/10;
		}
		System.out.println("sum to number:>-" +temp );
	}

}
