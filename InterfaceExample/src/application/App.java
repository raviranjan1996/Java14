package application;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//combining two example in project also
class Alert implements Runnable {

	public void run() {

		System.out.println("hii");
	}

}

public class App {
	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Alert(), 0L, 1L, TimeUnit.SECONDS);

	}
}
