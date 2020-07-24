package test;

public class Ternaryoperator {

	public static void main(String[] args) {
		System.out.println(true ? "Yes" : "no");
		
		String name = "Ravi";
			
		name = name.equals("Ravi") ? "yes" : "no" ;
		System.out.println(name);
		
		int value = 56;
		value = value > 60 ? 60 : value;
		System.out.println(value);

		int[] values = { 4, 54, 23, 77, -12 };

		int min = Integer.MAX_VALUE;
		
		for (int currentValue : values) {
			min = currentValue < min ? currentValue : min;
		}
		System.out.println(min);

		int max = Integer.MIN_VALUE;
		for (int currentMax : values) {
			max = currentMax > max ? currentMax : max;
		}
		System.out.println(max);
	}

}
