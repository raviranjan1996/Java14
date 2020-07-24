package application;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Prime {

	public void checkPrime(int... number) {

		for (int num : number) {

			if (isPrime(num)) {
				System.out.println(num + " ");
			}
		}
		System.out.println();

	}

	public boolean isPrime(int n) {

		if (n < 2) {
			return false;
		} else if (n == 2) {
			return true;
		} 
		else if(n %2 ==0) {
			return false;
		}
		for (int i = 3; i <= (int)Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;

	}

}

public class CheckPrime {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			int n4 = sc.nextInt();
			int n5 = sc.nextInt();
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
