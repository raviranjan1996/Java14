package application;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

//combining two example in project also
class Alert implements Runnable {

	public void run() {

		System.out.println("timmer is runnig");
	}

}

class Status extends TimerTask {

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "Egg cooked");
	}

}

public class App {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new Status(), 20000L, 20000L);
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Alert(), 0L, 1L, TimeUnit.MINUTES);

	}
}
