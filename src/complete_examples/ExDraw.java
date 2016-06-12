/*
 * Copyright (c) 2016. Vodori, Inc.  All rights reserved.
 *
 * This software is not open source and license for its use and
 * modification can only be granted through an agreement with
 * Vodori, Inc.
 *
 * http://www.vodori.com
 */
package complete_examples;

import javafx.scene.Group;
import parts.Drawing;
import parts.GuiExample;

public class ExDraw extends GuiExample {

    private Drawing drawing;

    @Override
    protected void setup(Group root) {
        drawing = new Drawing(root);
    }

    @Override
    protected void run() throws Exception {
        drawing.drawDot(0, 0);
        drawing.drawDot(1, 1);
        drawing.drawDot(2, 2);
        drawing.drawText(50, 50, "clock");
        for (int i = 0; i < 360; i += 1) {
            drawing.drawDotOnCircle(i);
//            Thread.sleep(100);
        }

        for (int i = 1; i <= 12; i++) {
            drawing.drawTextOnCircle(drawing.getDegreesForHour(i), Integer.toString(i));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
