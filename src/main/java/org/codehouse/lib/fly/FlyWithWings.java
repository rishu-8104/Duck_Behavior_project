package org.codehouse.lib.fly;

// Concrete FlyBehaviors
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with wings!");
    }
}



