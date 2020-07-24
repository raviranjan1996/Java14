package helloWorld2;

import java.util.Scanner;

public class StringSplit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
		        String s = scan.nextLine().trim();
		       
	  //     String[] str = s.split("[!,?.*_'@\\\\ ]+");
		      
		        
		        if (s == null || s.equals("") || s.trim().equals("")) {
		        	System.out.println("0");
		        }
		        
		        if(s.length()>0) {
		       
		        String[] str = s.split("[!,?.*_'@\\\\ ]+");
	        	System.out.println(str.length);
	        	 for(String string:str) {
	        		 System.out.println(string);
	        	
		        }
		        }
		        else{
		        	return;
		        }
		        scan.close();
		      
	}
		}
