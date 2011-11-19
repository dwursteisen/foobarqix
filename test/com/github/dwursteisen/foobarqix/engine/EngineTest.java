package com.github.dwursteisen.foobarqix.engine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Wursteisen David
 * Date: 19/11/11
 * Time: 00:50
 */
public class EngineTest {

    @Test
    public void exampleTest() {
        Engine engine = new Engine(10);
        String result = engine.result();

        final String expectedResult = "1\n" +
                "2\n" +
                "FooFoo\n" +
                "4\n" +
                "BarBar\n" +
                "Foo\n" +
                "QixQix\n" +
                "8\n" +
                "Foo\n" +
                "Bar\n";

        assertEquals(expectedResult, result);
    }


    @Test
    public void fullExampleTest() {
        final String expectedResult = "1\n" +
                "2\n" +
                "FooFoo\n" +
                "4\n" +
                "BarBar\n" +
                "Foo\n" +
                "QixQix\n" +
                "8\n" +
                "Foo\n" +
                "Bar\n" +
                "11\n" +
                "Foo\n" +
                "Foo\n" +
                "Qix\n" +
                "FooBarBar\n" +
                "16\n" +
                "Qix\n" +
                "Foo\n" +
                "19\n" +
                "Bar\n" +
                "FooQix\n" +
                "22\n" +
                "Foo\n" +
                "Foo\n" +
                "BarBar\n" +
                "26\n" +
                "FooQix\n" +
                "Qix\n" +
                "29\n" +
                "FooBarFoo\n" +
                "Foo\n" +
                "Foo\n" +
                "FooFooFoo\n" +
                "Foo\n" +
                "BarQixFooBar\n" +
                "FooFoo\n" +
                "FooQix\n" +
                "Foo\n" +
                "FooFoo\n" +
                "Bar\n" +
                "41\n" +
                "FooQix\n" +
                "Foo\n" +
                "44\n" +
                "FooBarBar\n" +
                "46\n" +
                "Qix\n" +
                "Foo\n" +
                "Qix\n" +
                "BarBar\n" +
                "FooBar\n" +
                "Bar\n" +
                "BarFoo\n" +
                "FooBar\n" +
                "BarBarBar\n" +
                "QixBar\n" +
                "FooBarQix\n" +
                "Bar\n" +
                "Bar\n" +
                "FooBar\n" +
                "61\n" +
                "62\n" +
                "FooQixFoo\n" +
                "64\n" +
                "BarBar\n" +
                "Foo\n" +
                "Qix\n" +
                "68\n" +
                "Foo\n" +
                "BarQixQix\n" +
                "Qix\n" +
                "FooQix\n" +
                "QixFoo\n" +
                "Qix\n" +
                "FooBarQixBar\n" +
                "Qix\n" +
                "QixQixQix\n" +
                "FooQix\n" +
                "Qix\n" +
                "Bar\n" +
                "Foo\n" +
                "82\n" +
                "Foo\n" +
                "FooQix\n" +
                "BarBar\n" +
                "86\n" +
                "FooQix\n" +
                "88\n" +
                "89\n" +
                "FooBar\n" +
                "Qix\n" +
                "92\n" +
                "FooFoo\n" +
                "94\n" +
                "BarBar\n" +
                "Foo\n" +
                "Qix\n" +
                "Qix\n" +
                "Foo\n" +
                "Bar\n";

        Engine engine = new Engine(100);
        assertEquals(expectedResult, engine.result());
    }
}
