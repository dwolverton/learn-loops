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

public class ExTopJNames extends ConsoleExample {

    @Override
    protected void run() throws Exception {
        int count = 0;
        for (String name : Names.getNames()) {
            if (name.startsWith("J")) {
                System.out.println(name);
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
