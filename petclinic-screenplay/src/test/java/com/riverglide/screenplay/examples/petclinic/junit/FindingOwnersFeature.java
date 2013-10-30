package com.riverglide.screenplay.examples.petclinic.junit;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.examples.petclinic.PetClinicReceptionist;
import com.riverglide.screenplay.examples.petclinic.activity.Leave;
import com.riverglide.screenplay.examples.petclinic.activity.SearchFor;
import com.riverglide.screenplay.examples.petclinic.activity.SeeThat;
import com.riverglide.screenplay.examples.petclinic.activity.Start;
import org.junit.After;
import org.junit.Test;

public class FindingOwnersFeature {
    private Actor asAReceptionist = PetClinicReceptionist.actor();

    public static final String EMPTY_SEARCH_TERMS = "";

    @Test
    public void should_see_all_the_owners_when_no_search_criteria_are_provided() throws Exception {
        asAReceptionist.attemptTo(
                Start.findingAnOwner(),
                SearchFor.ownersWith(EMPTY_SEARCH_TERMS)
        );

        asAReceptionist.youShould(SeeThat.theNumberOfOwnersIs(10));
    }

    @After
    public void cleanUp() {
        asAReceptionist.attemptTo(Leave.theClinic());
    }
}
