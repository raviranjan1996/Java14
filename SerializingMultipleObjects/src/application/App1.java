package application;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class App1 {

	public static void main(String[] args) {
						
			String filePath= "test.bin";
			
			Serializable[] people = new Serializable[2]; 
			people[0] = new Person("A", 1);
			people[1] = new Person("M", 2);
			try(ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream(filePath))){
				
				
				op.writeObject(people);
				}
				
			
			catch(FileNotFoundException e) {
				System.out.println("File cannot created " + filePath);
			} catch (IOException e1) {
				
				System.out.println("Writting file cannot completed: " + filePath);
			}
			
			System.out.println("File " + filePath + " completed");
	}

}
