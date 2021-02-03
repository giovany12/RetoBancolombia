package co.com.choucair.certification.bancolombiachallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target REGISTER_BUTTON = Target.the("Register Button")
            .locatedBy("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a");
    public static final Target FIRST_NAME = Target.the("First Name")
            .locatedBy("//*[@id=\"firstName\"]");
    public static final Target LAST_NAME = Target.the("Register Button")
            .locatedBy("//*[@id=\"lastName\"]");
    public static final Target EMAIL = Target.the("Register Button")
            .locatedBy("//*[@id=\"email\"]");
    public static final Target BIRTH_MONTH = Target.the("Register Button")
            .locatedBy("//*[@id=\"birthMonth\"]");
    public static final Target BIRTH_MONTH_LIST = Target.the("Register Button")
            .locatedBy("//*[@id=\"birthMonth\"]/option[2]");
    public static final Target BIRTH_DAY = Target.the("Register Button")
            .locatedBy("//*[@id=\"birthDay\"]");
    public static final Target BIRTH_DAY_LIST = Target.the("Register Button")
            .locatedBy("//*[@id=\"birthDay\"]/option[13]");
    public static final Target BIRTH_YEAR = Target.the("Register Button")
            .locatedBy("//*[@id=\"birthYear\"]");
    public static final Target BIRTH_YEAR_LIST = Target.the("Register Button")
            .locatedBy("//*[@id=\"birthYear\"]/option[12]");
    public static final Target NEXT_LOCATION_BUTTON = Target.the("Register Button")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span");
    public static final Target NEXT_DEVICES_BUTTON = Target.the("Register Button")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a");
    public static final Target NEXT_LAST_STEP_BUTTON = Target.the("Register Button")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span");
    public static final Target PASSWORD = Target.the("Register Button")
            .locatedBy("//*[@id=\"password\"]");
    public static final Target CONFIRM_PASSWORD = Target.the("Register Button")
            .locatedBy("//*[@id=\"confirmPassword\"]");
    public static final Target CHECK1 = Target.the("Register Button")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]");
    public static final Target CHECK2 = Target.the("Register Button")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]");
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Register Button")
            .locatedBy("//*[@id=\"laddaBtn\"]/span");
    public static final Target PASSWORD_MISMATCH_MESSAGE = Target.the("Register Button")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[3]/div[2]/span");

}
