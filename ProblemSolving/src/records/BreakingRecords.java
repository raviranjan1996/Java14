package records;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BreakingRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int number = array[0];
		int countMin=0;
		int countMax=0;
		Set<Integer> max = new LinkedHashSet<Integer>();

		for (int i = 0; i < array.length; i++) {
			max.add(array[i]);
		}
		Set<Integer> m = new LinkedHashSet<>();
		Set<Integer> maximum = new LinkedHashSet<Integer>();
		Iterator<Integer> it = max.iterator();
		while (it.hasNext()) {
			int num = it.next();
			if (num <= number) {
				m.add(num);
			}
			if (num >= number) {
				maximum.add(num);
			}

		}

		if(m.size()==1) {
		//	System.out.println(m.size());
		}
		
		else {
			for(int element:m) {
				if(element < number) {
					number = element;
					countMin++;
				}
				else {
					continue;
				}
			}
		}
		number = array[0];
		if(maximum.size() ==1) {
			//System.out.println(maximum.size());
		}
		else {
			for(int element:maximum) {
				if(element > number) {
					number = element;
					countMax++;
				}
				else {
					continue;
				}
			}
		}
		
		
		System.out.print(countMax + " " + countMin);
		

	}

}
