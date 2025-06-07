// Assignment (4)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement a Historyofmoves class
// that is used to store the history of the moves that have already been done.

package org.example;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class HistoryofMoves {
    private final List<Commands> done = new ArrayList<>();

    private final Deque<Commands> redo = new ArrayDeque<>();

    private final Matrix m; private final Turtle t; private final char blank;

    public HistoryofMoves(Matrix m, Turtle t, char blank) {
        this.m = m; this.t = t; this.blank = blank;
    }

    private void rebuild() {
        m.clear(blank); t.reset(); done.forEach(Commands::execute);
    }

    public void push(Commands c) { done.add(c); c.execute(); redo.clear(); }

    public void undo() {
        if (done.isEmpty()) return;
        redo.push(done.remove(done.size() - 1));
        rebuild();
    }

    public void redo() {
        if (redo.isEmpty()) return; Commands c = redo.pop(); done.add(c); rebuild();
    }
}
