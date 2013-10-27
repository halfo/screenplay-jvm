package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

public class ClickOnThe extends WebDriverInteraction implements Perform {

    private By ofInterest;

    public void performAs(Actor actor) {
        web(actor).findElement(ofInterest).click();
    }

    public ClickOnThe(By elementOfInterest) {
        ofInterest = elementOfInterest;
    }

    public static ClickOnThe clickOnThe(By elementOfInterest) {
        return new ClickOnThe(elementOfInterest);
    }
}
