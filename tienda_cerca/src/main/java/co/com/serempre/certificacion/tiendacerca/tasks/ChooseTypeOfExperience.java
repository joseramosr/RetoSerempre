package co.com.serempre.certificacion.tiendacerca.tasks;

import co.com.serempre.certificacion.tiendacerca.models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.serempre.certificacion.tiendacerca.userinterfaces.HomePageComponents.BTN_USER_TYPE;
import static co.com.serempre.certificacion.tiendacerca.userinterfaces.HomePageComponents.WELCOME_MESSAGE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChooseTypeOfExperience implements Task {

    private List<UserData> userDataList;

    public ChooseTypeOfExperience(List<UserData> userDataList) {
        this.userDataList = userDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(WELCOME_MESSAGE, isVisible()).forNoMoreThan(20).seconds(),
                WaitUntil.the(BTN_USER_TYPE.of(userDataList.get(0).getUserType()), isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_USER_TYPE.of(userDataList.get(0).getUserType())));
    }

    public static ChooseTypeOfExperience inTheShop(List<UserData> userDataList){
        return Tasks.instrumented(ChooseTypeOfExperience.class, userDataList);
    }
}
