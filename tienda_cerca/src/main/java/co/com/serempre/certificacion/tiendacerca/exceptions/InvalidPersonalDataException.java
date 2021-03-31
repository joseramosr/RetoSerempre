package co.com.serempre.certificacion.tiendacerca.exceptions;

public class InvalidPersonalDataException extends AssertionError{

	public static final String INVALID_FIRST_NAME_MESSAGE_ERROR = "ERROR, INVALID FIRST NAME MESSAGE, WAS NOT VISIBLE. A VALID FIRST NAME HAS BEEN ENTERED";
	public static final String INVALID_LAST_NAME_MESSAGE_ERROR = "ERROR, INVALID LAST NAME MESSAGE, WAS NOT VISIBLE. A VALID LAST NAME HAS BEEN ENTERED";
	public static final String INVALID_EMAIL_MESSAGE_ERROR = "ERROR, INVALID EMAIL MESSAGE, WAS NOT VISIBLE. A VALID EMAIL HAS BEEN ENTERED";


	public InvalidPersonalDataException(String message, Throwable testErrorException) {
		super(message, testErrorException);
	}
}
