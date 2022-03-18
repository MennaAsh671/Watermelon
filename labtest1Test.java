package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class labtest1Test {

    @Test
    public void check_weight() {
        int actual = labtest1.check(10);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void check_weight1() {
        int actual1 = labtest1.check(13);
        int expected1 = 0;
        assertEquals(expected1,actual1);

    }
    @Test
    public void check_weight2() {
        int actual2 = labtest1.check(200);
        int expected2 = -1;
        assertEquals(expected2,actual2);

    }
}