package application;

public class App {

	public static void main(String[] args) {
		int counter = 0;
		while (counter < 10) {
			System.out.printf("Counter: %d\n", counter);
			counter = counter + 1;
		}
			//increment and decrement
		int count=0;
		count = count+1;
		System.out.println(count);
		count +=1;
		System.out.println(count);
		++count;
		System.out.println(count);
		count++;
		System.out.println(count);
		
		count = count-1;
		System.out.println(count);
		count -=1;
		System.out.println(count);
		count-- ;
		System.out.println(count);
		--count;
		System.out.println(count);
		
		int cats =0;
		System.out.println(cats++);
		System.out.println(cats);
		
		int dogs = 5;
		System.out.println(++dogs);
		System.out.println(dogs);
		
		
		
	}
}
 