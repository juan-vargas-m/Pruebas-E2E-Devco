package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleTodosServiciosPage {
    public static Target NOMBRE_SERVICIO_LAB = Target.the("nombre del servicio").locatedBy("//ul[@role='list']//div[contains(text(),'{0}')]");
    public static Target APARTADO_SERVICIOS = Target.the("detalle del servicio").locatedBy("//h2[text()='Estacionamiento e instalaciones']");
}
