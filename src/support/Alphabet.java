/*
 * Copyright (c) 2016. Vodori, Inc.  All rights reserved.
 *
 * This software is not open source and license for its use and
 * modification can only be granted through an agreement with
 * Vodori, Inc.
 *
 * http://www.vodori.com
 */
package support;

import java.util.ArrayList;
import java.util.List;

public class Alphabet {

    private static List<String> letters = new ArrayList<>(26);

    static {
        for (char i = 'A'; i <= 'Z'; i++) {
            letters.add(Character.toString(i));
        }
    }

    public static String getNthLetter(int i) {
        return letters.get(i);
    }

    public static List<String> getLetters() {
        return letters;
    }
}
