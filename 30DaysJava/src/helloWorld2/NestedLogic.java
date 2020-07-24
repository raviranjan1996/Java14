package helloWorld2;

import java.util.Scanner;

public class NestedLogic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int fine = 0;
		int ad = sc.nextInt();
		int am = sc.nextInt();
		int ay = sc.nextInt();

		int ed = sc.nextInt();
		int em = sc.nextInt();
		int ey = sc.nextInt();

		if (ay > ey) {
			fine = 10000;
			System.out.println(fine);
		}
		if (ay < ey) {
			System.out.println(fine);
		}
		if (ay == ey) {

			if (am <= em && ad <= ed) {
				System.out.println(fine);
			} else if (am == em && ad > ed) {
				fine = 15 * (ad - ed);
				System.out.println(fine);
			}

			else {
				fine = 500 * (am - em);
				System.out.println(fine);
			}

		}

	}

}
