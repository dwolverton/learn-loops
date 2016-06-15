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

import support.ConsoleExample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExReadFile extends ConsoleExample {

    @Override
    protected void run() throws Exception {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream("jabberwocky.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);

                line = br.readLine();
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
