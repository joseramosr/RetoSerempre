package co.com.serempre.certificacion.tiendacerca.tasks;

import co.com.serempre.certificacion.tiendacerca.models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.serempre.certificacion.tiendacerca.userinterfaces.ConsumerPageComponents.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class EnterCellPhoneNumber implements Task {

    private List<UserData> userDataList;
    private String cellPhoneNumber;

    public EnterCellPhoneNumber(List<UserData> userDataList, String cellPhoneNumber) {
        this.userDataList = userDataList;
        this.cellPhoneNumber = cellPhoneNumber;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_CELLPHONE_NUMBER, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(cellPhoneNumber).into(TXT_CELLPHONE_NUMBER),
                WaitUntil.the(BTN_ENTER, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_ENTER)
        );
    }

    public static EnterCellPhoneNumber ofTheUser(List<UserData> userDataList, String cellPhoneNumber) {
        return Tasks.instrumented(EnterCellPhoneNumber.class, userDataList, cellPhoneNumber);
    }
}
