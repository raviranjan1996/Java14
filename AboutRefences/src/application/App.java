package application;

public class App {

	public static void main(String[] args) {
		
		//18002089898
		
		Person p1 = new Person();
		System.out.println(p1);
		Person p2=p1;
		System.out.println(p2);
			test(p2);	
			p1.person(p2);
	}
	public static void test(Person person) {
		System.out.println(person);
	}

}   // all the time it will call the same object not other object is created
