package helloWorld2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine().trim();
		
		int number = Integer.parseInt(num);
		int temp = number;
		int sum=0;
		while(number>0) {
			int n = number%10;
			 sum += (int) Math.pow(n, num.length());
			number = number/10;
		}
		if(temp==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	}
	


}
