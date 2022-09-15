package com.in28minutes.junit.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StringHelperTest {

    StringHelper stringHelper = new StringHelper();

    @Test
    public void truncateAInFirst2PositionsOneA() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void truncateAInFirst2PositionsDoubleA() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void truncateAInFirst2PositionsTripleA() {
        assertNotEquals(stringHelper.truncateAInFirst2Positions("AAACD"), "CD");
    }
}