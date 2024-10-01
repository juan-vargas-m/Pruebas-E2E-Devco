package co.com.devco.airbnb.task;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.devco.airbnb.page.CentroDeAyudaPage.BUSCAR_INPUT;
import static co.com.devco.airbnb.page.CentroDeAyudaPage.BOTON_BUSCAR;

public class BuscarEnCentroDeAyuda implements Task {
    private final String consulta;

    public BuscarEnCentroDeAyuda(String consulta) {
        this.consulta = consulta;
    }

    public static BuscarEnCentroDeAyuda conLaConsulta(String consulta) {
        return instrumented(BuscarEnCentroDeAyuda.class, consulta);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(consulta).into(BUSCAR_INPUT),
                Click.on(BOTON_BUSCAR)
        );
    }
}
