package com.in28minutes.junit.helper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;


public class ArraysCompareTest {

    // Arrays.sort
    @Test
    public void testArraysSort_RandomArray() {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};

        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArraysSort_NullArray() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }
}