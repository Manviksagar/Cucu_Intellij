package com.stepdefnition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^user login with valid credentials$")
    public void user_login_with_valid_credentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step");
    }
    @When("^login with username and password$")
    public void login_with_username_and_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step");
    }

    @And("^click on submit$")
    public void click_on_submit() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step");
    }

    @Then("^user login to home page$")
    public void user_login_to_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step");
    }



}
