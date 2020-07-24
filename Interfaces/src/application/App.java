package application;

public class App {

	public static void main(String[] args) {
			Decribable[] obs = {new Person() , new Computer()};
			for(Decribable obj: obs) {
				obj.getDescription();
				obj.desc();
				System.out.println(obj.getDescription());
				System.out.println(obj.desc());
			}
	}
		
}
//
