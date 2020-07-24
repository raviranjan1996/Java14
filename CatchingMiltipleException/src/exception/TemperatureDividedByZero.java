package exception;

public class TemperatureDividedByZero extends TmperatureOutOfRangeException {

	private static final long serialVersionUID = 1L;

	public TemperatureDividedByZero(String message) {
		super(message);
	}

}
