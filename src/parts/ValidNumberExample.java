/*
 * Copyright (c) 2016. Vodori, Inc.  All rights reserved.
 *
 * This software is not open source and license for its use and
 * modification can only be granted through an agreement with
 * Vodori, Inc.
 *
 * http://www.vodori.com
 */
package parts;

public abstract class ValidNumberExample extends ConsoleExample {

    protected String askForNumber() {
        System.out.println("Please enter a number between 1 and 20: ");
        return input.nextLine();
    }

    protected boolean isInvalid(String number) {
        return !isValid(number);
    }

    protected boolean isValid(String number) {
        try {
            int num = Integer.parseInt(number);
            if (num > 0 && num <=20) {
                return true;
            }
        } catch (NumberFormatException ex) {
        }
        return false;
    }

    protected int parseNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            throw new RuntimeException(ex);
        }
    }
}
