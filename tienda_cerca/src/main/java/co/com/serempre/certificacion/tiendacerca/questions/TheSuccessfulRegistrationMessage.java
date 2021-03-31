package co.com.serempre.certificacion.tiendacerca.questions;

import static co.com.serempre.certificacion.tiendacerca.userinterfaces.RegistrationPageComponents.MESSAGE_SUCCESSFUL_REGISTRATION;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class TheSuccessfulRegistrationMessage implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(WaitUntil.the(MESSAGE_SUCCESSFUL_REGISTRATION, isPresent()).forNoMoreThan(20).seconds());
		return Text.of(MESSAGE_SUCCESSFUL_REGISTRATION).viewedBy(actor).asString().replace("\n", " ");
	}
	
	public static TheSuccessfulRegistrationMessage is() {
		return new TheSuccessfulRegistrationMessage();
	}
}
