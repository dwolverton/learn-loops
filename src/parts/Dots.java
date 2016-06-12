/*
 * Copyright (c) 2016. Vodori, Inc.  All rights reserved.
 *
 * This software is not open source and license for its use and
 * modification can only be granted through an agreement with
 * Vodori, Inc.
 *
 * http://www.vodori.com
 */
package parts;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dots {

    public static Color GREEN = Color.FORESTGREEN;
    public static Color ORANGE = Color.ORANGE;
    public static Color BLUE = Color.STEELBLUE;
    public static Color RED = Color.CRIMSON;
    public static Color GREY = Color.DARKGREY;
    private static Color[] colors = new Color[] { GREEN, ORANGE, BLUE, RED };

    private static Random random = new Random();

    private GraphicsContext gc;
    private List<Dot> dots = new ArrayList<>();
    int radius = 20;
    int diameter = radius * 2;
    int spacing = 6;
    int space = diameter + spacing;

    public Dots(Group root) {
        Canvas canvas = new Canvas(space * 8, space * 8);
        root.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();
    }

    public void addDot() {
        addDot(colors[random.nextInt(4)]);
    }

    public void addDots(int n) {
        for (int i = 0; i < n; i++) {
            addDot();
        }
    }

    public void addDots(int n, Color color) {
        for (int i = 0; i < n; i++) {
            addDot(color);
        }
    }

    public void addDot(Color color) {
        Dot dot = new Dot(color, dots.size());
        dots.add(dot);
        dot.draw();
    }

    public List<Dot> getDots() {
        return dots;
    }

    public class Dot {

        public Dot(Color color, int position) {
            this.color = color;
            this.position = position;
        }

        private Color color;
        private int position;

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
            draw();
        }

        public void draw() {
            gc.setFill(color);
            gc.fillOval(getX() - radius, getY() - radius, diameter, diameter);
            gc.setStroke(Color.WHITE);
            gc.strokeText(Integer.toString(position), getX() - 4, getY() + 4);
        }

        public void erase() {
            gc.clearRect(getX() - radius, getY() - radius, diameter, diameter);
        }

        public void mark() {
            gc.setStroke(Color.BLACK);
            gc.setLineWidth(2);
            gc.strokeLine(getX() - radius, getY() - radius, getX() + radius, getY() + radius);
            gc.strokeLine(getX() - radius, getY() + radius, getX() + radius, getY() - radius);
        }

        private int getX() {
            return getLocation(position % 8);
        }

        private int getY() {
            return getLocation(position / 8);
        }
    }

    private int getLocation(int n) {
        return n * space + (space / 2);
    }

}
