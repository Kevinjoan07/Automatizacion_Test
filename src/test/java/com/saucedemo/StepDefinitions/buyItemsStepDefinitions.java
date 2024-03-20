package com.saucedemo.StepDefinitions;

import com.saucedemo.Models.Credentials;
import com.saucedemo.Models.PaymentInformation;
import com.saucedemo.Tasks.*;

import com.saucedemo.Utils.PropertyReader;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import jline.internal.Log;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import java.io.IOException;
import java.util.List;

import static com.saucedemo.UI.CheckoutComplete.TXT_THANKS_PURSHASING;

public class buyItemsStepDefinitions {


    @Before
    public void before() throws IOException {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());

    }


    @Given("^that the user is on the store's page$")
    public void thatTheUserIsOnTheStoreSPage() {
        try{
            PropertyReader.addPropertySource("src/test/resources/automation.properties");
        }catch (IOException e){
            Log.error("This file is no found ", e);
        }

        OnStage.theActorCalled(PropertyReader.getProperty("ADMINISTRADOR")).wasAbleTo(Open.url(PropertyReader.getProperty("URL")));

    }

    @When("^login$")
    public void login(List<Credentials> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.on(data.get(0).getUser(),data.get(0).getPassword()));
    }

    @When("^purchase two items$")
    public void purchaseTwoItems(List<PaymentInformation> info) {
        OnStage.theActorInTheSpotlight().attemptsTo(buyProducts.on(info.get(0).getFirtName(),info.get(0).getLastName(),
                info.get(0).getZipCode()));

    }

    @Then("^you can see the \"([^\"]*)\"$")
    public void youCanSeeThe(String text) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TXT_THANKS_PURSHASING), WebElementStateMatchers.containsOnlyText(text)));

    }
}
