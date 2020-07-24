package exception;

public class TmperatureOutOfRangeException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public TmperatureOutOfRangeException(String message) {
		super(message);
		
	}

}
