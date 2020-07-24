package application;

public class FloatingType {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	float floatValue=23.54f;
	double doubleValue=345345.4434223;
	
	System.out.println("float contain :-> " + Float.SIZE/8 + " bytes");
	System.out.println("Double contains :-> " + Double.SIZE/8 + " bytes");
	
	float f = 1.234567798765322f;
	System.out.printf("%.20f\n" , f );
	
	double d = 1.234567798765322;
	System.out.printf("%.20f" , d );
	
   
}

	
	
	
	
	
	}


