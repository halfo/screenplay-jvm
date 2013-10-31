package com.riverglide.screenplay.examples.petclinic.junit;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.examples.petclinic.PetClinicReceptionist;
import com.riverglide.screenplay.examples.petclinic.activity.HaveAPlace;
import com.riverglide.screenplay.examples.petclinic.activity.Leave;
import com.riverglide.screenplay.examples.petclinic.activity.Start;
import org.junit.After;
import org.junit.Test;

public class PlaceToStartFeature {
    private Actor you = PetClinicReceptionist.actor();

    @Test
    public void should_have_a_place_to_start() throws Exception {
        you.attemptTo(Start.helpingACustomer());

        you.should(HaveAPlace.toStart());
    }

    @After
    public void clean_up() {
        you.attemptTo(Leave.theClinic());
    }
}