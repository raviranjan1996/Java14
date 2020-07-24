package application;


public class App {

	public static void main(String[] args) {
		Fox fox = new Fox();
			System.out.println(fox);
			System.out.printf("%x\n" ,fox.hashCode());
			Fox foxx = fox;
			System.out.println(foxx);
			foxx.running();
		
			System.out.println(fox.name);
	}
}
