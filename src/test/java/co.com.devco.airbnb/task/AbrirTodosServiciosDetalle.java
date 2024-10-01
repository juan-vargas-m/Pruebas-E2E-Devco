package co.com.devco.airbnb.task;

import co.com.devco.airbnb.interaction.CerrarTraducciones;
import co.com.devco.airbnb.page.DetalleServiciosLugarPage;
import co.com.devco.airbnb.page.DetalleTodosServiciosPage;
import co.com.devco.airbnb.page.ResultadosEstadiaPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;


public class AbrirTodosServiciosDetalle {
    public static Performable yValidarPara(Integer cantidadValidar, String criterioValidar, String nombreApartadoServicio) {
        return Task.where("ver el detalle del elemento'", actor -> {
            List<WebElementFacade> elementos = ResultadosEstadiaPage.ELEMENTOS_LISTA_RESULTADOS.resolveAllFor(actor).subList(0,cantidadValidar-1);
            for (WebElementFacade elementWeb: elementos){
                actor.attemptsTo(
                        Scroll.to(elementWeb),
                        JavaScriptClick.on(elementWeb),
                        Switch.toNewWindow(),
                        CerrarTraducciones.condicional(),
                        Scroll.to(DetalleServiciosLugarPage.TITULO_SECCION_BOTON.of("Lo que este lugar ofrece")).andAlignToTop(),
                        Click.on(DetalleServiciosLugarPage.BOTON_TODOS_SERVICIOS).afterWaitingUntilPresent(),
                        Scroll.to(DetalleTodosServiciosPage.APARTADO_SERVICIOS.of(nombreApartadoServicio)),
                        Ensure.that(DetalleTodosServiciosPage.NOMBRE_SERVICIO_LAB.of(criterioValidar)).isDisplayed(),
                        Click.on(DetalleServiciosLugarPage.CERRAR_TRADUCCION).afterWaitingUntilPresent(),
                        Switch.toTheOtherWindow()
                );
            }
        });
    }
}
