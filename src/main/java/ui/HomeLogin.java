package ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeLogin {
    public static final Target SECRETAREA = Target.the("Titulo despues de hacer login")
            .locatedBy("//android.widget.TextView[contains(@text, 'Secret Area')]");
}
