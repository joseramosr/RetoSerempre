package co.com.serempre.certificacion.tiendacerca.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ConsumerPageComponents {

    public static final Target TXT_CELLPHONE_NUMBER = Target.the("Field to enter cell phone number").
            locatedBy("//input[@id='abi-phone']");

    public static final Target BTN_ENTER = Target.the("Enter button").
            locatedBy("//span[contains(text(),'Ingresar')]/parent::button");

    private ConsumerPageComponents() {
    }
}
