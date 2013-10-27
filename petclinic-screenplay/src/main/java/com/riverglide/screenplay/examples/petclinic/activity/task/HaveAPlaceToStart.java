package com.riverglide.screenplay.examples.petclinic.activity.task;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Ensure;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.It;
import com.riverglide.screenplay.action.ReadThe;
import com.riverglide.screenplay.examples.petclinic.screen.Welcome;
import org.openqa.selenium.By;

public class HaveAPlaceToStart implements Perform {

    public static final By WELCOME_MESSAGE = Welcome.screen().screenName();

    public void performAs(Actor asAReceptionist) {
        asAReceptionist.attemptTo(
                ReadThe.textInThe(WELCOME_MESSAGE),
                Ensure.that(It.says("Welcome"))
        );
    }

    public static HaveAPlaceToStart haveAPlaceToStart() {
        return new HaveAPlaceToStart();
    }
}
