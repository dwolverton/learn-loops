/*
 * Copyright (c) 2016. Vodori, Inc.  All rights reserved.
 *
 * This software is not open source and license for its use and
 * modification can only be granted through an agreement with
 * Vodori, Inc.
 *
 * http://www.vodori.com
 */
package support;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class TootsiePop {

    private GraphicsContext fg;
    private int radius = 100;
    private int lickEfficacy = 1;

    public TootsiePop(Group root) {
        Canvas background = new Canvas(400, 400);
        root.getChildren().add(background);
        GraphicsContext bg = background.getGraphicsContext2D();
        bg.setStroke(Color.BLACK);
        bg.setLineWidth(2);
        bg.strokeRect(196, 200, 8, 210);
        bg.setFill(Color.SIENNA);
        bg.fillOval(170, 150, 60, 100);

        Canvas foreground = new Canvas(400, 400);
        root.getChildren().add(foreground);
        fg = foreground.getGraphicsContext2D();
        fg.setFill(Color.BLUE);
        drawPop();
    }

    private void drawPop() {
        fg.clearRect(100, 100, 200, 200);
        if (radius > 0) {
            fg.fillOval(200 - radius, 200 - radius, 2 * radius, 2 * radius);
        }
    }

    public void setLickEfficacy(int lickEfficacy) {
        this.lickEfficacy = lickEfficacy;
    }

    public void lick() {
        if (radius > 0) {
            radius -= lickEfficacy;
            drawPop();
        }
    }

    public boolean isArrivedAtCenter() {
        return radius <= 0;
    }

    public boolean isPopRemaining() {
        return !isArrivedAtCenter();
    }


}
