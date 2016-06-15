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

public class Ex5FindPositionOfEList extends ConsoleExample {

    @Override
    protected void run() throws Exception {


        int position = 0;
        for (String letter : Alphabet.getLetters()) {
            position++;
            if (letter.equals("E")) {
                System.out.println("The letter E is at postion " + position);
                break;
            }
        }


    }

    public static void main(String[] args) {
        launch(args);
    }
}
