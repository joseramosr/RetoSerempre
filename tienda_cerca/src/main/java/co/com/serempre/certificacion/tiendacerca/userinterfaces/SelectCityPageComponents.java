package co.com.serempre.certificacion.tiendacerca.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SelectCityPageComponents {

    public static final Target LIST_CITIES= Target.the("List to select city").
            locatedBy("//input[@id='react-select-2-input']");
    public static final Target BTN_CONTINUE = Target.the("Continue button").
            locatedBy("//span[contains(text(),'Continuar')]/parent::button");

    private SelectCityPageComponents() {
    }
}

