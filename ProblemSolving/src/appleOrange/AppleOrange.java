package appleOrange;

import java.util.Scanner;

public class AppleOrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] st = sc.nextLine().split(" ");
		int s = Integer.parseInt(st[0]);
		int t = Integer.parseInt(st[1]);
		
		String[] ab = sc.nextLine().split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		
		String[] mn = sc.nextLine().split(" ");
		
		int m = Integer.parseInt(mn[0]);
		int n = Integer.parseInt(mn[1]);
		
		int[] apple = new int[m];
		int[] orange = new int[n];
		
		for(int i=0 ; i < m ; i++) {
			apple[i] = sc.nextInt();
		}
		
		for(int i =0 ; i < n ; i++) {
			orange[i] = sc.nextInt();
		}
		
		count(s,t,a,b,apple ,orange);
		
		

	}

	private static void count(int s, int t, int a, int b ,  int[] apple, int[] orange) {
			
				int Acount=0;
				int Ocount=0;
				for(int i=0 ; i < apple.length ; i++) {
					apple[i] +=a;
					
					if(apple[i] >=s && apple[i] <=t) {
						Acount++;
					}
				}
				
				for(int i=0 ; i < orange.length ; i++) {
					orange[i] +=b;
					
					if(orange[i] >=s && orange[i] <=t) {
						Ocount++;
					}
				}
				
				System.out.println(Acount);
				System.out.println(Ocount);
				
				
		
	}
}