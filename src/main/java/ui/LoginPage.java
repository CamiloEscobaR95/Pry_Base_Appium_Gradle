package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target INPUT_USER_NAME = Target.the("Caja para ingresar nombre de usuario").located(AppiumBy.accessibilityId("username"));
    public static final Target INPUT_PASSWORD = Target.the("Caja para ingresar contraseña").located(AppiumBy.accessibilityId("password"));
    public static final Target BTN_LOGIN = Target.the("Caja para ingresar contraseña").locatedBy("//android.view.ViewGroup[@content-desc=\"loginBtn\"]/android.widget.TextView");

}
