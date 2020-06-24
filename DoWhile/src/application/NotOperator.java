package application;

public class NotOperator {

	public static void main(String[] args) {
		System.out.println(!(4 == 5));

		// != is a binary operator
		int value1 = 4, value2 = 5;
		if (value1 != value2) {
			System.out.println("Value is not equal");
		}
		else {
			System.out.println("value is equal");
		}
		
		String str1="apple";
		String str2="orange";
		if(!str1.equals(str2)) {
			System.out.println("String are not equals");
		}
		
		//confusing but can be done
		if(str1.equals(str2) !=true) {
			System.out.println("String are not equals");
		}
	}

}
