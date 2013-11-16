package com.riverglide.screenplay;

import com.riverglide.screenplay.ability.Ability;

import java.util.HashMap;
import java.util.Map;

public class Actor {

    Map<Class,Ability> abilities = new HashMap<Class,Ability>();
    private Memorable<?> it;

    private final Map<String,String> notepad = new HashMap<String, String>();

    public Actor with(Ability toDoSomething) {
        acquire(theAbility(toDoSomething));
        return this;
    }

    public Ability ability(Class ofAbility) {
        return abilities.get(ofAbility);
    }

    public void attemptTo(Perform... somethings) {
        for(Perform something : somethings) {
            attempt(something);
        }
    }

    public void youShould(Perform verification) {
        attempt(verification);
    }

    public void should(Perform verification) {
        youShould(verification);
    }

    public void remember(Memorable<?> it) {
        this.it = it;
    }

    public <T> T getIt() {
        return it.item();
    }

    private Ability acquire(Ability toDoSomething) {
        return abilities.put(toDoSomething.getClass(), toDoSomething);
    }

    private void attempt(Perform task) {
        task.performAs(this);
    }

    private Ability theAbility(Ability toBeMadeMoreReadable) {
        return toBeMadeMoreReadable;
    }

    public String recalls(String s) {
        return notepad.get(s);
    }

    public void takeNoteOf(String key, String value) {
        notepad.put(key, value);
    }
}