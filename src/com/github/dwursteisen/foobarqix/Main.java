package com.github.dwursteisen.foobarqix;

import com.github.dwursteisen.foobarqix.engine.Engine;

/**
 * User: Wursteisen David
 * Date: 19/11/11
 * Time: 00:11
 */
public class Main {

    public static void main(final String... args) {
        Engine engine = new Engine(100);
        System.out.println(engine.result());
    }
}
