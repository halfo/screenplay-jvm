package com.riverglide.screenplay.examples.petclinic.activity.task;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.Go;
import com.riverglide.screenplay.examples.petclinic.screen.FindOwners;

public class StartFindingAnOwner implements Perform {

    @Override
    public void performAs(Actor asAReceptionist) {
        asAReceptionist.attemptTo(Go.toThe(FindOwners.screen()));
    }

    public static Perform startFindingAnOwner() {
        return new StartFindingAnOwner();
    }
}
