package application;

public class VariableArgument {

	public static void main(String[] args) {
			
		new VariableArgument().run( 4, "hello" , "how" , "are" , "you" , "?");

	}
	
	public void run(int value ,String... text) {      // must be in he last
		System.out.println(value);
		for(var texts:text) {
		System.out.println(texts);
	}
	}
}
