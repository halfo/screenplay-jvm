package com.riverglide.screenplay.examples.petclinic.activity.task;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Ensure;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.CountThe;
import com.riverglide.screenplay.action.It;
import com.riverglide.screenplay.examples.petclinic.screen.Owners;
import org.openqa.selenium.By;

public class SeeThatTheNumberOfOwnersIs implements Perform {
    public static final By LIST_OF_OWNERS_TABLE = Owners.screen().listOfOwners();
    private int expected;

    public void performAs(Actor asAReceptionist) {
        asAReceptionist.attemptTo(
                CountThe.numberOfTableRowsInThe(LIST_OF_OWNERS_TABLE),
                Ensure.that(It.isTheNumber(expected))
        );
    }

    public SeeThatTheNumberOfOwnersIs(int expectedNumberOfOwners) {
        this.expected = expectedNumberOfOwners;
    }

    public static SeeThatTheNumberOfOwnersIs seeThatTheNumberOfOwnersIs(int expectedNumberOfOwners) {
        return new SeeThatTheNumberOfOwnersIs(expectedNumberOfOwners);
    }
}
