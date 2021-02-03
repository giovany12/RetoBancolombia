package co.com.choucair.certification.bancolombiachallenge.tasks;

import co.com.choucair.certification.bancolombiachallenge.userinterface.UtestOpenPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private UtestOpenPage utestOpenPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestOpenPage));
    }
}
