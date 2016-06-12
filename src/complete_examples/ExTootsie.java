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

public class ExTootsie extends GuiExample {

    private TootsiePop tootsiePop;

    @Override
    protected void setup(Group root) {
        tootsiePop = new TootsiePop(root);
    }

    @Override
    protected void run() throws Exception {
        for (int r = 100; r >= 0; r--) {
            tootsiePop.lick();
            Thread.sleep(100);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}