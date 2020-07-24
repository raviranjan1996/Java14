package helloWorld2;

public class HighestSumInArray {

	public static void main(String[] args) {

		int[][] number = {

				{1, 1, 1, 0, 0, 0},
				{0 ,1 ,0 ,0 ,0 ,0},
				{1 ,1 ,1 ,0 ,0 ,0},
				{0 ,0 ,2 ,4 ,4 ,0},
				{0 ,0 ,0 ,2 ,0 ,0},
				{0 ,0 ,1 ,2 ,4 ,0},
			};
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j <4; j++) {
				
			int sum = number[i][j]+number[i][j+1]+number[i][j+2]+number[i+1][j+1]+number[i+2][j]+number[i+2][j+1]+number[i+2][j+2];
			System.out.println(sum);
			
			max = Math.max(max ,  sum);
	}
		}
		System.out.println();
		System.out.println(max);
		
		 
		

	}

}
