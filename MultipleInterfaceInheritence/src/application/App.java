package application;

public class App {

	public static void main(String[] args) {
	//Person p = new Person();
		//or
		Speaker p1 = new Person();
		   //p1.greet();
		   p1.speak();
		   
		   Person p2 = (Person)p1;
	//or	  
		   p2.greet();
	}

}
