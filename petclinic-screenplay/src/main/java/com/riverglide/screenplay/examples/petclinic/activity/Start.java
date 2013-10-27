package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Perform;

import static com.riverglide.screenplay.examples.petclinic.activity.task.StartFindingAnOwner.startFindingAnOwner;
import static com.riverglide.screenplay.examples.petclinic.activity.task.StartHelpingACustomer.startHelpingACustomer;

public class Start {
    public static Perform findingAnOwner() {
        return startFindingAnOwner();
    }

    public static Perform helpingACustomer() {
        return startHelpingACustomer();
    }
}
