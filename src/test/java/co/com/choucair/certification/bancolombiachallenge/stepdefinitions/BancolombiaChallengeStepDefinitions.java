package co.com.choucair.certification.bancolombiachallenge.stepdefinitions;

import co.com.choucair.certification.bancolombiachallenge.model.UtestRegisterData;
import co.com.choucair.certification.bancolombiachallenge.questions.Verification;
import co.com.choucair.certification.bancolombiachallenge.tasks.OpenUp;
import co.com.choucair.certification.bancolombiachallenge.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class BancolombiaChallengeStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Geovany wants to register on the utest website$")
    public void thatGeovanyWantsToRegisterOnTheUtestWebsite() {
        OnStage.theActorCalled("Geovany").wasAbleTo(OpenUp.thePage());
    }


    @When("^he complete the registration form$")
    public void heCompleteTheRegistrationForm(List<UtestRegisterData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Register.onThePage(data.get(0))
        );

    }

    @Then("^he is registered$")
    public void heIsRegistered(List<UtestRegisterData> data) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Verification.toThe(data.get(0).getVerification()))
        );
    }

}
