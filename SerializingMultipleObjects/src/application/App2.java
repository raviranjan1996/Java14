package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class App2 {

	public static void main(String[] args) {

		String filPath = "test.bin";

		try (var os = new ObjectInputStream(new FileInputStream(filPath))) {

			Serializable[] people = (Serializable[]) os.readObject();
			System.out.println(people);
			for (var s : people) {
				System.out.println(s);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File Cannot open : " + filPath);
		} catch (InvalidClassException e) {
			System.out.println("Incompatible software version");
		} catch (IOException e) {
			System.out.println("FIle reading cannot completed from the location " + filPath);

		} catch (ClassNotFoundException e) {
			System.out.println("Canot read object from file " + filPath);
		}

		System.out.println("File " + filPath + " reading completed");

	}

}
