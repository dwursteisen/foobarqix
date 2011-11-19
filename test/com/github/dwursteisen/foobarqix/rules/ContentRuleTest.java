package com.github.dwursteisen.foobarqix.rules;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Wursteisen David
 * Date: 19/11/11
 * Time: 12:35
 */
public class ContentRuleTest {

    private ContentRule rule;

    @Before
    public void setUp() {
        rule = new ContentRule();
    }

    @Test
    public void testParse() throws Exception {
        assertEquals(0, rule.parse(1).size());
        assertEquals(2, rule.parse(35).size());
        assertEquals(2, rule.parse(713).size());

    }

}
