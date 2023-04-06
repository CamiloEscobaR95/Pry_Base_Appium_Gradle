package co.com.appium.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.User;
import questions.LoginExitosoQ;
import tasks.Login;
import tasks.NavigateToLogin;
import util.UserCreator;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinition {

    @Given("John Wick ingresa a la session login")
    public void john_wick_ingresa_a_la_session_login() {
        theActorInTheSpotlight().attemptsTo(
                new NavigateToLogin()
        );
    }

    @When("el ingresa sus credenciales {string}")
    public void el_ingresa_sus_credenciales(String type) {

        User user = UserCreator.getUserByType(type);
        System.out.println(user.toString());

        theActorInTheSpotlight().wasAbleTo(
                Login.ingresarCredenciales(user.getUsername(), user.getPassword())
        );

    }

    @Then("el accedera a su cuenta exitosamente")
    public void elAccederaASuCuentaExitosamente() {
        theActorInTheSpotlight().should(
                seeThat(LoginExitosoQ.loginOk(true), equalTo(true))
        );
    }
}
