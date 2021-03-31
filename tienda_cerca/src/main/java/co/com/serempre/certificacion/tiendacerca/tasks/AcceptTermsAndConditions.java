package co.com.serempre.certificacion.tiendacerca.tasks;

import co.com.serempre.certificacion.tiendacerca.interactions.WaitUntilDisappear;
import static co.com.serempre.certificacion.tiendacerca.userinterfaces.InitialRegistrationPageComponents.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.serempre.certificacion.tiendacerca.userinterfaces.RegistrationPageComponents.BTN_LOADER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AcceptTermsAndConditions implements Task {

    public AcceptTermsAndConditions() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntilDisappear.element(BTN_LOADER),
                WaitUntil.the(CHECK_TERMS_AND_CONDITIONS, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(CHECK_TERMS_AND_CONDITIONS),
                Click.on(CHECK_DATA_PROTECTION_POLICY),
                WaitUntil.the(BTN_CONTINUE, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_CONTINUE)
        );
    }

    public static AcceptTermsAndConditions ofThePage(){
        return Tasks.instrumented(AcceptTermsAndConditions.class);
    }
}
