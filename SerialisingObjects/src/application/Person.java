package application;

import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	private int id;                          //defining static will not load the file bcz static cannot be deserialised
	//defiing transient keyword in the id will defualt set the id value to 0 , it will no deserialize
	public Person(String name , int id) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "Person[Name: " + name + ", " + " Id: " + id + "]";
	}
}