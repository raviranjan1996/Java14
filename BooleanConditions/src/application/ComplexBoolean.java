package application;

public class ComplexBoolean {

	public static void main(String[] args) {
		boolean isRaining = false ;
		boolean mightRaining = false;
		boolean haveUmbrella = true;
		
		if((isRaining||mightRaining) && haveUmbrella){
			System.out.println("take umbrella");
		}
		else {
			System.out.println("dont take umbrella");
		}

	}

}
