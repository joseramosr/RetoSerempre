package co.com.serempre.certificacion.tiendacerca.tasks;

import co.com.serempre.certificacion.tiendacerca.interactions.WaitUntilDisappear;
import co.com.serempre.certificacion.tiendacerca.models.UserData;

import static co.com.serempre.certificacion.tiendacerca.userinterfaces.RegistrationPageComponents.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class EnterAddress implements Task {

    private List<UserData> userDataList;

    public EnterAddress(List<UserData> userDataList) {
        this.userDataList = userDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ADDRESS, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_ADDRESS),
                Enter.theValue(userDataList.get(0).getAddress()).into(TXT_ADDRESS),
                Click.on(LINK_USE_THE_MAP),
                WaitUntilDisappear.element(BTN_LOADER),
                WaitUntilDisappear.element(BTN_LOADER_TWO),
                WaitUntil.the(BTN_SELECT_LOCATION, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_SELECT_LOCATION)
        );
    }

    public static EnterAddress ofTheUser(List<UserData> userDataList) {
        return Tasks.instrumented(EnterAddress.class, userDataList);
    }
}
