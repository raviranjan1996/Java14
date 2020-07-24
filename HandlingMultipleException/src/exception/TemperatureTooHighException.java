package exception;

public class TemperatureTooHighException extends TmperatureOutOfRangeException{
	private static final long serialVersionUID = 1L;

	public TemperatureTooHighException(String message) {
		super(message);
}

}
