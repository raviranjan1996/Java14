package application;

import java.util.Scanner;

public class ConversionOFPrimitiveType {

	public static void main(String[] args) {
		
		  int value1=8;
		  long valueL = value1;
		  
		  System.out.println(valueL); 
		  long valueL2= 1234567;
		  int value2 = (int)valueL2; //cannot cast high to low so we are  casting it by using 
		  System.out.println(value2);
		  
		  double dValue =valueL2;
		  
		  
		  int value3=23; byte byteValue = (byte)value3;
		  
		  System.out.println(byteValue);
		 
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();
		double d = scan.nextDouble();
		scan.close();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: "+ i);

	}

}
