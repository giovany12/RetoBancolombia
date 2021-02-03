package co.com.choucair.certification.bancolombiachallenge.questions;

import co.com.choucair.certification.bancolombiachallenge.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verification implements Question<Boolean> {

    private String verification;

    public Verification(String verification) {
        this.verification = verification;
    }

    public static Verification toThe(String verification) {
        return new Verification(verification);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String passwordMismatch = Text.of(RegisterPage.PASSWORD_MISMATCH_MESSAGE).viewedBy(actor).asString();
        if(verification.equals(passwordMismatch)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
