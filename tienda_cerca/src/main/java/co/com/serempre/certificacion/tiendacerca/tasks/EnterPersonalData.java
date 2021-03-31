package co.com.serempre.certificacion.tiendacerca.tasks;

import co.com.serempre.certificacion.tiendacerca.models.UserData;
import static co.com.serempre.certificacion.tiendacerca.userinterfaces.RegistrationPageComponents.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class EnterPersonalData implements Task {

    private List<UserData> userDataList;

    public EnterPersonalData(List<UserData> userDataList) {
        this.userDataList = userDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userDataList.get(0).getFirstName()).into(TXT_FIRST_NAME),
                Enter.theValue(userDataList.get(0).getLastName()).into(TXT_LAST_NAME),
                Enter.theValue(userDataList.get(0).getEmail()).into(TXT_EMAIL),
                WaitUntil.the(BTN_NEXT, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_NEXT)
                );
    }

    public static EnterPersonalData ofTheUser(List<UserData> userDataList){
        return Tasks.instrumented(EnterPersonalData.class, userDataList);
    }
}
