package com.riverglide.screenplay.examples.petclinic.activity.question;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Question;
import com.riverglide.screenplay.action.interaction.webdriver.NumberOfTableRows;
import com.riverglide.screenplay.examples.petclinic.screen.Owners;

public class NumberOfOwners implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        return new NumberOfTableRows(Owners.screen().listOfOwners()).answeredBy(actor);
    }
}
