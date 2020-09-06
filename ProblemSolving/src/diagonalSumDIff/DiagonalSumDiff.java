package diagonalSumDIff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalSumDiff {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> array = new ArrayList<List<Integer>>();
		
		int n = sc.nextInt();
		
		for(int i=0 ; i < n ; i++) {
			List<Integer> l = new ArrayList<Integer>();
			for(int j=0 ; j<n ; j++) {
				l.add(sc.nextInt());
			}
			
			array.add(l);
		}
		
		int arr = diagonal(array);
		System.out.println(arr);

	}

	private static int diagonal(List<List<Integer>> array) {
		int sum=0;
		int sum1=0;
		for(int i=0 ; i < array.size() ; i++) {
			
			sum += array.get(i).get(i);
			sum1 += array.get(i).get(array.size()-i-1);
		}
		int diff = Math.abs(sum-sum1);
		
		return diff;
	}

}
