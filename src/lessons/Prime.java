/*
 * Copyright (c) 2016. Vodori, Inc.  All rights reserved.
 *
 * This software is not open source and license for its use and
 * modification can only be granted through an agreement with
 * Vodori, Inc.
 *
 * http://www.vodori.com
 */
package lessons;

import support.ValidNumberExample;

public class Prime extends ValidNumberExample {

    @Override
    protected void run() throws Exception {


        String userInput = askForNumber();
        while (isInvalid(userInput)) {
            System.out.println("Not exactly.");
            userInput = askForNumber();
        }

        System.out.println("Lucky number " + userInput);


    }

    public static void main(String[] args) {
        launch(args);
    }
}
