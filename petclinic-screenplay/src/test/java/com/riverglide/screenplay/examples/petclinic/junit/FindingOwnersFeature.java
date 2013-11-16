package com.riverglide.screenplay.examples.petclinic.junit;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Noteable;
import com.riverglide.screenplay.examples.petclinic.PetClinicReceptionist;
import com.riverglide.screenplay.examples.petclinic.activity.*;
import com.riverglide.screenplay.examples.petclinic.activity.question.NumberOfOwners;
import org.junit.After;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindingOwnersFeature {
    public static final String EMPTY_SEARCH_TERMS = "";

    //todo: change "you" to "theReceptionist"
    private Actor you = PetClinicReceptionist.actor();

    @Test
    public void should_see_all_the_owners_when_no_search_criteria_are_provided() throws Exception {

        Noteable<Integer> theExpectedNumberOfOwners = new Noteable<Integer>(10);

        you.attemptTo(
                Start.findingAnOwner(),
                SearchFor.ownersUsing(EMPTY_SEARCH_TERMS),
                Remember.the(new NumberOfOwners())
        );

        assertThat(you.recalls(NumberOfOwners.class.toString()), is(theExpectedNumberOfOwners.item()));

        /*
        Actor theReceptionist = new Actor().with(WebBrowsing.ability());
        theReceptionist.attemptsTo( 
            Go.to(findOwnersScreen.url()), 
            Search.forOwnersWith(EMPTY_SEARCH_TERMS), 
            Count.theNumberOfOwners() );

        assertThat( 
        	theReceptionist.sawThatThe(numberOfOwners()), 
        	was(theExpectedNumberOfOwners) 
        );
         */

    }

    @After
    public void clean_up() {
        you.attemptTo(Leave.theClinic());
    }
}
