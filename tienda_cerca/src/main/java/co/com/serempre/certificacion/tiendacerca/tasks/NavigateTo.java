package co.com.serempre.certificacion.tiendacerca.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    private NavigateTo() {
    }

    public static Performable theTiendaCercaPage() {
        return Task.where("{0} opens the TiendaCerca page",
                Open.browserOn().thePageNamed("tiendaCerca")
        );
    }
}