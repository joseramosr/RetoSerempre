package co.com.serempre.certificacion.tiendacerca.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.serempre.certificacion.tiendacerca.userinterfaces.RegistrationPageComponents.*;


public class TheInvalidCellPhoneNumberMessage implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(MESSAGE_INVALID_CELLPHONE).viewedBy(actor).asString();
	}
	
	public static TheInvalidCellPhoneNumberMessage is() {
		return new TheInvalidCellPhoneNumberMessage();
	}
}
