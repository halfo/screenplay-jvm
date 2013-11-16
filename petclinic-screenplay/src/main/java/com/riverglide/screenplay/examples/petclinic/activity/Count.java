package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Question;
import com.riverglide.screenplay.examples.petclinic.activity.question.NumberOfOwners;

public class Count {
    public static Question<Integer> theNumberOfOwners() {
        return new NumberOfOwners();
    }
}
