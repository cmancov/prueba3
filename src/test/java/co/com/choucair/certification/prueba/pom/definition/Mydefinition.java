package co.com.choucair.certification.prueba.pom.definition;

import co.com.choucair.certification.prueba.pom.step.OpenApp;
import co.com.choucair.certification.prueba.pom.step.TasksAction;
import  cucumber.api.java.en.Given;
import  cucumber.api.java.en.Then;
import  cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Mydefinition {

    @Steps
    OpenApp openApp;

    @Steps
    TasksAction taskAction;
    @Given("^I enter with my credentials$")
    public void iEnterWithMyCredentials() {
        openApp.appUrl();
    }

    @When("^I proceed with the authentication$")
        public void iProceedWithTheAuthentication () {
        taskAction.singIn();
        }

        @Then("^go to the main view of the page$")
            public void goToTheMainViewOfThePage (){
        taskAction.verificar();
        }
    }

