package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirBnbHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarIndividuo {
    public static Performable porTipoCantidad(Integer cantidadIndividuo, String tipoIndividuo) {
        return Task.where("seleccionar individuo del tipo'" + tipoIndividuo + "', la cantidad de '" + cantidadIndividuo + "'", actor -> {
            actor.attemptsTo(Click.on(AirBnbHomePage.INDIVIDUOS_PPAL_BOT));
            for (int i = 0; i < cantidadIndividuo; i++) {
                actor.attemptsTo(Click.on(AirBnbHomePage.INCREMENTAR_INDIVIDUO_TIPO_BOT.of(tipoIndividuo)));
            }
        });
    }
}
