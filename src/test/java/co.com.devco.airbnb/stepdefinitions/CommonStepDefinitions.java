package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.page.AirBnbHomePage;
import co.com.devco.airbnb.task.SeleccionarEstadia;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CommonStepDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("(que ){actor} busca/busque un airbnb para {string}, por {int} días y para {int} {string}")
    public void buscarAirbnbBasico(Actor actor, String lugarEstadia, Integer diasEstadia, Integer cantidadIndividuo, String tipoIndividuo) {
        actor.attemptsTo(
                Open.browserOn().the(AirBnbHomePage.class),
                SeleccionarEstadia.con(lugarEstadia, diasEstadia, cantidadIndividuo, tipoIndividuo)
        );
    }
}
