package com.riverglide.screenplay.examples.petclinic.cucumber;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Noteable;
import com.riverglide.screenplay.examples.petclinic.PetClinicReceptionist;
import com.riverglide.screenplay.examples.petclinic.activity.*;
import com.riverglide.screenplay.examples.petclinic.activity.question.NumberOfOwners;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ReceptionistSteps {

    public static final String EMPTY_SEARCH_TERMS = "";
    private Actor asAReceptionist = PetClinicReceptionist.actor();
    private final Noteable<Integer> theExpectedNumberOfOwners = new Noteable<Integer>(10);

    @Given("^I have chosen to find owners$")
    public void I_have_chosen_to_find_owners() throws Throwable {
        asAReceptionist.attemptTo(Start.findingAnOwner());
    }

    @When("^I start helping a customer$")
    public void I_start_helping_a_customer() throws Throwable {
        asAReceptionist.attemptTo(Start.helpingACustomer());
    }

    @Then("^I should have a place to start$")
    public void I_should_have_a_place_to_start() throws Throwable {
        asAReceptionist.youShould(HaveAPlace.toStart());
    }

    @When("^I search without providing any details$")
    public void I_search_without_providing_any_details() throws Throwable {
        asAReceptionist.attemptTo(
                SearchFor.ownersUsing(EMPTY_SEARCH_TERMS),
                Remember.the(new NumberOfOwners())
        );
    }

    @Then("^I should see all of the owners$")
    public void I_should_see_all_of_the_owners() throws Throwable {
        assertThat(asAReceptionist.recalls(NumberOfOwners.class.toString()), is(theExpectedNumberOfOwners.item()));
    }


    @After
    public void goHome() {
        asAReceptionist.attemptTo(Leave.theClinic());
    }
}
