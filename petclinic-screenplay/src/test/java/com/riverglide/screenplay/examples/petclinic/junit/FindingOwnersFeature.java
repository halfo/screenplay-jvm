package com.riverglide.screenplay.examples.petclinic.junit;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.examples.petclinic.PetClinicReceptionist;
import com.riverglide.screenplay.examples.petclinic.activity.Leave;
import com.riverglide.screenplay.examples.petclinic.activity.SearchFor;
import com.riverglide.screenplay.examples.petclinic.activity.See;
import com.riverglide.screenplay.examples.petclinic.activity.Start;
import org.junit.After;
import org.junit.Test;

public class FindingOwnersFeature {
    public static final String EMPTY_SEARCH_TERMS = "";

    private Actor you = PetClinicReceptionist.actor();

    @Test
    public void should_see_all_the_owners_when_no_search_criteria_are_provided() throws Exception {

        int theExpectedNumberOfOwners = 10;

        you.attemptTo(
                Start.findingAnOwner(),
                SearchFor.ownersUsing(EMPTY_SEARCH_TERMS)
        );

        you.should(See.thatTheNumberOfOwnersIs(theExpectedNumberOfOwners));
    }

    @After
    public void clean_up() {
        you.attemptTo(Leave.theClinic());
    }
}
