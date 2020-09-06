package collectionsHashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Creature{
	private int id;
	private String name;
	
	public Creature(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Creature))
			return false;
		Creature other = (Creature) obj;
		
		
		return this.id == other.id;
	}
	public String toString() {
		return id + "-> " + name;
	}
}

public class HashsetAlgorithm {

	public static void main(String[] args) {
		
		HashSet<Creature> addCreature = new HashSet<>(Set.of(new Creature(5, "mongoos") ,new Creature(4, "lion") ,new Creature(6, "cat")));
		addCreature.add(new Creature(12, "elephant"));
		addCreature.add(new Creature(10, "cheetah"));
		addCreature.add(new Creature(11, "dog"));
		addCreature.add(new Creature(11, "Girrafe"));
		
		
		addCreature.forEach(e-> System.out.println(e));
		
	}

}
