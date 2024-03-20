package com.saucedemo.UI;

import net.serenitybdd.screenplay.targets.Target;
public class Home {

    public static final Target BTN_ITEM_1 = Target.the("article number 1").locatedBy("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static final Target BTN_ITEM_2 = Target.the("article number 2").locatedBy("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
    public static final Target BTN_SHOPPING_CART = Target.the("shopping cart").locatedBy("//div[@id='shopping_cart_container']");

}
