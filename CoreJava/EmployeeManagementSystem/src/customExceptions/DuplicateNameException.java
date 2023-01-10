package customExceptions;

@SuppressWarnings("serial")
public class DuplicateNameException extends Exception {
	public DuplicateNameException(String mesg) {
		super(mesg);
	}
}