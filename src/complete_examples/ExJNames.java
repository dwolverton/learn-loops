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

public class ExJNames extends ConsoleExample {

    @Override
    protected void run() throws Exception {
        for (String name : Names.getNames()) {
            if (name.startsWith("J")) {
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
