package helloWorld2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bigdecimalinteger {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
			Arrays.sort(s, 0,n, new Comparator<Object>() {

				@Override
				public int compare(Object o1, Object o2) {
					BigDecimal bd = new BigDecimal((String)o1);
					BigDecimal bd1 = new BigDecimal((String)o2);
					return bd1.compareTo(bd);
				}
			});
		
		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}