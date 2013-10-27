package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.Screen;

import static com.riverglide.screenplay.examples.petclinic.activity.task.HaveAPlaceToStart.haveAPlaceToStart;

public class HaveAPlace {
    public static Perform to() {
        return haveAPlaceToStart();
    }
}
