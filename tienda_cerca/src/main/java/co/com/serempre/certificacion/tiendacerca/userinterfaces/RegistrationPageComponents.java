package co.com.serempre.certificacion.tiendacerca.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPageComponents {

    public static final Target TXT_FIRST_NAME = Target.the("Field to enter name").
            locatedBy("//input[@id='register-name']");

    public static final Target TXT_LAST_NAME= Target.the("Field to enter last name").
            locatedBy("//input[@id='register-lastName']");

    public static final Target TXT_EMAIL = Target.the("Field to enter email").
            locatedBy("//input[@id='register-email']");

    public static final Target BTN_NEXT = Target.the("Next button").
            locatedBy("//span[contains(text(),'Siguiente')]/parent::button");

    public static final Target BTN_ADDRESS = Target.the("Address button").
            locatedBy("//span[contains(text(),'Ingresa dirección')]/parent::button");

    public static final Target TXT_ADDRESS = Target.the("Field to enter address").
            locatedBy("//input[@name='address']");

    public static final Target LINK_USE_THE_MAP = Target.the("Use the map link").
            locatedBy("//div[contains(text(),'Usar el Mapa')]");

    public static final Target BTN_LOADER = Target.the("Loader button").
            locatedBy("//div[@class='sc-bqGHjH gIHfsz StyledLoader']");

    public static final Target BTN_LOADER_TWO = Target.the("Loader button").
            locatedBy("//div[@class='sc-bqGHjH gIHfsz sc-cxNIbT caQbbb']");

    public static final Target BTN_SELECT_LOCATION = Target.the("Select location button").
            locatedBy("//span[contains(text(),'Seleccionar ubicación')]/parent::button");

    public static final Target MESSAGE_SUCCESSFUL_REGISTRATION = Target.the("Successful registration message").
            locatedBy("//p[@class='sc-carGAA dohotr text-center text-white font-medium text-6xl']");

    public static final Target MESSAGE_INVALID_FIRST_NAME= Target.the("Invalid name message").
            locatedBy("//input[@id='register-name']/following-sibling::div");

    public static final Target MESSAGE_INVALID_LAST_NAME= Target.the("Invalid last name message").
            locatedBy("//input[@id='register-lastName']/following-sibling::div");

    public static final Target MESSAGE_INVALID_EMAIL= Target.the("Invalid email message").
            locatedBy("//input[@id='register-email']/following-sibling::div");

    public static final Target ALERT_INVALID_CELLPHONE = Target.the("Invalid cell phone alert").
            locatedBy("//div[@class='Toastify__toast Toastify__toast--error rounded bg-error-500']");

    public static final Target MESSAGE_INVALID_CELLPHONE = Target.the("Invalid cell phone message").
            locatedBy("//input[@id='abi-phone']/following-sibling::div");

    private RegistrationPageComponents() {
    }
}
