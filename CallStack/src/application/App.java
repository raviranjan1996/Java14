package application;

public class App {

	public static void main(String[] args) {
			try {
				new Thermostate().setTemperature(122);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
	}
}
