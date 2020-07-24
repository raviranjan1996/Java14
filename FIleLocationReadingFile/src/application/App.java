package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
			String fileLocation = "E:\\java 11\\FileLocationReadingFile\\test.txt";
			System.out.println(new File(fileLocation).exists());
			System.out.println();
			
			//Reading text line by line
			//try with resources always called close method
			try(BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
				String line = null;
				while((line = reader.readLine()) != null){
					
					System.out.println(line);
					
				}
			}
			catch(FileNotFoundException e) {
				System.err.println("File not found: " + fileLocation);
			}
			catch(IOException e) {
				System.out.println("Error opning file: " + fileLocation);
			}
			
			File f = new File(".");
			for(String file: f.list()) {
				System.out.println(file);
			}
			
			
	}

}
