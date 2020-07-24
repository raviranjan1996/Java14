package application;

public class Cat {
	private String name;
	public static final String FOOD = "cat food";
	private static int count = 0;
	private int id;
	private static double height;
	static {              
		//it will run as the class run , first always static will run
		height=45.34;
		System.out.println("Run");
		System.out.println(height);
		
	}
	
	public static class People{
		class Printer{
			public void running() {
				System.out.println("running....");
			}
		}
	}
	
	public Cat(String name) {
		this.name = name;
		id =count;
		count++;
	}

	public static int getCount() {
	
		return count;
	}

	public String toString() {
		return String.format("Cat id: %d , name: %s", id , name);
	}

}

/*instance variable is associated with object static variable or method is associated with class
 * 
 * You need to make it final to make it associated with the class and not
 * instances of the class. You need to make it static so it's shared between all
 * objects and you can access it using the class
 */


//to make it associated with the class not with the instance(object) of th class we need a keyword static 

