// Assignment (4)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement a drawingstaregy class that helps
// implements strategic deisgn patters
package org.example;

public interface DrawingStrategy {
    /**
     * draws a straught line for the matrix
     *
     * @param m  the matrix board
     * @param x0 start the x
     * @param y0 start the y
     * @param x1 end the x
     * @param y1 end the y
     */
    void drawLine(Matrix m, double x0, double y0, double x1, double y1);
}
