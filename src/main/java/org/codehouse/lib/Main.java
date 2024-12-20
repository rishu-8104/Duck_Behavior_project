package org.codehouse.lib;

import org.codehouse.lib.fly.FlyBehavior;
import org.codehouse.lib.fly.FlyWithWings;
import org.codehouse.lib.quack.Quack;
import org.codehouse.lib.quack.QuackBehavior;

public class Main {
    public static void main(String[] args) {
        // Demonstrate FlyWithWings
        FlyBehavior flyBehavior = new FlyWithWings();
        flyBehavior.fly();

        // Demonstrate Quack
        QuackBehavior quackBehavior = new Quack();
        String quackSound = quackBehavior.quack();
        System.out.println(quackSound);
    }
}
