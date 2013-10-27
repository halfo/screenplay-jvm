package com.riverglide.screenplay.action;

import com.riverglide.screenplay.Perform;

import static com.riverglide.screenplay.action.interaction.webdriver.ItIsTheNumber.itIsTheNumber;
import static com.riverglide.screenplay.action.interaction.webdriver.ItSays.itSays;

public class It {
    public static Perform says(String something) {
        return itSays(something);
    }

    public static Perform isTheNumber(Integer expected) {
        return itIsTheNumber(expected);
    }
}
