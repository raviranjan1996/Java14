package application;

import exception.TmperatureOutOfRangeException;

public class Thermostate {

	public void setTemperature(double temperature) throws TmperatureOutOfRangeException {
		setMachineTemp(temperature);
		System.out.print("The temperature is: " +temperature);
	}

	public void setMachineTemp(double temperature) throws TmperatureOutOfRangeException {
		if (temperature < 0 || temperature > 45) {
			throw new TmperatureOutOfRangeException("Temperature out of range");
		}

	}
}
