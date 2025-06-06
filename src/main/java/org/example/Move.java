// Assignment (4)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement a Move class
// that makes the turtle move
package org.example;

public class Move implements Commands {
    private final Turtle t; private final Matrix m; private final double d; private final boolean trace;

    public Move(
            Turtle t, Matrix m, double d, boolean trace) { this.t = t; this.m = m; this.d = d; this.trace = trace;
    }

    public void execute() {

        t.move(m, d, trace);
    }
}
