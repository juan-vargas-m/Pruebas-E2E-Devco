package co.com.devco.airbnb.interaction;

import co.com.devco.airbnb.page.DetalleServiciosLugarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Displayed;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CerrarTraducciones implements Performable {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(DetalleServiciosLugarPage.TITULO_TRADUCTOR, isVisible()).forNoMoreThan(Duration.ofSeconds(30)));
        if(actor.asksFor(Displayed.of(DetalleServiciosLugarPage.TITULO_TRADUCTOR))) {
            actor.attemptsTo(Click.on(DetalleServiciosLugarPage.CERRAR_TRADUCCION).afterWaitingUntilPresent());
        }
    }
    public static CerrarTraducciones condicional() {
        return new CerrarTraducciones();
    }
}
