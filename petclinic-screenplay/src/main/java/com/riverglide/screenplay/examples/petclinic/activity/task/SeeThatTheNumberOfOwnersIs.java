package com.riverglide.screenplay.examples.petclinic.activity.task;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Ensure;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.Count;
import com.riverglide.screenplay.action.It;
import com.riverglide.screenplay.examples.petclinic.screen.Owners;
import org.openqa.selenium.By;

public class SeeThatTheNumberOfOwnersIs implements Perform {
    public static final By THE_LIST_OF_OWNERS_TABLE = Owners.screen().listOfOwners();
    private int weExpect;

    public void performAs(Actor asAReceptionist) {
        asAReceptionist.attemptTo(
                Count.theNumberOfTableRowsIn(THE_LIST_OF_OWNERS_TABLE),
                Ensure.that(It.isTheNumber(weExpect))
        );
    }

    public SeeThatTheNumberOfOwnersIs(int expectedNumberOfOwners) {
        this.weExpect = expectedNumberOfOwners;
    }

    public static SeeThatTheNumberOfOwnersIs seeThatTheNumberOfOwnersIs(int expectedNumberOfOwners) {
        return new SeeThatTheNumberOfOwnersIs(expectedNumberOfOwners);
    }
}
