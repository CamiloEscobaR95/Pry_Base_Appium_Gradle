package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.LoginPage.*;

public class Login implements Task {

    private final String userName;
    private final String password;

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static Performable ingresarCredenciales(String userName, String password) {
        return instrumented(Login.class, userName, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //espera explicita para un elemento con serenityBDD 3.3.0
                Wait.until(WebElementQuestion.the(INPUT_USER_NAME), WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(userName).into(INPUT_USER_NAME),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }
}
