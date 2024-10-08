package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.page.AirBnbHomePage;
import co.com.devco.airbnb.task.SeleccionarExperiencia;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BusquedasExperienciaStepDefinitions {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("(que ){actor} busca/busque un airbnb para {string}, para {int} {string}")
    public void buscarAirbnbExperiencias(Actor actor, String lugarEstadia, Integer cantidadIndividuo, String tipoIndividuo) {
        actor.attemptsTo(
                Open.browserOn().the(AirBnbHomePage.class),
                SeleccionarExperiencia.con(lugarEstadia, cantidadIndividuo, tipoIndividuo)
        );
    }
}