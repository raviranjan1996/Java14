package application;

public class Cat extends Animal {
	
	public String toString() {
		return "cat";
	}
	
	public void jump() {
		System.out.println("jump");
	}
	
	public static Object getCat() {
		return new Cat();
	}

}
