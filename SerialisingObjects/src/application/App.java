package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
	public static void main(String[] args) {
		Person person = new Person("ravi", 3);
		Person person1 =new Person("ranjan", 1);
		String pathString = "test.bin";
		// String pathString1 = "test.xls";
		
		// this code is for writing the file  of object
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(pathString))) {
			os.writeObject(person);
			os.writeObject(person1);
		} catch (FileNotFoundException e) {
			System.out.println("File Cannot created : " + pathString);
		} catch (IOException e) {
			System.out.println("FIle writing cannot completed at the location " + pathString);
		}

		System.out.println("File " + pathString + " completed");

		// this code is for reading
		
		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(pathString))) {
		
			Person p = (Person)os.readObject();
			Person p1= (Person)os.readObject();
			System.out.println(p);
			System.out.println(p1);
		} catch (FileNotFoundException e) {
			System.out.println("File Cannot open : " + pathString);
		} catch (IOException e) {
			System.out.println("FIle reading cannot completed from the location " + pathString);
		} catch (ClassNotFoundException e) {
			System.out.println("Canot read object from file " + pathString);
		}

		System.out.println("File " + pathString + " reading completed");

	}
}
