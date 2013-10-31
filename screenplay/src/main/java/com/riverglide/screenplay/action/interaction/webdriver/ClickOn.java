package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

public class ClickOn extends WebDriverInteraction implements Perform {

    private By ofInterest;

    public void performAs(Actor actor) {
        web(actor).findElement(ofInterest).click();
    }

    public ClickOn(By elementOfInterest) {
        ofInterest = elementOfInterest;
    }

    public static ClickOn clickOn(By theElementOfInterest) {
        return new ClickOn(theElementOfInterest);
    }
}
