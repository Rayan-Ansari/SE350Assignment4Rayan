// Assignment (4)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement a Turtle class
// to mark a position and gives the movements of drawings to pen

package org.example;

public class Turtle {
    private double x, y, angleDeg;
    private final double startX, startY, startAngle;
    private final Pen pen;

    /**
     * @param x0  the starting x
     * @param y0  the starrting y
     * @param pen the pen
     */
    public Turtle(double x0, double y0, Pen pen) {
        this.x = startX = x0;
        this.y = startY = y0;
        this.angleDeg = startAngle = 0;
        this.pen = pen;
        pen.up();
    }

    /** puts the turtle back in its place */
    public void reset() {
        x = startX; y = startY; angleDeg = startAngle; pen.up();
    }

    /**
     * Moves forward by a certain amount
     *
     * @param m     the area where we draw
     * @param dist  the distance
     * @param trace decides to draw when the pen is moving or if the pen is down
     */
    public void move(Matrix m, double dist, boolean trace) {
        double rad = Math.toRadians(angleDeg);

        double startX = x, startY = y;

        double nx = x + dist * Math.cos(rad);
        double ny = y + dist * Math.sin(rad);

        if (trace) pen.down();
        else       pen.up();

        pen.draw(m, x, y, nx, ny);

        x = nx;
        y = ny;

        if (trace) {
            m.setCell((int)startX, (int)startY, ' ');
        }
    }

    /** makes a turn by a certain number of degrees */
    public void turn(double deg) {
        angleDeg = (angleDeg + deg) % 360;
    }
}
