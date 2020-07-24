package application;

public class App {

	public static void main(String[] args) {
		DefaultRunnable[] obs = { new Machine() , new Player()};
		for(var objs: obs) {
			objs.run();
			objs.getDescription();
		}
	}
}
