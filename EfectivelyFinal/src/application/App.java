package application;

public class App {
	
	private int count;
	final int c = 0 ;
	public static void main(String[] args) {
			new App().print();
			//c=34;  not possible because we cannot change the final variable   
	}

	public void print() {
		int num = 1;             //called effective final
	 class Printer{
		 public void running() {
				System.out.println(num);
				System.out.println(count);
			}
		}
		new Printer().running();
		
	}
}
//we cant change the variable inside the  local class method , but we can access it if it is final and initialised in starting so that we cant change it