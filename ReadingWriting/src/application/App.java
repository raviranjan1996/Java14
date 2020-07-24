package application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
			//the below code will create a file in the the project folder.
		
			Path path = Paths.get("text.txt");
			String text= "hello\nthere";
			Files.write(path , text.getBytes());
			
			
			//viewing the folder content
			File currentFile = new File(".");
			System.out.println(currentFile.getCanonicalPath());
			
			for(String f: currentFile.list()) {
				System.out.println(f);
			}
			
			// reading file
			Path paths = Paths.get("E:\\\\2019\\\\sfsdsd.txt");
			String retrieveFile = Files.readString(paths);
			System.out.println(retrieveFile);
	}
} 
 