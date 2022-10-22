package com.hackbright.Unit5;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {

    private int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
    private MissingNumber mn = new MissingNumber();

    @Test
    public void testMissingNumber_MissingMax() {
        assertEquals(10, mn.findMissingNumber(missingMax, 10));
    }

    @Test
    public void testMissingNumber_NoneMissing() {
        assertEquals(0, mn.findMissingNumber(missingNone, 10));
    }

    @Test
    public void testMissingNumber_MissingSeven() {
        assertEquals(7, mn.findMissingNumber(missingSeven, 10));
    }
}
