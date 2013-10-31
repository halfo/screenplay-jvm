package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Perform;

import static com.riverglide.screenplay.examples.petclinic.activity.task.SearchForOwnersWith.searchForOwnersWith;

public class SearchFor {
    public static Perform ownersUsing(String searchTerms) {
        return searchForOwnersWith(searchTerms);
    }
}
