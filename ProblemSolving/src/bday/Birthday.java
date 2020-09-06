package bday;

import java.util.Arrays;
import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int array[] = new int[n];
		
		for(int i=0 ; i <array.length ; i++) {
			array[i] = sc.nextInt();
		}
		int count=0;
		int a= sc.nextInt();
		int b = sc.nextInt();
		for(int i= 0 ; i<=n-b ; i++) {
		if(Arrays.stream(array, i, i+b).sum()==a) {
			count++;
		}
			
		}
		System.out.println(count);
		
		Arrays.stream(array).forEach(e->System.out.print(e+ " "));
	}
}
