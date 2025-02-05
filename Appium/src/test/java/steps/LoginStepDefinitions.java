package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.CommonFlows;


public class LoginStepDefinitions {

    private final CommonFlows commonFlows = new CommonFlows();
    private final LoginPage loginPage = new LoginPage();

    @Given("El usuario navega a la pagina Login")
    public void elUsuarioOmiteLoguearse() {

        commonFlows.gotoLoginPage();
    }

    @When("El usuario selecciona el boton omitir logeo")
    public void loginTap() {
        loginPage.clickCloseLogin();
    }

    @Then("Se debe redirigir a la pagina de Booking")
    public void verifyNavigateBookingPage() {
        loginPage.verifyPage();
    }
}
