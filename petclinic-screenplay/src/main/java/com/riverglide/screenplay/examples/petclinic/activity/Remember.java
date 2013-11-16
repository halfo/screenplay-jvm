package com.riverglide.screenplay.examples.petclinic.activity;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Noteable;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.Question;

public class Remember<T> implements Perform{
    private final Question<T> question;

    @Override
    public void performAs(Actor actor) {
        Noteable<T> thing = new Noteable<T>(question.answeredBy(actor));
        actor.takeNoteOf(question.getClass().toString(), thing);
    }

    public static <T> Perform the(Question<T> question) {
        return new Remember(question);
    }

    public Remember(Question<T> question) {
        this.question = question;
    }
}
