package application;

public class BooleanAnd {

	public static void main(String[] args) {
			// == , || , != , &&
		boolean isRaining = true;
		boolean haveUmbrella = false;
		boolean takeUmbrella =false;
		
		if(isRaining) {
			if(haveUmbrella){
				takeUmbrella=true;
			}
		}
		System.out.println(takeUmbrella);
		
		if(isRaining && haveUmbrella) {
			takeUmbrella=true;
			
		}
		System.out.println(takeUmbrella);
		
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		System.out.println(takeUmbrella);
		takeUmbrella = isRaining&&haveUmbrella;
		System.out.println(takeUmbrella);
	}

}
