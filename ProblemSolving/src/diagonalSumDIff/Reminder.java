package diagonalSumDIff;

import java.util.Scanner;

public class Reminder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] ar = new double[n];
		double Ncount=0;
		double pCount=0;
		double zCount=0;
		for(int i=0 ; i < ar.length ; i++) {
			ar[i]= sc.nextInt();
		}
		
		
			for(int j=0 ; j<ar.length ; j++ ) {
				
				if(ar[j] < 0) {
					Ncount++;
				}
				
				if(ar[j]>0) {
					pCount++;
				}
				if(ar[j]==0) {
					zCount++;
				}
				
			}
			
			double n1 = pCount/n;
			double n2 = Ncount/n;
			double n3 = zCount/n;
			System.out.format("%.5f", n1);
			System.out.println();
			System.out.format("%.5f", n2);
			System.out.println();
			System.out.format("%.5f", n3);
			
			
		

	}

}
