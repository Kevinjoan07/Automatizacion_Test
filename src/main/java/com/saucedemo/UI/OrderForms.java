package com.saucedemo.UI;

import net.serenitybdd.screenplay.targets.Target;

public class OrderForms {


    public static final Target TXT_FORM_FIRSTNAME = Target.the("form firts name ").locatedBy("//input[@id='first-name']");
    public static final Target TXT_FORM_LASTNAME = Target.the("checkout").locatedBy("//input[@id='last-name']");
    public static final Target TXT_FORM_ZIPCODE = Target.the("checkout").locatedBy("//input[@id='postal-code']");
    public static final Target BTN_FORM_CONTINUE = Target.the("button continue").locatedBy("//input[@id='continue']");
}
