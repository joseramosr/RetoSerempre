package co.com.serempre.certificacion.tiendacerca.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.serempre.certificacion.tiendacerca.userinterfaces.RegistrationPageComponents.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class TheInvalidCellPhoneNumberAlertMessage implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(WaitUntil.the(ALERT_INVALID_CELLPHONE, isPresent()).forNoMoreThan(20).seconds());
		return Text.of(ALERT_INVALID_CELLPHONE).viewedBy(actor).asString().replace("• ", "");
	}
	
	public static TheInvalidCellPhoneNumberAlertMessage is() {
		return new TheInvalidCellPhoneNumberAlertMessage();
	}
}
