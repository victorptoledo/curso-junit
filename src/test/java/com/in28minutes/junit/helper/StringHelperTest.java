package com.in28minutes.junit.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper stringHelper = new StringHelper();

    @Test
    public void testTruncateAInFirst2PositionsOneA() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2PositionsDoubleA() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2PositionsTripleA() {
        assertNotEquals(stringHelper.truncateAInFirst2Positions("AAACD"), "CD");
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameTrue() {
        assertTrue("AD", stringHelper.areFirstAndLastTwoCharactersTheSame("ADACAD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameFalse() {
        assertFalse("AD", stringHelper.areFirstAndLastTwoCharactersTheSame("AADCAD"));
    }
}