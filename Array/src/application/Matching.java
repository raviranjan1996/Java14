package application;

public class Matching {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 1, 2, 3 ,4 };

		int count=0;
	
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <=i; j++) {
				if (a[i] == b[j] && a.length==b.length) {
					count++;
					break;
			}
		}
			System.out.println(count);
		}
		if (count == a.length) {
			System.out.println("YES");
		} else {
			System.out.println("no");
		}

	}
}

