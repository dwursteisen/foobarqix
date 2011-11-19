package com.github.dwursteisen.foobarqix.rules.item;

/**
 * User: Wursteisen David
 * Date: 19/11/11
 * Time: 12:32
 */
public class Divisor implements Item {
    private final int divisor;

    public Divisor(int divisor) {
        this.divisor = divisor;
    }

    public int compareTo(Item o) {
        if (o instanceof Content) {
            return -1;
        }
        Divisor d = (Divisor) o;
        if (divisor < d.divisor) {
            return -1;
        } else if (divisor > d.divisor) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return FooBarQixFactory.build(divisor);
    }
}
