package application;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask{

	@Override
	public void run() {
	System.out.println("hello");
		
	}
	
}

public class App {
	public static void main(String[] args) {
		Timer timer = new Timer();
		Task task = new Task();
		timer.schedule(task, 0L, 1000L);
	    
	}
}
