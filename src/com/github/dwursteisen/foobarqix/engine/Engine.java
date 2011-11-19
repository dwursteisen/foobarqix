package com.github.dwursteisen.foobarqix.engine;

import com.github.dwursteisen.foobarqix.rules.ContentRule;
import com.github.dwursteisen.foobarqix.rules.DivisorRule;
import com.github.dwursteisen.foobarqix.rules.item.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * User: Wursteisen David
 * Date: 19/11/11
 * Time: 00:49
 */
public class Engine {

    final private int lastNumber;

    public Engine(int lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String result() {
        StringBuilder buffer = new StringBuilder();

        final List<Item> items = new ArrayList<Item>();
        final ContentRule content = new ContentRule();
        final DivisorRule divisor = new DivisorRule();
        for (int value = 1; value <= lastNumber; value++) {

            items.addAll(content.parse(value));
            items.addAll(divisor.parse(value));

            if (items.isEmpty()) {
                buffer.append(value);
            } else {
                Collections.sort(items);
                for (Item item : items) {
                    buffer.append(item);
                }
                items.clear();
            }
            buffer.append("\n");
        }
        return buffer.toString();
    }

}
