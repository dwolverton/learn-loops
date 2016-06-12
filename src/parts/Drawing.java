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
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Drawing {

    private GraphicsContext gc;
    int scale = 6;
    double radius = 30d;

    public Drawing(Group root) {
        Canvas canvas = new Canvas(scale * 100, scale * 100);
        root.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();
        gc.setFont(Font.font(scale * 5));
    }

    public void drawDot(int x, int y) {
        gc.fillRect(x * scale, y * scale, scale, scale);
    }

    public void drawText(int x, int y, String text) {
        gc.strokeText(text, x * scale, y * scale);
    }

    public void drawDotOnCircle(int degrees) {
        double rads = Math.toRadians(degrees);
        double x = 50d + Math.sin(rads) * radius;
        double y = 50d - Math.cos(rads) * radius;
        drawDot((int) Math.round(x), (int) Math.round(y));
    }

    public void drawTextOnCircle(int degrees, String text) {
        double rads = Math.toRadians(degrees);
        double x = 50d + Math.sin(rads) * radius;
        double y = 50d - Math.cos(rads) * radius;
        drawText((int) Math.round(x), (int) Math.round(y), text);
    }

    public int getDegreesForHour(int hour) {
        if (hour == 12) {
            hour = 0;
        }
        return hour * 30;
    }

}
