package com.github.dwursteisen.foobarqix.rules;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * User: Wursteisen David
 * Date: 19/11/11
 * Time: 12:55
 */
public class DivisorRuleTest {
    private DivisorRule rule;

    @Before
    public void setUp() {
        rule = new DivisorRule();
    }

    @Test
    public void testParse() throws Exception {
        assertTrue(rule.parse(1).isEmpty());
        assertTrue(rule.parse(11).isEmpty());
        assertEquals(1, rule.parse(3).size());
        assertEquals(2, rule.parse(15).size());
    }
}
