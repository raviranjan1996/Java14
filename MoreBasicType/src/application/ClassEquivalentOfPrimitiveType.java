package application;

public class ClassEquivalentOfPrimitiveType {

	public static void main(String[] args) {
		
		/*
			boolean Boolean
			char Chaacter
			
			
			byte Byte
			short Short
			int Integer
			long Long
			
			float Float
			double Double
			
		 */
		Integer intValue = 128;
		Integer intValue1 =128;
		//equal
		System.out.println(intValue.equals(intValue1));   //do not use == to compare two non primitive values. In float we dont use even .equals function also
		
		
		
		
		//setting null
		
		Double dValue = null;    // we can set a nu,, to Double but it shoul be of class double .
		
		//parse method
		
		Integer intValues = Integer.parseInt("73");
		System.out.println(intValues);
		//Integer toBinaryString
		
		String toBinString = String.format("%8s", Integer.toBinaryString(8)).replace(' ', '0');
		System.out.println(toBinString);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
