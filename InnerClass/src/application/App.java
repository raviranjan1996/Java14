package application;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App{
	private String name;

	public App() {
		this.name = "ravi ranjan patel";
	}

	public static void main(String[] args) {

		new App().runs();
		new Person().running();


	}
	
	public void runs() {

		class Printer implements Runnable { // this class is called inner class
		
			@Override
			public void run() {
				System.out.println(App.this.name);
				System.out.println("calling");
	}
		}
		new Printer().run();
		

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Printer() , 0L, 1, TimeUnit.SECONDS);
	}

	

}
// static associated with classes and instance variable is associated with objects 