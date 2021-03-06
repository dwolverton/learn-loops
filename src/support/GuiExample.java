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

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Screen;
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

        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()));
        primaryStage.setY(50);
    }
}
