package application;

import exception.TemperatureToLowException;
import exception.TemperatureToo0HighException;
import exception.TemperatureTooHighException;

public class Thermostate {

	public void setTemperature(double temperature) throws TemperatureToLowException , TemperatureTooHighException ,TemperatureToo0HighException{
		setMachineTemp(temperature);
		System.out.print("The temperature is: " +temperature);
	}

	public void setMachineTemp(double temperature) throws TemperatureToLowException , TemperatureTooHighException , TemperatureToo0HighException {
		if (temperature < 0) {
			throw new TemperatureToLowException("Temperature below minimum threshold");
		}
		else if(temperature >35) {
			throw new TemperatureTooHighException("Temeprature above maximum threshold ");
		}

	}
}
