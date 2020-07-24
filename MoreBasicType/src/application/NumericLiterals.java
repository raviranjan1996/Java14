package application;

public class NumericLiterals {

	public static void main(String[] args) {
			
		long lValue = 1234567898676534234L;
		float fValue = 7.45F;
		byte bValue = (byte)128;
		System.out.println(lValue);
		System.out.println(bValue & 0xFF);
		System.out.println(fValue);

		int iValue = 1_00_000_0000;
		System.out.println(iValue);
		
		double dValue = 23E6;
		System.out.println(dValue);
	}

}
