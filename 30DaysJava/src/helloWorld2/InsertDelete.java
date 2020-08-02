package helloWorld2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertDelete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {

			list.add(i, sc.nextInt());
		}

		int querry = sc.nextInt();
		for (int j = 0; j < querry; j++) {

			String insert = sc.next();
			if (insert.equals("Insert")) {
				int index = sc.nextInt();
				int value = sc.nextInt();

				list.add(index, value);
			}

			else {

				int Dnum = sc.nextInt();
				list.remove(Dnum);
			}

		}
		for (int elements : list) {
			System.out.print(elements + " ");
		}
		sc.close();
	}

}
