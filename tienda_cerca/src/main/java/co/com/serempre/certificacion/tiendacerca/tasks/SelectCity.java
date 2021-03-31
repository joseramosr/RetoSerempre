package co.com.serempre.certificacion.tiendacerca.tasks;

import co.com.serempre.certificacion.tiendacerca.interactions.WaitUntilDisappear;
import co.com.serempre.certificacion.tiendacerca.models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.serempre.certificacion.tiendacerca.userinterfaces.RegistrationPageComponents.BTN_LOADER;
import static co.com.serempre.certificacion.tiendacerca.userinterfaces.SelectCityPageComponents.BTN_CONTINUE;
import static co.com.serempre.certificacion.tiendacerca.userinterfaces.SelectCityPageComponents.LIST_CITIES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;

public class SelectCity implements Task {

    private List<UserData> userDataList;

    public SelectCity(List<UserData> userDataList) {
        this.userDataList = userDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(BTN_LOADER, isNotPresent()).forNoMoreThan(20).seconds(),
                    WaitUntilDisappear.element(BTN_LOADER),
                    WaitUntil.the(LIST_CITIES, isClickable()).forNoMoreThan(20).seconds(),
                    Enter.theValue(userDataList.get(0).getCity()).into(LIST_CITIES).thenHit(Keys.ENTER),
                    WaitUntil.the(BTN_CONTINUE, isClickable()).forNoMoreThan(20).seconds(),
                    Click.on(BTN_CONTINUE));
    }

    public static SelectCity ofTheUser(List<UserData> userDataList) {
        return Tasks.instrumented(SelectCity.class, userDataList);
    }
}
