package application;

import java.util.ArrayList;
import java.util.List;

class Billi{
	String name;
	Billi(String name){
		
		this.name = name;
		
	}
	
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object other) {
		
		if(this == other) {
			return true;
		}
		
		if(other == null) {
			return false;
		}
		
		if(!(other instanceof Billi)) {
			return false;
		}
		
		if(this.name == null) {
			return false;
		}
		
		Billi b = (Billi)other;
		
		if(b.name == null) {
			return false;
		}
		return this.name.equals(b.name);
	}
}
public class RemoveElements {

	public static void main(String[] args) {
		
		Billi cat = new Billi("billi");
		List<Billi> list = new ArrayList<>(List.of(new Billi("billi") ,new Billi("bilaar") ,new Billi("bakchod billi")));
		list.remove(1);
		list.remove(cat);
		
		list.forEach(e-> System.out.println(e));

	}

}
