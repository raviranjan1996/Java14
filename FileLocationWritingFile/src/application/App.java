package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args){
			String fileLocation = "E:\\java 11\\FileLocationWritingFile\\test.txt";
			System.out.println(new File(fileLocation).exists());
			System.out.println();
			
			try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation))){
				
				writer.write("hello ravi how are you how ur life going \n what u ll do in ur life \n u have to do somthing big");
				writer.newLine();
				writer.append("ravi ranjan patel");
				
			}
			catch(IOException e) {
				System.out.println("cannot write file: " + fileLocation);
			}
			
			System.out.println("FIle writing completed: " + fileLocation);
	}

}
