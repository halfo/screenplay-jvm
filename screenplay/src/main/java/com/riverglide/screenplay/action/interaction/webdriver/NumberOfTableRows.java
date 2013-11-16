package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Question;
import org.openqa.selenium.By;

public class NumberOfTableRows extends WebDriverInteraction implements Question<Integer> {
    private final By elementLocation;

    public NumberOfTableRows(By elementLocation) {
        this.elementLocation = elementLocation;
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return numberOfTableRowsSeenBy(actor);
    }

    private Integer numberOfTableRowsSeenBy(Actor actor) {
        return web(actor).findElement(elementLocation).findElements(By.tagName("tr")).size();
    }
}
