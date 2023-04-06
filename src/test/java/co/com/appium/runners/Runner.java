package co.com.appium.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/log_in.feature",
        glue = "co.com.appium.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags="@CP_001"
)
public class Runner {
}
