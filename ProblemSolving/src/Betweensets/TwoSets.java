package Betweensets;

import java.util.Scanner;

public class TwoSets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		int n = sc.nextInt();
		
		int[] a = new int[m];
		int[] b = new int[n];
		
		for(int i=0 ; i<a.length ; i++) {
			a[i]  =sc.nextInt();
			
		}
		for(int i=0 ; i < b.length ; i++) {
			b[i] = sc.nextInt();
		
		}
		int lcm = lcm(a);
		int gcd = gcd(b);
		int count=0;
			
		for(int i= lcm , j =2 ; i <=gcd ; i = lcm*j , j++) {
			if(gcd % i ==0) {
				count++;
			}
		}
		System.out.println(count);
		
	}

	private static int gcd(int[] b) {
			int result = b[0];
			for(int i=1 ; i < b.length ; i++) {
				result = gcd(result , b[i]);
			}
		return result;
	}

	private static int gcd(int result, int i) {
			while(i>0) {
				int temp = i;
				i = result%i;
				result = temp;
			}
		return result;
	}

	private static int lcm(int[] a) {
		int result = a[0];
		for(int i=1 ; i < a.length ; i++) {
			result = lcm(result , a[i]);
		}
		return result;
	}

	private static int lcm(int result, int i) {
		 
		return result *(i/gcd(result , i));
	}

}
