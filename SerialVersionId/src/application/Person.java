package application;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 2L;       // the purpose of this serial version uid is to prevent you to saving a object with one sereal version id and reading with other version id 
	private String name;
	private int id;                       
	
	public Person(String name , int id) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "Person[Name: " + name + ", " + " Id: " + id + "]";
	}
}