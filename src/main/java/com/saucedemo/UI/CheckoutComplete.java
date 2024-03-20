package com.saucedemo.UI;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutComplete {

    public static final Target TXT_THANKS_PURSHASING = Target.the("thanks for purchasing").locatedBy("//h2[@class='complete-header']");
}
