package co.com.serempre.certificacion.tiendacerca.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class WaitUntilDisappear implements Interaction {
    private Target element;
    private boolean bandera = true;

    public WaitUntilDisappear(Target element) {
        this.element = element;
    }

    @Step("Wait until the element is not visible")
    @Override
    public <T extends Actor> void performAs(T actor) {
        while (bandera){
            if (element.resolveFor(actor).isVisible()){
                bandera = true;
            }else{
                bandera = false;
            }
        }
    }

    public static WaitUntilDisappear element(Target element) {
        return Tasks.instrumented(WaitUntilDisappear.class, element);
    }
}