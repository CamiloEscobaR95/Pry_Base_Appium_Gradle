package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target goLogin = Target.the("Boton para ingresar a login").located(AppiumBy.accessibilityId("Login Screen"));
}
