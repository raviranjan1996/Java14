package application;

public class App {

	public static void main(String[] args) {
		int count = 0;
		while (count < 10) {
			System.out.println("hello " +count);

			if (count == 5) {
				break;  //will leave out the first loop.
			}
			count++;
		}
			System.out.println("finished");
		
	}
}
