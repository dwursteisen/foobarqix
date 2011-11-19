package com.github.dwursteisen.foobarqix.rules.item;

/**
 * User: Wursteisen David
 * Date: 19/11/11
 * Time: 13:47
 */
public class FooBarQixFactory {

    public static String build(int value) {
        switch (value) {
            case 3:
                return "Foo";
            case 5:
                return "Bar";
            case 7:
                return "Qix";
            default:
                return "" + value;
        }
    }
}
