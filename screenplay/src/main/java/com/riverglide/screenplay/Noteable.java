package com.riverglide.screenplay;

public class Noteable<THING> {

    private final THING toRemember;

    public Noteable(THING toRemember) {
        this.toRemember = toRemember;
    }

    public <T> T item() {
        return (T) toRemember;
    }
}
