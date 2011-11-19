package com.github.dwursteisen.foobarqix.rules;

import com.github.dwursteisen.foobarqix.rules.item.Divisor;
import com.github.dwursteisen.foobarqix.rules.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Wursteisen David
 * Date: 19/11/11
 * Time: 00:13
 */
public class DivisorRule implements Rule {

    public List<? extends Item> parse(int value) {
        final List<Divisor> result = new ArrayList<Divisor>();
        if (value % 3 == 0) {
            result.add(new Divisor(3));
        }
        if (value % 5 == 0) {
            result.add(new Divisor(5));
        }
        if (value % 7 == 0) {
            result.add(new Divisor(7));
        }
        return result;
    }

}
