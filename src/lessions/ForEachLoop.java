/*
 * Copyright (c) 2016. Vodori, Inc.  All rights reserved.
 *
 * This software is not open source and license for its use and
 * modification can only be granted through an agreement with
 * Vodori, Inc.
 *
 * http://www.vodori.com
 */
package lessions;

import javafx.scene.Group;
import parts.Dots;
import parts.Dots.Dot;
import parts.GuiExample;

import java.util.List;

public class ForEachLoop extends GuiExample {

    private Dots dots;

    @Override
    protected void setup(Group root) {
        dots = new Dots(root);
        dots.addDots(12);
    }

    @Override
    protected void run() throws Exception {


        List<Dot> dotsList = dots.getDots();

        for (Dot dot : dotsList) {
            dot.highlight();
            if (dot.getColor() == Dots.BLUE) {
                dot.mark();
            }
        }


    }

    public static void main(String[] args) {
        launch(args);
    }
}
