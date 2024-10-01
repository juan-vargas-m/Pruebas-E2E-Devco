package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CentroDeAyudaPage {
    public static final Target BUSCAR_INPUT = Target.the("lugar estadia input").locatedBy("//input[@data-testid='search-input']");
    public static final Target BOTON_BUSCAR = Target.the("boton buSscar estadia").locatedBy("//button[@data-testid='search-submit-button']");
    public static final Target RESULTADOS_BUSQUEDA = Target.the("Resultados de la búsqueda").located(By.xpath("//div[contains(@class, 'p1ufbpnp') and text()='Resultados de la búsqueda']"));
}