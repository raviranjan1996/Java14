package application;

class Person{
	public String name;
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object other) {
		System.out.println(other);
		if(this == other){
		return true;
		}
		if(other == null) {
			return false;
		}
		if(!(other instanceof Person)) {
			return false;
		}
		
		if(this.name == null) {
			return false;
		}
		Person p = (Person)other;
		
		if(p.name == null) {
			return false;
		}
		
		
		return this.name.equals(p.name);
	}
	


}


public class EqualsMethod {

	public static void main(String[] args) {
	Person p1 = new Person("ravi");
	Person p2 = new Person("rava");
	
	System.out.println(p1.equals(p2));

	}

}
