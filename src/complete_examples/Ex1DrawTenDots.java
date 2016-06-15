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
import support.Dots;
import support.GuiExample;

public class Ex1DrawTenDots extends GuiExample {

    private Dots dots;

    @Override
    protected void setup(Group root) {
        dots = new Dots(root);
    }

    @Override
    protected void run() throws Exception {
        for (int i = 0; i < 10; i++) {
            dots.addDot(Dots.RED);
            Thread.sleep(150);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
