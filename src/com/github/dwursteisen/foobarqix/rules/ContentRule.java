package com.github.dwursteisen.foobarqix.rules;

import com.github.dwursteisen.foobarqix.rules.item.Content;
import com.github.dwursteisen.foobarqix.rules.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Wursteisen David
 * Date: 19/11/11
 * Time: 01:04
 */
public class ContentRule implements Rule {

    public List<? extends Item> parse(int value) {
        final List<Content> items = new ArrayList<Content>();
        String strValue = Integer.toString(value);
        for (int index = 0; index < strValue.length(); index++) {
            char c = strValue.charAt(index);
            int v = toInt(c);
            if (v != 3 && v != 5 && v != 7) {
                continue;
            }
            items.add(new Content(v, index));
        }
        return items;
    }

    int toInt(char c) {
        return c - '0';
    }

}
