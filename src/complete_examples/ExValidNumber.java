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

public class ExValidNumber extends ConsoleExample {

    @Override
    protected void run() throws Exception {
        String number = "";
        while (!isValid(number)) {
            System.out.println("Please enter a number between 1 and 20: ");
            number = input.nextLine();
        }
        System.out.println("You entered " + number + ".");
    }

    public static void main(String[] args) {
        launch(args);
    }

    private boolean isValid(String number) {
        try {
            int num = Integer.parseInt(number);
            if (num > 0 && num <=20) {
                return true;
            }
        } catch (NumberFormatException ex) {
        }
        return false;
    }
}
