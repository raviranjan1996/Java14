package application;

public class Inner implements Runnable {
	private String name;

	 public Inner(String name) {
	 this.name = name;
	}
	
	
	@Override
	public void run() {
		System.out.println(name);

	}

	public void start() {
		//Inner implements Runnable
		activate(this);
		
		//Anonymous class
		activate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(name);
				
			}
		});
	//local class 
		class Runner1 implements Runnable{
			public void run() {
				System.out.println(name);
			}
		}
		activate(new Runner1());
		activate(new Runner2());
		activate(new Runner3());
	}
	//non static inner class
	class Runner2 implements Runnable{
		public void run() {
			System.out.println(name);
		}
	}
	//static inner class  - name is not accessed 
	static class Runner3 implements Runnable{
		String name = "patel";
		public void run() {
			System.out.println(this.name);
		}
	}

	public void activate(Runnable runnable) {
		runnable.run();
	}

}
