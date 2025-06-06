// Assignment (4)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement a Naive algorithm to
//determine which pixels to set in the drawing

package org.example;

public class NaiveStrategy implements DrawingStrategy {
    /**
     * @param m   where to draw
     * @param x0 the starting point og x
     * @param y0  the starting point of y
     * @param x1  the ending point of x
     * @param y1  the ending point of y
     */
    public void drawLine(Matrix m, double x0, double y0, double x1, double y1) {
        if (Math.abs(x1 - x0) < 1e-6) {
            double ymin = Math.min(y0, y1), ymax = Math.max(y0, y1);
            for (
                    double y = ymin;
                    y <= ymax; y++
            )
                m.setCell((int) x0, (int) y, '#');
            return;
        }
        double k = (y1 - y0) / (x1 - x0), b = y0 - k * x0;
        double xmin = Math.min(x0, x1), xmax = Math.max(x0, x1);
        for (
                double x = xmin;
                x <= xmax;
                x += 0.5
        )
            m.setCell((int) x, (int) (k * x + b), '#');
    }
}
