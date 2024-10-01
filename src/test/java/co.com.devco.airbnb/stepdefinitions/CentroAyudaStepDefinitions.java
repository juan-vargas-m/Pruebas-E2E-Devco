package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.page.AirBnbHomePage;
import co.com.devco.airbnb.task.SeleccionarCentroDeAyuda;
import co.com.devco.airbnb.task.BuscarEnCentroDeAyuda;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import static co.com.devco.airbnb.page.CentroDeAyudaPage.RESULTADOS_BUSQUEDA;

public class CentroAyudaStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario está en la página principal de Airbnb")
    public void usuarioEstaEnPaginaPrincipal() {
        OnStage.theActorCalled("Usuario").attemptsTo(
                Open.browserOn().the(AirBnbHomePage.class)
        );
    }

    @Cuando("el usuario selecciona la opción {string}")
    public void usuarioSeleccionaLaOpcion(String opcion) {
        if (opcion.equals("Centro de ayuda")) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    SeleccionarCentroDeAyuda.enLaPagina()
            );
        }
    }

    @Cuando("el usuario busca {string} en el Centro de ayuda")
    public void usuarioBuscaEnCentroAyuda(String consulta) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarEnCentroDeAyuda.conLaConsulta(consulta)
        );
    }

    @Entonces("el usuario debería ver los resultados de {string}")
    public void usuarioVeResultados(String resultadoEsperado) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA).text().contains(resultadoEsperado)
        );
    }
}

