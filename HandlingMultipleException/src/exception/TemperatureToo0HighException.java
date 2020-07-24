package exception;

public class TemperatureToo0HighException extends TmperatureOutOfRangeException {

	private static final long serialVersionUID = 1L;

	public TemperatureToo0HighException(String message) {
		super(message);
	}

}
