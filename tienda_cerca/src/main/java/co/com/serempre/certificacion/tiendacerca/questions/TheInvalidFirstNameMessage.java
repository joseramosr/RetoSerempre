package co.com.serempre.certificacion.tiendacerca.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.serempre.certificacion.tiendacerca.userinterfaces.RegistrationPageComponents.MESSAGE_INVALID_FIRST_NAME;


public class TheInvalidFirstNameMessage implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(MESSAGE_INVALID_FIRST_NAME).viewedBy(actor).asString();
	}
	
	public static TheInvalidFirstNameMessage is() {
		return new TheInvalidFirstNameMessage();
	}
}
