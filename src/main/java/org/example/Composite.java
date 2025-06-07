// Assignment (4)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement a Composite class
// to combine all other commans and make it one

package org.example;
import java.util.ArrayList;
import java.util.List;

public class Composite implements Commands {
    private final List<Commands> parts = new ArrayList<>();

    public Composite add(Commands c) {
        parts.add(c); return this;
    }

    public void execute() {

        parts.forEach(Commands::execute);
    }
}
