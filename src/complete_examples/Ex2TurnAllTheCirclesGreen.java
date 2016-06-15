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
import javafx.scene.paint.Color;
import support.Dots;
import support.Dots.Dot;
import support.GuiExample;

public class Ex2TurnAllTheCirclesGreen extends GuiExample {

    private Dots dots;

    @Override
    protected void setup(Group root) {
        dots = new Dots(root);
        dots.addDots(20);
    }

    @Override
    protected void run() throws Exception {
        for (Dot dot : dots.getDots()) {
            dot.setColor(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
