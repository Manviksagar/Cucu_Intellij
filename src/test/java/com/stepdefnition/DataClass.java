package com.stepdefnition;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public class DataClass {

    @When("^user Checks with username and Password$")
    public void user_Checks_with_username_and_Password(DataTable table) throws Throwable {
        List<Map<String, String>> data= table.asMaps(String.class,String.class);

        System.out.println(data.get(0).get("username") +"  " +data.get(1).get("Password"));
    }


    @Given("^user is with valid credentials$")
    public void user_is_with_valid_credentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Given Step");
    }

    @And("^user navigates to google Page$")
    public void user_navigates_to_google_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("And Step");
    }

    @Then("^success message is dis$")
    public void success_message_is_dis() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("then Step ");
    }

    @When("^user goto url$")
    public void user_goto_url(List<String> list) throws Throwable {


        for(int i=0;i<list.size();i++)
        System.out.println(list.get(i));
    }

}
