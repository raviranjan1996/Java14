package application;

public class HouseCat extends Cat {

	  // it will check the mathod in the parent class , f there is a method then it
	 // will not show errors othrwise it show error
	@Override
	public void vocalized() {
		System.out.println("Meaoow");
	}
	
	public void purr() {
		System.out.println("purrrrrrrrrr");
	}

}
