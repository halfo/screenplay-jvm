package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.examples.petclinic.activity.task.LeaveTheClinic;

import static com.riverglide.screenplay.examples.petclinic.activity.task.LeaveTheClinic.leaveTheClinic;

public class Leave {
    public static Perform theClinic() {
        return leaveTheClinic();
    }
}
