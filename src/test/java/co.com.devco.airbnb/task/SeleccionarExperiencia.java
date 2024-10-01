package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirBnbHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SeleccionarExperiencia {
    public static Performable con(String lugarEstadia, Integer cantidadIndividuo, String tipoIndividuo) {
        return Task.where("selecionar experiecia para '" + lugarEstadia + "', para, '" + cantidadIndividuo + "' '" + tipoIndividuo + "'",
                Click.on(AirBnbHomePage.BOTON_BUSCAR_EXPERIENCIAS),
                Enter.theValue(lugarEstadia).into(AirBnbHomePage.LUGAR_ESTADIA_INPUT),
                SeleccionarIndividuo.porTipoCantidad(cantidadIndividuo, tipoIndividuo),
                Click.on(AirBnbHomePage.BOTON_BUSCAR_ESTADIA)
        );
    }
}
