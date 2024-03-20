package com.saucedemo.Tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.UI.CheckoutOverview.BTN_FINISH;
import static com.saucedemo.UI.Home.*;
import static com.saucedemo.UI.OrderForms.*;
import static com.saucedemo.UI.ShoppingCart.BTN_CHECKOUT;

public class buyProducts implements Task {

    private String firstName, lastName, zipCode;

    public buyProducts(String firstName, String lastName, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Click.on(BTN_ITEM_1),Click.on(BTN_ITEM_2),
                Click.on(BTN_SHOPPING_CART),Click.on(BTN_CHECKOUT),
                Enter.theValue(firstName).into(TXT_FORM_FIRSTNAME),
                Enter.theValue(lastName).into(TXT_FORM_LASTNAME),
                Enter.theValue(zipCode).into(TXT_FORM_ZIPCODE),Click.on(BTN_FORM_CONTINUE),
                Click.on(BTN_FINISH));

    }

    public static buyProducts on(String firstName,String lastName, String zipCode){
        return Instrumented.instanceOf(buyProducts.class).withProperties(firstName,lastName,zipCode);
    }
}
