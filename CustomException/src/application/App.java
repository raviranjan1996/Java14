package application;

import exception.TmperatureOutOfRangeException;

public class App {

	public static void main(String[] args) {
			try {
				new Thermostate().setTemperature(122);
			} catch (TmperatureOutOfRangeException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
	}
}
