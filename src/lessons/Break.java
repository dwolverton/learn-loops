/*
 * Copyright (c) 2016. Vodori, Inc.  All rights reserved.
 *
 * This software is not open source and license for its use and
 * modification can only be granted through an agreement with
 * Vodori, Inc.
 *
 * http://www.vodori.com
 */
package lessons;

import javafx.scene.Group;
import support.Dots;
import support.GuiExample;

public class Break extends GuiExample {

    private Dots dots;

    @Override
    protected void setup(Group root) {
        dots = new Dots(root);
        dots.addDots(64);
    }

    /**
     * Mark the first 5 blue dots
     */
    @Override
    protected void run() throws Exception {


        int numberOfBlueDots = 0;
        for (Dots.Dot dot : dots.getDots()) {
            dot.highlight();

            if (dot.getColor() == Dots.BLUE) {
                dot.mark();
                numberOfBlueDots++;

                if (numberOfBlueDots == 5) {
                    break;
                }
            }
            Thread.sleep(400);
        }


    }

    public static void main(String[] args) {
        launch(args);
    }
}
