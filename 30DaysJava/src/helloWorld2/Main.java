package helloWorld2;
import java.util.*;
abstract class Books{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}
class MyBook1 extends Books{

	@Override
	void setTitle(String s) {
	this.title = s;
		
	}
    
}


public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook1 new_novel=new MyBook1();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}