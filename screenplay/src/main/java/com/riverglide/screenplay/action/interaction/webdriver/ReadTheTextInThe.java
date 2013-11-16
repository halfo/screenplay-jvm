package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Noteable;
import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

public class ReadTheTextInThe extends WebDriverInteraction implements Perform {
    private final By element;

    public void performAs(Actor actor) {
        actor.remember(new Noteable<String>(readByThe(actor)));
    }

    private String readByThe(Actor actor) {
        return web(actor).findElement(element).getText();
    }

    public static Perform readTheTextInThe(By element) {
        return new ReadTheTextInThe(element);
    }

    public ReadTheTextInThe(By element) {
        this.element = element;
    }
}
