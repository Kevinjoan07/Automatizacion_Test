package com.saucedemo.UI;


import net.serenitybdd.screenplay.targets.Target;
public class Login {

    public static final Target TXT_USER = Target.the("user field").locatedBy("//input[@name='user-name']");
    public static final Target TXT_PASSWORD = Target.the("password  field").locatedBy("//input[@name='password']");
    public static final Target BTN_SEND = Target.the("send button").locatedBy("//input[@id='login-button']");



}
