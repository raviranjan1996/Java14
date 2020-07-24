package application;

public class Thermostate {

	public void setTemperature(double temperature) throws Exception {
		setMachineTemp(temperature);
		System.out.print("The temperature is: " +temperature);
	}

	public void setMachineTemp(double temperature) throws Exception {
		if (temperature < 0 || temperature > 45) {
			throw new Exception("Temperature out of range");
		}

	}
}
