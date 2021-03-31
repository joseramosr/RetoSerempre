package co.com.serempre.certificacion.tiendacerca.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InitialRegistrationPageComponents {

    public static final Target CHECK_TERMS_AND_CONDITIONS = Target.the("Terms and Conditions checkbox").
            locatedBy("//input[@id='abi-checkbox-terms']");

    public static final Target CHECK_DATA_PROTECTION_POLICY = Target.the("Data protection policy checkbox").
            locatedBy("//input[@id='abi-checkbox-policies']");

    public static final Target BTN_CONTINUE = Target.the("Continue button").
            locatedBy("//span[contains(text(),'Continuar')]/parent::button");

    private InitialRegistrationPageComponents() {
    }
}
