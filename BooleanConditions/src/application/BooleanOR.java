package application;

public class BooleanOR {

	public static void main(String[] args) {
		boolean isRaining = true;
		boolean mightRaining = false;
		boolean takeUmbrella = false;
		if (isRaining || mightRaining) {
			takeUmbrella = true;
		}
		System.out.println(takeUmbrella);

		takeUmbrella = isRaining || mightRaining ? true : false;
		System.out.println(takeUmbrella);

		takeUmbrella = isRaining || mightRaining;
		System.out.println(takeUmbrella);
	}

}
