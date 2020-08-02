package helloWorld2;
import java.util.Scanner;
class MyCalculator1  {
    public int power(int n , int p) throws Exception{
        int result =0;
            if(n> 0 && p >0){
                result = (int)Math.pow(n,p);
                
            }
            else if(n==0 && p==0){
                    throw new Exception("n and p should not be zero.");
            }
             if(n<0 || p< 0){
                throw new Exception("n or p should not be negative.");

            }
             
             if(p ==0) {
            	 return 1;
             }

            return result;
}
}

public class MuCalculator {
    public static final MyCalculator1 my_calculator = new MyCalculator1();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}