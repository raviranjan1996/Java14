package grade;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] tempArray = new int[array.length];
		int index=0;
		for(int i=0 ; i < array.length ; i++) {
			array[i] = sc.nextInt();
		}
		for(int i=0 ; i < array.length ; i++) {
			tempArray[index++] = array[i];
		}
		
		int i=0;
		 while(i < tempArray.length){
			if(tempArray[i] % 5 ==0 ) {
				if(tempArray[i] - array[i] < 3 && tempArray[i] >=40) {
					
					array[i] = tempArray[i];
				}
				i++;
			}
			else {
				tempArray[i]++;
			}
		}
		
		for(i=0 ; i < tempArray.length ; i++) {
			System.out.print(array[i] + " ");
		}
//				List<Integer> i = new ArrayList<Integer>();
//				i.add(23);
//				
//				System.out.println(i.si);
		}
	
	
	
}
