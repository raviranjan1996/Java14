package application;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App{
	public static void main(String[] args) {
		
		String filePath = "E:\\java 11\\ReadingJavaClassFile\\bin\\application\\App.class";
		
		File file = new File(filePath);
			
		if(!file.exists()) {
			System.out.println("File dont exist: " + file);
		}
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(file))){
			
			int magicNumber = dis.readInt();
			String hex = Integer.toHexString(magicNumber);
			System.out.println(hex);
			
			int minorVersion = dis.readUnsignedShort();
			int majorVersion = dis.readUnsignedShort();
			String jdk = Integer.toOctalString(majorVersion);
			
			
			System.out.println(minorVersion + " , " + jdk);
			
			
		} catch (FileNotFoundException e) {
						System.out.println("File not found: " + file.getAbsolutePath());
		} catch (IOException e) {
			
			System.out.println("Reading canot cmpleted: " + file.getAbsolutePath());
			
		}
		System.out.println("completed");
		
		
		
		
		
		
		
		
	}
}