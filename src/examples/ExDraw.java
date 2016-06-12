/*
 * Copyright (c) 2016. Vodori, Inc.  All rights reserved.
 *
 * This software is not open source and license for its use and
 * modification can only be granted through an agreement with
 * Vodori, Inc.
 *
 * http://www.vodori.com
 */
package examples;

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
    }

    public static void main(String[] args) {
        launch(args);
    }
}
