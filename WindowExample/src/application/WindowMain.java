package application;

public class WindowMain {

	public static void main(String[] args) {
		Window window = new Window(23 , 5.5 , "cotton" , true);
				
		Window window1 = new Window(45 , 6.7 ,"silk" , false);
				
		Window window2 = new Window();
		//here we need to define a constructor without any parameter 
		
		System.out.println(window);
		System.out.println(window1);
		System.out.println(window2);      //we dont need to call toString method because println will automatically call the toString method which is inbuit property of println
		
	
		
		// we use constructor with parameter to get rid of the repititive code wich we are using for set values 
		//we can remove the repitition of the get values also for that we use toString method;

	}

}
