package application;

import java.util.Scanner;

public class AreaOfParallelogram {
	
	
	public static int Area(int B , int H) {
		return B*H;
	}
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int b,h;
		b= scanner.nextInt();
		h=scanner.nextInt();
		try {
			if(b>0 && h>0) {
				int area = AreaOfParallelogram.Area(b, h);
				System.out.println(area);
			}
			else {
				scanner.close();
				throw new Exception("java.lang.Exception: Breadth and height must be positive");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
