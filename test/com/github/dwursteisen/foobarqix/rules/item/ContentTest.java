package com.github.dwursteisen.foobarqix.rules.item;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Wursteisen David
 * Date: 19/11/11
 * Time: 13:14
 */
public class ContentTest {
    @Test
    public void contentComparable() {

        Content content = new Content(5, 2);
        assertEquals(0, content.compareTo(new Content(5, 2)));
        assertEquals(1, content.compareTo(new Content(5, 1)));
        assertEquals(-1, content.compareTo(new Content(5, 3)));
    }


    @Test
    public void contentAndDivisorComparable() {
        Content content = new Content(5, 2);
        assertEquals(1, content.compareTo(new Divisor(5)));
        assertEquals(1, content.compareTo(new Divisor(7)));
        assertEquals(1, content.compareTo(new Divisor(3)));

        assertEquals(-1, (new Divisor(3)).compareTo(content));
    }

    @Test
    public void divisorComparable() {
        Divisor div3 = new Divisor(3);
        Divisor div5 = new Divisor(5);
        Divisor div7 = new Divisor(7);

        assertEquals(-1, div3.compareTo(div5));
        assertEquals(-1, div3.compareTo(div7));

        assertEquals(-1, div5.compareTo(div7));
        assertEquals(1, div5.compareTo(div3));


        assertEquals(1, div7.compareTo(div5));
        assertEquals(1, div7.compareTo(div3));
    }


}
