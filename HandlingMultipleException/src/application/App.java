package application;

import exception.TemperatureToLowException;
import exception.TemperatureToo0HighException;
import exception.TemperatureTooHighException;

public class App {
	public static void main(String[] args) {
		try {
			new Thermostate().setTemperature(-122);
		} catch (TemperatureToLowException e) {
			System.out.println(e.getMessage());
		} catch (TemperatureTooHighException e) {
			System.out.println(e.getMessage());
		}
		catch (TemperatureToo0HighException e) {
			System.out.println(e.getMessage());
		}
	}
}
