package com.github.dwursteisen.foobarqix.rules.item;

/**
 * User: Wursteisen David
 * Date: 19/11/11
 * Time: 12:32
 */
public class Content implements Item {
    private final int index;
    private final int value;

    public Content(int value, int index) {
        this.value = value;
        this.index = index;
    }

    public int compareTo(Item o) {
        if (o instanceof Divisor) {
            return 1;
        }
        Content other = (Content) o;
        if (other.index == index) {
            return 0;
        } else if (index > other.index) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return FooBarQixFactory.build(value);
    }
}
