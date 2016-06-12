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

import parts.ConsoleExample;
import parts.Names;

public class ExTopNames extends ConsoleExample {

    @Override
    protected void run() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Names.getNames().get(i));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
