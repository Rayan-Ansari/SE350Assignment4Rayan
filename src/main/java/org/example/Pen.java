// Assignment (4)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement a Pen class
// to determine whether it's up or down when drawing

package org.example;

public class Pen {
    private DrawingStrategy s = new BresenhamStrategy();
    private boolean down;

    /** sets the drawing strategy*/
    public void setStrategy(DrawingStrategy s) { this.s = s; }

    /**picks up the pen*/
    public void up() {
        down = false;
    }
    /** puts the pen down*/
    public void down() {
        down = true;
    }
    /** draws a line based off the strategy is the pen is down*/
    public void draw(Matrix m, double x0, double y0, double x1, double y1) {
        if (down) s.drawLine(m, x0, y0, x1, y1);
    }
    /** @return true if the pen is up*/
    public boolean isDown() {
        return down; }
}
