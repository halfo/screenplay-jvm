package com.riverglide.screenplay.examples.petclinic.screen;

import com.riverglide.screenplay.Screen;
import org.openqa.selenium.By;

public class Welcome implements Screen {

    private final String url = "http://localhost:9966/petclinic";

    public By screenName() { return By.cssSelector("h2"); }

    public String location() {
        return url;
    }

    public static Welcome screen() {
        return new Welcome();
    }
}
