package application;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
			String fileName = "text.txt";
			File file = new File(fileName);
			
			int value = 1;
			byte[] bytes = {2 ,3};
			
			try(var dos = new DataOutputStream(new FileOutputStream(file))){
				
				dos.writeInt(value);
				
				for(var b:bytes) {
					dos.writeByte(b);
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