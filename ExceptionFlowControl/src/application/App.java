package application;

public class App {

	public static void main(String[] args) throws Exception{
		try {
		new Person().setName("marry");
		System.out.println("hello");
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		finally {     //always run
			System.out.println("running....");
		}
		
		System.out.println("program conpleted");
	}

}
