package org.codehouse.lib.quack;

// Concrete QuackBehaviors
public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "Quack";
    }
}
