package com.riverglide.screenplay.action;

import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

import static com.riverglide.screenplay.action.interaction.webdriver.ClickOn.clickOn;

public class Click {
    public static Perform onThe(By element) {
        return clickOn(element);
    }
}
