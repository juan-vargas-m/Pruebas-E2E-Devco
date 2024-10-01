package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.ResultadosEstadiaPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Filtrar {
    public static Performable por(String tipoFiltro) {
        return Task.where("filtrar por tipo de filtro '" + tipoFiltro + "'",
                Click.on(ResultadosEstadiaPage.FILTRO_BOT.of(tipoFiltro))
        );
    }
}

