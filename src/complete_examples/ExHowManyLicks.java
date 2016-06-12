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
import parts.GuiExample;
import parts.TootsiePop;

public class ExHowManyLicks extends GuiExample {

    private TootsiePop tootsiePop;

    @Override
    protected void setup(Group root) {
        tootsiePop = new TootsiePop(root);
        tootsiePop.setLickEfficacy(20);
    }

    @Override
    protected void run() throws Exception {
        int numberOfLicks = 0;
        while (!tootsiePop.isArrivedAtCenter()) {
            tootsiePop.lick();
            numberOfLicks++;
            Thread.sleep(100);
        }
        System.out.println("It takes " + numberOfLicks + " licks to get to the center of a Tootsie Pop!");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
