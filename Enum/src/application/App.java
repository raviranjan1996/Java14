package application;

public class App {
	public static void main(String[] args) {
			Fruit fruit = Fruit.Name;
			Fruit fruit1 = Fruit.age;
			Fruit fruit2 = Fruit.roll;
			System.out.println(fruit);
			System.out.println(fruit1);
			System.out.println(fruit2);
			
			Fruit[] fruits = Fruit.values();
			for(Fruit frt:fruits) {
				System.out.println(frt + " , " + frt.ordinal());         //ordinal is a method which gives the index number
			}
			Fruit fruit3 = Fruit.valueOf("Name");     // converts the string into actual enum
			System.out.println(fruit3);
			
			System.out.println(fruit3 == Fruit.Name);
			
	}
}

// enum- it is a special class class which represents a group of constant like unchangeble , final .
// used to represents different states of a programe.