package com.riverglide.screenplay;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ActorTest {


    @Test
    public void takes_note_of_an_important_string() throws Exception {
        Actor actor = new Actor();

        Noteable<String> nameOfTheCafe = new Noteable<String>("Joe & The Juice");
        actor.takeNoteOf("The Name of the Cafe", nameOfTheCafe);

        assertThat(actor.recalls("The Name of the Cafe"), is(nameOfTheCafe.item()));
    }

    @Test
    public void takes_note_of_an_important_integer() throws Exception {
        Actor actor = new Actor();

        Noteable<Integer> amountOfCoffee = new Noteable<Integer>(2);

        actor.takeNoteOf("Amount of Coffee I Drank", amountOfCoffee);

        assertThat(actor.recalls("Amount of Coffee I Drank"), is(amountOfCoffee.item()));
    }

    @Test
    public void remembersAnyOldThing() throws Exception {
        List<Noteable<?>> items = new ArrayList<Noteable<?>>();
        items.add(new Noteable<Float>(new Float(1.234)));
        items.add(new Noteable<Boolean>(false));

        for(Noteable<?> remembered : items) {
            Actor inARole = new Actor();
            inARole.remember(remembered);

            assertThat("for example [" + remembered.item().toString() + "]",
                    inARole.getIt(), is(remembered.item())
            );
        }
    }

    @Test
    public void rememberAString() throws Exception {
        Actor inARole = new Actor();
        Noteable<String> itemToRemember = new Noteable<String>("Something to remember");

        inARole.remember(itemToRemember);

        assertThat(inARole.getIt(), is(itemToRemember.item()));
    }

    @Test
    public void rememberAnInteger() throws Exception {
        Actor inARole = new Actor();
        Noteable<Integer> remembered = new Noteable<Integer>(1);

        inARole.remember(remembered);

        assertThat(inARole.getIt(), is(remembered.item()));
    }
}
