package co.com.serempre.certificacion.tiendacerca.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageComponents {

    public static final Target WELCOME_MESSAGE = Target.the("Welcome message").
            locatedBy("//p[.='Bienvenido']");

    public static final Target BTN_USER_TYPE = Target.the("Consumer button").
            locatedBy("//span[contains(text(),'{0}')]/parent::button");

    private HomePageComponents() {
    }
}
