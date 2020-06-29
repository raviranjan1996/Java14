package test;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
	int[] values = {2,4,6,3,4};
	Random random = new Random();
	
	for(int i =0 ; i<100 ; i++) {
	int randomValues = values[random.nextInt(values.length)];
	System.out.println(randomValues + " ");
	
	}
	}

}
