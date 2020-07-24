package application;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
	String fileName="text.bin";
		App app =new App();
		
		app.writeFile(fileName);
		app.readFile(fileName);
		
	}
	
public void readFile(String fileName) {
		
		File file = new File(fileName);
		
		
		try(var dis = new DataInputStream(new FileInputStream(file))){
			
			int value =dis.readInt();
			
			byte b1 =dis.readByte();
			byte b2 = dis.readByte();
			
		
			
			System.out.println(value + " ," + b1 + " , " + b2);
			
			
		} catch (FileNotFoundException e) {
			System.err.println("Cannot open: " + file.getAbsolutePath());
		}				
		 catch (IOException e) {
			 System.err.println("Cannot read: " + file.getAbsolutePath());
		}
		System.out.println("reading complete: " + file.getAbsolutePath());
		System.out.println(file.length());
}	
	
	
	
	public void writeFile(String fileName) {
		
		File file = new File(fileName);
		
		int value=3;
		byte[] bytes = {3,4};
		
		try(var dos = new DataOutputStream(new FileOutputStream(file))){
			dos.writeInt(value);
			for(var b: bytes) {
				dos.write(b);
			}
			
			
		} catch (FileNotFoundException e) {
			System.err.println("Cannot create: " + file.getAbsolutePath());
		}				
		 catch (IOException e) {
			 System.err.println("Cannot write: " + file.getAbsolutePath());
		}
		System.out.println("Written: " + file.getAbsolutePath());
		System.out.println(file.length());
		
	}

}