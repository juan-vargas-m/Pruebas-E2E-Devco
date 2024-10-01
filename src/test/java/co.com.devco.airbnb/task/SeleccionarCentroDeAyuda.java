package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirBnbHomePage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static co.com.devco.airbnb.page.AirBnbHomePage.BOTON_CENTRO_AYUDA;

public class SeleccionarCentroDeAyuda implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_CENTRO_AYUDA).andAlignToBottom(),
                Click.on(BOTON_CENTRO_AYUDA)
        );
    }

    public static SeleccionarCentroDeAyuda enLaPagina() {
        return new SeleccionarCentroDeAyuda();
    }
}
