package com.riverglide.screenplay;

import com.riverglide.screenplay.ability.Ability;

import java.util.HashMap;
import java.util.Map;

public class Actor {

    Map<Class,Ability> abilities = new HashMap<Class,Ability>();
    private Noteable<?> it;

    private final Map<String,Noteable<?>> notepad = new HashMap<String, Noteable<?>>();

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

    public <T> T recalls(String key) {
        return notepad.get(key).item();
    }

    public <ITEM> void takeNoteOf(String key, Noteable<ITEM> value) {
        notepad.put(key, value);
    }

    @Deprecated
    public void remember(Noteable<?> it) {
        this.it = it;
    }

    @Deprecated
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
}