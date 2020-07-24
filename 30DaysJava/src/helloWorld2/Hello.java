package helloWorld2;

import java.util.Scanner;

class Calculator{
	
	
	public int power(int n , int p) throws Exception{
				
		if(n >0 && p > 0) {
			int a = (int)Math.pow(n, p);
			return a;
		}
		
		else {
			throw new Exception("n and p should be negative");
		}
		
	}
	
}


public class Hello {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        while (t-- > 0) {
	        
	            int n = in.nextInt();
	            int p = in.nextInt();
	            Calculator myCalculator = new Calculator();
	            try {
	                int ans = myCalculator.power(n, p);
	                System.out.println(ans);
	            }
	            catch (Exception e) {
	                System.out.println(e.getMessage());
	            }
	        }
	        in.close();

	}

}
