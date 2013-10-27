package com.riverglide.screenplay.examples.petclinic.activity.task;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.interaction.webdriver.Click;
import com.riverglide.screenplay.action.interaction.webdriver.Enter;
import com.riverglide.screenplay.examples.petclinic.screen.FindOwners;
import org.openqa.selenium.By;

public class SearchWith implements Perform {

    public static final By FIND_OWNERS_FIELD = FindOwners.screen().lastNameField();
    public static final By FIND_OWNERS_BUTTON = FindOwners.screen().findOwnersButton();

    private static String searchTerms;

    @Override
    public void performAs(Actor asAReceptionist) {
        asAReceptionist.attemptTo(
                Enter.the(searchTerms).intoThe(FIND_OWNERS_FIELD),
                Click.onThe(FIND_OWNERS_BUTTON)
        );
    }

    public static Perform searchWith(String searchTerms) {
        return new SearchWith(searchTerms);
    }

    public SearchWith(String searchTerms) {
        this.searchTerms = searchTerms;
    }
}
