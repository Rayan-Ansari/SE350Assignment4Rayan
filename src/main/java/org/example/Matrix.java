// Assignment (4)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement a matrix class that
// Implement a two-dimensional Matrix data structure to represent a drawing
package org.example;
import java.util.Arrays;

public class Matrix {

    /** the width */
    private final int width;

    /** the height */
    private final int height;

    private final char[][] pixels;

    /**
     * makes an empty matrix.
     *
     * @param width   number of columns
     * @param height  number of rows
     */
    public Matrix(int width, int height, char blank) {
        this.width  = width;
        this.height = height;
        this.pixels = new char[height][width];
        clear(blank);
    }

    /**
     * fills the matrix
     *
     */
    public void clear(char blank) {
        for (char[] row : pixels) Arrays.fill(row, blank);
    }

    /**
     *
     * @param x the index of the clumn
     * @param y the index of the row
     * @param c what to write
     */
    public void setCell(int x, int y, char c) {
        if (x >= 0 && x < width && y >= 0 && y < height)
            pixels[height - 1 - y][x] = c;   // flip Y so (0,0) is bottom-left
    }

    /** start printing the matrix as a striong */
    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char[] row : pixels) sb.append(row).append('\n');
        return sb.toString();
    }
}
