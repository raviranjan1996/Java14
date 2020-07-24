package application;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class App {
	public static void main(String[] args) {
		int value = 123;
		int value1 = 0x02345456; // int is 4 byte and each byte we have 8 bit
		
		ByteBuffer buffer = java.nio.ByteBuffer.allocate(4);
		buffer.order(ByteOrder.LITTLE_ENDIAN);// reverse the value in array
		buffer.putInt(value1);
		byte[] bytes = buffer.array();

		for (var b : bytes) {
			System.out.printf("%02x ", b);
		}

	}
}