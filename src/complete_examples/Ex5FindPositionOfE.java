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

import support.Alphabet;
import support.ConsoleExample;

public class Ex5FindPositionOfE extends ConsoleExample {

    @Override
    protected void run() throws Exception {


        for (int i = 0; i < 26; i++) {
            String letter = Alphabet.getNthLetter(i);
            if (letter.equals("E")) {
                System.out.println("The letter E is at postion " + (i + 1));
                break;
            }
        }


    }

    public static void main(String[] args) {
        launch(args);
    }
}
