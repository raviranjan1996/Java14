package helloWorld2;
import java.util.Scanner;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	public int diff;
	public Difference(int[] a){
        this.elements = a;

    }

    public void computeDifference(){
    	
    	maximumDifference = Integer.MIN_VALUE;
    	
            for(int i=0 ; i< elements.length ; i++) {
            	
            		for(int j =i ; j < elements.length ; j++) {
            			
            		
            		diff= Math.abs(elements[i] - elements[j]);
            		maximumDifference = Math.max(maximumDifference, diff);	
            	}
            	
            	
            }
    }

}// End of Difference class

public class SumDiff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}