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

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public abstract class GuiExample extends Application {

    protected void setup(Group root) {
    }

    protected abstract void run() throws Exception;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        setup(root);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        new Thread(() -> {
            try {
                this.run();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }).start();
    }
}
