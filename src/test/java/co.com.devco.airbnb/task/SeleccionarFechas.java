package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirBnbHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SeleccionarFechas {
    public static Performable para(Integer diasEstadia) {
        return Task.where("seleccionar fechas para'" + diasEstadia + "'", actor -> {
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaFutura = fechaActual.plusDays(diasEstadia);
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaActualFormateada = fechaActual.format(formateador);
            String fechaFuturaFormateada = fechaFutura.format(formateador);
            actor.attemptsTo(
                    Click.on(AirBnbHomePage.DIA_PPAL_FECHAS_BOT),
                    Click.on(AirBnbHomePage.DIA_LLEGADA_BOT.of(fechaActualFormateada)),
                    Click.on(AirBnbHomePage.DIA_SALIDA_BOT.of(fechaFuturaFormateada))
            );
            }
        );
    }
}
