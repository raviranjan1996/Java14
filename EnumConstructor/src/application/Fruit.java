package application;

public enum Fruit {
		APPLE("green") , BANANA("12")  , GUAVA("greeninsh") ;
		
		// we cant have modifier in enum constructor. no private public
		
	private String color;
	
	
		Fruit(String color) {
			this.color = color;
		}
		public String toString() {
		return super.toString().toLowerCase() + "(" + color + ")";
	}
}
