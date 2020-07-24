package helloWorld2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> array = new ArrayList<>();
			
		int s = scan.nextInt();
		
		for(int i =0 ; i< s ; i++) {
			
			int d = scan.nextInt();
			var l = new ArrayList<Integer>();
			
			for(int j=0 ; j<d ; j++) {
				l.add(scan.nextInt());
			}
			
			array.add(l);
		}
		
		int q = scan.nextInt();
		
		for(int k=0 ; k<q ;k++) {
			int q1 = scan.nextInt();
			int q2 = scan.nextInt();
			
			try {
				System.out.println(array.get(q1-1).get(q2-1));
			}
			catch(Exception e) {
				System.out.println("ERROR!");
			}
			
		}
			
	scan.close();	

	}

}
