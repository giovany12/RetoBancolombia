package co.com.choucair.certification.bancolombiachallenge.tasks;

import co.com.choucair.certification.bancolombiachallenge.interactions.Wait;
import co.com.choucair.certification.bancolombiachallenge.model.UtestRegisterData;
import co.com.choucair.certification.bancolombiachallenge.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {

    private UtestRegisterData utestRegisterData;

    public Register(UtestRegisterData utestRegisterData) {
        this.utestRegisterData = utestRegisterData;
    }

    public static Register onThePage(UtestRegisterData utestRegisterData) {
        return Tasks.instrumented(Register.class, utestRegisterData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterPage.REGISTER_BUTTON),
                Enter.theValue(utestRegisterData.getName()).into(RegisterPage.FIRST_NAME),
                Enter.theValue(utestRegisterData.getLastName()).into(RegisterPage.LAST_NAME),
                Enter.theValue(utestRegisterData.getEmail()).into(RegisterPage.EMAIL),
                Click.on(RegisterPage.BIRTH_MONTH),
                Click.on(RegisterPage.BIRTH_MONTH_LIST),
                Click.on(RegisterPage.BIRTH_DAY),
                Click.on(RegisterPage.BIRTH_DAY_LIST),
                Click.on(RegisterPage.BIRTH_YEAR),
                Click.on(RegisterPage.BIRTH_YEAR_LIST),
                Click.on(RegisterPage.NEXT_LOCATION_BUTTON),
                Wait.now(),
                Click.on(RegisterPage.NEXT_DEVICES_BUTTON),
                Click.on(RegisterPage.NEXT_LAST_STEP_BUTTON),
                Enter.theValue(utestRegisterData.getPassword()).into(RegisterPage.PASSWORD),
                Enter.theValue(utestRegisterData.getConfirmPassword()).into(RegisterPage.CONFIRM_PASSWORD),
                Click.on(RegisterPage.CHECK1),
                Click.on(RegisterPage.CHECK2),
                Click.on(RegisterPage.COMPLETE_SETUP_BUTTON)
        );

    }
}
