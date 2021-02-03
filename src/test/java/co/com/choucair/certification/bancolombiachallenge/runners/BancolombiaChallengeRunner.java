package co.com.choucair.certification.bancolombiachallenge.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/bancolombia_challenge.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.bancolombiachallenge.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class BancolombiaChallengeRunner {
}
