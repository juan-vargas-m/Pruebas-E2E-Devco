package co.com.devco.airbnb.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://www.airbnb.com.co")
public class AirBnbHomePage extends PageObject {
    public static Target LUGAR_ESTADIA_INPUT = Target.the("lugar estadia input").locatedBy("//input[@id='bigsearch-query-location-input']");
    public static Target DIA_PPAL_FECHAS_BOT = Target.the("boton principal fechas").locatedBy("//div[@data-testid='structured-search-input-field-split-dates-0']");
    public static Target DIA_LLEGADA_BOT = Target.the("boton dia llegada").locatedBy("//div[@data-testid='{0}']");
    public static Target DIA_SALIDA_BOT = Target.the("boton dia salida").locatedBy("//div[@data-testid='{0}']");
    public static Target INDIVIDUOS_PPAL_BOT = Target.the("boton principal individuos").locatedBy("//div[@data-testid='structured-search-input-field-guests-button']");
    public static Target INCREMENTAR_INDIVIDUO_TIPO_BOT = Target.the("boton agregar del tipo {0}").locatedBy("//h3[text()='{0}']//../../..//button[contains(@data-testid,'increase')]");
    public static Target BOTON_BUSCAR_ESTADIA = Target.the("boton buSscar estadia").locatedBy("//button[@data-testid='structured-search-input-search-button']");
    public static Target BOTON_BUSCAR_EXPERIENCIAS = Target.the("boton buscar experiencias").locatedBy("//button[@data-testid='header-tab-search-block-tab-EXPERIENCES']");
    public static Target BOTON_CENTRO_AYUDA = Target.the("boton centro ayuda").locatedBy("//a[contains(@href, '/help/home') and contains(@class, 'l1ovpqvx')]");

}

