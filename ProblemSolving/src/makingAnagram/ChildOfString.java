package makingAnagram;

import java.util.Scanner;

public class ChildOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		
		int result  = commonchild(s , s1);
		System.out.println(result);

	}

	private static int commonchild(String s, String s1) {
		int[][] child = new int[s.length()+1][s1.length()+1];
		
		for(int i=0 ; i < s.length() ; i++) {
			for(int j=0 ; j <s1.length() ; j++) {
				if(s.charAt(i)== s1.charAt(j)) {
					child[i+1][j+1] = child[i][j]+1;
				}
				else {
					child[i+1][j+1] = Math.max(child[i+1][j], child[i][j+1]);
				}
			}
		}
		return child[s.length()][s1.length()];
	}

}
