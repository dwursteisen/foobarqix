package com.github.dwursteisen.foobarqix.rules;

import com.github.dwursteisen.foobarqix.rules.item.Item;

import java.util.List;

/**
 * User: Wursteisen David
 * Date: 19/11/11
 * Time: 00:14
 */
public interface Rule {

    List<? extends Item> parse(int value);
}
