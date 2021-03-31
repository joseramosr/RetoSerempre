package co.com.serempre.certificacion.tiendacerca.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.serempre.certificacion.tiendacerca.userinterfaces.RegistrationPageComponents.MESSAGE_INVALID_EMAIL;


public class TheInvalidEmailMessage implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(MESSAGE_INVALID_EMAIL).viewedBy(actor).asString();
	}
	
	public static TheInvalidEmailMessage is() {
		return new TheInvalidEmailMessage();
	}
}
