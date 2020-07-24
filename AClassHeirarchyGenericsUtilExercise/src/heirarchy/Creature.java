package heirarchy;

public class Creature {
	
	public String name;
	
	public Creature(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public void feed() {
		System.out.println(name + "feeding..");
	}

}
