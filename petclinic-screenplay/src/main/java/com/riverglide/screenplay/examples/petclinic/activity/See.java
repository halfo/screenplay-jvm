package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Perform;

import static com.riverglide.screenplay.examples.petclinic.activity.task.SeeThatTheNumberOfOwnersIs.seeThatTheNumberOfOwnersIs;

public class See {
    public static Perform thatTheNumberOfOwnersIs(Integer expectedNumber) {
        return seeThatTheNumberOfOwnersIs(expectedNumber);
    }
}
