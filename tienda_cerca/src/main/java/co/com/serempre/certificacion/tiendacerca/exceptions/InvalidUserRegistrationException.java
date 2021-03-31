package co.com.serempre.certificacion.tiendacerca.exceptions;

public class InvalidUserRegistrationException extends AssertionError{

	public static final String SUCCESSFUL_REGISTRATION_MESSAGE_ERROR = "ERROR, THE SUCCESSFUL REGISTRATION MESSAGE WAS NOT VISIBLE, THE USER DID NOT COMPLETE THEIR REGISTRATION SUCCESSFULLY";

	public InvalidUserRegistrationException(String message, Throwable testErrorException) {
		super(message, testErrorException);
	}
}
