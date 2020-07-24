package application;

import exception.TemperatureToLowException;
import exception.TemperatureDividedByZero;
import exception.TemperatureTooHighException;
import exception.TmperatureOutOfRangeException;

public class Thermostate {

	public void setTemperature(double temperature) throws TemperatureToLowException , TemperatureTooHighException ,TemperatureDividedByZero{
		setMachineTemp(temperature);
		System.out.print("The temperature is: " +temperature);
	}

	public void setMachineTemp(double temperature) throws TemperatureToLowException , TemperatureTooHighException , TemperatureDividedByZero {
		if (temperature < 0) {
			throw new TemperatureToLowException("Temperature below minimum threshold");
		}
		else if(temperature >35) {
			throw new TemperatureTooHighException("Temeprature above maximum threshold ");
		}
		
		else
		{
			throw new TemperatureDividedByZero("Divided by zero");
		}
	
	}
}
