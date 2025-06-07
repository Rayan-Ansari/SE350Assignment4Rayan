package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    @Test
    void testMatrixSetAndClear() {
        Matrix m = new Matrix(5, 5, '-');
        // they should all be just a dash for now
        String allLines = m.toString();
        assertTrue(allLines.replace("\n", "").matches("-+"), "Matrix initially filled with '-'");

        // put a pixel down
        m.setCell(2, 2, 'X');
        String out = m.toString();
        // Row index from top: height=5 => y=2 maps to row index 5-1-2 = 2
        String[] rows = out.split("\n");
        assertEquals('X', rows[2].charAt(2));


        m.clear(' ');
        assertFalse(m.toString().contains("X"), "Matrix.clear removed X");
    }

    @Test
    void testBresenhamHorizontalLine() {
        Matrix m = new Matrix(10, 3, ' ');
        new BresenhamStrategy().drawLine(m, 0, 0, 4, 0);
        String[] rows = m.toString().split("\n");

        String bottom = rows[rows.length - 1];
        assertTrue(bottom.startsWith("#####"), "Should draw 5 hashes at bottom row");
    }

    @Test
    void testHistoryUndoRedo() {
        Matrix m    = new Matrix(10, 3, ' ');
        Pen pen     = new Pen();
        Turtle t    = new Turtle(0, 0, pen);
        HistoryofMoves hist = new HistoryofMoves(m, t, ' ');

        // Draw a line with dist 3
        hist.push(new Move(t, m, 3, true));
        long filled = countHashes(m);
        assertEquals(3, filled, "After tracing 3 units should have 3 '#' pixels");

        // undo should remove it
        hist.undo();
        assertEquals(0, countHashes(m), "After undo, no '#' pixels remain");

        // redoing should bring it back
        hist.redo();
        assertEquals(3, countHashes(m), "After redo, 3 '#' pixels again");
    }

    /**
     * used to count the  number of hastags in the matrix
     */
    private long countHashes(Matrix m) {
        return m.toString().chars().filter(c -> c == '#').count();
    }
}
