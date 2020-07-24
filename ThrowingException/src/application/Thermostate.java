package application;

public class Thermostate {

	public void setTemperature(int temperature) throws Exception {
		
		if(temperature <0 || temperature >45)  {
			throw new Exception("Temperature out of range");
		}
		System.out.println(temperature);
	}
}
