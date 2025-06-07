// Assignment (4)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement a ClassPatterns class
// so that we can draw the se350
package org.example;

public class ClassPatterns {
    public static Composite rectangle(Turtle t, Matrix m, double width, double height, double scale) {
        return new Composite()
                .add(new Move(t, m, width*scale, true))
                .add(new Turn(t, 90))
                .add(new Move(t, m, height*scale, true))
                .add(new Turn(t, 90))
                .add(new Move(t, m, width*scale, true))
                .add(new Turn(t, 90))
                .add(new Move(t, m, height*scale, true))
                .add(new Turn(t, 90));
    }

    /**
     * Draws the  S
     * @param t the turtlte sintance
     * @param m the matrix we draw
     * @param scale a factor to scale on
     * @return Composite command
     */
    public static Composite letterS(Turtle t, Matrix m, double scale) {
        return new Composite()
                .add(new Move(t, m, 3*scale, true))
                .add(new Turn(t, -90))
                .add(new Move(t, m, 1*scale, true))
                .add(new Turn(t, -90))
                .add(new Move(t, m, 3*scale, true))
                .add(new Turn(t, 90))
                .add(new Move(t, m, 1*scale, true))
                .add(new Turn(t, 90))
                .add(new Move(t, m, 3*scale, true))
                .add(new Turn(t, 180));
    }

    /**
     * Draws the E
     * @param t the turtlte sintance
     * @param m the matrix we draw
     * @param scale a factor to scale on
     * @return Composite command
     */
    public static Composite letterE(Turtle t, Matrix m, double scale) {
        return new Composite()
                .add(new Move(t, m, 3*scale, true))
                .add(new Turn(t, 180))
                .add(new Move(t, m, 3*scale, false))
                .add(new Turn(t, -90))
                .add(new Move(t, m, 4*scale, true))
                .add(new Turn(t, 90))
                .add(new Move(t, m, 2*scale, true))
                .add(new Turn(t, 180))
                .add(new Move(t, m, 2*scale, false))
                .add(new Turn(t, -90))
                .add(new Move(t, m, 1*scale, true))
                .add(new Turn(t, 90))
                .add(new Move(t, m, 3*scale, true))
                .add(new Turn(t, 180));
    }

    /**
     * Draws the 3
     * @param t the turtlte sintance
     * @param m the matrix we draw
     * @param scale a factor to scale on
     * @return Composite command
     */
    public static Composite digit3(Turtle t, Matrix m, double scale) {
        return new Composite()
                .add(new Move(t, m, 3*scale, true))
                .add(new Turn(t, -90))
                .add(new Move(t, m, 1*scale, true))
                .add(new Turn(t, -90))
                .add(new Move(t, m, 3*scale, true))
                .add(new Turn(t, 90))
                .add(new Move(t, m, 1*scale, true))
                .add(new Turn(t, 90))
                .add(new Move(t, m, 3*scale, true))
                .add(new Turn(t, 180));
    }

    /**
     * Draws the 5
     * @param t the turtlte sintance
     * @param m the matrix we draw
     * @param scale a factor to scale on
     * @return Composite command
     */
    public static Composite digit5(Turtle t, Matrix m, double scale) {
        return letterS(t, m, scale); // 5 is same as S
    }

    /**
     * Draws the 0
     * @param t the turtlte sintance
     * @param m the matrix we draw
     * @param scale a factor to scale on
     * @return Composite command
     */
    public static Composite digit0(Turtle t, Matrix m, double scale) {
        return rectangle(t, m, 3, 5, scale); // 0 is a rectangle
    }

    /**
     * Draws the se350
     * @param t the turtlte sintance
     * @param m the matrix we draw
     * @param scale a factor to scale on
     * @return Composite command
     */
    public static Composite textSE350(Turtle t, Matrix m, double scale) {
        double space = 1 * scale;
        return new Composite()
                .add(letterS(t, m, scale))
                .add(new Turn(t, 90))
                .add(new Move(t, m, space, false))
                .add(new Turn(t, -90))
                .add(letterE(t, m, scale))
                .add(new Turn(t, 90))
                .add(new Move(t, m, space, false))
                .add(new Turn(t, -90))
                .add(digit3(t, m, scale))
                .add(new Turn(t, 90))
                .add(new Move(t, m, space, false))
                .add(new Turn(t, -90))
                .add(digit5(t, m, scale))
                .add(new Turn(t, 90))
                .add(new Move(t, m, space, false))
                .add(new Turn(t, -90))
                .add(digit0(t, m, scale));
    }
}

