package com.riverglide.screenplay.action;

import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

import static com.riverglide.screenplay.action.interaction.webdriver.CountTheNumberOfTableRows.countTheNumberOfTableRows;

public class CountThe {
    public static Perform numberOfTableRowsInThe(By elementLocation) {
        return countTheNumberOfTableRows(elementLocation);
    }
}
