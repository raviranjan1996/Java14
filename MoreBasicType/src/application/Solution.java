package application;

import java.util.Scanner;

public class Solution {

	public static int B ;
	public static int H ;
	public static boolean flag;

	static {
		
		Scanner sc= new Scanner(System.in);
		B=sc.nextInt();
		H=sc.nextInt();
		
		if(B>0 && H> 0) {
			flag=true;
		}
		
		else {
			flag=false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		sc.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class