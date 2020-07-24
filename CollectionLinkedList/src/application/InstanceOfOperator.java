package application;

import java.io.Serializable;

class Creature implements Serializable{

	private static final long serialVersionUID = 1L;
	
}

class Cat extends Creature{
private static final long serialVersionUID = 1L;
	
}
public class InstanceOfOperator {

	public static void main(String[] args) {
	Creature c1 = new Creature();
	
	Object c2 = c1;
	Cat c3 = new Cat();
	Serializable c4 =c3;
	System.out.println(c1 instanceof Creature);
	System.out.println(c2 instanceof Integer);
	System.out.println(c3 instanceof Cat );
	System.out.println(c3 instanceof Creature );
	System.out.println(c1 instanceof Cat  );
	System.out.println(c3 instanceof Serializable);
	System.out.println(c4 instanceof Creature);

	}

}
