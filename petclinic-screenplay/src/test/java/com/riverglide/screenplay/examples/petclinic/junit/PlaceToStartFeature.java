package com.riverglide.screenplay.examples.petclinic.junit;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.examples.petclinic.PetClinicReceptionist;
import com.riverglide.screenplay.examples.petclinic.activity.HaveAPlace;
import com.riverglide.screenplay.examples.petclinic.activity.Leave;
import com.riverglide.screenplay.examples.petclinic.activity.Start;
import org.junit.After;
import org.junit.Test;

public class PlaceToStartFeature {
    private Actor asAReceptionist = PetClinicReceptionist.actor();

    @Test
    public void should_have_a_place_to_start() throws Exception {
        asAReceptionist.attemptTo(Start.helpingACustomer());

        asAReceptionist.youShould(HaveAPlace.to());
    }

    @After
    public void cleanUp() {
        asAReceptionist.attemptTo(Leave.theClinic());
    }
}