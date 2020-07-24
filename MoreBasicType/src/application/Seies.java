package application;

import java.util.Scanner;

public class Seies {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		for (int i = 0; i < t; i++) {
			int sum=0;
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();
			for (int j = 0; j < n; j++) {
				
				if(j==0) {
					sum =sum + a+((int)Math.pow(2,j)*b);
				}
				
				else {
					sum += ((int)Math.pow(2,j)*b);
				}
				System.out.print(sum + " ");
				
			}
					}
		scanner.close();

	}

}

//2
//0 2 10
//5 3 5

//output
//2 6 14 30 62 126 254 510 1022 2046
//8 14 26 50 98