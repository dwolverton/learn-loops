/*
 * Copyright (c) 2016. Vodori, Inc.  All rights reserved.
 *
 * This software is not open source and license for its use and
 * modification can only be granted through an agreement with
 * Vodori, Inc.
 *
 * http://www.vodori.com
 */
package lessions;

import support.ConsoleExample;

public class Loop extends ConsoleExample {

    @Override
    protected void run() throws Exception {

        System.out.println("Three cheers...");

        for (int i = 0 ; i < 3 ; i++) {
            System.out.println("Hip-Hip Hurray!");
        }

        System.out.println("... That is all.");


    }

    public static void main(String[] args) {
        launch(args);
    }
}
