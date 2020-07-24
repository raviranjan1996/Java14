package application;

public interface DefaultRunnable extends Runnable {
	 default void getDescription() {
		 System.out.println("showing description defalut");
	 }

}
