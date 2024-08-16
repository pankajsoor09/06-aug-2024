package exception_handling;

public class InvalidAgeException extends RuntimeException {
	public InvalidAgeException(String msg) {
		super(msg);
	}

}
