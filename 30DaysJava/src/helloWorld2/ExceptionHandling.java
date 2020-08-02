package helloWorld2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception{
		
		{
		    try(Scanner in = new Scanner(System.in))
		    {
		        System.out.println(in.nextInt()/in.nextInt());
		    } catch(InputMismatchException ex)
		    {
		        System.out.println(ex.getClass().getName());
		    }
		    catch(ArithmeticException ae)
		    {
		        System.out.println(ae);
		    }
		}
	}
}