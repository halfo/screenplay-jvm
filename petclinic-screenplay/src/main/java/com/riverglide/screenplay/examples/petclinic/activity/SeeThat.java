package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Perform;

import static com.riverglide.screenplay.examples.petclinic.activity.task.SeeThatTheNumberOfOwnersIs.seeThatTheNumberOfOwnersIs;

public class SeeThat {
    public static Perform theNumberOfOwnersIs(Integer expectedNumber) {
        return seeThatTheNumberOfOwnersIs(expectedNumber);
    }
}
