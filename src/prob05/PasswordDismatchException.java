package prob05;

public class PasswordDismatchException extends Exception {
	public PasswordDismatchException() {
		super("PasswordDismatchException occurs");
	}
	public PasswordDismatchException(String message) {
		super(message);
	}
}
