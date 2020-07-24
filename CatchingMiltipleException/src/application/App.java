package application;

import exception.TemperatureDividedByZero;
import exception.TemperatureToLowException;
import exception.TemperatureTooHighException;

public class App {
	public static void main(String[] args)  {
		int number = 10;
		try {
			new Thermostate().setTemperature(-220);
			int num = number/0;
			System.out.println(num);
		} catch (TemperatureTooHighException | TemperatureToLowException |TemperatureDividedByZero e) {
			System.out.println(e.getMessage());
		}
	}
}
// if we have superclass exception we have to put it that in the end.