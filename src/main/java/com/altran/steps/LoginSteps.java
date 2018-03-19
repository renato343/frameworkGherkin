package com.altran.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {
    @Given("^I use Data from test case \"([^\"]*)\"$")
    public void iUseDataFromTestCase(String arg0) throws Throwable {
        System.out.println(arg0);
        throw new PendingException();
    }

    @And("^I open browser to \"([^\"]*)\"$")
    public void iOpenBrowserTo(String arg0) throws Throwable {
        System.out.println(arg0);
        throw new PendingException();
    }

    @Then("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter \"([^\"]*)\" to \"([^\"]*)\"$")
    public void iEnterTo(String arg0, String arg1) throws Throwable {
        System.out.println(arg0 + arg1);
        throw new PendingException();
    }

}
