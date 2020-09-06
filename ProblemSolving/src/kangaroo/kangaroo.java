package kangaroo;

import java.util.Scanner;

public class kangaroo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();
		int i=0;
		boolean flag = true;
		while(i>=0 &&  i<10000 && flag) {
		
			if((x1+v1) == (x2+v2)) {
				System.out.println("Yes");
				flag= false;
				
			}
			else {
				x1 +=v1;
				x2 +=v2;
				i++;
			}
			
			if(i>=10000 && flag) {
				System.out.println("no");		
			}
			
		
		}
		
	}
	}


