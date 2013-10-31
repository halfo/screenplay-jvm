package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

public class Enter extends WebDriverInteraction implements Perform {

    private String text;
    private By field;

    public void performAs(Actor actor) {
        web(actor).findElement(field).sendKeys(text);
    }

    public Enter(String text) {
        this.text = text;
    }

    public static Enter the(String text) {
        return new Enter(text);
    }

    public Perform into(By field) {
        this.field = field;
        return this;
    }
}
