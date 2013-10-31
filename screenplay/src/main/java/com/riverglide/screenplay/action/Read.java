package com.riverglide.screenplay.action;

import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

import static com.riverglide.screenplay.action.interaction.webdriver.ReadTheTextInThe.readTheTextInThe;

public class Read {
    public static Perform theTextInThe(By element) {
        return readTheTextInThe(element);
    }
}
