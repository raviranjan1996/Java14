package grade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		List<Integer> i = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int j = 0 ; j < n ; j++) {
			i.add(sc.nextInt());
		}
		
		List<Integer> result = grades(i);
		System.out.println(result);

	}

	private static List<Integer> grades(List<Integer> grades) {
				
		List<Integer> temp = new ArrayList<>();
        for(int i=0 ; i < grades.size() ; i++){
            temp.add(grades.get(i));
        }

         int i=0;
         int arr = temp.get(i);
        while(i<temp.size()){
        	
            if(arr % 5 ==0){
                if((arr - grades.get(i)) < 3 && arr >=40){
                		grades.add( i , arr);
                }
                i++;
            }
            else{
                arr++;
               
            }

        }
            return grades;
            }

}
