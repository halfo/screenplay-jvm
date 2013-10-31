package com.riverglide.screenplay.examples.petclinic.cucumber;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.examples.petclinic.PetClinicReceptionist;
import com.riverglide.screenplay.examples.petclinic.activity.*;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReceptionistSteps {

    public static final String EMPTY_SEARCH_TERMS = "";
    private Actor asAReceptionist = PetClinicReceptionist.actor();

    @Given("^I have chosen to find owners$")
    public void I_have_chosen_to_find_owners() throws Throwable {
        asAReceptionist.attemptTo(Start.findingAnOwner());
    }

    @When("^I start helping a customer$")
    public void I_start_helping_a_customer() throws Throwable {
        asAReceptionist.attemptTo(Start.helpingACustomer());
    }

    @Then("^I should have a place toStart start$")
    public void I_should_have_a_place_to_start() throws Throwable {
        asAReceptionist.youShould(HaveAPlace.toStart());
    }

    @When("^I search without providing any details$")
    public void I_search_without_providing_any_details() throws Throwable {
        asAReceptionist.attemptTo(SearchFor.ownersUsing(EMPTY_SEARCH_TERMS));
    }

    @Then("^I should see all of the owners$")
    public void I_should_see_all_of_the_owners() throws Throwable {
        asAReceptionist.youShould(SeeThat.theNumberOfOwnersIs(10));
    }


    @After
    public void goHome() {
        asAReceptionist.attemptTo(Leave.theClinic());
    }
}
