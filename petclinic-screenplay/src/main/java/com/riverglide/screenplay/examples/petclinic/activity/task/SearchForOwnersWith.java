package com.riverglide.screenplay.examples.petclinic.activity.task;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.Click;
import com.riverglide.screenplay.action.interaction.webdriver.Enter;
import com.riverglide.screenplay.examples.petclinic.screen.FindOwners;
import org.openqa.selenium.By;

public class SearchForOwnersWith implements Perform {

    public static final FindOwners screen = FindOwners.screen();
    public static final By LAST_NAME_FIELD = screen.lastNameField();
    public static final By FIND_OWNERS_BUTTON = screen.findOwnersButton();

    private static String searchTerms;

    @Override
    public void performAs(Actor asAReceptionist) {
        asAReceptionist.attemptTo(
                Enter.the(searchTerms).intoThe(LAST_NAME_FIELD),
                Click.onThe(FIND_OWNERS_BUTTON)
        );
    }

    public static Perform searchForOwnersWith(String searchTerms) {
        return new SearchForOwnersWith(searchTerms);
    }

    public SearchForOwnersWith(String searchTerms) {
        this.searchTerms = searchTerms;
    }
}
