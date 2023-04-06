package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static Target inputUserName = Target.the("Caja para ingresar nombre de usuario").located(AppiumBy.accessibilityId("username"));
    public static Target inputPassword = Target.the("Caja para ingresar contraseña").located(AppiumBy.accessibilityId("password"));
    public static Target btnLogin = Target.the("Caja para ingresar contraseña").locatedBy("//android.view.ViewGroup[@content-desc=\"loginBtn\"]/android.widget.TextView");

}
