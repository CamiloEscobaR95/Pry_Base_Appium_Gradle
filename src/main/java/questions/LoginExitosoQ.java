package questions;

import net.serenitybdd.screenplay.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static ui.HomeLogin.SECRETAREA;

public class LoginExitosoQ implements Question<Boolean> {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginExitosoQ.class);
    public LoginExitosoQ(boolean b) {
    }

    public static Question<Boolean> loginOk(boolean b) {
        return new LoginExitosoQ(b);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean login = false;

        if(SECRETAREA.resolveFor(actor).isDisplayed()){
            String textTittle= SECRETAREA.resolveFor(actor).getText();
            LOGGER.info("El usuario ingreso exitosamente a su cuenta y visualizo el texto {}", textTittle);
            login = true;
        }
        return login;
    }
}
