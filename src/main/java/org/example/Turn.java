// Assignment (4)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement a Turn class
// to make sure that the turtle moves as well
package org.example;

public class Turn implements Commands {
    private final Turtle t; private final double deg;

    public Turn(Turtle t, double deg) {
        this.t = t; this.deg = deg;
    }

    public void execute() {
        t.turn(deg);
    }
}
