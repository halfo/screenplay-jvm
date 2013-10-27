package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Perform;

import static com.riverglide.screenplay.examples.petclinic.activity.task.SearchForOwnersWith.searchForOwnersWith;

public class SearchFor {
    public static Perform ownersWith(String searchTerms) {
        return searchForOwnersWith(searchTerms);
    }
}
