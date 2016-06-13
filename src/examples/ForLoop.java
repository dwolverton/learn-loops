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

import parts.ConsoleExample;
import parts.Names;

public class ForLoop extends ConsoleExample {

    @Override
    protected void run() throws Exception {


        for (int i = 0 ; i < 3 ; i += 1) {
            System.out.println(i);
        }


    }

    public static void main(String[] args) {
        launch(args);
    }
}
