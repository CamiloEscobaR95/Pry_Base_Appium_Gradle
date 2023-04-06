package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.LoginPage.inputPassword;
import static ui.LoginPage.inputUserName;

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
                Enter.theValue(userName).into(inputUserName),
                Enter.theValue(password).into(inputPassword),
                Click.on(LoginPage.btnLogin)
        );
    }
}
