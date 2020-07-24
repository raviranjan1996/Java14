package application;

public class Thermostate {

	public void setTemperature(double temperature) {
		setMachineTemp(temperature);
		System.out.print("The temperature is: " +temperature);
	}

	public void setMachineTemp(double temperature) {
		if (temperature < 0 || temperature > 45) {
			throw new RuntimeException("Temperature out of range");
		}

	}
}
