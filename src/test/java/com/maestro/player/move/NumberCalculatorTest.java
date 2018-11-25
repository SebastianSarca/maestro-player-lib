package com.maestro.player.move;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class NumberCalculatorTest {

    private HotNumberFinder hotNumberFinder;

    @Before
    public void setUp() throws Exception {

        hotNumberFinder = new HotNumberFinder();
    }

    @Test
    public void calculateNext_with1_shouldReturn1() {
        assertEquals(1, hotNumberFinder.findSmallerOrEqualHotNumber(1));
    }

    @Test
    public void calculateNext_with2_shouldReturn2() {
        assertEquals(2, hotNumberFinder.findSmallerOrEqualHotNumber(2));
    }

    @Test
    public void calculateNext_with3_shouldReturn3() {
        assertEquals(3, hotNumberFinder.findSmallerOrEqualHotNumber(3));
    }

    @Test
    public void calculateNext_with4_shouldReturn3() {
        assertEquals(3, hotNumberFinder.findSmallerOrEqualHotNumber(4));
    }


    @Test
    public void calculateNext_with5_shouldReturn3() {
        assertEquals(5, hotNumberFinder.findSmallerOrEqualHotNumber(5));
    }

    @Test
    public void calculateNext_with6_shouldReturn5() {
        assertEquals(5, hotNumberFinder.findSmallerOrEqualHotNumber(6));
    }

    @Test
    public void calculateNext_with7_shouldReturn5() {
        assertEquals(5, hotNumberFinder.findSmallerOrEqualHotNumber(7));
    }

    @Test
    public void calculateNext_with8_shouldReturn8() {
        assertEquals(8, hotNumberFinder.findSmallerOrEqualHotNumber(8));
    }

    @Test
    public void calculateNext_with13_shouldReturn8() {
        assertEquals(13, hotNumberFinder.findSmallerOrEqualHotNumber(13));
    }

    @Test
    public void calculateNext_with12_shouldReturn8() {
        assertEquals(8, hotNumberFinder.findSmallerOrEqualHotNumber(12));
    }
    @Test
    public void calculateNext_with14_shouldReturn13() {
        assertEquals(13, hotNumberFinder.findSmallerOrEqualHotNumber(14));
    }
    @Test
    public void calculateNext_with20_shouldReturn13() {
        assertEquals(13, hotNumberFinder.findSmallerOrEqualHotNumber(20));
    }





}