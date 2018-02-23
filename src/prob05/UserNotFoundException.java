package prob05;

public class UserNotFoundException extends Exception {
	public UserNotFoundException() {
		super("UserNotFoundException occurs");
	}
	public UserNotFoundException(String message) {
		super(message);
	}
}

