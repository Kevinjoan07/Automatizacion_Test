package com.saucedemo.Tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.UI.Login.*;

public class Login implements Task {

    private String user, password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Enter.theValue(user).into(TXT_USER),
                Enter.theValue(password).into(TXT_PASSWORD), Click.on(BTN_SEND));


    }

public static Login on(String user, String password ){
        return Instrumented.instanceOf(Login.class).withProperties(user,password);
    }

}


