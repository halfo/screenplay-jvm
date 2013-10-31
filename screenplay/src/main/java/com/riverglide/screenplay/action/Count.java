package com.riverglide.screenplay.action;

import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

import static com.riverglide.screenplay.action.interaction.webdriver.CountTheNumberOfTableRows.countTheNumberOfTableRowsIn;

public class Count {
    public static Perform theNumberOfTableRowsIn(By theElement) {
        return countTheNumberOfTableRowsIn(theElement);
    }
}
