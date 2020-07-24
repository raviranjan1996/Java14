package exception;

public class TemperatureToLowException extends TmperatureOutOfRangeException {

	private static final long serialVersionUID = 1L;

	public TemperatureToLowException(String message) {
		super(message);
	}

}
