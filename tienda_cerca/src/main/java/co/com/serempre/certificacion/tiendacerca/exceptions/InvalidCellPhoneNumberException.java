package co.com.serempre.certificacion.tiendacerca.exceptions;

public class InvalidCellPhoneNumberException extends AssertionError{

	public static final String INVALID_CELL_PHONE_NUMBER_ALERT_ERROR = "ERROR, CELL PHONE NUMBER ALERT, WAS NOT VISIBLE. A VALID CELL PHONE NUMBER HAS BEEN ENTERED";
	public static final String INVALID_CELL_PHONE_NUMBER_MESSAGE_ERROR = "ERROR, CELL PHONE NUMBER MESSAGE, WAS NOT VISIBLE. A VALID CELL PHONE NUMBER HAS BEEN ENTERED";

	public InvalidCellPhoneNumberException(String message, Throwable testErrorException) {
		super(message, testErrorException);
	}
}
