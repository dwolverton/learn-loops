/*
 * Copyright (c) 2016. Vodori, Inc.  All rights reserved.
 *
 * This software is not open source and license for its use and
 * modification can only be granted through an agreement with
 * Vodori, Inc.
 *
 * http://www.vodori.com
 */
package templates;

import parts.Alphabet;
import parts.ConsoleExample;

public class ExPrintTheAlphabet extends ConsoleExample {

    @Override
    protected void run() throws Exception {
        Alphabet.getLetters();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
